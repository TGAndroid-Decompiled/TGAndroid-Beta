package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
public abstract class xxe {
    public static int a(MediaExtractor mediaExtractor) {
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null && string.startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    public static int b(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, np9 np9Var, long j, long j2, op9 op9Var) {
        long j3;
        boolean z;
        long j4;
        long j5;
        boolean z2;
        boolean z3;
        long j6;
        boolean z4;
        boolean z5;
        int i;
        int dequeueOutputBuffer;
        boolean z6;
        int dequeueInputBuffer;
        int i2;
        int readSampleData;
        MediaCodec mediaCodec3 = mediaCodec;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int i3 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z7 = false;
        int i4 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i5 = 0;
        while (!z7) {
            if (!z8 && (dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(10000L)) >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                    i2 = 1;
                } else {
                    i2 = i3;
                }
                if (sampleTime >= 0 && (sampleTime < j2 || i2 == 0)) {
                    ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer == null) {
                        readSampleData = -1;
                    } else {
                        readSampleData = mediaExtractor.readSampleData(inputBuffer, i3);
                    }
                    if (readSampleData < 0) {
                        j3 = elapsedRealtime;
                        z = z7;
                        j5 = 0;
                        j4 = 10000;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        mediaCodec3 = mediaCodec;
                    } else {
                        j3 = elapsedRealtime;
                        z = z7;
                        j5 = 0;
                        j4 = 10000;
                        mediaCodec3 = mediaCodec;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                        mediaExtractor.advance();
                        z2 = true;
                    }
                } else {
                    j3 = elapsedRealtime;
                    z = z7;
                    j5 = 0;
                    j4 = 10000;
                    mediaCodec3 = mediaCodec;
                    mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                }
                z8 = true;
                z2 = true;
            } else {
                j3 = elapsedRealtime;
                z = z7;
                j4 = 10000;
                j5 = 0;
                z2 = false;
            }
            if (!z9 && (dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, j4)) >= 0) {
                long j7 = bufferInfo.presentationTimeUs;
                if (bufferInfo.size > 0 && j7 >= j && j7 < j2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, z6);
                if (z6) {
                    synchronized (np9Var.b) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 2500;
                        while (!np9Var.m) {
                            long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (elapsedRealtime3 > j5) {
                                try {
                                    np9Var.b.wait(elapsedRealtime3);
                                    j5 = 0;
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    throw new IOException("Video re-encoding was interrupted", e);
                                }
                            } else {
                                throw new IOException("Decoded frame did not arrive");
                            }
                        }
                        np9Var.m = false;
                    }
                    np9Var.k.updateTexImage();
                    np9Var.k.getTransformMatrix(np9Var.c);
                    short s = np9Var.a;
                    GLES20.glViewport(0, 0, s, s);
                    GLES20.glUseProgram(np9Var.i);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, np9Var.j);
                    int glGetAttribLocation = GLES20.glGetAttribLocation(np9Var.i, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(np9Var.i, "aTextureCoord");
                    FloatBuffer floatBuffer = np9Var.d;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, (Buffer) np9Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    floatBuffer.position(2);
                    GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 16, (Buffer) np9Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                    z3 = true;
                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(np9Var.i, "uTextureMatrix"), 1, false, np9Var.c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    EGLExt.eglPresentationTimeANDROID(np9Var.f, np9Var.h, j7 * 1000);
                    if (!EGL14.eglSwapBuffers(np9Var.f, np9Var.h)) {
                        lq5.o(Integer.toHexString(EGL14.eglGetError()), "eglSwapBuffers failed: 0x");
                        return 0;
                    }
                } else {
                    z3 = true;
                }
                if ((bufferInfo.flags & 4) != 0) {
                    mediaCodec2.signalEndOfInputStream();
                    z9 = z3;
                }
                z2 = z3;
            } else {
                z3 = true;
            }
            if (z9) {
                j6 = 10000;
            } else {
                j6 = 0;
            }
            int dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, j6);
            int i6 = i5;
            z7 = z;
            while (dequeueOutputBuffer2 != -1) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                    i6 = rn9.f(outputFormat);
                    op9Var.o(outputFormat);
                } else if (dequeueOutputBuffer2 >= 0) {
                    ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(dequeueOutputBuffer2);
                    int i7 = bufferInfo2.flags;
                    if ((i7 & 2) != 0) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    if (outputBuffer != null && (i = bufferInfo2.size) > 0 && !z4) {
                        if (i6 > 0 && (i7 & 1) != 0 && i > i6) {
                            bufferInfo2.offset += i6;
                            bufferInfo2.size = i - i6;
                        }
                        op9Var.k(outputBuffer, bufferInfo2);
                        i4++;
                    }
                    if ((bufferInfo2.flags & 4) != 0) {
                        z5 = z3;
                    } else {
                        z5 = false;
                    }
                    mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                    z7 = z5;
                    if (z5) {
                        break;
                    }
                }
                dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                z2 = z3;
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            if (z2) {
                elapsedRealtime = elapsedRealtime4;
            } else if (elapsedRealtime4 - j3 <= 5000) {
                elapsedRealtime = j3;
            } else {
                su3.e("Video re-encoding stalled");
                return 0;
            }
            i5 = i6;
            i3 = 0;
        }
        return i4;
    }

    public static void c(java.io.File r3, long r4, long r6, long r8, int r10, int r11, int r12, defpackage.op9 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxe.c(java.io.File, long, long, long, int, int, int, op9):void");
    }
}
