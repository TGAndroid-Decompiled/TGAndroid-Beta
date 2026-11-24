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
public final class ts1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final gb2 b;
    public final vs1 c;

    public ts1(vs1 vs1Var, gb2 gb2Var, byte b) {
        this.a = b;
        this.c = vs1Var;
        this.b = gb2Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f;
        byte b = this.a;
        gb2 gb2Var = this.b;
        float f2 = 0.0f;
        vs1 vs1Var = this.c;
        switch (b) {
            case 0:
                mu1 mu1Var = vs1Var.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                gb2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = gb2Var.getPhotoImage();
                float f3 = photoImage.N0;
                RectF cameraRect = mu1Var.q3.getCameraRect();
                float width = f3 / cameraRect.width();
                gb2Var.getTransitionParams().y0 = true;
                gb2Var.setAlpha(0.0f);
                gb2Var.setTimeAlpha(0.0f);
                gb2Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.L0 - gb2Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.M0 + gb2Var.getPaddingTop()) - gb2Var.getTranslationY()) + iArr2[1])};
                wo5 cameraContainer = mu1Var.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = mu1Var.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(mu1Var.q3.getPaint(), rn.b, 0), ObjectAnimator.ofFloat(mu1Var.q3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(s33.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(s33.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new u5(this, cameraContainer, (byte) 8));
                animatorSet2.start();
                return true;
            default:
                mu1 mu1Var2 = vs1Var.R;
                gb2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                g27 g27Var = gb2Var.getMessageObject().N1;
                if (g27Var != null) {
                    mu1Var2.F6.add(gb2Var);
                    ImageReceiver photoImage2 = gb2Var.getPhotoImage();
                    float f4 = photoImage2.N0;
                    if (g27Var.h) {
                        f = 1.0f;
                    } else {
                        f = g27Var.c / f4;
                    }
                    gb2Var.getTransitionParams().y0 = true;
                    gb2Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - gb2Var.getTranslationY())};
                    if (mu1Var2.a0.W0()) {
                        iArr3[1] = gl.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    pm pmVar = new pm("p1", (byte) 8);
                    us1 us1Var = new us1(this, (byte) 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(g27Var, pmVar, f, 1.0f), ObjectAnimator.ofFloat(g27Var, new us1(this, (byte) 1), 0.0f, 1.0f));
                    float f5 = g27Var.a;
                    float f6 = iArr3[0];
                    if (!g27Var.h) {
                        f2 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(g27Var, us1Var, f5, f6 + f2), animatorSet4);
                    animatorSet3.setInterpolator(s33.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new bb1(this, (byte) 8));
                    animatorSet3.start();
                    us1 us1Var2 = new us1(this, (byte) 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(g27Var, us1Var2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
