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
import org.telegram.ui.Components.jy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fx0;
import org.telegram.ui.j31;
import org.telegram.ui.s60;
import org.telegram.ui.ty;
import org.telegram.ui.zl0;
public final class hi implements RequestDelegate {
    public final int f16571a;
    public final int f16572b;
    public final Object f16573c;
    public final Object d;
    public final Object e;
    public final Object f16574f;
    public final Object f16575g;

    public hi(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16571a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f16574f = obj2;
        this.f16575g = obj3;
        this.f16572b = i10;
        this.f16573c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16571a;
        int i11 = this.f16572b;
        Object obj = this.f16573c;
        Object obj2 = this.f16575g;
        Object obj3 = this.f16574f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f16572b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.j4) obj5, this.f16572b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.h0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.f16572b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.e6) obj2, (s60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.f16572b, (ty) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (fx0) obj3, (c5.f) obj2, this.f16572b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                jy jyVar = (jy) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, e6Var, bArr, o2Var, jyVar, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new j31(o2Var, context2, e6Var, jyVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new zl0(o2Var, i11, jyVar, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new j31(o2Var, context2, e6Var, jyVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public hi(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f16571a = 3;
        this.f16572b = i10;
        this.d = zArr;
        this.e = file;
        this.f16574f = setcallrating;
        this.f16575g = arrayList;
        this.f16573c = context;
    }

    public hi(Context context, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, jy jyVar, int i10) {
        this.f16571a = 6;
        this.d = context;
        this.e = e6Var;
        this.f16574f = bArr;
        this.f16575g = o2Var;
        this.f16573c = jyVar;
        this.f16572b = i10;
    }

    public hi(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, s60 s60Var) {
        this.f16571a = 2;
        this.d = c2Var;
        this.e = context;
        this.f16572b = i10;
        this.f16574f = exportgroupcallinvite;
        this.f16575g = e6Var;
        this.f16573c = s60Var;
    }

    public hi(org.telegram.ui.j4 j4Var, int i10, nf.e eVar, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16571a = 1;
        this.d = j4Var;
        this.f16572b = i10;
        this.e = eVar;
        this.f16573c = str;
        this.f16574f = h0Var;
        this.f16575g = tL_messages_getWebPage;
    }

    public hi(LaunchActivity launchActivity, int i10, ty tyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f16571a = 4;
        this.d = launchActivity;
        this.f16572b = i10;
        this.e = tyVar;
        this.f16574f = o2Var;
        this.f16575g = user;
        this.f16573c = str;
    }
}
