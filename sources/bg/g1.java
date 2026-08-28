package bg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g1 extends f2.d1 {
    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            AndroidUtilities.hideKeyboard(recyclerView);
        }
    }
}
