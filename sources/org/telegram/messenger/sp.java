package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class sp implements Runnable {
    public final int f26865a;
    public final tr f26866b;
    public final ArrayList f26867c;
    public final ArrayList d;

    public sp(tr trVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.f26865a = i7;
        this.f26866b = trVar;
        this.f26867c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f26865a) {
            case 0:
                ArrayList arrayList = this.f26867c;
                ArrayList arrayList2 = this.d;
                tr trVar = this.f26866b;
                trVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar.f27082b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        trVar.o(e10, true);
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
                tr trVar2 = this.f26866b;
                trVar2.getClass();
                ArrayList arrayList3 = this.f26867c;
                if (!arrayList3.isEmpty()) {
                    trVar2.getMessagesController().f4(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    trVar2.getMessagesController().Z3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
