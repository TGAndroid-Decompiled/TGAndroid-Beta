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
import org.telegram.ui.Components.r80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.iy0;
import org.telegram.ui.p40;
import org.telegram.ui.zs0;
public final class nx implements RequestDelegate {
    public final int f24247a;
    public final int f24248b;
    public final Object f24249c;
    public final Object d;
    public final Object f24250e;
    public final Object f24251f;
    public final Object f24252g;

    public nx(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f24247a = i10;
        this.d = obj;
        this.f24250e = tLObject;
        this.f24251f = obj2;
        this.f24252g = obj3;
        this.f24248b = i7;
        this.f24249c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f24247a;
        int i10 = this.f24248b;
        Object obj = this.f24249c;
        Object obj2 = this.f24252g;
        Object obj3 = this.f24251f;
        Object obj4 = this.f24250e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.h3(new jg.c1((gz) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (sy) obj2, this.f24248b, (String) obj));
                return;
            case 1:
                g0.h3(new jg.c1((org.telegram.ui.g4) obj5, this.f24248b, (vf.b) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                g0.h3(new jg.c1(tLObject, (org.telegram.ui.ActionBar.u1) obj5, (Context) obj4, this.f24248b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.h6) obj2, (p40) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    qp.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    gz.T(c.a(p10.f24474s0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, id.M0(2131752602, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.B1;
                g0.h3(new jg.c1((LaunchActivity) obj5, tLObject, this.f24248b, (org.telegram.ui.zw) obj4, (org.telegram.ui.ActionBar.f2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                g0.h3(new ee(tLObject, (org.telegram.ui.ActionBar.f2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (zs0) obj3, (com.google.android.gms.internal.clearcut.z0) obj2, this.f24248b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                r80 r80Var = (r80) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.h3(new bi.a3(tLObject, (Object) context2, (Object) h6Var, (Object) bArr, (Object) f2Var, (Object) r80Var, 17));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.i3(new iy0(f2Var, context2, h6Var, r80Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.i3(new org.telegram.ui.h10(f2Var, i10, r80Var, 10), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.i3(new iy0(f2Var, context2, h6Var, r80Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public nx(int i7, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f24247a = 3;
        this.f24248b = i7;
        this.d = zArr;
        this.f24250e = file;
        this.f24251f = setcallrating;
        this.f24252g = arrayList;
        this.f24249c = context;
    }

    public nx(Context context, org.telegram.ui.ActionBar.h6 h6Var, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, r80 r80Var, int i7) {
        this.f24247a = 6;
        this.d = context;
        this.f24250e = h6Var;
        this.f24251f = bArr;
        this.f24252g = f2Var;
        this.f24249c = r80Var;
        this.f24248b = i7;
    }

    public nx(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.h6 h6Var, p40 p40Var) {
        this.f24247a = 2;
        this.d = u1Var;
        this.f24250e = context;
        this.f24248b = i7;
        this.f24251f = exportgroupcallinvite;
        this.f24252g = h6Var;
        this.f24249c = p40Var;
    }

    public nx(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f24247a = 1;
        this.d = g4Var;
        this.f24248b = i7;
        this.f24250e = bVar;
        this.f24249c = str;
        this.f24251f = f0Var;
        this.f24252g = tL_messages_getWebPage;
    }

    public nx(LaunchActivity launchActivity, int i7, org.telegram.ui.zw zwVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        this.f24247a = 4;
        this.d = launchActivity;
        this.f24248b = i7;
        this.f24250e = zwVar;
        this.f24251f = f2Var;
        this.f24252g = user;
        this.f24249c = str;
    }
}
