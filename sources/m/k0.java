package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class k0 implements AdapterView.OnItemClickListener {
    public final int f14432a;
    public final Object f14433b;

    public k0(Object obj, int i10) {
        this.f14432a = i10;
        this.f14433b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        switch (this.f14432a) {
            case 0:
                m0 m0Var = (m0) this.f14433b;
                p0 p0Var = m0Var.W;
                p0Var.setSelection(i10);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i10, m0Var.T.getItemId(i10));
                }
                m0Var.dismiss();
                return;
            default:
                ((SearchView) this.f14433b).m(i10);
                return;
        }
    }
}
