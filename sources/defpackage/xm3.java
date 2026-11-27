package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Dictation.DictationAsr;
public final class xm3 implements View.OnClickListener {
    public final byte a = 0;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public xm3(c51 c51Var, boolean z, int i, q61 q61Var, Runnable runnable, Context context, vnb vnbVar) {
        this.d = c51Var;
        this.b = z;
        this.c = i;
        this.e = q61Var;
        this.f = runnable;
        this.h = context;
        this.n = vnbVar;
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
                bn3 bn3Var = (bn3) obj5;
                String str = (String) obj3;
                String[] strArr = (String[]) obj2;
                zv4 zv4Var = (zv4) obj;
                bn3Var.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String i0 = DictationAsr.i0((nm3) obj4, str);
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    Context context = bn3Var.h;
                    String R = bn3.R(str2);
                    if (z3 && str2.equals(i0)) {
                        z = true;
                    } else {
                        z = z2;
                    }
                    arrayList.add(new l7(context, R, null, this.c, z));
                    arrayList2.add(new cv2(bn3Var, str, str2, (byte) 11));
                    i++;
                    z2 = false;
                }
                zv4Var.h(arrayList, arrayList2);
                return;
            default:
                c51 c51Var = (c51) obj5;
                q61 q61Var = (q61) obj4;
                Runnable runnable = (Runnable) obj3;
                Context context2 = (Context) obj2;
                vnb vnbVar = (vnb) obj;
                c51Var.setLoading(true);
                int i2 = this.c;
                if (z3) {
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                    ConnectionsManager.getInstance(i2).sendRequest(setprivacy, new m65(c51Var, q61Var, runnable, (byte) 13));
                    return;
                }
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(i2).Y;
                setglobalprivacysettings.settings = globalPrivacySettings;
                if (globalPrivacySettings == null) {
                    globalPrivacySettings = new TLRPC.TL_globalPrivacySettings();
                    setglobalprivacysettings.settings = globalPrivacySettings;
                }
                globalPrivacySettings.hide_read_marks = false;
                ConnectionsManager.getInstance(i2).sendRequest(setglobalprivacysettings, new in0(context2, vnbVar, c51Var, q61Var, runnable, (byte) 9));
                return;
        }
    }

    public xm3(bn3 bn3Var, nm3 nm3Var, String str, String[] strArr, int i, boolean z, zv4 zv4Var) {
        this.d = bn3Var;
        this.e = nm3Var;
        this.f = str;
        this.h = strArr;
        this.c = i;
        this.b = z;
        this.n = zv4Var;
    }
}
