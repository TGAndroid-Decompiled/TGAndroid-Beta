package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class uhc implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        thc a;
        vhc vhcVar = (vhc) view.getTag(2131296699);
        if (vhcVar != null && (a = n2f.a(view, vhcVar)) != null) {
            ArrayList arrayList = vhcVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r89) a.a.b).add((my4) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        thc thcVar;
        vhc vhcVar = (vhc) view.getTag(2131296699);
        if (vhcVar != null && (thcVar = vhcVar.b) != null) {
            ArrayList arrayList = vhcVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r89) thcVar.a.b).remove((my4) obj);
            }
            vhcVar.b = null;
        }
    }
}
