package hh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import dg.y2;
import gg.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.fl;
import org.telegram.ui.lm;
import org.telegram.ui.vx;
import org.telegram.ui.zn;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f7115a;
    public final Object f7116b;
    public final Object f7117c;

    public f(int i10, Object obj, Object obj2) {
        this.f7115a = i10;
        this.f7117c = obj;
        this.f7116b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        int i10 = this.f7115a;
        Object obj = this.f7116b;
        Object obj2 = this.f7117c;
        switch (i10) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                qb qbVar = jVar.T;
                if (qbVar != null) {
                    int[] iArr = j.f7138a0;
                    qbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - jVar.T.getTranslationY();
                    qb qbVar2 = jVar.T;
                    if (qbVar2.top) {
                        f10 = qbVar2.getTopOffset();
                    } else {
                        f10 = -qbVar2.getBottomOffset();
                    }
                    jVar.f7141a.getLocationInWindow(iArr);
                    jVar.U = (jVar.T.f28136a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + jVar.T.f28136a.getLeft();
                    jVar.V = (jVar.T.f28136a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + jVar.T.f28136a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                zn znVar = ((lm) obj2).N;
                s1 s1Var = (s1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = s1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                rk0 cameraRect = znVar.Y2.getCameraRect();
                float f12 = imageWidth / cameraRect.f28485c;
                s1Var.getTransitionParams().f21845x0 = true;
                s1Var.setAlpha(0.0f);
                s1Var.setTimeAlpha(0.0f);
                s1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - s1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + s1Var.getPaddingTop()) - s1Var.getTranslationY()) + iArr2[1])};
                s50 cameraContainer = znVar.Y2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f12);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f12);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.f28484b);
                View buttonsLayout = znVar.Y2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(znVar.Y2.getPaint(), n6.f27196b, 0), ObjectAnimator.ofFloat(znVar.Y2.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(mr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.f28483a);
                ofFloat4.setInterpolator(mr.f27122f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    flVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new y2(11, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((vx) obj2).f39216b.f37527b0[0].f37246a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((y1) obj, 100L);
                return false;
        }
    }
}
