package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uw implements Runnable {
    public final int f25905a;
    public final gz f25906b;
    public final ArrayList f25907c;
    public final int d;
    public final int f25908e;
    public final TLRPC.Message f25909f;
    public final int h;
    public final TLRPC.Message f25910n;
    public final ij f25911r;
    public final int f25912s;

    public uw(gz gzVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, ij ijVar, int i12, int i13) {
        this.f25905a = i13;
        this.f25906b = gzVar;
        this.f25907c = arrayList;
        this.d = i7;
        this.f25908e = i10;
        this.f25909f = message;
        this.h = i11;
        this.f25910n = message2;
        this.f25911r = ijVar;
        this.f25912s = i12;
    }

    @Override
    public final void run() {
        switch (this.f25905a) {
            case 0:
                gz gzVar = this.f25906b;
                gzVar.getMessagesStorage().f26719a.c(new uw(gzVar, this.f25907c, this.d, this.f25908e, this.f25909f, this.h, this.f25910n, this.f25911r, this.f25912s, 1));
                return;
            default:
                final gz gzVar2 = this.f25906b;
                yr messagesStorage = gzVar2.getMessagesStorage();
                ArrayList arrayList = this.f25907c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f25908e;
                final TLRPC.Message message = this.f25909f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f25910n;
                final ij ijVar = this.f25911r;
                final int i12 = this.f25912s;
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
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z9, message2.f26977id);
                        ArrayList arrayList3 = new ArrayList();
                        ij ijVar2 = ijVar;
                        arrayList3.add(new ij(ijVar2.I1, ijVar2.f23262k, true, true));
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
