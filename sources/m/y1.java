package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class y1 implements AdapterView.OnItemSelectedListener {

    public final int f17525a;

    public final Object f17526b;

    public y1(Object obj, int i10) {
        this.f17525a = i10;
        this.f17526b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        s1 s1Var;
        switch (this.f17525a) {
            case 0:
                if (i10 != -1 && (s1Var = ((e2) this.f17526b).f17307c) != null) {
                    s1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f17526b).n(i10);
                break;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f17525a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
