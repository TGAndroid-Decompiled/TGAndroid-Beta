package c2;

import android.content.ComponentName;
import java.util.ArrayList;
public final class a0 {
    public final t f2759a;
    public final ArrayList f2760b = new ArrayList();
    public final boolean f2761c;
    public final m5.i d;
    public u f2762e;

    public a0(t tVar, boolean z10) {
        this.f2759a = tVar;
        this.d = (m5.i) tVar.d;
        this.f2761c = z10;
    }

    public final b0 a(String str) {
        ArrayList arrayList = this.f2760b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b0 b0Var = (b0) obj;
            if (b0Var.f2772b.equals(str)) {
                return b0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f16880b).getPackageName() + " }";
    }
}
