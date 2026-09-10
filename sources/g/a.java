package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f8327a;
    public final View f8328b;

    public a(View view, View view2) {
        this.f8327a = view;
        this.f8328b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        f.b(absListView, this.f8327a, this.f8328b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
