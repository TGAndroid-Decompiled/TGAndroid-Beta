package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class s2 implements View.OnFocusChangeListener {
    public final int f13623a;
    public final ViewGroup f13624b;

    public s2(ViewGroup viewGroup, int i10) {
        this.f13623a = i10;
        this.f13624b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f13623a) {
            case 0:
                SearchView searchView = (SearchView) this.f13624b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f429a0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z4);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) this.f13624b;
                e3Var.h = z4;
                if (e3Var.f20988f) {
                    e3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f13624b;
                h3Var.f21135n = z4;
                if (h3Var.f21134f) {
                    h3Var.c();
                }
                h3Var.a(z4);
                return;
        }
    }
}
