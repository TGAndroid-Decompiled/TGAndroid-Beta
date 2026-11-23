package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qm implements RequestDelegate {
    public final int f26436a;
    public final c1 f26437b;
    public final long f26438c;
    public final Object d;
    public final Object f26439e;

    public qm(np npVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26436a = i7;
        this.f26437b = npVar;
        this.f26438c = j3;
        this.d = obj;
        this.f26439e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26436a) {
            case 0:
                g0.g3(new im((np) this.f26437b, tLObject, this.f26438c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26439e, 2));
                return;
            case 1:
                np npVar = (np) this.f26437b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26439e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26438c;
                    if (i7 > 0) {
                        npVar.i0(j3, iArr[0], inputPeer);
                    }
                    npVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ur messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27214a.c(new qp(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                f00 f00Var = (f00) this.f26437b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                ArrayList arrayList = (ArrayList) this.f26439e;
                f00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26438c;
                    if (equals) {
                        if (g2Var != null) {
                            f00Var.a(j10, arrayList, true);
                            g0.g3(new w3(14, f00Var, g2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.g3(new di.vb((Object) f00Var, j10, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public qm(f00 f00Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, ArrayList arrayList) {
        this.f26436a = 2;
        this.f26437b = f00Var;
        this.d = g2Var;
        this.f26438c = j3;
        this.f26439e = arrayList;
    }
}
