package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f15930a;
    public final Object f15931b;

    public x1(Object obj, int i10) {
        this.f15930a = i10;
        this.f15931b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        r1 r1Var;
        switch (this.f15930a) {
            case 0:
                if (i10 != -1 && (r1Var = ((d2) this.f15931b).f15719c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f15931b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f15930a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
