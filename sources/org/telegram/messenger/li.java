package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.t90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;
import org.telegram.ui.h60;
import org.telegram.ui.j21;
import org.telegram.ui.xw0;
import org.telegram.ui.yx;
public final class li implements RequestDelegate {
    public final int f20600a;
    public final int f20601b;
    public final Object f20602c;
    public final Object d;
    public final Object e;
    public final Object f20603f;
    public final Object f20604g;

    public li(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f20600a = 3;
        this.f20601b = i10;
        this.d = zArr;
        this.e = file;
        this.f20603f = setcallrating;
        this.f20604g = arrayList;
        this.f20602c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20600a;
        int i11 = this.f20601b;
        Object obj = this.f20602c;
        Object obj2 = this.f20604g;
        Object obj3 = this.f20603f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f20601b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ig.d1((org.telegram.ui.j4) obj5, this.f20601b, (qf.c) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ig.d1(tLObject, (org.telegram.ui.ActionBar.e2) obj5, (Context) obj4, this.f20601b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.u6) obj2, (h60) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    SendMessagesHelper.prepareSendingDocument(AccountInstance.getInstance(UserConfig.selectedAccount), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, null, true, 0, null, null, false);
                    Toast.makeText(context, LocaleController.getString(R.string.CallReportSent), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new ig.d1((LaunchActivity) obj5, tLObject, this.f20601b, (cy) obj4, (org.telegram.ui.ActionBar.r2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new d6(tLObject, (org.telegram.ui.ActionBar.r2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (xw0) obj3, (d5.g) obj2, this.f20601b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                t90 t90Var = (t90) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.c3(tLObject, (Object) context2, (Object) u6Var, (Object) bArr, (Object) r2Var, (Object) t90Var, 18));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new j21(r2Var, context2, u6Var, t90Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new yx(r2Var, i11, t90Var, 11), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new j21(r2Var, context2, u6Var, t90Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public li(Context context, org.telegram.ui.ActionBar.u6 u6Var, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, t90 t90Var, int i10) {
        this.f20600a = 6;
        this.d = context;
        this.e = u6Var;
        this.f20603f = bArr;
        this.f20604g = r2Var;
        this.f20602c = t90Var;
        this.f20601b = i10;
    }

    public li(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f20600a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f20603f = obj2;
        this.f20604g = obj3;
        this.f20601b = i10;
        this.f20602c = obj4;
    }

    public li(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.u6 u6Var, h60 h60Var) {
        this.f20600a = 2;
        this.d = e2Var;
        this.e = context;
        this.f20601b = i10;
        this.f20603f = exportgroupcallinvite;
        this.f20604g = u6Var;
        this.f20602c = h60Var;
    }

    public li(org.telegram.ui.j4 j4Var, int i10, qf.c cVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f20600a = 1;
        this.d = j4Var;
        this.f20601b = i10;
        this.e = cVar;
        this.f20602c = str;
        this.f20603f = f0Var;
        this.f20604g = tL_messages_getWebPage;
    }

    public li(LaunchActivity launchActivity, int i10, cy cyVar, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, String str) {
        this.f20600a = 4;
        this.d = launchActivity;
        this.f20601b = i10;
        this.e = cyVar;
        this.f20603f = r2Var;
        this.f20604g = user;
        this.f20602c = str;
    }
}
