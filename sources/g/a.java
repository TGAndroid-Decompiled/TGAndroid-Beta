package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f6673a;
    public final View f6674b;

    public a(View view, View view2) {
        this.f6673a = view;
        this.f6674b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        e.b(absListView, this.f6673a, this.f6674b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
