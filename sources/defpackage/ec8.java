package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ec8 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final PhotoViewer c;

    public ec8(PhotoViewer photoViewer, boolean z, byte b) {
        this.a = b;
        this.c = photoViewer;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 1:
                if (animator.equals(photoViewer.x)) {
                    photoViewer.x = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    photoViewer.M = null;
                    return;
                }
                return;
            case 3:
                photoViewer.Z7 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        byte b = this.a;
        boolean z = this.b;
        PhotoViewer photoViewer = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    photoViewer.i3.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (animator.equals(photoViewer.x)) {
                    if (!z) {
                        photoViewer.Y0.setVisibility(4);
                    }
                    photoViewer.x = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(photoViewer.M)) {
                    if (!z) {
                        photoViewer.G.setVisibility(4);
                        if (photoViewer.j0.getTag() != null) {
                            photoViewer.j0.setVisibility(4);
                        }
                        if (photoViewer.R1.getTag() != null) {
                            photoViewer.R1.setVisibility(4);
                        }
                    }
                    photoViewer.M = null;
                    return;
                }
                return;
            default:
                if (animator.equals(photoViewer.Z7)) {
                    photoViewer.Z7 = new AnimatorSet();
                    if (z) {
                        photoViewer.T7.setVisibility(0);
                        photoViewer.U7.setVisibility(0);
                        AnimatorSet animatorSet = photoViewer.Z7;
                        gd8 gd8Var = photoViewer.T7;
                        Property property = View.TRANSLATION_Y;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(gd8Var, property, 0.0f), ObjectAnimator.ofFloat(photoViewer.U7, property, 0.0f));
                    } else {
                        if (photoViewer.R4) {
                            photoViewer.k0.setVisibility(8);
                            photoViewer.k0.setAlpha(0.0f);
                            View view = photoViewer.k0;
                            if (photoViewer.d2 == 11) {
                                i = -16777216;
                            } else {
                                i = 2130706432;
                            }
                            view.setBackgroundColor(i);
                        }
                        photoViewer.T7.setVisibility(4);
                        photoViewer.U7.setVisibility(4);
                        AnimatorSet animatorSet2 = photoViewer.Z7;
                        jo0 jo0Var = photoViewer.Q0;
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(jo0Var, property2, 0.0f), ObjectAnimator.ofFloat(photoViewer.Q0, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(photoViewer.T0, property2, 0.0f));
                    }
                    photoViewer.Z7.addListener(new n88(this, (byte) 10));
                    photoViewer.Z7.setDuration(200L);
                    photoViewer.Z7.setInterpolator(hl.F);
                    photoViewer.Z7.start();
                    return;
                }
                return;
        }
    }
}
