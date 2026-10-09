package ai;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q6 extends s4.t0 {
    public final l7 f1618a;

    public q6(l7 l7Var) {
        this.f1618a = l7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        l7 l7Var = this.f1618a;
        if (i10 == 0) {
            l7Var.V = true;
            l7Var.invalidate();
        }
        if (i10 == 1) {
            l7Var.V = false;
            a5.a aVar = l7Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f300c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f300c).cancel();
                aVar.f300c = null;
            }
            AndroidUtilities.hideKeyboard(l7Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l7 l7Var = this.f1618a;
        l7Var.c();
        l7Var.invalidate();
    }
}
