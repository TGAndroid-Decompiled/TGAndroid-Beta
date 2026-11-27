package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class vy0 implements lgc {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public vy0(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public final j8a a(gaa gaaVar) {
        j8a j8aVar;
        synchronized (this.c) {
            int d = d();
            j8aVar = new j8a(d, gaaVar);
            if (this.b) {
                j8aVar.o();
            } else {
                ((qs) this.d).put(Integer.valueOf(d), j8aVar);
            }
        }
        return j8aVar;
    }

    public final void b(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = mgc.g0;
        if (i == 2) {
            Drawable[] drawableArr = PhotoViewer.d9;
            photoViewer.m();
            boolean z = true;
            if (photoViewer.d2 == 1) {
                photoViewer.k();
                photoViewer.a8 = -1L;
            }
            nc8 nc8Var = photoViewer.g0;
            if (nc8Var != null && nc8Var.y) {
                z = nc8Var.H;
            } else {
                kfc kfcVar = photoViewer.G2;
                if (kfcVar == null || !kfcVar.c0()) {
                    z = false;
                }
            }
            this.b = z;
            if (z) {
                photoViewer.H2 = false;
                photoViewer.p1();
                photoViewer.f0.invalidate();
            }
        }
    }

    public final void c(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        x38 x38Var = (x38) this.c;
        if (x38Var != null) {
            hl.r(x38Var);
            ((x38) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.m();
        int i2 = photoViewer.d2;
        if (i2 == 1 && photoViewer.A2 != null) {
            Object obj = mgc.g0;
            if (i == 2) {
                photoViewer.k();
                photoViewer.a8 = photoViewer.A8;
                if (photoViewer.b8 == this.a) {
                    photoViewer.n();
                    return;
                }
                return;
            }
        }
        if (i2 != 1 && !this.b) {
            return;
        }
        photoViewer.H2 = false;
        photoViewer.r1();
    }

    public final int d() {
        int i;
        synchronized (this.c) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public final void e(float f) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null) {
            return;
        }
        if (kfcVar.c0()) {
            photoViewer.H2 = false;
            photoViewer.G2.f0();
            photoViewer.f0.invalidate();
        }
        g(2);
        f(f);
        photoViewer.q3.h(false, 1.0f);
        photoViewer.X7.setProgress(f);
        photoViewer.P2();
    }

    public final void f(float f) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.n8 * f);
        if (xea.o() == 2) {
            photoViewer.C1(this.a);
            if (photoViewer.d2 == 1) {
                long j = this.a;
                photoViewer.c8 = j;
                if (photoViewer.b8 != j) {
                    photoViewer.b8 = -1L;
                }
            }
            this.c = null;
        } else if (((x38) this.c) == null) {
            x38 x38Var = new x38(this, (byte) 10);
            this.c = x38Var;
            hl.d3(x38Var, 100L);
        }
    }

    public final void g(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.d2 == 1) {
            if (i != 0) {
                if (photoViewer.D1 != null) {
                    if (photoViewer.X7.getLeftProgress() > photoViewer.B8 || photoViewer.X7.getRightProgress() < photoViewer.B8) {
                        photoViewer.D1.setVideoThumbVisible(false);
                        float f = photoViewer.n8 * 1000.0f;
                        if (i == 1) {
                            photoViewer.A8 = photoViewer.X7.getLeftProgress() * f;
                        } else {
                            photoViewer.A8 = photoViewer.X7.getRightProgress() * f;
                        }
                        photoViewer.a8 = -1L;
                        return;
                    }
                    return;
                }
                return;
            }
            float progress = photoViewer.X7.getProgress();
            photoViewer.B8 = progress;
            photoViewer.A8 = photoViewer.n8 * 1000.0f * progress;
        }
    }
}
