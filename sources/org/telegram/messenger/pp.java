package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class pp implements Runnable {
    public final int f24791a;
    public final qr f24792b;
    public final ArrayList f24793c;
    public final ArrayList d;

    public pp(qr qrVar, ArrayList arrayList, ArrayList arrayList2, int i3) {
        this.f24791a = i3;
        this.f24792b = qrVar;
        this.f24793c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f24791a) {
            case 0:
                ArrayList arrayList = this.f24793c;
                ArrayList arrayList2 = this.d;
                qr qrVar = this.f24792b;
                qrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = qrVar.f24936b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i3)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i3)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e10) {
                        qrVar.o(e10, true);
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
                qr qrVar2 = this.f24792b;
                qrVar2.getClass();
                ArrayList arrayList3 = this.f24793c;
                if (!arrayList3.isEmpty()) {
                    qrVar2.getMessagesController().Y3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    qrVar2.getMessagesController().S3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
