package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class rt implements RequestDelegate {
    public final byte a = 6;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public rt(int i, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Activity activity) {
        this.b = i;
        this.c = zArr;
        this.d = file;
        this.e = setcallrating;
        this.f = arrayList;
        this.g = activity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                hl.c3(new st((o) obj5, this.b, (wt) obj4, tLObject, (String) obj3, (qt) obj2, (TLRPC.TL_messages_getWebPage) obj, (byte) 0));
                return;
            case 1:
                hl.c3(new st(tLObject, (id) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (vnb) obj2, (gc5) obj));
                return;
            case 2:
                String str = LaunchActivity.C1;
                hl.c3(new st((LaunchActivity) obj5, tLObject, this.b, (uj3) obj4, (e) obj2, (TLRPC.User) obj, (String) obj3));
                return;
            case 3:
                hl.c3(new a84(tLObject, (e) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (tl8) obj3, (ekd) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            case 4:
                Context context = (Context) obj5;
                vnb vnbVar = (vnb) obj4;
                byte[] bArr = (byte[]) obj3;
                e eVar = (e) obj2;
                dn9 dn9Var = (dn9) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        hl.c3(new z87((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, context, vnbVar, bArr, eVar, dn9Var, (byte) 22));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        hl.d3(new fb9(eVar, context, vnbVar, dn9Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        hl.d3(new a39(eVar, i, dn9Var, (byte) 1), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    hl.d3(new fb9(eVar, context, vnbVar, dn9Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
            case 5:
                hl.c3(new st((r7a) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.TL_inputMediaUploadedDocument) obj2, (d7a) obj, this.b, (String) obj3, (byte) 18));
                return;
            default:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Activity activity = (Activity) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    uc7.s1(i).Y3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    r7a.S(k5.a(yac.t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(activity, ob6.M0(2131752583, null), 1).show();
                    return;
                }
                return;
        }
    }

    public rt(id idVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, vnb vnbVar, gc5 gc5Var) {
        this.c = idVar;
        this.d = context;
        this.b = i;
        this.e = exportgroupcallinvite;
        this.f = vnbVar;
        this.g = gc5Var;
    }

    public rt(r7a r7aVar, TLRPC.InputFile inputFile, TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument, d7a d7aVar, int i, String str) {
        this.c = r7aVar;
        this.d = inputFile;
        this.f = tL_inputMediaUploadedDocument;
        this.g = d7aVar;
        this.b = i;
        this.e = str;
    }

    public rt(Context context, vnb vnbVar, byte[] bArr, e eVar, dn9 dn9Var, int i) {
        this.c = context;
        this.d = vnbVar;
        this.e = bArr;
        this.f = eVar;
        this.g = dn9Var;
        this.b = i;
    }

    public rt(e eVar, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, tl8 tl8Var, ekd ekdVar, int i, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.c = eVar;
        this.d = tL_inputStorePaymentPremiumSubscription;
        this.e = tl8Var;
        this.f = ekdVar;
        this.b = i;
        this.g = tL_payments_canPurchaseStore;
    }

    public rt(o oVar, int i, wt wtVar, String str, qt qtVar, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.c = oVar;
        this.b = i;
        this.d = wtVar;
        this.e = str;
        this.f = qtVar;
        this.g = tL_messages_getWebPage;
    }

    public rt(LaunchActivity launchActivity, int i, uj3 uj3Var, e eVar, TLRPC.User user, String str) {
        this.c = launchActivity;
        this.b = i;
        this.d = uj3Var;
        this.f = eVar;
        this.g = user;
        this.e = str;
    }
}
