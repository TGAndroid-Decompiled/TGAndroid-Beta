package gg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class z1 implements Runnable {
    public final int f9997a;
    public final c2 f9998b;

    public z1(c2 c2Var, int i10) {
        this.f9997a = i10;
        this.f9998b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f9997a) {
            case 0:
                c2 c2Var = this.f9998b;
                c2Var.getClass();
                try {
                    MessagesStorage.getInstance(c2Var.f9694m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                c2 c2Var2 = this.f9998b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(c2Var2.f9694m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f9669a = queryFinalized.stringValue(0);
                        obj.f9670b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f9669a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(14));
                    AndroidUtilities.runOnUIThread(new t(c2Var2, arrayList, hashMap, 3));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
