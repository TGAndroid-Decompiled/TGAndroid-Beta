package m;

import android.widget.AbsListView;
public final class c2 implements AbsListView.OnScrollListener {
    public final e2 f13468a;

    public c2(e2 e2Var) {
        this.f13468a = e2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        e2 e2Var = this.f13468a;
        b2 b2Var = e2Var.D;
        x xVar = e2Var.L;
        if (i10 == 1 && xVar.getInputMethodMode() != 2 && xVar.getContentView() != null) {
            e2Var.H.removeCallbacks(b2Var);
            b2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
