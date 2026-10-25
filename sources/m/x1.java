package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f17899a;
    public final Object f17900b;

    public x1(Object obj, int i10) {
        this.f17899a = i10;
        this.f17900b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        r1 r1Var;
        switch (this.f17899a) {
            case 0:
                if (i10 != -1 && (r1Var = ((d2) this.f17900b).f17697c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f17900b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f17899a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
