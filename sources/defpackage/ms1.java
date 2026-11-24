package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ms1 extends ChatActivityEnterView {
    public int A7;
    public int B7;
    public int C7;
    public final yv1 D7;

    public ms1(yv1 yv1Var, Activity activity, ela elaVar, yv1 yv1Var2, boolean z, ylb ylbVar) {
        super(activity, elaVar, yv1Var2, z, ylbVar);
        this.D7 = yv1Var;
    }

    public final void M2() {
        a aVar;
        d53 d53Var;
        d53 d53Var2;
        yv1 yv1Var = this.D7;
        aVar = ((d) yv1Var).actionBar;
        if (!aVar.y() && !yv1Var.c8()) {
            int backgroundTop = getBackgroundTop();
            int i = yv1Var.d0;
            if (i != 0 && backgroundTop != i && this.A7 == yv1Var.m1.getMeasuredHeight()) {
                int i2 = (this.J2 + yv1Var.d0) - backgroundTop;
                setAnimatedTop(i2);
                this.o2.invalidate();
                ValueAnimator valueAnimator = yv1Var.M9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    yv1Var.M9.cancel();
                }
                View view = this.w2;
                if (view != null && view.getVisibility() == 0) {
                    this.w2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + this.J2);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i2, 0.0f);
                yv1Var.M9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ms1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        byte b = r2;
                        ms1 ms1Var = this.b;
                        switch (b) {
                            case 0:
                                yv1 yv1Var2 = ms1Var.D7;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                ms1Var.setAnimatedTop((int) floatValue);
                                View view2 = ms1Var.w2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    ms1Var.w2.setTranslationY(((1.0f - ms1Var.getTopViewEnterProgress()) * ms1Var.w2.getLayoutParams().height) + floatValue);
                                } else {
                                    yv1Var2.O7();
                                    yv1Var2.Q7();
                                }
                                ms1Var.o2.invalidate();
                                ms1Var.invalidate();
                                return;
                            default:
                                ms1Var.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                yv1Var.M9.addListener(new b91(this, (byte) 8));
                yv1Var.M9.setDuration(D0());
                ValueAnimator valueAnimator2 = yv1Var.M9;
                d53 d53Var3 = wb2.V;
                if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (d53Var2 = this.H1) != null) {
                    d53Var3 = d53Var2;
                }
                valueAnimator2.setInterpolator(d53Var3);
                yv1Var.M9.setStartDelay(getLineAnimationDelay());
                if (!yv1Var.L9) {
                    yv1Var.M9.start();
                }
                yv1Var.O7();
                yv1Var.Q7();
                yv1Var.d0 = 0;
            } else if (this.A7 != yv1Var.m1.getMeasuredHeight()) {
                yv1Var.d0 = 0;
            }
            if (this.d4) {
                float scrollY = (this.C7 - this.F0.getScrollY()) + (this.B7 - this.F0.getMeasuredHeight());
                sy1 sy1Var = this.F0;
                sy1Var.setOffsetY(sy1Var.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ms1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        byte b = r2;
                        ms1 ms1Var = this.b;
                        switch (b) {
                            case 0:
                                yv1 yv1Var2 = ms1Var.D7;
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                ms1Var.setAnimatedTop((int) floatValue);
                                View view2 = ms1Var.w2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    ms1Var.w2.setTranslationY(((1.0f - ms1Var.getTopViewEnterProgress()) * ms1Var.w2.getLayoutParams().height) + floatValue);
                                } else {
                                    yv1Var2.O7();
                                    yv1Var2.Q7();
                                }
                                ms1Var.o2.invalidate();
                                ms1Var.invalidate();
                                return;
                            default:
                                ms1Var.F0.setOffsetY(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator3 = yv1Var.N9;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                yv1Var.N9 = ofFloat2;
                ofFloat2.setDuration(D0());
                d53 d53Var4 = wb2.V;
                if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (d53Var = this.H1) != null) {
                    d53Var4 = d53Var;
                }
                ofFloat2.setInterpolator(d53Var4);
                ofFloat2.setStartDelay(getLineAnimationDelay());
                ofFloat2.start();
                this.d4 = false;
            }
            this.A7 = yv1Var.m1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator4 = yv1Var.N9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = yv1Var.M9;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        yv1Var.d0 = 0;
        this.d4 = false;
    }

    @Override
    public final void N0(boolean z) {
        super.N0(z);
        yv1 yv1Var = this.D7;
        en1 en1Var = yv1Var.Zb;
        if (en1Var != null) {
            gm.c3(en1Var);
            yv1Var.Zb = null;
        }
    }

    @Override
    public final void c1(float f) {
        this.D7.D5();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e1(int i, int i2) {
        a aVar;
        a aVar2;
        yv1 yv1Var = this.D7;
        if (yv1Var.a0 != null) {
            if (yv1Var.A0 != null) {
                if (yv1Var.bb <= 0.0f) {
                    aVar = ((d) yv1Var).actionBar;
                    if (aVar != null) {
                        aVar2 = ((d) yv1Var).actionBar;
                        if (aVar2.y()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.d4 = true;
            this.B7 = this.F0.getMeasuredHeight();
            this.C7 = this.F0.getScrollY();
            yv1Var.m1.invalidate();
            yv1Var.d0 = yv1Var.a0.getBackgroundTop();
        }
    }

    @Override
    public final void j1() {
        if (this.D7.cb != null) {
            return;
        }
        super.j1();
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
    public final boolean p1() {
        if (!this.D7.f6) {
            return false;
        }
        return true;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        yv1 yv1Var = this.D7;
        jif jifVar = yv1Var.ud;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getMeasuredWidth() > 0 && !yv1Var.kd) {
            z2 = true;
        }
        jifVar.s(1, z, z2);
    }
}
