package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f6830a;
    public final View f6831b;

    public a(View view, View view2) {
        this.f6830a = view;
        this.f6831b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        e.b(absListView, this.f6830a, this.f6831b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
