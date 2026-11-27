package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class eoc extends AnimatorListenerAdapter {
    public final foc a;

    public eoc(foc focVar) {
        this.a = focVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z) {
        foc focVar = this.a;
        focVar.e = focVar.c;
        focVar.f = focVar.d;
        SecureRandom secureRandom = Utilities.b;
        focVar.c = hl.L(12.0f) + secureRandom.nextInt(hl.L(16.0f));
        focVar.d = hl.L(12.0f) + secureRandom.nextInt(hl.L(16.0f));
        ValueAnimator valueAnimator = focVar.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
