package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import org.telegram.utils.twidget.p;
import org.telegram.utils.twidget.z;
public final class hyc {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public byte H;
    public int I;
    public float J;
    public float K;
    public int L;
    public long M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public final gyc a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final fyc k;
    public final fyc l;
    public final p m;
    public final fyc n;
    public lyc o;
    public cyc p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public hyc(gyc gycVar, float f) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        this.k = new Runnable(this) {
            public final hyc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                cyc cycVar;
                byte b = r2;
                hyc hycVar = this.b;
                switch (b) {
                    case 0:
                        hycVar.l(false, false, false);
                        return;
                    case 1:
                        if (hycVar.w && hycVar.x) {
                            hycVar.a(hycVar.m.f(SystemClock.uptimeMillis()));
                            hycVar.p();
                            return;
                        }
                        return;
                    default:
                        if (hycVar.o != null && (cycVar = hycVar.p) != null) {
                            lyc d = cycVar.d();
                            lyc lycVar = hycVar.o;
                            if (d == lycVar) {
                                lycVar.a.f();
                                hycVar.a.f();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.l = new Runnable(this) {
            public final hyc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                cyc cycVar;
                byte b = r2;
                hyc hycVar = this.b;
                switch (b) {
                    case 0:
                        hycVar.l(false, false, false);
                        return;
                    case 1:
                        if (hycVar.w && hycVar.x) {
                            hycVar.a(hycVar.m.f(SystemClock.uptimeMillis()));
                            hycVar.p();
                            return;
                        }
                        return;
                    default:
                        if (hycVar.o != null && (cycVar = hycVar.p) != null) {
                            lyc d = cycVar.d();
                            lyc lycVar = hycVar.o;
                            if (d == lycVar) {
                                lycVar.a.f();
                                hycVar.a.f();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.m = new Object();
        this.n = new Runnable(this) {
            public final hyc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                cyc cycVar;
                byte b = r2;
                hyc hycVar = this.b;
                switch (b) {
                    case 0:
                        hycVar.l(false, false, false);
                        return;
                    case 1:
                        if (hycVar.w && hycVar.x) {
                            hycVar.a(hycVar.m.f(SystemClock.uptimeMillis()));
                            hycVar.p();
                            return;
                        }
                        return;
                    default:
                        if (hycVar.o != null && (cycVar = hycVar.p) != null) {
                            lyc d = cycVar.d();
                            lyc lycVar = hycVar.o;
                            if (d == lycVar) {
                                lycVar.a.f();
                                hycVar.a.f();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.a = gycVar;
        this.b = f;
        paint.setTextSize(f * 14.0f);
        paint.setColor(-8355712);
    }

    public static int k(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int metaState = motionEvent.getMetaState();
        int i4 = 0;
        if ((metaState & 2) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if ((metaState & 4096) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        int i5 = i | i2;
        if ((65536 & metaState) != 0) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i6 = i5 | i3;
        if ((metaState & 1) != 0) {
            i4 = 8;
        }
        return i6 | i4;
    }

    public final void a(int i) {
        if (i != -1) {
            this.L = i;
            if ((i & 32) != 0 && !this.A) {
                this.A = true;
                cyc cycVar = this.p;
                float f = this.P;
                float f2 = this.Q;
                boolean z = this.E;
                int i2 = this.I;
                byte b = this.H;
                z zVar = cycVar.e;
                if (zVar != null) {
                    zVar.i(3, f, f2, 0, true, z, i2, b);
                }
            }
            int i3 = i & 3;
            gyc gycVar = this.a;
            if (i3 == 2) {
                h();
                if (((i >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    gycVar.d();
                }
            } else if (i3 == 1 && o() && !this.C) {
                if (this.B) {
                    gycVar.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(cyc cycVar) {
        if (this.p != cycVar) {
            r();
            this.p = cycVar;
            if (cycVar == null) {
                return;
            }
            cycVar.g = this;
            cycVar.l(this.q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyc.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        cyc cycVar = this.p;
        if (cycVar != null && !this.r) {
            float f = this.J;
            float f2 = this.K;
            z zVar = cycVar.e;
            if (zVar != null) {
                long j = zVar.v;
                if (!zVar.A && j != 0) {
                    zVar.c.e(j, 1, f, f2, 0);
                }
            }
        }
        this.a.setCursor("auto");
    }

    public final void e() {
        fyc fycVar = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(fycVar);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void f() {
        cyc cycVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.w && !this.A && (cycVar = this.p) != null) {
            this.A = true;
            float f = this.P;
            float f2 = this.Q;
            boolean z = this.E;
            int i = this.I;
            byte b = this.H;
            z zVar = cycVar.e;
            if (zVar != null) {
                zVar.i(3, f, f2, 0, true, z, i, b);
            }
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            cyc cycVar = this.p;
            if (cycVar != null) {
                float f = this.N;
                float f2 = this.O;
                boolean z = this.E;
                int i = this.I;
                byte b = this.H;
                z zVar = cycVar.e;
                if (zVar != null) {
                    zVar.i(0, f, f2, 0, true, z, i, b);
                }
            }
        }
    }

    public final void h() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.a.b(false);
            }
        }
    }

    public final void i() {
        if (!this.B && !this.C) {
            this.B = true;
            this.a.b(true);
        }
    }

    public final float j(float f) {
        int i;
        if (jb6.a0 && (i = this.R) > 0) {
            return (i / this.b) - f;
        }
        return f;
    }

    public final void l(boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        if (this.w && !this.x) {
            this.c.removeCallbacks(this.k);
            this.x = true;
            int b = this.m.b(this.M, j(this.N), this.O, z, z2, z3, this.E, this.H);
            boolean z6 = false;
            if ((b & 2048) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && !z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.y = z5;
            if (z3 && !z4) {
                z6 = true;
            }
            this.z = z6;
            a(b);
            if (this.P != this.N || this.Q != this.O) {
                a(this.m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
            }
            if (!this.y && !this.z && !this.E) {
                h();
            } else {
                i();
                if ((this.y || this.E) && !this.C) {
                    this.a.b(true);
                }
            }
            p();
        }
    }

    public final void m(MotionEvent motionEvent, boolean z) {
        cyc cycVar;
        z zVar;
        float f = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (z && actionMasked != 10 && (cycVar = this.p) != null && !this.r && (zVar = cycVar.e) != null && zVar.I) {
            this.F = true;
            this.J = motionEvent.getX() / f;
            float y = motionEvent.getY() / f;
            this.K = y;
            cyc cycVar2 = this.p;
            float f2 = this.J;
            int k = k(motionEvent);
            z zVar2 = cycVar2.e;
            if (zVar2 != null) {
                long j = zVar2.v;
                if (!zVar2.A && j != 0) {
                    zVar2.c.e(j, 0, f2, y, k);
                    return;
                }
                return;
            }
            return;
        }
        d();
    }

    public final boolean n(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyc.n(android.view.MotionEvent):boolean");
    }

    public final boolean o() {
        int i = this.L;
        int i2 = (i >> 2) & 7;
        if ((i & 3) == 1) {
            if (i2 == 4 || i2 == 5 || i2 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p() {
        Handler handler = this.c;
        fyc fycVar = this.l;
        handler.removeCallbacks(fycVar);
        double c = this.m.c();
        if (this.w && c >= 0.0d) {
            handler.postDelayed(fycVar, Math.max(0L, ((long) Math.ceil(c)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z) {
        if (this.q != z) {
            this.q = z;
            cyc cycVar = this.p;
            if (cycVar != null && !this.r) {
                cycVar.l(z);
            }
        }
    }

    public final void r() {
        if (this.p == null) {
            return;
        }
        if (this.r) {
            this.r = false;
            this.p = null;
            return;
        }
        f();
        d();
        this.p.l(false);
        cyc cycVar = this.p;
        if (cycVar.g == this) {
            cycVar.g = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        e();
        this.m.e();
    }
}
