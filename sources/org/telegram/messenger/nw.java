package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f24448a;
    public final yy f24449b;
    public final ArrayList f24450c;
    public final int d;
    public final int f24451e;
    public final TLRPC.Message f24452f;
    public final int h;
    public final TLRPC.Message f24453n;
    public final zi f24454r;
    public final int f24455s;

    public nw(yy yyVar, ArrayList arrayList, int i3, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, zi ziVar, int i12, int i13) {
        this.f24448a = i13;
        this.f24449b = yyVar;
        this.f24450c = arrayList;
        this.d = i3;
        this.f24451e = i10;
        this.f24452f = message;
        this.h = i11;
        this.f24453n = message2;
        this.f24454r = ziVar;
        this.f24455s = i12;
    }

    @Override
    public final void run() {
        switch (this.f24448a) {
            case 0:
                yy yyVar = this.f24449b;
                yyVar.getMessagesStorage().f24934a.c(new nw(yyVar, this.f24450c, this.d, this.f24451e, this.f24452f, this.h, this.f24453n, this.f24454r, this.f24455s, 1));
                return;
            default:
                final yy yyVar2 = this.f24449b;
                qr messagesStorage = yyVar2.getMessagesStorage();
                ArrayList arrayList = this.f24450c;
                final int i3 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i3, 0L);
                final int i10 = this.f24451e;
                final TLRPC.Message message = this.f24452f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.f24453n;
                final zi ziVar = this.f24454r;
                final int i12 = this.f24455s;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        yy yyVar3 = yy.this;
                        yyVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        hp messagesController = yyVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j10 = message3.dialog_id;
                        int i14 = i3;
                        if (i14 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z11 = true;
                        messagesController.b0(arrayList2, null, null, j10, false, i11, false, 0L, null, 0, z10, message2.f27022id);
                        ArrayList arrayList3 = new ArrayList();
                        zi ziVar2 = ziVar;
                        arrayList3.add(new zi(ziVar2.I1, ziVar2.f26868k, true, true));
                        yyVar3.getMessagesController().l5(i14, message3.dialog_id, arrayList3);
                        yyVar3.getMediaDataController().w0(message3.dialog_id);
                        yyVar3.d0(i13);
                        if (i12 == 0) {
                            z11 = false;
                        }
                        yyVar3.i0(i13, z11);
                    }
                });
                return;
        }
    }
}
