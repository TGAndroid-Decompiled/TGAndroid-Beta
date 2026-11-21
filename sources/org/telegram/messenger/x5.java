package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class x5 implements Runnable {
    public final int f27845a;
    public final a6 f27846b;

    public x5(a6 a6Var, int i7) {
        this.f27845a = i7;
        this.f27846b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f27845a) {
            case 0:
                a6 a6Var = this.f27846b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    a6Var.getMessagesStorage().f27082b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = a6Var.getMessagesStorage().f27082b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, j10.i(a6Var.currentAccount).f24817n);
                                fj fjVar = new fj(a6Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(fjVar);
                                if (intValue == 0) {
                                    arrayList.add(fjVar);
                                } else {
                                    arrayList2.add(fjVar);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                a6Var.getFileLoader().l(arrayList);
                a6Var.getFileLoader().l(arrayList2);
                g0.g3(new yf(a6Var, arrayList, arrayList2, 18));
                return;
            case 1:
                a6 a6Var2 = this.f27846b;
                a6Var2.getNotificationCenter().b(a6Var2, 143);
                a6Var2.getNotificationCenter().b(a6Var2, 142);
                a6Var2.getNotificationCenter().b(a6Var2, 141);
                a6Var2.getNotificationCenter().b(a6Var2, 140);
                a6Var2.getNotificationCenter().b(a6Var2, 135);
                a6Var2.getNotificationCenter().b(a6Var2, 136);
                a6Var2.s(false);
                return;
            default:
                try {
                    this.f27846b.getMessagesStorage().f27082b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
