package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final int f19306a;
    public final Object f19307b;

    public y1(Object obj, int i7) {
        this.f19306a = i7;
        this.f19307b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        s1 s1Var;
        switch (this.f19306a) {
            case 0:
                if (i7 != -1 && (s1Var = ((e2) this.f19307b).f19087c) != null) {
                    s1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f19307b).n(i7);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f19306a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
