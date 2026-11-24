package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
public final class yt9 implements Runnable {
    public final byte a;
    public final bu9 b;

    public yt9(bu9 bu9Var, byte b) {
        this.a = b;
        this.b = bu9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                try {
                    cf7.Y(bu9Var.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteCursor queryFinalized = cf7.Y(bu9Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
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
                    Collections.sort(arrayList, new qx7((byte) 17));
                    gm.c3(new ak8(bu9Var, arrayList, hashMap, (byte) 26));
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
