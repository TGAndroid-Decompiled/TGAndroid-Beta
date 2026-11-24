package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class vdc implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        udc a;
        wdc wdcVar = (wdc) view.getTag(2131296699);
        if (wdcVar != null && (a = uxe.a(view, wdcVar)) != null) {
            ArrayList arrayList = wdcVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((e59) a.a.b).add((hw4) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        udc udcVar;
        wdc wdcVar = (wdc) view.getTag(2131296699);
        if (wdcVar != null && (udcVar = wdcVar.b) != null) {
            ArrayList arrayList = wdcVar.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((e59) udcVar.a.b).remove((hw4) obj);
            }
            wdcVar.b = null;
        }
    }
}
