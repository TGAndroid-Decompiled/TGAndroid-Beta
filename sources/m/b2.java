package m;

import android.widget.AbsListView;
public final class b2 implements AbsListView.OnScrollListener {
    public final d2 f20114a;

    public b2(d2 d2Var) {
        this.f20114a = d2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        d2 d2Var = this.f20114a;
        a2 a2Var = d2Var.H;
        x xVar = d2Var.P;
        if (i7 == 1 && xVar.getInputMethodMode() != 2 && xVar.getContentView() != null) {
            d2Var.L.removeCallbacks(a2Var);
            a2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }
}
