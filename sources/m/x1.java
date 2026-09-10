package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f13190a;
    public final Object f13191b;

    public x1(Object obj, int i10) {
        this.f13190a = i10;
        this.f13191b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        r1 r1Var;
        switch (this.f13190a) {
            case 0:
                if (i10 != -1 && (r1Var = ((d2) this.f13191b).f12990c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f13191b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f13190a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
