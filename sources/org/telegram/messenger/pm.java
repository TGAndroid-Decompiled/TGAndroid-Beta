package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pm implements RequestDelegate {
    public final int f26263a;
    public final c1 f26264b;
    public final long f26265c;
    public final Object d;
    public final Object f26266e;

    public pm(mp mpVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26263a = i7;
        this.f26264b = mpVar;
        this.f26265c = j3;
        this.d = obj;
        this.f26266e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26263a) {
            case 0:
                g0.g3(new hm((mp) this.f26264b, tLObject, this.f26265c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26266e, 2));
                return;
            case 1:
                mp mpVar = (mp) this.f26264b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26266e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26265c;
                    if (i7 > 0) {
                        mpVar.i0(j3, iArr[0], inputPeer);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.f27052a.c(new pp(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                e00 e00Var = (e00) this.f26264b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                ArrayList arrayList = (ArrayList) this.f26266e;
                e00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26265c;
                    if (equals) {
                        if (h2Var != null) {
                            e00Var.a(j10, arrayList, true);
                            g0.g3(new w3(14, e00Var, h2Var));
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

    public pm(e00 e00Var, org.telegram.ui.ActionBar.h2 h2Var, long j3, ArrayList arrayList) {
        this.f26263a = 2;
        this.f26264b = e00Var;
        this.d = h2Var;
        this.f26265c = j3;
        this.f26266e = arrayList;
    }
}
