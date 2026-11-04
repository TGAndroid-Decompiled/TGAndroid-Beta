package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final int f18777a;
    public final Object f18778b;

    public x1(Object obj, int i3) {
        this.f18777a = i3;
        this.f18778b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j10) {
        r1 r1Var;
        switch (this.f18777a) {
            case 0:
                if (i3 != -1 && (r1Var = ((d2) this.f18778b).f18560c) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f18778b).n(i3);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f18777a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
