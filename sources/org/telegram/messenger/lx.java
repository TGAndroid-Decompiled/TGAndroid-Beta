package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.u11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy0;
import org.telegram.ui.m40;
import org.telegram.ui.ts0;
public final class lx implements RequestDelegate {
    public final int f24910a;
    public final int f24911b;
    public final Object f24912c;
    public final Object d;
    public final Object f24913e;
    public final Object f24914f;
    public final Object f24915g;

    public lx(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f24910a = i10;
        this.d = obj;
        this.f24913e = tLObject;
        this.f24914f = obj2;
        this.f24915g = obj3;
        this.f24911b = i7;
        this.f24912c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f24910a;
        int i10 = this.f24911b;
        Object obj = this.f24912c;
        Object obj2 = this.f24915g;
        Object obj3 = this.f24914f;
        Object obj4 = this.f24913e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.h3(new bi.u2((ez) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (qy) obj2, this.f24911b, (String) obj, 3));
                return;
            case 1:
                g0.h3(new bi.u2((org.telegram.ui.g4) obj5, this.f24911b, (vf.b) obj4, tLObject, (String) obj, (org.telegram.ui.e0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                g0.h3(new bi.u2(tLObject, (org.telegram.ui.ActionBar.t1) obj5, (Context) obj4, this.f24911b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.e6) obj2, (m40) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    np.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    ez.T(c.a(m10.f24940t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, hd.M0(2131752602, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.C1;
                g0.h3(new bi.u2((LaunchActivity) obj5, tLObject, this.f24911b, (org.telegram.ui.yw) obj4, (org.telegram.ui.ActionBar.e2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                g0.h3(new de(tLObject, (org.telegram.ui.ActionBar.e2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ts0) obj3, (com.google.android.gms.internal.clearcut.y0) obj2, this.f24911b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj, 3));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                hh0 hh0Var = (hh0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.h3(new bi.p1(tLObject, (Object) context2, (Object) e6Var, (Object) bArr, (Object) e2Var, (Object) hh0Var, 19));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.i3(new cy0(e2Var, context2, e6Var, hh0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.i3(new u11(e2Var, i10, hh0Var, 13), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.i3(new cy0(e2Var, context2, e6Var, hh0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public lx(int i7, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f24910a = 3;
        this.f24911b = i7;
        this.d = zArr;
        this.f24913e = file;
        this.f24914f = setcallrating;
        this.f24915g = arrayList;
        this.f24912c = context;
    }

    public lx(Context context, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, org.telegram.ui.ActionBar.e2 e2Var, hh0 hh0Var, int i7) {
        this.f24910a = 6;
        this.d = context;
        this.f24913e = e6Var;
        this.f24914f = bArr;
        this.f24915g = e2Var;
        this.f24912c = hh0Var;
        this.f24911b = i7;
    }

    public lx(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, m40 m40Var) {
        this.f24910a = 2;
        this.d = t1Var;
        this.f24913e = context;
        this.f24911b = i7;
        this.f24914f = exportgroupcallinvite;
        this.f24915g = e6Var;
        this.f24912c = m40Var;
    }

    public lx(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f24910a = 1;
        this.d = g4Var;
        this.f24911b = i7;
        this.f24913e = bVar;
        this.f24912c = str;
        this.f24914f = e0Var;
        this.f24915g = tL_messages_getWebPage;
    }

    public lx(LaunchActivity launchActivity, int i7, org.telegram.ui.yw ywVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, String str) {
        this.f24910a = 4;
        this.d = launchActivity;
        this.f24911b = i7;
        this.f24913e = ywVar;
        this.f24914f = e2Var;
        this.f24915g = user;
        this.f24912c = str;
    }
}
