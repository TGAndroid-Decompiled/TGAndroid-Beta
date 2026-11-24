package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
public final class z5 extends ChangeBounds {
    public final byte a;

    public z5(byte b) {
        this.a = b;
    }

    @Override
    public final void captureEndValues(TransitionValues transitionValues) {
        switch (this.a) {
            case 0:
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof jia) {
                    transitionValues.values.put("text_size", Float.valueOf(((jia) view).getTextPaint().getTextSize()));
                    return;
                }
                return;
            default:
                super.captureEndValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof v24) {
                    int i = ((v24) view2).n;
                    int i2 = ((v24) view2).r;
                    int i3 = ((v24) view2).s;
                    int i4 = ((v24) view2).w;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i2));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i3));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i4));
                    return;
                }
                return;
        }
    }

    @Override
    public final void captureStartValues(TransitionValues transitionValues) {
        switch (this.a) {
            case 0:
                super.captureStartValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof jia) {
                    transitionValues.values.put("text_size", Float.valueOf(((jia) view).getTextPaint().getTextSize()));
                    return;
                }
                return;
            default:
                super.captureStartValues(transitionValues);
                View view2 = transitionValues.view;
                if (view2 instanceof v24) {
                    int i = ((v24) view2).n;
                    int i2 = ((v24) view2).r;
                    int i3 = ((v24) view2).s;
                    int i4 = ((v24) view2).w;
                    transitionValues.values.put("back_color_end_close", Integer.valueOf(i));
                    transitionValues.values.put("round_end_close", Integer.valueOf(i2));
                    transitionValues.values.put("decline_call_alpha_end_close", Integer.valueOf(i3));
                    transitionValues.values.put("close_text_alpha_end_close", Integer.valueOf(i4));
                    return;
                }
                return;
        }
    }

    @Override
    public final Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                if (transitionValues != null && (transitionValues.view instanceof jia)) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (transitionValues2 != null) {
                        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                        float floatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                        transitionValues.view.setScaleX(floatValue);
                        transitionValues.view.setScaleY(floatValue);
                        if (createAnimator != null) {
                            animatorSet.playTogether(createAnimator);
                        }
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, View.SCALE_X, 1.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new y5(transitionValues, (byte) 0));
                    return animatorSet;
                }
                return super.createAnimator(viewGroup, transitionValues, transitionValues2);
            default:
                if (transitionValues != null && transitionValues2 != null && (transitionValues.view instanceof v24)) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    Animator createAnimator2 = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                    if (createAnimator2 != null) {
                        animatorSet2.playTogether(createAnimator2);
                    }
                    Integer num = (Integer) transitionValues2.values.get("decline_call_alpha_end_close");
                    Integer num2 = (Integer) transitionValues.values.get("close_text_alpha_end_close");
                    Integer num3 = (Integer) transitionValues2.values.get("close_text_alpha_end_close");
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(((Integer) transitionValues.values.get("back_color_end_close")).intValue(), ((Integer) transitionValues2.values.get("back_color_end_close")).intValue());
                    valueAnimator.setEvaluator(new ArgbEvaluator());
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b = r2;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b) {
                                case 0:
                                    ((v24) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((v24) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((v24) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((v24) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(valueAnimator);
                    ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("round_end_close")).intValue(), ((Integer) transitionValues2.values.get("round_end_close")).intValue());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b = r2;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b) {
                                case 0:
                                    ((v24) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((v24) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((v24) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((v24) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt);
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(((Integer) transitionValues.values.get("decline_call_alpha_end_close")).intValue(), num.intValue(), num.intValue(), num.intValue(), num.intValue(), num.intValue(), num.intValue());
                    ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b = r2;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b) {
                                case 0:
                                    ((v24) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((v24) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((v24) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((v24) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt2);
                    ValueAnimator ofInt3 = ValueAnimator.ofInt(num2.intValue(), num2.intValue(), (int) (num3.intValue() * 0.25f), (int) (num3.intValue() * 0.5f), (int) (num3.intValue() * 0.75f), num3.intValue());
                    ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b = r2;
                            TransitionValues transitionValues3 = transitionValues;
                            switch (b) {
                                case 0:
                                    ((v24) transitionValues3.view).n = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 1:
                                    ((v24) transitionValues3.view).r = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                case 2:
                                    ((v24) transitionValues3.view).s = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                                default:
                                    ((v24) transitionValues3.view).w = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                                    return;
                            }
                        }
                    });
                    animatorSet2.playTogether(ofInt3);
                    animatorSet2.addListener(new y5(transitionValues, (byte) 1));
                    return animatorSet2;
                }
                return super.createAnimator(viewGroup, transitionValues, transitionValues2);
        }
    }
}
