package l7;

import android.content.Context;
import java.util.ArrayList;
public final class ia implements ka {
    public final ArrayList f11494a;

    public ia(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.f11494a = arrayList;
        haVar.getClass();
        arrayList.add(new ma(context, haVar));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        ArrayList arrayList = this.f11494a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ka) obj).a(e0Var);
        }
    }
}
