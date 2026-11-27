package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class le implements pcc {
    public final byte a = 0;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Serializable h;

    public le(int i, long j, vnb vnbVar, pcc pccVar, Activity activity, ArrayList arrayList, HashMap hashMap) {
        this.c = i;
        this.d = arrayList;
        this.b = j;
        this.e = activity;
        this.f = vnbVar;
        this.g = pccVar;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        Serializable serializable = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                vnb vnbVar = (vnb) obj3;
                pcc pccVar = (pcc) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = this.c;
                if (booleanValue) {
                    SharedPreferences.Editor edit = uc7.s1(i).X3.edit();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = arrayList.get(i2);
                        i2++;
                        Long l = (Long) obj6;
                        long longValue = l.longValue();
                        long M1 = uc7.s1(i).M1(longValue);
                        if (M1 <= 0 && longValue > 0) {
                            M1 = wf3.j(uc7.s1(i).P2(longValue));
                        }
                        edit.putLong(ik8.n(longValue, "ask_paid_message_", "_price"), M1);
                        jxa.v(i, false).O.put(l, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                qe qeVar = new qe(i, this.b, vnbVar, pccVar, activity, arrayList, hashMap);
                if (!jxa.v(i, false).e) {
                    jxa v = jxa.v(i, false);
                    v.e = false;
                    v.n(qeVar, false, true);
                    v.e = true;
                    return;
                }
                qeVar.run();
                return;
            case 1:
                bg2 bg2Var = (bg2) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z = true;
                }
                long j = bg2Var.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = bg2Var.E;
                long j2 = this.b;
                jf2 jf2Var = new jf2(bg2Var, j2, j, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j2);
                jf2Var.Y0 = new kf2(bg2Var, intValue, j2, this.c, z, zArr);
                bg2Var.presentFragment(jf2Var);
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i3 = this.c;
                tL_messages_toggleBotInAttachMenu.bot = uc7.s1(i3).o1(this.b);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new rt((LaunchActivity) obj5, i3, (uj3) obj4, (e) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public le(bg2 bg2Var, long j, int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.d = bg2Var;
        this.b = j;
        this.c = i;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }

    public le(LaunchActivity launchActivity, int i, long j, uj3 uj3Var, e eVar, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.c = i;
        this.b = j;
        this.e = uj3Var;
        this.f = eVar;
        this.g = user;
        this.h = str;
    }
}
