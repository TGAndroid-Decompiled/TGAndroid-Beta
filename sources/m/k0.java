package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class k0 implements AdapterView.OnItemClickListener {
    public final int f13231a;
    public final Object f13232b;

    public k0(Object obj, int i10) {
        this.f13231a = i10;
        this.f13232b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f13231a) {
            case 0:
                m0 m0Var = (m0) this.f13232b;
                p0 p0Var = m0Var.T;
                p0Var.setSelection(i10);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i10, m0Var.Q.getItemId(i10));
                }
                m0Var.dismiss();
                return;
            default:
                ((SearchView) this.f13232b).m(i10);
                return;
        }
    }
}
