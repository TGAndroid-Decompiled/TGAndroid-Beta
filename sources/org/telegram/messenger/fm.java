package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fm implements RequestDelegate {
    public final int f23516a;
    public final long f23517b;
    public final int f23518c;
    public final Object d;

    public fm(c1 c1Var, long j3, int i7, int i10) {
        this.f23516a = i10;
        this.d = c1Var;
        this.f23517b = j3;
        this.f23518c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23516a) {
            case 0:
                np npVar = (np) this.d;
                HashMap hashMap = npVar.f25401t8;
                hashMap.remove(this.f23517b + "_" + this.f23518c);
                if (tL_error == null && tLObject != null) {
                    npVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                h00 h00Var = (h00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j3 = this.f23517b;
                int i7 = this.f23518c;
                int i10 = 0;
                if (z10) {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).f28072id);
                        i10++;
                    }
                    g0.h3(new z1(h00Var, tL_messages_savedDialogs, j3, hVar, i7, 8));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i10 < tL_messages_savedDialogsSlice.messages.size()) {
                        hVar.k(tL_messages_savedDialogsSlice.messages.get(i10), tL_messages_savedDialogsSlice.messages.get(i10).f28072id);
                        i10++;
                    }
                    g0.h3(new z1(h00Var, tL_messages_savedDialogsSlice, j3, hVar, i7, 7));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    g0.h3(new fr(h00Var, j3, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                    while (i10 < tL_messages_forumTopics.messages.size()) {
                        hVar.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).f28072id);
                        i10++;
                    }
                    g0.h3(new di.v7(h00Var, tL_messages_forumTopics, j3, tL_messages_forumTopics, hVar, i7));
                    return;
                } else {
                    g0.h3(new zz(h00Var, j3, 0));
                    return;
                }
            default:
                g0.h3(new di.x7(this.f23518c, 2, this.f23517b, (org.telegram.ui.g4) this.d, tLObject));
                return;
        }
    }

    public fm(org.telegram.ui.g4 g4Var, int i7, long j3) {
        this.f23516a = 2;
        this.d = g4Var;
        this.f23518c = i7;
        this.f23517b = j3;
    }
}
