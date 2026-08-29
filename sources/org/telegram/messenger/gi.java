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
import org.telegram.ui.Components.ii0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c60;
import org.telegram.ui.fy;
import org.telegram.ui.gw0;
import org.telegram.ui.l21;
import org.telegram.ui.ll0;
public final class gi implements RequestDelegate {
    public final int f20356a;
    public final int f20357b;
    public final Object f20358c;
    public final Object d;
    public final Object f20359e;
    public final Object f20360f;
    public final Object f20361g;

    public gi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f20356a = 3;
        this.f20357b = i10;
        this.d = zArr;
        this.f20359e = file;
        this.f20360f = setcallrating;
        this.f20361g = arrayList;
        this.f20358c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20356a;
        int i11 = this.f20357b;
        Object obj = this.f20358c;
        Object obj2 = this.f20361g;
        Object obj3 = this.f20360f;
        Object obj4 = this.f20359e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f20357b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ih.m2((org.telegram.ui.m4) obj5, this.f20357b, (ye.c) obj4, tLObject, (String) obj, (org.telegram.ui.i0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ih.m2(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.f20357b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.c6) obj2, (c60) obj));
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
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new ih.m2((LaunchActivity) obj5, tLObject, this.f20357b, (fy) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new z5(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (gw0) obj3, (p2.e) obj2, this.f20357b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                ii0 ii0Var = (ii0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ih.f1(tLObject, (Object) context2, (Object) c6Var, (Object) bArr, (Object) o2Var, (Object) ii0Var, 17));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new l21(o2Var, context2, c6Var, ii0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ll0(o2Var, i11, ii0Var, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new l21(o2Var, context2, c6Var, ii0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public gi(Context context, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, ii0 ii0Var, int i10) {
        this.f20356a = 6;
        this.d = context;
        this.f20359e = c6Var;
        this.f20360f = bArr;
        this.f20361g = o2Var;
        this.f20358c = ii0Var;
        this.f20357b = i10;
    }

    public gi(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f20356a = i11;
        this.d = obj;
        this.f20359e = tLObject;
        this.f20360f = obj2;
        this.f20361g = obj3;
        this.f20357b = i10;
        this.f20358c = obj4;
    }

    public gi(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, c60 c60Var) {
        this.f20356a = 2;
        this.d = c2Var;
        this.f20359e = context;
        this.f20357b = i10;
        this.f20360f = exportgroupcallinvite;
        this.f20361g = c6Var;
        this.f20358c = c60Var;
    }

    public gi(org.telegram.ui.m4 m4Var, int i10, ye.c cVar, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f20356a = 1;
        this.d = m4Var;
        this.f20357b = i10;
        this.f20359e = cVar;
        this.f20358c = str;
        this.f20360f = i0Var;
        this.f20361g = tL_messages_getWebPage;
    }

    public gi(LaunchActivity launchActivity, int i10, fy fyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f20356a = 4;
        this.d = launchActivity;
        this.f20357b = i10;
        this.f20359e = fyVar;
        this.f20360f = o2Var;
        this.f20361g = user;
        this.f20358c = str;
    }
}
