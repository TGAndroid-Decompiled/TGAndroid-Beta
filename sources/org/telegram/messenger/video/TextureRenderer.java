package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.EditTextEffects;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class TextureRenderer {
    private static final String FRAGMENT_EXTERNAL_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);}\n";
    private static final String FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String GRADIENT_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform vec4 gradientTopColor;\nuniform vec4 gradientBottomColor;\nfloat interleavedGradientNoise(vec2 n) {\n    return fract(52.9829189 * fract(.06711056 * n.x + .00583715 * n.y));\n}\nvoid main() {\n  gl_FragColor = mix(gradientTopColor, gradientBottomColor, vTextureCoord.y + (.2 * interleavedGradientNoise(gl_FragCoord.xy) - .1));\n}\n";
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private int NUM_EXTERNAL_SHADER;
    private int NUM_FILTER_SHADER;
    private int NUM_GRADIENT_SHADER;
    private FloatBuffer bitmapVerticesBuffer;
    private boolean blendEnabled;
    private ArrayList<AnimatedEmojiDrawable> emojiDrawables;
    private FilterShaders filterShaders;
    private int gradientBottomColor;
    private int gradientBottomColorHandle;
    private FloatBuffer gradientTextureBuffer;
    private int gradientTopColor;
    private int gradientTopColorHandle;
    private FloatBuffer gradientVerticesBuffer;
    private int imageOrientation;
    private String imagePath;
    private boolean isPhoto;
    private int[] mProgram;
    private int mTextureID;
    private int[] maPositionHandle;
    private int[] maTextureHandle;
    private ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    private int[] muMVPMatrixHandle;
    private int[] muSTMatrixHandle;
    private int originalHeight;
    private int originalWidth;
    private String paintPath;
    private int[] paintTexture;
    private ArrayList<StoryEntry.Part> parts;
    private int[] partsTexture;
    private FloatBuffer partsTextureBuffer;
    private FloatBuffer[] partsVerticesBuffer;
    Path path;
    private FloatBuffer renderTextureBuffer;
    private int simpleInputTexCoordHandle;
    private int simplePositionHandle;
    private int simpleShaderProgram;
    private int simpleSourceImageHandle;
    private int[] stickerTexture;
    private int texSizeHandle;
    Paint textColorPaint;
    private FloatBuffer textureBuffer;
    private int transformedHeight;
    private int transformedWidth;
    private boolean useMatrixForImagePath;
    private FloatBuffer verticesBuffer;
    private float videoFps;
    Paint xRefPaint;
    float[] bitmapData = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    private float[] mMVPMatrix = new float[16];
    private float[] mSTMatrix = new float[16];
    private float[] mSTMatrixIdentity = new float[16];
    private boolean firstFrame = true;

    public TextureRenderer(org.telegram.messenger.MediaController.SavedFilterState r26, java.lang.String r27, java.lang.String r28, java.util.ArrayList<org.telegram.messenger.VideoEditedInfo.MediaEntity> r29, org.telegram.messenger.MediaController.CropState r30, int r31, int r32, int r33, int r34, int r35, float r36, boolean r37, java.lang.Integer r38, java.lang.Integer r39, org.telegram.ui.Stories.recorder.StoryEntry.HDRInfo r40, java.util.ArrayList<org.telegram.ui.Stories.recorder.StoryEntry.Part> r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.MediaController$SavedFilterState, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.MediaController$CropState, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, org.telegram.ui.Stories.recorder.StoryEntry$HDRInfo, java.util.ArrayList):void");
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    private void drawGradient() {
        int i = this.NUM_GRADIENT_SHADER;
        if (i < 0) {
            return;
        }
        GLES20.glUseProgram(this.mProgram[i]);
        GLES20.glVertexAttribPointer(this.maPositionHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientVerticesBuffer);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle[this.NUM_GRADIENT_SHADER]);
        GLES20.glVertexAttribPointer(this.maTextureHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle[this.NUM_GRADIENT_SHADER]);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mSTMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mMVPMatrix, 0);
        GLES20.glUniform4f(this.gradientTopColorHandle, Color.red(this.gradientTopColor) / 255.0f, Color.green(this.gradientTopColor) / 255.0f, Color.blue(this.gradientTopColor) / 255.0f, Color.alpha(this.gradientTopColor) / 255.0f);
        GLES20.glUniform4f(this.gradientBottomColorHandle, Color.red(this.gradientBottomColor) / 255.0f, Color.green(this.gradientBottomColor) / 255.0f, Color.blue(this.gradientBottomColor) / 255.0f, Color.alpha(this.gradientBottomColor) / 255.0f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void drawFrame(SurfaceTexture surfaceTexture) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        if (this.isPhoto) {
            drawGradient();
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (BuildVars.LOGS_ENABLED && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i4 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    if (i4 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i4]);
                    sb.append(", ");
                    i4++;
                }
                FileLog.d("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            FilterShaders filterShaders = this.filterShaders;
            if (filterShaders != null) {
                filterShaders.onVideoFrameUpdate(this.mSTMatrix);
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.drawSkinSmoothPass();
                this.filterShaders.drawEnhancePass();
                this.filterShaders.drawSharpenPass();
                this.filterShaders.drawCustomParamsPass();
                boolean drawBlurPass = this.filterShaders.drawBlurPass();
                GLES20.glBindFramebuffer(36160, 0);
                int i5 = this.transformedWidth;
                if (i5 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i5, this.transformedHeight);
                }
                i = this.filterShaders.getRenderTexture(!drawBlurPass);
                i2 = this.NUM_FILTER_SHADER;
                i3 = 3553;
                fArr = this.mSTMatrixIdentity;
            } else {
                i = this.mTextureID;
                i2 = this.NUM_EXTERNAL_SHADER;
                i3 = 36197;
                fArr = this.mSTMatrix;
            }
            drawGradient();
            GLES20.glUseProgram(this.mProgram[i2]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i3, i);
            GLES20.glVertexAttribPointer(this.maPositionHandle[i2], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i2]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[i2], 2, 5126, false, 8, (Buffer) this.renderTextureBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i2]);
            int i6 = this.texSizeHandle;
            if (i6 != 0) {
                GLES20.glUniform2f(i6, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i2], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i2], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null || this.partsTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33984);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.paintTexture != null && this.imagePath != null) {
            int i7 = 0;
            while (i7 < 1) {
                drawTexture(true, this.paintTexture[i7], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto && i7 == 0, -1);
                i7++;
            }
        }
        if (this.partsTexture != null) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.partsTexture;
                if (i8 >= iArr.length) {
                    break;
                }
                drawTexture(true, iArr[i8], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, i8);
                i8++;
            }
        }
        if (this.paintTexture != null) {
            int i9 = this.imagePath != null ? 1 : 0;
            while (true) {
                int[] iArr2 = this.paintTexture;
                if (i9 >= iArr2.length) {
                    break;
                }
                drawTexture(true, iArr2[i9], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto && i9 == 0, -1);
                i9++;
            }
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                drawEntity(this.mediaEntities.get(i10), this.mediaEntities.get(i10).color);
            }
        }
        GLES20.glFinish();
    }

    private void drawEntity(VideoEditedInfo.MediaEntity mediaEntity, int i) {
        VideoEditedInfo.MediaEntity mediaEntity2;
        int i2;
        int i3;
        long j = mediaEntity.ptr;
        if (j != 0) {
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null || (i2 = mediaEntity.W) <= 0 || (i3 = mediaEntity.H) <= 0) {
                return;
            }
            RLottieDrawable.getFrame(j, (int) mediaEntity.currentFrame, bitmap, i2, i3, bitmap.getRowBytes(), true);
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            float f = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f;
            if (f >= mediaEntity.metadata[0]) {
                mediaEntity.currentFrame = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
        } else if (mediaEntity.animatedFileDrawable != null) {
            if (mediaEntity.bitmap == null || mediaEntity.W <= 0 || mediaEntity.H <= 0) {
                return;
            }
            float f2 = mediaEntity.currentFrame;
            int i4 = (int) f2;
            float f3 = f2 + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f3;
            for (int i5 = (int) f3; i4 != i5; i5--) {
                mediaEntity.animatedFileDrawable.getNextFrame();
            }
            Bitmap backgroundBitmap = mediaEntity.animatedFileDrawable.getBackgroundBitmap();
            if (backgroundBitmap != null) {
                if (mediaEntity.canvas == null && mediaEntity.bitmap != null) {
                    mediaEntity.canvas = new Canvas(mediaEntity.bitmap);
                    if (mediaEntity.bitmap.getHeight() != backgroundBitmap.getHeight() || mediaEntity.bitmap.getWidth() != backgroundBitmap.getWidth()) {
                        mediaEntity.canvas.scale(mediaEntity.bitmap.getWidth() / backgroundBitmap.getWidth(), mediaEntity.bitmap.getHeight() / backgroundBitmap.getHeight());
                    }
                }
                Bitmap bitmap2 = mediaEntity.bitmap;
                if (bitmap2 != null) {
                    bitmap2.eraseColor(0);
                    mediaEntity.canvas.drawBitmap(backgroundBitmap, 0.0f, 0.0f, (Paint) null);
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
                    drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
                }
            }
        } else {
            if (mediaEntity.bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
                drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, mediaEntity.type == 2 && (mediaEntity.subType & 2) != 0);
            }
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i6 = 0; i6 < mediaEntity.entities.size(); i6++) {
                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i6);
                if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                    drawEntity(mediaEntity2, mediaEntity.color);
                }
            }
        }
    }

    private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i) {
        if (bitmap == null || mediaEntity == null) {
            return;
        }
        if (mediaEntity.roundRadius == 0.0f && i == 0) {
            return;
        }
        if (mediaEntity.roundRadiusCanvas == null) {
            mediaEntity.roundRadiusCanvas = new Canvas(bitmap);
        }
        if (mediaEntity.roundRadius != 0.0f) {
            if (this.path == null) {
                this.path = new Path();
            }
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
            this.path.toggleInverseFillType();
            mediaEntity.roundRadiusCanvas.drawPath(this.path, this.xRefPaint);
        }
        if (i != 0) {
            if (this.textColorPaint == null) {
                Paint paint2 = new Paint(1);
                this.textColorPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            this.textColorPaint.setColor(i);
            mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
        }
    }

    private void drawTexture(boolean z, int i) {
        drawTexture(z, i, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2) {
        drawTexture(z, i, f, f2, f3, f4, f5, z2, false, -1);
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2, boolean z3, int i2) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        if (f <= -10000.0f) {
            float[] fArr = this.bitmapData;
            fArr[0] = -1.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = -1.0f;
            fArr[5] = -1.0f;
            fArr[6] = 1.0f;
            fArr[7] = -1.0f;
        } else {
            float f6 = (f * 2.0f) - 1.0f;
            float f7 = ((1.0f - f2) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f6;
            fArr2[1] = f7;
            float f8 = (f3 * 2.0f) + f6;
            fArr2[2] = f8;
            fArr2[3] = f7;
            fArr2[4] = f6;
            float f9 = f7 - (f4 * 2.0f);
            fArr2[5] = f9;
            fArr2[6] = f8;
            fArr2[7] = f9;
        }
        float[] fArr3 = this.bitmapData;
        float f10 = (fArr3[0] + fArr3[2]) / 2.0f;
        if (z2) {
            float f11 = fArr3[2];
            fArr3[2] = fArr3[0];
            fArr3[0] = f11;
            float f12 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f12;
        }
        if (f5 != 0.0f) {
            float f13 = this.transformedWidth / this.transformedHeight;
            float f14 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i3 = 0;
            for (int i4 = 4; i3 < i4; i4 = 4) {
                float[] fArr4 = this.bitmapData;
                int i5 = i3 * 2;
                int i6 = i5 + 1;
                double d = fArr4[i5] - f10;
                double d2 = f5;
                double cos = Math.cos(d2);
                Double.isNaN(d);
                double d3 = (fArr4[i6] - f14) / f13;
                double sin = Math.sin(d2);
                Double.isNaN(d3);
                fArr4[i5] = ((float) ((cos * d) - (sin * d3))) + f10;
                float[] fArr5 = this.bitmapData;
                double sin2 = Math.sin(d2);
                Double.isNaN(d);
                double cos2 = Math.cos(d2);
                Double.isNaN(d3);
                fArr5[i6] = (((float) ((d * sin2) + (d3 * cos2))) * f13) + f14;
                i3++;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (i2 >= 0 ? this.partsVerticesBuffer[i2] : z3 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (i2 >= 0 ? this.partsTextureBuffer : z3 ? this.renderTextureBuffer : this.textureBuffer));
        if (z) {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void setBreakStrategy(EditTextOutline editTextOutline) {
        editTextOutline.setBreakStrategy(0);
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        Bitmap bitmap;
        int i;
        AnimatedFileDrawable animatedFileDrawable;
        int i2;
        int i3 = (int) (mediaEntity.width * this.transformedWidth);
        mediaEntity.W = i3;
        int i4 = (int) (mediaEntity.height * this.transformedHeight);
        mediaEntity.H = i4;
        if (i3 > 512) {
            mediaEntity.H = (int) ((i4 / i3) * 512.0f);
            mediaEntity.W = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        int i5 = mediaEntity.H;
        if (i5 > 512) {
            mediaEntity.W = (int) ((mediaEntity.W / i5) * 512.0f);
            mediaEntity.H = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        byte b = mediaEntity.subType;
        if ((b & 1) != 0) {
            int i6 = mediaEntity.W;
            if (i6 <= 0 || (i2 = mediaEntity.H) <= 0) {
                return;
            }
            mediaEntity.bitmap = Bitmap.createBitmap(i6, i2, Bitmap.Config.ARGB_8888);
            int[] iArr = new int[3];
            mediaEntity.metadata = iArr;
            mediaEntity.ptr = RLottieDrawable.create(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, iArr, false, null, false, 0);
            mediaEntity.framesPerDraw = mediaEntity.metadata[1] / this.videoFps;
        } else if ((b & 4) != 0) {
            int i7 = mediaEntity.W;
            if (i7 <= 0 || (i = mediaEntity.H) <= 0) {
                return;
            }
            mediaEntity.bitmap = Bitmap.createBitmap(i7, i, Bitmap.Config.ARGB_8888);
            mediaEntity.animatedFileDrawable = new AnimatedFileDrawable(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, mediaEntity.W, mediaEntity.H, null);
            mediaEntity.framesPerDraw = animatedFileDrawable.getFps() / this.videoFps;
            mediaEntity.currentFrame = 0.0f;
            mediaEntity.animatedFileDrawable.getNextFrame();
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (mediaEntity.type == 2) {
                    options.inMutable = true;
                }
                mediaEntity.bitmap = BitmapFactory.decodeFile(mediaEntity.text, options);
            } else {
                try {
                    File file = new File(mediaEntity.text);
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    Utilities.loadWebpImage(null, map, map.limit(), options2, true);
                    if (mediaEntity.type == 2) {
                        options2.inMutable = true;
                    }
                    Bitmap createBitmap = Bitmaps.createBitmap(options2.outWidth, options2.outHeight, Bitmap.Config.ARGB_8888);
                    mediaEntity.bitmap = createBitmap;
                    Utilities.loadWebpImage(createBitmap, map, map.limit(), null, true);
                    randomAccessFile.close();
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (mediaEntity.type == 2 && mediaEntity.bitmap != null) {
                mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
                double d = mediaEntity.rotation;
                double radians = Math.toRadians(((Integer) imageOrientation.first).intValue());
                Double.isNaN(d);
                mediaEntity.rotation = (float) (d - radians);
                if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                    float f = mediaEntity.x;
                    float f2 = mediaEntity.width;
                    float f3 = f + (f2 / 2.0f);
                    float f4 = mediaEntity.y;
                    float f5 = mediaEntity.height;
                    float f6 = f4 + (f5 / 2.0f);
                    int i8 = this.transformedWidth;
                    int i9 = this.transformedHeight;
                    float f7 = (f2 * i8) / i9;
                    float f8 = (f5 * i9) / i8;
                    mediaEntity.width = f8;
                    mediaEntity.height = f7;
                    mediaEntity.x = f3 - (f8 / 2.0f);
                    mediaEntity.y = f6 - (f7 / 2.0f);
                }
                applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                return;
            }
            if (mediaEntity.bitmap != null) {
                float width = bitmap.getWidth() / mediaEntity.bitmap.getHeight();
                if (width > 1.0f) {
                    float f9 = mediaEntity.height;
                    float f10 = f9 / width;
                    mediaEntity.y += (f9 - f10) / 2.0f;
                    mediaEntity.height = f10;
                } else if (width < 1.0f) {
                    float f11 = mediaEntity.width;
                    float f12 = width * f11;
                    mediaEntity.x += (f11 - f12) / 2.0f;
                    mediaEntity.width = f12;
                }
            }
        }
    }

    private int createProgram(String str, String str2, boolean z) {
        int loadShader;
        int glCreateProgram;
        int loadShader2;
        int glCreateProgram2;
        if (z) {
            int loadShader3 = FilterShaders.loadShader(35633, str);
            if (loadShader3 == 0 || (loadShader2 = FilterShaders.loadShader(35632, str2)) == 0 || (glCreateProgram2 = GLES30.glCreateProgram()) == 0) {
                return 0;
            }
            GLES30.glAttachShader(glCreateProgram2, loadShader3);
            GLES30.glAttachShader(glCreateProgram2, loadShader2);
            GLES30.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES30.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES30.glDeleteProgram(glCreateProgram2);
                return 0;
            }
            return glCreateProgram2;
        }
        int loadShader4 = FilterShaders.loadShader(35633, str);
        if (loadShader4 == 0 || (loadShader = FilterShaders.loadShader(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, loadShader4);
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    public void release() {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i);
                long j = mediaEntity.ptr;
                if (j != 0) {
                    RLottieDrawable.destroy(j);
                }
                AnimatedFileDrawable animatedFileDrawable = mediaEntity.animatedFileDrawable;
                if (animatedFileDrawable != null) {
                    animatedFileDrawable.recycle();
                }
                View view = mediaEntity.view;
                if (view instanceof EditTextEffects) {
                    ((EditTextEffects) view).recycleEmojis();
                }
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    mediaEntity.bitmap = null;
                }
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        int i = this.NUM_EXTERNAL_SHADER;
        String str3 = VERTEX_SHADER_300;
        if (i >= 0 && i < this.mProgram.length) {
            int createProgram = createProgram(z ? VERTEX_SHADER_300 : VERTEX_SHADER, str, z);
            if (createProgram != 0) {
                GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
                this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram;
                this.texSizeHandle = GLES20.glGetUniformLocation(createProgram, "texSize");
            }
        }
        int i2 = this.NUM_FILTER_SHADER;
        if (i2 < 0 || i2 >= this.mProgram.length) {
            return;
        }
        if (!z) {
            str3 = VERTEX_SHADER;
        }
        int createProgram2 = createProgram(str3, str2, z);
        if (createProgram2 != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
            this.mProgram[this.NUM_FILTER_SHADER] = createProgram2;
        }
    }
}
