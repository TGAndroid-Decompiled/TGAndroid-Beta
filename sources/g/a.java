package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f6209a;
    public final View f6210b;

    public a(View view, View view2) {
        this.f6209a = view;
        this.f6210b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        e.b(absListView, this.f6209a, this.f6210b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
