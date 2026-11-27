package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.SecretMediaViewer;
public final class ay9 extends Fade {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final SecretMediaViewer d;

    public ay9(SecretMediaViewer secretMediaViewer, boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        switch (b) {
            case 1:
                this.d = secretMediaViewer;
                this.b = z;
                this.c = z2;
                super(2);
                return;
            default:
                this.d = secretMediaViewer;
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
                if (this.b && !this.c && view == this.d.Y) {
                    onAppear.addListener(new po9(this, (byte) 4));
                    ((ObjectAnimator) onAppear).addUpdateListener(new b49(this, (byte) 14));
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
                if (!this.b && this.c && view == this.d.Y) {
                    onDisappear.addListener(new po9(this, (byte) 5));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new b49(this, (byte) 15));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
