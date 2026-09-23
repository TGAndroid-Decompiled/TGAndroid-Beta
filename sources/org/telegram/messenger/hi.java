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
import org.telegram.ui.Components.oy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ex0;
import org.telegram.ui.i31;
import org.telegram.ui.r60;
import org.telegram.ui.ry;
import org.telegram.ui.yl0;
public final class hi implements RequestDelegate {
    public final int f16312a;
    public final int f16313b;
    public final Object f16314c;
    public final Object d;
    public final Object e;
    public final Object f16315f;
    public final Object f16316g;

    public hi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16312a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f16315f = obj2;
        this.f16316g = obj3;
        this.f16313b = i10;
        this.f16314c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16312a;
        int i11 = this.f16313b;
        Object obj = this.f16314c;
        Object obj2 = this.f16316g;
        Object obj3 = this.f16315f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f16313b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.i4) obj5, this.f16313b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f16313b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.d6) obj2, (r60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.f16313b, (ry) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ex0) obj3, (c5.f) obj2, this.f16313b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                oy oyVar = (oy) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, d6Var, bArr, n2Var, oyVar, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new i31(n2Var, context2, d6Var, oyVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new yl0(n2Var, i11, oyVar, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new i31(n2Var, context2, d6Var, oyVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public hi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f16312a = 3;
        this.f16313b = i10;
        this.d = zArr;
        this.e = file;
        this.f16315f = setcallrating;
        this.f16316g = arrayList;
        this.f16314c = context;
    }

    public hi(Context context, org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, oy oyVar, int i10) {
        this.f16312a = 6;
        this.d = context;
        this.e = d6Var;
        this.f16315f = bArr;
        this.f16316g = n2Var;
        this.f16314c = oyVar;
        this.f16313b = i10;
    }

    public hi(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.d6 d6Var, r60 r60Var) {
        this.f16312a = 2;
        this.d = b2Var;
        this.e = context;
        this.f16313b = i10;
        this.f16315f = exportgroupcallinvite;
        this.f16316g = d6Var;
        this.f16314c = r60Var;
    }

    public hi(org.telegram.ui.i4 i4Var, int i10, nf.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16312a = 1;
        this.d = i4Var;
        this.f16313b = i10;
        this.e = eVar;
        this.f16314c = str;
        this.f16315f = g0Var;
        this.f16316g = tL_messages_getWebPage;
    }

    public hi(LaunchActivity launchActivity, int i10, ry ryVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f16312a = 4;
        this.d = launchActivity;
        this.f16313b = i10;
        this.e = ryVar;
        this.f16315f = n2Var;
        this.f16316g = user;
        this.f16314c = str;
    }
}
