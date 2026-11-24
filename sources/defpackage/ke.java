package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
public final class ke extends AnimatorListenerAdapter {
    public final byte a;
    public final ne b;

    public ke(ne neVar, byte b) {
        this.a = b;
        this.b = neVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ne neVar = this.b;
        switch (b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = neVar.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(neVar);
                    return;
                }
                return;
            default:
                neVar.t().removeView(neVar.n1);
                DialogInterface.OnDismissListener onDismissListener = neVar.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(neVar);
                    return;
                }
                return;
        }
    }
}
