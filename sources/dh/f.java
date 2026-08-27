package dh;

import ag.x1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import cg.b2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.dm;
import org.telegram.ui.lx;
import org.telegram.ui.rn;
import org.telegram.ui.wk;

public final class f implements ViewTreeObserver.OnPreDrawListener {

    public final int f4995a;

    public final Object f4996b;

    public final Object f4997c;

    public f(int i10, Object obj, Object obj2) {
        this.f4995a = i10;
        this.f4997c = obj;
        this.f4996b = obj2;
    }

    @Override
    public final boolean onPreDraw() {
        int i10 = this.f4995a;
        Object obj = this.f4996b;
        Object obj2 = this.f4997c;
        switch (i10) {
            case 0:
                ((ViewTreeObserver) obj).removeOnPreDrawListener(this);
                j jVar = (j) obj2;
                mb mbVar = jVar.S;
                if (mbVar != null) {
                    int[] iArr = j.Z;
                    mbVar.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float translationY = iArr[1] - jVar.S.getTranslationY();
                    mb mbVar2 = jVar.S;
                    float topOffset = translationY + (mbVar2.top ? mbVar2.getTopOffset() : -mbVar2.getBottomOffset());
                    jVar.f5021a.getLocationInWindow(iArr);
                    float f11 = iArr[0];
                    float f12 = iArr[1];
                    jVar.T = (jVar.S.f30638a.getMeasuredWidth() / 2.0f) + (f10 - f11) + jVar.S.f30638a.getLeft();
                    jVar.U = (jVar.S.f30638a.getMeasuredHeight() / 2.0f) + (topOffset - f12) + jVar.S.f30638a.getTop();
                }
                jVar.c();
                return true;
            case 1:
                rn rnVar = ((dm) obj2).M;
                s1 s1Var = (s1) obj;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = s1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                yj0 cameraRect = rnVar.X2.getCameraRect();
                float f13 = imageWidth / cameraRect.f34913c;
                s1Var.getTransitionParams().f25190x0 = true;
                s1Var.setAlpha(0.0f);
                s1Var.setTimeAlpha(0.0f);
                int[] iArr2 = {(int) ((photoImage.getImageX() - s1Var.getAnimationOffsetX()) + f), (int) (((photoImage.getImageY() + s1Var.getPaddingTop()) - s1Var.getTranslationY()) + f)};
                s1Var.getLocationOnScreen(iArr2);
                float f14 = iArr2[0];
                float f15 = iArr2[1];
                d50 cameraContainer = rnVar.X2.getCameraContainer();
                cameraContainer.setPivotX(0.0f);
                cameraContainer.setPivotY(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<d50, Float>) View.SCALE_X, f13);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<d50, Float>) View.SCALE_Y, f13);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<d50, Float>) View.TRANSLATION_Y, iArr2[1] - cameraRect.f34912b);
                View buttonsLayout = rnVar.X2.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(rnVar.X2.getPaint(), m6.f30579b, 0), ObjectAnimator.ofFloat(rnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(er.h);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<d50, Float>) View.TRANSLATION_X, iArr2[0] - cameraRect.f34911a);
                objectAnimatorOfFloat4.setInterpolator(er.f28122f);
                animatorSet2.playTogether(objectAnimatorOfFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    wkVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new x1(14, this, cameraContainer));
                animatorSet2.start();
                return true;
            default:
                ((lx) obj2).f40261b.f38498a0[0].f38225a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((b2) obj, 100L);
                return false;
        }
    }
}
