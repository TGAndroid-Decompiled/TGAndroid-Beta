package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class l0 implements AdapterView.OnItemClickListener {
    public final int f16244a;
    public final Object f16245b;

    public l0(Object obj, int i10) {
        this.f16244a = i10;
        this.f16245b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f16244a) {
            case 0:
                n0 n0Var = (n0) this.f16245b;
                q0 q0Var = n0Var.W;
                q0Var.setSelection(i10);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i10, n0Var.T.getItemId(i10));
                }
                n0Var.dismiss();
                return;
            default:
                ((SearchView) this.f16245b).m(i10);
                return;
        }
    }
}
