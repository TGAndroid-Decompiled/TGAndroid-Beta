package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a24 extends EditTextBoldCursor {
    public final byte N1;
    public final c24 O1;

    public a24(c24 c24Var, Context context, int i) {
        super(context);
        this.O1 = c24Var;
        this.N1 = i;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        c24 c24Var;
        View view;
        x46 x46Var;
        ?? r16;
        d79 d79Var;
        c24 c24Var2;
        int i3;
        boolean z;
        boolean z2;
        p14 p14Var;
        float f;
        c24 c24Var3 = this.O1;
        o24 o24Var = c24Var3.H;
        a24 a24Var = c24Var3.d;
        if (!a24Var.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            int i4 = 2;
            if (!o24Var.u1.z()) {
                d79 d79Var2 = o24Var.E0;
                d79 d79Var3 = o24Var.Q;
                t14 t14Var = o24Var.k0;
                d79 d79Var4 = o24Var.i0;
                AnimatorSet animatorSet = o24Var.N0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    o24Var.N0 = null;
                }
                boolean z3 = false;
                o24Var.J0 = false;
                o24Var.r0 = false;
                o24Var.d0 = false;
                int i5 = 0;
                while (i5 < 3) {
                    if (i5 == 0) {
                        c24Var = o24Var.W;
                        view = o24Var.J;
                        x46Var = o24Var.R;
                        r16 = z3;
                        d79Var = d79Var3;
                    } else if (i5 == 1) {
                        c24Var = o24Var.p0;
                        view = o24Var.q0;
                        x46Var = o24Var.j0;
                        r16 = z3;
                        d79Var = d79Var4;
                    } else {
                        c24Var = o24Var.H0;
                        view = o24Var.C0;
                        x46Var = o24Var.F0;
                        r16 = z3;
                        d79Var = d79Var2;
                    }
                    if (c24Var == null) {
                        c24Var2 = c24Var3;
                        i3 = i4;
                        z = r16;
                    } else if (c24Var3 == c24Var && (p14Var = o24Var.u1) != null && p14Var.A()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        o24Var.N0 = animatorSet2;
                        Property property = View.TRANSLATION_Y;
                        if (view != null && i5 != i4) {
                            int i6 = i4;
                            c24Var2 = c24Var3;
                            float[] fArr = new float[1];
                            fArr[r16] = -hl.L(40.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                            float[] fArr2 = new float[1];
                            fArr2[r16] = -hl.L(36.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d79Var, property, fArr2);
                            float[] fArr3 = new float[1];
                            fArr3[r16] = hl.L(0.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c24Var, property, fArr3);
                            Animator[] animatorArr = new Animator[3];
                            animatorArr[r16] = ofFloat;
                            animatorArr[1] = ofFloat2;
                            animatorArr[i6] = ofFloat3;
                            animatorSet2.playTogether(animatorArr);
                        } else {
                            c24Var2 = c24Var3;
                            if (i5 == i4) {
                                f = 0.0f;
                            } else {
                                f = -hl.L(36.0f);
                            }
                            float[] fArr4 = new float[1];
                            fArr4[r16] = f;
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d79Var, property, fArr4);
                            float[] fArr5 = new float[1];
                            fArr5[r16] = hl.L(0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c24Var, property, fArr5);
                            Animator[] animatorArr2 = new Animator[2];
                            animatorArr2[r16] = ofFloat4;
                            animatorArr2[1] = ofFloat5;
                            animatorSet2.playTogether(animatorArr2);
                        }
                        o24Var.N0.setDuration(220L);
                        o24Var.N0.setInterpolator(k43.f);
                        o24Var.N0.addListener(new v5(o24Var, d79Var, (byte) 20));
                        o24Var.N0.start();
                        z = r16;
                        i3 = 2;
                    } else {
                        c24Var2 = c24Var3;
                        c24Var.setTranslationY(hl.L(0.0f));
                        i3 = 2;
                        if (view != null && i5 != 2) {
                            view.setTranslationY(-hl.L(40.0f));
                        }
                        if (d79Var == d79Var2) {
                            int i7 = r16;
                            d79Var.setPadding(i7, i7, i7, o24Var.q2);
                        } else {
                            int i8 = r16;
                            if (d79Var == d79Var3) {
                                d79Var.setPadding(hl.L(5.0f), i8, hl.L(5.0f), o24Var.q2);
                            } else if (d79Var == d79Var4) {
                                d79Var.setPadding(i8, o24Var.c1, i8, o24Var.q2);
                            }
                        }
                        if (d79Var == d79Var4) {
                            if (o24Var.o0.y.size() > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            t14Var.L = z2;
                            if (z2) {
                                t14Var.G("", true);
                                if (d79Var4.getAdapter() != t14Var) {
                                    d79Var4.setAdapter(t14Var);
                                }
                            }
                        }
                        z = false;
                        x46Var.g1(0, 0);
                    }
                    i5++;
                    i4 = i3;
                    z3 = z;
                    c24Var3 = c24Var2;
                }
                i = i4;
                o24Var.L(z3);
            } else {
                i = 2;
            }
            p14 p14Var2 = o24Var.u1;
            if (this.N1 == 1) {
                i2 = i;
            } else {
                i2 = 1;
            }
            p14Var2.j(i2);
            a24Var.requestFocus();
            hl.E3(a24Var);
        }
        return super.onTouchEvent(motionEvent);
    }
}
