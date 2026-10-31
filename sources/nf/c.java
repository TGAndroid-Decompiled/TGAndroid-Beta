package nf;

import android.view.View;
import ei.i;
import java.util.ArrayList;
import w7.f0;
public final class c implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        b a2;
        d dVar = (d) view.getTag(2131296697);
        if (dVar != null && (a2 = f0.a(view, dVar)) != null) {
            ArrayList arrayList = dVar.f13751a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((je.b) a2.f13750a.f8521b).add((i) obj);
            }
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        b bVar;
        d dVar = (d) view.getTag(2131296697);
        if (dVar != null && (bVar = dVar.f13752b) != null) {
            ArrayList arrayList = dVar.f13751a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((je.b) bVar.f13750a.f8521b).remove((i) obj);
            }
            dVar.f13752b = null;
        }
    }
}
