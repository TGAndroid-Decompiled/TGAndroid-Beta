package n7;

import android.content.Context;
import java.util.ArrayList;
public final class vf implements uf {
    public final ArrayList f14769a;

    public vf(Context context, tf tfVar) {
        ArrayList arrayList = new ArrayList();
        this.f14769a = arrayList;
        tfVar.getClass();
        arrayList.add(new yf(context, tfVar));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        ArrayList arrayList = this.f14769a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uf) obj).a(e0Var);
        }
    }
}
