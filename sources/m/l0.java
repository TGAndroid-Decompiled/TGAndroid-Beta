package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class l0 implements AdapterView.OnItemClickListener {
    public final int f19150a;
    public final Object f19151b;

    public l0(Object obj, int i7) {
        this.f19150a = i7;
        this.f19151b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        switch (this.f19150a) {
            case 0:
                n0 n0Var = (n0) this.f19151b;
                q0 q0Var = n0Var.W;
                q0Var.setSelection(i7);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i7, n0Var.T.getItemId(i7));
                }
                n0Var.dismiss();
                return;
            default:
                ((SearchView) this.f19151b).m(i7);
                return;
        }
    }
}
