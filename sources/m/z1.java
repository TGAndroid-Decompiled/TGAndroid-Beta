package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class z1 implements AdapterView.OnItemSelectedListener {
    public final int f15038a;
    public final Object f15039b;

    public z1(Object obj, int i10) {
        this.f15038a = i10;
        this.f15039b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        t1 t1Var;
        switch (this.f15038a) {
            case 0:
                if (i10 != -1 && (t1Var = ((f2) this.f15039b).f14835c) != null) {
                    t1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f15039b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f15038a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
