package m;

import android.widget.AbsListView;
public final class d2 implements AbsListView.OnScrollListener {
    public final f2 f14816a;

    public d2(f2 f2Var) {
        this.f14816a = f2Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        f2 f2Var = this.f14816a;
        c2 c2Var = f2Var.G;
        z zVar = f2Var.O;
        if (i10 == 1 && zVar.getInputMethodMode() != 2 && zVar.getContentView() != null) {
            f2Var.K.removeCallbacks(c2Var);
            c2Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
