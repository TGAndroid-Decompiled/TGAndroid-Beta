package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class x5 implements Runnable {
    public final int f27819a;
    public final a6 f27820b;

    public x5(a6 a6Var, int i7) {
        this.f27819a = i7;
        this.f27820b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f27819a) {
            case 0:
                a6 a6Var = this.f27820b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    a6Var.getMessagesStorage().f27056b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = a6Var.getMessagesStorage().f27056b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, j10.i(a6Var.currentAccount).f24792n);
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
                a6 a6Var2 = this.f27820b;
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
                    this.f27820b.getMessagesStorage().f27056b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
