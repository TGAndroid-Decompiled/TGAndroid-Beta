package b0;

import c3.j;
import java.util.LinkedHashMap;
public final class b {
    public final LinkedHashMap f1579a;

    public b(int i10) {
        switch (i10) {
            case 1:
                this.f1579a = new LinkedHashMap();
                return;
            default:
                this.f1579a = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public void a(j jVar) {
        long[] jArr = jVar.e;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f1579a;
            if (!linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
            }
        }
    }
}
