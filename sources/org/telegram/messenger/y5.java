package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class y5 implements Runnable {
    public final int f19337a;
    public final b6 f19338b;

    public y5(b6 b6Var, int i10) {
        this.f19337a = i10;
        this.f19338b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f19337a) {
            case 0:
                b6 b6Var = this.f19338b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    b6Var.getMessagesStorage().f15940b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = b6Var.getMessagesStorage().f15940b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, d20.i(b6Var.currentAccount).f15165n);
                                jj jjVar = new jj(b6Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(jjVar);
                                if (intValue == 0) {
                                    arrayList.add(jjVar);
                                } else {
                                    arrayList2.add(jjVar);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                b6Var.getFileLoader().l(arrayList);
                b6Var.getFileLoader().l(arrayList2);
                i0.g3(new mg(b6Var, arrayList, arrayList2, 18));
                return;
            case 1:
                b6 b6Var2 = this.f19338b;
                b6Var2.getNotificationCenter().b(b6Var2, 143);
                b6Var2.getNotificationCenter().b(b6Var2, 142);
                b6Var2.getNotificationCenter().b(b6Var2, 141);
                b6Var2.getNotificationCenter().b(b6Var2, 140);
                b6Var2.getNotificationCenter().b(b6Var2, 135);
                b6Var2.getNotificationCenter().b(b6Var2, 136);
                b6Var2.s(false);
                return;
            default:
                try {
                    this.f19338b.getMessagesStorage().f15940b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
