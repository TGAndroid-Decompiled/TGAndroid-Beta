package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class lca extends tq8 {
    public final nfa W;

    public lca(nfa nfaVar, d dVar, Context context, int i, long j, wjb wjbVar, kl0 kl0Var) {
        super(dVar, context, i, j, wjbVar, kl0Var);
        this.W = nfaVar;
    }

    @Override
    public final void q(boolean z) {
        float f;
        float f2;
        nfa nfaVar = this.W;
        TextView textView = nfaVar.t0;
        textView.setVisibility(0);
        ViewPropertyAnimator animate = textView.animate();
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.4f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f2);
        if (!z) {
            f3 = 0.4f;
        }
        scaleX.scaleY(f3).withEndAction(new k08((byte) 13, this, z)).start();
        nfaVar.G1(true);
        nfaVar.Q0();
    }
}
