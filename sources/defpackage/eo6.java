package defpackage;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class eo6 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final boolean h;
    public final pf0 n;
    public final Object r;

    public eo6(hq6 hq6Var, int i, ArrayList arrayList, boolean z, long j, int i2, int i3, long j2) {
        this.n = hq6Var;
        this.b = i;
        this.r = arrayList;
        this.h = z;
        this.c = j;
        this.e = i2;
        this.f = i3;
        this.d = j2;
    }

    @Override
    public final void run() {
        SQLitePreparedStatement executeFast;
        int i;
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.r;
        pf0 pf0Var = this.n;
        switch (b) {
            case 0:
                hq6 hq6Var = (hq6) pf0Var;
                ArrayList arrayList = (ArrayList) obj;
                int i4 = this.b;
                boolean z = this.h;
                long j = this.c;
                int i5 = this.e;
                int i6 = this.f;
                long j2 = this.d;
                if (i4 == 0) {
                    try {
                        if (arrayList.isEmpty() || z) {
                            hq6Var.getMessagesStorage().E(i5, i6, j, j2);
                            j2 = j2;
                            i6 = i6;
                            i5 = i5;
                            j = j;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                hq6Var.getMessagesStorage().b.beginTransaction();
                int i7 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i7 != 0) {
                    executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
                } else {
                    executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                }
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    TLRPC.Message message = (TLRPC.Message) obj2;
                    if (hq6.t(message)) {
                        executeFast.requery();
                        k27.p5(message);
                        i2 = i7;
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                        message.serializeToStream(nativeByteBuffer);
                        i3 = i4;
                        executeFast.bindInteger(1, message.id);
                        executeFast.bindLong(2, j);
                        int i9 = 3;
                        if (i2 != 0) {
                            executeFast.bindLong(3, j2);
                            i9 = 4;
                        }
                        executeFast.bindInteger(i9, message.date);
                        executeFast.bindInteger(i9 + 1, i6);
                        executeFast.bindByteBuffer(i9 + 2, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } else {
                        i2 = i7;
                        i3 = i4;
                    }
                    i7 = i2;
                    i4 = i3;
                }
                int i10 = i4;
                executeFast.dispose();
                if (!z || i5 != 0 || i10 != 0) {
                    if (z && i10 == 0) {
                        i = 1;
                    } else {
                        i = ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id;
                    }
                    if (i10 != 0) {
                        hq6Var.getMessagesStorage().s(j, i, ((TLRPC.Message) arrayList.get(0)).id, i6, j2);
                    } else if (i5 != 0) {
                        hq6Var.getMessagesStorage().s(j, i, i5, i6, j2);
                    } else {
                        hq6Var.getMessagesStorage().s(j, i, Integer.MAX_VALUE, i6, j2);
                    }
                }
                hq6Var.getMessagesStorage().b.commitTransaction();
                return;
            default:
                int i11 = this.f;
                boolean z2 = this.h;
                ((ad7) pf0Var).B0(this.b, this.e, i11, this.c, this.d, (TLRPC.messages_Messages) obj, z2);
                return;
        }
    }

    public eo6(ad7 ad7Var, int i, TLRPC.messages_Messages messages_messages, long j, long j2, int i2, int i3, boolean z) {
        this.n = ad7Var;
        this.b = i;
        this.r = messages_messages;
        this.c = j;
        this.d = j2;
        this.e = i2;
        this.f = i3;
        this.h = z;
    }
}
