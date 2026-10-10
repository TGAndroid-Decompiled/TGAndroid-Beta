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
import org.telegram.ui.Components.di0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.lx0;
import org.telegram.ui.q31;
import org.telegram.ui.s60;
import org.telegram.ui.ty;
public final class li implements RequestDelegate {
    public final int f18453a;
    public final int f18454b;
    public final Object f18455c;
    public final Object d;
    public final Object f18456e;
    public final Object f18457f;
    public final Object f18458g;

    public li(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18453a = i11;
        this.d = obj;
        this.f18456e = tLObject;
        this.f18457f = obj2;
        this.f18458g = obj3;
        this.f18454b = i10;
        this.f18455c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18453a;
        int i11 = this.f18454b;
        Object obj = this.f18455c;
        Object obj2 = this.f18458g;
        Object obj3 = this.f18457f;
        Object obj4 = this.f18456e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18454b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.i4) obj5, this.f18454b, (of.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.d1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f18454b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.e6) obj2, (s60) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
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
                AndroidUtilities.runOnUIThread(new gg.d1((LaunchActivity) obj5, tLObject, this.f18454b, (ty) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new z5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (lx0) obj3, (c5.f) obj2, this.f18454b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                di0 di0Var = (di0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.a9(tLObject, context2, e6Var, bArr, n2Var, di0Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new q31(n2Var, context2, e6Var, di0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new bi0(n2Var, i11, di0Var, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new q31(n2Var, context2, e6Var, di0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public li(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18453a = 3;
        this.f18454b = i10;
        this.d = zArr;
        this.f18456e = file;
        this.f18457f = setcallrating;
        this.f18458g = arrayList;
        this.f18455c = context;
    }

    public li(Context context, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, di0 di0Var, int i10) {
        this.f18453a = 6;
        this.d = context;
        this.f18456e = e6Var;
        this.f18457f = bArr;
        this.f18458g = n2Var;
        this.f18455c = di0Var;
        this.f18454b = i10;
    }

    public li(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, s60 s60Var) {
        this.f18453a = 2;
        this.d = b2Var;
        this.f18456e = context;
        this.f18454b = i10;
        this.f18457f = exportgroupcallinvite;
        this.f18458g = e6Var;
        this.f18455c = s60Var;
    }

    public li(org.telegram.ui.i4 i4Var, int i10, of.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18453a = 1;
        this.d = i4Var;
        this.f18454b = i10;
        this.f18456e = eVar;
        this.f18455c = str;
        this.f18457f = g0Var;
        this.f18458g = tL_messages_getWebPage;
    }

    public li(LaunchActivity launchActivity, int i10, ty tyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f18453a = 4;
        this.d = launchActivity;
        this.f18454b = i10;
        this.f18456e = tyVar;
        this.f18457f = n2Var;
        this.f18458g = user;
        this.f18455c = str;
    }
}
