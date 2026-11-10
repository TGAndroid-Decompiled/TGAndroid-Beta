package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class im implements RequestDelegate {
    public final int f23340a;
    public final long f23341b;
    public final int f23342c;
    public final Object d;

    public im(c1 c1Var, long j3, int i7, int i10) {
        this.f23340a = i10;
        this.d = c1Var;
        this.f23341b = j3;
        this.f23342c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23340a) {
            case 0:
                qp qpVar = (qp) this.d;
                HashMap hashMap = qpVar.f24901s8;
                hashMap.remove(this.f23341b + "_" + this.f23342c);
                if (tL_error == null && tLObject != null) {
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                k00 k00Var = (k00) this.d;
                a0.h hVar = new a0.h();
                boolean z9 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j3 = this.f23341b;
                int i7 = this.f23342c;
                int i10 = 0;
                if (z9) {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).f26981id);
                        i10++;
                    }
                    g0.h3(new z1(k00Var, tL_messages_savedDialogs, j3, hVar, i7, 8));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i10 < tL_messages_savedDialogsSlice.messages.size()) {
                        hVar.k(tL_messages_savedDialogsSlice.messages.get(i10), tL_messages_savedDialogsSlice.messages.get(i10).f26981id);
                        i10++;
                    }
                    g0.h3(new z1(k00Var, tL_messages_savedDialogsSlice, j3, hVar, i7, 7));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    g0.h3(new ir(k00Var, j3, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                    while (i10 < tL_messages_forumTopics.messages.size()) {
                        hVar.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).f26981id);
                        i10++;
                    }
                    g0.h3(new bi.d9(k00Var, tL_messages_forumTopics, j3, tL_messages_forumTopics, hVar, i7));
                    return;
                } else {
                    g0.h3(new c00(k00Var, j3, 0));
                    return;
                }
            default:
                g0.h3(new bi.f9(this.f23342c, 2, this.f23341b, (org.telegram.ui.g4) this.d, tLObject));
                return;
        }
    }

    public im(org.telegram.ui.g4 g4Var, int i7, long j3) {
        this.f23340a = 2;
        this.d = g4Var;
        this.f23342c = i7;
        this.f23341b = j3;
    }
}
