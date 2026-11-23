package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ow implements Runnable {
    public final int f26155a;
    public final az f26156b;
    public final ArrayList f26157c;
    public final int d;
    public final int f26158e;
    public final TLRPC.Message f26159f;
    public final int h;
    public final TLRPC.Message f26160n;
    public final gj f26161r;
    public final int f26162s;

    public ow(az azVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, gj gjVar, int i12, int i13) {
        this.f26155a = i13;
        this.f26156b = azVar;
        this.f26157c = arrayList;
        this.d = i7;
        this.f26158e = i10;
        this.f26159f = message;
        this.h = i11;
        this.f26160n = message2;
        this.f26161r = gjVar;
        this.f26162s = i12;
    }

    @Override
    public final void run() {
        switch (this.f26155a) {
            case 0:
                az azVar = this.f26156b;
                azVar.getMessagesStorage().f27214a.c(new ow(azVar, this.f26157c, this.d, this.f26158e, this.f26159f, this.h, this.f26160n, this.f26161r, this.f26162s, 1));
                return;
            default:
                final az azVar2 = this.f26156b;
                ur messagesStorage = azVar2.getMessagesStorage();
                ArrayList arrayList = this.f26157c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f26158e;
                final TLRPC.Message message = this.f26159f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f26160n;
                final gj gjVar = this.f26161r;
                final int i12 = this.f26162s;
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
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f28419id);
                        ArrayList arrayList3 = new ArrayList();
                        gj gjVar2 = gjVar;
                        arrayList3.add(new gj(gjVar2.K1, gjVar2.f24177k, true, true));
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
