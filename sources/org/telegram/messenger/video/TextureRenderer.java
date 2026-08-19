package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextEffects;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class TextureRenderer {
    private static final String FRAGMENT_EXTERNAL_MASK_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_EXTERNAL_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);}\n";
    private static final String FRAGMENT_MASK_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String GRADIENT_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform vec4 gradientTopColor;\nuniform vec4 gradientBottomColor;\nfloat interleavedGradientNoise(vec2 n) {\n    return fract(52.9829189 * fract(.06711056 * n.x + .00583715 * n.y));\n}\nvoid main() {\n  gl_FragColor = mix(gradientTopColor, gradientBottomColor, vTextureCoord.y + (.2 * interleavedGradientNoise(gl_FragCoord.xy) - .1));\n}\n";
    public static final boolean USE_MEDIACODEC = true;
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_MASK = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_MASK_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
    private int NUM_EXTERNAL_SHADER;
    private int NUM_FILTER_SHADER;
    private int NUM_GRADIENT_SHADER;
    private Drawable backgroundDrawable;
    private String backgroundPath;
    private FloatBuffer bitmapVerticesBuffer;
    private boolean blendEnabled;
    private BlurringShader blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<VideoEditedInfo.Part> collageParts;
    private int[] collageTextures;
    private final MediaController.CropState cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<AnimatedEmojiDrawable> emojiDrawables;
    private FilterShaders filterShaders;
    private int gradientBottomColor;
    private int gradientBottomColorHandle;
    private FloatBuffer gradientTextureBuffer;
    private int gradientTopColor;
    private int gradientTopColorHandle;
    private FloatBuffer gradientVerticesBuffer;
    private int imageHeight;
    private String imagePath;
    private int imageWidth;
    private boolean isPhoto;
    private int[] mProgram;
    private int mTextureID;
    private int[] maPositionHandle;
    private int[] maTextureHandle;
    private FloatBuffer maskTextureBuffer;
    private int[] maskTextureHandle;
    private ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    private String messagePath;
    private String messageVideoMaskPath;
    private int[] mmTextureHandle;
    private int[] muMVPMatrixHandle;
    private int[] muSTMatrixHandle;
    private int originalHeight;
    private int originalWidth;
    private String paintPath;
    private int[] paintTexture;
    Path path;
    private FloatBuffer renderTextureBuffer;
    private Bitmap roundBitmap;
    private Canvas roundCanvas;
    private Path roundClipPath;
    private int simpleInputTexCoordHandle;
    private int simpleInputTexCoordHandleOES;
    private int simplePositionHandle;
    private int simplePositionHandleOES;
    private int simpleShaderProgram;
    private int simpleShaderProgramOES;
    private int simpleSourceImageHandle;
    private int simpleSourceImageHandleOES;
    private Bitmap stickerBitmap;
    private Canvas stickerCanvas;
    private int[] stickerTexture;
    private int texSizeHandle;
    Paint textColorPaint;
    private FloatBuffer textureBuffer;
    private int transformedHeight;
    private int transformedWidth;
    private boolean useMatrixForImagePath;
    private FloatBuffer verticesBuffer;
    private float videoFps;
    private int videoMaskTexture;
    Paint xRefPaint;
    float[] bitmapData = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    private float[] mMVPMatrix = new float[16];
    private float[] mSTMatrix = new float[16];
    private float[] mSTMatrixIdentity = new float[16];
    private int imagePathIndex = -1;
    private int paintPathIndex = -1;
    private int messagePathIndex = -1;
    private int backgroundPathIndex = -1;
    private final Rect roundSrc = new Rect();
    private final RectF roundDst = new RectF();
    private boolean firstFrame = true;

    private boolean isCollage() {
        return this.collageParts != null;
    }

    public TextureRenderer(MediaController.SavedFilterState savedFilterState, String str, String str2, String str3, ArrayList<VideoEditedInfo.MediaEntity> arrayList, MediaController.CropState cropState, int i, int i2, int i3, int i4, int i5, float f, boolean z, Integer num, Integer num2, StoryEntry.HDRInfo hDRInfo, MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
        char c;
        int i6;
        float f2;
        char c2;
        char c3;
        float f3;
        int i7;
        int i8;
        float[] fArr;
        int i9;
        int i10;
        Matrix matrix;
        float[] fArr2;
        float f4;
        float f5;
        float f6;
        int i11;
        float f7;
        float f8;
        float[] fArr3;
        float f9;
        float f10;
        int i12;
        float[] fArr4;
        float f11;
        int i13;
        int i14 = i;
        int i15 = i2;
        float f12 = f;
        this.NUM_FILTER_SHADER = -1;
        this.NUM_EXTERNAL_SHADER = -1;
        this.NUM_GRADIENT_SHADER = -1;
        this.isPhoto = z;
        this.collageParts = convertVideoParams.collageParts;
        float[] fArr5 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            c = 2;
            sb.append("start textureRenderer w = ");
            sb.append(i14);
            sb.append(" h = ");
            sb.append(i15);
            sb.append(" r = ");
            sb.append(i5);
            sb.append(" fps = ");
            sb.append(f12);
            FileLog.d(sb.toString());
            if (cropState != null) {
                FileLog.d("cropState px = " + cropState.cropPx + " py = " + cropState.cropPy + " cScale = " + cropState.cropScale + " cropRotate = " + cropState.cropRotate + " pw = " + cropState.cropPw + " ph = " + cropState.cropPh + " tw = " + cropState.transformWidth + " th = " + cropState.transformHeight + " tr = " + cropState.transformRotation + " mirror = " + cropState.mirrored);
            }
        } else {
            c = 2;
        }
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr5).position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.bitmapData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.bitmapVerticesBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(this.bitmapData).position(0);
        android.opengl.Matrix.setIdentityM(this.mSTMatrix, 0);
        android.opengl.Matrix.setIdentityM(this.mSTMatrixIdentity, 0);
        if (savedFilterState != null) {
            FilterShaders filterShaders = new FilterShaders(true, hDRInfo);
            this.filterShaders = filterShaders;
            filterShaders.setDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
        }
        this.transformedWidth = i14;
        this.transformedHeight = i15;
        this.originalWidth = i3;
        this.originalHeight = i4;
        this.imagePath = str;
        this.paintPath = str2;
        this.messagePath = convertVideoParams.messagePath;
        this.messageVideoMaskPath = convertVideoParams.messageVideoMaskPath;
        this.backgroundPath = convertVideoParams.backgroundPath;
        this.blurPath = str3;
        this.mediaEntities = arrayList;
        this.videoFps = f12 == 0.0f ? 30.0f : f12;
        this.cropState = cropState;
        this.NUM_EXTERNAL_SHADER = 0;
        android.opengl.Matrix.setIdentityM(this.mMVPMatrix, 0);
        long j = convertVideoParams.wallpaperPeerId;
        if (j != Long.MIN_VALUE) {
            this.backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, convertVideoParams.account, j, convertVideoParams.isDark);
        } else {
            if (num2 != null && num != null) {
                FloatBuffer floatBufferAsFloatBuffer3 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.gradientVerticesBuffer = floatBufferAsFloatBuffer3;
                floatBufferAsFloatBuffer3.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                boolean z2 = this.isPhoto;
                float f13 = z2 ? 1.0f : 0.0f;
                float f14 = z2 ? 1.0f : 0.0f;
                float f15 = z2 ? 0.0f : 1.0f;
                float f16 = z2 ? 0.0f : 1.0f;
                float[] fArr6 = new float[8];
                fArr6[0] = 0.0f;
                fArr6[1] = f13;
                fArr6[c] = 1.0f;
                fArr6[3] = f14;
                fArr6[4] = 0.0f;
                fArr6[5] = f15;
                fArr6[6] = 1.0f;
                fArr6[7] = f16;
                FloatBuffer floatBufferAsFloatBuffer4 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.gradientTextureBuffer = floatBufferAsFloatBuffer4;
                floatBufferAsFloatBuffer4.put(fArr6).position(0);
                this.gradientTopColor = num.intValue();
                this.gradientBottomColor = num2.intValue();
                this.NUM_GRADIENT_SHADER = 1;
                i6 = 2;
            }
            if (this.filterShaders != null) {
                this.NUM_FILTER_SHADER = i6;
                i6++;
            }
            this.mProgram = new int[i6];
            this.muMVPMatrixHandle = new int[i6];
            this.muSTMatrixHandle = new int[i6];
            this.maPositionHandle = new int[i6];
            this.maTextureHandle = new int[i6];
            this.mmTextureHandle = new int[i6];
            this.maskTextureHandle = new int[i6];
            if (cropState != null) {
                matrix = cropState.useMatrix;
                if (matrix != null) {
                    this.useMatrixForImagePath = true;
                    f7 = cropState.cropPw;
                    f2 = 0.5f;
                    f8 = cropState.cropPh;
                    if ((cropState.orientation / 90) % 2 == 1) {
                        f7 = f8;
                        f8 = f7;
                    }
                    float f17 = (1.0f - f7) / 2.0f;
                    float f18 = (1.0f - f8) / 2.0f;
                    c3 = 1;
                    fArr3 = new float[8];
                    f9 = i3;
                    float f19 = f9 * f17;
                    fArr3[0] = f19;
                    f10 = i4;
                    float f20 = f10 * f18;
                    fArr3[1] = f20;
                    float f21 = (f17 + f7) * f9;
                    fArr3[c] = f21;
                    fArr3[3] = f20;
                    fArr3[4] = f19;
                    float f22 = (f18 + f8) * f10;
                    fArr3[5] = f22;
                    fArr3[6] = f21;
                    fArr3[7] = f22;
                    matrix.mapPoints(fArr3);
                    for (i12 = 0; i12 < 4; i12++) {
                        int i16 = i12 * 2;
                        fArr3[i16] = ((fArr3[i16] / i14) * 2.0f) - 1.0f;
                        int i17 = i16 + 1;
                        fArr3[i17] = 1.0f - ((fArr3[i17] / i15) * 2.0f);
                    }
                    f3 = 1.0f;
                    FloatBuffer floatBufferAsFloatBuffer5 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.verticesBuffer = floatBufferAsFloatBuffer5;
                    floatBufferAsFloatBuffer5.put(fArr3).position(0);
                    fArr4 = new float[8];
                    float f23 = f7 * f9;
                    float f24 = f23 * (-0.5f);
                    fArr4[0] = f24;
                    float f25 = f8 * f10;
                    float f26 = (-0.5f) * f25;
                    fArr4[1] = f26;
                    float f27 = f23 * 0.5f;
                    fArr4[c] = f27;
                    fArr4[3] = f26;
                    fArr4[4] = f24;
                    float f28 = f25 * 0.5f;
                    fArr4[5] = f28;
                    fArr4[6] = f27;
                    fArr4[7] = f28;
                    f11 = (float) (((double) (-cropState.cropRotate)) * 0.017453292519943295d);
                    i13 = 0;
                    for (int i18 = 4; i13 < i18; i18 = 4) {
                        int i19 = i13 * 2;
                        float f29 = fArr4[i19];
                        int i20 = i19 + 1;
                        float f30 = fArr4[i20];
                        double d = f29 - (cropState.cropPx * f9);
                        double d2 = f11;
                        double d3 = f30 - (cropState.cropPy * f10);
                        float fCos = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d3))) / f9;
                        float fSin = ((float) ((Math.sin(d2) * d) + (d3 * Math.cos(d2)))) / f10;
                        float f31 = cropState.cropScale;
                        fArr4[i19] = (fCos / f31) + 0.5f;
                        fArr4[i20] = (fSin / f31) + 0.5f;
                        i13++;
                    }
                    if (this.filterShaders == null && !this.isPhoto && this.messageVideoMaskPath == null) {
                        fArr4[1] = 1.0f - fArr4[1];
                        fArr4[3] = 1.0f - fArr4[3];
                        fArr4[5] = 1.0f - fArr4[5];
                        fArr4[7] = 1.0f - fArr4[7];
                    }
                    FloatBuffer floatBufferAsFloatBuffer6 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.croppedTextureBuffer = floatBufferAsFloatBuffer6;
                    floatBufferAsFloatBuffer6.put(fArr4).position(0);
                    c2 = 0;
                } else {
                    f2 = 0.5f;
                    c3 = 1;
                    f3 = 1.0f;
                    fArr2 = new float[8];
                    fArr2[0] = 0.0f;
                    fArr2[1] = 0.0f;
                    f4 = i14;
                    fArr2[c] = f4;
                    fArr2[3] = 0.0f;
                    fArr2[4] = 0.0f;
                    f5 = i15;
                    fArr2[5] = f5;
                    fArr2[6] = f4;
                    fArr2[7] = f5;
                    i7 = cropState.transformRotation;
                    this.transformedWidth = (int) (this.transformedWidth * cropState.cropPw);
                    this.transformedHeight = (int) (this.transformedHeight * cropState.cropPh);
                    f6 = (float) (((double) (-cropState.cropRotate)) * 0.017453292519943295d);
                    i11 = 0;
                    while (i11 < 4) {
                        int i21 = i11 * 2;
                        int i22 = i21 + 1;
                        double d4 = fArr2[i21] - (i14 / 2);
                        double d5 = f6;
                        double d6 = fArr2[i22] - (i15 / 2);
                        float fCos2 = ((float) (((Math.cos(d5) * d4) - (Math.sin(d5) * d6)) + ((double) (cropState.cropPx * f4)))) * cropState.cropScale;
                        float fSin2 = ((float) (((d4 * Math.sin(d5)) + (Math.cos(d5) * d6)) - ((double) (cropState.cropPy * f5)))) * cropState.cropScale;
                        fArr2[i21] = (fCos2 / this.transformedWidth) * 2.0f;
                        fArr2[i22] = (fSin2 / this.transformedHeight) * 2.0f;
                        i11++;
                        i14 = i;
                        i15 = i2;
                    }
                    FloatBuffer floatBufferAsFloatBuffer7 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.verticesBuffer = floatBufferAsFloatBuffer7;
                    c2 = 0;
                    floatBufferAsFloatBuffer7.put(fArr2).position(0);
                }
                if (this.filterShaders != null) {
                    i8 = 4;
                    if (i7 == 90) {
                        fArr = new float[8];
                        fArr[c2] = f3;
                        fArr[c3] = 0.0f;
                        fArr[c] = f3;
                        fArr[3] = f3;
                        fArr[4] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[7] = f3;
                    } else if (i7 == 180) {
                        fArr = new float[8];
                        fArr[c2] = f3;
                        fArr[c3] = f3;
                        fArr[c] = 0.0f;
                        fArr[3] = f3;
                        fArr[4] = f3;
                        fArr[5] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[7] = 0.0f;
                    } else if (i7 == 270) {
                        fArr = new float[8];
                        fArr[c2] = 0.0f;
                        fArr[c3] = f3;
                        fArr[c] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[4] = f3;
                        fArr[5] = f3;
                        fArr[6] = f3;
                        fArr[7] = 0.0f;
                    } else {
                        fArr = new float[8];
                        fArr[c2] = 0.0f;
                        fArr[c3] = 0.0f;
                        fArr[c] = f3;
                        fArr[3] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[5] = f3;
                        fArr[6] = f3;
                        fArr[7] = f3;
                    }
                } else if (i7 == 90) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = f3;
                    fArr[c] = f3;
                    fArr[3] = 0.0f;
                    i8 = 4;
                    fArr[4] = 0.0f;
                    fArr[5] = f3;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                } else {
                    i8 = 4;
                    if (i7 == 180) {
                        fArr = new float[8];
                        fArr[c2] = f3;
                        fArr[c3] = 0.0f;
                        fArr[c] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[4] = f3;
                        fArr[5] = f3;
                        fArr[6] = 0.0f;
                        fArr[7] = f3;
                    } else if (i7 == 270) {
                        fArr = new float[8];
                        fArr[c2] = 0.0f;
                        fArr[c3] = 0.0f;
                        fArr[c] = 0.0f;
                        fArr[3] = f3;
                        fArr[4] = f3;
                        fArr[5] = 0.0f;
                        fArr[6] = f3;
                        fArr[7] = f3;
                    } else {
                        fArr = new float[8];
                        fArr[c2] = 0.0f;
                        fArr[c3] = f3;
                        fArr[c] = f3;
                        fArr[3] = f3;
                        fArr[4] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[6] = f3;
                        fArr[7] = 0.0f;
                    }
                }
                if (cropState != null && cropState.mirrored) {
                    i9 = 0;
                    while (i9 < i8) {
                        i10 = i9 * 2;
                        if (fArr[i10] > f2) {
                            fArr[i10] = 0.0f;
                        } else {
                            fArr[i10] = f3;
                        }
                        i9++;
                        i8 = 4;
                    }
                }
                FloatBuffer floatBufferAsFloatBuffer8 = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.renderTextureBuffer = floatBufferAsFloatBuffer8;
                floatBufferAsFloatBuffer8.put(fArr).position(0);
                FloatBuffer floatBufferAsFloatBuffer9 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.maskTextureBuffer = floatBufferAsFloatBuffer9;
                floatBufferAsFloatBuffer9.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            }
            f2 = 0.5f;
            c2 = 0;
            c3 = 1;
            f3 = 1.0f;
            FloatBuffer floatBufferAsFloatBuffer10 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.verticesBuffer = floatBufferAsFloatBuffer10;
            floatBufferAsFloatBuffer10.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
            i7 = 0;
            if (this.filterShaders != null) {
                i8 = 4;
                if (i7 == 90) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = 0.0f;
                    fArr[c] = f3;
                    fArr[3] = f3;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = f3;
                } else if (i7 == 180) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = f3;
                    fArr[c] = 0.0f;
                    fArr[3] = f3;
                    fArr[4] = f3;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                } else if (i7 == 270) {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = f3;
                    fArr[c] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[4] = f3;
                    fArr[5] = f3;
                    fArr[6] = f3;
                    fArr[7] = 0.0f;
                } else {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = 0.0f;
                    fArr[c] = f3;
                    fArr[3] = 0.0f;
                    fArr[4] = 0.0f;
                    fArr[5] = f3;
                    fArr[6] = f3;
                    fArr[7] = f3;
                }
            } else if (i7 == 90) {
                fArr = new float[8];
                fArr[c2] = f3;
                fArr[c3] = f3;
                fArr[c] = f3;
                fArr[3] = 0.0f;
                i8 = 4;
                fArr[4] = 0.0f;
                fArr[5] = f3;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
            } else {
                i8 = 4;
                if (i7 == 180) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = 0.0f;
                    fArr[c] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[4] = f3;
                    fArr[5] = f3;
                    fArr[6] = 0.0f;
                    fArr[7] = f3;
                } else if (i7 == 270) {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = 0.0f;
                    fArr[c] = 0.0f;
                    fArr[3] = f3;
                    fArr[4] = f3;
                    fArr[5] = 0.0f;
                    fArr[6] = f3;
                    fArr[7] = f3;
                } else {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = f3;
                    fArr[c] = f3;
                    fArr[3] = f3;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = f3;
                    fArr[7] = 0.0f;
                }
            }
            if (cropState != null) {
                i9 = 0;
                while (i9 < i8) {
                    i10 = i9 * 2;
                    if (fArr[i10] > f2) {
                        fArr[i10] = 0.0f;
                    } else {
                        fArr[i10] = f3;
                    }
                    i9++;
                    i8 = 4;
                }
            }
            FloatBuffer floatBufferAsFloatBuffer11 = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.renderTextureBuffer = floatBufferAsFloatBuffer11;
            floatBufferAsFloatBuffer11.put(fArr).position(0);
            FloatBuffer floatBufferAsFloatBuffer12 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.maskTextureBuffer = floatBufferAsFloatBuffer12;
            floatBufferAsFloatBuffer12.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        }
        i6 = 1;
        if (this.filterShaders != null) {
            this.NUM_FILTER_SHADER = i6;
            i6++;
        }
        this.mProgram = new int[i6];
        this.muMVPMatrixHandle = new int[i6];
        this.muSTMatrixHandle = new int[i6];
        this.maPositionHandle = new int[i6];
        this.maTextureHandle = new int[i6];
        this.mmTextureHandle = new int[i6];
        this.maskTextureHandle = new int[i6];
        if (cropState != null) {
            matrix = cropState.useMatrix;
            if (matrix != null) {
                this.useMatrixForImagePath = true;
                f7 = cropState.cropPw;
                f2 = 0.5f;
                f8 = cropState.cropPh;
                if ((cropState.orientation / 90) % 2 == 1) {
                    f7 = f8;
                    f8 = f7;
                }
                float f110 = (1.0f - f7) / 2.0f;
                float f111 = (1.0f - f8) / 2.0f;
                c3 = 1;
                fArr3 = new float[8];
                f9 = i3;
                float f112 = f9 * f110;
                fArr3[0] = f112;
                f10 = i4;
                float f210 = f10 * f111;
                fArr3[1] = f210;
                float f211 = (f110 + f7) * f9;
                fArr3[c] = f211;
                fArr3[3] = f210;
                fArr3[4] = f112;
                float f212 = (f111 + f8) * f10;
                fArr3[5] = f212;
                fArr3[6] = f211;
                fArr3[7] = f212;
                matrix.mapPoints(fArr3);
                while (i12 < 4) {
                    int i110 = i12 * 2;
                    fArr3[i110] = ((fArr3[i110] / i14) * 2.0f) - 1.0f;
                    int i111 = i110 + 1;
                    fArr3[i111] = 1.0f - ((fArr3[i111] / i15) * 2.0f);
                }
                f3 = 1.0f;
                FloatBuffer floatBufferAsFloatBuffer13 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.verticesBuffer = floatBufferAsFloatBuffer13;
                floatBufferAsFloatBuffer13.put(fArr3).position(0);
                fArr4 = new float[8];
                float f213 = f7 * f9;
                float f214 = f213 * (-0.5f);
                fArr4[0] = f214;
                float f215 = f8 * f10;
                float f216 = (-0.5f) * f215;
                fArr4[1] = f216;
                float f217 = f213 * 0.5f;
                fArr4[c] = f217;
                fArr4[3] = f216;
                fArr4[4] = f214;
                float f218 = f215 * 0.5f;
                fArr4[5] = f218;
                fArr4[6] = f217;
                fArr4[7] = f218;
                f11 = (float) (((double) (-cropState.cropRotate)) * 0.017453292519943295d);
                i13 = 0;
                while (i13 < i18) {
                    int i112 = i13 * 2;
                    float f219 = fArr4[i112];
                    int i23 = i112 + 1;
                    float f32 = fArr4[i23];
                    double d7 = f219 - (cropState.cropPx * f9);
                    double d8 = f11;
                    double d9 = f32 - (cropState.cropPy * f10);
                    float fCos3 = ((float) ((Math.cos(d8) * d7) - (Math.sin(d8) * d9))) / f9;
                    float fSin3 = ((float) ((Math.sin(d8) * d7) + (d9 * Math.cos(d8)))) / f10;
                    float f33 = cropState.cropScale;
                    fArr4[i112] = (fCos3 / f33) + 0.5f;
                    fArr4[i23] = (fSin3 / f33) + 0.5f;
                    i13++;
                }
                if (this.filterShaders == null) {
                    fArr4[1] = 1.0f - fArr4[1];
                    fArr4[3] = 1.0f - fArr4[3];
                    fArr4[5] = 1.0f - fArr4[5];
                    fArr4[7] = 1.0f - fArr4[7];
                }
                FloatBuffer floatBufferAsFloatBuffer14 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.croppedTextureBuffer = floatBufferAsFloatBuffer14;
                floatBufferAsFloatBuffer14.put(fArr4).position(0);
                c2 = 0;
            } else {
                f2 = 0.5f;
                c3 = 1;
                f3 = 1.0f;
                fArr2 = new float[8];
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                f4 = i14;
                fArr2[c] = f4;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                f5 = i15;
                fArr2[5] = f5;
                fArr2[6] = f4;
                fArr2[7] = f5;
                i7 = cropState.transformRotation;
                this.transformedWidth = (int) (this.transformedWidth * cropState.cropPw);
                this.transformedHeight = (int) (this.transformedHeight * cropState.cropPh);
                f6 = (float) (((double) (-cropState.cropRotate)) * 0.017453292519943295d);
                i11 = 0;
                while (i11 < 4) {
                    int i24 = i11 * 2;
                    int i25 = i24 + 1;
                    double d10 = fArr2[i24] - (i14 / 2);
                    double d11 = f6;
                    double d12 = fArr2[i25] - (i15 / 2);
                    float fCos4 = ((float) (((Math.cos(d11) * d10) - (Math.sin(d11) * d12)) + ((double) (cropState.cropPx * f4)))) * cropState.cropScale;
                    float fSin4 = ((float) (((d10 * Math.sin(d11)) + (Math.cos(d11) * d12)) - ((double) (cropState.cropPy * f5)))) * cropState.cropScale;
                    fArr2[i24] = (fCos4 / this.transformedWidth) * 2.0f;
                    fArr2[i25] = (fSin4 / this.transformedHeight) * 2.0f;
                    i11++;
                    i14 = i;
                    i15 = i2;
                }
                FloatBuffer floatBufferAsFloatBuffer15 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.verticesBuffer = floatBufferAsFloatBuffer15;
                c2 = 0;
                floatBufferAsFloatBuffer15.put(fArr2).position(0);
            }
            if (this.filterShaders != null) {
                i8 = 4;
                if (i7 == 90) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = 0.0f;
                    fArr[c] = f3;
                    fArr[3] = f3;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = f3;
                } else if (i7 == 180) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = f3;
                    fArr[c] = 0.0f;
                    fArr[3] = f3;
                    fArr[4] = f3;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                } else if (i7 == 270) {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = f3;
                    fArr[c] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[4] = f3;
                    fArr[5] = f3;
                    fArr[6] = f3;
                    fArr[7] = 0.0f;
                } else {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = 0.0f;
                    fArr[c] = f3;
                    fArr[3] = 0.0f;
                    fArr[4] = 0.0f;
                    fArr[5] = f3;
                    fArr[6] = f3;
                    fArr[7] = f3;
                }
            } else if (i7 == 90) {
                fArr = new float[8];
                fArr[c2] = f3;
                fArr[c3] = f3;
                fArr[c] = f3;
                fArr[3] = 0.0f;
                i8 = 4;
                fArr[4] = 0.0f;
                fArr[5] = f3;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
            } else {
                i8 = 4;
                if (i7 == 180) {
                    fArr = new float[8];
                    fArr[c2] = f3;
                    fArr[c3] = 0.0f;
                    fArr[c] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[4] = f3;
                    fArr[5] = f3;
                    fArr[6] = 0.0f;
                    fArr[7] = f3;
                } else if (i7 == 270) {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = 0.0f;
                    fArr[c] = 0.0f;
                    fArr[3] = f3;
                    fArr[4] = f3;
                    fArr[5] = 0.0f;
                    fArr[6] = f3;
                    fArr[7] = f3;
                } else {
                    fArr = new float[8];
                    fArr[c2] = 0.0f;
                    fArr[c3] = f3;
                    fArr[c] = f3;
                    fArr[3] = f3;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = f3;
                    fArr[7] = 0.0f;
                }
            }
            if (cropState != null) {
                i9 = 0;
                while (i9 < i8) {
                    i10 = i9 * 2;
                    if (fArr[i10] > f2) {
                        fArr[i10] = 0.0f;
                    } else {
                        fArr[i10] = f3;
                    }
                    i9++;
                    i8 = 4;
                }
            }
            FloatBuffer floatBufferAsFloatBuffer16 = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.renderTextureBuffer = floatBufferAsFloatBuffer16;
            floatBufferAsFloatBuffer16.put(fArr).position(0);
            FloatBuffer floatBufferAsFloatBuffer17 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.maskTextureBuffer = floatBufferAsFloatBuffer17;
            floatBufferAsFloatBuffer17.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        }
        f2 = 0.5f;
        c2 = 0;
        c3 = 1;
        f3 = 1.0f;
        FloatBuffer floatBufferAsFloatBuffer18 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.verticesBuffer = floatBufferAsFloatBuffer18;
        floatBufferAsFloatBuffer18.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
        i7 = 0;
        if (this.filterShaders != null) {
            i8 = 4;
            if (i7 == 90) {
                fArr = new float[8];
                fArr[c2] = f3;
                fArr[c3] = 0.0f;
                fArr[c] = f3;
                fArr[3] = f3;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = f3;
            } else if (i7 == 180) {
                fArr = new float[8];
                fArr[c2] = f3;
                fArr[c3] = f3;
                fArr[c] = 0.0f;
                fArr[3] = f3;
                fArr[4] = f3;
                fArr[5] = 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
            } else if (i7 == 270) {
                fArr = new float[8];
                fArr[c2] = 0.0f;
                fArr[c3] = f3;
                fArr[c] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = f3;
                fArr[5] = f3;
                fArr[6] = f3;
                fArr[7] = 0.0f;
            } else {
                fArr = new float[8];
                fArr[c2] = 0.0f;
                fArr[c3] = 0.0f;
                fArr[c] = f3;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f3;
                fArr[6] = f3;
                fArr[7] = f3;
            }
        } else if (i7 == 90) {
            fArr = new float[8];
            fArr[c2] = f3;
            fArr[c3] = f3;
            fArr[c] = f3;
            fArr[3] = 0.0f;
            i8 = 4;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        } else {
            i8 = 4;
            if (i7 == 180) {
                fArr = new float[8];
                fArr[c2] = f3;
                fArr[c3] = 0.0f;
                fArr[c] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = f3;
                fArr[5] = f3;
                fArr[6] = 0.0f;
                fArr[7] = f3;
            } else if (i7 == 270) {
                fArr = new float[8];
                fArr[c2] = 0.0f;
                fArr[c3] = 0.0f;
                fArr[c] = 0.0f;
                fArr[3] = f3;
                fArr[4] = f3;
                fArr[5] = 0.0f;
                fArr[6] = f3;
                fArr[7] = f3;
            } else {
                fArr = new float[8];
                fArr[c2] = 0.0f;
                fArr[c3] = f3;
                fArr[c] = f3;
                fArr[3] = f3;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f3;
                fArr[7] = 0.0f;
            }
        }
        if (cropState != null) {
            i9 = 0;
            while (i9 < i8) {
                i10 = i9 * 2;
                if (fArr[i10] > f2) {
                    fArr[i10] = 0.0f;
                } else {
                    fArr[i10] = f3;
                }
                i9++;
                i8 = 4;
            }
        }
        FloatBuffer floatBufferAsFloatBuffer19 = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.renderTextureBuffer = floatBufferAsFloatBuffer19;
        floatBufferAsFloatBuffer19.put(fArr).position(0);
        FloatBuffer floatBufferAsFloatBuffer110 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.maskTextureBuffer = floatBufferAsFloatBuffer110;
        floatBufferAsFloatBuffer110.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    private void drawBackground() {
        int i = this.NUM_GRADIENT_SHADER;
        if (i >= 0) {
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
            return;
        }
        if (this.backgroundPathIndex >= 0) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33984);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            drawTexture(true, this.paintTexture[this.backgroundPathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j) {
        int i;
        int i2;
        float[] fArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int renderTexture;
        int renderBufferWidth;
        int renderBufferHeight;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i5 = 0;
            i = 33985;
            i6 = 3042;
            i7 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (BuildVars.LOGS_ENABLED && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i8 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i = 33985;
                    if (i8 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i8]);
                    sb.append(", ");
                    i8++;
                }
                FileLog.d("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            } else {
                i = 33985;
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
                boolean zDrawBlurPass = this.filterShaders.drawBlurPass();
                GLES20.glBindFramebuffer(36160, 0);
                int i9 = this.transformedWidth;
                if (i9 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i9, this.transformedHeight);
                }
                int renderTexture2 = this.filterShaders.getRenderTexture(!zDrawBlurPass ? 1 : 0);
                int i10 = this.NUM_FILTER_SHADER;
                fArr = this.mSTMatrixIdentity;
                i3 = i10;
                i4 = renderTexture2;
                i5 = zDrawBlurPass ? 1 : 0;
                i2 = 3553;
            } else {
                int i11 = this.mTextureID;
                int i12 = this.NUM_EXTERNAL_SHADER;
                i2 = 36197;
                fArr = this.mSTMatrix;
                i3 = i12;
                i4 = i11;
                i5 = 0;
            }
            i6 = 3042;
            drawBackground();
            i7 = 33984;
            GLES20.glUseProgram(this.mProgram[i3]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i2, i4);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i3], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i3], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i3]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[i3], 2, 5126, false, 8, (Buffer) (this.useMatrixForImagePath ? this.croppedTextureBuffer : this.renderTextureBuffer));
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i3]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i3], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i3]);
            }
            int i13 = this.texSizeHandle;
            if (i13 != 0) {
                GLES20.glUniform2f(i13, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i3], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i3], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i6);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath != null && (iArr = this.paintTexture) != null) {
                renderTexture = iArr[0];
                renderBufferWidth = this.imageWidth;
                renderBufferHeight = this.imageHeight;
            } else {
                FilterShaders filterShaders2 = this.filterShaders;
                if (filterShaders2 != null) {
                    renderTexture = filterShaders2.getRenderTexture(i5 ^ 1);
                    renderBufferWidth = this.filterShaders.getRenderBufferWidth();
                    renderBufferHeight = this.filterShaders.getRenderBufferHeight();
                } else {
                    renderTexture = -1;
                    renderBufferWidth = 1;
                    renderBufferHeight = 1;
                }
            }
            if (renderTexture != -1) {
                this.blur.draw(null, renderTexture, renderBufferWidth, renderBufferHeight);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i7);
                GLES20.glBindTexture(3553, this.blur.getTexture());
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i14 = 0; i14 < this.collageParts.size(); i14++) {
                stepCollagePart(i14, this.collageParts.get(i14), j);
                drawCollagePart(i14, this.collageParts.get(i14), j);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i7);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            drawTexture(true, this.paintTexture[this.imagePathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto, -1);
        }
        int i15 = this.paintPathIndex;
        if (i15 >= 0) {
            drawTexture(true, this.paintTexture[i15], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i16 = this.messagePathIndex;
        if (i16 >= 0) {
            drawTexture(true, this.paintTexture[i16], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i17 = 0; i17 < size; i17++) {
                drawEntity(this.mediaEntities.get(i17), this.mediaEntities.get(i17).color, j);
            }
        }
        GLES20.glFinish();
    }

    private void drawEntity(VideoEditedInfo.MediaEntity mediaEntity, int i, long j) {
        VideoEditedInfo.MediaEntity mediaEntity2;
        Bitmap bitmap;
        long j2;
        long j3;
        long jClamp;
        RLottieNative rLottieNative = mediaEntity.lottieNative;
        if (rLottieNative != null) {
            Bitmap bitmap2 = mediaEntity.bitmap;
            if (bitmap2 == null || mediaEntity.W <= 0 || mediaEntity.H <= 0) {
                return;
            }
            rLottieNative.getFrame((int) mediaEntity.currentFrame, bitmap2, true);
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            float f = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f;
            if (f >= mediaEntity.lottieNative.getFrameCount()) {
                mediaEntity.currentFrame = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (2 & mediaEntity.subType) != 0);
            return;
        }
        if (mediaEntity.animatedFileDrawable != null) {
            float f2 = mediaEntity.currentFrame;
            int i2 = (int) f2;
            float interpolation = 1.0f;
            if (mediaEntity.type == 5) {
                if (this.isPhoto) {
                    j2 = mediaEntity.roundDuration;
                    j3 = 0;
                } else {
                    long j4 = mediaEntity.roundOffset;
                    j2 = (mediaEntity.roundRight - mediaEntity.roundLeft) + j4;
                    j3 = j4;
                }
                long j5 = j / 1000000;
                if (j5 < j3) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(1.0f - ((j3 - j5) / 400.0f), 1.0f, 0.0f));
                } else if (j5 > j2) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(1.0f - ((j5 - j2) / 400.0f), 1.0f, 0.0f));
                }
                if (interpolation > 0.0f) {
                    if (this.isPhoto) {
                        jClamp = Utilities.clamp(j5, mediaEntity.roundDuration, 0L);
                    } else {
                        jClamp = Utilities.clamp((j5 - mediaEntity.roundOffset) + mediaEntity.roundLeft, mediaEntity.roundDuration, 0L);
                    }
                    while (!mediaEntity.looped && mediaEntity.animatedFileDrawable.getProgressMs() < Math.min(jClamp, mediaEntity.animatedFileDrawable.getDurationMs())) {
                        int progressMs = mediaEntity.animatedFileDrawable.getProgressMs();
                        mediaEntity.animatedFileDrawable.getNextFrame(false);
                        if (mediaEntity.animatedFileDrawable.getProgressMs() <= progressMs && (mediaEntity.animatedFileDrawable.getProgressMs() != 0 || progressMs != 0)) {
                            mediaEntity.looped = true;
                            break;
                        }
                    }
                }
            } else {
                float f3 = f2 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f3;
                for (int i3 = (int) f3; i2 != i3; i3--) {
                    mediaEntity.animatedFileDrawable.getNextFrame(true);
                }
            }
            Bitmap backgroundBitmap = mediaEntity.animatedFileDrawable.getBackgroundBitmap();
            if (backgroundBitmap != null) {
                if (mediaEntity.type == 5) {
                    if (this.roundBitmap == null) {
                        int iMin = Math.min(backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
                        this.roundBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        this.roundCanvas = new Canvas(this.roundBitmap);
                    }
                    Bitmap bitmap3 = this.roundBitmap;
                    if (bitmap3 != null) {
                        bitmap3.eraseColor(0);
                        this.roundCanvas.save();
                        if (this.roundClipPath == null) {
                            this.roundClipPath = new Path();
                        }
                        this.roundClipPath.rewind();
                        this.roundClipPath.addCircle(this.roundBitmap.getWidth() / 2.0f, this.roundBitmap.getHeight() / 2.0f, (this.roundBitmap.getWidth() / 2.0f) * interpolation, Path.Direction.CW);
                        this.roundCanvas.clipPath(this.roundClipPath);
                        if (backgroundBitmap.getWidth() >= backgroundBitmap.getHeight()) {
                            this.roundSrc.set((backgroundBitmap.getWidth() - backgroundBitmap.getHeight()) / 2, 0, backgroundBitmap.getWidth() - ((backgroundBitmap.getWidth() - backgroundBitmap.getHeight()) / 2), backgroundBitmap.getHeight());
                        } else {
                            this.roundSrc.set(0, (backgroundBitmap.getHeight() - backgroundBitmap.getWidth()) / 2, backgroundBitmap.getWidth(), backgroundBitmap.getHeight() - ((backgroundBitmap.getHeight() - backgroundBitmap.getWidth()) / 2));
                        }
                        this.roundDst.set(0.0f, 0.0f, this.roundBitmap.getWidth(), this.roundBitmap.getHeight());
                        this.roundCanvas.drawBitmap(backgroundBitmap, this.roundSrc, this.roundDst, (Paint) null);
                        this.roundCanvas.restore();
                    }
                    bitmap = this.roundBitmap;
                } else {
                    if (this.stickerCanvas == null && this.stickerBitmap != null) {
                        this.stickerCanvas = new Canvas(this.stickerBitmap);
                        if (this.stickerBitmap.getHeight() != backgroundBitmap.getHeight() || this.stickerBitmap.getWidth() != backgroundBitmap.getWidth()) {
                            this.stickerCanvas.scale(this.stickerBitmap.getWidth() / backgroundBitmap.getWidth(), this.stickerBitmap.getHeight() / backgroundBitmap.getHeight());
                        }
                    }
                    Bitmap bitmap4 = this.stickerBitmap;
                    if (bitmap4 != null) {
                        bitmap4.eraseColor(0);
                        this.stickerCanvas.drawBitmap(backgroundBitmap, 0.0f, 0.0f, (Paint) null);
                        applyRoundRadius(mediaEntity, this.stickerBitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
                    }
                    bitmap = this.stickerBitmap;
                }
                if (bitmap != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
                    return;
                }
                return;
            }
            return;
        }
        if (mediaEntity.bitmap != null) {
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            int i4 = this.stickerTexture[0];
            float f4 = mediaEntity.x;
            float f5 = mediaEntity.additionalWidth;
            float f6 = f4 - (f5 / 2.0f);
            float f7 = mediaEntity.y;
            float f8 = mediaEntity.additionalHeight;
            drawTexture(false, i4, f6, f7 - (f8 / 2.0f), mediaEntity.width + f5, f8 + mediaEntity.height, mediaEntity.rotation, mediaEntity.type == 2 && (mediaEntity.subType & 2) != 0);
        }
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < mediaEntity.entities.size(); i5++) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i5);
            if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                drawEntity(mediaEntity2, mediaEntity.color, j);
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
            float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), fMin, fMin, Path.Direction.CCW);
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
        float f10 = fArr3[0];
        float f11 = fArr3[2];
        float f12 = (f10 + f11) / 2.0f;
        if (z2) {
            fArr3[2] = f10;
            fArr3[0] = f11;
            float f13 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f13;
        }
        if (f5 != 0.0f) {
            float f14 = this.transformedWidth / this.transformedHeight;
            float f15 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i3 = 0;
            for (int i4 = 4; i3 < i4; i4 = 4) {
                float[] fArr4 = this.bitmapData;
                int i5 = i3 * 2;
                int i6 = i5 + 1;
                double d = fArr4[i5] - f12;
                double d2 = f5;
                float f16 = f12;
                double d3 = (fArr4[i6] - f15) / f14;
                fArr4[i5] = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d3))) + f16;
                this.bitmapData[i6] = (((float) ((d * Math.sin(d2)) + (d3 * Math.cos(d2)))) * f14) + f15;
                i3++;
                f12 = f16;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z) {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void setBreakStrategy(EditTextOutline editTextOutline) {
        editTextOutline.setBreakStrategy(0);
    }

    public void surfaceCreated() {
        int i;
        String str;
        int iIntValue;
        int iIntValue2;
        float fMax;
        MediaController.CropState cropState;
        int i2 = 0;
        while (true) {
            int[] iArr = this.mProgram;
            String str2 = null;
            if (i2 >= iArr.length) {
                break;
            }
            String str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            String str4 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
            if (i2 == this.NUM_EXTERNAL_SHADER) {
                String str5 = this.messageVideoMaskPath;
                str2 = str5 != null ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);}\n";
                if (str5 == null) {
                    str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
                }
                str4 = str3;
            } else if (i2 == this.NUM_FILTER_SHADER) {
                String str6 = this.messageVideoMaskPath;
                str2 = str6 != null ? "precision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n" : "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
                if (str6 == null) {
                    str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
                }
                str4 = str3;
            } else if (i2 == this.NUM_GRADIENT_SHADER) {
                str2 = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform vec4 gradientTopColor;\nuniform vec4 gradientBottomColor;\nfloat interleavedGradientNoise(vec2 n) {\n    return fract(52.9829189 * fract(.06711056 * n.x + .00583715 * n.y));\n}\nvoid main() {\n  gl_FragColor = mix(gradientTopColor, gradientBottomColor, vTextureCoord.y + (.2 * interleavedGradientNoise(gl_FragCoord.xy) - .1));\n}\n";
            }
            if (str2 != null) {
                iArr[i2] = createProgram(str4, str2, false);
                this.maPositionHandle[i2] = GLES20.glGetAttribLocation(this.mProgram[i2], "aPosition");
                this.maTextureHandle[i2] = GLES20.glGetAttribLocation(this.mProgram[i2], "aTextureCoord");
                this.mmTextureHandle[i2] = GLES20.glGetAttribLocation(this.mProgram[i2], "mTextureCoord");
                this.muMVPMatrixHandle[i2] = GLES20.glGetUniformLocation(this.mProgram[i2], "uMVPMatrix");
                this.muSTMatrixHandle[i2] = GLES20.glGetUniformLocation(this.mProgram[i2], "uSTMatrix");
                this.maskTextureHandle[i2] = GLES20.glGetUniformLocation(this.mProgram[i2], "sMask");
                if (i2 == this.NUM_GRADIENT_SHADER) {
                    this.gradientTopColorHandle = GLES20.glGetUniformLocation(this.mProgram[i2], "gradientTopColor");
                    this.gradientBottomColorHandle = GLES20.glGetUniformLocation(this.mProgram[i2], "gradientBottomColor");
                }
            }
            i2++;
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i3 = iArr2[0];
        this.mTextureID = i3;
        GLES20.glBindTexture(36197, i3);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        if (this.messageVideoMaskPath != null) {
            try {
                GLES20.glGenTextures(1, iArr2, 0);
                int i4 = iArr2[0];
                this.videoMaskTexture = i4;
                GLES20.glBindTexture(3553, i4);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.messageVideoMaskPath);
                GLUtils.texImage2D(3553, 0, bitmapDecodeFile, 0);
                bitmapDecodeFile.recycle();
            } catch (Exception e) {
                FileLog.e(e);
                this.videoMaskTexture = -1;
            }
        }
        if (this.blurPath != null && (cropState = this.cropState) != null && cropState.useMatrix != null) {
            BlurringShader blurringShader = new BlurringShader();
            this.blur = blurringShader;
            if (!blurringShader.setup(this.transformedWidth / this.transformedHeight, true, 0)) {
                this.blur = null;
            } else {
                this.blur.updateGradient(this.gradientTopColor, this.gradientBottomColor);
                Matrix matrix = new Matrix();
                matrix.postScale(this.originalWidth, this.originalHeight);
                matrix.postConcat(this.cropState.useMatrix);
                matrix.postScale(1.0f / this.transformedWidth, 1.0f / this.transformedHeight);
                Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                this.blur.updateTransform(matrix2);
            }
            Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(this.blurPath);
            if (bitmapDecodeFile2 != null) {
                int[] iArr3 = new int[1];
                this.blurTexture = iArr3;
                GLES20.glGenTextures(1, iArr3, 0);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLUtils.texImage2D(3553, 0, bitmapDecodeFile2, 0);
                bitmapDecodeFile2.recycle();
            } else {
                this.blur = null;
            }
            if (this.blur != null) {
                int iLoadShader = FilterShaders.loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                int iLoadShader2 = FilterShaders.loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D blurImage;uniform sampler2D maskImage;void main() {gl_FragColor = texture2D(blurImage, vTextureCoord) * texture2D(maskImage, vTextureCoord).a;}");
                if (iLoadShader != 0 && iLoadShader2 != 0) {
                    int iGlCreateProgram = GLES20.glCreateProgram();
                    this.blurShaderProgram = iGlCreateProgram;
                    GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                    GLES20.glAttachShader(this.blurShaderProgram, iLoadShader2);
                    GLES20.glBindAttribLocation(this.blurShaderProgram, 0, "position");
                    GLES20.glBindAttribLocation(this.blurShaderProgram, 1, "inputTexCoord");
                    GLES20.glLinkProgram(this.blurShaderProgram);
                    int[] iArr4 = new int[1];
                    GLES20.glGetProgramiv(this.blurShaderProgram, 35714, iArr4, 0);
                    if (iArr4[0] == 0) {
                        GLES20.glDeleteProgram(this.blurShaderProgram);
                        this.blurShaderProgram = 0;
                    } else {
                        this.blurPositionHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "position");
                        this.blurInputTexCoordHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "inputTexCoord");
                        this.blurBlurImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "blurImage");
                        this.blurMaskImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "maskImage");
                        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.blurVerticesBuffer = floatBufferAsFloatBuffer;
                        floatBufferAsFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f}).position(0);
                    }
                } else {
                    this.blur = null;
                }
            }
        }
        if (this.filterShaders != null || this.imagePath != null || this.paintPath != null || this.messagePath != null || this.mediaEntities != null || isCollage()) {
            int iLoadShader3 = FilterShaders.loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int iLoadShader4 = FilterShaders.loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
            if (iLoadShader3 != 0 && iLoadShader4 != 0) {
                int iGlCreateProgram2 = GLES20.glCreateProgram();
                this.simpleShaderProgram = iGlCreateProgram2;
                GLES20.glAttachShader(iGlCreateProgram2, iLoadShader3);
                GLES20.glAttachShader(this.simpleShaderProgram, iLoadShader4);
                GLES20.glBindAttribLocation(this.simpleShaderProgram, 0, "position");
                GLES20.glBindAttribLocation(this.simpleShaderProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.simpleShaderProgram);
                int[] iArr5 = new int[1];
                GLES20.glGetProgramiv(this.simpleShaderProgram, 35714, iArr5, 0);
                if (iArr5[0] == 0) {
                    GLES20.glDeleteProgram(this.simpleShaderProgram);
                    this.simpleShaderProgram = 0;
                } else {
                    this.simplePositionHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "position");
                    this.simpleInputTexCoordHandle = GLES20.glGetAttribLocation(this.simpleShaderProgram, "inputTexCoord");
                    this.simpleSourceImageHandle = GLES20.glGetUniformLocation(this.simpleShaderProgram, "sTexture");
                }
            }
        }
        if (isCollage()) {
            int iLoadShader5 = FilterShaders.loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
            int iLoadShader6 = FilterShaders.loadShader(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replaceAll("sampler2D", "samplerExternalOES"));
            if (iLoadShader5 != 0 && iLoadShader6 != 0) {
                int iGlCreateProgram3 = GLES20.glCreateProgram();
                this.simpleShaderProgramOES = iGlCreateProgram3;
                GLES20.glAttachShader(iGlCreateProgram3, iLoadShader5);
                GLES20.glAttachShader(this.simpleShaderProgramOES, iLoadShader6);
                GLES20.glBindAttribLocation(this.simpleShaderProgramOES, 0, "position");
                GLES20.glBindAttribLocation(this.simpleShaderProgramOES, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.simpleShaderProgramOES);
                int[] iArr6 = new int[1];
                GLES20.glGetProgramiv(this.simpleShaderProgramOES, 35714, iArr6, 0);
                if (iArr6[0] == 0) {
                    GLES20.glDeleteProgram(this.simpleShaderProgramOES);
                    this.simpleShaderProgramOES = 0;
                } else {
                    this.simplePositionHandleOES = GLES20.glGetAttribLocation(this.simpleShaderProgramOES, "position");
                    this.simpleInputTexCoordHandleOES = GLES20.glGetAttribLocation(this.simpleShaderProgramOES, "inputTexCoord");
                    this.simpleSourceImageHandleOES = GLES20.glGetUniformLocation(this.simpleShaderProgramOES, "sTexture");
                }
            }
        }
        FilterShaders filterShaders = this.filterShaders;
        if (filterShaders != null) {
            filterShaders.create();
            this.filterShaders.setRenderData(null, 0, this.mTextureID, this.originalWidth, this.originalHeight);
        }
        String str7 = this.imagePath;
        if (str7 != null || this.paintPath != null || this.messagePath != null) {
            if (str7 != null) {
                this.imagePathIndex = 0;
                i = 1;
            } else {
                i = 0;
            }
            if (this.paintPath != null) {
                this.paintPathIndex = i;
                i++;
            }
            if (this.messagePath != null) {
                this.messagePathIndex = i;
                i++;
            }
            if (this.backgroundPath != null) {
                this.backgroundPathIndex = i;
                i++;
            }
            int[] iArr7 = new int[i];
            this.paintTexture = iArr7;
            GLES20.glGenTextures(i, iArr7, 0);
            for (int i5 = 0; i5 < this.paintTexture.length; i5++) {
                try {
                    if (i5 == this.imagePathIndex) {
                        str = this.imagePath;
                        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
                        iIntValue2 = ((Integer) imageOrientation.first).intValue();
                        iIntValue = ((Integer) imageOrientation.second).intValue();
                    } else {
                        if (i5 == this.paintPathIndex) {
                            str = this.paintPath;
                        } else if (i5 == this.backgroundPathIndex) {
                            str = this.backgroundPath;
                        } else {
                            str = this.messagePath;
                        }
                        iIntValue = 0;
                        iIntValue2 = 0;
                    }
                    Bitmap bitmapDecodeFile3 = BitmapFactory.decodeFile(str);
                    if (bitmapDecodeFile3 != null) {
                        if (i5 == this.imagePathIndex && !this.useMatrixForImagePath) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.transformedWidth, this.transformedHeight, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.eraseColor(-16777216);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            if (iIntValue2 == 90 || iIntValue2 == 270) {
                                fMax = Math.max(bitmapDecodeFile3.getHeight() / this.transformedWidth, bitmapDecodeFile3.getWidth() / this.transformedHeight);
                            } else {
                                fMax = Math.max(bitmapDecodeFile3.getWidth() / this.transformedWidth, bitmapDecodeFile3.getHeight() / this.transformedHeight);
                            }
                            Matrix matrix3 = new Matrix();
                            matrix3.postTranslate((-bitmapDecodeFile3.getWidth()) / 2, (-bitmapDecodeFile3.getHeight()) / 2);
                            matrix3.postScale((iIntValue == 1 ? -1.0f : 1.0f) / fMax, (iIntValue == 2 ? -1.0f : 1.0f) / fMax);
                            matrix3.postRotate(iIntValue2);
                            matrix3.postTranslate(bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
                            canvas.drawBitmap(bitmapDecodeFile3, matrix3, new Paint(2));
                            bitmapDecodeFile3 = bitmapCreateBitmap;
                        }
                        if (i5 == this.imagePathIndex) {
                            this.imageWidth = bitmapDecodeFile3.getWidth();
                            this.imageHeight = bitmapDecodeFile3.getHeight();
                        }
                        GLES20.glBindTexture(3553, this.paintTexture[i5]);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLUtils.texImage2D(3553, 0, bitmapDecodeFile3, 0);
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
        if (isCollage()) {
            try {
                int size = this.collageParts.size();
                int[] iArr8 = new int[size];
                this.collageTextures = iArr8;
                GLES20.glGenTextures(size, iArr8, 0);
                for (int i6 = 0; i6 < this.collageParts.size(); i6++) {
                    initCollagePart(i6, this.collageParts.get(i6));
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        if (this.mediaEntities == null && this.backgroundDrawable == null) {
            return;
        }
        try {
            this.stickerBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
            int[] iArr9 = new int[1];
            this.stickerTexture = iArr9;
            GLES20.glGenTextures(1, iArr9, 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int size2 = this.mediaEntities.size();
            for (int i7 = 0; i7 < size2; i7++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i7);
                byte b = mediaEntity.type;
                if (b == 0 || b == 2 || b == 5) {
                    initStickerEntity(mediaEntity);
                } else if (b == 1) {
                    initTextEntity(mediaEntity);
                } else if (b == 3) {
                    initLocationEntity(mediaEntity);
                } else if (b == 7) {
                    initLinkEntity(mediaEntity);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
        int i;
        Typeface typeface;
        final EditTextOutline editTextOutline = new EditTextOutline(ApplicationLoader.applicationContext);
        editTextOutline.getPaint().setAntiAlias(true);
        editTextOutline.drawAnimatedEmojiDrawables = false;
        editTextOutline.setBackgroundColor(0);
        editTextOutline.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        PaintTypeface paintTypeface = mediaEntity.textTypeface;
        if (paintTypeface != null && (typeface = paintTypeface.getTypeface()) != null) {
            editTextOutline.setTypeface(typeface);
        }
        editTextOutline.setTextSize(0, mediaEntity.fontSize);
        SpannableString spannableString = new SpannableString(mediaEntity.text);
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i2);
            if (emojiEntity.documentAbsolutePath != null) {
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                emojiEntity.entity = mediaEntity2;
                mediaEntity2.text = emojiEntity.documentAbsolutePath;
                mediaEntity2.subType = emojiEntity.subType;
                AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(0L, 1.0f, editTextOutline.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                        super.draw(canvas, charSequence, i4, i5, f, i6, i7, i8, paint);
                        float f2 = mediaEntity.x;
                        float paddingLeft = editTextOutline.getPaddingLeft() + f + (this.measuredSize / 2.0f);
                        VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                        float f3 = f2 + ((paddingLeft / mediaEntity3.viewWidth) * mediaEntity3.width);
                        float f4 = mediaEntity3.y;
                        float paddingTop = editTextOutline.getPaddingTop() + i6 + ((i8 - i6) / 2.0f);
                        VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                        float f5 = paddingTop / mediaEntity4.viewHeight;
                        float f6 = mediaEntity4.height;
                        float fSin = f4 + (f5 * f6);
                        if (mediaEntity4.rotation != 0.0f) {
                            float f7 = mediaEntity4.x + (mediaEntity4.width / 2.0f);
                            float f8 = mediaEntity4.y + (f6 / 2.0f);
                            float f9 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = f3 - f7;
                            double d2 = (fSin - f8) / f9;
                            float fCos = f7 + ((float) ((Math.cos(-mediaEntity.rotation) * d) - (Math.sin(-mediaEntity.rotation) * d2)));
                            fSin = (((float) ((d * Math.sin(-mediaEntity.rotation)) + (d2 * Math.cos(-mediaEntity.rotation)))) * f9) + f8;
                            f3 = fCos;
                        }
                        VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                        float f10 = this.measuredSize;
                        VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                        float f11 = (f10 / mediaEntity6.viewWidth) * mediaEntity6.width;
                        mediaEntity5.width = f11;
                        float f12 = (f10 / mediaEntity6.viewHeight) * mediaEntity6.height;
                        mediaEntity5.height = f12;
                        mediaEntity5.x = f3 - (f11 / 2.0f);
                        mediaEntity5.y = fSin - (f12 / 2.0f);
                        mediaEntity5.rotation = mediaEntity6.rotation;
                        if (mediaEntity5.bitmap == null) {
                            TextureRenderer.this.initStickerEntity(mediaEntity5);
                        }
                    }
                };
                int i4 = emojiEntity.offset;
                spannableString.setSpan(animatedEmojiSpan, i4, emojiEntity.length + i4, 33);
            }
            i2 = i3;
        }
        editTextOutline.setText(Emoji.replaceEmoji(spannableString, editTextOutline.getPaint().getFontMetricsInt(), false));
        editTextOutline.setTextColor(mediaEntity.color);
        Editable text = editTextOutline.getText();
        if (OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(text)) {
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
        }
        int i5 = mediaEntity.textAlign;
        editTextOutline.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
        int i6 = Build.VERSION.SDK_INT;
        int i7 = mediaEntity.textAlign;
        if (i7 != 1) {
            i = (i7 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2;
        } else {
            i = 4;
        }
        editTextOutline.setTextAlignment(i);
        editTextOutline.setHorizontallyScrolling(false);
        editTextOutline.setImeOptions(268435456);
        editTextOutline.setFocusableInTouchMode(true);
        editTextOutline.setInputType(editTextOutline.getInputType() | 16384);
        if (i6 >= 23) {
            setBreakStrategy(editTextOutline);
        }
        byte b = mediaEntity.subType;
        if (b == 0) {
            editTextOutline.setFrameColor(mediaEntity.color);
            editTextOutline.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1);
        } else if (b == 1) {
            editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
            editTextOutline.setTextColor(mediaEntity.color);
        } else if (b == 2) {
            editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -16777216 : -1);
            editTextOutline.setTextColor(mediaEntity.color);
        } else if (b == 3) {
            editTextOutline.setFrameColor(0);
            editTextOutline.setTextColor(mediaEntity.color);
        }
        editTextOutline.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        editTextOutline.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
        editTextOutline.draw(new Canvas(mediaEntity.bitmap));
    }

    private void initLocationEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        float f;
        LocationMarker locationMarker = new LocationMarker(ApplicationLoader.applicationContext, mediaEntity.type == 3 ? 0 : 1, mediaEntity.density, 0);
        locationMarker.setIsVideo(true);
        locationMarker.setText(mediaEntity.text);
        locationMarker.setType(mediaEntity.subType, mediaEntity.color);
        if (mediaEntity.weather != null && mediaEntity.entities.isEmpty()) {
            locationMarker.setCodeEmoji(UserConfig.selectedAccount, mediaEntity.weather.getEmoji());
        }
        locationMarker.setMaxWidth(mediaEntity.viewWidth);
        if (mediaEntity.entities.size() == 1) {
            locationMarker.forceEmoji();
        }
        locationMarker.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        locationMarker.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f2 = mediaEntity.width * this.transformedWidth;
        float f3 = mediaEntity.viewWidth;
        float f4 = f2 / f3;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (f3 * f4)) + 16, ((int) (mediaEntity.viewHeight * f4)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f5 = 8;
        canvas.translate(f5, f5);
        canvas.scale(f4, f4);
        locationMarker.draw(canvas);
        float f6 = 16 * f4;
        mediaEntity.additionalWidth = f6 / this.transformedWidth;
        mediaEntity.additionalHeight = f6 / this.transformedHeight;
        if (mediaEntity.entities.size() == 1) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(0);
            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
            emojiEntity.entity = mediaEntity2;
            mediaEntity2.text = emojiEntity.documentAbsolutePath;
            mediaEntity2.subType = emojiEntity.subType;
            RectF rectF = new RectF();
            locationMarker.getEmojiBounds(rectF);
            float fCenterX = mediaEntity.x + ((rectF.centerX() / mediaEntity.viewWidth) * mediaEntity.width);
            float f7 = mediaEntity.y;
            float fCenterY = rectF.centerY() / mediaEntity.viewHeight;
            float f8 = mediaEntity.height;
            float fSin = f7 + (fCenterY * f8);
            float f9 = mediaEntity.rotation;
            if (f9 != 0.0f) {
                float f10 = mediaEntity.x + (mediaEntity.width / 2.0f);
                float f11 = mediaEntity.y + (f8 / 2.0f);
                float f12 = this.transformedWidth / this.transformedHeight;
                double d = fCenterX - f10;
                double d2 = (fSin - f11) / f12;
                f = 2.0f;
                fCenterX = ((float) ((Math.cos(-f9) * d) - (Math.sin(-mediaEntity.rotation) * d2))) + f10;
                fSin = (((float) ((d * Math.sin(-mediaEntity.rotation)) + (d2 * Math.cos(-mediaEntity.rotation)))) * f12) + f11;
            } else {
                f = 2.0f;
            }
            emojiEntity.entity.width = (rectF.width() / mediaEntity.viewWidth) * mediaEntity.width;
            emojiEntity.entity.height = (rectF.height() / mediaEntity.viewHeight) * mediaEntity.height;
            VideoEditedInfo.MediaEntity mediaEntity3 = emojiEntity.entity;
            float f13 = mediaEntity3.width * 1.2f;
            mediaEntity3.width = f13;
            float f14 = mediaEntity3.height * 1.2f;
            mediaEntity3.height = f14;
            mediaEntity3.x = fCenterX - (f13 / f);
            mediaEntity3.y = fSin - (f14 / f);
            mediaEntity3.rotation = mediaEntity.rotation;
            initStickerEntity(mediaEntity3);
        }
    }

    private void initLinkEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        LinkPreview linkPreview = new LinkPreview(ApplicationLoader.applicationContext, mediaEntity.density);
        linkPreview.setVideoTexture();
        linkPreview.set(UserConfig.selectedAccount, mediaEntity.linkSettings);
        if (linkPreview.withPreview()) {
            linkPreview.setPreviewType(mediaEntity.subType);
        } else {
            linkPreview.setType(mediaEntity.subType, mediaEntity.color);
        }
        int i = mediaEntity.viewWidth;
        int i2 = linkPreview.padx;
        linkPreview.setMaxWidth(i + i2 + i2);
        linkPreview.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        linkPreview.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f = mediaEntity.width * this.transformedWidth;
        float f2 = mediaEntity.viewWidth;
        float f3 = f / f2;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (f2 * f3)) + 16, ((int) (mediaEntity.viewHeight * f3)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f4 = 8;
        canvas.translate(f4, f4);
        canvas.scale(f3, f3);
        linkPreview.draw(canvas);
        float f5 = 16 * f3;
        mediaEntity.additionalWidth = f5 / this.transformedWidth;
        mediaEntity.additionalHeight = f5 / this.transformedHeight;
    }

    public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        MediaController.CropState cropState;
        int i;
        int i2 = (int) (mediaEntity.width * this.transformedWidth);
        mediaEntity.W = i2;
        int i3 = (int) (mediaEntity.height * this.transformedHeight);
        mediaEntity.H = i3;
        if (i2 > 512) {
            mediaEntity.H = (int) ((i3 / i2) * 512.0f);
            mediaEntity.W = 512;
        }
        int i4 = mediaEntity.H;
        if (i4 > 512) {
            mediaEntity.W = (int) ((mediaEntity.W / i4) * 512.0f);
            mediaEntity.H = 512;
        }
        byte b = mediaEntity.subType;
        if ((b & 1) != 0) {
            int i5 = mediaEntity.W;
            if (i5 <= 0 || (i = mediaEntity.H) <= 0) {
                return;
            }
            mediaEntity.bitmap = Bitmap.createBitmap(i5, i, Bitmap.Config.ARGB_8888);
            RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, false, null, false, 0);
            mediaEntity.lottieNative = rLottieNativeCreateFromFile;
            mediaEntity.framesPerDraw = rLottieNativeCreateFromFile != null ? rLottieNativeCreateFromFile.getFps() / this.videoFps : 0.0f;
            return;
        }
        if ((b & 4) != 0) {
            mediaEntity.looped = false;
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null);
            mediaEntity.animatedFileDrawable = animatedFileDrawable;
            mediaEntity.framesPerDraw = animatedFileDrawable.getFps() / this.videoFps;
            mediaEntity.currentFrame = 1.0f;
            mediaEntity.animatedFileDrawable.getNextFrame(true);
            if (mediaEntity.type == 5) {
                mediaEntity.firstSeek = true;
                return;
            }
            return;
        }
        String str = mediaEntity.text;
        if (!TextUtils.isEmpty(mediaEntity.segmentedPath) && (mediaEntity.subType & 16) != 0) {
            str = mediaEntity.segmentedPath;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (mediaEntity.type == 2) {
            options.inMutable = true;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        mediaEntity.bitmap = bitmapDecodeFile;
        if (bitmapDecodeFile != null && (cropState = mediaEntity.crop) != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.max(1.0f, cropState.cropPw * bitmapDecodeFile.getWidth()), (int) Math.max(1.0f, mediaEntity.crop.cropPh * mediaEntity.bitmap.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
            canvas.rotate(-mediaEntity.crop.orientation);
            int width = mediaEntity.bitmap.getWidth();
            int height = mediaEntity.bitmap.getHeight();
            MediaController.CropState cropState2 = mediaEntity.crop;
            if (((cropState2.orientation + cropState2.transformRotation) / 90) % 2 == 1) {
                width = mediaEntity.bitmap.getHeight();
                height = mediaEntity.bitmap.getWidth();
            }
            MediaController.CropState cropState3 = mediaEntity.crop;
            float f = cropState3.cropPw;
            float f2 = cropState3.cropPh;
            float f3 = width;
            float f4 = height;
            canvas.clipRect(((-width) * f) / 2.0f, ((-height) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
            float f5 = mediaEntity.crop.cropScale;
            canvas.scale(f5, f5);
            MediaController.CropState cropState4 = mediaEntity.crop;
            canvas.translate(cropState4.cropPx * f3, cropState4.cropPy * f4);
            MediaController.CropState cropState5 = mediaEntity.crop;
            canvas.rotate(cropState5.cropRotate + cropState5.transformRotation);
            if (mediaEntity.crop.mirrored) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.rotate(mediaEntity.crop.orientation);
            canvas.translate((-mediaEntity.bitmap.getWidth()) / 2.0f, (-mediaEntity.bitmap.getHeight()) / 2.0f);
            canvas.drawBitmap(mediaEntity.bitmap, 0.0f, 0.0f, (Paint) null);
            mediaEntity.bitmap.recycle();
            mediaEntity.bitmap = bitmapCreateBitmap;
        }
        if (mediaEntity.type == 2 && mediaEntity.bitmap != null) {
            mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
            mediaEntity.rotation = (float) (((double) mediaEntity.rotation) - Math.toRadians(((Integer) imageOrientation.first).intValue()));
            if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                float f6 = mediaEntity.x;
                float f7 = mediaEntity.width;
                float f8 = f6 + (f7 / 2.0f);
                float f9 = mediaEntity.y;
                float f10 = mediaEntity.height;
                float f11 = f9 + (f10 / 2.0f);
                float f12 = this.transformedWidth;
                float f13 = this.transformedHeight;
                float f14 = (f7 * f12) / f13;
                float f15 = (f10 * f13) / f12;
                mediaEntity.width = f15;
                mediaEntity.height = f14;
                mediaEntity.x = f8 - (f15 / 2.0f);
                mediaEntity.y = f11 - (f14 / 2.0f);
            }
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
            return;
        }
        Bitmap bitmap = mediaEntity.bitmap;
        if (bitmap != null) {
            float width2 = bitmap.getWidth() / mediaEntity.bitmap.getHeight();
            if (width2 > 1.0f) {
                float f16 = mediaEntity.height;
                float f17 = f16 / width2;
                mediaEntity.y += (f16 - f17) / 2.0f;
                mediaEntity.height = f17;
                return;
            }
            if (width2 < 1.0f) {
                float f18 = mediaEntity.width;
                float f19 = width2 * f18;
                mediaEntity.x += (f18 - f19) / 2.0f;
                mediaEntity.width = f19;
            }
        }
    }

    private void initCollagePart(int i, VideoEditedInfo.Part part) {
        AtomicInteger atomicInteger = new AtomicInteger(part.width);
        AtomicInteger atomicInteger2 = new AtomicInteger(part.height);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (part.isVideo) {
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i]);
            part.surfaceTexture = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(part.width, part.height);
            try {
                part.player = new MediaCodecPlayer(part.path, new Surface(part.surfaceTexture));
            } catch (Exception e) {
                FileLog.e(e);
                part.player = null;
            }
            MediaCodecPlayer mediaCodecPlayer = part.player;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(part.player.getOrientedHeight());
                atomicInteger3.set(part.player.getOrientation());
            } else {
                part.surfaceTexture.release();
                part.surfaceTexture = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i);
                GLES20.glGenTextures(1, this.collageTextures, i);
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(part.path), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null);
                part.animatedFileDrawable = animatedFileDrawable;
                if (animatedFileDrawable.decoderFailed()) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                part.framesPerDraw = part.animatedFileDrawable.getFps() / this.videoFps;
                part.msPerFrame = 1000.0f / part.animatedFileDrawable.getFps();
                part.currentFrame = 1.0f;
                Bitmap nextFrame = part.animatedFileDrawable.getNextFrame(false);
                if (nextFrame != null) {
                    GLUtils.texImage2D(3553, 0, nextFrame, 0);
                }
                atomicInteger.set(part.animatedFileDrawable.getIntrinsicWidth());
                atomicInteger2.set(part.animatedFileDrawable.getIntrinsicHeight());
                atomicInteger3.set(part.animatedFileDrawable.getOrientation());
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(part.path, options);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(part.path);
            if (((Integer) imageOrientation.first).intValue() != 0 || ((Integer) imageOrientation.second).intValue() != 0) {
                Matrix matrix = new Matrix();
                if (((Integer) imageOrientation.second).intValue() != 0) {
                    matrix.postScale(((Integer) imageOrientation.second).intValue() == 1 ? -1.0f : 1.0f, ((Integer) imageOrientation.second).intValue() != 2 ? 1.0f : -1.0f);
                }
                if (((Integer) imageOrientation.first).intValue() != 0) {
                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                }
                bitmapDecodeFile = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            }
            Bitmap bitmap = bitmapDecodeFile;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            atomicInteger.set(bitmap.getWidth());
            atomicInteger2.set(bitmap.getHeight());
        }
        float[] fArr = {part.part.l(2.0f) - 1.0f, -(part.part.t(2.0f) - 1.0f), part.part.r(2.0f) - 1.0f, -(part.part.t(2.0f) - 1.0f), part.part.l(2.0f) - 1.0f, -(part.part.b(2.0f) - 1.0f), part.part.r(2.0f) - 1.0f, -(part.part.b(2.0f) - 1.0f)};
        float fW = part.part.w(this.transformedWidth);
        float fH = part.part.h(this.transformedHeight);
        int i2 = atomicInteger.get();
        int i3 = atomicInteger2.get();
        int i4 = atomicInteger3.get();
        float f = i2;
        float f2 = i3;
        float fMax = 1.0f / Math.max(fW / f, fH / f2);
        float f3 = ((fW * fMax) / f) / 2.0f;
        float f4 = ((fH * fMax) / f2) / 2.0f;
        if ((i4 / 90) % 2 != 1) {
            f4 = f3;
            f3 = f4;
        }
        float f5 = 0.5f - f4;
        float f6 = 0.5f - f3;
        float f7 = f4 + 0.5f;
        float f8 = f3 + 0.5f;
        float[] fArr2 = {f5, f6, f7, f6, f5, f8, f7, f8};
        while (i4 > 0) {
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f9;
            fArr2[3] = f10;
            i4 -= 90;
        }
        while (i4 < 0) {
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f11;
            fArr2[5] = f12;
            i4 += 90;
        }
        part.posBuffer = floats(fArr);
        part.uvBuffer = floats(fArr2);
    }

    private void destroyCollagePart(int i, VideoEditedInfo.Part part) {
        if (part == null) {
            return;
        }
        AnimatedFileDrawable animatedFileDrawable = part.animatedFileDrawable;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.recycle();
            part.animatedFileDrawable = null;
        }
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.release();
            part.player = null;
        }
        SurfaceTexture surfaceTexture = part.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            part.surfaceTexture = null;
        }
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr).position(0);
        return floatBufferAsFloatBuffer;
    }

    private void stepCollagePart(int i, VideoEditedInfo.Part part, long j) {
        float f;
        Bitmap nextFrame;
        long progressMs;
        long j2 = (j / 1000000) - part.offset;
        float f2 = part.right;
        float f3 = part.duration;
        long jClamp = Utilities.clamp(j2, (long) (f2 * f3), (long) (part.left * f3));
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(jClamp);
            part.surfaceTexture.updateTexImage();
            return;
        }
        AnimatedFileDrawable animatedFileDrawable = part.animatedFileDrawable;
        if (animatedFileDrawable != null) {
            boolean z = animatedFileDrawable.getProgressMs() <= 0;
            if (jClamp < part.animatedFileDrawable.getProgressMs() || (z && jClamp > 1000)) {
                part.animatedFileDrawable.seekToSync(jClamp);
            }
            do {
                f = jClamp;
                if (part.animatedFileDrawable.getProgressMs() + (part.msPerFrame * 2.0f) >= f) {
                    break;
                }
                progressMs = part.animatedFileDrawable.getProgressMs();
                part.animatedFileDrawable.skipNextFrame(false);
            } while (part.animatedFileDrawable.getProgressMs() != progressMs);
            if ((z || f > part.animatedFileDrawable.getProgressMs() - (part.msPerFrame / 2.0f)) && (nextFrame = part.animatedFileDrawable.getNextFrame(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLUtils.texImage2D(3553, 0, nextFrame, 0);
            }
        }
    }

    private void drawCollagePart(int i, VideoEditedInfo.Part part, long j) {
        if (part.player != null && part.isVideo) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) part.posBuffer);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) part.posBuffer);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private int createProgram(String str, String str2, boolean z) {
        int iLoadShader;
        int iGlCreateProgram;
        int iLoadShader2;
        int iGlCreateProgram2;
        if (z) {
            int iLoadShader3 = FilterShaders.loadShader(35633, str);
            if (iLoadShader3 == 0 || (iLoadShader2 = FilterShaders.loadShader(35632, str2)) == 0 || (iGlCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(iGlCreateProgram2, iLoadShader3);
            GLES20.glAttachShader(iGlCreateProgram2, iLoadShader2);
            GLES20.glLinkProgram(iGlCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram2, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return iGlCreateProgram2;
            }
            GLES20.glDeleteProgram(iGlCreateProgram2);
            return 0;
        }
        int iLoadShader4 = FilterShaders.loadShader(35633, str);
        if (iLoadShader4 == 0 || (iLoadShader = FilterShaders.loadShader(35632, str2)) == 0 || (iGlCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader4);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public void release() {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i);
                RLottieNative rLottieNative = mediaEntity.lottieNative;
                if (rLottieNative != null) {
                    rLottieNative.recycle();
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
        ArrayList<VideoEditedInfo.Part> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                arrayList2.get(i2);
                i2++;
                for (int i3 = 0; i3 < this.collageParts.size(); i3++) {
                    destroyCollagePart(i3, this.collageParts.get(i3));
                }
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        String str3;
        int iCreateProgram;
        int iCreateProgram2;
        if (this.messageVideoMaskPath != null) {
            str3 = z ? "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n" : "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
        } else {
            str3 = z ? "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n" : "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        int i = this.NUM_EXTERNAL_SHADER;
        if (i >= 0 && i < this.mProgram.length && (iCreateProgram2 = createProgram(str3, str, z)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = iCreateProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(iCreateProgram2, "texSize");
        }
        int i2 = this.NUM_FILTER_SHADER;
        if (i2 < 0 || i2 >= this.mProgram.length || (iCreateProgram = createProgram(str3, str2, z)) == 0) {
            return;
        }
        GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
        this.mProgram[this.NUM_FILTER_SHADER] = iCreateProgram;
    }
}
