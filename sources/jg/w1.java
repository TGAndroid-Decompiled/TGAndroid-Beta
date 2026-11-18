package jg;

import di.ga;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.tr;
public final class w1 implements Runnable {
    public final int f17711a;
    public final z1 f17712b;

    public w1(z1 z1Var, int i7) {
        this.f17711a = i7;
        this.f17712b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f17711a) {
            case 0:
                try {
                    tr.a0(this.f17712b.f17737m).f27054b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.f17712b;
                try {
                    SQLiteCursor queryFinalized = tr.a0(z1Var.f17737m).f27054b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f17716a = queryFinalized.stringValue(0);
                        obj.f17717b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f17716a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new w(2));
                    org.telegram.messenger.g0.g3(new ga(z1Var, arrayList, hashMap, 24));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
