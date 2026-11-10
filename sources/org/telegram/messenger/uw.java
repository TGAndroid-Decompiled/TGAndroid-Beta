package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uw implements Runnable {
    public final int f25909a;
    public final gz f25910b;
    public final ArrayList f25911c;
    public final int d;
    public final int f25912e;
    public final TLRPC.Message f25913f;
    public final int h;
    public final TLRPC.Message f25914n;
    public final ij f25915r;
    public final int f25916s;

    public uw(gz gzVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, ij ijVar, int i12, int i13) {
        this.f25909a = i13;
        this.f25910b = gzVar;
        this.f25911c = arrayList;
        this.d = i7;
        this.f25912e = i10;
        this.f25913f = message;
        this.h = i11;
        this.f25914n = message2;
        this.f25915r = ijVar;
        this.f25916s = i12;
    }

    @Override
    public final void run() {
        switch (this.f25909a) {
            case 0:
                gz gzVar = this.f25910b;
                gzVar.getMessagesStorage().f26723a.c(new uw(gzVar, this.f25911c, this.d, this.f25912e, this.f25913f, this.h, this.f25914n, this.f25915r, this.f25916s, 1));
                return;
            default:
                final gz gzVar2 = this.f25910b;
                yr messagesStorage = gzVar2.getMessagesStorage();
                ArrayList arrayList = this.f25911c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.f25912e;
                final TLRPC.Message message = this.f25913f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f25914n;
                final ij ijVar = this.f25915r;
                final int i12 = this.f25916s;
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
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, z9, message2.f26981id);
                        ArrayList arrayList3 = new ArrayList();
                        ij ijVar2 = ijVar;
                        arrayList3.add(new ij(ijVar2.I1, ijVar2.f23266k, true, true));
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
