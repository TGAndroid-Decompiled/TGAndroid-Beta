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
import org.telegram.ui.Components.ei0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai0;
import org.telegram.ui.kx0;
import org.telegram.ui.p31;
import org.telegram.ui.s60;
import org.telegram.ui.sy;
public final class ki implements RequestDelegate {
    public final int f18408a;
    public final int f18409b;
    public final Object f18410c;
    public final Object d;
    public final Object f18411e;
    public final Object f18412f;
    public final Object f18413g;

    public ki(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18408a = i11;
        this.d = obj;
        this.f18411e = tLObject;
        this.f18412f = obj2;
        this.f18413g = obj3;
        this.f18409b = i10;
        this.f18410c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18408a;
        int i11 = this.f18409b;
        Object obj = this.f18410c;
        Object obj2 = this.f18413g;
        Object obj3 = this.f18412f;
        Object obj4 = this.f18411e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18409b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.h4) obj5, this.f18409b, (of.e) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.d1(tLObject, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj4, this.f18409b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.d6) obj2, (s60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.d1((LaunchActivity) obj5, tLObject, this.f18409b, (sy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new z5(tLObject, (org.telegram.ui.ActionBar.m2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (kx0) obj3, (c5.f) obj2, this.f18409b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                ei0 ei0Var = (ei0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.a9(tLObject, context2, d6Var, bArr, m2Var, ei0Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new p31(m2Var, context2, d6Var, ei0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ai0(m2Var, i11, ei0Var, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new p31(m2Var, context2, d6Var, ei0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public ki(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18408a = 3;
        this.f18409b = i10;
        this.d = zArr;
        this.f18411e = file;
        this.f18412f = setcallrating;
        this.f18413g = arrayList;
        this.f18410c = context;
    }

    public ki(Context context, org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, ei0 ei0Var, int i10) {
        this.f18408a = 6;
        this.d = context;
        this.f18411e = d6Var;
        this.f18412f = bArr;
        this.f18413g = m2Var;
        this.f18410c = ei0Var;
        this.f18409b = i10;
    }

    public ki(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.d6 d6Var, s60 s60Var) {
        this.f18408a = 2;
        this.d = a2Var;
        this.f18411e = context;
        this.f18409b = i10;
        this.f18412f = exportgroupcallinvite;
        this.f18413g = d6Var;
        this.f18410c = s60Var;
    }

    public ki(org.telegram.ui.h4 h4Var, int i10, of.e eVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18408a = 1;
        this.d = h4Var;
        this.f18409b = i10;
        this.f18411e = eVar;
        this.f18410c = str;
        this.f18412f = f0Var;
        this.f18413g = tL_messages_getWebPage;
    }

    public ki(LaunchActivity launchActivity, int i10, sy syVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.f18408a = 4;
        this.d = launchActivity;
        this.f18409b = i10;
        this.f18411e = syVar;
        this.f18412f = m2Var;
        this.f18413g = user;
        this.f18410c = str;
    }
}
