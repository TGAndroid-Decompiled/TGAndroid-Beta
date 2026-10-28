package ig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class x1 implements Runnable {
    public final int f14300a;
    public final a2 f14301b;

    public x1(a2 a2Var, int i10) {
        this.f14300a = i10;
        this.f14301b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f14300a) {
            case 0:
                a2 a2Var = this.f14301b;
                a2Var.getClass();
                try {
                    MessagesStorage.getInstance(a2Var.f13996m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                a2 a2Var2 = this.f14301b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(a2Var2.f13996m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f14304a = queryFinalized.stringValue(0);
                        obj.f14305b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f14304a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.d(22));
                    AndroidUtilities.runOnUIThread(new e2.m0(a2Var2, arrayList, hashMap, 22));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
