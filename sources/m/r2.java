package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14528a;
    public final ViewGroup f14529b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14528a = i10;
        this.f14529b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14528a) {
            case 0:
                SearchView searchView = (SearchView) this.f14529b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1997d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f14529b;
                g3Var.h = z10;
                if (g3Var.f20316f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f14529b;
                j3Var.f20480n = z10;
                if (j3Var.f20479f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
