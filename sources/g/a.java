package g;

import android.view.View;
import android.widget.AbsListView;
public final class a implements AbsListView.OnScrollListener {
    public final View f10162a;
    public final View f10163b;

    public a(View view, View view2) {
        this.f10162a = view;
        this.f10163b = view2;
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        f.b(absListView, this.f10162a, this.f10163b);
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
