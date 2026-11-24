package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
public final class co extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final Object c;

    public co(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                my0 my0Var = (my0) this.c;
                AnimatorSet animatorSet = my0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    my0Var.A0 = null;
                    my0Var.B0 = (byte) 0;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = true;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((ho) obj).u(i);
                return;
            case 1:
                wx0 wx0Var = (wx0) obj;
                Paint paint = wx0Var.R;
                paint.setColor(i);
                wx0Var.F();
                wx0Var.f.invalidate();
                cx cxVar = wx0Var.Z0;
                if (cxVar != null) {
                    if (gm.B(paint.getColor()) > 0.721f) {
                        z = false;
                    }
                    cxVar.b(z, false);
                    wx0Var.Z0.setBackgroundColor(paint.getColor());
                }
                wx0Var.K();
                return;
            case 2:
                my0 my0Var = (my0) obj;
                AnimatorSet animatorSet = my0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    my0Var.A0 = null;
                    my0Var.B0 = (byte) 0;
                    DialogInterface.OnClickListener onClickListener = my0Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(my0Var, i);
                    }
                    gm.c3(new yt0(this, (byte) 5));
                }
                nm7.e().k(100, 512);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                ela elaVar = chatActivityEnterView.c2;
                chatActivityEnterView.q4 = false;
                chatActivityEnterView.r4 = null;
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null) {
                    if (chatActivityEnterView.l7 == null) {
                        jz1Var.getLayoutParams().height = i;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (elaVar != null) {
                    elaVar.requestLayout();
                    elaVar.setForeground(null);
                    elaVar.setWillNotDraw(false);
                }
                if (chatActivityEnterView.p3 && chatActivityEnterView.R0()) {
                    chatActivityEnterView.Z1(0, chatActivityEnterView.V2, true, true);
                }
                mw1 mw1Var = chatActivityEnterView.s0;
                if (mw1Var != null) {
                    mw1Var.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.A4.e();
                return;
            case 4:
                e32 e32Var = (e32) obj;
                ox0 ox0Var = e32Var.n;
                if (ox0Var.getWebView() != null) {
                    ox0Var.getWebView().setScrollY(i);
                }
                if (animator == e32Var.r) {
                    e32Var.r = null;
                    return;
                }
                return;
            case 5:
                q qVar = (q) obj;
                if (i == qVar.v0) {
                    qVar.y.setRotationY(0.0f);
                    qVar.t0 = true;
                    qVar.e0 = null;
                    fc4.b("RoundVideo camera flip visual animation completed: elapsedMs=" + q.b(qVar));
                    qVar.q();
                    return;
                }
                return;
            case 6:
                ((LaunchActivity) obj).D0(i);
                return;
            case 7:
                um8 um8Var = (um8) obj;
                um8Var.y = -1;
                um8Var.w = i;
                um8Var.s = 0.0f;
                um8Var.V = null;
                um8Var.e();
                return;
            case 8:
                or8 or8Var = (or8) obj;
                or8Var.I = null;
                or8Var.Q.e1.delete(i);
                return;
            case 9:
                w49 w49Var = (w49) ((m42) obj).d;
                w49Var.b.remove(i);
                w49Var.d = true;
                w49Var.a.invalidate();
                return;
            case 10:
                zh9 zh9Var = (zh9) obj;
                zh9Var.a0 = i;
                zh9Var.b0 = 0.0f;
                zh9Var.requestLayout();
                zh9Var.invalidate();
                return;
            case 11:
                hj9 hj9Var = (hj9) obj;
                hj9Var.b0 = i;
                hj9Var.c0 = 0.0f;
                View view = hj9Var.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                pfa pfaVar = (pfa) obj;
                pfaVar.e.S1.remove(i);
                pfaVar.a.invalidate();
                return;
        }
    }
}
