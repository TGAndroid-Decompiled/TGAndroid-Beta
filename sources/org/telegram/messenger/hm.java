package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hm implements RequestDelegate {
    public final int f15914a;
    public final f1 f15915b;
    public final long f15916c;
    public final Object d;
    public final Object e;

    public hm(vp vpVar, long j10, Object obj, TLObject tLObject, int i10) {
        this.f15914a = i10;
        this.f15915b = vpVar;
        this.f15916c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15914a) {
            case 0:
                i0.g3(new ym((vp) this.f15915b, tLObject, this.f15916c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, 2));
                return;
            case 1:
                vp vpVar = (vp) this.f15915b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j10 = this.f15916c;
                    if (i10 > 0) {
                        vpVar.i0(j10, iArr[0], inputPeer);
                    }
                    vpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    hs messagesStorage = vpVar.getMessagesStorage();
                    messagesStorage.f15938a.c(new cq(messagesStorage, j10, 5));
                    return;
                }
                return;
            default:
                x00 x00Var = (x00) this.f15915b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                x00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j11 = this.f15916c;
                    if (equals) {
                        if (k2Var != null) {
                            x00Var.a(j11, arrayList, true);
                            i0.g3(new e4(12, x00Var, k2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        i0.g3(new kt((Object) x00Var, j11, false, 1));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public hm(x00 x00Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, ArrayList arrayList) {
        this.f15914a = 2;
        this.f15915b = x00Var;
        this.d = k2Var;
        this.f15916c = j10;
        this.e = arrayList;
    }
}
