package g;

import android.view.View;
import android.widget.AbsListView;

public final class b implements AbsListView.OnScrollListener {

    public final View f6201a;

    public final View f6202b;

    public b(View view, View view2) {
        this.f6201a = view;
        this.f6202b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        f.b(absListView, this.f6201a, this.f6202b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
