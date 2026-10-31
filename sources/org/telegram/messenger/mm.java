package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mm implements RequestDelegate {
    public final int f16975a;
    public final long f16976b;
    public final int f16977c;
    public final Object d;

    public mm(f1 f1Var, long j10, int i10, int i11) {
        this.f16975a = i11;
        this.d = f1Var;
        this.f16976b = j10;
        this.f16977c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16975a) {
            case 0:
                vp vpVar = (vp) this.d;
                HashMap hashMap = vpVar.f18911t8;
                hashMap.remove(this.f16976b + "_" + this.f16977c);
                if (tL_error == null && tLObject != null) {
                    vpVar.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                x00 x00Var = (x00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j10 = this.f16976b;
                int i10 = this.f16977c;
                int i11 = 0;
                if (z10) {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i11 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i11), tL_messages_savedDialogs.messages.get(i11).f19814id);
                        i11++;
                    }
                    i0.g3(new d2(x00Var, tL_messages_savedDialogs, j10, hVar, i10, 7));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i11 < tL_messages_savedDialogsSlice.messages.size()) {
                        hVar.k(tL_messages_savedDialogsSlice.messages.get(i11), tL_messages_savedDialogsSlice.messages.get(i11).f19814id);
                        i11++;
                    }
                    i0.g3(new d2(x00Var, tL_messages_savedDialogsSlice, j10, hVar, i10, 8));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    i0.g3(new or(x00Var, j10, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                    while (i11 < tL_messages_forumTopics.messages.size()) {
                        hVar.k(tL_messages_forumTopics.messages.get(i11), tL_messages_forumTopics.messages.get(i11).f19814id);
                        i11++;
                    }
                    i0.g3(new n00(x00Var, tL_messages_forumTopics, j10, tL_messages_forumTopics, hVar, i10));
                    return;
                } else {
                    i0.g3(new o00(x00Var, j10, 0));
                    return;
                }
            default:
                i0.g3(new org.telegram.ui.z(this.f16977c, 0, this.f16976b, (org.telegram.ui.h4) this.d, tLObject));
                return;
        }
    }

    public mm(org.telegram.ui.h4 h4Var, int i10, long j10) {
        this.f16975a = 2;
        this.d = h4Var;
        this.f16977c = i10;
        this.f16976b = j10;
    }
}
