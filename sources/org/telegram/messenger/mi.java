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
import org.telegram.ui.Components.u90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fx;
import org.telegram.ui.j60;
import org.telegram.ui.l21;
import org.telegram.ui.zw0;
public final class mi implements RequestDelegate {
    public final int f20696a;
    public final int f20697b;
    public final Object f20698c;
    public final Object d;
    public final Object e;
    public final Object f20699f;
    public final Object f20700g;

    public mi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f20696a = 3;
        this.f20697b = i10;
        this.d = zArr;
        this.e = file;
        this.f20699f = setcallrating;
        this.f20700g = arrayList;
        this.f20698c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20696a;
        int i11 = this.f20697b;
        Object obj = this.f20698c;
        Object obj2 = this.f20700g;
        Object obj3 = this.f20699f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$57((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f20697b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ig.d1((org.telegram.ui.j4) obj5, this.f20697b, (qf.c) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ig.d1(tLObject, (org.telegram.ui.ActionBar.e2) obj5, (Context) obj4, this.f20697b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.u6) obj2, (j60) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i11).lambda$processUpdates$379((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    SendMessagesHelper.prepareSendingDocument(AccountInstance.getInstance(UserConfig.selectedAccount), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, null, true, 0, null, null, false);
                    Toast.makeText(context, LocaleController.getString(R.string.CallReportSent), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new ig.d1((LaunchActivity) obj5, tLObject, this.f20697b, (ey) obj4, (org.telegram.ui.ActionBar.r2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new e6(tLObject, (org.telegram.ui.ActionBar.r2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (zw0) obj3, (d5.g) obj2, this.f20697b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                u90 u90Var = (u90) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new bi.c3(tLObject, (Object) context2, (Object) u6Var, (Object) bArr, (Object) r2Var, (Object) u90Var, 18));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new l21(r2Var, context2, u6Var, u90Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new fx(r2Var, i11, u90Var, 12), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new l21(r2Var, context2, u6Var, u90Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public mi(Context context, org.telegram.ui.ActionBar.u6 u6Var, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, u90 u90Var, int i10) {
        this.f20696a = 6;
        this.d = context;
        this.e = u6Var;
        this.f20699f = bArr;
        this.f20700g = r2Var;
        this.f20698c = u90Var;
        this.f20697b = i10;
    }

    public mi(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f20696a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f20699f = obj2;
        this.f20700g = obj3;
        this.f20697b = i10;
        this.f20698c = obj4;
    }

    public mi(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.u6 u6Var, j60 j60Var) {
        this.f20696a = 2;
        this.d = e2Var;
        this.e = context;
        this.f20697b = i10;
        this.f20699f = exportgroupcallinvite;
        this.f20700g = u6Var;
        this.f20698c = j60Var;
    }

    public mi(org.telegram.ui.j4 j4Var, int i10, qf.c cVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f20696a = 1;
        this.d = j4Var;
        this.f20697b = i10;
        this.e = cVar;
        this.f20698c = str;
        this.f20699f = f0Var;
        this.f20700g = tL_messages_getWebPage;
    }

    public mi(LaunchActivity launchActivity, int i10, ey eyVar, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, String str) {
        this.f20696a = 4;
        this.d = launchActivity;
        this.f20697b = i10;
        this.e = eyVar;
        this.f20699f = r2Var;
        this.f20700g = user;
        this.f20698c = str;
    }
}
