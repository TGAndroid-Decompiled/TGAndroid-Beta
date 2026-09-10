package gh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class h {
    public final RecyclerView f9143a;

    public void a(int i10) {
        RecyclerView recyclerView = this.f9143a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
