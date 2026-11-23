package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f26088a;
    public final zy f26089b;
    public final ArrayList f26090c;
    public final int d;
    public final int f26091e;
    public final TLRPC.Message f26092f;
    public final int h;
    public final TLRPC.Message f26093n;
    public final fj f26094r;
    public final int f26095s;

    public nw(zy zyVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, fj fjVar, int i12, int i13) {
        this.f26088a = i13;
        this.f26089b = zyVar;
        this.f26090c = arrayList;
        this.d = i7;
        this.f26091e = i10;
        this.f26092f = message;
        this.h = i11;
        this.f26093n = message2;
        this.f26094r = fjVar;
        this.f26095s = i12;
    }

    @Override
    public final void run() {
        switch (this.f26088a) {
            case 0:
                zy zyVar = this.f26089b;
                zyVar.getMessagesStorage().f27149a.c(new nw(zyVar, this.f26090c, this.d, this.f26091e, this.f26092f, this.h, this.f26093n, this.f26094r, this.f26095s, 1));
                return;
            default:
                final zy zyVar2 = this.f26089b;
                tr messagesStorage = zyVar2.getMessagesStorage();
                ArrayList arrayList = this.f26090c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f26091e;
                final TLRPC.Message message = this.f26092f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f26093n;
                final fj fjVar = this.f26094r;
                final int i12 = this.f26095s;
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
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f28513id);
                        ArrayList arrayList3 = new ArrayList();
                        fj fjVar2 = fjVar;
                        arrayList3.add(new fj(fjVar2.K1, fjVar2.f24073k, true, true));
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
