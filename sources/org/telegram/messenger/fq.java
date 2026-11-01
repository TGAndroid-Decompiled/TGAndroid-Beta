package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class fq implements Runnable {
    public final int f15782a;
    public final is f15783b;
    public final ArrayList f15784c;
    public final ArrayList d;

    public fq(is isVar, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.f15782a = i10;
        this.f15783b = isVar;
        this.f15784c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f15782a) {
            case 0:
                ArrayList arrayList = this.f15784c;
                ArrayList arrayList2 = this.d;
                is isVar = this.f15783b;
                isVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = isVar.f16333b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        isVar.o(e, true);
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
                is isVar2 = this.f15783b;
                isVar2.getClass();
                ArrayList arrayList3 = this.f15784c;
                if (!arrayList3.isEmpty()) {
                    isVar2.getMessagesController().V3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    isVar2.getMessagesController().P3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
