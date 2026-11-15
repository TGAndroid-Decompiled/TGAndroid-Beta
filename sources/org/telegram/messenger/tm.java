package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tm implements RequestDelegate {
    public final int f26707a;
    public final c1 f26708b;
    public final long f26709c;
    public final Object d;
    public final Object f26710e;

    public tm(np npVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26707a = i7;
        this.f26708b = npVar;
        this.f26709c = j3;
        this.d = obj;
        this.f26710e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26707a) {
            case 0:
                g0.h3(new im((np) this.f26708b, tLObject, this.f26709c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26710e, 2));
                return;
            case 1:
                np npVar = (np) this.f26708b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26710e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26709c;
                    if (i7 > 0) {
                        npVar.i0(j3, iArr[0], inputPeer);
                    }
                    npVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27219a.c(new rp(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                h00 h00Var = (h00) this.f26708b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                ArrayList arrayList = (ArrayList) this.f26710e;
                h00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26709c;
                    if (equals) {
                        if (e2Var != null) {
                            h00Var.a(j10, arrayList, true);
                            g0.h3(new b4(14, h00Var, e2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.h3(new di.rb((Object) h00Var, j10, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public tm(h00 h00Var, org.telegram.ui.ActionBar.e2 e2Var, long j3, ArrayList arrayList) {
        this.f26707a = 2;
        this.f26708b = h00Var;
        this.d = e2Var;
        this.f26709c = j3;
        this.f26710e = arrayList;
    }
}
