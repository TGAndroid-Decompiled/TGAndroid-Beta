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
public final class cx3 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public cx3(Object obj, Object obj2, byte b) {
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
                gm.c3(new pz2((dx3) obj2, (String) obj, tLObject, (byte) 18));
                return;
            case 1:
                gm.c3(new pv3((ke4) obj2, (he) obj, (byte) 29));
                return;
            case 2:
                gm.c3(new ve4((qf4) obj2, (he) obj, (byte) 3));
                return;
            case 3:
                gm.c3(new if4((kf4) obj2, tL_error, (hf4) obj, (byte) 0));
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                gm.c3(new ve4(filtersSetupActivity, (TLRPC.TL_messages_toggleDialogFilterTags) obj, (byte) 7));
                return;
            case 5:
                gm.c3(new ve4((ln4) obj2, (Pair) obj, (byte) 13));
                return;
            case 6:
                gm.c3(new xo1((ln4) obj2, tL_error, tLObject, (qac) obj, (byte) 20));
                return;
            case 7:
                gm.c3(new if4((st4) obj2, tLObject, (oc7) obj, (byte) 7));
                return;
            case 8:
                gm.c3(new if4((yw4) obj2, (String) obj, tLObject, (byte) 8));
                return;
            case 9:
                gm.c3(new d65((r85) obj2, tL_error, tLObject, (String) obj, (byte) 3));
                return;
            case 10:
                gd5 gd5Var = (gd5) obj2;
                if (Objects.equals(gd5Var.a.e, (String) obj)) {
                    gm.c3(new fd5(gd5Var, tLObject, (byte) 1));
                    return;
                }
                return;
            case 11:
                gm.c3(new d65((pd5) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, (byte) 6));
                return;
            case 12:
                vr5 vr5Var = (vr5) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            gm.c3(new if4(vr5Var, (TLRPC.TL_langPackString) langPackString, str, (byte) 25));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                String str2 = LaunchActivity.C1;
                gm.c3(new dt5((LaunchActivity) obj2, tLObject, (bmb) obj, (byte) 6));
                return;
            case 14:
                String str3 = LaunchActivity.C1;
                gm.c3(new d65((he) obj2, tLObject, (u8) obj, tL_error, (byte) 10));
                return;
            case 15:
                gm.c3(new d65((f56) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, (byte) 11));
                return;
            case 16:
                gm.c3(new dt5((a66) obj2, tLObject, (String) obj, (byte) 9));
                return;
            case 17:
                gm.c3(new dt5((x56) obj2, tLObject, (TLRPC.User) obj, (byte) 10));
                return;
            case 18:
                gm.c3(new d65((x56) obj2, tLObject, (HashSet) obj, tL_error, (byte) 13));
                return;
            case 19:
                mh6 mh6Var = (mh6) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    gm.c3(new dt5(mh6Var, bundle, tLObject, (byte) 19));
                    return;
                } else {
                    gm.c3(new de6(mh6Var, (byte) 2));
                    return;
                }
            case 20:
                gm.c3(new d65((sf6) obj2, tLObject, (String) obj, tL_error, (byte) 17));
                return;
            case 21:
                gm.c3(new dt5((rg6) obj2, tL_error, (TL_account.confirmPhone) obj, (byte) 23));
                return;
            case 22:
                gm.c3(new dt5((lh6) obj2, tLObject, (HashMap) obj, (byte) 28));
                return;
            case 23:
                gm.c3(new d65((lh6) obj2, tL_error, tLObject, (String) obj, (byte) 21));
                return;
            case 24:
                hs6 hs6Var = (hs6) obj2;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ad4.r(tL_error.text)) {
                    hs6Var.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 25:
                gm.c3(new fp6((hs6) obj2, tLObject, (TLRPC.Document) obj, (byte) 2));
                return;
            case 26:
                hs6 hs6Var2 = (hs6) obj2;
                v15 v15Var = (v15) obj;
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    hs6Var2.w1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    hs6Var2.w1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (v15Var != null) {
                    gm.c3(v15Var);
                    return;
                }
                return;
            case 27:
                gm.c3(new fp6((k17) obj2, (String) obj, tLObject, (byte) 12));
                return;
            case 28:
                gm.c3(new fp6((Object) ((oc7) obj2), tLObject, (ArrayList) obj, (byte) 18));
                return;
            default:
                oc7 oc7Var = (oc7) obj2;
                ko2 ko2Var = (ko2) obj;
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    if (ko2Var != null) {
                        gm.c3(ko2Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
