package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final int f13694a;
    public final Object f13695b;

    public y1(Object obj, int i10) {
        this.f13694a = i10;
        this.f13695b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        s1 s1Var;
        switch (this.f13694a) {
            case 0:
                if (i10 != -1 && (s1Var = ((e2) this.f13695b).f13492c) != null) {
                    s1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f13695b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f13694a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
