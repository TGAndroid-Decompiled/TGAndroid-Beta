package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
public final class dw6 {
    public final wv6 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final ai4 d;
    public bo4 e;

    public dw6(wv6 wv6Var, boolean z) {
        this.a = wv6Var;
        this.d = (ai4) wv6Var.d;
        this.c = z;
    }

    public final ew6 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ew6 ew6Var = (ew6) obj;
            if (ew6Var.b.equals(str)) {
                return ew6Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
