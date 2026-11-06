package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vw implements Runnable {
    public final int f26211a;
    public final gz f26212b;
    public final ArrayList f26213c;
    public final int d;
    public final int f26214e;
    public final TLRPC.Message f26215f;
    public final int h;
    public final TLRPC.Message f26216n;
    public final ij f26217r;
    public final int f26218s;

    public vw(gz gzVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, ij ijVar, int i12, int i13) {
        this.f26211a = i13;
        this.f26212b = gzVar;
        this.f26213c = arrayList;
        this.d = i7;
        this.f26214e = i10;
        this.f26215f = message;
        this.h = i11;
        this.f26216n = message2;
        this.f26217r = ijVar;
        this.f26218s = i12;
    }

    @Override
    public final void run() {
        switch (this.f26211a) {
            case 0:
                gz gzVar = this.f26212b;
                gzVar.getMessagesStorage().f26688a.c(new vw(gzVar, this.f26213c, this.d, this.f26214e, this.f26215f, this.h, this.f26216n, this.f26217r, this.f26218s, 1));
                return;
            default:
                final gz gzVar2 = this.f26212b;
                yr messagesStorage = gzVar2.getMessagesStorage();
                ArrayList arrayList = this.f26213c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f26214e;
                final TLRPC.Message message = this.f26215f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f26216n;
                final ij ijVar = this.f26217r;
                final int i12 = this.f26218s;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9;
                        gz gzVar3 = gz.this;
                        gzVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        qp messagesController = gzVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j3 = message3.dialog_id;
                        int i14 = i7;
                        if (i14 == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z10 = true;
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z9, message2.f26973id);
                        ArrayList arrayList3 = new ArrayList();
                        ij ijVar2 = ijVar;
                        arrayList3.add(new ij(ijVar2.I1, ijVar2.f23237k, true, true));
                        gzVar3.getMessagesController().l5(i14, message3.dialog_id, arrayList3);
                        gzVar3.getMediaDataController().w0(message3.dialog_id);
                        gzVar3.d0(i13);
                        if (i12 == 0) {
                            z10 = false;
                        }
                        gzVar3.i0(i13, z10);
                    }
                });
                return;
        }
    }
}
