package jg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.tr;
public final class w1 implements Runnable {
    public final int f17807a;
    public final z1 f17808b;

    public w1(z1 z1Var, int i7) {
        this.f17807a = i7;
        this.f17808b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f17807a) {
            case 0:
                try {
                    tr.a0(this.f17808b.f17833m).f27151b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.f17808b;
                try {
                    SQLiteCursor queryFinalized = tr.a0(z1Var.f17833m).f27151b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f17812a = queryFinalized.stringValue(0);
                        obj.f17813b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f17812a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new w(2));
                    org.telegram.messenger.g0.g3(new di.a8(z1Var, arrayList, hashMap, 26));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
