package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class fi implements qac {
    public final byte a = 0;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Serializable h;

    public fi(int i, long j, ylb ylbVar, qac qacVar, Activity activity, ArrayList arrayList, HashMap hashMap) {
        this.c = i;
        this.d = arrayList;
        this.b = j;
        this.e = activity;
        this.f = ylbVar;
        this.g = qacVar;
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
                ylb ylbVar = (ylb) obj3;
                qac qacVar = (qac) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = this.c;
                if (booleanValue) {
                    SharedPreferences.Editor edit = oc7.r1(i).X3.edit();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = arrayList.get(i2);
                        i2++;
                        Long l = (Long) obj6;
                        long longValue = l.longValue();
                        long L1 = oc7.r1(i).L1(longValue);
                        if (L1 <= 0 && longValue > 0) {
                            L1 = pg3.j(oc7.r1(i).L2(longValue));
                        }
                        edit.putLong(wi8.n(longValue, "ask_paid_message_", "_price"), L1);
                        jva.v(i, false).O.put(l, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                pf pfVar = new pf(i, this.b, ylbVar, qacVar, activity, arrayList, hashMap);
                if (!jva.v(i, false).e) {
                    jva v = jva.v(i, false);
                    v.e = false;
                    v.n(pfVar, false, true);
                    v.e = true;
                    return;
                }
                pfVar.run();
                return;
            case 1:
                wg2 wg2Var = (wg2) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z = true;
                }
                long j = wg2Var.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = wg2Var.E;
                long j2 = this.b;
                eg2 eg2Var = new eg2(wg2Var, j2, j, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j2);
                eg2Var.Y0 = new fg2(wg2Var, intValue, j2, this.c, z, zArr);
                wg2Var.presentFragment(eg2Var);
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i3 = this.c;
                tL_messages_toggleBotInAttachMenu.bot = oc7.r1(i3).n1(this.b);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new ou((LaunchActivity) obj5, i3, (nk3) obj4, (d) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public fi(wg2 wg2Var, long j, int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.d = wg2Var;
        this.b = j;
        this.c = i;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }

    public fi(LaunchActivity launchActivity, int i, long j, nk3 nk3Var, d dVar, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.c = i;
        this.b = j;
        this.e = nk3Var;
        this.f = dVar;
        this.g = user;
        this.h = str;
    }
}
