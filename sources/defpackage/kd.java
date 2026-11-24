package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class kd extends AnimatorListenerAdapter {
    public final byte a;
    public final nd b;

    public kd(nd ndVar, byte b) {
        this.a = b;
        this.b = ndVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nd ndVar = this.b;
        switch (b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = ndVar.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(ndVar);
                    return;
                }
                return;
            default:
                ndVar.t().removeView(ndVar.n1);
                DialogInterface.OnDismissListener onDismissListener = ndVar.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(ndVar);
                    return;
                }
                return;
        }
    }
}
