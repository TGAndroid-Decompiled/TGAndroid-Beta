package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class ws0 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ws0(hd hdVar, long j, j5 j5Var, sc7 sc7Var) {
        this.a = (byte) 2;
        this.d = hdVar;
        this.b = j;
        this.c = j5Var;
        this.e = sc7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gl.d3(new o77((ct0) obj3, (hd) obj2, tLObject, this.b, (p8c) obj));
                return;
            case 1:
                gl.d3(new fl1((d) obj3, tLObject, (t97) obj2, tL_error, (s54) obj, this.b, (byte) 2));
                return;
            case 2:
                gl.d3(new o77((hd) obj2, tLObject, this.b, (j5) obj3, (sc7) obj, (byte) 8));
                return;
            case 3:
                gl.d3(new o77((na7) obj3, tLObject, this.b, (TLRPC.messages_SavedReactionTags) obj2, (TLRPC.TL_messages_getSavedReactionTags) obj, (byte) 10));
                return;
            case 4:
                na7 na7Var = (na7) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j = this.b;
                    if (i > 0) {
                        na7Var.e0(j, iArr[0], inputPeer);
                    }
                    na7Var.O3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    messagesStorage.a.c(new ua7(messagesStorage, j, (byte) 5));
                    return;
                }
                return;
            case 5:
                gl.d3(new fl1((vqa) obj3, tLObject, (String) obj2, (TL_stars.InputSavedStarGift) obj, tL_error, this.b, (byte) 3));
                return;
            case 6:
                gl.d3(new o77((gta) obj3, tLObject, (k27) obj2, this.b, (Runnable) obj, (byte) 16));
                return;
            default:
                pub pubVar = (pub) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) obj;
                pubVar.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j2 = this.b;
                    if (equals) {
                        if (dVar != null) {
                            pubVar.a(j2, arrayList, true);
                            gl.d3(new ee2(pubVar, dVar, (byte) 14));
                            return;
                        }
                        return;
                    } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                        gl.d3(new ko2((Object) pubVar, j2, false, (byte) 4));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public ws0(na7 na7Var, long j, Object obj, TLObject tLObject, byte b) {
        this.a = b;
        this.c = na7Var;
        this.b = j;
        this.d = obj;
        this.e = tLObject;
    }

    public ws0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public ws0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
