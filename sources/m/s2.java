package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f16333a;
    public final ViewGroup f16334b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f16333a = i10;
        this.f16334b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f16333a) {
            case 0:
                SearchView searchView = (SearchView) this.f16334b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f2771d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z10);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f16334b;
                f3Var.h = z10;
                if (f3Var.f22234f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f16334b;
                i3Var.f22408n = z10;
                if (i3Var.f22407f) {
                    i3Var.c();
                }
                i3Var.a(z10);
                return;
        }
    }
}
