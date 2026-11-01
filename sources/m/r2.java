package m;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import vh.f5;
public final class r2 implements View.OnFocusChangeListener {
    public final int f12540a;
    public final KeyEvent.Callback f12541b;

    public r2(KeyEvent.Callback callback, int i10) {
        this.f12540a = i10;
        this.f12541b = callback;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f12540a) {
            case 0:
                SearchView searchView = (SearchView) this.f12541b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1052d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f12541b;
                j3Var.f22069n = z10;
                if (j3Var.h) {
                    j3Var.c();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) this.f12541b;
                m3Var.f22297s = z10;
                if (m3Var.f22295n) {
                    m3Var.c();
                }
                m3Var.a(z10);
                return;
            default:
                if (z10) {
                    f5 f5Var = (f5) this.f12541b;
                    f5Var.a2 = true;
                    ci.p pVar = new ci.p(f5Var.getContext(), 2);
                    pVar.f48056a = 1;
                    pVar.f4253p = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.L(1.0f);
                    ((s4.a0) f5Var.f26724k1.getLayoutManager()).w0(pVar);
                    return;
                }
                return;
        }
    }
}
