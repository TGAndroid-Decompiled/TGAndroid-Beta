package m;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
public final class r2 implements View.OnFocusChangeListener {
    public final int f13327a;
    public final ViewGroup f13328b;

    public r2(ViewGroup viewGroup, int i10) {
        this.f13327a = i10;
        this.f13328b = viewGroup;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f13327a) {
            case 0:
                SearchView searchView = (SearchView) this.f13328b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f459a0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z4);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) this.f13328b;
                f3Var.h = z4;
                if (f3Var.f22798f) {
                    f3Var.c();
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f13328b;
                i3Var.f22961n = z4;
                if (i3Var.f22960f) {
                    i3Var.c();
                }
                i3Var.a(z4);
                return;
        }
    }
}
