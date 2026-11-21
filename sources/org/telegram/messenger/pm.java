package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pm implements RequestDelegate {
    public final int f26291a;
    public final c1 f26292b;
    public final long f26293c;
    public final Object d;
    public final Object f26294e;

    public pm(mp mpVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26291a = i7;
        this.f26292b = mpVar;
        this.f26293c = j3;
        this.d = obj;
        this.f26294e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26291a) {
            case 0:
                g0.g3(new hm((mp) this.f26292b, tLObject, this.f26293c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26294e, 2));
                return;
            case 1:
                mp mpVar = (mp) this.f26292b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26294e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26293c;
                    if (i7 > 0) {
                        mpVar.i0(j3, iArr[0], inputPeer);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.f27080a.c(new pp(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                e00 e00Var = (e00) this.f26292b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                ArrayList arrayList = (ArrayList) this.f26294e;
                e00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26293c;
                    if (equals) {
                        if (g2Var != null) {
                            e00Var.a(j10, arrayList, true);
                            g0.g3(new w3(14, e00Var, g2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.g3(new di.vb((Object) e00Var, j10, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public pm(e00 e00Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, ArrayList arrayList) {
        this.f26291a = 2;
        this.f26292b = e00Var;
        this.d = g2Var;
        this.f26293c = j3;
        this.f26294e = arrayList;
    }
}
