package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
public final class pv9 implements Runnable {
    public final byte a;
    public final sv9 b;

    public pv9(sv9 sv9Var, byte b) {
        this.a = b;
        this.b = sv9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sv9 sv9Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteCursor queryFinalized = kf7.a0(sv9Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.a = queryFinalized.stringValue(0);
                        obj.b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new qq7((byte) 19));
                    hl.c3(new jr9(sv9Var, arrayList, hashMap, (byte) 2));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                try {
                    kf7.a0(sv9Var.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
