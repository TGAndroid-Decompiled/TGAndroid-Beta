package eg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u2 extends f2.a1 {
    public final w2 f6143a;

    public u2(w2 w2Var) {
        this.f6143a = w2Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f6143a.V.getEditText());
        }
    }
}
