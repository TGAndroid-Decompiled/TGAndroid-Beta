package defpackage;

import android.os.Bundle;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class mw3 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public mw3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hl.c3(new cv2((nw3) obj2, (String) obj, tLObject, (byte) 20));
                return;
            case 1:
                hl.c3(new vx3((he4) obj2, (id) obj, (byte) 25));
                return;
            case 2:
                hl.c3(new vx3((nf4) obj2, (id) obj, (byte) 29));
                return;
            case 3:
                hl.c3(new re4((Object) ((hf4) obj2), (Object) tL_error, (Object) ((ff4) obj), (byte) 2));
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                hl.c3(new se4(filtersSetupActivity, (TLRPC.TL_messages_toggleDialogFilterTags) obj, (byte) 3));
                return;
            case 5:
                hl.c3(new ao1((qn4) obj2, tL_error, tLObject, (pcc) obj, false, (byte) 20));
                return;
            case 6:
                hl.c3(new se4((qn4) obj2, (Pair) obj, (byte) 9));
                return;
            case 7:
                hl.c3(new re4((Object) ((vt4) obj2), tLObject, (Object) ((uc7) obj), (byte) 9));
                return;
            case 8:
                hl.c3(new re4((bx4) obj2, (String) obj, tLObject, (byte) 10));
                return;
            case 9:
                hl.c3(new g65((v85) obj2, tL_error, tLObject, (String) obj, (byte) 3));
                return;
            case 10:
                jd5 jd5Var = (jd5) obj2;
                if (Objects.equals(jd5Var.a.e, (String) obj)) {
                    hl.c3(new se4(jd5Var, tLObject, (byte) 26));
                    return;
                }
                return;
            case 11:
                hl.c3(new g65((sd5) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, (byte) 6));
                return;
            case 12:
                yr5 yr5Var = (yr5) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            hl.c3(new re4((Object) yr5Var, (Object) ((TLRPC.TL_langPackString) langPackString), (Object) str, (byte) 28));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                String str2 = LaunchActivity.C1;
                hl.c3(new g65((id) obj2, tLObject, (v8) obj, tL_error, (byte) 10));
                return;
            case 14:
                String str3 = LaunchActivity.C1;
                hl.c3(new ls5((LaunchActivity) obj2, tLObject, (znb) obj, (byte) 6));
                return;
            case 15:
                hl.c3(new g65((i56) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, (byte) 11));
                return;
            case 16:
                hl.c3(new ls5((e66) obj2, tLObject, (String) obj, (byte) 12));
                return;
            case 17:
                hl.c3(new ls5((Object) ((b66) obj2), (Object) tLObject, (TLRPC.User) obj, (byte) 13));
                return;
            case 18:
                hl.c3(new g65((b66) obj2, tLObject, (HashSet) obj, tL_error, (byte) 13));
                return;
            case 19:
                qh6 qh6Var = (qh6) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    hl.c3(new ls5(qh6Var, bundle, tLObject, (byte) 22));
                    return;
                } else {
                    hl.c3(new ie6(qh6Var, (byte) 2));
                    return;
                }
            case 20:
                hl.c3(new g65((vf6) obj2, tLObject, (String) obj, tL_error, (byte) 17));
                return;
            case 21:
                hl.c3(new ls5((tg6) obj2, tL_error, (TL_account.confirmPhone) obj, (byte) 26));
                return;
            case 22:
                hl.c3(new yg6((ph6) obj2, tLObject, (HashMap) obj, (byte) 1));
                return;
            case 23:
                hl.c3(new g65((ph6) obj2, tL_error, tLObject, (String) obj, (byte) 21));
                return;
            case 24:
                ls6 ls6Var = (ls6) obj2;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && xc4.r(tL_error.text)) {
                    ls6Var.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 25:
                hl.c3(new yg6((ls6) obj2, tLObject, (TLRPC.Document) obj, (byte) 7));
                return;
            case 26:
                ls6 ls6Var2 = (ls6) obj2;
                tw4 tw4Var = (tw4) obj;
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    ls6Var2.w1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    ls6Var2.w1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (tw4Var != null) {
                    hl.c3(tw4Var);
                    return;
                }
                return;
            case 27:
                hl.c3(new yg6((r17) obj2, (String) obj, tLObject, (byte) 15));
                return;
            case 28:
                hl.c3(new yg6((uc7) obj2, tLObject, (ArrayList) obj, (byte) 19));
                return;
            default:
                uc7 uc7Var = (uc7) obj2;
                sn2 sn2Var = (sn2) obj;
                if (tL_error == null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    if (sn2Var != null) {
                        hl.c3(sn2Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
