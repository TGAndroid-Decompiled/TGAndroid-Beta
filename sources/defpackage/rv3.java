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
public final class rv3 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public rv3(Object obj, Object obj2, byte b) {
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
                gl.d3(new mg3((sv3) obj2, (String) obj, tLObject, (byte) 16));
                return;
            case 1:
                gl.d3(new eu3((kc4) obj2, (hd) obj, (byte) 28));
                return;
            case 2:
                gl.d3(new vc4((pd4) obj2, (hd) obj, (byte) 2));
                return;
            case 3:
                gl.d3(new mg3((jd4) obj2, tL_error, (hd4) obj, (byte) 28));
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                gl.d3(new vc4(filtersSetupActivity, (TLRPC.TL_messages_toggleDialogFilterTags) obj, (byte) 6));
                return;
            case 5:
                gl.d3(new vc4((ll4) obj2, (Pair) obj, (byte) 12));
                return;
            case 6:
                gl.d3(new hn1((ll4) obj2, tL_error, tLObject, (p8c) obj, (byte) 20));
                return;
            case 7:
                gl.d3(new jf4((rr4) obj2, tLObject, (na7) obj, (byte) 5));
                return;
            case 8:
                gl.d3(new jf4((xu4) obj2, (String) obj, tLObject, (byte) 6));
                return;
            case 9:
                gl.d3(new e45((t65) obj2, tL_error, tLObject, (String) obj, (byte) 3));
                return;
            case 10:
                ib5 ib5Var = (ib5) obj2;
                if (Objects.equals(ib5Var.a.e, (String) obj)) {
                    gl.d3(new hb5(ib5Var, tLObject, (byte) 0));
                    return;
                }
                return;
            case 11:
                gl.d3(new e45((rb5) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, (byte) 6));
                return;
            case 12:
                wp5 wp5Var = (wp5) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            gl.d3(new jf4(wp5Var, (TLRPC.TL_langPackString) langPackString, str, (byte) 23));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                String str2 = LaunchActivity.C1;
                gl.d3(new sx5((byte) 4, (LaunchActivity) obj2, (akb) obj, tLObject));
                return;
            case 14:
                String str3 = LaunchActivity.C1;
                gl.d3(new e45((hd) obj2, tLObject, (u8) obj, tL_error, (byte) 10));
                return;
            case 15:
                gl.d3(new e45((f36) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, (byte) 11));
                return;
            case 16:
                gl.d3(new sx5((byte) 7, (a46) obj2, (String) obj, tLObject));
                return;
            case 17:
                gl.d3(new sx5((byte) 8, (x36) obj2, (TLRPC.User) obj, tLObject));
                return;
            case 18:
                gl.d3(new e45((x36) obj2, tLObject, (HashSet) obj, tL_error, (byte) 13));
                return;
            case 19:
                mf6 mf6Var = (mf6) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    gl.d3(new sx5(mf6Var, bundle, tLObject, (byte) 17));
                    return;
                } else {
                    gl.d3(new ec6(mf6Var, (byte) 2));
                    return;
                }
            case 20:
                gl.d3(new e45((td6) obj2, tLObject, (String) obj, tL_error, (byte) 17));
                return;
            case 21:
                gl.d3(new sx5((qe6) obj2, tL_error, (TL_account.confirmPhone) obj, (byte) 21));
                return;
            case 22:
                gl.d3(new sx5((byte) 26, (lf6) obj2, (HashMap) obj, tLObject));
                return;
            case 23:
                gl.d3(new e45((lf6) obj2, tL_error, tLObject, (String) obj, (byte) 21));
                return;
            case 24:
                hq6 hq6Var = (hq6) obj2;
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
                if (tL_error != null && ab4.r(tL_error.text)) {
                    hq6Var.getFileRefController().u(new Object[]{tL_messages_saveGif}, "gif");
                    return;
                }
                return;
            case 25:
                gl.d3(new lo6((hq6) obj2, tLObject, (TLRPC.Document) obj, (byte) 0));
                return;
            case 26:
                hq6 hq6Var2 = (hq6) obj2;
                vz4 vz4Var = (vz4) obj;
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
                    hq6Var2.w1(null, 0L, currentTimeMillis, false);
                } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
                    TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
                    hq6Var2.w1(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
                }
                if (vz4Var != null) {
                    gl.d3(vz4Var);
                    return;
                }
                return;
            case 27:
                gl.d3(new lo6((byte) 10, (kz6) obj2, (String) obj, tLObject));
                return;
            case 28:
                gl.d3(new lo6((na7) obj2, tLObject, (ArrayList) obj, (byte) 15));
                return;
            default:
                na7 na7Var = (na7) obj2;
                zm2 zm2Var = (zm2) obj;
                if (tL_error == null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    if (zm2Var != null) {
                        gl.d3(zm2Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
