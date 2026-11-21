package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class k0 implements AdapterView.OnItemClickListener {
    public final int f20124a;
    public final Object f20125b;

    public k0(Object obj, int i7) {
        this.f20124a = i7;
        this.f20125b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        switch (this.f20124a) {
            case 0:
                m0 m0Var = (m0) this.f20125b;
                p0 p0Var = m0Var.X;
                p0Var.setSelection(i7);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i7, m0Var.U.getItemId(i7));
                }
                m0Var.dismiss();
                return;
            default:
                ((SearchView) this.f20125b).m(i7);
                return;
        }
    }
}
