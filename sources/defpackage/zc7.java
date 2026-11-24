package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class zc7 implements Runnable {
    public final byte a;
    public final cf7 b;
    public final ArrayList c;
    public final ArrayList d;

    public zc7(cf7 cf7Var, ArrayList arrayList, ArrayList arrayList2, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.c;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = cf7Var.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        cf7Var.n(e, true);
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
            default:
                if (!arrayList2.isEmpty()) {
                    cf7Var.getMessagesController().d4(arrayList2, true);
                }
                if (!arrayList.isEmpty()) {
                    cf7Var.getMessagesController().X3(arrayList, true);
                    return;
                }
                return;
        }
    }
}
