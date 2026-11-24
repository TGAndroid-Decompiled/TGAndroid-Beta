package defpackage;

import android.widget.AbsListView;
public final class n76 implements AbsListView.OnScrollListener {
    public final o76 a;

    public n76(o76 o76Var) {
        this.a = o76Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        o76 o76Var = this.a;
        m76 m76Var = o76Var.H;
        nq nqVar = o76Var.P;
        if (i == 1 && nqVar.getInputMethodMode() != 2 && nqVar.getContentView() != null) {
            o76Var.L.removeCallbacks(m76Var);
            m76Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
