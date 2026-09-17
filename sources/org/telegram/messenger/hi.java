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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.lx0;
import org.telegram.ui.s31;
import org.telegram.ui.uy;
import org.telegram.ui.v60;
public final class hi implements RequestDelegate {
    public final int f17930a;
    public final int f17931b;
    public final Object f17932c;
    public final Object d;
    public final Object f17933e;
    public final Object f17934f;
    public final Object f17935g;

    public hi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f17930a = i11;
        this.d = obj;
        this.f17933e = tLObject;
        this.f17934f = obj2;
        this.f17935g = obj3;
        this.f17931b = i10;
        this.f17932c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17930a;
        int i11 = this.f17931b;
        Object obj = this.f17932c;
        Object obj2 = this.f17935g;
        Object obj3 = this.f17934f;
        Object obj4 = this.f17933e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f17931b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.i4) obj5, this.f17931b, (of.e) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hg.e1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f17931b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (v60) obj));
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
                AndroidUtilities.runOnUIThread(new hg.e1((LaunchActivity) obj5, tLObject, this.f17931b, (uy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new x5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (lx0) obj3, (c5.f) obj2, this.f17931b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                jn0 jn0Var = (jn0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.h8(tLObject, context2, f6Var, bArr, n2Var, jn0Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new s31(n2Var, context2, f6Var, jn0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ai0(n2Var, i11, jn0Var, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new s31(n2Var, context2, f6Var, jn0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public hi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f17930a = 3;
        this.f17931b = i10;
        this.d = zArr;
        this.f17933e = file;
        this.f17934f = setcallrating;
        this.f17935g = arrayList;
        this.f17932c = context;
    }

    public hi(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, jn0 jn0Var, int i10) {
        this.f17930a = 6;
        this.d = context;
        this.f17933e = f6Var;
        this.f17934f = bArr;
        this.f17935g = n2Var;
        this.f17932c = jn0Var;
        this.f17931b = i10;
    }

    public hi(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, v60 v60Var) {
        this.f17930a = 2;
        this.d = b2Var;
        this.f17933e = context;
        this.f17931b = i10;
        this.f17934f = exportgroupcallinvite;
        this.f17935g = f6Var;
        this.f17932c = v60Var;
    }

    public hi(org.telegram.ui.i4 i4Var, int i10, of.e eVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f17930a = 1;
        this.d = i4Var;
        this.f17931b = i10;
        this.f17933e = eVar;
        this.f17932c = str;
        this.f17934f = f0Var;
        this.f17935g = tL_messages_getWebPage;
    }

    public hi(LaunchActivity launchActivity, int i10, uy uyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f17930a = 4;
        this.d = launchActivity;
        this.f17931b = i10;
        this.f17933e = uyVar;
        this.f17934f = n2Var;
        this.f17935g = user;
        this.f17932c = str;
    }
}
