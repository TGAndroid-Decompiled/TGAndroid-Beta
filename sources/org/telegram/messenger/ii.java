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
public final class ii implements RequestDelegate {
    public final int f18007a;
    public final int f18008b;
    public final Object f18009c;
    public final Object d;
    public final Object f18010e;
    public final Object f18011f;
    public final Object f18012g;

    public ii(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18007a = i11;
        this.d = obj;
        this.f18010e = tLObject;
        this.f18011f = obj2;
        this.f18012g = obj3;
        this.f18008b = i10;
        this.f18009c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18007a;
        int i11 = this.f18008b;
        Object obj = this.f18009c;
        Object obj2 = this.f18012g;
        Object obj3 = this.f18011f;
        Object obj4 = this.f18010e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18008b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.e1((org.telegram.ui.i4) obj5, this.f18008b, (of.e) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hg.e1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f18008b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (v60) obj));
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
                AndroidUtilities.runOnUIThread(new hg.e1((LaunchActivity) obj5, tLObject, this.f18008b, (uy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (lx0) obj3, (c5.f) obj2, this.f18008b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
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

    public ii(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18007a = 3;
        this.f18008b = i10;
        this.d = zArr;
        this.f18010e = file;
        this.f18011f = setcallrating;
        this.f18012g = arrayList;
        this.f18009c = context;
    }

    public ii(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, jn0 jn0Var, int i10) {
        this.f18007a = 6;
        this.d = context;
        this.f18010e = f6Var;
        this.f18011f = bArr;
        this.f18012g = n2Var;
        this.f18009c = jn0Var;
        this.f18008b = i10;
    }

    public ii(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, v60 v60Var) {
        this.f18007a = 2;
        this.d = b2Var;
        this.f18010e = context;
        this.f18008b = i10;
        this.f18011f = exportgroupcallinvite;
        this.f18012g = f6Var;
        this.f18009c = v60Var;
    }

    public ii(org.telegram.ui.i4 i4Var, int i10, of.e eVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18007a = 1;
        this.d = i4Var;
        this.f18008b = i10;
        this.f18010e = eVar;
        this.f18009c = str;
        this.f18011f = f0Var;
        this.f18012g = tL_messages_getWebPage;
    }

    public ii(LaunchActivity launchActivity, int i10, uy uyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f18007a = 4;
        this.d = launchActivity;
        this.f18008b = i10;
        this.f18010e = uyVar;
        this.f18011f = n2Var;
        this.f18012g = user;
        this.f18009c = str;
    }
}
