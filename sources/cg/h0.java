package cg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import gh.p5;
import hh.a6;
import hh.jb;
import hh.s5;
import hh.u7;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import lh.sb;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.am0;
import org.telegram.ui.bm0;
import org.telegram.ui.cg;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.mm0;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.v80;
import org.telegram.ui.ve;
import org.telegram.ui.vt;
import org.telegram.ui.xm0;

public final class h0 implements Runnable {

    public final int f2691a;

    public final Object f2692b;

    public final Object f2693c;
    public final Object d;

    public final Object f2694e;

    public final Object f2695f;
    public final Object h;

    public final Object f2696n;

    public h0(u7 u7Var, TLObject tLObject, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, Utilities.Callback callback, mc mcVar, TLRPC.TL_error tL_error) {
        this.f2691a = 3;
        this.h = u7Var;
        this.f2693c = tLObject;
        this.d = messageObject;
        this.f2694e = inputInvoice;
        this.f2695f = callback;
        this.f2696n = mcVar;
        this.f2692b = tL_error;
    }

    @Override
    public final void run() {
        do0 do0Var;
        do0 do0Var2;
        z7 z7VarM;
        int i10 = this.f2691a;
        int i11 = 9;
        int i12 = 7;
        boolean z10 = false;
        int i13 = 1;
        Object obj = this.f2696n;
        Object obj2 = this.f2695f;
        Object obj3 = this.f2694e;
        Object obj4 = this.d;
        Object obj5 = this.f2693c;
        Object obj6 = this.h;
        Object obj7 = this.f2692b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj7;
                v0 v0Var = (v0) obj6;
                TLObject tLObject = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                v0 v0Var2 = (v0) obj;
                if (tL_error != null) {
                    v0Var.run(tL_error);
                } else {
                    if (tLObject instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                        paymentForm.invoice.recurring = true;
                        messagesController.putUsers(paymentForm.users, false);
                        do0Var = new do0(paymentForm, tL_inputInvoicePremiumGiftCode, n2Var);
                    } else {
                        do0Var = tLObject instanceof TLRPC.PaymentReceipt ? new do0((TLRPC.PaymentReceipt) tLObject) : null;
                    }
                    if (do0Var != null) {
                        do0Var.V0 = new ag.h0(8, v0Var2, v0Var);
                        LaunchActivity.R().showAsSheet(do0Var, new org.telegram.ui.ActionBar.l2());
                    } else {
                        v0Var.run(null);
                    }
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                Utilities.Callback callback = (Utilities.Callback) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                MessagesController messagesController2 = (MessagesController) obj4;
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode2 = (TLRPC.TL_inputInvoicePremiumGiftCode) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                } else {
                    if (tLObject2 instanceof TLRPC.PaymentForm) {
                        TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                        paymentForm2.invoice.recurring = true;
                        messagesController2.putUsers(paymentForm2.users, false);
                        do0Var2 = new do0(paymentForm2, tL_inputInvoicePremiumGiftCode2, n2Var2);
                    } else {
                        do0Var2 = tLObject2 instanceof TLRPC.PaymentReceipt ? new do0((TLRPC.PaymentReceipt) tLObject2) : null;
                    }
                    if (do0Var2 != null) {
                        do0Var2.V0 = new ag.h0(i11, callback2, callback);
                        LaunchActivity.R().showAsSheet(do0Var2, new org.telegram.ui.ActionBar.l2());
                    } else {
                        callback.run(null);
                    }
                }
                break;
            case 2:
                ((boolean[]) obj6)[0] = true;
                ((u7) obj7).Z((String) obj5, (TLRPC.ChatInvite) obj4, new s5((boolean[]) obj3, (Utilities.Callback2) obj2, (Utilities.Callback) obj));
                break;
            case 3:
                u7 u7Var = (u7) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                mc mcVar = (mc) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    u7Var.a0(messageObject, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, callback3);
                } else {
                    callback3.run(Boolean.FALSE);
                    pa.r(R.string.UnknownErrorCode, new Object[]{tL_error3 != null ? tL_error3.text : "FAILED_GETTING_FORM"}, mcVar, R.raw.error, 36);
                }
                break;
            case 4:
                u7 u7Var2 = (u7) obj7;
                List list = (List) obj6;
                p5 p5Var = (p5) obj5;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj4;
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj3;
                n2.g gVar = (n2.g) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new a6(p5Var, i13));
                } else {
                    n2.l lVar = (n2.l) list.get(0);
                    n2.i iVarA = lVar.a();
                    if (iVarA == null) {
                        AndroidUtilities.runOnUIThread(new a6(p5Var, 2));
                    } else {
                        tL_inputStorePaymentStarsGift.currency = iVarA.f18152c;
                        tL_inputStorePaymentStarsGift.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGift;
                        ConnectionsManager.getInstance(u7Var2.f10151a).sendRequest(tL_payments_canPurchaseStore, new j0(lVar, gVar, (Utilities.Callback2) p5Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGift, list, 3));
                    }
                }
                break;
            case 5:
                jb jbVar = (jb) obj7;
                jh.n0[] n0VarArr = (jh.n0[]) obj6;
                int[] iArr = (int[]) obj5;
                RectF rectF = (RectF) obj4;
                View view = (View) obj3;
                ig.r0 r0Var = (ig.r0) obj2;
                ig.o0 o0Var = (ig.o0) obj;
                if (jbVar.d) {
                    jh.n0 n0VarD = n0VarArr[0];
                    if (n0VarD == null) {
                        n0VarD = jbVar.J.d(jbVar.K);
                        n0VarArr[0] = n0VarD;
                    }
                    if (n0VarD != null) {
                        n0VarD.setDrawStar(false);
                        n0VarD.getLocationInWindow(iArr);
                        TextView textView = n0VarD.A;
                        cq[] cqVarArr = n0VarD.C;
                        if (cqVarArr[0] != null && textView.getLayout() != null) {
                            float x8 = textView.getX() + textView.getPaddingLeft() + cqVarArr[0].translateX;
                            float y10 = textView.getY() + textView.getPaddingTop();
                            cq cqVar = cqVarArr[0];
                            float f10 = y10 + cqVar.translateY;
                            rectF.set(x8, f10, cqVar.drawable.getBounds().width() + x8, cqVarArr[0].drawable.getBounds().height() + f10);
                        }
                        rectF.offset(iArr[0], iArr[1]);
                    }
                } else {
                    view.getLocationInWindow(iArr);
                    rectF.set(AndroidUtilities.dp(4.0f) + iArr[0] + r0Var.f11420c + o0Var.f11404x, ((o0Var.B - AndroidUtilities.dp(22.0f)) / 2.0f) + iArr[1] + r0Var.d + o0Var.f11405y, AndroidUtilities.dp(26.0f) + iArr[0] + r0Var.f11420c + o0Var.f11404x, ((AndroidUtilities.dp(22.0f) + o0Var.B) / 2.0f) + iArr[1] + r0Var.d + o0Var.f11405y);
                }
                break;
            case 6:
                rn rnVar = (rn) obj7;
                MessageObject messageObject2 = (MessageObject) obj5;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj4;
                String string = (String) obj3;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) obj2;
                ol0 ol0Var = (ol0) obj;
                rnVar.getClass();
                ((b70) obj6).f26984n0 = true;
                if (!TextUtils.isEmpty(messageObject2.caption)) {
                    string = s1Var.getMessageObject().caption.toString();
                } else if (!TextUtils.isEmpty(messageObject2.messageText)) {
                    string = s1Var.getMessageObject().messageText.toString();
                }
                AndroidUtilities.createCalendarEvent(rnVar.getParentActivity(), ((long) tL_messageEntityFormattedDate.date) * 1000, string.length() > 21 ? string.substring(0, 21) + "..." : string, string, (tL_messageEntityFormattedDate.long_time || tL_messageEntityFormattedDate.short_time) ? false : true);
                ol0Var.dismiss();
                break;
            case 7:
                rn rnVar2 = (rn) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                TLObject tLObject4 = (TLObject) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                cg cgVar = (cg) obj3;
                String str = (String) obj2;
                we.d dVar = (we.d) obj;
                if (tL_error4 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                    z10 = true;
                }
                if (tLObject4 != null || (tL_error4 == null && (tLObject5 instanceof TLRPC.TL_boolTrue))) {
                    cgVar.run(tLObject4, Boolean.valueOf(z10));
                } else {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = str;
                    dVar.f49293b = new ve(rnVar2, rnVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new lh.r1(rnVar2, dVar, cgVar, z10, 2)), i12);
                    dVar.d();
                }
                break;
            case 8:
                TLObject tLObject6 = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj3;
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = (TLRPC.TL_inputGroupCallInviteMessage) obj2;
                MessageObject messageObject3 = (MessageObject) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj7;
                rn rnVar3 = ((dn) obj6).f37446a;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (tLObject6 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject6;
                    rnVar3.getMessagesController().putUsers(groupcall.users, false);
                    rnVar3.getMessagesController().putChats(groupcall.chats, false);
                    if (groupcall.participants.isEmpty()) {
                        rnVar3.showDialog(new vt(rnVar3.getParentActivity(), hashSet));
                    } else {
                        org.telegram.ui.Components.voip.e2.h(rnVar3.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar3).currentAccount, tL_inputGroupCallInviteMessage, messageObject3.messageOwner.action.video, groupcall.call, null);
                    }
                } else if (tL_error5 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error5.text)) {
                    rnVar3.showDialog(new vt(rnVar3.getParentActivity(), hashSet));
                } else if (tL_error5 != null) {
                    mc.a0(rnVar3).d0(tL_error5, false);
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj7;
                String str2 = (String) obj3;
                Bundle bundle = (Bundle) obj2;
                TLObject tLObject7 = (TLObject) obj5;
                TL_account.sendConfirmPhoneCode sendconfirmphonecode = (TL_account.sendConfirmPhoneCode) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (tL_error6 == null) {
                    ig0 ig0Var = new ig0();
                    ig0Var.C = str2;
                    ig0Var.D = bundle;
                    ig0Var.E = (TLRPC.TL_auth_sentCode) tLObject7;
                    ig0Var.B = 1;
                    launchActivity.p0(ig0Var);
                } else {
                    y4.f0(launchActivity.K, tL_error6, launchActivity.O().getLastFragment(), sendconfirmphonecode, new Object[0]);
                }
                break;
            case 10:
                rf0 rf0Var = (rf0) obj7;
                List<Purchase> list2 = (List) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = (TLRPC.TL_payments_canPurchaseStore) obj2;
                l11 l11Var = (l11) obj;
                if (((n2.g) obj6).f18147a == 0 && list2 != null && !list2.isEmpty()) {
                    for (Purchase purchase : list2) {
                        if (purchase.b().contains(str3)) {
                            TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                            tL_dataJSON.data = purchase.f2933a;
                            tL_inputStorePaymentAuthCode.restore = true;
                            tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                            rf0Var.v.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new e0(rf0Var, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore2, l11Var, 11), 74);
                            break;
                        }
                    }
                }
                l11Var.run();
                break;
            case 11:
                hg0 hg0Var = (hg0) obj6;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj7;
                TLObject tLObject8 = (TLObject) obj5;
                Bundle bundle2 = (Bundle) obj4;
                String str4 = (String) obj3;
                j9.a aVar = (j9.a) obj2;
                TLObject tLObject9 = (TLObject) obj;
                ig0 ig0Var2 = hg0Var.R;
                hg0Var.G = false;
                if (tL_error7 != null) {
                    String str5 = tL_error7.text;
                    if (str5 != null) {
                        if (str5.contains("SESSION_PASSWORD_NEEDED")) {
                            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount).sendRequest(new TL_account.getPassword(), new v80(i11, hg0Var, str4), 10);
                        } else if (tL_error7.text.contains("PHONE_NUMBER_INVALID")) {
                            ig0.m1(ig0Var2, str4, aVar, false);
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                        } else if (tL_error7.text.contains("PHONE_NUMBER_BANNED")) {
                            ig0.m1(ig0Var2, str4, aVar, true);
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            y4.f0(((org.telegram.ui.ActionBar.n2) ig0Var2).currentAccount, tL_error7, ig0Var2, tLObject9, (String) aVar.f12863b);
                        }
                    }
                } else if (tLObject8 instanceof TLRPC.TL_auth_sentCodeSuccess) {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject8).authorization;
                    if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ig0Var2.f39095l0 = tL_help_termsOfService;
                        }
                        ig0Var2.u1(5, true, bundle2, false);
                    } else {
                        ig0Var2.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                } else {
                    ig0Var2.g1(bundle2, (TLRPC.auth_SentCode) tLObject8, true);
                }
                if (!ig0Var2.f39094k0) {
                    ig0Var2.k1(false, true);
                }
                break;
            case 12:
                TLObject tLObject10 = (TLObject) obj5;
                String str6 = (String) obj4;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) obj3;
                bm0 bm0Var = (bm0) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj7;
                mm0 mm0Var = (mm0) obj;
                xm0 xm0Var = ((am0) obj6).f36576p.d;
                if (tLObject10 != null) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject10;
                    HashMap map = new HashMap();
                    map.put("email", str6);
                    map.put("pattern", sentemailcode.email_pattern);
                    xm0 xm0Var2 = new xm0(6, xm0Var.f44535y, xm0Var.F, tL_secureRequiredType, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, map, (HashMap) null);
                    ((org.telegram.ui.ActionBar.n2) xm0Var2).currentAccount = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                    xm0Var2.P0 = sentemailcode.length;
                    xm0Var2.f44481a1 = xm0Var.f44481a1;
                    xm0Var2.Y0 = xm0Var.Y0;
                    xm0Var2.f44534x1 = bm0Var;
                    xm0Var.presentFragment(xm0Var2, true);
                } else {
                    xm0Var.M1(LocaleController.getString(R.string.PassportEmail), tL_error8.text);
                    if (mm0Var != null) {
                        mm0Var.S(tL_error8.text, str6);
                    }
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj7;
                int[] iArr2 = (int[]) obj6;
                File file = (File) obj5;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                String str9 = (String) obj;
                if (iArr2[4] > 0) {
                    int i14 = iArr2[1];
                    int i15 = iArr2[2];
                    int photoSize = i14 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i14;
                    int photoSize2 = i15 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i15;
                    File fileW = z7.w(UserConfig.selectedAccount, "jpg");
                    x5 x5Var = new x5(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null, 0, true);
                    Bitmap bitmapP = x5Var.p();
                    x5Var.u();
                    if (bitmapP != null) {
                        try {
                            try {
                                bitmapP.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(fileW));
                            } catch (Exception e9) {
                                e = e9;
                                FileLog.e(e);
                                fileW = null;
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                        break;
                    }
                    z7VarM = z7.o(file, fileW == null ? null : fileW.getAbsolutePath(), iArr2[4]);
                    z7VarM.f17217k0 = i14;
                    z7VarM.f17219l0 = i15;
                    z7VarM.A();
                } else {
                    z7VarM = z7.m(((Integer) AndroidUtilities.getImageOrientation(file).first).intValue(), file);
                }
                if (z7VarM.f17217k0 <= 0 || z7VarM.f17219l0 <= 0) {
                    b2Var.c(500L);
                } else {
                    if (str7 != null) {
                        z7VarM.C0 = str7;
                    }
                    if (!TextUtils.isEmpty(str8) && UserConfig.getInstance(z0Var.I).isPremium()) {
                        if (z7VarM.T0 == null) {
                            z7VarM.T0 = new ArrayList();
                        }
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        mediaEntity.type = (byte) 7;
                        mediaEntity.subType = (byte) -1;
                        mediaEntity.color = -1;
                        zf.m0 m0Var = new zf.m0();
                        mediaEntity.linkSettings = m0Var;
                        m0Var.f50570c = str8;
                        if (str9 != null) {
                            m0Var.f50568a |= 2;
                            m0Var.f50569b = str9;
                        }
                        z7VarM.T0.add(mediaEntity);
                    }
                    sb.E(z0Var.S, UserConfig.selectedAccount).U(null, z7VarM);
                    b2Var.c(500L);
                }
                break;
        }
    }

    public h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f2691a = i10;
        this.f2692b = obj;
        this.h = obj2;
        this.f2693c = obj3;
        this.d = obj4;
        this.f2694e = obj5;
        this.f2695f = obj6;
        this.f2696n = obj7;
    }

    public h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.TL_error tL_error, TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2691a = i10;
        this.h = notificationCenterDelegate;
        this.f2692b = tL_error;
        this.f2693c = tLObject;
        this.d = obj;
        this.f2694e = obj2;
        this.f2695f = obj3;
        this.f2696n = obj4;
    }

    public h0(dn dnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f2691a = 8;
        this.h = dnVar;
        this.d = b2Var;
        this.f2693c = tLObject;
        this.f2694e = hashSet;
        this.f2695f = tL_inputGroupCallInviteMessage;
        this.f2696n = messageObject;
        this.f2692b = tL_error;
    }

    public h0(LaunchActivity launchActivity, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.f2691a = 9;
        this.h = launchActivity;
        this.d = b2Var;
        this.f2692b = tL_error;
        this.f2694e = str;
        this.f2695f = bundle;
        this.f2693c = tLObject;
        this.f2696n = sendconfirmphonecode;
    }

    public h0(am0 am0Var, TLObject tLObject, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, bm0 bm0Var, TLRPC.TL_error tL_error, mm0 mm0Var) {
        this.f2691a = 12;
        this.h = am0Var;
        this.f2693c = tLObject;
        this.d = str;
        this.f2694e = tL_secureRequiredType;
        this.f2695f = bm0Var;
        this.f2692b = tL_error;
        this.f2696n = mm0Var;
    }
}
