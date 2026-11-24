package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class wfc implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        vfc a;
        xfc xfcVar = (xfc) view.getTag(2131296699);
        if (xfcVar != null && (a = wze.a(view, xfcVar)) != null) {
            ArrayList arrayList = xfcVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((g79) a.a.b).add((jy4) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        vfc vfcVar;
        xfc xfcVar = (xfc) view.getTag(2131296699);
        if (xfcVar != null && (vfcVar = xfcVar.b) != null) {
            ArrayList arrayList = xfcVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((g79) vfcVar.a.b).remove((jy4) obj);
            }
            xfcVar.b = null;
        }
    }
}
