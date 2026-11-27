package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class hq3 implements Runnable {
    public final byte a;
    public final lq3 b;

    public hq3(lq3 lq3Var, byte b) {
        this.a = b;
        this.b = lq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lq3 lq3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    SQLiteCursor queryFinalized = lq3Var.getMessagesStorage().b.queryFinalized("SELECT data, state FROM downloading_documents ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        int intValue = queryFinalized.intValue(1);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, yac.h(lq3Var.currentAccount).n);
                                r47 r47Var = new r47(lq3Var.currentAccount, TLdeserialize, false, false);
                                arrayList3.add(r47Var);
                                if (intValue == 0) {
                                    arrayList.add(r47Var);
                                } else {
                                    arrayList2.add(r47Var);
                                }
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                lq3Var.getFileLoader().l(arrayList);
                lq3Var.getFileLoader().l(arrayList2);
                hl.c3(new cv2(lq3Var, arrayList, arrayList2, (byte) 14));
                return;
            case 1:
                lq3Var.getNotificationCenter().a(lq3Var, 144);
                lq3Var.getNotificationCenter().a(lq3Var, 143);
                lq3Var.getNotificationCenter().a(lq3Var, 142);
                lq3Var.getNotificationCenter().a(lq3Var, 141);
                lq3Var.getNotificationCenter().a(lq3Var, 136);
                lq3Var.getNotificationCenter().a(lq3Var, 137);
                lq3Var.s(false);
                return;
            default:
                try {
                    lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
