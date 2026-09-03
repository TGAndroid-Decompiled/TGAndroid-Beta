package c2;

import android.content.ComponentName;
import java.util.ArrayList;
public final class a0 {
    public final t f1898a;
    public final ArrayList f1899b = new ArrayList();
    public final boolean f1900c;
    public final o5.i d;
    public u e;

    public a0(t tVar, boolean z4) {
        this.f1898a = tVar;
        this.d = (o5.i) tVar.d;
        this.f1900c = z4;
    }

    public final b0 a(String str) {
        ArrayList arrayList = this.f1899b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b0 b0Var = (b0) obj;
            if (b0Var.f1910b.equals(str)) {
                return b0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f16439b).getPackageName() + " }";
    }
}
