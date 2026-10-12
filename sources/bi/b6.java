package bi;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b6 extends s4.r0 {
    public final w6 f2871a;

    public b6(w6 w6Var) {
        this.f2871a = w6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        w6 w6Var = this.f2871a;
        if (i10 == 0) {
            w6Var.V = true;
            w6Var.invalidate();
        }
        if (i10 == 1) {
            w6Var.V = false;
            a5.a aVar = w6Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f280c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f280c).cancel();
                aVar.f280c = null;
            }
            AndroidUtilities.hideKeyboard(w6Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w6 w6Var = this.f2871a;
        w6Var.c();
        w6Var.invalidate();
    }
}
