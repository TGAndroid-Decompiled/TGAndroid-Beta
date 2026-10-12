package gg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class y1 implements Runnable {
    public final int f10873a;
    public final b2 f10874b;

    public y1(b2 b2Var, int i10) {
        this.f10873a = i10;
        this.f10874b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f10873a) {
            case 0:
                b2 b2Var = this.f10874b;
                b2Var.getClass();
                try {
                    MessagesStorage.getInstance(b2Var.f10540m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                b2 b2Var2 = this.f10874b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(b2Var2.f10540m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f10877a = queryFinalized.stringValue(0);
                        obj.f10878b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f10877a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.d(14));
                    AndroidUtilities.runOnUIThread(new t(b2Var2, arrayList, hashMap, 3));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
