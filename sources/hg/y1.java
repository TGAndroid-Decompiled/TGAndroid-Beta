package hg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class y1 implements Runnable {
    public final int f11327a;
    public final b2 f11328b;

    public y1(b2 b2Var, int i10) {
        this.f11327a = i10;
        this.f11328b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f11327a) {
            case 0:
                b2 b2Var = this.f11328b;
                b2Var.getClass();
                try {
                    MessagesStorage.getInstance(b2Var.f10989m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                b2 b2Var2 = this.f11328b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(b2Var2.f10989m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f11331a = queryFinalized.stringValue(0);
                        obj.f11332b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f11331a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(16));
                    AndroidUtilities.runOnUIThread(new t(b2Var2, arrayList, hashMap, 3));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
