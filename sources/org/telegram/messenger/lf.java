package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class lf implements Runnable {
    public final int f23986a;
    public final li f23987b;
    public final boolean f23988c;
    public final int d;

    public lf(li liVar, boolean z10, int i3, int i10) {
        this.f23986a = i10;
        this.f23987b = liVar;
        this.f23988c = z10;
        this.d = i3;
    }

    @Override
    public final void run() {
        int i3;
        NativeByteBuffer byteBufferValue;
        switch (this.f23986a) {
            case 0:
                li liVar = this.f23987b;
                boolean[] zArr = liVar.f24061x0;
                boolean z10 = this.f23988c;
                zArr[z10 ? 1 : 0] = false;
                liVar.f24064y0[z10 ? 1 : 0] = true;
                liVar.f24046r0[z10 ? 1 : 0] = this.d;
                return;
            case 1:
                this.f23987b.f24046r0[this.f23988c ? 1 : 0] = this.d;
                return;
            default:
                li liVar2 = this.f23987b;
                boolean z11 = this.f23988c;
                int i10 = this.d;
                if (z11) {
                    i3 = 2;
                } else {
                    i3 = 3;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i3 = 4;
                        } else if (i10 == 3) {
                            i3 = 6;
                        } else {
                            i3 = 7;
                            if (i10 != 5) {
                                if (i10 == 7) {
                                    i3 = 8;
                                } else {
                                    i3 = 5;
                                }
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = liVar2.getMessagesStorage().f24936b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i3 + " ORDER BY date DESC", new Object[0]);
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
                    g0.h3(new of(liVar2, z11, arrayList, i10));
                    return;
                } catch (Throwable th2) {
                    liVar2.getMessagesStorage().o(th2, true);
                    return;
                }
        }
    }
}
