package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f9998a;
    public final View f9999b;

    public a(View view, View view2) {
        this.f9998a = view;
        this.f9999b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        f.b(absListView, this.f9998a, this.f9999b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
