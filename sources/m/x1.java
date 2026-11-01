package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f12590a;
    public final Object f12591b;

    public x1(Object obj, int i10) {
        this.f12590a = i10;
        this.f12591b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        r1 r1Var;
        switch (this.f12590a) {
            case 0:
                if (i10 != -1 && (r1Var = ((d2) this.f12591b).f12393c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f12591b).n(i10);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f12590a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
