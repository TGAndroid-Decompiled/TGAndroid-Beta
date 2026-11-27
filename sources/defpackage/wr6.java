package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class wr6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final byte c;
    public final Object d;

    public wr6(dw9 dw9Var, int i, boolean z) {
        this.a = (byte) 2;
        this.d = dw9Var;
        this.c = i;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        NativeByteBuffer byteBufferValue;
        byte b = this.a;
        boolean z = this.b;
        byte b2 = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                ls6 ls6Var = (ls6) obj;
                if (z) {
                    i = 2;
                } else {
                    i = 3;
                    if (b2 != 0) {
                        if (b2 == 1) {
                            i = 4;
                        } else if (b2 == 3) {
                            i = 6;
                        } else {
                            i = 7;
                            if (b2 != 5) {
                                if (b2 == 7) {
                                    i = 8;
                                } else {
                                    i = 5;
                                }
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = ls6Var.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i + " ORDER BY date DESC", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    while (queryFinalized.next()) {
                        if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                            TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                arrayList.add(TLdeserialize);
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    hl.c3(new cs6(ls6Var, z, arrayList, b2));
                    return;
                } catch (Throwable th) {
                    ls6Var.getMessagesStorage().n(th, true);
                    return;
                }
            case 1:
                ((pd8) obj).a.b.M2(b2, z);
                return;
            default:
                dw9 dw9Var = (dw9) obj;
                dw9Var.o = null;
                dw9Var.c(b2, z, true);
                return;
        }
    }

    public wr6(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }
}
