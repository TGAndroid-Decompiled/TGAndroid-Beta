package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class l0 implements AdapterView.OnItemClickListener {
    public final int f16308a;
    public final Object f16309b;

    public l0(Object obj, int i10) {
        this.f16308a = i10;
        this.f16309b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f16308a) {
            case 0:
                n0 n0Var = (n0) this.f16309b;
                q0 q0Var = n0Var.W;
                q0Var.setSelection(i10);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i10, n0Var.T.getItemId(i10));
                }
                n0Var.dismiss();
                return;
            default:
                ((SearchView) this.f16309b).m(i10);
                return;
        }
    }
}
