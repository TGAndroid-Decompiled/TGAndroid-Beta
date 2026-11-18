package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f26793a;
    public final ri f26794b;
    public final boolean f26795c;
    public final int d;

    public sf(ri riVar, boolean z10, int i7, int i10) {
        this.f26793a = i10;
        this.f26794b = riVar;
        this.f26795c = z10;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.f26793a) {
            case 0:
                ri riVar = this.f26794b;
                boolean[] zArr = riVar.f26649x0;
                boolean z10 = this.f26795c;
                zArr[z10 ? 1 : 0] = false;
                riVar.f26652y0[z10 ? 1 : 0] = true;
                riVar.f26634r0[z10 ? 1 : 0] = this.d;
                return;
            case 1:
                this.f26794b.f26634r0[this.f26795c ? 1 : 0] = this.d;
                return;
            default:
                ri riVar2 = this.f26794b;
                boolean z11 = this.f26795c;
                int i10 = this.d;
                if (z11) {
                    i7 = 2;
                } else {
                    i7 = 3;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i7 = 4;
                        } else if (i10 == 3) {
                            i7 = 6;
                        } else {
                            i7 = 7;
                            if (i10 != 5) {
                                if (i10 == 7) {
                                    i7 = 8;
                                } else {
                                    i7 = 5;
                                }
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = riVar2.getMessagesStorage().f27054b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i7 + " ORDER BY date DESC", new Object[0]);
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
                    g0.g3(new vf(riVar2, z11, arrayList, i10));
                    return;
                } catch (Throwable th2) {
                    riVar2.getMessagesStorage().o(th2, true);
                    return;
                }
        }
    }
}
