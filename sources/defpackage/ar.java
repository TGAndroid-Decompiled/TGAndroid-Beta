package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
public final class ar implements AdapterView.OnItemClickListener {
    public final byte a;
    public final Object b;

    public ar(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cr crVar = (cr) obj;
                fr frVar = crVar.X;
                frVar.setSelection(i);
                if (frVar.getOnItemClickListener() != null) {
                    frVar.performItemClick(view, i, crVar.U.getItemId(i));
                }
                crVar.dismiss();
                return;
            default:
                ((SearchView) obj).m(i);
                return;
        }
    }
}
