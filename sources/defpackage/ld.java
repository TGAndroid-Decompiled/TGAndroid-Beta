package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class ld extends AnimatorListenerAdapter {
    public final byte a;
    public final od b;

    public ld(od odVar, byte b) {
        this.a = b;
        this.b = odVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        od odVar = this.b;
        switch (b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = odVar.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(odVar);
                    return;
                }
                return;
            default:
                odVar.t().removeView(odVar.n1);
                DialogInterface.OnDismissListener onDismissListener = odVar.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(odVar);
                    return;
                }
                return;
        }
    }
}
