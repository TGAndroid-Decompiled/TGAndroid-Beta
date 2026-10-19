package ci;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class a5 extends s4.r0 {
    public final u5 f5141a;

    public a5(u5 u5Var) {
        this.f5141a = u5Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        u5 u5Var = this.f5141a;
        if (i10 == 0) {
            u5Var.V = true;
            u5Var.invalidate();
        }
        if (i10 == 1) {
            u5Var.V = false;
            a5.a aVar = u5Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            AndroidUtilities.hideKeyboard(u5Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u5 u5Var = this.f5141a;
        u5Var.c();
        u5Var.invalidate();
    }
}
