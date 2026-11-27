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
public final class dn extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final Object c;

    public dn(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                nx0 nx0Var = (nx0) this.c;
                AnimatorSet animatorSet = nx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
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
                ((hn) obj).u(i);
                return;
            case 1:
                xw0 xw0Var = (xw0) obj;
                Paint paint = xw0Var.R;
                paint.setColor(i);
                xw0Var.F();
                xw0Var.f.invalidate();
                dw dwVar = xw0Var.Z0;
                if (dwVar != null) {
                    if (hl.B(paint.getColor()) > 0.721f) {
                        z = false;
                    }
                    dwVar.b(z, false);
                    xw0Var.Z0.setBackgroundColor(paint.getColor());
                }
                xw0Var.K();
                return;
            case 2:
                nx0 nx0Var = (nx0) obj;
                AnimatorSet animatorSet = nx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    DialogInterface.OnClickListener onClickListener = nx0Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(nx0Var, i);
                    }
                    hl.c3(new fv0(this, (byte) 4));
                }
                jn7.e().k(100, 512);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                wma wmaVar = chatActivityEnterView.b2;
                chatActivityEnterView.p4 = false;
                chatActivityEnterView.q4 = null;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    if (chatActivityEnterView.I7 == null) {
                        my1Var.getLayoutParams().height = i;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (wmaVar != null) {
                    wmaVar.requestLayout();
                    wmaVar.setForeground(null);
                    wmaVar.setWillNotDraw(false);
                }
                if (chatActivityEnterView.o3 && chatActivityEnterView.U0()) {
                    chatActivityEnterView.i2(0, chatActivityEnterView.U2, true, true);
                }
                mv1 mv1Var = chatActivityEnterView.s0;
                if (mv1Var != null) {
                    mv1Var.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.z4.e();
                return;
            case 4:
                j22 j22Var = (j22) obj;
                pw0 pw0Var = j22Var.n;
                if (pw0Var.getWebView() != null) {
                    pw0Var.getWebView().setScrollY(i);
                }
                if (animator == j22Var.r) {
                    j22Var.r = null;
                    return;
                }
                return;
            case 5:
                q qVar = (q) obj;
                if (i == qVar.v0) {
                    qVar.y.setRotationY(0.0f);
                    qVar.t0 = true;
                    qVar.e0 = null;
                    cc4.b("RoundVideo camera flip visual animation completed: elapsedMs=" + q.b(qVar));
                    qVar.q();
                    return;
                }
                return;
            case 6:
                ((LaunchActivity) obj).D0(i);
                return;
            case 7:
                fo8 fo8Var = (fo8) obj;
                fo8Var.y = -1;
                fo8Var.w = i;
                fo8Var.s = 0.0f;
                fo8Var.V = null;
                fo8Var.e();
                return;
            case 8:
                zs8 zs8Var = (zs8) obj;
                zs8Var.I = null;
                zs8Var.Q.e1.delete(i);
                return;
            case 9:
                i69 i69Var = (i69) ((r32) obj).d;
                i69Var.b.remove(i);
                i69Var.d = true;
                i69Var.a.invalidate();
                return;
            case 10:
                mj9 mj9Var = (mj9) obj;
                mj9Var.a0 = i;
                mj9Var.b0 = 0.0f;
                mj9Var.requestLayout();
                mj9Var.invalidate();
                return;
            case 11:
                uk9 uk9Var = (uk9) obj;
                uk9Var.b0 = i;
                uk9Var.c0 = 0.0f;
                View view = uk9Var.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                gha ghaVar = (gha) obj;
                ghaVar.e.S1.remove(i);
                ghaVar.a.invalidate();
                return;
        }
    }
}
