package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class im implements RequestDelegate {
    public final int f16307a;
    public final f1 f16308b;
    public final long f16309c;
    public final Object d;
    public final Object e;

    public im(wp wpVar, long j10, Object obj, TLObject tLObject, int i10) {
        this.f16307a = i10;
        this.f16308b = wpVar;
        this.f16309c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16307a) {
            case 0:
                i0.g3(new zm((wp) this.f16308b, tLObject, this.f16309c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                return;
            case 1:
                wp wpVar = (wp) this.f16308b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j10 = this.f16309c;
                    if (i10 > 0) {
                        wpVar.i0(j10, iArr[0], inputPeer);
                    }
                    wpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    is messagesStorage = wpVar.getMessagesStorage();
                    messagesStorage.f16331a.c(new dq(messagesStorage, j10, 5));
                    return;
                }
                return;
            default:
                y00 y00Var = (y00) this.f16308b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                y00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j11 = this.f16309c;
                    if (equals) {
                        if (k2Var != null) {
                            y00Var.a(j11, arrayList, true);
                            i0.g3(new e4(12, y00Var, k2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        i0.g3(new lt((Object) y00Var, j11, false, 1));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public im(y00 y00Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, ArrayList arrayList) {
        this.f16307a = 2;
        this.f16308b = y00Var;
        this.d = k2Var;
        this.f16309c = j10;
        this.e = arrayList;
    }
}
