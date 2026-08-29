package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class l0 implements AdapterView.OnItemClickListener {
    public final int f16592a;
    public final Object f16593b;

    public l0(Object obj, int i10) {
        this.f16592a = i10;
        this.f16593b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f16592a) {
            case 0:
                n0 n0Var = (n0) this.f16593b;
                q0 q0Var = n0Var.S;
                q0Var.setSelection(i10);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i10, n0Var.P.getItemId(i10));
                }
                n0Var.dismiss();
                return;
            default:
                ((SearchView) this.f16593b).m(i10);
                return;
        }
    }
}
