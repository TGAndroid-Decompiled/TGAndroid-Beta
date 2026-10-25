package di;

import a8.ng;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class z4 extends s4.u0 {
    public final t5 f9485a;

    public z4(t5 t5Var) {
        this.f9485a = t5Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        t5 t5Var = this.f9485a;
        if (i10 == 0) {
            t5Var.V = true;
            t5Var.invalidate();
        }
        if (i10 == 1) {
            t5Var.V = false;
            ng ngVar = t5Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) ngVar.f640c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) ngVar.f640c).cancel();
                ngVar.f640c = null;
            }
            AndroidUtilities.hideKeyboard(t5Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t5 t5Var = this.f9485a;
        t5Var.c();
        t5Var.invalidate();
    }
}
