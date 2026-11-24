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
public final class ot implements RequestDelegate {
    public final byte a = 6;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ot(int i, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Activity activity) {
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
                gl.c3(new qt((o) obj5, this.b, (vt) obj4, tLObject, (String) obj3, (nt) obj2, (TLRPC.TL_messages_getWebPage) obj, (byte) 0));
                return;
            case 1:
                gl.c3(new qt(tLObject, (hd) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (wjb) obj2, (fa5) obj));
                return;
            case 2:
                String str = LaunchActivity.C1;
                gl.c3(new qt((LaunchActivity) obj5, tLObject, this.b, (cj3) obj4, (d) obj2, (TLRPC.User) obj, (String) obj3));
                return;
            case 3:
                gl.c3(new ox1(tLObject, (d) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (gi8) obj3, (nfd) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj, (byte) 4));
                return;
            case 4:
                Context context = (Context) obj5;
                wjb wjbVar = (wjb) obj4;
                byte[] bArr = (byte[]) obj3;
                d dVar = (d) obj2;
                tj9 tj9Var = (tj9) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        gl.c3(new e57((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject, context, wjbVar, bArr, dVar, tj9Var, (byte) 22));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        gl.d3(new s79(dVar, context, wjbVar, tj9Var, (byte) 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        gl.d3(new t79(dVar, i, tj9Var, (byte) 0), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gl.d3(new s79(dVar, context, wjbVar, tj9Var, (byte) 1), 200L);
                    return;
                } else {
                    return;
                }
            case 5:
                gl.c3(new qt((z3a) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.TL_inputMediaUploadedDocument) obj2, (k3a) obj, this.b, (String) obj3, (byte) 18));
                return;
            default:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Activity activity = (Activity) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    na7.q1(i).R3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    z3a.S(j5.a(y6c.t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(activity, k96.M0(2131752590, null), 1).show();
                    return;
                }
                return;
        }
    }

    public ot(hd hdVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, wjb wjbVar, fa5 fa5Var) {
        this.c = hdVar;
        this.d = context;
        this.b = i;
        this.e = exportgroupcallinvite;
        this.f = wjbVar;
        this.g = fa5Var;
    }

    public ot(z3a z3aVar, TLRPC.InputFile inputFile, TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument, k3a k3aVar, int i, String str) {
        this.c = z3aVar;
        this.d = inputFile;
        this.f = tL_inputMediaUploadedDocument;
        this.g = k3aVar;
        this.b = i;
        this.e = str;
    }

    public ot(Context context, wjb wjbVar, byte[] bArr, d dVar, tj9 tj9Var, int i) {
        this.c = context;
        this.d = wjbVar;
        this.e = bArr;
        this.f = dVar;
        this.g = tj9Var;
        this.b = i;
    }

    public ot(d dVar, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, gi8 gi8Var, nfd nfdVar, int i, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.c = dVar;
        this.d = tL_inputStorePaymentPremiumSubscription;
        this.e = gi8Var;
        this.f = nfdVar;
        this.b = i;
        this.g = tL_payments_canPurchaseStore;
    }

    public ot(o oVar, int i, vt vtVar, String str, nt ntVar, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.c = oVar;
        this.b = i;
        this.d = vtVar;
        this.e = str;
        this.f = ntVar;
        this.g = tL_messages_getWebPage;
    }

    public ot(LaunchActivity launchActivity, int i, cj3 cj3Var, d dVar, TLRPC.User user, String str) {
        this.c = launchActivity;
        this.b = i;
        this.d = cj3Var;
        this.f = dVar;
        this.g = user;
        this.e = str;
    }
}
