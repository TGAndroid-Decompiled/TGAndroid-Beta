package ci;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class z4 extends s4.r0 {
    public final t5 f6185a;

    public z4(t5 t5Var) {
        this.f6185a = t5Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        t5 t5Var = this.f6185a;
        if (i10 == 0) {
            t5Var.V = true;
            t5Var.invalidate();
        }
        if (i10 == 1) {
            t5Var.V = false;
            a5.a aVar = t5Var.d;
            ValueAnimator valueAnimator = (ValueAnimator) aVar.f282c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) aVar.f282c).cancel();
                aVar.f282c = null;
            }
            AndroidUtilities.hideKeyboard(t5Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t5 t5Var = this.f6185a;
        t5Var.c();
        t5Var.invalidate();
    }
}
