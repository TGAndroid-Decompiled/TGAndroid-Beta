package c2;

import android.content.ComponentName;
import java.util.ArrayList;
public final class z {
    public final t f2043a;
    public final ArrayList f2044b = new ArrayList();
    public final boolean f2045c;
    public final o5.i d;
    public u e;

    public z(t tVar, boolean z4) {
        this.f2043a = tVar;
        this.d = (o5.i) tVar.d;
        this.f2045c = z4;
    }

    public final a0 a(String str) {
        ArrayList arrayList = this.f2044b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var.f1877b.equals(str)) {
                return a0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f16457b).getPackageName() + " }";
    }
}
