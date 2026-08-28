package of;

import ih.h3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class s1 implements Runnable {
    public final int f19500a;
    public final v1 f19501b;

    public s1(v1 v1Var, int i9) {
        this.f19500a = i9;
        this.f19501b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f19500a) {
            case 0:
                v1 v1Var = this.f19501b;
                v1Var.getClass();
                try {
                    MessagesStorage.getInstance(v1Var.f19534m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                v1 v1Var2 = this.f19501b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(v1Var2.f19534m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f19510a = queryFinalized.stringValue(0);
                        obj.f19511b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f19510a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new j9.a(7));
                    AndroidUtilities.runOnUIThread(new h3(v1Var2, arrayList, hashMap, 28));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
