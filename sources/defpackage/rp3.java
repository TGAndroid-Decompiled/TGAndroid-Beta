package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class rp3 implements Runnable {
    public final byte a;
    public final up3 b;

    public rp3(up3 up3Var, byte b) {
        this.a = b;
        this.b = up3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        up3 up3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    up3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = up3Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, y6c.h(up3Var.currentAccount).n);
                                k27 k27Var = new k27(up3Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(k27Var);
                                if (intValue == 0) {
                                    arrayList.add(k27Var);
                                } else {
                                    arrayList2.add(k27Var);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                up3Var.getFileLoader().l(arrayList);
                up3Var.getFileLoader().l(arrayList2);
                gl.c3(new mg3(up3Var, arrayList, arrayList2, (byte) 10));
                return;
            case 1:
                up3Var.getNotificationCenter().a(up3Var, 143);
                up3Var.getNotificationCenter().a(up3Var, 142);
                up3Var.getNotificationCenter().a(up3Var, 141);
                up3Var.getNotificationCenter().a(up3Var, 140);
                up3Var.getNotificationCenter().a(up3Var, 135);
                up3Var.getNotificationCenter().a(up3Var, 136);
                up3Var.s(false);
                return;
            default:
                try {
                    up3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
