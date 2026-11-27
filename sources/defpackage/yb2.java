package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
public final class yb2 {
    public final wb2 a;
    public boolean b;
    public pkb c;
    public pkb d;
    public v41 e;
    public v41 f;
    public StaticLayout g;
    public StaticLayout h;
    public m66 i;
    public q66 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public ab9 t;
    public boolean u;
    public boolean v;

    public yb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        float f;
        int i;
        int L;
        int extraTextX;
        int i2;
        boolean z;
        boolean z2;
        rb2 rb2Var;
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new v41(wb2Var);
        }
        if (this.f == null) {
            v41 v41Var = new v41(wb2Var);
            this.f = v41Var;
            v41Var.f = new ib2(wb2Var, (byte) 0);
        }
        float backgroundDrawableRight = wb2Var.getBackgroundDrawableRight();
        if (dc2Var != null) {
            f = dc2Var.i0;
        } else {
            f = 0.0f;
        }
        float f2 = backgroundDrawableRight + f;
        if (wb2Var.Q5.O3() && !wb2Var.C6 && !wb2Var.K) {
            i = 6;
        } else {
            i = 0;
        }
        float L2 = (f2 - hl.L(10 + i)) - wb2Var.getExtraTextX();
        m47 m47Var = wb2Var.L;
        if (m47Var != null && !m47Var.i) {
            i2 = (int) wb2Var.s3;
        } else {
            float f3 = 12.0f;
            if (wb2Var.Q5.O3()) {
                i2 = wb2Var.getExtraTextX() + hl.L(12.0f) + wb2Var.N6;
                if (wb2Var.Q5.D == 19) {
                    i2 -= Math.max(0, (hl.L(14.0f) + (Math.max(wb2Var.X7, wb2Var.Z7) + i2)) - hl.q.x);
                }
            } else {
                boolean z3 = wb2Var.C6;
                int i3 = wb2Var.N6;
                if (z3) {
                    L = hl.L(12.0f) + i3;
                    extraTextX = wb2Var.getExtraTextX();
                } else {
                    if (!wb2Var.K) {
                        f3 = 18.0f;
                    }
                    L = hl.L(f3) + i3;
                    extraTextX = wb2Var.getExtraTextX();
                }
                i2 = L + extraTextX;
            }
        }
        int L3 = ((int) (i2 + dc2Var.h0)) - hl.L(1.33f);
        int i4 = wb2Var.r0;
        float f4 = L3;
        int i5 = (int) (L2 - f4);
        int x = (int) motionEvent.getX();
        int P1 = (int) wb2Var.P1(motionEvent);
        int L4 = (int) (hl.L(10.0f) + L3 + this.c.c + hl.L(4.0f));
        int L5 = hl.L(4.33f) + i4;
        RectF rectF = hl.P;
        float f5 = L4;
        rectF.set(f5, L5, this.d.c + f5 + hl.L(4.0f), hl.L(17.33f) + L5);
        boolean contains = rectF.contains(motionEvent.getX(), wb2Var.P1(motionEvent));
        rectF.set(f4, i4, L3 + i5, this.r + i4);
        if (!contains && !wb2Var.Nc && this.j == null && rectF.contains(motionEvent.getX(), wb2Var.P1(motionEvent))) {
            z = true;
        } else {
            z = false;
        }
        if (((z && !wb2Var.Nc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                m66 m66Var = new m66(wb2Var);
                this.i = m66Var;
                m66Var.d = new ib2(wb2Var, (byte) 0);
            }
            int L6 = (hl.L(10.0f) + L3) - this.o;
            int L7 = hl.L(22.0f) + i4;
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
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, e8c.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof c8c) || c8c.h) && !hl.A1())) {
                                int action = motionEvent.getAction();
                                q66 q66Var = this.j;
                                if (action == 0) {
                                    if (q66Var == null || q66Var.i != characterStyleArr[0]) {
                                        this.i.l(q66Var, true);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        vnb vnbVar = wb2Var.cc;
                                        float f7 = i6;
                                        float[] fArr = wb2.Id;
                                        q66 q66Var2 = new q66(characterStyle, vnbVar, f6, f7, 0);
                                        this.j = q66Var2;
                                        ab9 ab9Var = this.t;
                                        if (ab9Var != null) {
                                            q66Var2.d(aob.p1(0.1f, ab9Var.h()));
                                        }
                                        try {
                                            f66 b = this.j.b();
                                            int[] Z1 = wb2.Z1(spannable, this.j.i);
                                            b.d(this.g, Z1[0], 0.0f);
                                            this.g.getSelectionPath(Z1[0], Z1[1], b);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        this.i.a(this.j, 1);
                                        z = false;
                                    }
                                    wb2Var.invalidate();
                                } else if (q66Var != null) {
                                    CharacterStyle characterStyle2 = characterStyleArr[0];
                                    CharacterStyle characterStyle3 = q66Var.i;
                                    if (characterStyle2 == characterStyle3) {
                                        wb2Var.eb.L(wb2Var, characterStyle3, false);
                                        wb2Var.i3(1);
                                        this.u = false;
                                        this.v = false;
                                        this.j = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                } else {
                    wb2Var.i3(1);
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
                rb2 rb2Var2 = wb2Var.eb;
                if (rb2Var2 != null) {
                    rb2Var2.n0(wb2Var, (int) ((this.d.c / 2.0f) + hl.L(4.0f) + L4), L5);
                }
            } else if (this.v && !dc2Var.a3 && (rb2Var = wb2Var.eb) != null) {
                rb2Var.J0(wb2Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            m66 m66Var2 = this.i;
            if (m66Var2 != null) {
                m66Var2.e(true);
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
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        j47 j47Var = wb2Var.M;
        if (j47Var == null || j47Var.h) {
            float f5 = 1.0f;
            if (this.b) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (dc2Var.S2) {
                f = hl.R1(1.0f - f, f, dc2Var.L1);
            }
            float f6 = f * 1.0f;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = wb2Var.getBackgroundDrawableRight();
            if (dc2Var != null) {
                f2 = dc2Var.i0;
            } else {
                f2 = 0.0f;
            }
            float f7 = backgroundDrawableRight + f2;
            if (wb2Var.Q5.O3() && !wb2Var.C6 && !wb2Var.K) {
                i = 6;
            } else {
                i = 0;
            }
            float L3 = (f7 - hl.L(10 + i)) - wb2Var.getExtraTextX();
            m47 m47Var = wb2Var.L;
            if (m47Var != null && !m47Var.i) {
                i2 = (int) wb2Var.s3;
            } else if (wb2Var.Q5.O3()) {
                i2 = wb2Var.getExtraTextX() + hl.L(12.0f) + wb2Var.N6;
                if (wb2Var.Q5.D == 19) {
                    i2 -= Math.max(0, (hl.L(14.0f) + (Math.max(wb2Var.X7, wb2Var.Z7) + i2)) - hl.q.x);
                }
            } else {
                boolean z = wb2Var.C6;
                int i3 = wb2Var.N6;
                if (z) {
                    L = hl.L(12.0f) + i3;
                    extraTextX = wb2Var.getExtraTextX();
                } else {
                    if (wb2Var.K) {
                        f3 = 12.0f;
                    } else {
                        f3 = 18.0f;
                    }
                    L = hl.L(f3) + i3;
                    extraTextX = wb2Var.getExtraTextX();
                }
                i2 = L + extraTextX;
            }
            int L4 = ((int) (i2 + dc2Var.h0)) - hl.L(1.33f);
            int i4 = wb2Var.r0;
            float f8 = L4;
            int i5 = (int) (L3 - f8);
            int i6 = this.r;
            if (dc2Var.Y2) {
                i6 = hl.U1(dc2Var.L1, dc2Var.U2, i6);
            }
            if (this.n && wb2Var.getPrimaryMessageObject() != null) {
                boolean z2 = wb2Var.getPrimaryMessageObject().c3;
            }
            boolean z3 = dc2Var.a3;
            ab9 ab9Var = this.t;
            if (ab9Var == null) {
                ab9Var = new ab9(wb2Var);
                this.t = ab9Var;
            }
            int n = ab9Var.n(wb2Var.cc);
            canvas.save();
            canvas.translate(f8, i4);
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, i5, i6);
            v41 v41Var = this.f;
            if (v41Var != null) {
                f4 = v41Var.a(0.01f);
            } else {
                f4 = 1.0f;
            }
            canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f6, false, false);
            this.t.f(canvas, rectF, f6);
            pkb pkbVar = this.c;
            if (pkbVar != null) {
                pkbVar.c(hl.L(10.0f), hl.L(12.0f), f6, n, canvas);
                if (this.d != null) {
                    rectF.set((int) (hl.L(10.0f) + this.c.c + hl.L(4.0f)), hl.L(4.33f), hl.L(10.0f) + L2 + this.d.c, hl.L(21.66f));
                    v41 v41Var2 = this.e;
                    if (v41Var2 != null) {
                        f5 = v41Var2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f5, f5, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, hl.L(17.0f), hl.L(17.0f), this.t.g);
                    this.d.c(hl.L(5.0f) + L2, hl.L(12.0f), f6, n, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final void c(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb2.c(android.graphics.Canvas):void");
    }
}
