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
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.dl;
import org.telegram.ui.jm;
import org.telegram.ui.tx;
import org.telegram.ui.xn;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f7132a;
    public final Object f7133b;
    public final Object f7134c;

    public f(int i10, Object obj, Object obj2) {
        this.f7132a = i10;
        this.f7134c = obj;
        this.f7133b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        int i10 = this.f7132a;
        Object obj = this.f7133b;
        Object obj2 = this.f7134c;
        switch (i10) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                qb qbVar = jVar.T;
                if (qbVar != null) {
                    int[] iArr = j.f7155a0;
                    qbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - jVar.T.getTranslationY();
                    qb qbVar2 = jVar.T;
                    if (qbVar2.top) {
                        f10 = qbVar2.getTopOffset();
                    } else {
                        f10 = -qbVar2.getBottomOffset();
                    }
                    jVar.f7158a.getLocationInWindow(iArr);
                    jVar.U = (jVar.T.f28099a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + jVar.T.f28099a.getLeft();
                    jVar.V = (jVar.T.f28099a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + jVar.T.f28099a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                xn xnVar = ((jm) obj2).N;
                t1 t1Var = (t1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                sk0 cameraRect = xnVar.Y2.getCameraRect();
                float f12 = imageWidth / cameraRect.f28724c;
                t1Var.getTransitionParams().f21914x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr2[1])};
                r50 cameraContainer = xnVar.Y2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f12);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f12);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.f28723b);
                View buttonsLayout = xnVar.Y2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(xnVar.Y2.getPaint(), n6.f27200b, 0), ObjectAnimator.ofFloat(xnVar.Y2.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(nr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.f28722a);
                ofFloat4.setInterpolator(nr.f27346f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new y2(11, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((tx) obj2).f38772b.f37009b0[0].f36741a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((y1) obj, 100L);
                return false;
        }
    }
}
