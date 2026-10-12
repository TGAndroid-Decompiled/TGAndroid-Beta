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
import org.telegram.ui.Components.gi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.nx0;
import org.telegram.ui.r31;
import org.telegram.ui.u60;
import org.telegram.ui.vy;
public final class pi implements RequestDelegate {
    public final int f18594a;
    public final int f18595b;
    public final Object f18596c;
    public final Object d;
    public final Object f18597e;
    public final Object f18598f;
    public final Object f18599g;

    public pi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18594a = i11;
        this.d = obj;
        this.f18597e = tLObject;
        this.f18598f = obj2;
        this.f18599g = obj3;
        this.f18595b = i10;
        this.f18596c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18594a;
        int i11 = this.f18595b;
        Object obj = this.f18596c;
        Object obj2 = this.f18599g;
        Object obj3 = this.f18598f;
        Object obj4 = this.f18597e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18595b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.i4) obj5, this.f18595b, (of.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.d1(tLObject, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj4, this.f18595b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.c6) obj2, (u60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.d1((LaunchActivity) obj5, tLObject, this.f18595b, (vy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new b6(tLObject, (org.telegram.ui.ActionBar.m2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (nx0) obj3, (c5.f) obj2, this.f18595b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                gi0 gi0Var = (gi0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.a9(tLObject, context2, c6Var, bArr, m2Var, gi0Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new r31(m2Var, context2, c6Var, gi0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ci0(m2Var, i11, gi0Var, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new r31(m2Var, context2, c6Var, gi0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public pi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18594a = 3;
        this.f18595b = i10;
        this.d = zArr;
        this.f18597e = file;
        this.f18598f = setcallrating;
        this.f18599g = arrayList;
        this.f18596c = context;
    }

    public pi(Context context, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, gi0 gi0Var, int i10) {
        this.f18594a = 6;
        this.d = context;
        this.f18597e = c6Var;
        this.f18598f = bArr;
        this.f18599g = m2Var;
        this.f18596c = gi0Var;
        this.f18595b = i10;
    }

    public pi(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, u60 u60Var) {
        this.f18594a = 2;
        this.d = a2Var;
        this.f18597e = context;
        this.f18595b = i10;
        this.f18598f = exportgroupcallinvite;
        this.f18599g = c6Var;
        this.f18596c = u60Var;
    }

    public pi(org.telegram.ui.i4 i4Var, int i10, of.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18594a = 1;
        this.d = i4Var;
        this.f18595b = i10;
        this.f18597e = eVar;
        this.f18596c = str;
        this.f18598f = g0Var;
        this.f18599g = tL_messages_getWebPage;
    }

    public pi(LaunchActivity launchActivity, int i10, vy vyVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.f18594a = 4;
        this.d = launchActivity;
        this.f18595b = i10;
        this.f18597e = vyVar;
        this.f18598f = m2Var;
        this.f18599g = user;
        this.f18596c = str;
    }
}
