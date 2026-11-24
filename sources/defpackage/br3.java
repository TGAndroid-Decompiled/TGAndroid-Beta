package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class br3 implements Runnable {
    public final byte a;
    public final er3 b;

    public br3(er3 er3Var, byte b) {
        this.a = b;
        this.b = er3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        er3 er3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    er3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = er3Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, z8c.h(er3Var.currentAccount).n);
                                k47 k47Var = new k47(er3Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(k47Var);
                                if (intValue == 0) {
                                    arrayList.add(k47Var);
                                } else {
                                    arrayList2.add(k47Var);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                er3Var.getFileLoader().l(arrayList);
                er3Var.getFileLoader().l(arrayList2);
                gm.c3(new pz2(er3Var, arrayList, arrayList2, (byte) 12));
                return;
            case 1:
                er3Var.getNotificationCenter().a(er3Var, 144);
                er3Var.getNotificationCenter().a(er3Var, 143);
                er3Var.getNotificationCenter().a(er3Var, 142);
                er3Var.getNotificationCenter().a(er3Var, 141);
                er3Var.getNotificationCenter().a(er3Var, 136);
                er3Var.getNotificationCenter().a(er3Var, 137);
                er3Var.s(false);
                return;
            default:
                try {
                    er3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
