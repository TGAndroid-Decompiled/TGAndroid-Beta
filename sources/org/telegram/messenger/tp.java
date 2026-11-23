package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class tp implements Runnable {
    public final int f27029a;
    public final ur f27030b;
    public final ArrayList f27031c;
    public final ArrayList d;

    public tp(ur urVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.f27029a = i7;
        this.f27030b = urVar;
        this.f27031c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f27029a) {
            case 0:
                ArrayList arrayList = this.f27031c;
                ArrayList arrayList2 = this.d;
                ur urVar = this.f27030b;
                urVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = urVar.f27216b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i7)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i7)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e10) {
                        urVar.o(e10, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                ur urVar2 = this.f27030b;
                urVar2.getClass();
                ArrayList arrayList3 = this.f27031c;
                if (!arrayList3.isEmpty()) {
                    urVar2.getMessagesController().f4(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    urVar2.getMessagesController().Z3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
