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
import org.telegram.ui.Components.g90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c90;
import org.telegram.ui.rx0;
import org.telegram.ui.w31;
import org.telegram.ui.yy;
import org.telegram.ui.z60;
public final class mi implements RequestDelegate {
    public final int f17580a;
    public final int f17581b;
    public final Object f17582c;
    public final Object d;
    public final Object e;
    public final Object f17583f;
    public final Object f17584g;

    public mi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f17580a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17583f = obj2;
        this.f17584g = obj3;
        this.f17581b = i10;
        this.f17582c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17580a;
        int i11 = this.f17581b;
        Object obj = this.f17582c;
        Object obj2 = this.f17584g;
        Object obj3 = this.f17583f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f17581b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.k4) obj5, this.f17581b, (pf.c) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hg.d1(tLObject, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj4, this.f17581b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.c6) obj2, (z60) obj));
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
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj5, tLObject, this.f17581b, (yy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new b6(tLObject, (org.telegram.ui.ActionBar.m2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (rx0) obj3, (c5.g) obj2, this.f17581b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                g90 g90Var = (g90) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.k8(tLObject, context2, c6Var, bArr, m2Var, g90Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new w31(m2Var, context2, c6Var, g90Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new c90(m2Var, i11, g90Var, 9), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new w31(m2Var, context2, c6Var, g90Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public mi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f17580a = 3;
        this.f17581b = i10;
        this.d = zArr;
        this.e = file;
        this.f17583f = setcallrating;
        this.f17584g = arrayList;
        this.f17582c = context;
    }

    public mi(Context context, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, g90 g90Var, int i10) {
        this.f17580a = 6;
        this.d = context;
        this.e = c6Var;
        this.f17583f = bArr;
        this.f17584g = m2Var;
        this.f17582c = g90Var;
        this.f17581b = i10;
    }

    public mi(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, z60 z60Var) {
        this.f17580a = 2;
        this.d = a2Var;
        this.e = context;
        this.f17581b = i10;
        this.f17583f = exportgroupcallinvite;
        this.f17584g = c6Var;
        this.f17582c = z60Var;
    }

    public mi(org.telegram.ui.k4 k4Var, int i10, pf.c cVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f17580a = 1;
        this.d = k4Var;
        this.f17581b = i10;
        this.e = cVar;
        this.f17582c = str;
        this.f17583f = g0Var;
        this.f17584g = tL_messages_getWebPage;
    }

    public mi(LaunchActivity launchActivity, int i10, yy yyVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.f17580a = 4;
        this.d = launchActivity;
        this.f17581b = i10;
        this.e = yyVar;
        this.f17583f = m2Var;
        this.f17584g = user;
        this.f17582c = str;
    }
}
