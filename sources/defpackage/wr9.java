package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
public final class wr9 implements Runnable {
    public final byte a;
    public final zr9 b;

    public wr9(zr9 zr9Var, byte b) {
        this.a = b;
        this.b = zr9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zr9 zr9Var = this.b;
        switch (b) {
            case 0:
                try {
                    ad7.Y(zr9Var.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteCursor queryFinalized = ad7.Y(zr9Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
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
                    Collections.sort(arrayList, new fx7((byte) 16));
                    gl.d3(new gm8(zr9Var, arrayList, hashMap, (byte) 23));
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
