package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f14543a;
    public final ViewGroup f14544b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f14543a = i10;
        this.f14544b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f14543a) {
            case 0:
                SearchView searchView = (SearchView) this.f14544b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f1997d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f14544b;
                g3Var.h = z10;
                if (g3Var.f20330f) {
                    g3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f14544b;
                j3Var.f20494n = z10;
                if (j3Var.f20493f) {
                    j3Var.c();
                }
                j3Var.a(z10);
                return;
        }
    }
}
