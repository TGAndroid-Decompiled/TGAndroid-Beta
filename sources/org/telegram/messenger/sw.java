package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sw implements Runnable {
    public final int f26578a;
    public final ez f26579b;
    public final ArrayList f26580c;
    public final int d;
    public final int f26581e;
    public final TLRPC.Message f26582f;
    public final int h;
    public final TLRPC.Message f26583n;
    public final gj f26584r;
    public final int f26585s;

    public sw(ez ezVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, gj gjVar, int i12, int i13) {
        this.f26578a = i13;
        this.f26579b = ezVar;
        this.f26580c = arrayList;
        this.d = i7;
        this.f26581e = i10;
        this.f26582f = message;
        this.h = i11;
        this.f26583n = message2;
        this.f26584r = gjVar;
        this.f26585s = i12;
    }

    @Override
    public final void run() {
        switch (this.f26578a) {
            case 0:
                ez ezVar = this.f26579b;
                ezVar.getMessagesStorage().f27220a.c(new sw(ezVar, this.f26580c, this.d, this.f26581e, this.f26582f, this.h, this.f26583n, this.f26584r, this.f26585s, 1));
                return;
            default:
                final ez ezVar2 = this.f26579b;
                vr messagesStorage = ezVar2.getMessagesStorage();
                ArrayList arrayList = this.f26580c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f26581e;
                final TLRPC.Message message = this.f26582f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f26583n;
                final gj gjVar = this.f26584r;
                final int i12 = this.f26585s;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        ez ezVar3 = ez.this;
                        ezVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        np messagesController = ezVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j3 = message3.dialog_id;
                        int i14 = i7;
                        if (i14 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z11 = true;
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f28072id);
                        ArrayList arrayList3 = new ArrayList();
                        gj gjVar2 = gjVar;
                        arrayList3.add(new gj(gjVar2.K1, gjVar2.f23817k, true, true));
                        ezVar3.getMessagesController().m5(i14, message3.dialog_id, arrayList3);
                        ezVar3.getMediaDataController().w0(message3.dialog_id);
                        ezVar3.d0(i13);
                        if (i12 == 0) {
                            z11 = false;
                        }
                        ezVar3.i0(i13, z11);
                    }
                });
                return;
        }
    }
}
