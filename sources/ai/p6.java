package ai;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p6 extends s4.s0 {
    public final k7 f1392a;

    public p6(k7 k7Var) {
        this.f1392a = k7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        k7 k7Var = this.f1392a;
        if (i10 == 0) {
            k7Var.V = true;
            k7Var.invalidate();
        }
        if (i10 == 1) {
            k7Var.V = false;
            a5.a aVar = k7Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f278c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f278c).cancel();
                aVar.f278c = null;
            }
            AndroidUtilities.hideKeyboard(k7Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k7 k7Var = this.f1392a;
        k7Var.c();
        k7Var.invalidate();
    }
}
