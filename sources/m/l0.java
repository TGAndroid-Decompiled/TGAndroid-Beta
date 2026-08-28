package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class l0 implements AdapterView.OnItemClickListener {
    public final int f16993a;
    public final Object f16994b;

    public l0(Object obj, int i9) {
        this.f16993a = i9;
        this.f16994b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        switch (this.f16993a) {
            case 0:
                n0 n0Var = (n0) this.f16994b;
                q0 q0Var = n0Var.S;
                q0Var.setSelection(i9);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i9, n0Var.P.getItemId(i9));
                }
                n0Var.dismiss();
                return;
            default:
                ((SearchView) this.f16994b).m(i9);
                return;
        }
    }
}
