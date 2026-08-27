package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;

public final class s2 implements View.OnFocusChangeListener {

    public final int f17455a;

    public final ViewGroup f17456b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f17455a = i10;
        this.f17456b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f17455a) {
            case 0:
                SearchView searchView = (SearchView) this.f17456b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.W;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                }
                break;
            case 1:
                org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) this.f17456b;
                d3Var.h = z10;
                if (d3Var.f24199f) {
                    d3Var.c();
                }
                break;
            default:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) this.f17456b;
                g3Var.f24374n = z10;
                if (g3Var.f24373f) {
                    g3Var.c();
                }
                g3Var.a(z10);
                break;
        }
    }
}
