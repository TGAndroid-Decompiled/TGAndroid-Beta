package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hx implements Runnable {
    public final int f16128a;
    public final rz f16129b;
    public final ArrayList f16130c;
    public final int d;
    public final int e;
    public final TLRPC.Message f16131f;
    public final int h;
    public final TLRPC.Message f16132n;
    public final kj f16133r;
    public final int f16134s;

    public hx(rz rzVar, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, kj kjVar, int i13, int i14) {
        this.f16128a = i14;
        this.f16129b = rzVar;
        this.f16130c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f16131f = message;
        this.h = i12;
        this.f16132n = message2;
        this.f16133r = kjVar;
        this.f16134s = i13;
    }

    @Override
    public final void run() {
        switch (this.f16128a) {
            case 0:
                rz rzVar = this.f16129b;
                rzVar.getMessagesStorage().f16331a.c(new hx(rzVar, this.f16130c, this.d, this.e, this.f16131f, this.h, this.f16132n, this.f16133r, this.f16134s, 1));
                return;
            default:
                final rz rzVar2 = this.f16129b;
                is messagesStorage = rzVar2.getMessagesStorage();
                ArrayList arrayList = this.f16130c;
                final int i10 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i10, 0L);
                final int i11 = this.e;
                final TLRPC.Message message = this.f16131f;
                final int i12 = this.h;
                final TLRPC.Message message2 = this.f16132n;
                final kj kjVar = this.f16133r;
                final int i13 = this.f16134s;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        rz rzVar3 = rz.this;
                        rzVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = i11;
                        arrayList2.add(Integer.valueOf(i14));
                        wp messagesController = rzVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j10 = message3.dialog_id;
                        int i15 = i10;
                        if (i15 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z11 = true;
                        messagesController.b0(arrayList2, null, null, j10, false, i12, false, 0L, null, 0, z10, message2.f19815id);
                        ArrayList arrayList3 = new ArrayList();
                        kj kjVar2 = kjVar;
                        arrayList3.add(new kj(kjVar2.I1, kjVar2.f16690k, true, true));
                        rzVar3.getMessagesController().i5(i15, message3.dialog_id, arrayList3);
                        rzVar3.getMediaDataController().w0(message3.dialog_id);
                        rzVar3.d0(i14);
                        if (i13 == 0) {
                            z11 = false;
                        }
                        rzVar3.i0(i14, z11);
                    }
                });
                return;
        }
    }
}
