package j3;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import k7.c6;
import mh.k7;
import mh.r5;
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
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap;
import org.telegram.ui.bu;
import org.telegram.ui.dp;
import org.telegram.ui.ep;
import org.telegram.ui.ke;
import org.telegram.ui.xn;
import org.telegram.ui.zd;
public final class n1 implements Runnable {
    public final int f9329a;
    public final Object f9330b;
    public final Object f9331c;
    public final Object d;
    public final boolean f9332e;
    public final Object f9333f;
    public final Object h;

    public n1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z4, int i10) {
        this.f9329a = i10;
        this.f9333f = obj;
        this.h = obj2;
        this.f9330b = obj3;
        this.f9331c = obj4;
        this.d = obj5;
        this.f9332e = z4;
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
        switch (this.f9329a) {
            case 0:
                Pair pair = (Pair) this.h;
                ((q1) ((f7.b) this.f9333f).f6121c).h.g(((Integer) pair.first).intValue(), (o4.v) pair.second, (o4.j) this.f9330b, (o4.r) this.f9331c, (IOException) this.d, this.f9332e);
                return;
            case 1:
                b4.e0 e0Var = (b4.e0) this.f9333f;
                int i16 = e0Var.f1474b;
                o4.v vVar = (o4.v) e0Var.f1475c;
                this.h.g(i16, vVar, (o4.j) this.f9330b, (o4.r) this.f9331c, (IOException) this.d, this.f9332e);
                return;
            case 2:
                ((ContactsController) this.f9333f).lambda$mergePhonebookAndTelegramContacts$41(this.f9332e, (ArrayList) this.h, (HashMap) this.f9330b, (HashMap) this.f9331c, (ArrayList) this.d);
                return;
            case 3:
                ((FileLoadOperation) this.f9333f).lambda$onFinishLoadingFile$20((File) this.h, (File) this.f9330b, (File) this.f9331c, (File) this.d, this.f9332e);
                return;
            case 4:
                ((MessagesController) this.f9333f).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.h, (a0.h) this.f9330b, (a0.h) this.f9331c, this.f9332e, (LongSparseIntArray) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f9333f).lambda$requestUrlAuth$36((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.f9330b, (xn) this.f9331c, (String) this.d, this.f9332e);
                return;
            case 6:
                ((CameraController) this.f9333f).lambda$recordVideo$13(this.h, (CameraController.ICameraView) this.f9330b, (File) this.f9331c, this.f9332e, (Runnable) this.d);
                return;
            case 7:
                ke keVar = (ke) this.f9333f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f9330b;
                Activity activity = (Activity) this.f9331c;
                TLObject tLObject = (TLObject) this.d;
                boolean z4 = this.f9332e;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.f38282v0).sendRequest(new TL_account.getPassword(), new k7(keVar, twoStepVerificationActivity, z4, 1), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        qc.b0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = k6.f21768j5;
                    textView.setTextColor(k6.w0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, c6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    int w02 = k6.w0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(k6.w0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    y3.q(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, c6.n(-1, -2));
                        linearLayout2.addView(imageView, c6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c6.n(-2, -2));
                        linearLayout2.addView(textView2, c6.n(-1, -2));
                    }
                    LinearLayout h = l.d.h(activity, 0);
                    linearLayout.addView(h, c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i17, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(k6.w0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    y3.q(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        h.addView(textView3, c6.n(-1, -2));
                        h.addView(imageView2, c6.q(-2, -2, 5));
                    } else {
                        h.addView(imageView2, c6.n(-2, -2));
                        h.addView(textView3, c6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new zd(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(k6.w0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f21168a);
                        return;
                    } else {
                        keVar.f38279t0.showDialog(alertDialog$Builder.f21168a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    af.g.s(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z4) {
                        keVar.c0(true);
                    }
                }
                keVar.e0();
                return;
            case 8:
                xn xnVar = (xn) this.f9333f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                boolean[] zArr = (boolean[]) this.f9330b;
                MessageObject messageObject = (MessageObject) this.f9331c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.d;
                try {
                    d2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f9332e) {
                        xnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, xnVar.getParentActivity(), xnVar.f43114ba, false);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        xnVar.z6(messageObject);
                        return;
                    }
                }
                return;
            case 9:
                ap apVar = (ap) this.f9333f;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f9331c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                dp dpVar = apVar.f35232a;
                ep epVar = dpVar.X2;
                epVar.M.remove(((TLRPC.TL_channels_toggleUsername) this.h).username);
                boolean z10 = ((TLObject) this.f9330b) instanceof TLRPC.TL_boolTrue;
                boolean z11 = this.f9332e;
                if (z10) {
                    dpVar.v1(tL_username, !z11, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new r5(apVar, tL_username, z11, 10));
                } else {
                    dpVar.v1(tL_username, z11, true);
                    epVar.V();
                }
                epVar.getMessagesController().updateUsernameActiveness(epVar.U, tL_username.username, tL_username.active);
                return;
            case 10:
                ((mz) this.f9333f).K((bh.c) this.h, (TLObject) this.f9330b, (TLRPC.StickerSet) this.f9331c, (TLRPC.Document) this.d, this.f9332e, true);
                return;
            default:
                bu.Q((bu) this.f9333f, (TLObject) this.h, (qh.d) this.f9330b, this.f9332e, (HashSet) this.f9331c, (TLRPC.TL_error) this.d);
                return;
        }
    }

    public n1(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, Object obj5, int i10) {
        this.f9329a = i10;
        this.f9333f = obj;
        this.h = obj2;
        this.f9330b = obj3;
        this.f9331c = obj4;
        this.f9332e = z4;
        this.d = obj5;
    }

    public n1(Object obj, Object obj2, Object obj3, boolean z4, Object obj4, TLObject tLObject, int i10) {
        this.f9329a = i10;
        this.f9333f = obj;
        this.h = obj2;
        this.f9330b = obj3;
        this.f9332e = z4;
        this.f9331c = obj4;
        this.d = tLObject;
    }

    public n1(ContactsController contactsController, boolean z4, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f9329a = 2;
        this.f9333f = contactsController;
        this.f9332e = z4;
        this.h = arrayList;
        this.f9330b = hashMap;
        this.f9331c = hashMap2;
        this.d = arrayList2;
    }
}
