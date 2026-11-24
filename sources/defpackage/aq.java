package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class aq implements AdapterView.OnItemClickListener {
    public final byte a;
    public final Object b;

    public aq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cq cqVar = (cq) obj;
                fq fqVar = cqVar.X;
                fqVar.setSelection(i);
                if (fqVar.getOnItemClickListener() != null) {
                    fqVar.performItemClick(view, i, cqVar.U.getItemId(i));
                }
                cqVar.dismiss();
                return;
            default:
                ((SearchView) obj).m(i);
                return;
        }
    }
}
