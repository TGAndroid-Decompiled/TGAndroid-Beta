package ih;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import eg.w2;
import hg.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.dl;
import org.telegram.ui.jm;
import org.telegram.ui.ux;
import org.telegram.ui.xn;
public final class f implements ViewTreeObserver.OnPreDrawListener {
    public final int f8132a;
    public final Object f8133b;
    public final Object f8134c;

    public f(int i10, Object obj, Object obj2) {
        this.f8132a = i10;
        this.f8134c = obj;
        this.f8133b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        int i10 = this.f8132a;
        Object obj = this.f8133b;
        Object obj2 = this.f8134c;
        switch (i10) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                qb qbVar = jVar.T;
                if (qbVar != null) {
                    int[] iArr = j.f8156a0;
                    qbVar.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float translationY = iArr[1] - jVar.T.getTranslationY();
                    qb qbVar2 = jVar.T;
                    if (qbVar2.top) {
                        f10 = qbVar2.getTopOffset();
                    } else {
                        f10 = -qbVar2.getBottomOffset();
                    }
                    jVar.f8159a.getLocationInWindow(iArr);
                    jVar.U = (jVar.T.f30374a.getMeasuredWidth() / 2.0f) + (f11 - iArr[0]) + jVar.T.f30374a.getLeft();
                    jVar.V = (jVar.T.f30374a.getMeasuredHeight() / 2.0f) + ((translationY + f10) - iArr[1]) + jVar.T.f30374a.getTop();
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
                float f12 = imageWidth / cameraRect.f31080c;
                t1Var.getTransitionParams().f23712x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                t1Var.getLocationOnScreen(r9);
                int[] iArr2 = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + iArr2[0]), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + iArr2[1])};
                t50 cameraContainer = xnVar.Y2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, f12);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, f12);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_Y, iArr2[1] - cameraRect.f31079b);
                View buttonsLayout = xnVar.Y2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, property, 0.0f), ObjectAnimator.ofInt(xnVar.Y2.getPaint(), n6.f29395b, 0), ObjectAnimator.ofFloat(xnVar.Y2.getMuteImageView(), property, 0.0f));
                animatorSet.setInterpolator(pr.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, View.TRANSLATION_X, iArr2[0] - cameraRect.f31078a);
                ofFloat4.setInterpolator(pr.f30168f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new w2(11, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((ux) obj2).f41950b.f40155b0[0].f39822a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((y1) obj, 100L);
                return false;
        }
    }
}
