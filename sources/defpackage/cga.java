package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
public final class cga extends eu8 {
    public final eja W;

    public cga(eja ejaVar, e eVar, Context context, int i, long j, vnb vnbVar, ll0 ll0Var) {
        super(eVar, context, i, j, vnbVar, ll0Var);
        this.W = ejaVar;
    }

    @Override
    public final void q(boolean z) {
        float f;
        float f2;
        eja ejaVar = this.W;
        TextView textView = ejaVar.t0;
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
        scaleX.scaleY(f3).withEndAction(new q38((byte) 13, this, z)).start();
        ejaVar.G1(true);
        ejaVar.Q0();
    }
}
