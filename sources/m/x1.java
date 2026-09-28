package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f14593a;
    public final Object f14594b;

    public x1(Object obj, int i10) {
        this.f14593a = i10;
        this.f14594b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        r1 r1Var;
        switch (this.f14593a) {
            case 0:
                if (i10 != -1 && (r1Var = ((d2) this.f14594b).f14398c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f14594b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f14593a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
