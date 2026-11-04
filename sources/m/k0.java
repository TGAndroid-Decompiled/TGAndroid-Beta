package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class k0 implements AdapterView.OnItemClickListener {
    public final int f18620a;
    public final Object f18621b;

    public k0(Object obj, int i3) {
        this.f18620a = i3;
        this.f18621b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j10) {
        switch (this.f18620a) {
            case 0:
                m0 m0Var = (m0) this.f18621b;
                p0 p0Var = m0Var.X;
                p0Var.setSelection(i3);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i3, m0Var.U.getItemId(i3));
                }
                m0Var.dismiss();
                return;
            default:
                ((SearchView) this.f18621b).m(i3);
                return;
        }
    }
}
