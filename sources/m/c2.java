package m;

import android.widget.AbsListView;
public final class c2 implements AbsListView.OnScrollListener {
    public final e2 f16168a;

    public c2(e2 e2Var) {
        this.f16168a = e2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        e2 e2Var = this.f16168a;
        b2 b2Var = e2Var.G;
        y yVar = e2Var.O;
        if (i10 == 1 && yVar.getInputMethodMode() != 2 && yVar.getContentView() != null) {
            e2Var.K.removeCallbacks(b2Var);
            b2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
