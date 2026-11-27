package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class nr1 extends ChatActivityEnterView {
    public int Y7;
    public int Z7;
    public int a8;
    public final zu1 b8;

    public nr1(zu1 zu1Var, Activity activity, wma wmaVar, zu1 zu1Var2, boolean z, vnb vnbVar) {
        super(activity, wmaVar, zu1Var2, z, vnbVar);
        this.b8 = zu1Var;
    }

    @Override
    public final void R0(boolean z) {
        super.R0(z);
        zu1 zu1Var = this.b8;
        hm1 hm1Var = zu1Var.cc;
        if (hm1Var != null) {
            hl.c3(hm1Var);
            zu1Var.cc = null;
        }
    }

    public final void X2() {
        a aVar;
        k43 k43Var;
        k43 k43Var2;
        zu1 zu1Var = this.b8;
        aVar = ((e) zu1Var).actionBar;
        if (!aVar.z() && !zu1Var.c8()) {
            int backgroundTop = getBackgroundTop();
            int i = zu1Var.d0;
            if (i != 0 && backgroundTop != i && this.Y7 == zu1Var.m1.getMeasuredHeight()) {
                int i2 = (this.I2 + zu1Var.d0) - backgroundTop;
                setAnimatedTop(i2);
                this.n2.invalidate();
                ValueAnimator valueAnimator = zu1Var.M9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    zu1Var.M9.cancel();
                }
                View view = this.v2;
                if (view != null && view.getVisibility() == 0) {
                    this.v2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height) + this.I2);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i2, 0.0f);
                zu1Var.M9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final nr1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        nr1 nr1Var = this.b;
                        switch (b) {
                            case 0:
                                zu1 zu1Var2 = nr1Var.b8;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                nr1Var.setAnimatedTop((int) floatValue);
                                View view2 = nr1Var.v2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    nr1Var.v2.setTranslationY(((1.0f - nr1Var.getTopViewEnterProgress()) * nr1Var.v2.getLayoutParams().height) + floatValue);
                                } else {
                                    zu1Var2.O7();
                                    zu1Var2.Q7();
                                }
                                nr1Var.n2.invalidate();
                                nr1Var.invalidate();
                                return;
                            default:
                                nr1Var.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                zu1Var.M9.addListener(new jb1(this, (byte) 6));
                zu1Var.M9.setDuration(H0());
                ValueAnimator valueAnimator2 = zu1Var.M9;
                k43 k43Var3 = bb2.V;
                if (this.F1 > 0 && SystemClock.uptimeMillis() < this.F1 && (k43Var2 = this.G1) != null) {
                    k43Var3 = k43Var2;
                }
                valueAnimator2.setInterpolator(k43Var3);
                zu1Var.M9.setStartDelay(getLineAnimationDelay());
                if (!zu1Var.L9) {
                    zu1Var.M9.start();
                }
                zu1Var.O7();
                zu1Var.Q7();
                zu1Var.d0 = 0;
            } else if (this.Y7 != zu1Var.m1.getMeasuredHeight()) {
                zu1Var.d0 = 0;
            }
            if (this.c4) {
                float scrollY = (this.a8 - this.F0.getScrollY()) + (this.Z7 - this.F0.getMeasuredHeight());
                tx1 tx1Var = this.F0;
                tx1Var.setOffsetY(tx1Var.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final nr1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        byte b = r2;
                        nr1 nr1Var = this.b;
                        switch (b) {
                            case 0:
                                zu1 zu1Var2 = nr1Var.b8;
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                nr1Var.setAnimatedTop((int) floatValue);
                                View view2 = nr1Var.v2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    nr1Var.v2.setTranslationY(((1.0f - nr1Var.getTopViewEnterProgress()) * nr1Var.v2.getLayoutParams().height) + floatValue);
                                } else {
                                    zu1Var2.O7();
                                    zu1Var2.Q7();
                                }
                                nr1Var.n2.invalidate();
                                nr1Var.invalidate();
                                return;
                            default:
                                nr1Var.F0.setOffsetY(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator3 = zu1Var.N9;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                zu1Var.N9 = ofFloat2;
                ofFloat2.setDuration(H0());
                k43 k43Var4 = bb2.V;
                if (this.F1 > 0 && SystemClock.uptimeMillis() < this.F1 && (k43Var = this.G1) != null) {
                    k43Var4 = k43Var;
                }
                ofFloat2.setInterpolator(k43Var4);
                ofFloat2.setStartDelay(getLineAnimationDelay());
                ofFloat2.start();
                this.c4 = false;
            }
            this.Y7 = zu1Var.m1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator4 = zu1Var.N9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = zu1Var.M9;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        zu1Var.d0 = 0;
        this.c4 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f1(float f) {
        this.b8.C5();
    }

    @Override
    public final void h1(int i, int i2) {
        a aVar;
        a aVar2;
        zu1 zu1Var = this.b8;
        if (zu1Var.a0 != null) {
            if (zu1Var.A0 != null) {
                if (zu1Var.bb <= 0.0f) {
                    aVar = ((e) zu1Var).actionBar;
                    if (aVar != null) {
                        aVar2 = ((e) zu1Var).actionBar;
                        if (aVar2.z()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.c4 = true;
            this.Z7 = this.F0.getMeasuredHeight();
            this.a8 = this.F0.getScrollY();
            zu1Var.m1.invalidate();
            zu1Var.d0 = zu1Var.a0.getBackgroundTop();
        }
    }

    @Override
    public final void o1() {
        if (this.b8.cb != null) {
            return;
        }
        super.o1();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        zu1 zu1Var = this.b8;
        ykf ykfVar = zu1Var.xd;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getMeasuredWidth() > 0 && !zu1Var.nd) {
            z2 = true;
        }
        ykfVar.s(1, z, z2);
    }

    @Override
    public final boolean u1() {
        if (!this.b8.f6) {
            return false;
        }
        return true;
    }
}
