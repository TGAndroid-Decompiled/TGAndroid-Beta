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
import org.telegram.ui.Components.yw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.am0;
import org.telegram.ui.fx0;
import org.telegram.ui.j31;
import org.telegram.ui.t60;
import org.telegram.ui.uy;
public final class hi implements RequestDelegate {
    public final int f18072a;
    public final int f18073b;
    public final Object f18074c;
    public final Object d;
    public final Object f18075e;
    public final Object f18076f;
    public final Object f18077g;

    public hi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18072a = i11;
        this.d = obj;
        this.f18075e = tLObject;
        this.f18076f = obj2;
        this.f18077g = obj3;
        this.f18073b = i10;
        this.f18074c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18072a;
        int i11 = this.f18073b;
        Object obj = this.f18074c;
        Object obj2 = this.f18077g;
        Object obj3 = this.f18076f;
        Object obj4 = this.f18075e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18073b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.i4) obj5, this.f18073b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f18073b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.d6) obj2, (t60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.f18073b, (uy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (fx0) obj3, (c5.f) obj2, this.f18073b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                yw ywVar = (yw) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, d6Var, bArr, n2Var, ywVar, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new j31(n2Var, context2, d6Var, ywVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new am0(n2Var, i11, ywVar, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new j31(n2Var, context2, d6Var, ywVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public hi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18072a = 3;
        this.f18073b = i10;
        this.d = zArr;
        this.f18075e = file;
        this.f18076f = setcallrating;
        this.f18077g = arrayList;
        this.f18074c = context;
    }

    public hi(Context context, org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, yw ywVar, int i10) {
        this.f18072a = 6;
        this.d = context;
        this.f18075e = d6Var;
        this.f18076f = bArr;
        this.f18077g = n2Var;
        this.f18074c = ywVar;
        this.f18073b = i10;
    }

    public hi(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.d6 d6Var, t60 t60Var) {
        this.f18072a = 2;
        this.d = b2Var;
        this.f18075e = context;
        this.f18073b = i10;
        this.f18076f = exportgroupcallinvite;
        this.f18077g = d6Var;
        this.f18074c = t60Var;
    }

    public hi(org.telegram.ui.i4 i4Var, int i10, nf.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18072a = 1;
        this.d = i4Var;
        this.f18073b = i10;
        this.f18075e = eVar;
        this.f18074c = str;
        this.f18076f = g0Var;
        this.f18077g = tL_messages_getWebPage;
    }

    public hi(LaunchActivity launchActivity, int i10, uy uyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f18072a = 4;
        this.d = launchActivity;
        this.f18073b = i10;
        this.f18075e = uyVar;
        this.f18076f = n2Var;
        this.f18077g = user;
        this.f18074c = str;
    }
}
