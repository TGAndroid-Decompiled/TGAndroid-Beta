package m;

import android.widget.AbsListView;
public final class b2 implements AbsListView.OnScrollListener {
    public final d2 f15482a;

    public b2(d2 d2Var) {
        this.f15482a = d2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        d2 d2Var = this.f15482a;
        a2 a2Var = d2Var.G;
        x xVar = d2Var.O;
        if (i10 == 1 && xVar.getInputMethodMode() != 2 && xVar.getContentView() != null) {
            d2Var.K.removeCallbacks(a2Var);
            a2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
