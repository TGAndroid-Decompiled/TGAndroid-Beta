package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class w5 implements Runnable {
    public final int f26263a;
    public final z5 f26264b;

    public w5(z5 z5Var, int i7) {
        this.f26263a = i7;
        this.f26264b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f26263a) {
            case 0:
                z5 z5Var = this.f26264b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    z5Var.getMessagesStorage().f26725b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = z5Var.getMessagesStorage().f26725b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, p10.i(z5Var.currentAccount).f24493n);
                                ij ijVar = new ij(z5Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(ijVar);
                                if (intValue == 0) {
                                    arrayList.add(ijVar);
                                } else {
                                    arrayList2.add(ijVar);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                z5Var.getFileLoader().l(arrayList);
                z5Var.getFileLoader().l(arrayList2);
                g0.h3(new ng(z5Var, arrayList, arrayList2, 18));
                return;
            case 1:
                z5 z5Var2 = this.f26264b;
                z5Var2.getNotificationCenter().b(z5Var2, 143);
                z5Var2.getNotificationCenter().b(z5Var2, 142);
                z5Var2.getNotificationCenter().b(z5Var2, 141);
                z5Var2.getNotificationCenter().b(z5Var2, 140);
                z5Var2.getNotificationCenter().b(z5Var2, 135);
                z5Var2.getNotificationCenter().b(z5Var2, 136);
                z5Var2.s(false);
                return;
            default:
                try {
                    this.f26264b.getMessagesStorage().f26725b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
