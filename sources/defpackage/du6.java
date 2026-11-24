package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
public final class du6 {
    public final wt6 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final z24 d;
    public am4 e;

    public du6(wt6 wt6Var, boolean z) {
        this.a = wt6Var;
        this.d = (z24) wt6Var.d;
        this.c = z;
    }

    public final eu6 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            eu6 eu6Var = (eu6) obj;
            if (eu6Var.b.equals(str)) {
                return eu6Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
