package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tm implements RequestDelegate {
    public final int f26698a;
    public final c1 f26699b;
    public final long f26700c;
    public final Object d;
    public final Object f26701e;

    public tm(np npVar, long j3, Object obj, TLObject tLObject, int i7) {
        this.f26698a = i7;
        this.f26699b = npVar;
        this.f26700c = j3;
        this.d = obj;
        this.f26701e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26698a) {
            case 0:
                g0.h3(new im((np) this.f26699b, tLObject, this.f26700c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f26701e, 2));
                return;
            case 1:
                np npVar = (np) this.f26699b;
                int[] iArr = (int[]) this.d;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f26701e;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j3 = this.f26700c;
                    if (i7 > 0) {
                        npVar.i0(j3, iArr[0], inputPeer);
                    }
                    npVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27220a.c(new up(messagesStorage, j3, 5));
                    return;
                }
                return;
            default:
                h00 h00Var = (h00) this.f26699b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                ArrayList arrayList = (ArrayList) this.f26701e;
                h00Var.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j10 = this.f26700c;
                    if (equals) {
                        if (e2Var != null) {
                            h00Var.a(j10, arrayList, true);
                            g0.h3(new b4(14, h00Var, e2Var));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        g0.h3(new di.sb((Object) h00Var, j10, false, 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public tm(h00 h00Var, org.telegram.ui.ActionBar.e2 e2Var, long j3, ArrayList arrayList) {
        this.f26698a = 2;
        this.f26699b = h00Var;
        this.d = e2Var;
        this.f26700c = j3;
        this.f26701e = arrayList;
    }
}
