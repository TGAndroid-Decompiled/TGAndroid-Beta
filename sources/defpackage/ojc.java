package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import org.webrtc.GlUtil;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
public final class ojc implements Runnable {
    public final byte a;
    public final rjc b;

    public ojc(rjc rjcVar, byte b) {
        this.a = b;
        this.b = rjcVar;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        int rotatedWidth;
        int rotatedHeight;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z3;
        EGLSurface eGLSurface;
        byte b = this.a;
        rjc rjcVar = this.b;
        switch (b) {
            case 0:
                synchronized (rjcVar.y) {
                    VideoFrame videoFrame = rjcVar.E;
                    if (videoFrame != null) {
                        rjcVar.E = null;
                        njc njcVar = rjcVar.r;
                        if (njcVar != null && njcVar.hasSurface()) {
                            synchronized (rjcVar.f) {
                                long j = rjcVar.n;
                                if (j != Long.MAX_VALUE) {
                                    if (j > 0) {
                                        long nanoTime = System.nanoTime();
                                        long j2 = rjcVar.h;
                                        if (nanoTime >= j2) {
                                            long j3 = j2 + rjcVar.n;
                                            rjcVar.h = j3;
                                            rjcVar.h = Math.max(j3, nanoTime);
                                        }
                                    }
                                    z = true;
                                }
                                z = false;
                            }
                            System.nanoTime();
                            if (Math.abs(rjcVar.I) != 90 && Math.abs(rjcVar.I) != 270) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                rotatedWidth = videoFrame.getRotatedHeight();
                            } else {
                                rotatedWidth = videoFrame.getRotatedWidth();
                            }
                            float f5 = rotatedWidth;
                            if (z2) {
                                rotatedHeight = videoFrame.getRotatedWidth();
                            } else {
                                rotatedHeight = videoFrame.getRotatedHeight();
                            }
                            float f6 = f5 / rotatedHeight;
                            synchronized (rjcVar.F) {
                                f = rjcVar.G;
                                if (f == 0.0f) {
                                    f = f6;
                                }
                            }
                            if (f6 > f) {
                                f3 = f / f6;
                                f2 = 1.0f;
                            } else {
                                f2 = f6 / f;
                                f3 = 1.0f;
                            }
                            rjcVar.x.reset();
                            rjcVar.x.preTranslate(0.5f, 0.5f);
                            rjcVar.x.preRotate(rjcVar.I);
                            Matrix matrix = rjcVar.x;
                            if (rjcVar.H) {
                                f4 = -1.0f;
                            } else {
                                f4 = 1.0f;
                            }
                            matrix.preScale(f4, 1.0f);
                            rjcVar.x.preScale(f3, f2);
                            rjcVar.x.preTranslate(-0.5f, -0.5f);
                            if (z) {
                                try {
                                    try {
                                        rjcVar.s.a(videoFrame, rjcVar.w, rjcVar.x, rjcVar.r.surfaceWidth(), rjcVar.r.surfaceHeight(), z2, false);
                                        njc njcVar2 = rjcVar.r;
                                        EGLSurface eGLSurface2 = njcVar2.e;
                                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            njcVar2.c(eGLSurface2);
                                            rjcVar.s.a(videoFrame, rjcVar.w, rjcVar.x, rjcVar.r.surfaceWidth(), rjcVar.r.surfaceHeight(), z2, true);
                                            rjcVar.r.e(true);
                                            rjcVar.r.makeCurrent();
                                        }
                                        System.nanoTime();
                                        rjcVar.r.e(false);
                                        if (!rjcVar.a) {
                                            rjcVar.a = true;
                                            hl.c3(new s8b((anb) rjcVar, (byte) 19));
                                        }
                                    } catch (GlUtil.GlOutOfMemoryException e) {
                                        Logging.e("VoIPEglRenderer", rjcVar.b + "Error while drawing frame", e);
                                        rjcVar.w.d();
                                        nmc nmcVar = rjcVar.s;
                                        mmc mmcVar = nmcVar.d;
                                        mmcVar.a = null;
                                        int[] iArr = mmcVar.b;
                                        if (iArr != null) {
                                            GLES20.glDeleteTextures(3, iArr, 0);
                                            mmcVar.b = null;
                                        }
                                        nmcVar.e = null;
                                        rjcVar.J.release();
                                    }
                                } finally {
                                    videoFrame.release();
                                }
                            }
                            rjcVar.d(z);
                            return;
                        }
                        rjcVar.c("Dropping frame - No surface");
                        return;
                    }
                    return;
                }
            default:
                njc njcVar3 = rjcVar.r;
                if (njcVar3 != null && njcVar3.hasSurface()) {
                    rjcVar.c("clearSurface");
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    rjcVar.r.e(false);
                }
                njc njcVar4 = rjcVar.r;
                if (njcVar4 != null && (eGLSurface = njcVar4.e) != EGL14.EGL_NO_SURFACE) {
                    njcVar4.c(eGLSurface);
                    rjcVar.c("clearSurface in background");
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    rjcVar.r.e(true);
                    rjcVar.r.makeCurrent();
                    return;
                }
                return;
        }
    }
}
