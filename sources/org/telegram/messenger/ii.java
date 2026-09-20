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
import org.telegram.ui.Components.wn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fm0;
import org.telegram.ui.lx0;
import org.telegram.ui.q31;
import org.telegram.ui.u60;
import org.telegram.ui.uy;
public final class ii implements RequestDelegate {
    public final int f16648a;
    public final int f16649b;
    public final Object f16650c;
    public final Object d;
    public final Object e;
    public final Object f16651f;
    public final Object f16652g;

    public ii(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16648a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f16651f = obj2;
        this.f16652g = obj3;
        this.f16649b = i10;
        this.f16650c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16648a;
        int i11 = this.f16649b;
        Object obj = this.f16650c;
        Object obj2 = this.f16652g;
        Object obj3 = this.f16651f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f16649b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.h4) obj5, this.f16649b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f16649b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (u60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.f16649b, (uy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (lx0) obj3, (c5.f) obj2, this.f16649b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                wn0 wn0Var = (wn0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, f6Var, bArr, n2Var, wn0Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new q31(n2Var, context2, f6Var, wn0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new fm0(n2Var, i11, wn0Var, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new q31(n2Var, context2, f6Var, wn0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public ii(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f16648a = 3;
        this.f16649b = i10;
        this.d = zArr;
        this.e = file;
        this.f16651f = setcallrating;
        this.f16652g = arrayList;
        this.f16650c = context;
    }

    public ii(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, wn0 wn0Var, int i10) {
        this.f16648a = 6;
        this.d = context;
        this.e = f6Var;
        this.f16651f = bArr;
        this.f16652g = n2Var;
        this.f16650c = wn0Var;
        this.f16649b = i10;
    }

    public ii(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, u60 u60Var) {
        this.f16648a = 2;
        this.d = b2Var;
        this.e = context;
        this.f16649b = i10;
        this.f16651f = exportgroupcallinvite;
        this.f16652g = f6Var;
        this.f16650c = u60Var;
    }

    public ii(org.telegram.ui.h4 h4Var, int i10, nf.e eVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16648a = 1;
        this.d = h4Var;
        this.f16649b = i10;
        this.e = eVar;
        this.f16650c = str;
        this.f16651f = f0Var;
        this.f16652g = tL_messages_getWebPage;
    }

    public ii(LaunchActivity launchActivity, int i10, uy uyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f16648a = 4;
        this.d = launchActivity;
        this.f16649b = i10;
        this.e = uyVar;
        this.f16651f = n2Var;
        this.f16652g = user;
        this.f16650c = str;
    }
}
