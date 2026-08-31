package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f13325a;
    public final ViewGroup f13326b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f13325a = i10;
        this.f13326b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f13325a) {
            case 0:
                SearchView searchView = (SearchView) this.f13326b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f459a0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z4);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f13326b;
                f3Var.h = z4;
                if (f3Var.f22796f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f13326b;
                i3Var.f22959n = z4;
                if (i3Var.f22958f) {
                    i3Var.c();
                }
                i3Var.a(z4);
                return;
        }
    }
}
