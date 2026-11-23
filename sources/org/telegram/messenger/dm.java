package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dm implements RequestDelegate {
    public final int f23583a;
    public final long f23584b;
    public final int f23585c;
    public final Object d;

    public dm(c1 c1Var, long j3, int i7, int i10) {
        this.f23583a = i10;
        this.d = c1Var;
        this.f23584b = j3;
        this.f23585c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23583a) {
            case 0:
                np npVar = (np) this.d;
                HashMap hashMap = npVar.f26017y8;
                hashMap.remove(this.f23584b + "_" + this.f23585c);
                if (tL_error == null && tLObject != null) {
                    npVar.V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                f00 f00Var = (f00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j3 = this.f23584b;
                int i7 = this.f23585c;
                int i10 = 0;
                if (z10) {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).f28455id);
                        i10++;
                    }
                    g0.g3(new z1(f00Var, tL_messages_savedDialogs, j3, hVar, i7, 7));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i10 < tL_messages_savedDialogsSlice.messages.size()) {
                        hVar.k(tL_messages_savedDialogsSlice.messages.get(i10), tL_messages_savedDialogsSlice.messages.get(i10).f28455id);
                        i10++;
                    }
                    g0.g3(new z1(f00Var, tL_messages_savedDialogsSlice, j3, hVar, i7, 8));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    g0.g3(new cr(f00Var, j3, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                    while (i10 < tL_messages_forumTopics.messages.size()) {
                        hVar.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).f28455id);
                        i10++;
                    }
                    g0.g3(new bi.p4(f00Var, tL_messages_forumTopics, j3, tL_messages_forumTopics, hVar, i7));
                    return;
                } else {
                    g0.g3(new wz(f00Var, j3, 0));
                    return;
                }
            default:
                g0.g3(new bi.u3(this.f23585c, 3, this.f23584b, (org.telegram.ui.g4) this.d, tLObject));
                return;
        }
    }

    public dm(org.telegram.ui.g4 g4Var, int i7, long j3) {
        this.f23583a = 2;
        this.d = g4Var;
        this.f23585c = i7;
        this.f23584b = j3;
    }
}
