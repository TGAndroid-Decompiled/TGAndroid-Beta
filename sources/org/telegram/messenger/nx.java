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
import org.telegram.ui.Components.w80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hy0;
import org.telegram.ui.o40;
import org.telegram.ui.ys0;
public final class nx implements RequestDelegate {
    public final int f24243a;
    public final int f24244b;
    public final Object f24245c;
    public final Object d;
    public final Object f24246e;
    public final Object f24247f;
    public final Object f24248g;

    public nx(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f24243a = i10;
        this.d = obj;
        this.f24246e = tLObject;
        this.f24247f = obj2;
        this.f24248g = obj3;
        this.f24244b = i7;
        this.f24245c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f24243a;
        int i10 = this.f24244b;
        Object obj = this.f24245c;
        Object obj2 = this.f24248g;
        Object obj3 = this.f24247f;
        Object obj4 = this.f24246e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.h3(new jg.c1((gz) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (sy) obj2, this.f24244b, (String) obj));
                return;
            case 1:
                g0.h3(new jg.c1((org.telegram.ui.g4) obj5, this.f24244b, (vf.b) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                g0.h3(new jg.c1(tLObject, (org.telegram.ui.ActionBar.u1) obj5, (Context) obj4, this.f24244b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.g6) obj2, (o40) obj));
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
                    gz.T(c.a(p10.f24470s0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, id.M0(2131752602, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.B1;
                g0.h3(new jg.c1((LaunchActivity) obj5, tLObject, this.f24244b, (org.telegram.ui.yw) obj4, (org.telegram.ui.ActionBar.f2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                g0.h3(new ee(tLObject, (org.telegram.ui.ActionBar.f2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ys0) obj3, (com.google.android.gms.internal.clearcut.z0) obj2, this.f24244b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                w80 w80Var = (w80) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.h3(new bi.a3(tLObject, (Object) context2, (Object) g6Var, (Object) bArr, (Object) f2Var, (Object) w80Var, 17));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.i3(new hy0(f2Var, context2, g6Var, w80Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.i3(new org.telegram.ui.f10(f2Var, i10, w80Var, 10), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.i3(new hy0(f2Var, context2, g6Var, w80Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public nx(int i7, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f24243a = 3;
        this.f24244b = i7;
        this.d = zArr;
        this.f24246e = file;
        this.f24247f = setcallrating;
        this.f24248g = arrayList;
        this.f24245c = context;
    }

    public nx(Context context, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, w80 w80Var, int i7) {
        this.f24243a = 6;
        this.d = context;
        this.f24246e = g6Var;
        this.f24247f = bArr;
        this.f24248g = f2Var;
        this.f24245c = w80Var;
        this.f24244b = i7;
    }

    public nx(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.g6 g6Var, o40 o40Var) {
        this.f24243a = 2;
        this.d = u1Var;
        this.f24246e = context;
        this.f24244b = i7;
        this.f24247f = exportgroupcallinvite;
        this.f24248g = g6Var;
        this.f24245c = o40Var;
    }

    public nx(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f24243a = 1;
        this.d = g4Var;
        this.f24244b = i7;
        this.f24246e = bVar;
        this.f24245c = str;
        this.f24247f = f0Var;
        this.f24248g = tL_messages_getWebPage;
    }

    public nx(LaunchActivity launchActivity, int i7, org.telegram.ui.yw ywVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        this.f24243a = 4;
        this.d = launchActivity;
        this.f24244b = i7;
        this.f24246e = ywVar;
        this.f24247f = f2Var;
        this.f24248g = user;
        this.f24245c = str;
    }
}
