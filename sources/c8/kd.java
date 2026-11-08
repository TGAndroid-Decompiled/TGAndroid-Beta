package c8;

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
public abstract class kd {
    public static int a(MediaExtractor mediaExtractor) {
        for (int i7 = 0; i7 < mediaExtractor.getTrackCount(); i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (string != null && string.startsWith("video/")) {
                return i7;
            }
        }
        return -1;
    }

    public static int b(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, wi.v0 v0Var, long j3, long j10, wi.w0 w0Var) {
        long j11;
        boolean z9;
        long j12;
        long j13;
        boolean z10;
        boolean z11;
        long j14;
        int i7;
        boolean z12;
        boolean z13;
        int i10;
        int dequeueOutputBuffer;
        boolean z14;
        int dequeueInputBuffer;
        int i11;
        int readSampleData;
        MediaCodec mediaCodec3 = mediaCodec;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int i12 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z15 = false;
        int i13 = 0;
        boolean z16 = false;
        boolean z17 = false;
        int i14 = 0;
        while (!z15) {
            if (!z16 && (dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(10000L)) >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                    i11 = 1;
                } else {
                    i11 = i12;
                }
                if (sampleTime < 0 || (sampleTime >= j10 && i11 != 0)) {
                    j11 = elapsedRealtime;
                    z9 = z15;
                    j13 = 0;
                    j12 = 10000;
                    mediaCodec3 = mediaCodec;
                    mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                } else {
                    ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer == null) {
                        readSampleData = -1;
                    } else {
                        readSampleData = mediaExtractor.readSampleData(inputBuffer, i12);
                    }
                    if (readSampleData < 0) {
                        j11 = elapsedRealtime;
                        z9 = z15;
                        j13 = 0;
                        j12 = 10000;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        mediaCodec3 = mediaCodec;
                    } else {
                        j11 = elapsedRealtime;
                        z9 = z15;
                        j13 = 0;
                        j12 = 10000;
                        mediaCodec3 = mediaCodec;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                        mediaExtractor.advance();
                        z10 = true;
                    }
                }
                z16 = true;
                z10 = true;
            } else {
                j11 = elapsedRealtime;
                z9 = z15;
                j12 = 10000;
                j13 = 0;
                z10 = false;
            }
            if (!z17 && (dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, j12)) >= 0) {
                long j15 = bufferInfo.presentationTimeUs;
                if (bufferInfo.size > 0 && j15 >= j3 && j15 < j10) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, z14);
                if (z14) {
                    synchronized (v0Var.f58226b) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 2500;
                        while (!v0Var.f58235m) {
                            long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (elapsedRealtime3 > j13) {
                                try {
                                    v0Var.f58226b.wait(elapsedRealtime3);
                                    j13 = 0;
                                } catch (InterruptedException e10) {
                                    Thread.currentThread().interrupt();
                                    throw new IOException("Video re-encoding was interrupted", e10);
                                }
                            } else {
                                throw new IOException("Decoded frame did not arrive");
                            }
                        }
                        v0Var.f58235m = false;
                    }
                    v0Var.f58233k.updateTexImage();
                    v0Var.f58233k.getTransformMatrix(v0Var.f58227c);
                    int i15 = v0Var.f58225a;
                    GLES20.glViewport(0, 0, i15, i15);
                    GLES20.glUseProgram(v0Var.f58231i);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, v0Var.f58232j);
                    int glGetAttribLocation = GLES20.glGetAttribLocation(v0Var.f58231i, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(v0Var.f58231i, "aTextureCoord");
                    FloatBuffer floatBuffer = v0Var.d;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, (Buffer) v0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    floatBuffer.position(2);
                    GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 16, (Buffer) v0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                    z11 = true;
                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(v0Var.f58231i, "uTextureMatrix"), 1, false, v0Var.f58227c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    EGLExt.eglPresentationTimeANDROID(v0Var.f58229f, v0Var.h, j15 * 1000);
                    if (!EGL14.eglSwapBuffers(v0Var.f58229f, v0Var.h)) {
                        throw new IllegalStateException("eglSwapBuffers failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    }
                } else {
                    z11 = true;
                }
                if ((bufferInfo.flags & 4) != 0) {
                    mediaCodec2.signalEndOfInputStream();
                    z17 = z11;
                }
                z10 = z11;
            } else {
                z11 = true;
            }
            if (z17) {
                j14 = 10000;
            } else {
                j14 = 0;
            }
            int dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, j14);
            int i16 = i14;
            z15 = z9;
            while (true) {
                if (dequeueOutputBuffer2 != -1) {
                    if (dequeueOutputBuffer2 == -2) {
                        MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                        i16 = wi.n.f(outputFormat);
                        w0Var.w(outputFormat);
                    } else if (dequeueOutputBuffer2 >= 0) {
                        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(dequeueOutputBuffer2);
                        int i17 = bufferInfo2.flags;
                        if ((i17 & 2) != 0) {
                            z12 = z11;
                        } else {
                            z12 = false;
                        }
                        if (outputBuffer != null && (i10 = bufferInfo2.size) > 0 && !z12) {
                            if (i16 > 0 && (i17 & 1) != 0 && i10 > i16) {
                                bufferInfo2.offset += i16;
                                bufferInfo2.size = i10 - i16;
                            }
                            w0Var.r(outputBuffer, bufferInfo2);
                            i13++;
                        }
                        if ((bufferInfo2.flags & 4) != 0) {
                            z13 = z11;
                        } else {
                            z13 = false;
                        }
                        i7 = 0;
                        mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        z15 = z13;
                        if (z13) {
                            break;
                        }
                        dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                        z10 = z11;
                    }
                    dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                    z10 = z11;
                } else {
                    i7 = 0;
                    break;
                }
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            if (z10) {
                elapsedRealtime = elapsedRealtime4;
            } else if (elapsedRealtime4 - j11 <= 5000) {
                elapsedRealtime = j11;
            } else {
                throw new IOException("Video re-encoding stalled");
            }
            i14 = i16;
            i12 = i7;
        }
        return i13;
    }

    public static void c(java.io.File r3, long r4, long r6, long r8, int r10, int r11, int r12, wi.w0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: c8.kd.c(java.io.File, long, long, long, int, int, int, wi.w0):void");
    }
}
