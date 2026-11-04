package kg;

import ei.h9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.qr;
public final class s1 implements Runnable {
    public final int f17185a;
    public final v1 f17186b;

    public s1(v1 v1Var, int i3) {
        this.f17185a = i3;
        this.f17186b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f17185a) {
            case 0:
                try {
                    qr.a0(this.f17186b.f17216m).f24936b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                v1 v1Var = this.f17186b;
                try {
                    SQLiteCursor queryFinalized = qr.a0(v1Var.f17216m).f24936b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f17197a = queryFinalized.stringValue(0);
                        obj.f17198b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f17197a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a3.u(24));
                    org.telegram.messenger.g0.h3(new h9((Object) v1Var, arrayList, (Cloneable) hashMap, 25));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
