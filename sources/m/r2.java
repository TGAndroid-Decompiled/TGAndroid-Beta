package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f17842a;
    public final ViewGroup f17843b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f17842a = i10;
        this.f17843b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f17842a) {
            case 0:
                SearchView searchView = (SearchView) this.f17843b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2220d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.f17843b;
                d3Var.f24004n = z10;
                if (d3Var.h) {
                    d3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f17843b;
                g3Var.f24151s = z10;
                if (g3Var.f24149n) {
                    g3Var.c();
                }
                g3Var.a(z10);
                return;
        }
    }
}
