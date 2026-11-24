package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;
public final class s5 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final a c;

    public s5(a aVar, boolean z, byte b) {
        this.a = b;
        this.c = aVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = 0.0f;
        boolean z = this.b;
        a aVar = this.c;
        switch (b) {
            case 0:
                if (z) {
                    f = 1.0f;
                }
                aVar.E1 = f;
                aVar.i();
                return;
            default:
                if (z) {
                    f = 1.0f;
                }
                aVar.E1 = f;
                aVar.i();
                return;
        }
    }
}
