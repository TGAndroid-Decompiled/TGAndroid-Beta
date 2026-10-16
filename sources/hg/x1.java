package hg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class x1 implements Runnable {
    public final int f10801a;
    public final a2 f10802b;

    public x1(a2 a2Var, int i10) {
        this.f10801a = i10;
        this.f10802b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f10801a) {
            case 0:
                a2 a2Var = this.f10802b;
                a2Var.getClass();
                try {
                    MessagesStorage.getInstance(a2Var.f10497m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                a2 a2Var2 = this.f10802b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(a2Var2.f10497m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f10805a = queryFinalized.stringValue(0);
                        obj.f10806b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f10805a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.d(17));
                    AndroidUtilities.runOnUIThread(new t(a2Var2, arrayList, hashMap, 3));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
