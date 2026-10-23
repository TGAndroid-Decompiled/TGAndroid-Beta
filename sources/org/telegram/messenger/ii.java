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
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.f60;
import org.telegram.ui.g21;
import org.telegram.ui.tw0;
public final class ii implements RequestDelegate {
    public final int f18711a;
    public final int f18712b;
    public final Object f18713c;
    public final Object d;
    public final Object e;
    public final Object f18714f;
    public final Object f18715g;

    public ii(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18711a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f18714f = obj2;
        this.f18715g = obj3;
        this.f18712b = i10;
        this.f18713c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18711a;
        int i11 = this.f18712b;
        Object obj = this.f18713c;
        Object obj2 = this.f18715g;
        Object obj3 = this.f18714f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18712b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.k4) obj5, this.f18712b, (pf.c) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hg.d1(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.f18712b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.g6) obj2, (f60) obj));
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
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj5, tLObject, this.f18712b, (ey) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new b6(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (tw0) obj3, (c5.g) obj2, this.f18712b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                ko0 ko0Var = (ko0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.g3(tLObject, (Object) context2, (Object) g6Var, (Object) bArr, (Object) o2Var, (Object) ko0Var, 18));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new g21(o2Var, context2, g6Var, ko0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new c41(o2Var, i11, ko0Var, 13), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new g21(o2Var, context2, g6Var, ko0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public ii(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18711a = 3;
        this.f18712b = i10;
        this.d = zArr;
        this.e = file;
        this.f18714f = setcallrating;
        this.f18715g = arrayList;
        this.f18713c = context;
    }

    public ii(Context context, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, ko0 ko0Var, int i10) {
        this.f18711a = 6;
        this.d = context;
        this.e = g6Var;
        this.f18714f = bArr;
        this.f18715g = o2Var;
        this.f18713c = ko0Var;
        this.f18712b = i10;
    }

    public ii(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.g6 g6Var, f60 f60Var) {
        this.f18711a = 2;
        this.d = c2Var;
        this.e = context;
        this.f18712b = i10;
        this.f18714f = exportgroupcallinvite;
        this.f18715g = g6Var;
        this.f18713c = f60Var;
    }

    public ii(org.telegram.ui.k4 k4Var, int i10, pf.c cVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18711a = 1;
        this.d = k4Var;
        this.f18712b = i10;
        this.e = cVar;
        this.f18713c = str;
        this.f18714f = f0Var;
        this.f18715g = tL_messages_getWebPage;
    }

    public ii(LaunchActivity launchActivity, int i10, ey eyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f18711a = 4;
        this.d = launchActivity;
        this.f18712b = i10;
        this.e = eyVar;
        this.f18714f = o2Var;
        this.f18715g = user;
        this.f18713c = str;
    }
}
