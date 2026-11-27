package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.q;
public final class gt1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final wb2 b;
    public final it1 c;

    public gt1(it1 it1Var, wb2 wb2Var, byte b) {
        this.a = b;
        this.c = it1Var;
        this.b = wb2Var;
    }

    @Override
    public final boolean onPreDraw() {
        int[] iArr;
        float f;
        byte b = this.a;
        wb2 wb2Var = this.b;
        float f2 = 0.0f;
        it1 it1Var = this.c;
        switch (b) {
            case 0:
                MediaController.z().r0(false);
                wb2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = wb2Var.getPhotoImage();
                float f3 = photoImage.N0;
                zu1 zu1Var = it1Var.R;
                RectF cameraRect = zu1Var.q3.getCameraRect();
                float width = f3 / cameraRect.width();
                wb2Var.getTransitionParams().y0 = true;
                wb2Var.setAlpha(0.0f);
                wb2Var.setTimeAlpha(0.0f);
                wb2Var.getLocationOnScreen(r11);
                int[] iArr2 = {(int) ((photoImage.L0 - wb2Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.M0 + wb2Var.getPaddingTop()) - wb2Var.getTranslationY()) + iArr2[1])};
                zq5 cameraContainer = zu1Var.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - iArr[0]);
                cameraContainer.setPivotY(cameraRect.top - iArr[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.top);
                View buttonsLayout = zu1Var.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(zu1Var.q3.getPaint(), sn.b, 0), ObjectAnimator.ofFloat(zu1Var.q3.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(k43.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.left);
                ofFloat4.setInterpolator(k43.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                q qVar = zu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new v5(this, cameraContainer, (byte) 8));
                animatorSet2.start();
                return true;
            default:
                zu1 zu1Var2 = it1Var.R;
                wb2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                n47 n47Var = wb2Var.getMessageObject().N1;
                if (n47Var != null) {
                    zu1Var2.F6.add(wb2Var);
                    ImageReceiver photoImage2 = wb2Var.getPhotoImage();
                    float f4 = photoImage2.N0;
                    if (n47Var.h) {
                        f = 1.0f;
                    } else {
                        f = n47Var.c / f4;
                    }
                    wb2Var.getTransitionParams().y0 = true;
                    wb2Var.getLocationInWindow(r10);
                    int[] iArr3 = {0, (int) (iArr3[1] - wb2Var.getTranslationY())};
                    if (zu1Var2.a0.a1()) {
                        iArr3[1] = hl.L(48.0f) + iArr3[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    qm qmVar = new qm("p1", (byte) 8);
                    ht1 ht1Var = new ht1(this, (byte) 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(n47Var, qmVar, f, 1.0f), ObjectAnimator.ofFloat(n47Var, new ht1(this, (byte) 1), 0.0f, 1.0f));
                    float f5 = n47Var.a;
                    float f6 = iArr3[0];
                    if (!n47Var.h) {
                        f2 = photoImage2.r();
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(n47Var, ht1Var, f5, f6 + f2), animatorSet4);
                    animatorSet3.setInterpolator(k43.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new jb1(this, (byte) 8));
                    animatorSet3.start();
                    ht1 ht1Var2 = new ht1(this, (byte) 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(n47Var, ht1Var2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                }
                return true;
        }
    }
}
