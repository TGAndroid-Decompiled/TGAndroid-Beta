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
public final class gwc {
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
    public final fwc a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final ewc k;
    public final ewc l;
    public final p m;
    public final ewc n;
    public kwc o;
    public bwc p;
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

    public gwc(fwc fwcVar, float f) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        this.k = new Runnable(this) {
            public final gwc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                bwc bwcVar;
                byte b = r2;
                gwc gwcVar = this.b;
                switch (b) {
                    case 0:
                        gwcVar.l(false, false, false);
                        return;
                    case 1:
                        if (gwcVar.w && gwcVar.x) {
                            gwcVar.a(gwcVar.m.f(SystemClock.uptimeMillis()));
                            gwcVar.p();
                            return;
                        }
                        return;
                    default:
                        if (gwcVar.o != null && (bwcVar = gwcVar.p) != null) {
                            kwc d = bwcVar.d();
                            kwc kwcVar = gwcVar.o;
                            if (d == kwcVar) {
                                kwcVar.a.f();
                                gwcVar.a.g();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.l = new Runnable(this) {
            public final gwc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                bwc bwcVar;
                byte b = r2;
                gwc gwcVar = this.b;
                switch (b) {
                    case 0:
                        gwcVar.l(false, false, false);
                        return;
                    case 1:
                        if (gwcVar.w && gwcVar.x) {
                            gwcVar.a(gwcVar.m.f(SystemClock.uptimeMillis()));
                            gwcVar.p();
                            return;
                        }
                        return;
                    default:
                        if (gwcVar.o != null && (bwcVar = gwcVar.p) != null) {
                            kwc d = bwcVar.d();
                            kwc kwcVar = gwcVar.o;
                            if (d == kwcVar) {
                                kwcVar.a.f();
                                gwcVar.a.g();
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
            public final gwc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                bwc bwcVar;
                byte b = r2;
                gwc gwcVar = this.b;
                switch (b) {
                    case 0:
                        gwcVar.l(false, false, false);
                        return;
                    case 1:
                        if (gwcVar.w && gwcVar.x) {
                            gwcVar.a(gwcVar.m.f(SystemClock.uptimeMillis()));
                            gwcVar.p();
                            return;
                        }
                        return;
                    default:
                        if (gwcVar.o != null && (bwcVar = gwcVar.p) != null) {
                            kwc d = bwcVar.d();
                            kwc kwcVar = gwcVar.o;
                            if (d == kwcVar) {
                                kwcVar.a.f();
                                gwcVar.a.g();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.a = fwcVar;
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
                bwc bwcVar = this.p;
                float f = this.P;
                float f2 = this.Q;
                boolean z = this.E;
                int i2 = this.I;
                byte b = this.H;
                z zVar = bwcVar.e;
                if (zVar != null) {
                    zVar.i(3, f, f2, 0, true, z, i2, b);
                }
            }
            int i3 = i & 3;
            fwc fwcVar = this.a;
            if (i3 == 2) {
                h();
                if (((i >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    fwcVar.d();
                }
            } else if (i3 == 1 && o() && !this.C) {
                if (this.B) {
                    fwcVar.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(bwc bwcVar) {
        if (this.p != bwcVar) {
            r();
            this.p = bwcVar;
            if (bwcVar == null) {
                return;
            }
            bwcVar.g = this;
            bwcVar.k(this.q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwc.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        bwc bwcVar = this.p;
        if (bwcVar != null && !this.r) {
            float f = this.J;
            float f2 = this.K;
            z zVar = bwcVar.e;
            if (zVar != null) {
                long j = zVar.v;
                if (!zVar.A && j != 0) {
                    zVar.c.e(j, 1, f, f2, 0);
                }
            }
        }
        this.a.f("auto");
    }

    public final void e() {
        ewc ewcVar = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(ewcVar);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void f() {
        bwc bwcVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.w && !this.A && (bwcVar = this.p) != null) {
            this.A = true;
            float f = this.P;
            float f2 = this.Q;
            boolean z = this.E;
            int i = this.I;
            byte b = this.H;
            z zVar = bwcVar.e;
            if (zVar != null) {
                zVar.i(3, f, f2, 0, true, z, i, b);
            }
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            bwc bwcVar = this.p;
            if (bwcVar != null) {
                float f = this.N;
                float f2 = this.O;
                boolean z = this.E;
                int i = this.I;
                byte b = this.H;
                z zVar = bwcVar.e;
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
        if (k96.a0 && (i = this.R) > 0) {
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
        bwc bwcVar;
        z zVar;
        float f = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (z && actionMasked != 10 && (bwcVar = this.p) != null && !this.r && (zVar = bwcVar.e) != null && zVar.I) {
            this.F = true;
            this.J = motionEvent.getX() / f;
            float y = motionEvent.getY() / f;
            this.K = y;
            bwc bwcVar2 = this.p;
            float f2 = this.J;
            int k = k(motionEvent);
            z zVar2 = bwcVar2.e;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwc.n(android.view.MotionEvent):boolean");
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
        ewc ewcVar = this.l;
        handler.removeCallbacks(ewcVar);
        double c = this.m.c();
        if (this.w && c >= 0.0d) {
            handler.postDelayed(ewcVar, Math.max(0L, ((long) Math.ceil(c)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z) {
        if (this.q != z) {
            this.q = z;
            bwc bwcVar = this.p;
            if (bwcVar != null && !this.r) {
                bwcVar.k(z);
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
        this.p.k(false);
        bwc bwcVar = this.p;
        if (bwcVar.g == this) {
            bwcVar.g = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        e();
        this.m.e();
    }
}
