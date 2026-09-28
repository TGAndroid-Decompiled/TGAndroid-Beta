package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14544a;
    public final ViewGroup f14545b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14544a = i10;
        this.f14545b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14544a) {
            case 0:
                SearchView searchView = (SearchView) this.f14545b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1997d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f14545b;
                g3Var.h = z10;
                if (g3Var.f20331f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f14545b;
                j3Var.f20495n = z10;
                if (j3Var.f20494f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
