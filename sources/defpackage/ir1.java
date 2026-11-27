package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.e;
public final class ir1 extends vic {
    public final byte W;
    public final Object a0;

    public ir1(byte b, Context context, Object obj) {
        super(context, null);
        this.W = b;
        this.a0 = obj;
    }

    @Override
    public final void B(int i) {
        switch (this.W) {
            case 0:
                if (i == 0) {
                    zu1 zu1Var = (zu1) this.a0;
                    if (zu1Var.H1) {
                        zu1Var.H1 = false;
                        zu1Var.F1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final int I() {
        switch (this.W) {
            case 10:
                return 12;
            default:
                return super.I();
        }
    }

    @Override
    public final boolean c(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir1.c(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean f(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            case 4:
                return !((lm7) this.a0).t0(false);
            default:
                return super.f(motionEvent);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                return false;
            case 4:
                return !((lm7) this.a0).t0(true);
            case 7:
                return false;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void t(View view, View view2, int i, int i2) {
        switch (this.W) {
            case 8:
                w9b w9bVar = (w9b) this.a0;
                if (w9bVar.d) {
                    w9bVar.G0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void v() {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() == 1) {
                    ((xo2) this.a0).u1.d.g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w() {
        lb9 lb9Var;
        switch (this.W) {
            case 4:
                lm7 lm7Var = (lm7) this.a0;
                if (lm7Var.M && TextUtils.isEmpty(lm7Var.Q)) {
                    lm7Var.i0();
                    return;
                }
                return;
            case 7:
                if ((getCurrentView() instanceof mb9) && (lb9Var = ((mb9) getCurrentView()).n) != null) {
                    hl.t1(lb9Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void x(boolean z) {
        ir1 ir1Var;
        int i;
        byte b = this.W;
        Object obj = this.a0;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                zu1Var.m1.getClass();
                zu1Var.m1.getClass();
                zu1Var.x5();
                return;
            case 1:
                ((xo2) obj).b.invalidate();
                return;
            case 2:
                zw3 zw3Var = (zw3) obj;
                ir1 ir1Var2 = zw3Var.p1;
                yw3 yw3Var = zw3Var.q1;
                if (yw3Var != null) {
                    yw3Var.G = ir1Var2.getPositionAnimated();
                    yw3Var.invalidate();
                }
                zw3Var.b.invalidate();
                invalidate();
                zw3.C1 = ir1Var2.getCurrentPosition();
                return;
            case 3:
                ((tk7) obj).b.invalidate();
                return;
            case 4:
                lm7 lm7Var = (lm7) obj;
                cm7 cm7Var = lm7Var.x;
                if (cm7Var != null && (ir1Var = lm7Var.w) != null && !cm7Var.Q) {
                    int currentPosition = ir1Var.getCurrentPosition();
                    float positionAnimated = lm7Var.w.getPositionAnimated();
                    float f = currentPosition;
                    float abs = Math.abs(positionAnimated - f);
                    int i2 = (abs > 0.001f ? 1 : (abs == 0.001f ? 0 : -1));
                    cm7 cm7Var2 = lm7Var.x;
                    if (i2 < 0) {
                        cm7Var2.j(1.0f, currentPosition);
                    } else {
                        if (positionAnimated > f) {
                            i = currentPosition + 1;
                        } else {
                            i = currentPosition - 1;
                        }
                        cm7Var2.j(abs, i);
                    }
                }
                lm7Var.N0();
                return;
            case 5:
                h48 h48Var = (h48) obj;
                float positionAnimated2 = h48Var.J.getPositionAnimated();
                h48Var.N.setSelected(positionAnimated2);
                h48Var.e.setProgressToGradient(1.0f - ete.a((positionAnimated2 - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                h48Var.K0();
                a48 F0 = h48Var.F0();
                c51 c51Var = h48Var.R;
                if (c51Var != null && F0 != null && F0 != h48Var.S) {
                    h48Var.S = F0;
                    ym4 ym4Var = F0.e;
                    c51Var.i((CharSequence) ym4Var.b, true, true);
                    h48Var.R.g((SpannableStringBuilder) ym4Var.c, true);
                    return;
                }
                return;
            case 6:
                ((ji8) obj).e();
                return;
            case 7:
                ((nb9) obj).b.invalidate();
                return;
            case 8:
                ((w9b) obj).b.invalidate();
                return;
            case 9:
                ((ktb) obj).e();
                return;
            default:
                uqc uqcVar = (uqc) obj;
                uqcVar.f1();
                wsc wscVar = uqcVar.k0;
                if (wscVar != null && wscVar.i1) {
                    wscVar.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public final void z(int i) {
        ltc ltcVar;
        switch (this.W) {
            case 10:
                uqc uqcVar = (uqc) this.a0;
                uqcVar.f0 = i;
                if (i != 1 && (ltcVar = uqcVar.j0) != null) {
                    ltcVar.b(false);
                }
                if (i == 1) {
                    uqcVar.s0.post(new cpc(uqcVar, (byte) 3));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ir1(e eVar, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.W = b;
        this.a0 = eVar;
    }
}
