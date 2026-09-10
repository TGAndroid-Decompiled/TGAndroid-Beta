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
import org.telegram.ui.Components.hy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nx0;
import org.telegram.ui.u60;
import org.telegram.ui.uu0;
import org.telegram.ui.v31;
import org.telegram.ui.wy;
public final class qi implements RequestDelegate {
    public final int f16154a;
    public final int f16155b;
    public final Object f16156c;
    public final Object d;
    public final Object e;
    public final Object f16157f;
    public final Object f16158g;

    public qi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16154a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f16157f = obj2;
        this.f16158g = obj3;
        this.f16155b = i10;
        this.f16156c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16154a;
        int i11 = this.f16155b;
        Object obj = this.f16156c;
        Object obj2 = this.f16158g;
        Object obj3 = this.f16157f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f16155b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fg.f1((org.telegram.ui.j4) obj5, this.f16155b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fg.f1(tLObject, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.f16155b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (u60) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    SendMessagesHelper.prepareSendingDocument(AccountInstance.getInstance(UserConfig.selectedAccount), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, null, true, 0, null, null, false);
                    Toast.makeText(context, LocaleController.getString(R.string.CallReportSent), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new fg.f1((LaunchActivity) obj5, tLObject, this.f16155b, (wy) obj4, (org.telegram.ui.ActionBar.p2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new e6(tLObject, (org.telegram.ui.ActionBar.p2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (nx0) obj3, (c5.f) obj2, this.f16155b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                hy hyVar = (hy) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.te(tLObject, (Object) context2, (Object) f6Var, (Object) bArr, (Object) p2Var, (Object) hyVar, 10));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new v31(p2Var, context2, f6Var, hyVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new uu0(p2Var, i11, hyVar, 5), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new v31(p2Var, context2, f6Var, hyVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public qi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f16154a = 3;
        this.f16155b = i10;
        this.d = zArr;
        this.e = file;
        this.f16157f = setcallrating;
        this.f16158g = arrayList;
        this.f16156c = context;
    }

    public qi(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, hy hyVar, int i10) {
        this.f16154a = 6;
        this.d = context;
        this.e = f6Var;
        this.f16157f = bArr;
        this.f16158g = p2Var;
        this.f16156c = hyVar;
        this.f16155b = i10;
    }

    public qi(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, u60 u60Var) {
        this.f16154a = 2;
        this.d = d2Var;
        this.e = context;
        this.f16155b = i10;
        this.f16157f = exportgroupcallinvite;
        this.f16158g = f6Var;
        this.f16156c = u60Var;
    }

    public qi(org.telegram.ui.j4 j4Var, int i10, nf.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16154a = 1;
        this.d = j4Var;
        this.f16155b = i10;
        this.e = eVar;
        this.f16156c = str;
        this.f16157f = g0Var;
        this.f16158g = tL_messages_getWebPage;
    }

    public qi(LaunchActivity launchActivity, int i10, wy wyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.f16154a = 4;
        this.d = launchActivity;
        this.f16155b = i10;
        this.e = wyVar;
        this.f16157f = p2Var;
        this.f16158g = user;
        this.f16156c = str;
    }
}
