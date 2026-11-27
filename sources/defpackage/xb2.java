package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class xb2 {
    public final wb2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public ArrayList g;
    public boolean h;

    public xb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final void a() {
        int i;
        wb2 wb2Var = this.a;
        wb2Var.B0(0);
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
            wb2Var.v0 = hl.L(60.0f) + wb2Var.v0;
            if (z != this.f) {
                this.f = 0;
                int D = ik8.D(75.0f, wb2Var.b7, i);
                float N = (wb2Var.b7 - hl.N(37.0f)) / i;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(wb2.x0(5, ob6.M0(2131743208, "ViewContact"), D, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(wb2.x0(30, ob6.M0(2131745145, "SharedContactMessage"), D, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(wb2.x0(31, ob6.M0(2131745146, "SharedContactAdd"), D, N));
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
        v41 v41Var;
        int i2;
        float f3;
        wb2 wb2Var = this.a;
        Drawable[] drawableArr = wb2Var.J2;
        nl nlVar = wb2Var.U0;
        ab9 ab9Var = wb2Var.q8;
        if (ab9Var == null) {
            ab9Var = new ab9(wb2Var);
            wb2Var.q8 = ab9Var;
        }
        int a = ab9Var.a(wb2Var.Q5, wb2Var.va, wb2Var.wa, wb2Var.cc, 4);
        if (wb2Var.Sa == null) {
            wb2Var.Sa = new v41(wb2Var, 2.0f, 2.0f);
        }
        int L = (int) (nlVar.L0 - hl.L(13.0f));
        int L2 = wb2Var.e7 - hl.L(62.0f);
        x49 x49Var = wb2Var.O;
        if (!x49Var.p) {
            L2 -= x49Var.n;
        }
        if (wb2Var.x7) {
            if (wb2Var.I3()) {
                f3 = 39.3f;
            } else {
                f3 = 41.0f;
            }
            L2 -= hl.L(f3);
        }
        int i3 = L2;
        if (wb2Var.v2 == null) {
            wb2Var.v2 = new RectF();
        }
        int backgroundDrawableRight = wb2Var.getBackgroundDrawableRight();
        int L3 = hl.L(10.0f);
        if (wb2Var.Q5.O3() && !wb2Var.C6 && !wb2Var.K) {
            i = hl.L(6.0f);
        } else {
            i = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i)) - wb2Var.getExtraTextX();
        dc2 dc2Var = wb2Var.ub;
        if (dc2Var.x0) {
            extraTextX += dc2Var.i0;
        }
        wb2Var.v2.set(L, nlVar.M0 - hl.L(9.0f), extraTextX, hl.L(38.0f) + i3);
        float a2 = wb2Var.Sa.a(0.0125f);
        if (a2 != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.save();
            canvas.scale(a2, a2, wb2Var.v2.centerX(), wb2Var.v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            wb2Var.L2[0] = 0;
            f = 2.0f;
            drawable.setBounds(L, (int) (nlVar.M0 - hl.L(9.0f)), (int) extraTextX, hl.L(38.0f) + i3);
            if (wb2Var.I2 != aob.p1(0.1f, wb2Var.q8.h())) {
                Drawable drawable2 = drawableArr[0];
                int p1 = aob.p1(0.1f, wb2Var.q8.h());
                wb2Var.I2 = p1;
                aob.F1(drawable2, p1, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f = 2.0f;
        }
        float floor = (float) Math.floor(xea.U0 / 3.0f);
        int i4 = (int) floor;
        float f4 = 1.0f;
        wb2Var.q8.c(floor, floor, floor, 1.0f, canvas, wb2Var.v2);
        wb2Var.q8.f(canvas, wb2Var.v2, 1.0f);
        aob.R2.setColor(a);
        aob.S2.setColor(aob.v0(aob.Xd, wb2Var.cc));
        if (wb2Var.Q5.O3()) {
            aob.S2.setColor(aob.v0(aob.Wc, wb2Var.cc));
        } else {
            aob.S2.setColor(aob.v0(aob.Vc, wb2Var.cc));
        }
        if (wb2Var.o2 != null) {
            canvas.save();
            canvas.translate(nlVar.L0 + nlVar.N0 + hl.L(9.0f), hl.L(27.0f) + wb2Var.gb);
            npa.f(canvas, wb2Var.o2);
            canvas.restore();
        }
        if (wb2Var.e3 != null) {
            canvas.save();
            canvas.translate(nlVar.L0 + nlVar.N0 + hl.L(9.0f), hl.L(50.0f) + wb2Var.gb);
            npa.f(canvas, wb2Var.e3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            aob.M2.setColor(a);
            aob.Y1.setColor(aob.p1(0.1f, a));
            int alpha = aob.M2.getAlpha();
            aob.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(wb2Var.v2.left + hl.L(10.0f), hl.L(f) + i3, wb2Var.v2.right - hl.L(7.0f), Math.max(1, hl.L(0.66f)) + hl.L(f) + i3, aob.M2);
            aob.M2.setAlpha(alpha);
            int L4 = hl.L(f) + i3;
            float L5 = hl.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i5 = wb2Var.q8.x;
            int i6 = 0;
            while (i6 < this.g.size()) {
                tb2 tb2Var = (tb2) this.g.get(i6);
                float f5 = tb2Var.b;
                RectF rectF = tb2Var.e;
                float min = Math.min(f5 + L5, wb2Var.v2.right);
                rectF.set(L5, L4, min, hl.L(36.0f) + L4);
                if (z2 && tb2Var.g == null) {
                    wb2Var.db = i5;
                    if (i6 == this.g.size() - 1) {
                        i2 = i4;
                    } else {
                        i2 = 0;
                    }
                    z3 = false;
                    hf0 a0 = aob.a0(i5, 0, 0, i2, 0);
                    tb2Var.g = a0;
                    a0.setCallback(wb2Var);
                } else {
                    z3 = false;
                }
                hf0 hf0Var = tb2Var.g;
                float f6 = f4;
                if (hf0Var != null) {
                    hf0Var.setBounds((int) L5, L4, (int) min, hl.L(36.0f) + L4);
                    tb2Var.g.draw(canvas);
                }
                if (!z && (v41Var = tb2Var.f) != null) {
                    f2 = v41Var.a(0.02f);
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
                if (tb2Var.d != null) {
                    canvas.save();
                    canvas.translate(tb2Var.c + L5, hl.L(10.5f) + L4);
                    tb2Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z4) {
                    canvas.restore();
                }
                L5 += tb2Var.b;
                i6++;
                f4 = f6;
            }
        }
        if (z) {
            canvas.restore();
        }
    }
}
