package fg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
public final class a2 implements Runnable {
    public final int f7952a;
    public final d2 f7953b;

    public a2(d2 d2Var, int i10) {
        this.f7952a = i10;
        this.f7953b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f7952a) {
            case 0:
                d2 d2Var = this.f7953b;
                d2Var.getClass();
                try {
                    MessagesStorage.getInstance(d2Var.f7988m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                d2 d2Var2 = this.f7953b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(d2Var2.f7988m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f7959a = queryFinalized.stringValue(0);
                        obj.f7960b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f7959a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(7));
                    AndroidUtilities.runOnUIThread(new a3.k0(d2Var2, arrayList, hashMap, 25));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
