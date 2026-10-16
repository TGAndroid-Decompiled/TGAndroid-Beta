package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class m0 implements AdapterView.OnItemClickListener {
    public final int f14894a;
    public final Object f14895b;

    public m0(Object obj, int i10) {
        this.f14894a = i10;
        this.f14895b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.f14894a) {
            case 0:
                o0 o0Var = (o0) this.f14895b;
                r0 r0Var = o0Var.W;
                r0Var.setSelection(i10);
                if (r0Var.getOnItemClickListener() != null) {
                    r0Var.performItemClick(view, i10, o0Var.T.getItemId(i10));
                }
                o0Var.dismiss();
                return;
            default:
                ((SearchView) this.f14895b).m(i10);
                return;
        }
    }
}
