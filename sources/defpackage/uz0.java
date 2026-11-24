package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class uz0 implements oec {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public uz0(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public final t6a a(q8a q8aVar) {
        t6a t6aVar;
        synchronized (this.c) {
            int d = d();
            t6aVar = new t6a(d, q8aVar);
            if (this.b) {
                t6aVar.o();
            } else {
                ((qt) this.d).put(Integer.valueOf(d), t6aVar);
            }
        }
        return t6aVar;
    }

    public final void b(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = pec.g0;
        if (i == 2) {
            Drawable[] drawableArr = PhotoViewer.d9;
            photoViewer.m();
            boolean z = true;
            if (photoViewer.d2 == 1) {
                photoViewer.k();
                photoViewer.a8 = -1L;
            }
            ya8 ya8Var = photoViewer.g0;
            if (ya8Var != null && ya8Var.y) {
                z = ya8Var.H;
            } else {
                ndc ndcVar = photoViewer.G2;
                if (ndcVar == null || !ndcVar.c0()) {
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
        q78 q78Var = (q78) this.c;
        if (q78Var != null) {
            gm.r(q78Var);
            ((q78) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.m();
        int i2 = photoViewer.d2;
        if (i2 == 1 && photoViewer.A2 != null) {
            Object obj = pec.g0;
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
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null) {
            return;
        }
        if (ndcVar.c0()) {
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
        if (gda.o() == 2) {
            photoViewer.C1(this.a);
            if (photoViewer.d2 == 1) {
                long j = this.a;
                photoViewer.c8 = j;
                if (photoViewer.b8 != j) {
                    photoViewer.b8 = -1L;
                }
            }
            this.c = null;
        } else if (((q78) this.c) == null) {
            q78 q78Var = new q78(this, (byte) 2);
            this.c = q78Var;
            gm.d3(q78Var, 100L);
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
