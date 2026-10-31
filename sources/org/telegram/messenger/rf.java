package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class rf implements Runnable {
    public final int f17724a;
    public final ui f17725b;
    public final boolean f17726c;
    public final int d;

    public rf(ui uiVar, boolean z10, int i10, int i11) {
        this.f17724a = i11;
        this.f17725b = uiVar;
        this.f17726c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i10;
        NativeByteBuffer byteBufferValue;
        switch (this.f17724a) {
            case 0:
                ui uiVar = this.f17725b;
                boolean[] zArr = uiVar.f18354w0;
                boolean z10 = this.f17726c;
                zArr[z10 ? 1 : 0] = false;
                uiVar.f18357x0[z10 ? 1 : 0] = true;
                uiVar.f18339q0[z10 ? 1 : 0] = this.d;
                return;
            case 1:
                this.f17725b.f18339q0[this.f17726c ? 1 : 0] = this.d;
                return;
            default:
                ui uiVar2 = this.f17725b;
                boolean z11 = this.f17726c;
                int i11 = this.d;
                if (z11) {
                    i10 = 2;
                } else {
                    i10 = 3;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            i10 = 4;
                        } else if (i11 == 3) {
                            i10 = 6;
                        } else {
                            i10 = 7;
                            if (i11 != 5) {
                                if (i11 == 7) {
                                    i10 = 8;
                                } else {
                                    i10 = 5;
                                }
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().f15940b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i10 + " ORDER BY date DESC", new Object[0]);
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
                    i0.g3(new uf(uiVar2, z11, arrayList, i11));
                    return;
                } catch (Throwable th2) {
                    uiVar2.getMessagesStorage().o(th2, true);
                    return;
                }
        }
    }
}
