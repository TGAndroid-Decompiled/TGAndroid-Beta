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
import org.telegram.ui.Components.wn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx0;
import org.telegram.ui.h31;
import org.telegram.ui.p60;
import org.telegram.ui.qy;
import org.telegram.ui.wl0;
public final class hi implements RequestDelegate {
    public final int f16559a;
    public final int f16560b;
    public final Object f16561c;
    public final Object d;
    public final Object e;
    public final Object f16562f;
    public final Object f16563g;

    public hi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16559a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f16562f = obj2;
        this.f16563g = obj3;
        this.f16560b = i10;
        this.f16561c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16559a;
        int i11 = this.f16560b;
        Object obj = this.f16561c;
        Object obj2 = this.f16563g;
        Object obj3 = this.f16562f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f16560b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.i4) obj5, this.f16560b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.a2) obj5, (Context) obj4, this.f16560b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.d6) obj2, (p60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.f16560b, (qy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.m2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (cx0) obj3, (c5.f) obj2, this.f16560b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                wn0 wn0Var = (wn0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, d6Var, bArr, m2Var, wn0Var, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new h31(m2Var, context2, d6Var, wn0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new wl0(m2Var, i11, wn0Var, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new h31(m2Var, context2, d6Var, wn0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public hi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f16559a = 3;
        this.f16560b = i10;
        this.d = zArr;
        this.e = file;
        this.f16562f = setcallrating;
        this.f16563g = arrayList;
        this.f16561c = context;
    }

    public hi(Context context, org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, wn0 wn0Var, int i10) {
        this.f16559a = 6;
        this.d = context;
        this.e = d6Var;
        this.f16562f = bArr;
        this.f16563g = m2Var;
        this.f16561c = wn0Var;
        this.f16560b = i10;
    }

    public hi(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.d6 d6Var, p60 p60Var) {
        this.f16559a = 2;
        this.d = a2Var;
        this.e = context;
        this.f16560b = i10;
        this.f16562f = exportgroupcallinvite;
        this.f16563g = d6Var;
        this.f16561c = p60Var;
    }

    public hi(org.telegram.ui.i4 i4Var, int i10, nf.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16559a = 1;
        this.d = i4Var;
        this.f16560b = i10;
        this.e = eVar;
        this.f16561c = str;
        this.f16562f = g0Var;
        this.f16563g = tL_messages_getWebPage;
    }

    public hi(LaunchActivity launchActivity, int i10, qy qyVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.f16559a = 4;
        this.d = launchActivity;
        this.f16560b = i10;
        this.e = qyVar;
        this.f16562f = m2Var;
        this.f16563g = user;
        this.f16561c = str;
    }
}
