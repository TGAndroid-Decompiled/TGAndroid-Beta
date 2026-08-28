package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f6920a;
    public final View f6921b;

    public a(View view, View view2) {
        this.f6920a = view;
        this.f6921b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i9, int i10, int i11) {
        e.b(absListView, this.f6920a, this.f6921b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i9) {
    }
}
