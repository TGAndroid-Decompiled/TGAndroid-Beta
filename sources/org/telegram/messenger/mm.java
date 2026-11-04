package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mm implements RequestDelegate {
    public final int f24227a;
    public final c1 f24228b;
    public final long f24229c;
    public final Object d;
    public final Object f24230e;

    public mm(hp hpVar, long j10, Object obj, TLObject tLObject, int i3) {
        this.f24227a = i3;
        this.f24228b = hpVar;
        this.f24229c = j10;
        this.d = obj;
        this.f24230e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24227a) {
            case 0:
                g0.h3(new bm((hp) this.f24228b, tLObject, this.f24229c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f24230e, 2));
                return;
            case 1:
                hp hpVar = (hp) this.f24228b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f24230e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    long j10 = this.f24229c;
                    if (i3 > 0) {
                        hpVar.i0(j10, iArr[0], inputPeer);
                    }
                    hpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    qr messagesStorage = hpVar.getMessagesStorage();
                    messagesStorage.f24934a.c(new op(messagesStorage, j10, 5));
                    return;
                }
                return;
            default:
                c00 c00Var = (c00) this.f24228b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                ArrayList arrayList = (ArrayList) this.f24230e;
                c00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j11 = this.f24229c;
                    if (equals) {
                        if (d2Var != null) {
                            c00Var.a(j11, arrayList, true);
                            g0.h3(new b4(14, c00Var, d2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.h3(new ci.cc((Object) c00Var, j11, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public mm(c00 c00Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, ArrayList arrayList) {
        this.f24227a = 2;
        this.f24228b = c00Var;
        this.d = d2Var;
        this.f24229c = j10;
        this.f24230e = arrayList;
    }
}
