package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f26020a;
    public final zy f26021b;
    public final ArrayList f26022c;
    public final int d;
    public final int f26023e;
    public final TLRPC.Message f26024f;
    public final int h;
    public final TLRPC.Message f26025n;
    public final fj f26026r;
    public final int f26027s;

    public nw(zy zyVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, fj fjVar, int i12, int i13) {
        this.f26020a = i13;
        this.f26021b = zyVar;
        this.f26022c = arrayList;
        this.d = i7;
        this.f26023e = i10;
        this.f26024f = message;
        this.h = i11;
        this.f26025n = message2;
        this.f26026r = fjVar;
        this.f26027s = i12;
    }

    @Override
    public final void run() {
        switch (this.f26020a) {
            case 0:
                zy zyVar = this.f26021b;
                zyVar.getMessagesStorage().f27080a.c(new nw(zyVar, this.f26022c, this.d, this.f26023e, this.f26024f, this.h, this.f26025n, this.f26026r, this.f26027s, 1));
                return;
            default:
                final zy zyVar2 = this.f26021b;
                tr messagesStorage = zyVar2.getMessagesStorage();
                ArrayList arrayList = this.f26022c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f26023e;
                final TLRPC.Message message = this.f26024f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f26025n;
                final fj fjVar = this.f26026r;
                final int i12 = this.f26027s;
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
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f28452id);
                        ArrayList arrayList3 = new ArrayList();
                        fj fjVar2 = fjVar;
                        arrayList3.add(new fj(fjVar2.K1, fjVar2.f23993k, true, true));
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
