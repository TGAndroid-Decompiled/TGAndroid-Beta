package ch;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import bg.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y40;
import org.telegram.ui.bm;
import org.telegram.ui.ix;
import org.telegram.ui.qn;
import org.telegram.ui.uk;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f2451a;
    public final Object f2452b;
    public final Object f2453c;

    public f(int i9, Object obj, Object obj2) {
        this.f2451a = i9;
        this.f2453c = obj;
        this.f2452b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        int i9 = this.f2451a;
        Object obj = this.f2452b;
        Object obj2 = this.f2453c;
        switch (i9) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                ob obVar = jVar.S;
                if (obVar != null) {
                    int[] iArr = j.Z;
                    obVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - jVar.S.getTranslationY();
                    ob obVar2 = jVar.S;
                    if (obVar2.top) {
                        f10 = obVar2.getTopOffset();
                    } else {
                        f10 = -obVar2.getBottomOffset();
                    }
                    jVar.f2477a.getLocationInWindow(iArr);
                    jVar.T = (jVar.S.f31342a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + jVar.S.f31342a.getLeft();
                    jVar.U = (jVar.S.f31342a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + jVar.S.f31342a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                qn qnVar = ((bm) obj2).M;
                t1 t1Var = (t1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                wj0 cameraRect = qnVar.X2.getCameraRect();
                float f12 = imageWidth / cameraRect.f34235c;
                t1Var.getTransitionParams().f25239x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr2[1])};
                y40 cameraContainer = qnVar.X2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f12);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f12);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.f34234b);
                View buttonsLayout = qnVar.X2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(qnVar.X2.getPaint(), m6.f30701b, 0), ObjectAnimator.ofFloat(qnVar.X2.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(gr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.f34233a);
                ofFloat4.setInterpolator(gr.f28844f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    ukVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new fg.j(12, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((ix) obj2).f39313b.f37629a0[0].f37350a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((i2) obj, 100L);
                return false;
        }
    }
}
