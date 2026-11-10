package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class tf implements Runnable {
    public final int f25618a;
    public final ui f25619b;
    public final boolean f25620c;
    public final int d;

    public tf(ui uiVar, boolean z9, int i7, int i10) {
        this.f25618a = i10;
        this.f25619b = uiVar;
        this.f25620c = z9;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.f25618a) {
            case 0:
                ui uiVar = this.f25619b;
                boolean[] zArr = uiVar.f25853w0;
                boolean z9 = this.f25620c;
                zArr[z9 ? 1 : 0] = false;
                uiVar.f25856x0[z9 ? 1 : 0] = true;
                uiVar.f25838q0[z9 ? 1 : 0] = this.d;
                return;
            case 1:
                this.f25619b.f25838q0[this.f25620c ? 1 : 0] = this.d;
                return;
            default:
                ui uiVar2 = this.f25619b;
                boolean z10 = this.f25620c;
                int i10 = this.d;
                if (z10) {
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
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().f26725b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i7 + " ORDER BY date DESC", new Object[0]);
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
                    g0.h3(new wf(uiVar2, z10, arrayList, i10));
                    return;
                } catch (Throwable th2) {
                    uiVar2.getMessagesStorage().o(th2, true);
                    return;
                }
        }
    }
}
