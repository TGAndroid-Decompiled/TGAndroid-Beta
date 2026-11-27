package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class ee7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final ArrayList c;
    public final ArrayList d;

    public ee7(kf7 kf7Var, ArrayList arrayList, ArrayList arrayList2, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                if (!arrayList2.isEmpty()) {
                    kf7Var.getMessagesController().j4(arrayList2, true);
                }
                if (!arrayList.isEmpty()) {
                    kf7Var.getMessagesController().c4(arrayList, true);
                    return;
                }
                return;
            default:
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = kf7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList.get(i)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList2.get(i)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        kf7Var.p(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
        }
    }
}
