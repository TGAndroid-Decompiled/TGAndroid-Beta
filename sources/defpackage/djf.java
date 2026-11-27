package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class djf implements cjf {
    public final ArrayList a;

    public djf(Context context, wif wifVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        wifVar.getClass();
        arrayList.add(new njf(context, wifVar));
    }

    @Override
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cjf) obj).a(rxVar);
        }
    }
}
