package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PhotoViewer;
public final class s88 extends Fade {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final PhotoViewer d;

    public s88(PhotoViewer photoViewer, boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        switch (b) {
            case 1:
                this.d = photoViewer;
                this.b = z;
                this.c = z2;
                super(2);
                return;
            default:
                this.d = photoViewer;
                this.b = z;
                this.c = z2;
                return;
        }
    }

    @Override
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.b && !this.c && view == this.d.R1) {
                    onAppear.addListener(new l48(this, (byte) 8));
                    ((ObjectAnimator) onAppear).addUpdateListener(new u28(this, (byte) 1));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.b && this.c && view == this.d.R1) {
                    onDisappear.addListener(new l48(this, (byte) 9));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new u28(this, (byte) 2));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
