package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final int f17150a;
    public final Object f17151b;

    public y1(Object obj, int i9) {
        this.f17150a = i9;
        this.f17151b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j10) {
        s1 s1Var;
        switch (this.f17150a) {
            case 0:
                if (i9 != -1 && (s1Var = ((e2) this.f17151b).f16932c) != null) {
                    s1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f17151b).n(i9);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i9 = this.f17150a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
