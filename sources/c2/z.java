package c2;

import android.content.ComponentName;
import java.util.ArrayList;
public final class z {
    public final s f2269a;
    public final ArrayList f2270b = new ArrayList();
    public final boolean f2271c;
    public final android.support.v4.media.c d;
    public t f2272e;

    public z(s sVar, boolean z10) {
        this.f2269a = sVar;
        this.d = (android.support.v4.media.c) sVar.d;
        this.f2271c = z10;
    }

    public final a0 a(String str) {
        ArrayList arrayList = this.f2270b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a0 a0Var = (a0) obj;
            if (a0Var.f2091b.equals(str)) {
                return a0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f281b).getPackageName() + " }";
    }
}
