package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pm implements RequestDelegate {
    public final int f26357a;
    public final c1 f26358b;
    public final long f26359c;
    public final Object d;
    public final Object f26360e;

    public pm(mp mpVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26357a = i7;
        this.f26358b = mpVar;
        this.f26359c = j3;
        this.d = obj;
        this.f26360e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26357a) {
            case 0:
                g0.g3(new hm((mp) this.f26358b, tLObject, this.f26359c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26360e, 2));
                return;
            case 1:
                mp mpVar = (mp) this.f26358b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26360e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26359c;
                    if (i7 > 0) {
                        mpVar.i0(j3, iArr[0], inputPeer);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.f27149a.c(new pp(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                d00 d00Var = (d00) this.f26358b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                ArrayList arrayList = (ArrayList) this.f26360e;
                d00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26359c;
                    if (equals) {
                        if (g2Var != null) {
                            d00Var.a(j10, arrayList, true);
                            g0.g3(new w3(14, d00Var, g2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.g3(new di.vb((Object) d00Var, j10, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public pm(d00 d00Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, ArrayList arrayList) {
        this.f26357a = 2;
        this.f26358b = d00Var;
        this.d = g2Var;
        this.f26359c = j3;
        this.f26360e = arrayList;
    }
}
