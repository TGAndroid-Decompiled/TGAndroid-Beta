package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationAsr;
public final class pn3 implements View.OnClickListener {
    public final byte a = 1;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public pn3(b61 b61Var, boolean z, int i, p71 p71Var, Runnable runnable, Context context, ylb ylbVar) {
        this.d = b61Var;
        this.b = z;
        this.c = i;
        this.e = p71Var;
        this.f = runnable;
        this.h = context;
        this.n = ylbVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z3 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                un3 un3Var = (un3) obj5;
                String str = (String) obj3;
                String[] strArr = (String[]) obj2;
                xv4 xv4Var = (xv4) obj;
                un3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String g0 = DictationAsr.g0((gn3) obj4, str);
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    Context context = un3Var.h;
                    String N = un3.N(str2);
                    if (z3 && str2.equals(g0)) {
                        z = true;
                    } else {
                        z = z2;
                    }
                    arrayList.add(new k7(context, N, null, this.c, z));
                    arrayList2.add(new pz2(un3Var, str, str2, (byte) 9));
                    i++;
                    z2 = false;
                }
                xv4Var.g(arrayList, arrayList2);
                return;
            default:
                b61 b61Var = (b61) obj5;
                p71 p71Var = (p71) obj4;
                Runnable runnable = (Runnable) obj3;
                Context context2 = (Context) obj2;
                ylb ylbVar = (ylb) obj;
                b61Var.setLoading(true);
                int i2 = this.c;
                if (z3) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i2).sendRequest(setprivacy, new i65(b61Var, p71Var, runnable, (byte) 13));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = bw2.r(i2).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    globalPrivacySettings = new TLRPC.TL_globalPrivacySettings();
                    setglobalprivacysettings.settings = globalPrivacySettings;
                }
                globalPrivacySettings.hide_read_marks = false;
                ConnectionsManager.getInstance(i2).sendRequest(setglobalprivacysettings, new fo0(context2, ylbVar, b61Var, p71Var, runnable, (byte) 9));
                return;
        }
    }

    public pn3(un3 un3Var, gn3 gn3Var, String str, String[] strArr, int i, boolean z, xv4 xv4Var) {
        this.d = un3Var;
        this.e = gn3Var;
        this.f = str;
        this.h = strArr;
        this.c = i;
        this.b = z;
        this.n = xv4Var;
    }
}
