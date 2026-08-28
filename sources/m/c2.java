package m;

import android.widget.AbsListView;
public final class c2 implements AbsListView.OnScrollListener {
    public final e2 f16907a;

    public c2(e2 e2Var) {
        this.f16907a = e2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i9) {
        e2 e2Var = this.f16907a;
        b2 b2Var = e2Var.C;
        y yVar = e2Var.K;
        if (i9 == 1 && yVar.getInputMethodMode() != 2 && yVar.getContentView() != null) {
            e2Var.G.removeCallbacks(b2Var);
            b2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i9, int i10, int i11) {
    }
}
