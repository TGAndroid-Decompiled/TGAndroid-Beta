package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final int f19309a;
    public final Object f19310b;

    public y1(Object obj, int i7) {
        this.f19309a = i7;
        this.f19310b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        s1 s1Var;
        switch (this.f19309a) {
            case 0:
                if (i7 != -1 && (s1Var = ((e2) this.f19310b).f19090c) != null) {
                    s1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f19310b).n(i7);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f19309a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
