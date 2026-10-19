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
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b60;
import org.telegram.ui.c21;
import org.telegram.ui.cy;
import org.telegram.ui.pw0;
public final class gi implements RequestDelegate {
    public final int f18467a;
    public final int f18468b;
    public final Object f18469c;
    public final Object d;
    public final Object e;
    public final Object f18470f;
    public final Object f18471g;

    public gi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f18467a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f18470f = obj2;
        this.f18471g = obj3;
        this.f18468b = i10;
        this.f18469c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18467a;
        int i11 = this.f18468b;
        Object obj = this.f18469c;
        Object obj2 = this.f18471g;
        Object obj3 = this.f18470f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f18468b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.d1((org.telegram.ui.l4) obj5, this.f18468b, (pf.c) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hg.d1(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f18468b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.d6) obj2, (b60) obj));
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
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new hg.d1((LaunchActivity) obj5, tLObject, this.f18468b, (cy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new b6(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (pw0) obj3, (c5.g) obj2, this.f18468b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                go0 go0Var = (go0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.n3(tLObject, (Object) context2, (Object) d6Var, (Object) bArr, (Object) n2Var, (Object) go0Var, 18));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new c21(n2Var, context2, d6Var, go0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new x31(n2Var, i11, go0Var, 13), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new c21(n2Var, context2, d6Var, go0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public gi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f18467a = 3;
        this.f18468b = i10;
        this.d = zArr;
        this.e = file;
        this.f18470f = setcallrating;
        this.f18471g = arrayList;
        this.f18469c = context;
    }

    public gi(Context context, org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, go0 go0Var, int i10) {
        this.f18467a = 6;
        this.d = context;
        this.e = d6Var;
        this.f18470f = bArr;
        this.f18471g = n2Var;
        this.f18469c = go0Var;
        this.f18468b = i10;
    }

    public gi(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.d6 d6Var, b60 b60Var) {
        this.f18467a = 2;
        this.d = b2Var;
        this.e = context;
        this.f18468b = i10;
        this.f18470f = exportgroupcallinvite;
        this.f18471g = d6Var;
        this.f18469c = b60Var;
    }

    public gi(org.telegram.ui.l4 l4Var, int i10, pf.c cVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f18467a = 1;
        this.d = l4Var;
        this.f18468b = i10;
        this.e = cVar;
        this.f18469c = str;
        this.f18470f = g0Var;
        this.f18471g = tL_messages_getWebPage;
    }

    public gi(LaunchActivity launchActivity, int i10, cy cyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f18467a = 4;
        this.d = launchActivity;
        this.f18468b = i10;
        this.e = cyVar;
        this.f18470f = n2Var;
        this.f18471g = user;
        this.f18469c = str;
    }
}
