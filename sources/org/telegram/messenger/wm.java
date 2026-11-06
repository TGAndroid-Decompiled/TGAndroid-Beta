package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wm implements RequestDelegate {
    public final int f26327a;
    public final c1 f26328b;
    public final long f26329c;
    public final Object d;
    public final Object f26330e;

    public wm(qp qpVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26327a = i7;
        this.f26328b = qpVar;
        this.f26329c = j3;
        this.d = obj;
        this.f26330e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26327a) {
            case 0:
                g0.h3(new lm((qp) this.f26328b, tLObject, this.f26329c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26330e, 2));
                return;
            case 1:
                qp qpVar = (qp) this.f26328b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26330e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26329c;
                    if (i7 > 0) {
                        qpVar.i0(j3, iArr[0], inputPeer);
                    }
                    qpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    yr messagesStorage = qpVar.getMessagesStorage();
                    messagesStorage.f26688a.c(new xp(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                k00 k00Var = (k00) this.f26328b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                ArrayList arrayList = (ArrayList) this.f26330e;
                k00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26329c;
                    if (equals) {
                        if (f2Var != null) {
                            k00Var.a(j10, arrayList, true);
                            g0.h3(new b4(14, k00Var, f2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.h3(new bi.kd((Object) k00Var, j10, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public wm(k00 k00Var, org.telegram.ui.ActionBar.f2 f2Var, long j3, ArrayList arrayList) {
        this.f26327a = 2;
        this.f26328b = k00Var;
        this.d = f2Var;
        this.f26329c = j3;
        this.f26330e = arrayList;
    }
}
