package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f17080a;
    public final ViewGroup f17081b;

    public s2(ViewGroup viewGroup, int i9) {
        this.f17080a = i9;
        this.f17081b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f17080a) {
            case 0:
                SearchView searchView = (SearchView) this.f17081b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.W;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f17081b;
                g3Var.h = z10;
                if (g3Var.f24376f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f17081b;
                j3Var.f24548n = z10;
                if (j3Var.f24547f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
