package fh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import bg.c3;
import eg.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ub;
import org.telegram.ui.em;
import org.telegram.ui.kx;
import org.telegram.ui.tn;
import org.telegram.ui.xk;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f6790a;
    public final Object f6791b;
    public final Object f6792c;

    public f(int i10, Object obj, Object obj2) {
        this.f6790a = i10;
        this.f6792c = obj;
        this.f6791b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f9;
        int i10 = this.f6790a;
        Object obj = this.f6791b;
        Object obj2 = this.f6792c;
        switch (i10) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                ub ubVar = jVar.S;
                if (ubVar != null) {
                    int[] iArr = j.Z;
                    ubVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - jVar.S.getTranslationY();
                    ub ubVar2 = jVar.S;
                    if (ubVar2.top) {
                        f9 = ubVar2.getTopOffset();
                    } else {
                        f9 = -ubVar2.getBottomOffset();
                    }
                    jVar.f6816a.getLocationInWindow(iArr);
                    jVar.T = (jVar.S.f33184a.getMeasuredWidth() / 2.0f) + (f10 - iArr[0]) + jVar.S.f33184a.getLeft();
                    jVar.U = (jVar.S.f33184a.getMeasuredHeight() / 2.0f) + ((translationY + f9) - iArr[1]) + jVar.S.f33184a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                tn tnVar = ((em) obj2).M;
                s1 s1Var = (s1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = s1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                hk0 cameraRect = tnVar.X2.getCameraRect();
                float f11 = imageWidth / cameraRect.f29197c;
                s1Var.getTransitionParams().f25195x0 = true;
                s1Var.setAlpha(0.0f);
                s1Var.setTimeAlpha(0.0f);
                s1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - s1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + s1Var.getPaddingTop()) - s1Var.getTranslationY()) + iArr2[1])};
                m50 cameraContainer = tnVar.X2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f11);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f11);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.f29196b);
                View buttonsLayout = tnVar.X2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(tnVar.X2.getPaint(), r6.f32221b, 0), ObjectAnimator.ofFloat(tnVar.X2.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(jr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.f29195a);
                ofFloat4.setInterpolator(jr.f29800f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    xkVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new c3(15, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((kx) obj2).f40034b.f38256a0[0].f37921a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((z1) obj, 100L);
                return false;
        }
    }
}
