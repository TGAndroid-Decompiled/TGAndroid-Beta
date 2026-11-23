package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ow implements Runnable {
    public final int f26191a;
    public final az f26192b;
    public final ArrayList f26193c;
    public final int d;
    public final int f26194e;
    public final TLRPC.Message f26195f;
    public final int h;
    public final TLRPC.Message f26196n;
    public final gj f26197r;
    public final int f26198s;

    public ow(az azVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, gj gjVar, int i12, int i13) {
        this.f26191a = i13;
        this.f26192b = azVar;
        this.f26193c = arrayList;
        this.d = i7;
        this.f26194e = i10;
        this.f26195f = message;
        this.h = i11;
        this.f26196n = message2;
        this.f26197r = gjVar;
        this.f26198s = i12;
    }

    @Override
    public final void run() {
        switch (this.f26191a) {
            case 0:
                az azVar = this.f26192b;
                azVar.getMessagesStorage().f27250a.c(new ow(azVar, this.f26193c, this.d, this.f26194e, this.f26195f, this.h, this.f26196n, this.f26197r, this.f26198s, 1));
                return;
            default:
                final az azVar2 = this.f26192b;
                ur messagesStorage = azVar2.getMessagesStorage();
                ArrayList arrayList = this.f26193c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f26194e;
                final TLRPC.Message message = this.f26195f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f26196n;
                final gj gjVar = this.f26197r;
                final int i12 = this.f26198s;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        az azVar3 = az.this;
                        azVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        np messagesController = azVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j3 = message3.dialog_id;
                        int i14 = i7;
                        if (i14 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z11 = true;
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f28455id);
                        ArrayList arrayList3 = new ArrayList();
                        gj gjVar2 = gjVar;
                        arrayList3.add(new gj(gjVar2.K1, gjVar2.f24213k, true, true));
                        azVar3.getMessagesController().x5(i14, message3.dialog_id, arrayList3);
                        azVar3.getMediaDataController().y0(message3.dialog_id);
                        azVar3.d0(i13);
                        if (i12 == 0) {
                            z11 = false;
                        }
                        azVar3.i0(i13, z11);
                    }
                });
                return;
        }
    }
}
