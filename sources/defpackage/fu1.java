package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.q;
public final class fu1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final rc2 b;
    public final hu1 c;

    public fu1(hu1 hu1Var, rc2 rc2Var, byte b) {
        this.a = b;
        this.c = hu1Var;
        this.b = rc2Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f;
        byte b = this.a;
        rc2 rc2Var = this.b;
        float f2 = 0.0f;
        hu1 hu1Var = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = hu1Var.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                rc2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = rc2Var.getPhotoImage();
                float f3 = photoImage.N0;
                RectF cameraRect = yv1Var.q3.getCameraRect();
                float width = f3 / cameraRect.width();
                rc2Var.getTransitionParams().y0 = true;
                rc2Var.setAlpha(0.0f);
                rc2Var.setTimeAlpha(0.0f);
                rc2Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.L0 - rc2Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.M0 + rc2Var.getPaddingTop()) - rc2Var.getTranslationY()) + iArr2[1])};
                wq5 cameraContainer = yv1Var.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = yv1Var.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(yv1Var.q3.getPaint(), so.b, 0), ObjectAnimator.ofFloat(yv1Var.q3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(d53.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(d53.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                q qVar = yv1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new u5(this, cameraContainer, (byte) 8));
                animatorSet2.start();
                return true;
            default:
                yv1 yv1Var2 = hu1Var.R;
                rc2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                g47 g47Var = rc2Var.getMessageObject().N1;
                if (g47Var != null) {
                    yv1Var2.F6.add(rc2Var);
                    ImageReceiver photoImage2 = rc2Var.getPhotoImage();
                    float f4 = photoImage2.N0;
                    if (g47Var.h) {
                        f = 1.0f;
                    } else {
                        f = g47Var.c / f4;
                    }
                    rc2Var.getTransitionParams().y0 = true;
                    rc2Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - rc2Var.getTranslationY())};
                    if (yv1Var2.a0.Y0()) {
                        iArr3[1] = gm.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    pn pnVar = new pn("p1", (byte) 8);
                    gu1 gu1Var = new gu1(this, (byte) 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(g47Var, pnVar, f, 1.0f), ObjectAnimator.ofFloat(g47Var, new gu1(this, (byte) 1), 0.0f, 1.0f));
                    float f5 = g47Var.a;
                    float f6 = iArr3[0];
                    if (!g47Var.h) {
                        f2 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(g47Var, gu1Var, f5, f6 + f2), animatorSet4);
                    animatorSet3.setInterpolator(d53.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new b91(this, (byte) 10));
                    animatorSet3.start();
                    gu1 gu1Var2 = new gu1(this, (byte) 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(g47Var, gu1Var2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
