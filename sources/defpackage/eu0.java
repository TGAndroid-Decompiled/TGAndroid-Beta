package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class eu0 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public eu0(he heVar, long j, j5 j5Var, ue7 ue7Var) {
        this.a = (byte) 2;
        this.d = heVar;
        this.b = j;
        this.c = j5Var;
        this.e = ue7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gm.c3(new r97((ku0) obj3, (he) obj2, tLObject, this.b, (qac) obj));
                return;
            case 1:
                gm.c3(new om1((d) obj3, tLObject, (ub7) obj2, tL_error, (a14) obj, this.b, (byte) 2));
                return;
            case 2:
                gm.c3(new r97((he) obj2, tLObject, this.b, (j5) obj3, (ue7) obj, (byte) 8));
                return;
            case 3:
                gm.c3(new r97((oc7) obj3, tLObject, this.b, (TLRPC.messages_SavedReactionTags) obj2, (TLRPC.TL_messages_getSavedReactionTags) obj, (byte) 10));
                return;
            case 4:
                oc7 oc7Var = (oc7) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j = this.b;
                    if (i > 0) {
                        oc7Var.e0(j, iArr[0], inputPeer);
                    }
                    oc7Var.R3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    messagesStorage.a.c(new vc7(messagesStorage, j, (byte) 5));
                    return;
                }
                return;
            case 5:
                gm.c3(new om1((wsa) obj3, tLObject, (String) obj2, (TL_stars.InputSavedStarGift) obj, tL_error, this.b, (byte) 3));
                return;
            case 6:
                gm.c3(new r97((jva) obj3, tLObject, (k47) obj2, this.b, (Runnable) obj, (byte) 16));
                return;
            default:
                qwb qwbVar = (qwb) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) obj;
                qwbVar.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j2 = this.b;
                    if (equals) {
                        if (dVar != null) {
                            qwbVar.a(j2, arrayList, true);
                            gm.c3(new pf2(qwbVar, dVar, (byte) 14));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        gm.c3(new vp2((Object) qwbVar, j2, false, (byte) 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public eu0(oc7 oc7Var, long j, Object obj, TLObject tLObject, byte b) {
        this.a = b;
        this.c = oc7Var;
        this.b = j;
        this.d = obj;
        this.e = tLObject;
    }

    public eu0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public eu0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
