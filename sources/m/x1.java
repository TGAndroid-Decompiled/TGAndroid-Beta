package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f20346a;
    public final Object f20347b;

    public x1(Object obj, int i7) {
        this.f20346a = i7;
        this.f20347b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        r1 r1Var;
        switch (this.f20346a) {
            case 0:
                if (i7 != -1 && (r1Var = ((d2) this.f20347b).f20130c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f20347b).n(i7);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f20346a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
