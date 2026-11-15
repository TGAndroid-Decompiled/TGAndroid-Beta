package jg;

import fi.s5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.vr;
public final class w1 implements Runnable {
    public final int f17328a;
    public final z1 f17329b;

    public w1(z1 z1Var, int i7) {
        this.f17328a = i7;
        this.f17329b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f17328a) {
            case 0:
                try {
                    vr.a0(this.f17329b.f17354m).f27221b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.f17329b;
                try {
                    SQLiteCursor queryFinalized = vr.a0(z1Var.f17354m).f27221b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f17333a = queryFinalized.stringValue(0);
                        obj.f17334b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f17333a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new w(2));
                    org.telegram.messenger.g0.h3(new s5(z1Var, arrayList, hashMap, 20));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
