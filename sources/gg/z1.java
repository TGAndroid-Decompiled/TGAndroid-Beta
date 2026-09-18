package gg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class z1 implements Runnable {
    public final int f10001a;
    public final c2 f10002b;

    public z1(c2 c2Var, int i10) {
        this.f10001a = i10;
        this.f10002b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f10001a) {
            case 0:
                c2 c2Var = this.f10002b;
                c2Var.getClass();
                try {
                    MessagesStorage.getInstance(c2Var.f9698m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                c2 c2Var2 = this.f10002b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(c2Var2.f9698m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f9673a = queryFinalized.stringValue(0);
                        obj.f9674b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f9673a, obj);
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
