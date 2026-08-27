package i7;

import android.content.Context;
import java.util.ArrayList;

public final class ha implements ja {

    public final ArrayList f10657a;

    public ha(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.f10657a = arrayList;
        gaVar.getClass();
        arrayList.add(new la(context, gaVar));
    }

    @Override
    public final void a(b6.a aVar) {
        ArrayList arrayList = this.f10657a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(aVar);
        }
    }
}
