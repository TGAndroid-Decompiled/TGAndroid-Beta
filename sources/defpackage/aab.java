package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aab extends AnimatorListenerAdapter {
    public final byte a;
    public final cab b;

    public aab(cab cabVar, byte b) {
        this.a = b;
        this.b = cabVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        cab cabVar = this.b;
        switch (b) {
            case 0:
                oab oabVar = cabVar.y0;
                oabVar.Y = 0.0f;
                oabVar.V();
                return;
            default:
                oab oabVar2 = cabVar.y0;
                oabVar2.X = 0.0f;
                oabVar2.a0 = 0.0f;
                oabVar2.V();
                return;
        }
    }
}
