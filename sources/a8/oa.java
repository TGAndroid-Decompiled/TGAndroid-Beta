package a8;

import android.content.Context;
import java.util.ArrayList;
public final class oa implements ta {
    public final ArrayList f574a;

    public oa(Context context, na naVar) {
        ArrayList arrayList = new ArrayList();
        this.f574a = arrayList;
        naVar.getClass();
        arrayList.add(new za(context, naVar));
    }

    @Override
    public final void a(xa xaVar) {
        ArrayList arrayList = this.f574a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ta) obj).a(xaVar);
        }
    }
}
