package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class w5 implements Runnable {
    public final int f26162a;
    public final z5 f26163b;

    public w5(z5 z5Var, int i3) {
        this.f26162a = i3;
        this.f26163b = z5Var;
    }

    @Override
    public final void run() {
        switch (this.f26162a) {
            case 0:
                z5 z5Var = this.f26163b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    z5Var.getMessagesStorage().f24936b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = z5Var.getMessagesStorage().f24936b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, h10.i(z5Var.currentAccount).f22848n);
                                zi ziVar = new zi(z5Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(ziVar);
                                if (intValue == 0) {
                                    arrayList.add(ziVar);
                                } else {
                                    arrayList2.add(ziVar);
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
                g0.h3(new fg(z5Var, arrayList, arrayList2, 18));
                return;
            case 1:
                z5 z5Var2 = this.f26163b;
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
                    this.f26163b.getMessagesStorage().f24936b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
