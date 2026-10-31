package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class eq implements Runnable {
    public final int f15441a;
    public final hs f15442b;
    public final ArrayList f15443c;
    public final ArrayList d;

    public eq(hs hsVar, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f15441a = i10;
        this.f15442b = hsVar;
        this.f15443c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f15441a) {
            case 0:
                ArrayList arrayList = this.f15443c;
                ArrayList arrayList2 = this.d;
                hs hsVar = this.f15442b;
                hsVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.f15940b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i10)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i10)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        hsVar.o(e, true);
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
                hs hsVar2 = this.f15442b;
                hsVar2.getClass();
                ArrayList arrayList3 = this.f15443c;
                if (!arrayList3.isEmpty()) {
                    hsVar2.getMessagesController().V3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    hsVar2.getMessagesController().P3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
