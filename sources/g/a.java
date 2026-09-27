package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f9188a;
    public final View f9189b;

    public a(View view, View view2) {
        this.f9188a = view;
        this.f9189b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        f.b(absListView, this.f9188a, this.f9189b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
