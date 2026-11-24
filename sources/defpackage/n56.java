package defpackage;

import android.widget.AbsListView;
public final class n56 implements AbsListView.OnScrollListener {
    public final o56 a;

    public n56(o56 o56Var) {
        this.a = o56Var;
    }

    @Override
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        o56 o56Var = this.a;
        m56 m56Var = o56Var.H;
        np npVar = o56Var.P;
        if (i == 1 && npVar.getInputMethodMode() != 2 && npVar.getContentView() != null) {
            o56Var.L.removeCallbacks(m56Var);
            m56Var.run();
        }
    }

    @Override
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
