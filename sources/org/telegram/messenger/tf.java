package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f26985a;
    public final si f26986b;
    public final boolean f26987c;
    public final int d;

    public tf(si siVar, boolean z10, int i7, int i10) {
        this.f26985a = i10;
        this.f26986b = siVar;
        this.f26987c = z10;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.f26985a) {
            case 0:
                si siVar = this.f26986b;
                boolean[] zArr = siVar.f26827x0;
                boolean z10 = this.f26987c;
                zArr[z10 ? 1 : 0] = false;
                siVar.f26830y0[z10 ? 1 : 0] = true;
                siVar.f26812r0[z10 ? 1 : 0] = this.d;
                return;
            case 1:
                this.f26986b.f26812r0[this.f26987c ? 1 : 0] = this.d;
                return;
            default:
                si siVar2 = this.f26986b;
                boolean z11 = this.f26987c;
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
                    SQLiteCursor queryFinalized = siVar2.getMessagesStorage().f27216b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i7 + " ORDER BY date DESC", new Object[0]);
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
                    g0.g3(new wf(siVar2, z11, arrayList, i10));
                    return;
                } catch (Throwable th2) {
                    siVar2.getMessagesStorage().o(th2, true);
                    return;
                }
        }
    }
}
