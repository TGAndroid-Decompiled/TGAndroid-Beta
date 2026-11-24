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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class ou implements RequestDelegate {
    public final byte a = 6;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ou(int i, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Activity activity) {
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
                gm.c3(new qu((o) obj5, this.b, (vu) obj4, tLObject, (String) obj3, (nu) obj2, (TLRPC.TL_messages_getWebPage) obj, (byte) 0));
                return;
            case 1:
                gm.c3(new qu(tLObject, (he) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (ylb) obj2, (dc5) obj));
                return;
            case 2:
                String str = LaunchActivity.C1;
                gm.c3(new qu((LaunchActivity) obj5, tLObject, this.b, (nk3) obj4, (d) obj2, (TLRPC.User) obj, (String) obj3));
                return;
            case 3:
                gm.c3(new bz1(tLObject, (d) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ik8) obj3, (ohd) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj, (byte) 4));
                return;
            case 4:
                Context context = (Context) obj5;
                ylb ylbVar = (ylb) obj4;
                byte[] bArr = (byte[]) obj3;
                d dVar = (d) obj2;
                il9 il9Var = (il9) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        gm.c3(new e77((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, context, ylbVar, bArr, dVar, il9Var, (byte) 22));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        gm.d3(new u99(dVar, context, ylbVar, il9Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        gm.d3(new v99(dVar, i, il9Var, (byte) 0), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gm.d3(new u99(dVar, context, ylbVar, il9Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
            case 5:
                gm.c3(new qu((a6a) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.TL_inputMediaUploadedDocument) obj2, (m5a) obj, this.b, (String) obj3, (byte) 18));
                return;
            default:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Activity activity = (Activity) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    oc7.r1(i).T3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    a6a.S(j5.a(z8c.t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(activity, jb6.M0(2131752555, null), 1).show();
                    return;
                }
                return;
        }
    }

    public ou(he heVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, ylb ylbVar, dc5 dc5Var) {
        this.c = heVar;
        this.d = context;
        this.b = i;
        this.e = exportgroupcallinvite;
        this.f = ylbVar;
        this.g = dc5Var;
    }

    public ou(a6a a6aVar, TLRPC.InputFile inputFile, TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument, m5a m5aVar, int i, String str) {
        this.c = a6aVar;
        this.d = inputFile;
        this.f = tL_inputMediaUploadedDocument;
        this.g = m5aVar;
        this.b = i;
        this.e = str;
    }

    public ou(Context context, ylb ylbVar, byte[] bArr, d dVar, il9 il9Var, int i) {
        this.c = context;
        this.d = ylbVar;
        this.e = bArr;
        this.f = dVar;
        this.g = il9Var;
        this.b = i;
    }

    public ou(d dVar, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ik8 ik8Var, ohd ohdVar, int i, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.c = dVar;
        this.d = tL_inputStorePaymentPremiumSubscription;
        this.e = ik8Var;
        this.f = ohdVar;
        this.b = i;
        this.g = tL_payments_canPurchaseStore;
    }

    public ou(o oVar, int i, vu vuVar, String str, nu nuVar, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.c = oVar;
        this.b = i;
        this.d = vuVar;
        this.e = str;
        this.f = nuVar;
        this.g = tL_messages_getWebPage;
    }

    public ou(LaunchActivity launchActivity, int i, nk3 nk3Var, d dVar, TLRPC.User user, String str) {
        this.c = launchActivity;
        this.b = i;
        this.d = nk3Var;
        this.f = dVar;
        this.g = user;
        this.e = str;
    }
}
