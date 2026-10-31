package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gx implements Runnable {
    public final int f15779a;
    public final qz f15780b;
    public final ArrayList f15781c;
    public final int d;
    public final int e;
    public final TLRPC.Message f15782f;
    public final int h;
    public final TLRPC.Message f15783n;
    public final jj f15784r;
    public final int f15785s;

    public gx(qz qzVar, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, jj jjVar, int i13, int i14) {
        this.f15779a = i14;
        this.f15780b = qzVar;
        this.f15781c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f15782f = message;
        this.h = i12;
        this.f15783n = message2;
        this.f15784r = jjVar;
        this.f15785s = i13;
    }

    @Override
    public final void run() {
        switch (this.f15779a) {
            case 0:
                qz qzVar = this.f15780b;
                qzVar.getMessagesStorage().f15938a.c(new gx(qzVar, this.f15781c, this.d, this.e, this.f15782f, this.h, this.f15783n, this.f15784r, this.f15785s, 1));
                return;
            default:
                final qz qzVar2 = this.f15780b;
                hs messagesStorage = qzVar2.getMessagesStorage();
                ArrayList arrayList = this.f15781c;
                final int i10 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i10, 0L);
                final int i11 = this.e;
                final TLRPC.Message message = this.f15782f;
                final int i12 = this.h;
                final TLRPC.Message message2 = this.f15783n;
                final jj jjVar = this.f15784r;
                final int i13 = this.f15785s;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        qz qzVar3 = qz.this;
                        qzVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = i11;
                        arrayList2.add(Integer.valueOf(i14));
                        vp messagesController = qzVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j10 = message3.dialog_id;
                        int i15 = i10;
                        if (i15 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z11 = true;
                        messagesController.b0(arrayList2, null, null, j10, false, i12, false, 0L, null, 0, z10, message2.f19814id);
                        ArrayList arrayList3 = new ArrayList();
                        jj jjVar2 = jjVar;
                        arrayList3.add(new jj(jjVar2.I1, jjVar2.f16337k, true, true));
                        qzVar3.getMessagesController().i5(i15, message3.dialog_id, arrayList3);
                        qzVar3.getMediaDataController().w0(message3.dialog_id);
                        qzVar3.d0(i14);
                        if (i13 == 0) {
                            z11 = false;
                        }
                        qzVar3.i0(i14, z11);
                    }
                });
                return;
        }
    }
}
