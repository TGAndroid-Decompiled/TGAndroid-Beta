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
import org.telegram.ui.Components.ny;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gm0;
import org.telegram.ui.nx0;
import org.telegram.ui.r31;
import org.telegram.ui.w60;
import org.telegram.ui.wy;
public final class ii implements RequestDelegate {
    public final int f16425a;
    public final int f16426b;
    public final Object f16427c;
    public final Object d;
    public final Object e;
    public final Object f16428f;
    public final Object f16429g;

    public ii(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16425a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f16428f = obj2;
        this.f16429g = obj3;
        this.f16426b = i10;
        this.f16427c = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16425a;
        int i11 = this.f16426b;
        Object obj = this.f16427c;
        Object obj2 = this.f16429g;
        Object obj3 = this.f16428f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f16426b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.e1((org.telegram.ui.h4) obj5, this.f16426b, (nf.e) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gg.e1(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.f16426b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.f6) obj2, (w60) obj));
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
                AndroidUtilities.runOnUIThread(new gg.e1((LaunchActivity) obj5, tLObject, this.f16426b, (wy) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new y5(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (nx0) obj3, (c5.f) obj2, this.f16426b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                ny nyVar = (ny) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ai.z8(tLObject, context2, f6Var, bArr, o2Var, nyVar, 11));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new r31(o2Var, context2, f6Var, nyVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new gm0(o2Var, i11, nyVar, 7), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new r31(o2Var, context2, f6Var, nyVar, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public ii(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f16425a = 3;
        this.f16426b = i10;
        this.d = zArr;
        this.e = file;
        this.f16428f = setcallrating;
        this.f16429g = arrayList;
        this.f16427c = context;
    }

    public ii(Context context, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, ny nyVar, int i10) {
        this.f16425a = 6;
        this.d = context;
        this.e = f6Var;
        this.f16428f = bArr;
        this.f16429g = o2Var;
        this.f16427c = nyVar;
        this.f16426b = i10;
    }

    public ii(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.f6 f6Var, w60 w60Var) {
        this.f16425a = 2;
        this.d = c2Var;
        this.e = context;
        this.f16426b = i10;
        this.f16428f = exportgroupcallinvite;
        this.f16429g = f6Var;
        this.f16427c = w60Var;
    }

    public ii(org.telegram.ui.h4 h4Var, int i10, nf.e eVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f16425a = 1;
        this.d = h4Var;
        this.f16426b = i10;
        this.e = eVar;
        this.f16427c = str;
        this.f16428f = f0Var;
        this.f16429g = tL_messages_getWebPage;
    }

    public ii(LaunchActivity launchActivity, int i10, wy wyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f16425a = 4;
        this.d = launchActivity;
        this.f16426b = i10;
        this.e = wyVar;
        this.f16428f = o2Var;
        this.f16429g = user;
        this.f16427c = str;
    }
}
