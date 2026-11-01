package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class sf implements Runnable {
    public final int f18088a;
    public final vi f18089b;
    public final boolean f18090c;
    public final int d;

    public sf(vi viVar, boolean z10, int i10, int i11) {
        this.f18088a = i11;
        this.f18089b = viVar;
        this.f18090c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i10;
        NativeByteBuffer byteBufferValue;
        switch (this.f18088a) {
            case 0:
                vi viVar = this.f18089b;
                boolean[] zArr = viVar.f18683w0;
                boolean z10 = this.f18090c;
                zArr[z10 ? 1 : 0] = false;
                viVar.f18686x0[z10 ? 1 : 0] = true;
                viVar.f18668q0[z10 ? 1 : 0] = this.d;
                return;
            case 1:
                this.f18089b.f18668q0[this.f18090c ? 1 : 0] = this.d;
                return;
            default:
                vi viVar2 = this.f18089b;
                boolean z11 = this.f18090c;
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
                    SQLiteCursor queryFinalized = viVar2.getMessagesStorage().f16333b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i10 + " ORDER BY date DESC", new Object[0]);
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
                    i0.g3(new vf(viVar2, z11, arrayList, i11));
                    return;
                } catch (Throwable th2) {
                    viVar2.getMessagesStorage().o(th2, true);
                    return;
                }
        }
    }
}
