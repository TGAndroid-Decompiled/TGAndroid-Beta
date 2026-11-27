package defpackage;

import android.widget.AbsListView;
public final class r76 implements AbsListView.OnScrollListener {
    public final s76 a;

    public r76(s76 s76Var) {
        this.a = s76Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        s76 s76Var = this.a;
        q76 q76Var = s76Var.H;
        op opVar = s76Var.P;
        if (i == 1 && opVar.getInputMethodMode() != 2 && opVar.getContentView() != null) {
            s76Var.L.removeCallbacks(q76Var);
            q76Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
