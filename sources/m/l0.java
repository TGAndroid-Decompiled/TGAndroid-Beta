package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class l0 implements AdapterView.OnItemClickListener {

    public final int f17368a;

    public final Object f17369b;

    public l0(Object obj, int i10) {
        this.f17368a = i10;
        this.f17369b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f17368a) {
            case 0:
                n0 n0Var = (n0) this.f17369b;
                q0 q0Var = n0Var.S;
                q0Var.setSelection(i10);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i10, n0Var.P.getItemId(i10));
                }
                n0Var.dismiss();
                break;
            default:
                ((SearchView) this.f17369b).m(i10);
                break;
        }
    }
}
