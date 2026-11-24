package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class hb2 {
    public final gb2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public ArrayList g;
    public boolean h;

    public hb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final void a() {
        int i;
        gb2 gb2Var = this.a;
        gb2Var.B0(0);
        if (this.b) {
            boolean z = this.d;
            if (this.c) {
                boolean z2 = (z ? 1 : 0) | true;
                i = (z ? 1 : 0) + 1;
                z = z2;
            } else {
                i = z ? 1 : 0;
            }
            if (this.e) {
                z = (z ? 1 : 0) | true;
                i++;
            }
            if (i == 0) {
                this.g = null;
                this.f = 0;
                return;
            }
            gb2Var.v0 = gl.L(60.0f) + gb2Var.v0;
            if (z != this.f) {
                this.f = 0;
                int D = ug8.D(75.0f, gb2Var.b7, i);
                float N = (gb2Var.b7 - gl.N(37.0f)) / i;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(gb2.x0(5, k96.M0(2131743314, "ViewContact"), D, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(gb2.x0(30, k96.M0(2131745225, "SharedContactMessage"), D, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(gb2.x0(31, k96.M0(2131745226, "SharedContactAdd"), D, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        int i;
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        boolean z4;
        float f2;
        n41 n41Var;
        int i2;
        float f3;
        gb2 gb2Var = this.a;
        Drawable[] drawableArr = gb2Var.J2;
        ml mlVar = gb2Var.U0;
        n79 n79Var = gb2Var.q8;
        if (n79Var == null) {
            n79Var = new n79(gb2Var);
            gb2Var.q8 = n79Var;
        }
        int a = n79Var.a(gb2Var.Q5, gb2Var.va, gb2Var.wa, gb2Var.cc, 4);
        if (gb2Var.Sa == null) {
            gb2Var.Sa = new n41(gb2Var, 2.0f, 2.0f);
        }
        int L = (int) (mlVar.L0 - gl.L(13.0f));
        int L2 = gb2Var.e7 - gl.L(62.0f);
        i19 i19Var = gb2Var.O;
        if (!i19Var.p) {
            L2 -= i19Var.n;
        }
        if (gb2Var.x7) {
            if (gb2Var.I3()) {
                f3 = 39.3f;
            } else {
                f3 = 41.0f;
            }
            L2 -= gl.L(f3);
        }
        int i3 = L2;
        if (gb2Var.v2 == null) {
            gb2Var.v2 = new RectF();
        }
        int backgroundDrawableRight = gb2Var.getBackgroundDrawableRight();
        int L3 = gl.L(10.0f);
        if (gb2Var.Q5.O3() && !gb2Var.C6 && !gb2Var.K) {
            i = gl.L(6.0f);
        } else {
            i = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i)) - gb2Var.getExtraTextX();
        nb2 nb2Var = gb2Var.ub;
        if (nb2Var.x0) {
            extraTextX += nb2Var.i0;
        }
        gb2Var.v2.set(L, mlVar.M0 - gl.L(9.0f), extraTextX, gl.L(38.0f) + i3);
        float a2 = gb2Var.Sa.a(0.0125f);
        if (a2 != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.save();
            canvas.scale(a2, a2, gb2Var.v2.centerX(), gb2Var.v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            gb2Var.L2[0] = 0;
            f = 2.0f;
            drawable.setBounds(L, (int) (mlVar.M0 - gl.L(9.0f)), (int) extraTextX, gl.L(38.0f) + i3);
            if (gb2Var.I2 != bkb.p1(0.1f, gb2Var.q8.h())) {
                Drawable drawable2 = drawableArr[0];
                int p1 = bkb.p1(0.1f, gb2Var.q8.h());
                gb2Var.I2 = p1;
                bkb.F1(drawable2, p1, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f = 2.0f;
        }
        float floor = (float) Math.floor(gba.U0 / 3.0f);
        int i4 = (int) floor;
        float f4 = 1.0f;
        gb2Var.q8.c(floor, floor, floor, 1.0f, canvas, gb2Var.v2);
        gb2Var.q8.f(canvas, gb2Var.v2, 1.0f);
        bkb.Q2.setColor(a);
        bkb.R2.setColor(bkb.v0(bkb.Wd, gb2Var.cc));
        if (gb2Var.Q5.O3()) {
            bkb.R2.setColor(bkb.v0(bkb.Vc, gb2Var.cc));
        } else {
            bkb.R2.setColor(bkb.v0(bkb.Uc, gb2Var.cc));
        }
        if (gb2Var.o2 != null) {
            canvas.save();
            canvas.translate(mlVar.L0 + mlVar.N0 + gl.L(9.0f), gl.L(27.0f) + gb2Var.gb);
            qla.f(canvas, gb2Var.o2);
            canvas.restore();
        }
        if (gb2Var.e3 != null) {
            canvas.save();
            canvas.translate(mlVar.L0 + mlVar.N0 + gl.L(9.0f), gl.L(50.0f) + gb2Var.gb);
            qla.f(canvas, gb2Var.e3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            bkb.L2.setColor(a);
            bkb.X1.setColor(bkb.p1(0.1f, a));
            int alpha = bkb.L2.getAlpha();
            bkb.L2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(gb2Var.v2.left + gl.L(10.0f), gl.L(f) + i3, gb2Var.v2.right - gl.L(7.0f), Math.max(1, gl.L(0.66f)) + gl.L(f) + i3, bkb.L2);
            bkb.L2.setAlpha(alpha);
            int L4 = gl.L(f) + i3;
            float L5 = gl.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = gb2Var.q8.x;
            int i6 = 0;
            while (i6 < this.g.size()) {
                db2 db2Var = (db2) this.g.get(i6);
                float f5 = db2Var.b;
                RectF rectF = db2Var.e;
                float min = Math.min(f5 + L5, gb2Var.v2.right);
                rectF.set(L5, L4, min, gl.L(36.0f) + L4);
                if (z2 && db2Var.g == null) {
                    gb2Var.db = i5;
                    if (i6 == this.g.size() - 1) {
                        i2 = i4;
                    } else {
                        i2 = 0;
                    }
                    z3 = false;
                    ff0 a0 = bkb.a0(i5, 0, 0, i2, 0);
                    db2Var.g = a0;
                    a0.setCallback(gb2Var);
                } else {
                    z3 = false;
                }
                ff0 ff0Var = db2Var.g;
                float f6 = f4;
                if (ff0Var != null) {
                    ff0Var.setBounds((int) L5, L4, (int) min, gl.L(36.0f) + L4);
                    db2Var.g.draw(canvas);
                }
                if (!z && (n41Var = db2Var.f) != null) {
                    f2 = n41Var.a(0.02f);
                    if (f2 != f6) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                } else {
                    z4 = z3;
                    f2 = f6;
                }
                if (z4) {
                    canvas.save();
                    canvas.scale(f2, f2, rectF.centerX(), rectF.centerY());
                }
                if (db2Var.d != null) {
                    canvas.save();
                    canvas.translate(db2Var.c + L5, gl.L(10.5f) + L4);
                    db2Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z4) {
                    canvas.restore();
                }
                L5 += db2Var.b;
                i6++;
                f4 = f6;
            }
        }
        if (z) {
            canvas.restore();
        }
    }
}
