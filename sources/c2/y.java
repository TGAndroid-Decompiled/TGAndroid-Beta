package c2;

import android.content.ComponentName;
import java.util.ArrayList;

public final class y {

    public final s f2381a;

    public final ArrayList f2382b = new ArrayList();

    public final boolean f2383c;
    public final k5.i d;

    public t f2384e;

    public y(s sVar, boolean z10) {
        this.f2381a = sVar;
        this.d = (k5.i) sVar.d;
        this.f2383c = z10;
    }

    public final z a(String str) {
        ArrayList arrayList = this.f2382b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar.f2391b.equals(str)) {
                return zVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.f14480b).getPackageName() + " }";
    }
}
