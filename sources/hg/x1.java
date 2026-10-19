package hg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class x1 implements Runnable {
    public final int f12105a;
    public final a2 f12106b;

    public x1(a2 a2Var, int i10) {
        this.f12105a = i10;
        this.f12106b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f12105a) {
            case 0:
                a2 a2Var = this.f12106b;
                a2Var.getClass();
                try {
                    MessagesStorage.getInstance(a2Var.f11801m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                a2 a2Var2 = this.f12106b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(a2Var2.f11801m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f12109a = queryFinalized.stringValue(0);
                        obj.f12110b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f12109a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.d(20));
                    AndroidUtilities.runOnUIThread(new ei.z1(a2Var2, arrayList, hashMap, 18));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
