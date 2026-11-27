package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class bq implements AdapterView.OnItemClickListener {
    public final byte a;
    public final Object b;

    public bq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dq dqVar = (dq) obj;
                gq gqVar = dqVar.X;
                gqVar.setSelection(i);
                if (gqVar.getOnItemClickListener() != null) {
                    gqVar.performItemClick(view, i, dqVar.U.getItemId(i));
                }
                dqVar.dismiss();
                return;
            default:
                ((SearchView) obj).m(i);
                return;
        }
    }
}
