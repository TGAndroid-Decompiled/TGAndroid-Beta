package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationAsr;
public final class em3 implements View.OnClickListener {
    public final byte a = 0;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public em3(u41 u41Var, boolean z, int i, i61 i61Var, Runnable runnable, Context context, wjb wjbVar) {
        this.d = u41Var;
        this.b = z;
        this.c = i;
        this.e = i61Var;
        this.f = runnable;
        this.h = context;
        this.n = wjbVar;
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
                jm3 jm3Var = (jm3) obj5;
                String str = (String) obj3;
                String[] strArr = (String[]) obj2;
                vt4 vt4Var = (vt4) obj;
                jm3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String g0 = DictationAsr.g0((vl3) obj4, str);
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    Context context = jm3Var.h;
                    String N = jm3.N(str2);
                    if (z3 && str2.equals(g0)) {
                        z = true;
                    } else {
                        z = z2;
                    }
                    arrayList.add(new k7(context, N, null, this.c, z));
                    arrayList2.add(new mg3(jm3Var, str, str2, (byte) 7));
                    i++;
                    z2 = false;
                }
                vt4Var.g(arrayList, arrayList2);
                return;
            default:
                u41 u41Var = (u41) obj5;
                i61 i61Var = (i61) obj4;
                Runnable runnable = (Runnable) obj3;
                Context context2 = (Context) obj2;
                wjb wjbVar = (wjb) obj;
                u41Var.setLoading(true);
                int i2 = this.c;
                if (z3) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i2).sendRequest(setprivacy, new k45(u41Var, i61Var, runnable, (byte) 13));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(i2).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    globalPrivacySettings = new TLRPC.TL_globalPrivacySettings();
                    setglobalprivacysettings.settings = globalPrivacySettings;
                }
                globalPrivacySettings.hide_read_marks = false;
                ConnectionsManager.getInstance(i2).sendRequest(setglobalprivacysettings, new fn0(context2, wjbVar, u41Var, i61Var, runnable, (byte) 9));
                return;
        }
    }

    public em3(jm3 jm3Var, vl3 vl3Var, String str, String[] strArr, int i, boolean z, vt4 vt4Var) {
        this.d = jm3Var;
        this.e = vl3Var;
        this.f = str;
        this.h = strArr;
        this.c = i;
        this.b = z;
        this.n = vt4Var;
    }
}
