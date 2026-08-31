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
import org.telegram.ui.Components.a90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.p60;
import org.telegram.ui.py;
import org.telegram.ui.sw0;
import org.telegram.ui.z21;
public final class li implements RequestDelegate {
    public final int f19284a;
    public final int f19285b;
    public final Object f19286c;
    public final Object d;
    public final Object f19287e;
    public final Object f19288f;
    public final Object f19289g;

    public li(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f19284a = 3;
        this.f19285b = i10;
        this.d = zArr;
        this.f19287e = file;
        this.f19288f = setcallrating;
        this.f19289g = arrayList;
        this.f19286c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f19284a;
        int i11 = this.f19285b;
        Object obj = this.f19286c;
        Object obj2 = this.f19289g;
        Object obj3 = this.f19288f;
        Object obj4 = this.f19287e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f19285b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lh.l2((org.telegram.ui.l4) obj5, this.f19285b, (af.f) obj4, tLObject, (String) obj, (org.telegram.ui.h0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new lh.l2(tLObject, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.f19285b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.g6) obj2, (p60) obj));
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
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new lh.l2((LaunchActivity) obj5, tLObject, this.f19285b, (py) obj4, (org.telegram.ui.ActionBar.p2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a6(tLObject, (org.telegram.ui.ActionBar.p2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (sw0) obj3, (p2.e) obj2, this.f19285b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                a90 a90Var = (a90) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new lh.e1(tLObject, (Object) context2, (Object) g6Var, (Object) bArr, (Object) p2Var, (Object) a90Var, 16));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new z21(p2Var, context2, g6Var, a90Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new bu0(p2Var, i11, a90Var, 5), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new z21(p2Var, context2, g6Var, a90Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public li(Context context, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, a90 a90Var, int i10) {
        this.f19284a = 6;
        this.d = context;
        this.f19287e = g6Var;
        this.f19288f = bArr;
        this.f19289g = p2Var;
        this.f19286c = a90Var;
        this.f19285b = i10;
    }

    public li(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f19284a = i11;
        this.d = obj;
        this.f19287e = tLObject;
        this.f19288f = obj2;
        this.f19289g = obj3;
        this.f19285b = i10;
        this.f19286c = obj4;
    }

    public li(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.g6 g6Var, p60 p60Var) {
        this.f19284a = 2;
        this.d = d2Var;
        this.f19287e = context;
        this.f19285b = i10;
        this.f19288f = exportgroupcallinvite;
        this.f19289g = g6Var;
        this.f19286c = p60Var;
    }

    public li(org.telegram.ui.l4 l4Var, int i10, af.f fVar, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f19284a = 1;
        this.d = l4Var;
        this.f19285b = i10;
        this.f19287e = fVar;
        this.f19286c = str;
        this.f19288f = h0Var;
        this.f19289g = tL_messages_getWebPage;
    }

    public li(LaunchActivity launchActivity, int i10, py pyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.f19284a = 4;
        this.d = launchActivity;
        this.f19285b = i10;
        this.f19287e = pyVar;
        this.f19288f = p2Var;
        this.f19289g = user;
        this.f19286c = str;
    }
}
