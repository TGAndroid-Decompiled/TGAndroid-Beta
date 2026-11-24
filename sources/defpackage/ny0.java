package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class ny0 implements ncc {
    public int a;
    public boolean b;
    public Object c;
    public Object d;

    public ny0(PhotoViewer photoViewer) {
        this.d = photoViewer;
    }

    public final r4a a(o6a o6aVar) {
        r4a r4aVar;
        synchronized (this.c) {
            int d = d();
            r4aVar = new r4a(d, o6aVar);
            if (this.b) {
                r4aVar.o();
            } else {
                ((ps) this.d).put(Integer.valueOf(d), r4aVar);
            }
        }
        return r4aVar;
    }

    public final void b(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        Object obj = occ.g0;
        if (i == 2) {
            Drawable[] drawableArr = PhotoViewer.f9;
            photoViewer.n();
            boolean z = true;
            if (photoViewer.d2 == 1) {
                photoViewer.l();
                photoViewer.b8 = -1L;
            }
            x88 x88Var = photoViewer.g0;
            if (x88Var != null && x88Var.y) {
                z = x88Var.H;
            } else {
                lbc lbcVar = photoViewer.G2;
                if (lbcVar == null || !lbcVar.c0()) {
                    z = false;
                }
            }
            this.b = z;
            if (z) {
                photoViewer.H2 = false;
                photoViewer.o1();
                photoViewer.f0.invalidate();
            }
        }
    }

    public final void c(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        oq7 oq7Var = (oq7) this.c;
        if (oq7Var != null) {
            gl.r(oq7Var);
            ((oq7) this.c).run();
        }
        Drawable[] drawableArr = PhotoViewer.f9;
        photoViewer.n();
        int i2 = photoViewer.d2;
        if (i2 == 1 && photoViewer.A2 != null) {
            Object obj = occ.g0;
            if (i == 2) {
                photoViewer.l();
                photoViewer.b8 = photoViewer.B8;
                if (photoViewer.c8 == this.a) {
                    photoViewer.o();
                    return;
                }
                return;
            }
        }
        if (i2 != 1 && !this.b) {
            return;
        }
        photoViewer.H2 = false;
        photoViewer.q1();
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
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null) {
            return;
        }
        if (lbcVar.c0()) {
            photoViewer.H2 = false;
            photoViewer.G2.f0();
            photoViewer.f0.invalidate();
        }
        g(2);
        f(f);
        photoViewer.q3.h(false, 1.0f);
        photoViewer.Y7.setProgress(f);
        photoViewer.O2();
    }

    public final void f(float f) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        this.a = (int) (photoViewer.o8 * f);
        if (gba.o() == 2) {
            photoViewer.B1(this.a);
            if (photoViewer.d2 == 1) {
                long j = this.a;
                photoViewer.d8 = j;
                if (photoViewer.c8 != j) {
                    photoViewer.c8 = -1L;
                }
            }
            this.c = null;
        } else if (((oq7) this.c) == null) {
            oq7 oq7Var = new oq7(this, (byte) 25);
            this.c = oq7Var;
            gl.e3(oq7Var, 100L);
        }
    }

    public final void g(int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        if (photoViewer.d2 == 1) {
            if (i != 0) {
                if (photoViewer.D1 != null) {
                    if (photoViewer.Y7.getLeftProgress() > photoViewer.C8 || photoViewer.Y7.getRightProgress() < photoViewer.C8) {
                        photoViewer.D1.setVideoThumbVisible(false);
                        float f = photoViewer.o8 * 1000.0f;
                        if (i == 1) {
                            photoViewer.B8 = photoViewer.Y7.getLeftProgress() * f;
                        } else {
                            photoViewer.B8 = photoViewer.Y7.getRightProgress() * f;
                        }
                        photoViewer.b8 = -1L;
                        return;
                    }
                    return;
                }
                return;
            }
            float progress = photoViewer.Y7.getProgress();
            photoViewer.C8 = progress;
            photoViewer.B8 = photoViewer.o8 * 1000.0f * progress;
        }
    }
}
