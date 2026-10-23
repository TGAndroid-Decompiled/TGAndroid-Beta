package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f16395a;
    public final ViewGroup f16396b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f16395a = i10;
        this.f16396b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f16395a) {
            case 0:
                SearchView searchView = (SearchView) this.f16396b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2774d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) this.f16396b;
                e3Var.f22318n = z10;
                if (e3Var.h) {
                    e3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f16396b;
                h3Var.f22456s = z10;
                if (h3Var.f22454n) {
                    h3Var.c();
                }
                h3Var.a(z10);
                return;
        }
    }
}
