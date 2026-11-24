package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
public final class h7 extends Visibility {
    public final byte a;

    public h7(byte b) {
        this.a = b;
    }

    @Override
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                if (view instanceof q7) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet.setInterpolator(d53.f);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
            case 1:
                if (view instanceof q7) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet2.setInterpolator(d53.f);
                    return animatorSet2;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, gm.L(20.0f), 0.0f));
                animatorSet3.setInterpolator(d53.f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1.0f));
                animatorSet4.setInterpolator(d53.f);
                return animatorSet4;
            case 4:
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, gm.L(100.0f), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f));
                if (view instanceof dkc) {
                    view.setTranslationY(gm.L(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((dkc) view).G);
                }
                if (view instanceof rkc) {
                    view.setTranslationY(gm.L(100.0f));
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    ofPropertyValuesHolder.setStartDelay(((rkc) view).f);
                }
                return ofPropertyValuesHolder;
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                view.setAlpha(0.0f);
                view.setScaleY(0.6f);
                view.setScaleX(0.6f);
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.6f, 1.0f));
                animatorSet5.setInterpolator(d53.k);
                return animatorSet5;
        }
    }

    @Override
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                if (view instanceof q7) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet.setInterpolator(d53.f);
                    return animatorSet;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
            case 1:
                if (view instanceof q7) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet2.setInterpolator(d53.f);
                    return animatorSet2;
                }
                return ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
            case 2:
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0.0f, -gm.L(20.0f)));
                animatorSet3.setInterpolator(d53.f);
                return animatorSet3;
            case 3:
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, View.SCALE_Y, view.getScaleX(), 0.5f));
                animatorSet4.setInterpolator(d53.f);
                return animatorSet4;
            case 4:
                return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, view.getTranslationY(), gm.L(100.0f)), PropertyValuesHolder.ofFloat(View.SCALE_Y, view.getScaleY(), 0.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, view.getScaleX(), 0.0f));
            default:
                AnimatorSet animatorSet5 = new AnimatorSet();
                if (view instanceof tic) {
                    ((tic) view).d = true;
                }
                animatorSet5.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 0.6f));
                animatorSet5.setInterpolator(d53.f);
                return animatorSet5;
        }
    }
}
