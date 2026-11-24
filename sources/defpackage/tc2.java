package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
public final class tc2 {
    public final rc2 a;
    public boolean b;
    public uib c;
    public uib d;
    public u51 e;
    public u51 f;
    public StaticLayout g;
    public StaticLayout h;
    public i66 i;
    public m66 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public p99 t;
    public boolean u;
    public boolean v;

    public tc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        float f;
        int i;
        int L;
        int extraTextX;
        int i2;
        boolean z;
        boolean z2;
        mc2 mc2Var;
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new u51(rc2Var);
        }
        if (this.f == null) {
            u51 u51Var = new u51(rc2Var);
            this.f = u51Var;
            u51Var.f = new dc2(rc2Var, (byte) 0);
        }
        float backgroundDrawableRight = rc2Var.getBackgroundDrawableRight();
        if (yc2Var != null) {
            f = yc2Var.i0;
        } else {
            f = 0.0f;
        }
        float f2 = backgroundDrawableRight + f;
        if (rc2Var.Q5.O3() && !rc2Var.C6 && !rc2Var.K) {
            i = 6;
        } else {
            i = 0;
        }
        float L2 = (f2 - gm.L(10 + i)) - rc2Var.getExtraTextX();
        f47 f47Var = rc2Var.L;
        if (f47Var != null && !f47Var.i) {
            i2 = (int) rc2Var.s3;
        } else {
            float f3 = 12.0f;
            if (rc2Var.Q5.O3()) {
                i2 = rc2Var.getExtraTextX() + gm.L(12.0f) + rc2Var.N6;
                if (rc2Var.Q5.D == 19) {
                    i2 -= Math.max(0, (gm.L(14.0f) + (Math.max(rc2Var.X7, rc2Var.Z7) + i2)) - gm.q.x);
                }
            } else {
                boolean z3 = rc2Var.C6;
                int i3 = rc2Var.N6;
                if (z3) {
                    L = gm.L(12.0f) + i3;
                    extraTextX = rc2Var.getExtraTextX();
                } else {
                    if (!rc2Var.K) {
                        f3 = 18.0f;
                    }
                    L = gm.L(f3) + i3;
                    extraTextX = rc2Var.getExtraTextX();
                }
                i2 = L + extraTextX;
            }
        }
        int L3 = ((int) (i2 + yc2Var.h0)) - gm.L(1.33f);
        int i4 = rc2Var.r0;
        float f4 = L3;
        int i5 = (int) (L2 - f4);
        int x = (int) motionEvent.getX();
        int P1 = (int) rc2Var.P1(motionEvent);
        int L4 = (int) (gm.L(10.0f) + L3 + this.c.c + gm.L(4.0f));
        int L5 = gm.L(4.33f) + i4;
        RectF rectF = gm.P;
        float f5 = L4;
        rectF.set(f5, L5, this.d.c + f5 + gm.L(4.0f), gm.L(17.33f) + L5);
        boolean contains = rectF.contains(motionEvent.getX(), rc2Var.P1(motionEvent));
        rectF.set(f4, i4, L3 + i5, this.r + i4);
        if (!contains && !rc2Var.Nc && this.j == null && rectF.contains(motionEvent.getX(), rc2Var.P1(motionEvent))) {
            z = true;
        } else {
            z = false;
        }
        if (((z && !rc2Var.Nc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                i66 i66Var = new i66(rc2Var);
                this.i = i66Var;
                i66Var.d = new dc2(rc2Var, (byte) 0);
            }
            int L6 = (gm.L(10.0f) + L3) - this.o;
            int L7 = gm.L(22.0f) + i4;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && this.j != null)) {
                if (x >= L6 && P1 >= L7 && x <= L6 + i5 && P1 <= this.g.getHeight() + L7) {
                    try {
                        int i6 = P1 - L7;
                        int lineForVertical = this.g.getLineForVertical(i6);
                        float f6 = x - L6;
                        int offsetForHorizontal = this.g.getOffsetForHorizontal(lineForVertical, f6);
                        float lineLeft = this.g.getLineLeft(lineForVertical);
                        if (lineLeft <= f6 && lineLeft + this.g.getLineWidth(lineForVertical) >= f6) {
                            Spannable spannable = (Spannable) this.g.getText();
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (characterStyleArr == null || characterStyleArr.length == 0) {
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, f6c.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof d6c) || d6c.h) && !gm.A1())) {
                                int action = motionEvent.getAction();
                                m66 m66Var = this.j;
                                if (action == 0) {
                                    if (m66Var == null || m66Var.i != characterStyleArr[0]) {
                                        this.i.l(m66Var, true);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        ylb ylbVar = rc2Var.cc;
                                        float f7 = i6;
                                        float[] fArr = rc2.Id;
                                        m66 m66Var2 = new m66(characterStyle, ylbVar, f6, f7, 0);
                                        this.j = m66Var2;
                                        p99 p99Var = this.t;
                                        if (p99Var != null) {
                                            m66Var2.d(cmb.p1(0.1f, p99Var.h()));
                                        }
                                        try {
                                            b66 b = this.j.b();
                                            int[] Z1 = rc2.Z1(spannable, this.j.i);
                                            b.d(this.g, Z1[0], 0.0f);
                                            this.g.getSelectionPath(Z1[0], Z1[1], b);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        this.i.a(this.j, 1);
                                        z = false;
                                    }
                                    rc2Var.invalidate();
                                } else if (m66Var != null) {
                                    CharacterStyle characterStyle2 = characterStyleArr[0];
                                    CharacterStyle characterStyle3 = m66Var.i;
                                    if (characterStyle2 == characterStyle3) {
                                        rc2Var.eb.M(rc2Var, characterStyle3, false);
                                        rc2Var.i3(1);
                                        this.u = false;
                                        this.v = false;
                                        this.j = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                } else {
                    rc2Var.i3(1);
                }
            }
        }
        if (this.n && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (motionEvent.getAction() == 0) {
            this.u = contains;
            this.v = z2;
        } else if (motionEvent.getAction() == 2) {
            this.u = contains;
            this.v = z2;
        } else if (motionEvent.getAction() == 1) {
            if (this.u) {
                mc2 mc2Var2 = rc2Var.eb;
                if (mc2Var2 != null) {
                    mc2Var2.o0(rc2Var, (int) ((this.d.c / 2.0f) + gm.L(4.0f) + L4), L5);
                }
            } else if (this.v && !yc2Var.a3 && (mc2Var = rc2Var.eb) != null) {
                mc2Var.M0(rc2Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            i66 i66Var2 = this.i;
            if (i66Var2 != null) {
                i66Var2.e(true);
            }
            this.j = null;
        }
        this.e.c(this.u);
        this.f.c(this.v);
        if (this.u || this.v || this.j != null) {
            return true;
        }
        return false;
    }

    public final void b(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        int L;
        int extraTextX;
        int i2;
        float f4;
        int L2;
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        c47 c47Var = rc2Var.M;
        if (c47Var == null || c47Var.h) {
            float f5 = 1.0f;
            if (this.b) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (yc2Var.S2) {
                f = gm.R1(1.0f - f, f, yc2Var.L1);
            }
            float f6 = f * 1.0f;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = rc2Var.getBackgroundDrawableRight();
            if (yc2Var != null) {
                f2 = yc2Var.i0;
            } else {
                f2 = 0.0f;
            }
            float f7 = backgroundDrawableRight + f2;
            if (rc2Var.Q5.O3() && !rc2Var.C6 && !rc2Var.K) {
                i = 6;
            } else {
                i = 0;
            }
            float L3 = (f7 - gm.L(10 + i)) - rc2Var.getExtraTextX();
            f47 f47Var = rc2Var.L;
            if (f47Var != null && !f47Var.i) {
                i2 = (int) rc2Var.s3;
            } else if (rc2Var.Q5.O3()) {
                i2 = rc2Var.getExtraTextX() + gm.L(12.0f) + rc2Var.N6;
                if (rc2Var.Q5.D == 19) {
                    i2 -= Math.max(0, (gm.L(14.0f) + (Math.max(rc2Var.X7, rc2Var.Z7) + i2)) - gm.q.x);
                }
            } else {
                boolean z = rc2Var.C6;
                int i3 = rc2Var.N6;
                if (z) {
                    L = gm.L(12.0f) + i3;
                    extraTextX = rc2Var.getExtraTextX();
                } else {
                    if (rc2Var.K) {
                        f3 = 12.0f;
                    } else {
                        f3 = 18.0f;
                    }
                    L = gm.L(f3) + i3;
                    extraTextX = rc2Var.getExtraTextX();
                }
                i2 = L + extraTextX;
            }
            int L4 = ((int) (i2 + yc2Var.h0)) - gm.L(1.33f);
            int i4 = rc2Var.r0;
            float f8 = L4;
            int i5 = (int) (L3 - f8);
            int i6 = this.r;
            if (yc2Var.Y2) {
                i6 = gm.U1(yc2Var.L1, yc2Var.U2, i6);
            }
            if (this.n && rc2Var.getPrimaryMessageObject() != null) {
                boolean z2 = rc2Var.getPrimaryMessageObject().c3;
            }
            boolean z3 = yc2Var.a3;
            p99 p99Var = this.t;
            if (p99Var == null) {
                p99Var = new p99(rc2Var);
                this.t = p99Var;
            }
            int n = p99Var.n(rc2Var.cc);
            canvas.save();
            canvas.translate(f8, i4);
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, i5, i6);
            u51 u51Var = this.f;
            if (u51Var != null) {
                f4 = u51Var.a(0.01f);
            } else {
                f4 = 1.0f;
            }
            canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f6, false, false);
            this.t.f(canvas, rectF, f6);
            uib uibVar = this.c;
            if (uibVar != null) {
                uibVar.c(gm.L(10.0f), gm.L(12.0f), f6, n, canvas);
                if (this.d != null) {
                    rectF.set((int) (gm.L(10.0f) + this.c.c + gm.L(4.0f)), gm.L(4.33f), gm.L(10.0f) + L2 + this.d.c, gm.L(21.66f));
                    u51 u51Var2 = this.e;
                    if (u51Var2 != null) {
                        f5 = u51Var2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f5, f5, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, gm.L(17.0f), gm.L(17.0f), this.t.g);
                    this.d.c(gm.L(5.0f) + L2, gm.L(12.0f), f6, n, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final void c(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc2.c(android.graphics.Canvas):void");
    }
}
