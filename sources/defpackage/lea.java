package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class lea extends vs8 {
    public final nha W;

    public lea(nha nhaVar, d dVar, Context context, int i, long j, ylb ylbVar, km0 km0Var) {
        super(dVar, context, i, j, ylbVar, km0Var);
        this.W = nhaVar;
    }

    @Override
    public final void q(boolean z) {
        float f;
        float f2;
        nha nhaVar = this.W;
        TextView textView = nhaVar.t0;
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
        scaleX.scaleY(f3).withEndAction(new n28((byte) 13, this, z)).start();
        nhaVar.G1(true);
        nhaVar.Q0();
    }
}
