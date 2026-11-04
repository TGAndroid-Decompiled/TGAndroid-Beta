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
import org.telegram.ui.Components.j50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h40;
import org.telegram.ui.ms0;
import org.telegram.ui.vx0;
public final class gx implements RequestDelegate {
    public final int f22790a;
    public final int f22791b;
    public final Object f22792c;
    public final Object d;
    public final Object f22793e;
    public final Object f22794f;
    public final Object f22795g;

    public gx(int i3, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f22790a = i10;
        this.d = obj;
        this.f22793e = tLObject;
        this.f22794f = obj2;
        this.f22795g = obj3;
        this.f22791b = i3;
        this.f22792c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f22790a;
        int i10 = this.f22791b;
        Object obj = this.f22792c;
        Object obj2 = this.f22795g;
        Object obj3 = this.f22794f;
        Object obj4 = this.f22793e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                g0.h3(new ai.d3((yy) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (ky) obj2, this.f22791b, (String) obj, 3));
                return;
            case 1:
                g0.h3(new ai.d3((org.telegram.ui.i4) obj5, this.f22791b, (sf.b) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                g0.h3(new ai.d3(tLObject, (org.telegram.ui.ActionBar.s1) obj5, (Context) obj4, this.f22791b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.e6) obj2, (h40) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    hp.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    yy.T(c.a(h10.f22829t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, bd.M0(2131752602, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.E1;
                g0.h3(new ai.d3((LaunchActivity) obj5, tLObject, this.f22791b, (org.telegram.ui.uw) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                g0.h3(new yd(tLObject, (org.telegram.ui.ActionBar.d2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ms0) obj3, (ad.b) obj2, this.f22791b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                j50 j50Var = (j50) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.h3(new ai.w1(tLObject, (Object) context2, (Object) e6Var, (Object) bArr, (Object) d2Var, (Object) j50Var, 18));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.i3(new vx0(d2Var, context2, e6Var, j50Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.i3(new org.telegram.ui.rw(d2Var, i10, j50Var, 11), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.i3(new vx0(d2Var, context2, e6Var, j50Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public gx(int i3, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f22790a = 3;
        this.f22791b = i3;
        this.d = zArr;
        this.f22793e = file;
        this.f22794f = setcallrating;
        this.f22795g = arrayList;
        this.f22792c = context;
    }

    public gx(Context context, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, j50 j50Var, int i3) {
        this.f22790a = 6;
        this.d = context;
        this.f22793e = e6Var;
        this.f22794f = bArr;
        this.f22795g = d2Var;
        this.f22792c = j50Var;
        this.f22791b = i3;
    }

    public gx(org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, h40 h40Var) {
        this.f22790a = 2;
        this.d = s1Var;
        this.f22793e = context;
        this.f22791b = i3;
        this.f22794f = exportgroupcallinvite;
        this.f22795g = e6Var;
        this.f22792c = h40Var;
    }

    public gx(org.telegram.ui.i4 i4Var, int i3, sf.b bVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f22790a = 1;
        this.d = i4Var;
        this.f22791b = i3;
        this.f22793e = bVar;
        this.f22792c = str;
        this.f22794f = g0Var;
        this.f22795g = tL_messages_getWebPage;
    }

    public gx(LaunchActivity launchActivity, int i3, org.telegram.ui.uw uwVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        this.f22790a = 4;
        this.d = launchActivity;
        this.f22791b = i3;
        this.f22793e = uwVar;
        this.f22794f = d2Var;
        this.f22795g = user;
        this.f22792c = str;
    }
}
