package m;

import android.widget.AbsListView;
public final class c2 implements AbsListView.OnScrollListener {
    public final e2 f19071a;

    public c2(e2 e2Var) {
        this.f19071a = e2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        e2 e2Var = this.f19071a;
        b2 b2Var = e2Var.G;
        y yVar = e2Var.O;
        if (i7 == 1 && yVar.getInputMethodMode() != 2 && yVar.getContentView() != null) {
            e2Var.K.removeCallbacks(b2Var);
            b2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }
}
