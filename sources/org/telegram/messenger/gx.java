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
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy0;
import org.telegram.ui.o40;
import org.telegram.ui.ws0;
public final class gx implements RequestDelegate {
    public final int f24416a;
    public final int f24417b;
    public final Object f24418c;
    public final Object d;
    public final Object f24419e;
    public final Object f24420f;
    public final Object f24421g;

    public gx(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f24416a = i10;
        this.d = obj;
        this.f24419e = tLObject;
        this.f24420f = obj2;
        this.f24421g = obj3;
        this.f24417b = i7;
        this.f24418c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f24416a;
        int i10 = this.f24417b;
        Object obj = this.f24418c;
        Object obj2 = this.f24421g;
        Object obj3 = this.f24420f;
        Object obj4 = this.f24419e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.g3(new bi.i5((zy) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (ly) obj2, this.f24417b, (String) obj, 3));
                return;
            case 1:
                g0.g3(new bi.i5((org.telegram.ui.g4) obj5, this.f24417b, (vf.b) obj4, tLObject, (String) obj, (org.telegram.ui.e0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                g0.g3(new bi.i5(tLObject, (org.telegram.ui.ActionBar.t1) obj5, (Context) obj4, this.f24417b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.i6) obj2, (o40) obj));
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
                    zy.T(c.a(i10.f24637t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, gd.N0(2131752590, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.C1;
                g0.g3(new bi.i5((LaunchActivity) obj5, tLObject, this.f24417b, (org.telegram.ui.bx) obj4, (org.telegram.ui.ActionBar.g2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                g0.g3(new ce(tLObject, (org.telegram.ui.ActionBar.g2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ws0) obj3, (com.google.android.gms.internal.clearcut.y0) obj2, this.f24417b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                sh0 sh0Var = (sh0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        g0.g3(new bi.n2(tLObject, (Object) context2, (Object) i6Var, (Object) bArr, (Object) g2Var, (Object) sh0Var, 19));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        g0.h3(new fy0(g2Var, context2, i6Var, sh0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        g0.h3(new e21(g2Var, i10, sh0Var, 13), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    g0.h3(new fy0(g2Var, context2, i6Var, sh0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public gx(int i7, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f24416a = 3;
        this.f24417b = i7;
        this.d = zArr;
        this.f24419e = file;
        this.f24420f = setcallrating;
        this.f24421g = arrayList;
        this.f24418c = context;
    }

    public gx(Context context, org.telegram.ui.ActionBar.i6 i6Var, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, sh0 sh0Var, int i7) {
        this.f24416a = 6;
        this.d = context;
        this.f24419e = i6Var;
        this.f24420f = bArr;
        this.f24421g = g2Var;
        this.f24418c = sh0Var;
        this.f24417b = i7;
    }

    public gx(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.i6 i6Var, o40 o40Var) {
        this.f24416a = 2;
        this.d = t1Var;
        this.f24419e = context;
        this.f24417b = i7;
        this.f24420f = exportgroupcallinvite;
        this.f24421g = i6Var;
        this.f24418c = o40Var;
    }

    public gx(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, String str, org.telegram.ui.e0 e0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f24416a = 1;
        this.d = g4Var;
        this.f24417b = i7;
        this.f24419e = bVar;
        this.f24418c = str;
        this.f24420f = e0Var;
        this.f24421g = tL_messages_getWebPage;
    }

    public gx(LaunchActivity launchActivity, int i7, org.telegram.ui.bx bxVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        this.f24416a = 4;
        this.d = launchActivity;
        this.f24417b = i7;
        this.f24419e = bxVar;
        this.f24420f = g2Var;
        this.f24421g = user;
        this.f24418c = str;
    }
}
