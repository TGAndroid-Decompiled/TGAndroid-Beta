package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
public final class ib2 {
    public final gb2 a;
    public boolean b;
    public tgb c;
    public tgb d;
    public n41 e;
    public n41 f;
    public StaticLayout g;
    public StaticLayout h;
    public i46 i;
    public m46 j;
    public boolean k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public n79 t;
    public boolean u;
    public boolean v;

    public ib2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        float f;
        int i;
        int L;
        int extraTextX;
        int i2;
        boolean z;
        boolean z2;
        bb2 bb2Var;
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        if (!this.b || this.c == null || this.d == null) {
            return false;
        }
        if (this.e == null) {
            this.e = new n41(gb2Var);
        }
        if (this.f == null) {
            n41 n41Var = new n41(gb2Var);
            this.f = n41Var;
            n41Var.f = new sa2(gb2Var, (byte) 0);
        }
        float backgroundDrawableRight = gb2Var.getBackgroundDrawableRight();
        if (nb2Var != null) {
            f = nb2Var.i0;
        } else {
            f = 0.0f;
        }
        float f2 = backgroundDrawableRight + f;
        if (gb2Var.Q5.O3() && !gb2Var.C6 && !gb2Var.K) {
            i = 6;
        } else {
            i = 0;
        }
        float L2 = (f2 - gl.L(10 + i)) - gb2Var.getExtraTextX();
        f27 f27Var = gb2Var.L;
        if (f27Var != null && !f27Var.i) {
            i2 = (int) gb2Var.s3;
        } else {
            float f3 = 12.0f;
            if (gb2Var.Q5.O3()) {
                i2 = gb2Var.getExtraTextX() + gl.L(12.0f) + gb2Var.N6;
                if (gb2Var.Q5.D == 19) {
                    i2 -= Math.max(0, (gl.L(14.0f) + (Math.max(gb2Var.X7, gb2Var.Z7) + i2)) - gl.q.x);
                }
            } else {
                boolean z3 = gb2Var.C6;
                int i3 = gb2Var.N6;
                if (z3) {
                    L = gl.L(12.0f) + i3;
                    extraTextX = gb2Var.getExtraTextX();
                } else {
                    if (!gb2Var.K) {
                        f3 = 18.0f;
                    }
                    L = gl.L(f3) + i3;
                    extraTextX = gb2Var.getExtraTextX();
                }
                i2 = L + extraTextX;
            }
        }
        int L3 = ((int) (i2 + nb2Var.h0)) - gl.L(1.33f);
        int i4 = gb2Var.r0;
        float f4 = L3;
        int i5 = (int) (L2 - f4);
        int x = (int) motionEvent.getX();
        int P1 = (int) gb2Var.P1(motionEvent);
        int L4 = (int) (gl.L(10.0f) + L3 + this.c.c + gl.L(4.0f));
        int L5 = gl.L(4.33f) + i4;
        RectF rectF = gl.P;
        float f5 = L4;
        rectF.set(f5, L5, this.d.c + f5 + gl.L(4.0f), gl.L(17.33f) + L5);
        boolean contains = rectF.contains(motionEvent.getX(), gb2Var.P1(motionEvent));
        rectF.set(f4, i4, L3 + i5, this.r + i4);
        if (!contains && !gb2Var.Nc && this.j == null && rectF.contains(motionEvent.getX(), gb2Var.P1(motionEvent))) {
            z = true;
        } else {
            z = false;
        }
        if (((z && !gb2Var.Nc) || this.j != null) && this.g != null) {
            if (this.i == null) {
                i46 i46Var = new i46(gb2Var);
                this.i = i46Var;
                i46Var.d = new sa2(gb2Var, (byte) 0);
            }
            int L6 = (gl.L(10.0f) + L3) - this.o;
            int L7 = gl.L(22.0f) + i4;
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
                                characterStyleArr = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, f4c.class);
                            }
                            if (characterStyleArr.length != 0 && ((!(characterStyleArr[0] instanceof d4c) || d4c.h) && !gl.A1())) {
                                int action = motionEvent.getAction();
                                m46 m46Var = this.j;
                                if (action == 0) {
                                    if (m46Var == null || m46Var.i != characterStyleArr[0]) {
                                        this.i.l(m46Var, true);
                                        CharacterStyle characterStyle = characterStyleArr[0];
                                        wjb wjbVar = gb2Var.cc;
                                        float f7 = i6;
                                        float[] fArr = gb2.Id;
                                        m46 m46Var2 = new m46(characterStyle, wjbVar, f6, f7, 0);
                                        this.j = m46Var2;
                                        n79 n79Var = this.t;
                                        if (n79Var != null) {
                                            m46Var2.d(bkb.p1(0.1f, n79Var.h()));
                                        }
                                        try {
                                            b46 b = this.j.b();
                                            int[] Z1 = gb2.Z1(spannable, this.j.i);
                                            b.d(this.g, Z1[0], 0.0f);
                                            this.g.getSelectionPath(Z1[0], Z1[1], b);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        this.i.a(this.j, 1);
                                        z = false;
                                    }
                                    gb2Var.invalidate();
                                } else if (m46Var != null) {
                                    CharacterStyle characterStyle2 = characterStyleArr[0];
                                    CharacterStyle characterStyle3 = m46Var.i;
                                    if (characterStyle2 == characterStyle3) {
                                        gb2Var.eb.O(gb2Var, characterStyle3, false);
                                        gb2Var.i3(1);
                                        this.u = false;
                                        this.v = false;
                                        this.j = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                } else {
                    gb2Var.i3(1);
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
                bb2 bb2Var2 = gb2Var.eb;
                if (bb2Var2 != null) {
                    bb2Var2.v0(gb2Var, (int) ((this.d.c / 2.0f) + gl.L(4.0f) + L4), L5);
                }
            } else if (this.v && !nb2Var.a3 && (bb2Var = gb2Var.eb) != null) {
                bb2Var.X0(gb2Var);
            }
            this.u = false;
            this.v = false;
        } else if (motionEvent.getAction() == 3) {
            this.u = false;
            this.v = false;
            i46 i46Var2 = this.i;
            if (i46Var2 != null) {
                i46Var2.e(true);
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
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        c27 c27Var = gb2Var.M;
        if (c27Var == null || c27Var.h) {
            float f5 = 1.0f;
            if (this.b) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (nb2Var.S2) {
                f = gl.R1(1.0f - f, f, nb2Var.L1);
            }
            float f6 = f * 1.0f;
            if (f6 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = gb2Var.getBackgroundDrawableRight();
            if (nb2Var != null) {
                f2 = nb2Var.i0;
            } else {
                f2 = 0.0f;
            }
            float f7 = backgroundDrawableRight + f2;
            if (gb2Var.Q5.O3() && !gb2Var.C6 && !gb2Var.K) {
                i = 6;
            } else {
                i = 0;
            }
            float L3 = (f7 - gl.L(10 + i)) - gb2Var.getExtraTextX();
            f27 f27Var = gb2Var.L;
            if (f27Var != null && !f27Var.i) {
                i2 = (int) gb2Var.s3;
            } else if (gb2Var.Q5.O3()) {
                i2 = gb2Var.getExtraTextX() + gl.L(12.0f) + gb2Var.N6;
                if (gb2Var.Q5.D == 19) {
                    i2 -= Math.max(0, (gl.L(14.0f) + (Math.max(gb2Var.X7, gb2Var.Z7) + i2)) - gl.q.x);
                }
            } else {
                boolean z = gb2Var.C6;
                int i3 = gb2Var.N6;
                if (z) {
                    L = gl.L(12.0f) + i3;
                    extraTextX = gb2Var.getExtraTextX();
                } else {
                    if (gb2Var.K) {
                        f3 = 12.0f;
                    } else {
                        f3 = 18.0f;
                    }
                    L = gl.L(f3) + i3;
                    extraTextX = gb2Var.getExtraTextX();
                }
                i2 = L + extraTextX;
            }
            int L4 = ((int) (i2 + nb2Var.h0)) - gl.L(1.33f);
            int i4 = gb2Var.r0;
            float f8 = L4;
            int i5 = (int) (L3 - f8);
            int i6 = this.r;
            if (nb2Var.Y2) {
                i6 = gl.U1(nb2Var.L1, nb2Var.U2, i6);
            }
            if (this.n && gb2Var.getPrimaryMessageObject() != null) {
                boolean z2 = gb2Var.getPrimaryMessageObject().c3;
            }
            boolean z3 = nb2Var.a3;
            n79 n79Var = this.t;
            if (n79Var == null) {
                n79Var = new n79(gb2Var);
                this.t = n79Var;
            }
            int n = n79Var.n(gb2Var.cc);
            canvas.save();
            canvas.translate(f8, i4);
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, i5, i6);
            n41 n41Var = this.f;
            if (n41Var != null) {
                f4 = n41Var.a(0.01f);
            } else {
                f4 = 1.0f;
            }
            canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
            this.t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f6, false, false);
            this.t.f(canvas, rectF, f6);
            tgb tgbVar = this.c;
            if (tgbVar != null) {
                tgbVar.c(gl.L(10.0f), gl.L(12.0f), f6, n, canvas);
                if (this.d != null) {
                    rectF.set((int) (gl.L(10.0f) + this.c.c + gl.L(4.0f)), gl.L(4.33f), gl.L(10.0f) + L2 + this.d.c, gl.L(21.66f));
                    n41 n41Var2 = this.e;
                    if (n41Var2 != null) {
                        f5 = n41Var2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f5, f5, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, gl.L(17.0f), gl.L(17.0f), this.t.g);
                    this.d.c(gl.L(5.0f) + L2, gl.L(12.0f), f6, n, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final void c(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib2.c(android.graphics.Canvas):void");
    }
}
