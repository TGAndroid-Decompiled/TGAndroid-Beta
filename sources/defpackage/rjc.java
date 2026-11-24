package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class rjc extends AnimatorListenerAdapter {
    public final sjc a;

    public rjc(sjc sjcVar) {
        this.a = sjcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z) {
        sjc sjcVar = this.a;
        sjcVar.e = sjcVar.c;
        sjcVar.f = sjcVar.d;
        SecureRandom secureRandom = Utilities.b;
        sjcVar.c = gl.L(12.0f) + secureRandom.nextInt(gl.L(16.0f));
        sjcVar.d = gl.L(12.0f) + secureRandom.nextInt(gl.L(16.0f));
        ValueAnimator valueAnimator = sjcVar.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
