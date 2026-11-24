package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q24 extends EditTextBoldCursor {
    public final byte M1;
    public final s24 N1;

    public q24(s24 s24Var, Context context, int i) {
        super(context);
        this.N1 = s24Var;
        this.M1 = i;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        s24 s24Var;
        View view;
        u46 u46Var;
        ?? r16;
        r59 r59Var;
        s24 s24Var2;
        int i3;
        boolean z;
        boolean z2;
        f24 f24Var;
        float f;
        s24 s24Var3 = this.N1;
        e34 e34Var = s24Var3.H;
        q24 q24Var = s24Var3.d;
        if (!q24Var.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            int i4 = 2;
            if (!e34Var.u1.z()) {
                r59 r59Var2 = e34Var.E0;
                r59 r59Var3 = e34Var.Q;
                j24 j24Var = e34Var.k0;
                r59 r59Var4 = e34Var.i0;
                AnimatorSet animatorSet = e34Var.N0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    e34Var.N0 = null;
                }
                boolean z3 = false;
                e34Var.J0 = false;
                e34Var.r0 = false;
                e34Var.d0 = false;
                int i5 = 0;
                while (i5 < 3) {
                    if (i5 == 0) {
                        s24Var = e34Var.W;
                        view = e34Var.J;
                        u46Var = e34Var.R;
                        r16 = z3;
                        r59Var = r59Var3;
                    } else if (i5 == 1) {
                        s24Var = e34Var.p0;
                        view = e34Var.q0;
                        u46Var = e34Var.j0;
                        r16 = z3;
                        r59Var = r59Var4;
                    } else {
                        s24Var = e34Var.H0;
                        view = e34Var.C0;
                        u46Var = e34Var.F0;
                        r16 = z3;
                        r59Var = r59Var2;
                    }
                    if (s24Var == null) {
                        s24Var2 = s24Var3;
                        i3 = i4;
                        z = r16;
                    } else if (s24Var3 == s24Var && (f24Var = e34Var.u1) != null && f24Var.A()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        e34Var.N0 = animatorSet2;
                        Property property = View.TRANSLATION_Y;
                        if (view != null && i5 != i4) {
                            int i6 = i4;
                            s24Var2 = s24Var3;
                            float[] fArr = new float[1];
                            fArr[r16] = -gm.L(40.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                            float[] fArr2 = new float[1];
                            fArr2[r16] = -gm.L(36.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r59Var, property, fArr2);
                            float[] fArr3 = new float[1];
                            fArr3[r16] = gm.L(0.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s24Var, property, fArr3);
                            Animator[] animatorArr = new Animator[3];
                            animatorArr[r16] = ofFloat;
                            animatorArr[1] = ofFloat2;
                            animatorArr[i6] = ofFloat3;
                            animatorSet2.playTogether(animatorArr);
                        } else {
                            s24Var2 = s24Var3;
                            if (i5 == i4) {
                                f = 0.0f;
                            } else {
                                f = -gm.L(36.0f);
                            }
                            float[] fArr4 = new float[1];
                            fArr4[r16] = f;
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r59Var, property, fArr4);
                            float[] fArr5 = new float[1];
                            fArr5[r16] = gm.L(0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s24Var, property, fArr5);
                            Animator[] animatorArr2 = new Animator[2];
                            animatorArr2[r16] = ofFloat4;
                            animatorArr2[1] = ofFloat5;
                            animatorSet2.playTogether(animatorArr2);
                        }
                        e34Var.N0.setDuration(220L);
                        e34Var.N0.setInterpolator(d53.f);
                        e34Var.N0.addListener(new u5(e34Var, r59Var, (byte) 20));
                        e34Var.N0.start();
                        z = r16;
                        i3 = 2;
                    } else {
                        s24Var2 = s24Var3;
                        s24Var.setTranslationY(gm.L(0.0f));
                        i3 = 2;
                        if (view != null && i5 != 2) {
                            view.setTranslationY(-gm.L(40.0f));
                        }
                        if (r59Var == r59Var2) {
                            int i7 = r16;
                            r59Var.setPadding(i7, i7, i7, e34Var.q2);
                        } else {
                            int i8 = r16;
                            if (r59Var == r59Var3) {
                                r59Var.setPadding(gm.L(5.0f), i8, gm.L(5.0f), e34Var.q2);
                            } else if (r59Var == r59Var4) {
                                r59Var.setPadding(i8, e34Var.c1, i8, e34Var.q2);
                            }
                        }
                        if (r59Var == r59Var4) {
                            if (e34Var.o0.y.size() > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            j24Var.L = z2;
                            if (z2) {
                                j24Var.G("", true);
                                if (r59Var4.getAdapter() != j24Var) {
                                    r59Var4.setAdapter(j24Var);
                                }
                            }
                        }
                        z = false;
                        u46Var.g1(0, 0);
                    }
                    i5++;
                    i4 = i3;
                    z3 = z;
                    s24Var3 = s24Var2;
                }
                i = i4;
                e34Var.L(z3);
            } else {
                i = 2;
            }
            f24 f24Var2 = e34Var.u1;
            if (this.M1 == 1) {
                i2 = i;
            } else {
                i2 = 1;
            }
            f24Var2.j(i2);
            q24Var.requestFocus();
            gm.E3(q24Var);
        }
        return super.onTouchEvent(motionEvent);
    }
}
