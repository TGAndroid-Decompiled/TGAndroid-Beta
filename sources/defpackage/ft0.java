package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class ft0 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ft0(id idVar, long j, k5 k5Var, bf7 bf7Var) {
        this.a = (byte) 2;
        this.d = idVar;
        this.b = j;
        this.c = k5Var;
        this.e = bf7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hl.c3(new da7((kt0) obj3, (id) obj2, tLObject, this.b, (pcc) obj));
                return;
            case 1:
                hl.c3(new nm1((e) obj3, tLObject, (ac7) obj2, tL_error, (lw3) obj, this.b, (byte) 2));
                return;
            case 2:
                hl.c3(new da7((id) obj2, tLObject, this.b, (k5) obj3, (bf7) obj, (byte) 8));
                return;
            case 3:
                hl.c3(new da7((uc7) obj3, tLObject, this.b, (TLRPC.messages_SavedReactionTags) obj2, (TLRPC.TL_messages_getSavedReactionTags) obj, (byte) 11));
                return;
            case 4:
                uc7 uc7Var = (uc7) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j = this.b;
                    if (i > 0) {
                        uc7Var.g0(j, iArr[0], inputPeer);
                    }
                    uc7Var.W3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    jf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new le7(messagesStorage, j, (byte) 4));
                    return;
                }
                return;
            case 5:
                hl.c3(new nm1((wua) obj3, tLObject, (String) obj2, (TL_stars.InputSavedStarGift) obj, tL_error, this.b, (byte) 3));
                return;
            case 6:
                hl.c3(new da7((jxa) obj3, tLObject, (r47) obj2, this.b, (Runnable) obj, (byte) 17));
                return;
            default:
                qyb qybVar = (qyb) obj3;
                e eVar = (e) obj2;
                ArrayList arrayList = (ArrayList) obj;
                qybVar.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j2 = this.b;
                    if (equals) {
                        if (eVar != null) {
                            qybVar.a(j2, arrayList, true);
                            hl.c3(new ve2(qybVar, eVar, (byte) 14));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        hl.c3(new dp2((Object) qybVar, j2, false, (byte) 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public ft0(uc7 uc7Var, long j, Object obj, TLObject tLObject, byte b) {
        this.a = b;
        this.c = uc7Var;
        this.b = j;
        this.d = obj;
        this.e = tLObject;
    }

    public ft0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public ft0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
