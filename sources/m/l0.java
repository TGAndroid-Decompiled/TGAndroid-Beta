package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class l0 implements AdapterView.OnItemClickListener {
    public final int f16246a;
    public final Object f16247b;

    public l0(Object obj, int i10) {
        this.f16246a = i10;
        this.f16247b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f16246a) {
            case 0:
                n0 n0Var = (n0) this.f16247b;
                q0 q0Var = n0Var.W;
                q0Var.setSelection(i10);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i10, n0Var.T.getItemId(i10));
                }
                n0Var.dismiss();
                return;
            default:
                ((SearchView) this.f16247b).m(i10);
                return;
        }
    }
}
