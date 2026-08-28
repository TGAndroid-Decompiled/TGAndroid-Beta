package bg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 extends f2.d1 {
    public final g3 f1747a;

    public e3(g3 g3Var) {
        this.f1747a = g3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            AndroidUtilities.hideKeyboard(this.f1747a.V.getEditText());
        }
    }
}
