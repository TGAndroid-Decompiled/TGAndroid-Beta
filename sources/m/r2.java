package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14487a;
    public final ViewGroup f14488b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14487a = i10;
        this.f14488b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14487a) {
            case 0:
                SearchView searchView = (SearchView) this.f14488b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2005d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f14488b;
                g3Var.h = z10;
                if (g3Var.f20294f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f14488b;
                j3Var.f20458n = z10;
                if (j3Var.f20457f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
