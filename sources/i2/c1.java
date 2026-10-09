package i2;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.u1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.ad;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bu;
import org.telegram.ui.fp;
import org.telegram.ui.hp;
import org.telegram.ui.ip;
import org.telegram.ui.ke;
import org.telegram.ui.xd;
import org.telegram.ui.zn;
import w7.x5;
public final class c1 implements Runnable {
    public final int f11621a;
    public final boolean f11622b;
    public final Object f11623c;
    public final Object d;
    public final Object f11624e;
    public final Object f11625f;
    public final Object h;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f11621a = i10;
        this.f11623c = obj;
        this.d = obj2;
        this.f11624e = obj3;
        this.f11625f = obj4;
        this.h = obj5;
        this.f11622b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        switch (this.f11621a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((d1) this.f11623c).f11631b.h.f(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.f11624e, (u2.b0) this.f11625f, (IOException) this.h, this.f11622b);
                return;
            case 1:
                ((ContactsController) this.f11623c).lambda$mergePhonebookAndTelegramContacts$41(this.f11622b, (ArrayList) this.d, (HashMap) this.f11624e, (HashMap) this.f11625f, (ArrayList) this.h);
                return;
            case 2:
                ((FileLoadOperation) this.f11623c).lambda$onFinishLoadingFile$21((File) this.d, (File) this.f11624e, (File) this.f11625f, (File) this.h, this.f11622b);
                return;
            case 3:
                ((MessagesController) this.f11623c).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) this.d, (a0.i) this.f11624e, (a0.i) this.f11625f, this.f11622b, (LongSparseIntArray) this.h);
                return;
            case 4:
                ((SendMessagesHelper) this.f11623c).lambda$requestUrlAuth$39((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.f11624e, (zn) this.f11625f, (String) this.h, this.f11622b);
                return;
            case 5:
                ((CameraController) this.f11623c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.f11624e, (File) this.f11625f, this.f11622b, (Runnable) this.h);
                return;
            case 6:
                ke keVar = (ke) this.f11623c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f11624e;
                Activity activity = (Activity) this.f11625f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.f11622b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.f39255y0).sendRequest(new TL_account.getPassword(), new u1(keVar, twoStepVerificationActivity, z10, 2), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        ad.d0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = i6.f20905j5;
                    textView.setTextColor(i6.x0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, x5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i11, dp3, dp, 0);
                    int x02 = i6.x0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(i6.x0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, x5.n(-1, -2));
                        linearLayout2.addView(imageView, x5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, x5.n(-2, -2));
                        linearLayout2.addView(textView2, x5.n(-1, -2));
                    }
                    LinearLayout e7 = org.telegram.messenger.q.e(activity, 0);
                    linearLayout.addView(e7, x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i13 = AndroidUtilities.dp(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i13, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(i6.x0(null, i17, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(i6.x0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        e7.addView(textView3, x5.n(-1, -2));
                        i15 = 5;
                        e7.addView(imageView2, x5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        e7.addView(imageView2, x5.n(-2, -2));
                        e7.addView(textView3, x5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new xd(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(i6.x0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f20374a);
                        return;
                    } else {
                        keVar.f39252w0.showDialog(alertDialog$Builder.f20374a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    of.f.s(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        keVar.c0(true);
                    }
                }
                keVar.e0();
                return;
            case 7:
                zn.h1((zn) this.f11623c, (org.telegram.ui.Cells.u1) this.d, this.f11622b, (String) this.f11624e, (TLRPC.User[]) this.f11625f, (CharacterStyle) this.h);
                return;
            case 8:
                zn znVar = (zn) this.f11623c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr = (boolean[]) this.f11624e;
                MessageObject messageObject = (MessageObject) this.f11625f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f11622b) {
                        znVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, znVar.getParentActivity(), znVar.f44761ea, false);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        znVar.C6(messageObject);
                        return;
                    }
                }
                return;
            case 9:
                fp fpVar = (fp) this.f11623c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f11625f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                hp hpVar = fpVar.f37653a;
                ip ipVar = hpVar.Y2;
                ipVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                boolean z11 = ((TLObject) this.f11624e) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f11622b;
                if (z11) {
                    hpVar.x1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new ci.x0(fpVar, tL_username, z12, 15));
                } else {
                    hpVar.x1(tL_username, z12, true);
                    ipVar.V();
                }
                ipVar.getMessagesController().updateUsernameActiveness(ipVar.X, tL_username.username, tL_username.active);
                return;
            case 10:
                ((a00) this.f11623c).J((nh.b) this.d, (TLObject) this.f11624e, (TLRPC.StickerSet) this.f11625f, (TLRPC.Document) this.h, this.f11622b, true);
                return;
            default:
                bu.R((bu) this.f11623c, (TLObject) this.d, (ci.d) this.f11624e, this.f11622b, (HashSet) this.f11625f, (TLRPC.TL_error) this.h);
                return;
        }
    }

    public c1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f11621a = i10;
        this.f11623c = obj;
        this.d = obj2;
        this.f11624e = obj3;
        this.f11625f = obj4;
        this.f11622b = z10;
        this.h = obj5;
    }

    public c1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f11621a = i10;
        this.f11623c = obj;
        this.d = obj2;
        this.f11624e = obj3;
        this.f11622b = z10;
        this.f11625f = obj4;
        this.h = tLObject;
    }

    public c1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f11621a = 1;
        this.f11623c = contactsController;
        this.f11622b = z10;
        this.d = arrayList;
        this.f11624e = hashMap;
        this.f11625f = hashMap2;
        this.h = arrayList2;
    }

    public c1(zn znVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f11621a = 7;
        this.f11623c = znVar;
        this.d = u1Var;
        this.f11622b = z10;
        this.f11624e = str;
        this.f11625f = userArr;
        this.h = characterStyle;
    }
}
