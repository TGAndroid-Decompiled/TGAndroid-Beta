package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f14 extends EditTextBoldCursor {
    public final byte M1;
    public final h14 N1;

    public f14(h14 h14Var, Context context, int i) {
        super(context);
        this.N1 = h14Var;
        this.M1 = i;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        h14 h14Var;
        View view;
        t26 t26Var;
        ?? r16;
        o39 o39Var;
        h14 h14Var2;
        int i3;
        boolean z;
        boolean z2;
        u04 u04Var;
        float f;
        h14 h14Var3 = this.N1;
        t14 t14Var = h14Var3.H;
        f14 f14Var = h14Var3.d;
        if (!f14Var.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            int i4 = 2;
            if (!t14Var.u1.z()) {
                o39 o39Var2 = t14Var.E0;
                o39 o39Var3 = t14Var.Q;
                y04 y04Var = t14Var.k0;
                o39 o39Var4 = t14Var.i0;
                AnimatorSet animatorSet = t14Var.N0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    t14Var.N0 = null;
                }
                boolean z3 = false;
                t14Var.J0 = false;
                t14Var.r0 = false;
                t14Var.d0 = false;
                int i5 = 0;
                while (i5 < 3) {
                    if (i5 == 0) {
                        h14Var = t14Var.W;
                        view = t14Var.J;
                        t26Var = t14Var.R;
                        r16 = z3;
                        o39Var = o39Var3;
                    } else if (i5 == 1) {
                        h14Var = t14Var.p0;
                        view = t14Var.q0;
                        t26Var = t14Var.j0;
                        r16 = z3;
                        o39Var = o39Var4;
                    } else {
                        h14Var = t14Var.H0;
                        view = t14Var.C0;
                        t26Var = t14Var.F0;
                        r16 = z3;
                        o39Var = o39Var2;
                    }
                    if (h14Var == null) {
                        h14Var2 = h14Var3;
                        i3 = i4;
                        z = r16;
                    } else if (h14Var3 == h14Var && (u04Var = t14Var.u1) != null && u04Var.A()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        t14Var.N0 = animatorSet2;
                        Property property = View.TRANSLATION_Y;
                        if (view != null && i5 != i4) {
                            int i6 = i4;
                            h14Var2 = h14Var3;
                            float[] fArr = new float[1];
                            fArr[r16] = -gl.L(40.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                            float[] fArr2 = new float[1];
                            fArr2[r16] = -gl.L(36.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o39Var, property, fArr2);
                            float[] fArr3 = new float[1];
                            fArr3[r16] = gl.L(0.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h14Var, property, fArr3);
                            Animator[] animatorArr = new Animator[3];
                            animatorArr[r16] = ofFloat;
                            animatorArr[1] = ofFloat2;
                            animatorArr[i6] = ofFloat3;
                            animatorSet2.playTogether(animatorArr);
                        } else {
                            h14Var2 = h14Var3;
                            if (i5 == i4) {
                                f = 0.0f;
                            } else {
                                f = -gl.L(36.0f);
                            }
                            float[] fArr4 = new float[1];
                            fArr4[r16] = f;
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o39Var, property, fArr4);
                            float[] fArr5 = new float[1];
                            fArr5[r16] = gl.L(0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h14Var, property, fArr5);
                            Animator[] animatorArr2 = new Animator[2];
                            animatorArr2[r16] = ofFloat4;
                            animatorArr2[1] = ofFloat5;
                            animatorSet2.playTogether(animatorArr2);
                        }
                        t14Var.N0.setDuration(220L);
                        t14Var.N0.setInterpolator(s33.f);
                        t14Var.N0.addListener(new u5(t14Var, o39Var, (byte) 20));
                        t14Var.N0.start();
                        z = r16;
                        i3 = 2;
                    } else {
                        h14Var2 = h14Var3;
                        h14Var.setTranslationY(gl.L(0.0f));
                        i3 = 2;
                        if (view != null && i5 != 2) {
                            view.setTranslationY(-gl.L(40.0f));
                        }
                        if (o39Var == o39Var2) {
                            int i7 = r16;
                            o39Var.setPadding(i7, i7, i7, t14Var.q2);
                        } else {
                            int i8 = r16;
                            if (o39Var == o39Var3) {
                                o39Var.setPadding(gl.L(5.0f), i8, gl.L(5.0f), t14Var.q2);
                            } else if (o39Var == o39Var4) {
                                o39Var.setPadding(i8, t14Var.c1, i8, t14Var.q2);
                            }
                        }
                        if (o39Var == o39Var4) {
                            if (t14Var.o0.y.size() > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            y04Var.L = z2;
                            if (z2) {
                                y04Var.G("", true);
                                if (o39Var4.getAdapter() != y04Var) {
                                    o39Var4.setAdapter(y04Var);
                                }
                            }
                        }
                        z = false;
                        t26Var.g1(0, 0);
                    }
                    i5++;
                    i4 = i3;
                    z3 = z;
                    h14Var3 = h14Var2;
                }
                i = i4;
                t14Var.M(z3);
            } else {
                i = 2;
            }
            u04 u04Var2 = t14Var.u1;
            if (this.M1 == 1) {
                i2 = i;
            } else {
                i2 = 1;
            }
            u04Var2.j(i2);
            f14Var.requestFocus();
            gl.F3(f14Var);
        }
        return super.onTouchEvent(motionEvent);
    }
}
