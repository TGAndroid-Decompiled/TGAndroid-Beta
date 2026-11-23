package ai;

import android.content.Context;
import android.view.View;
import di.m7;
import java.util.ArrayList;
import org.telegram.messenger.i5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.p6;
public final class a0 implements View.OnClickListener {
    public final int f1115a = 0;
    public final boolean f1116b;
    public final int f1117c;
    public final Object d;
    public final Object f1118e;
    public final Object f1119f;
    public final Object h;
    public final Object f1120n;

    public a0(l0 l0Var, q qVar, String str, String[] strArr, int i7, boolean z10, bi.b1 b1Var) {
        this.d = l0Var;
        this.f1118e = qVar;
        this.f1119f = str;
        this.h = strArr;
        this.f1117c = i7;
        this.f1116b = z10;
        this.f1120n = b1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f1115a) {
            case 0:
                l0 l0Var = (l0) this.d;
                String str = (String) this.f1119f;
                String[] strArr = (String[]) this.h;
                bi.b1 b1Var = (bi.b1) this.f1120n;
                l0Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String g02 = DictationAsr.g0((q) this.f1118e, str);
                for (String str2 : strArr) {
                    Context context = l0Var.h;
                    String L = l0.L(str2);
                    if (this.f1116b && str2.equals(g02)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new i0(context, L, null, this.f1117c, z10));
                    arrayList2.add(new aa.r((Object) l0Var, (Object) str, (Object) str2, 3));
                }
                b1Var.g(arrayList, arrayList2);
                return;
            default:
                hi.e eVar = (hi.e) this.d;
                p6 p6Var = (p6) this.f1118e;
                Runnable runnable = (Runnable) this.f1119f;
                Context context2 = (Context) this.h;
                i6 i6Var = (i6) this.f1120n;
                eVar.setLoading(true);
                boolean z11 = this.f1116b;
                int i7 = this.f1117c;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i7).sendRequest(setprivacy, new bi.q1(eVar, p6Var, runnable, 19));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i7).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i7).sendRequest(setglobalprivacysettings, new m7(context2, i6Var, eVar, p6Var, runnable, 6));
                return;
        }
    }

    public a0(hi.e eVar, boolean z10, int i7, p6 p6Var, Runnable runnable, Context context, i6 i6Var) {
        this.d = eVar;
        this.f1116b = z10;
        this.f1117c = i7;
        this.f1118e = p6Var;
        this.f1119f = runnable;
        this.h = context;
        this.f1120n = i6Var;
    }
}
