package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nm implements RequestDelegate {
    public final int f17317a;
    public final long f17318b;
    public final int f17319c;
    public final Object d;

    public nm(f1 f1Var, long j10, int i10, int i11) {
        this.f17317a = i11;
        this.d = f1Var;
        this.f17318b = j10;
        this.f17319c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17317a) {
            case 0:
                wp wpVar = (wp) this.d;
                HashMap hashMap = wpVar.f19254t8;
                hashMap.remove(this.f17318b + "_" + this.f17319c);
                if (tL_error == null && tLObject != null) {
                    wpVar.L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                y00 y00Var = (y00) this.d;
                a0.h hVar = new a0.h();
                boolean z10 = tLObject instanceof TLRPC.TL_messages_savedDialogs;
                long j10 = this.f17318b;
                int i10 = this.f17319c;
                int i11 = 0;
                if (z10) {
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
                    while (i11 < tL_messages_savedDialogs.messages.size()) {
                        hVar.k(tL_messages_savedDialogs.messages.get(i11), tL_messages_savedDialogs.messages.get(i11).f19815id);
                        i11++;
                    }
                    i0.g3(new d2(y00Var, tL_messages_savedDialogs, j10, hVar, i10, 8));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
                    TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
                    while (i11 < tL_messages_savedDialogsSlice.messages.size()) {
                        hVar.k(tL_messages_savedDialogsSlice.messages.get(i11), tL_messages_savedDialogsSlice.messages.get(i11).f19815id);
                        i11++;
                    }
                    i0.g3(new d2(y00Var, tL_messages_savedDialogsSlice, j10, hVar, i10, 7));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
                    i0.g3(new pr(y00Var, j10, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 5));
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                    while (i11 < tL_messages_forumTopics.messages.size()) {
                        hVar.k(tL_messages_forumTopics.messages.get(i11), tL_messages_forumTopics.messages.get(i11).f19815id);
                        i11++;
                    }
                    i0.g3(new o00(y00Var, tL_messages_forumTopics, j10, tL_messages_forumTopics, hVar, i10));
                    return;
                } else {
                    i0.g3(new p00(y00Var, j10, 0));
                    return;
                }
            default:
                i0.g3(new org.telegram.ui.z(this.f17319c, 0, this.f17318b, (org.telegram.ui.h4) this.d, tLObject));
                return;
        }
    }

    public nm(org.telegram.ui.h4 h4Var, int i10, long j10) {
        this.f17317a = 2;
        this.d = h4Var;
        this.f17319c = i10;
        this.f17318b = j10;
    }
}
