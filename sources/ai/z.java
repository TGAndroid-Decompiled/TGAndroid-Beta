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
public final class z implements View.OnClickListener {
    public final int f1599a = 0;
    public final boolean f1600b;
    public final int f1601c;
    public final Object d;
    public final Object f1602e;
    public final Object f1603f;
    public final Object h;
    public final Object f1604n;

    public z(k0 k0Var, p pVar, String str, String[] strArr, int i7, boolean z10, bi.b1 b1Var) {
        this.d = k0Var;
        this.f1602e = pVar;
        this.f1603f = str;
        this.h = strArr;
        this.f1601c = i7;
        this.f1600b = z10;
        this.f1604n = b1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f1599a) {
            case 0:
                k0 k0Var = (k0) this.d;
                String str = (String) this.f1603f;
                String[] strArr = (String[]) this.h;
                bi.b1 b1Var = (bi.b1) this.f1604n;
                k0Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String c02 = DictationAsr.c0((p) this.f1602e, str);
                for (String str2 : strArr) {
                    Context context = k0Var.h;
                    String N = k0.N(str2);
                    if (this.f1600b && str2.equals(c02)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new h0(context, N, null, this.f1601c, z10));
                    arrayList2.add(new aa.r((Object) k0Var, (Object) str, (Object) str2, 3));
                }
                b1Var.g(arrayList, arrayList2);
                return;
            default:
                hi.d dVar = (hi.d) this.d;
                o6 o6Var = (o6) this.f1602e;
                Runnable runnable = (Runnable) this.f1603f;
                Context context2 = (Context) this.h;
                h6 h6Var = (h6) this.f1604n;
                dVar.setLoading(true);
                boolean z11 = this.f1600b;
                int i7 = this.f1601c;
                if (z11) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i7).sendRequest(setprivacy, new bi.q1(dVar, o6Var, runnable, 19));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = i5.r(i7).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.hide_read_marks = false;
                ConnectionsManager.getInstance(i7).sendRequest(setglobalprivacysettings, new m7(context2, h6Var, dVar, o6Var, runnable, 6));
                return;
        }
    }

    public z(hi.d dVar, boolean z10, int i7, o6 o6Var, Runnable runnable, Context context, h6 h6Var) {
        this.d = dVar;
        this.f1600b = z10;
        this.f1601c = i7;
        this.f1602e = o6Var;
        this.f1603f = runnable;
        this.h = context;
        this.f1604n = h6Var;
    }
}
