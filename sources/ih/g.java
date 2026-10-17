package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g {
    public final RecyclerView f13134a;

    public void a(int i10) {
        RecyclerView recyclerView = this.f13134a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
