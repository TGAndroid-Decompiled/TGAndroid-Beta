package defpackage;

import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.GlUtil;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;
public final class nmc {
    public static final float[] g = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public int b;
    public int c;
    public VideoFrame e;
    public final float[] a = new float[6];
    public final mmc d = new Object();
    public final Matrix f = new Matrix();

    public final void a(VideoFrame videoFrame, nkc nkcVar, Matrix matrix, int i, int i2, boolean z, boolean z2) {
        int rotatedWidth;
        int rotatedHeight;
        int i3;
        int i4;
        int i5;
        int i6;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i7;
        int i8;
        int i9;
        int i10;
        if (z) {
            rotatedWidth = videoFrame.getRotatedHeight();
            rotatedHeight = videoFrame.getRotatedWidth();
        } else {
            rotatedWidth = videoFrame.getRotatedWidth();
            rotatedHeight = videoFrame.getRotatedHeight();
        }
        float[] fArr = g;
        float[] fArr2 = this.a;
        matrix.mapPoints(fArr2, fArr);
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = i11 << 1;
            fArr2[i12] = fArr2[i12] * rotatedWidth;
            int i13 = i12 + 1;
            fArr2[i13] = fArr2[i13] * rotatedHeight;
        }
        this.b = (int) Math.round(Math.hypot(fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]));
        int round = (int) Math.round(Math.hypot(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1]));
        this.c = round;
        if (this.b > 0 && round > 0) {
            boolean z3 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            Matrix matrix2 = this.f;
            matrix2.reset();
            matrix2.preTranslate(0.5f, 0.5f);
            if (!z3) {
                matrix2.preScale(1.0f, -1.0f);
            }
            matrix2.preRotate(videoFrame.getRotation());
            matrix2.preTranslate(-0.5f, -0.5f);
            matrix2.preConcat(matrix);
            if (z3) {
                this.e = null;
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
                int rotatedWidth2 = videoFrame.getRotatedWidth();
                int rotatedHeight2 = videoFrame.getRotatedHeight();
                Matrix matrix3 = new Matrix(textureBuffer.getTransformMatrix());
                matrix3.preConcat(matrix2);
                float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix3);
                int i14 = lmc.a[textureBuffer.getType().ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        int textureId = textureBuffer.getTextureId();
                        textureBuffer.getWidth();
                        textureBuffer.getHeight();
                        nkcVar.c(1, convertMatrixFromAndroidGraphicsMatrix, rotatedWidth2, rotatedHeight2, 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, textureId);
                        GLES20.glViewport(0, 0, i, i2);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glBindTexture(3553, 0);
                        return;
                    }
                    xi4.l("Unknown texture type.");
                    return;
                }
                int textureId2 = textureBuffer.getTextureId();
                int width = textureBuffer.getWidth();
                int height = textureBuffer.getHeight();
                int[] iArr = nkcVar.f;
                if (z2) {
                    nkcVar.b(width, height, 1);
                    nkcVar.k = convertMatrixFromAndroidGraphicsMatrix;
                    float f = nkcVar.l;
                    int i15 = (int) (width / f);
                    int i16 = (int) (height / f);
                    GLES20.glViewport(0, 0, i15, i16);
                    nkcVar.c(0, nkcVar.h, rotatedWidth2, rotatedHeight2, 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, textureId2);
                    GLES20.glBindFramebuffer(36160, nkcVar.g[1]);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glBindTexture(36197, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    if (rotatedWidth2 != width) {
                        i16 = i15;
                        i15 = i16;
                    }
                    nkcVar.b(width, height, 0);
                    float[] fArr3 = nkcVar.h;
                    if (rotatedWidth2 != width) {
                        i8 = i15;
                        i7 = i16;
                    } else {
                        i7 = i15;
                        i8 = i16;
                    }
                    nkcVar.c(1, fArr3, i7, i8, 1);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, iArr[1]);
                    GLES20.glBindFramebuffer(36160, nkcVar.g[0]);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glViewport(0, 0, i, i2);
                    if (rotatedWidth2 != width) {
                        i10 = i15;
                        i9 = i16;
                    } else {
                        i9 = i15;
                        i10 = i16;
                    }
                    nkcVar.c(1, convertMatrixFromAndroidGraphicsMatrix, i9, i10, 2);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, iArr[0]);
                    GLES20.glDrawArrays(5, 0, 4);
                    return;
                }
                nkcVar.c(0, convertMatrixFromAndroidGraphicsMatrix, rotatedWidth2, rotatedHeight2, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, textureId2);
                GLES20.glViewport(0, 0, i, i2);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindTexture(36197, 0);
                return;
            }
            VideoFrame videoFrame2 = this.e;
            mmc mmcVar = this.d;
            if (videoFrame != videoFrame2) {
                this.e = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                int[] iArr2 = {i420.getStrideY(), i420.getStrideU(), i420.getStrideV()};
                ByteBuffer[] byteBufferArr = {i420.getDataY(), i420.getDataU(), i420.getDataV()};
                int width2 = i420.getWidth();
                int height2 = i420.getHeight();
                int i17 = width2 / 2;
                int[] iArr3 = {width2, i17, i17};
                int i18 = height2 / 2;
                int[] iArr4 = {height2, i18, i18};
                int i19 = 0;
                for (int i20 = 0; i20 < 3; i20++) {
                    int i21 = iArr2[i20];
                    int i22 = iArr3[i20];
                    if (i21 > i22) {
                        i19 = Math.max(i19, i22 * iArr4[i20]);
                    }
                }
                if (i19 > 0 && ((byteBuffer2 = mmcVar.a) == null || byteBuffer2.capacity() < i19)) {
                    mmcVar.a = ByteBuffer.allocateDirect(i19);
                }
                if (mmcVar.b == null) {
                    mmcVar.b = new int[3];
                    for (int i23 = 0; i23 < 3; i23++) {
                        mmcVar.b[i23] = GlUtil.generateTexture(3553);
                    }
                }
                for (int i24 = 0; i24 < 3; i24++) {
                    GLES20.glActiveTexture(i24 + 33984);
                    GLES20.glBindTexture(3553, mmcVar.b[i24]);
                    int i25 = iArr2[i24];
                    int i26 = iArr3[i24];
                    if (i25 == i26) {
                        byteBuffer = byteBufferArr[i24];
                    } else {
                        YuvHelper.copyPlane(byteBufferArr[i24], i25, mmcVar.a, i26, i26, iArr4[i24]);
                        byteBuffer = mmcVar.a;
                    }
                    GLES20.glTexImage2D(3553, 0, 6409, iArr3[i24], iArr4[i24], 0, 6409, 5121, byteBuffer);
                }
                i420.release();
            }
            int[] iArr5 = mmcVar.b;
            int width3 = videoFrame.getBuffer().getWidth();
            int height3 = videoFrame.getBuffer().getHeight();
            int rotatedWidth3 = videoFrame.getRotatedWidth();
            int rotatedHeight3 = videoFrame.getRotatedHeight();
            float[] convertMatrixFromAndroidGraphicsMatrix2 = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
            int[] iArr6 = nkcVar.f;
            if (z2 && width3 > 0 && height3 > 0) {
                nkcVar.k = convertMatrixFromAndroidGraphicsMatrix2;
                nkcVar.b(width3, height3, 1);
                float f2 = nkcVar.l;
                int i27 = (int) (width3 / f2);
                int i28 = (int) (height3 / f2);
                GLES20.glViewport(0, 0, i27, i28);
                nkcVar.c(2, nkcVar.h, rotatedWidth3, rotatedHeight3, 0);
                for (int i29 = 0; i29 < 3; i29++) {
                    GLES20.glActiveTexture(i29 + 33984);
                    GLES20.glBindTexture(3553, iArr5[i29]);
                }
                int i30 = 3553;
                GLES20.glBindFramebuffer(36160, nkcVar.g[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr6[1], 0);
                GLES20.glDrawArrays(5, 0, 4);
                int i31 = 0;
                while (i31 < 3) {
                    GLES20.glActiveTexture(i31 + 33984);
                    GLES20.glBindTexture(i30, 0);
                    i31++;
                    i30 = 3553;
                }
                GLES20.glBindFramebuffer(36160, 0);
                if (rotatedWidth3 != width3) {
                    i28 = i27;
                    i27 = i28;
                }
                nkcVar.b(width3, height3, 0);
                float[] fArr4 = nkcVar.h;
                if (rotatedWidth3 != width3) {
                    i4 = i27;
                    i3 = i28;
                } else {
                    i3 = i27;
                    i4 = i28;
                }
                nkcVar.c(1, fArr4, i3, i4, 1);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr6[1]);
                GLES20.glBindFramebuffer(36160, nkcVar.g[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr6[0], 0);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, i, i2);
                if (rotatedWidth3 != width3) {
                    i6 = i27;
                    i5 = i28;
                } else {
                    i5 = i27;
                    i6 = i28;
                }
                nkcVar.c(1, convertMatrixFromAndroidGraphicsMatrix2, i5, i6, 2);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr6[0]);
                GLES20.glDrawArrays(5, 0, 4);
                return;
            }
            nkcVar.c(2, convertMatrixFromAndroidGraphicsMatrix2, rotatedWidth3, rotatedHeight3, 0);
            for (int i32 = 0; i32 < 3; i32++) {
                GLES20.glActiveTexture(i32 + 33984);
                GLES20.glBindTexture(3553, iArr5[i32]);
            }
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glDrawArrays(5, 0, 4);
            for (int i33 = 0; i33 < 3; i33++) {
                GLES20.glActiveTexture(i33 + 33984);
                GLES20.glBindTexture(3553, 0);
            }
            return;
        }
        Logging.w("VoIPVideoFrameDrawer", "Illegal frame size: " + this.b + "x" + this.c);
    }
}
