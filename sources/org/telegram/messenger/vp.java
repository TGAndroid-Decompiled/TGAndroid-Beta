package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
public final class vp implements Runnable {
    public final int f27210a;
    public final vr f27211b;
    public final ArrayList f27212c;
    public final ArrayList d;

    public vp(vr vrVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.f27210a = i7;
        this.f27211b = vrVar;
        this.f27212c = arrayList;
        this.d = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.f27210a) {
            case 0:
                ArrayList arrayList = this.f27212c;
                ArrayList arrayList2 = this.d;
                vr vrVar = this.f27211b;
                vrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.f27222b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        vrVar.o(e10, true);
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
                vr vrVar2 = this.f27211b;
                vrVar2.getClass();
                ArrayList arrayList3 = this.f27212c;
                if (!arrayList3.isEmpty()) {
                    vrVar2.getMessagesController().Y3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (!arrayList4.isEmpty()) {
                    vrVar2.getMessagesController().S3(arrayList4, true);
                    return;
                }
                return;
        }
    }
}
