package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class k0 implements AdapterView.OnItemClickListener {
    public final int f15470a;
    public final Object f15471b;

    public k0(Object obj, int i10) {
        this.f15470a = i10;
        this.f15471b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        switch (this.f15470a) {
            case 0:
                m0 m0Var = (m0) this.f15471b;
                p0 p0Var = m0Var.W;
                p0Var.setSelection(i10);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i10, m0Var.T.getItemId(i10));
                }
                m0Var.dismiss();
                return;
            default:
                ((SearchView) this.f15471b).m(i10);
                return;
        }
    }
}
