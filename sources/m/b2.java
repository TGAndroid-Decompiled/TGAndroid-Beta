package m;

import android.widget.AbsListView;
public final class b2 implements AbsListView.OnScrollListener {
    public final d2 f13145a;

    public b2(d2 d2Var) {
        this.f13145a = d2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        d2 d2Var = this.f13145a;
        a2 a2Var = d2Var.D;
        x xVar = d2Var.L;
        if (i10 == 1 && xVar.getInputMethodMode() != 2 && xVar.getContentView() != null) {
            d2Var.H.removeCallbacks(a2Var);
            a2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
