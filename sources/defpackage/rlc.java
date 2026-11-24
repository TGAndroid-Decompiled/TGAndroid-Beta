package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class rlc extends AnimatorListenerAdapter {
    public final slc a;

    public rlc(slc slcVar) {
        this.a = slcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z) {
        slc slcVar = this.a;
        slcVar.e = slcVar.c;
        slcVar.f = slcVar.d;
        SecureRandom secureRandom = Utilities.b;
        slcVar.c = gm.L(12.0f) + secureRandom.nextInt(gm.L(16.0f));
        slcVar.d = gm.L(12.0f) + secureRandom.nextInt(gm.L(16.0f));
        ValueAnimator valueAnimator = slcVar.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
