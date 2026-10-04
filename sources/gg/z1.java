package gg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class z1 implements Runnable {
    public final int f10874a;
    public final c2 f10875b;

    public z1(c2 c2Var, int i10) {
        this.f10874a = i10;
        this.f10875b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f10874a) {
            case 0:
                c2 c2Var = this.f10875b;
                c2Var.getClass();
                try {
                    MessagesStorage.getInstance(c2Var.f10542m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                c2 c2Var2 = this.f10875b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(c2Var2.f10542m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f10513a = queryFinalized.stringValue(0);
                        obj.f10514b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f10513a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(14));
                    AndroidUtilities.runOnUIThread(new t(c2Var2, arrayList, hashMap, 3));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
