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
import org.telegram.ui.Components.h01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hy0;
import org.telegram.ui.p40;
import org.telegram.ui.xs0;
public final class gx implements RequestDelegate {
    public final int f24318a;
    public final int f24319b;
    public final Object f24320c;
    public final Object d;
    public final Object f24321e;
    public final Object f24322f;
    public final Object f24323g;

    public gx(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f24318a = i10;
        this.d = obj;
        this.f24321e = tLObject;
        this.f24322f = obj2;
        this.f24323g = obj3;
        this.f24319b = i7;
        this.f24320c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f24318a;
        int i10 = this.f24319b;
        Object obj = this.f24320c;
        Object obj2 = this.f24323g;
        Object obj3 = this.f24322f;
        Object obj4 = this.f24321e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.g3(new bi.d5((zy) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (ly) obj2, this.f24319b, (String) obj, 3));
                return;
            case 1:
                g0.g3(new bi.d5((org.telegram.ui.g4) obj5, this.f24319b, (vf.b) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                g0.g3(new bi.d5(tLObject, (org.telegram.ui.ActionBar.u1) obj5, (Context) obj4, this.f24319b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.i6) obj2, (p40) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(i10).V3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    zy.T(c.a(j10.f24773t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, gd.M0(2131752591, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.C1;
                g0.g3(new bi.d5((LaunchActivity) obj5, tLObject, this.f24319b, (org.telegram.ui.cx) obj4, (org.telegram.ui.ActionBar.h2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                g0.g3(new ce(tLObject, (org.telegram.ui.ActionBar.h2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (xs0) obj3, (com.google.android.gms.internal.clearcut.y0) obj2, this.f24319b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj, 3));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                org.telegram.ui.Components.dw dwVar = (org.telegram.ui.Components.dw) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new bi.h2(tLObject, (Object) context2, (Object) i6Var, (Object) bArr, (Object) h2Var, (Object) dwVar, 19));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new hy0(h2Var, context2, i6Var, dwVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new h01(h2Var, i10, dwVar, 14), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new hy0(h2Var, context2, i6Var, dwVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public gx(int i7, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f24318a = 3;
        this.f24319b = i7;
        this.d = zArr;
        this.f24321e = file;
        this.f24322f = setcallrating;
        this.f24323g = arrayList;
        this.f24320c = context;
    }

    public gx(Context context, org.telegram.ui.ActionBar.i6 i6Var, byte[] bArr, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.Components.dw dwVar, int i7) {
        this.f24318a = 6;
        this.d = context;
        this.f24321e = i6Var;
        this.f24322f = bArr;
        this.f24323g = h2Var;
        this.f24320c = dwVar;
        this.f24319b = i7;
    }

    public gx(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.i6 i6Var, p40 p40Var) {
        this.f24318a = 2;
        this.d = u1Var;
        this.f24321e = context;
        this.f24319b = i7;
        this.f24322f = exportgroupcallinvite;
        this.f24323g = i6Var;
        this.f24320c = p40Var;
    }

    public gx(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f24318a = 1;
        this.d = g4Var;
        this.f24319b = i7;
        this.f24321e = bVar;
        this.f24320c = str;
        this.f24322f = f0Var;
        this.f24323g = tL_messages_getWebPage;
    }

    public gx(LaunchActivity launchActivity, int i7, org.telegram.ui.cx cxVar, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, String str) {
        this.f24318a = 4;
        this.d = launchActivity;
        this.f24319b = i7;
        this.f24321e = cxVar;
        this.f24322f = h2Var;
        this.f24323g = user;
        this.f24320c = str;
    }
}
