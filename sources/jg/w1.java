package jg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.yr;
public final class w1 implements Runnable {
    public final int f16974a;
    public final z1 f16975b;

    public w1(z1 z1Var, int i7) {
        this.f16974a = i7;
        this.f16975b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f16974a) {
            case 0:
                try {
                    yr.a0(this.f16975b.f16999m).f26698b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.f16975b;
                try {
                    SQLiteCursor queryFinalized = yr.a0(z1Var.f16999m).f26698b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f16978a = queryFinalized.stringValue(0);
                        obj.f16979b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f16978a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new x(2));
                    org.telegram.messenger.g0.h3(new fi.x1(z1Var, arrayList, hashMap, 20));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
