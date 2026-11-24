package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class j56 implements AdapterView.OnItemSelectedListener {
    public final byte a;
    public final Object b;

    public j56(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        er3 er3Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i != -1 && (er3Var = ((o56) obj).c) != null) {
                    er3Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).n(i);
                return;
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
