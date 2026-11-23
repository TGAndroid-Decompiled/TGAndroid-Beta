package jg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.ur;
public final class w1 implements Runnable {
    public final int f17705a;
    public final z1 f17706b;

    public w1(z1 z1Var, int i7) {
        this.f17705a = i7;
        this.f17706b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f17705a) {
            case 0:
                try {
                    ur.a0(this.f17706b.f17731m).f27216b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.f17706b;
                try {
                    SQLiteCursor queryFinalized = ur.a0(z1Var.f17731m).f27216b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f17710a = queryFinalized.stringValue(0);
                        obj.f17711b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f17710a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new w(2));
                    org.telegram.messenger.g0.g3(new di.a8(z1Var, arrayList, hashMap, 25));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
