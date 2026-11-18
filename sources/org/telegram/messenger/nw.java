package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f25994a;
    public final zy f25995b;
    public final ArrayList f25996c;
    public final int d;
    public final int f25997e;
    public final TLRPC.Message f25998f;
    public final int h;
    public final TLRPC.Message f25999n;
    public final fj f26000r;
    public final int f26001s;

    public nw(zy zyVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, fj fjVar, int i12, int i13) {
        this.f25994a = i13;
        this.f25995b = zyVar;
        this.f25996c = arrayList;
        this.d = i7;
        this.f25997e = i10;
        this.f25998f = message;
        this.h = i11;
        this.f25999n = message2;
        this.f26000r = fjVar;
        this.f26001s = i12;
    }

    @Override
    public final void run() {
        switch (this.f25994a) {
            case 0:
                zy zyVar = this.f25995b;
                zyVar.getMessagesStorage().f27054a.c(new nw(zyVar, this.f25996c, this.d, this.f25997e, this.f25998f, this.h, this.f25999n, this.f26000r, this.f26001s, 1));
                return;
            default:
                final zy zyVar2 = this.f25995b;
                tr messagesStorage = zyVar2.getMessagesStorage();
                ArrayList arrayList = this.f25996c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f25997e;
                final TLRPC.Message message = this.f25998f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f25999n;
                final fj fjVar = this.f26000r;
                final int i12 = this.f26001s;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        zy zyVar3 = zy.this;
                        zyVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        mp messagesController = zyVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j3 = message3.dialog_id;
                        int i14 = i7;
                        if (i14 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z11 = true;
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f28426id);
                        ArrayList arrayList3 = new ArrayList();
                        fj fjVar2 = fjVar;
                        arrayList3.add(new fj(fjVar2.K1, fjVar2.f23968k, true, true));
                        zyVar3.getMessagesController().x5(i14, message3.dialog_id, arrayList3);
                        zyVar3.getMediaDataController().y0(message3.dialog_id);
                        zyVar3.d0(i13);
                        if (i12 == 0) {
                            z11 = false;
                        }
                        zyVar3.i0(i13, z11);
                    }
                });
                return;
        }
    }
}
