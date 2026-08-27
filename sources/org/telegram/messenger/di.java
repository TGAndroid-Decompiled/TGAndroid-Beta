package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e60;
import org.telegram.ui.gy;
import org.telegram.ui.hw0;
import org.telegram.ui.j21;
import org.telegram.ui.ol0;

public final class di implements RequestDelegate {

    public final int f20061a;

    public final int f20062b;

    public final Object f20063c;
    public final Object d;

    public final Object f20064e;

    public final Object f20065f;

    public final Object f20066g;

    public di(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f20061a = 3;
        this.f20062b = i10;
        this.d = zArr;
        this.f20064e = file;
        this.f20065f = setcallrating;
        this.f20066g = arrayList;
        this.f20063c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20061a;
        int i11 = this.f20062b;
        Object obj = this.f20063c;
        Object obj2 = this.f20066g;
        Object obj3 = this.f20065f;
        Object obj4 = this.f20064e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f20062b, (String) obj, tLObject, tL_error);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gh.p2((org.telegram.ui.m4) obj5, this.f20062b, (we.d) obj4, tLObject, (String) obj, (org.telegram.ui.i0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gh.p2(tLObject, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj4, this.f20062b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.c6) obj2, (e60) obj));
                break;
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
                    break;
                }
                break;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new gh.p2((LaunchActivity) obj5, tLObject, this.f20062b, (gy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, str));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new z5(tLObject, (org.telegram.ui.ActionBar.n2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (hw0) obj3, (n2.e) obj2, this.f20062b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                lg0 lg0Var = (lg0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new gh.i1(tLObject, (Object) context2, (Object) c6Var, (Object) bArr, (Object) n2Var, (Object) lg0Var, 17));
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new j21(n2Var, context2, c6Var, lg0Var, 0), 200L);
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ol0(n2Var, i11, lg0Var, 7), 200L);
                    }
                    break;
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new j21(n2Var, context2, c6Var, lg0Var, 1), 200L);
                    break;
                }
                break;
        }
    }

    public di(Context context, org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, lg0 lg0Var, int i10) {
        this.f20061a = 6;
        this.d = context;
        this.f20064e = c6Var;
        this.f20065f = bArr;
        this.f20066g = n2Var;
        this.f20063c = lg0Var;
        this.f20062b = i10;
    }

    public di(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f20061a = i11;
        this.d = obj;
        this.f20064e = tLObject;
        this.f20065f = obj2;
        this.f20066g = obj3;
        this.f20062b = i10;
        this.f20063c = obj4;
    }

    public di(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.c6 c6Var, e60 e60Var) {
        this.f20061a = 2;
        this.d = b2Var;
        this.f20064e = context;
        this.f20062b = i10;
        this.f20065f = exportgroupcallinvite;
        this.f20066g = c6Var;
        this.f20063c = e60Var;
    }

    public di(org.telegram.ui.m4 m4Var, int i10, we.d dVar, String str, org.telegram.ui.i0 i0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f20061a = 1;
        this.d = m4Var;
        this.f20062b = i10;
        this.f20064e = dVar;
        this.f20063c = str;
        this.f20065f = i0Var;
        this.f20066g = tL_messages_getWebPage;
    }

    public di(LaunchActivity launchActivity, int i10, gy gyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.f20061a = 4;
        this.d = launchActivity;
        this.f20062b = i10;
        this.f20064e = gyVar;
        this.f20065f = n2Var;
        this.f20066g = user;
        this.f20063c = str;
    }
}
