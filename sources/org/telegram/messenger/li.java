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
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e31;
import org.telegram.ui.gu0;
import org.telegram.ui.q60;
import org.telegram.ui.qy;
import org.telegram.ui.xw0;
public final class li implements RequestDelegate {
    public final int f17753a;
    public final int f17754b;
    public final Object f17755c;
    public final Object d;
    public final Object e;
    public final Object f17756f;
    public final Object f17757g;

    public li(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f17753a = 3;
        this.f17754b = i10;
        this.d = zArr;
        this.e = file;
        this.f17756f = setcallrating;
        this.f17757g = arrayList;
        this.f17755c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17753a;
        int i11 = this.f17754b;
        Object obj = this.f17755c;
        Object obj2 = this.f17757g;
        Object obj3 = this.f17756f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f17754b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new kh.l2((org.telegram.ui.n4) obj5, this.f17754b, (ze.c) obj4, tLObject, (String) obj, (org.telegram.ui.i0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kh.l2(tLObject, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.f17754b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (q60) obj));
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
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new kh.l2((LaunchActivity) obj5, tLObject, this.f17754b, (qy) obj4, (org.telegram.ui.ActionBar.p2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new a6(tLObject, (org.telegram.ui.ActionBar.p2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (xw0) obj3, (p2.e) obj2, this.f17754b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                z80 z80Var = (z80) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new kh.e1(tLObject, (Object) context2, (Object) f6Var, (Object) bArr, (Object) p2Var, (Object) z80Var, 16));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new e31(p2Var, context2, f6Var, z80Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new gu0(p2Var, i11, z80Var, 5), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new e31(p2Var, context2, f6Var, z80Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public li(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, z80 z80Var, int i10) {
        this.f17753a = 6;
        this.d = context;
        this.e = f6Var;
        this.f17756f = bArr;
        this.f17757g = p2Var;
        this.f17755c = z80Var;
        this.f17754b = i10;
    }

    public li(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f17753a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17756f = obj2;
        this.f17757g = obj3;
        this.f17754b = i10;
        this.f17755c = obj4;
    }

    public li(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, q60 q60Var) {
        this.f17753a = 2;
        this.d = d2Var;
        this.e = context;
        this.f17754b = i10;
        this.f17756f = exportgroupcallinvite;
        this.f17757g = f6Var;
        this.f17755c = q60Var;
    }

    public li(org.telegram.ui.n4 n4Var, int i10, ze.c cVar, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f17753a = 1;
        this.d = n4Var;
        this.f17754b = i10;
        this.e = cVar;
        this.f17755c = str;
        this.f17756f = i0Var;
        this.f17757g = tL_messages_getWebPage;
    }

    public li(LaunchActivity launchActivity, int i10, qy qyVar, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        this.f17753a = 4;
        this.d = launchActivity;
        this.f17754b = i10;
        this.e = qyVar;
        this.f17756f = p2Var;
        this.f17757g = user;
        this.f17755c = str;
    }
}
