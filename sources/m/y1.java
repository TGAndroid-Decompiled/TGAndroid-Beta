package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final int f16747a;
    public final Object f16748b;

    public y1(Object obj, int i10) {
        this.f16747a = i10;
        this.f16748b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        s1 s1Var;
        switch (this.f16747a) {
            case 0:
                if (i10 != -1 && (s1Var = ((e2) this.f16748b).f16531c) != null) {
                    s1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f16748b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f16747a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
