package jg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.yr;
public final class w1 implements Runnable {
    public final int f16977a;
    public final z1 f16978b;

    public w1(z1 z1Var, int i7) {
        this.f16977a = i7;
        this.f16978b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f16977a) {
            case 0:
                try {
                    yr.a0(this.f16978b.f17002m).f26725b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.f16978b;
                try {
                    SQLiteCursor queryFinalized = yr.a0(z1Var.f17002m).f26725b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f16981a = queryFinalized.stringValue(0);
                        obj.f16982b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f16981a, obj);
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
