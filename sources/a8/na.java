package a8;

import android.content.Context;
import java.util.ArrayList;
public final class na implements sa {
    public final ArrayList f546a;

    public na(Context context, ma maVar) {
        ArrayList arrayList = new ArrayList();
        this.f546a = arrayList;
        maVar.getClass();
        arrayList.add(new ya(context, maVar));
    }

    @Override
    public final void a(wa waVar) {
        ArrayList arrayList = this.f546a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((sa) obj).a(waVar);
        }
    }
}
