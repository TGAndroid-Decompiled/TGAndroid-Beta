package ai;

import android.content.Context;
import android.view.View;
import di.m7;
import java.util.ArrayList;
import org.telegram.messenger.i5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.o6;
public final class e0 implements View.OnClickListener {
    public final int f1161a = 0;
    public final boolean f1162b;
    public final int f1163c;
    public final Object d;
    public final Object f1164e;
    public final Object f1165f;
    public final Object h;
    public final Object f1166n;

    public e0(p0 p0Var, t tVar, String str, String[] strArr, int i7, boolean z10, bi.b1 b1Var) {
        this.d = p0Var;
        this.f1164e = tVar;
        this.f1165f = str;
        this.h = strArr;
        this.f1163c = i7;
        this.f1162b = z10;
        this.f1166n = b1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f1161a) {
            case 0:
                p0 p0Var = (p0) this.d;
                String str = (String) this.f1165f;
                String[] strArr = (String[]) this.h;
                bi.b1 b1Var = (bi.b1) this.f1166n;
                p0Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String d02 = DictationAsr.d0((t) this.f1164e, str);
                for (String str2 : strArr) {
                    Context context = p0Var.h;
                    String N = p0.N(str2);
                    if (this.f1162b && str2.equals(d02)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new m0(context, N, null, this.f1163c, z10));
                    arrayList2.add(new aa.r((Object) p0Var, (Object) str, (Object) str2, 3));
                }
                b1Var.g(arrayList, arrayList2);
                return;
            default:
                hi.e eVar = (hi.e) this.d;
                o6 o6Var = (o6) this.f1164e;
                Runnable runnable = (Runnable) this.f1165f;
                Context context2 = (Context) this.h;
                h6 h6Var = (h6) this.f1166n;
                eVar.setLoading(true);
                boolean z11 = this.f1162b;
                int i7 = this.f1163c;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i7).sendRequest(setprivacy, new bi.q1(eVar, o6Var, runnable, 19));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i7).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i7).sendRequest(setglobalprivacysettings, new m7(context2, h6Var, eVar, o6Var, runnable, 6));
                return;
        }
    }

    public e0(hi.e eVar, boolean z10, int i7, o6 o6Var, Runnable runnable, Context context, h6 h6Var) {
        this.d = eVar;
        this.f1162b = z10;
        this.f1163c = i7;
        this.f1164e = o6Var;
        this.f1165f = runnable;
        this.h = context;
        this.f1166n = h6Var;
    }
}
