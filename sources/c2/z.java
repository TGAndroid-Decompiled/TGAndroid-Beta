package c2;

import android.content.ComponentName;
import java.util.ArrayList;
public final class z {
    public final t f2219a;
    public final ArrayList f2220b = new ArrayList();
    public final boolean f2221c;
    public final y5.h d;
    public u f2222e;

    public z(t tVar, boolean z4) {
        this.f2219a = tVar;
        this.d = (y5.h) tVar.d;
        this.f2221c = z4;
    }

    public final a0 a(String str) {
        ArrayList arrayList = this.f2220b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var.f2039b.equals(str)) {
                return a0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f50776b).getPackageName() + " }";
    }
}
