package h3;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import gh.m7;
import gh.u5;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.qn;
import org.telegram.ui.so;
import org.telegram.ui.st;
import org.telegram.ui.ud;
import org.telegram.ui.uo;
import org.telegram.ui.vo;
public final class p1 implements Runnable {
    public final int f9628a;
    public final Object f9629b;
    public final Object f9630c;
    public final Object d;
    public final boolean f9631e;
    public final Object f9632f;
    public final Object h;

    public p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i9) {
        this.f9628a = i9;
        this.f9632f = obj;
        this.h = obj2;
        this.f9629b = obj3;
        this.f9630c = obj4;
        this.d = obj5;
        this.f9631e = z10;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        int dp;
        int i11;
        int i12;
        int dp2;
        int i13;
        int i14;
        switch (this.f9628a) {
            case 0:
                Pair pair = (Pair) this.h;
                ((s1) ((g5.b) this.f9632f).f7112c).h.d(((Integer) pair.first).intValue(), (j4.d0) pair.second, (j4.q) this.f9629b, (j4.y) this.f9630c, (IOException) this.d, this.f9631e);
                return;
            case 1:
                j4.h0 h0Var = (j4.h0) this.f9632f;
                int i15 = h0Var.f13464a;
                j4.d0 d0Var = h0Var.f13465b;
                this.h.d(i15, d0Var, (j4.q) this.f9629b, (j4.y) this.f9630c, (IOException) this.d, this.f9631e);
                return;
            case 2:
                ((ContactsController) this.f9632f).lambda$mergePhonebookAndTelegramContacts$41(this.f9631e, (ArrayList) this.h, (HashMap) this.f9629b, (HashMap) this.f9630c, (ArrayList) this.d);
                return;
            case 3:
                ((FileLoadOperation) this.f9632f).lambda$onFinishLoadingFile$20((File) this.h, (File) this.f9629b, (File) this.f9630c, (File) this.d, this.f9631e);
                return;
            case 4:
                ((MessagesController) this.f9632f).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.h, (a0.h) this.f9629b, (a0.h) this.f9630c, this.f9631e, (LongSparseIntArray) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f9632f).lambda$requestUrlAuth$36((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.f9629b, (qn) this.f9630c, (String) this.d, this.f9631e);
                return;
            case 6:
                ((CameraController) this.f9632f).lambda$recordVideo$13(this.h, (CameraController.ICameraView) this.f9629b, (File) this.f9630c, this.f9631e, (Runnable) this.d);
                return;
            case 7:
                fe feVar = (fe) this.f9632f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f9629b;
                Activity activity = (Activity) this.f9630c;
                TLObject tLObject = (TLObject) this.d;
                boolean z10 = this.f9631e;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(feVar.f38238u0).sendRequest(new TL_account.getPassword(), new m7(feVar, twoStepVerificationActivity, z10, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.n0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        oc.b0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.n0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i16 = f6.f23108j5;
                    textView.setTextColor(f6.w0(null, i16, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i9 = 5;
                    } else {
                        i9 = 3;
                    }
                    textView.setGravity(i9 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, e6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i10 = AndroidUtilities.dp(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i10, dp3, dp, 0);
                    int w02 = f6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(f6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, e6.n(-1, -2));
                        linearLayout2.addView(imageView, e6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, e6.n(-2, -2));
                        linearLayout2.addView(textView2, e6.n(-1, -2));
                    }
                    LinearLayout f10 = org.telegram.messenger.l0.f(activity, 0);
                    linearLayout.addView(f10, e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i12 = AndroidUtilities.dp(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i12, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(f6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f10.addView(textView3, e6.n(-1, -2));
                        f10.addView(imageView2, e6.q(-2, -2, 5));
                    } else {
                        f10.addView(imageView2, e6.n(-2, -2));
                        f10.addView(textView3, e6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new ud(feVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(f6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        textView4.setGravity(i14 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f22702a);
                        return;
                    } else {
                        feVar.f38235s0.showDialog(alertDialog$Builder.f22702a);
                        return;
                    }
                }
                twoStepVerificationActivity.n0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    ve.e.s(feVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        feVar.c0(true);
                    }
                }
                feVar.e0();
                return;
            case 8:
                qn qnVar = (qn) this.f9632f;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.h;
                boolean[] zArr = (boolean[]) this.f9629b;
                MessageObject messageObject = (MessageObject) this.f9630c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.d;
                try {
                    c2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f9631e) {
                        qnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, qnVar.getParentActivity(), qnVar.f41848aa, false);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        qnVar.z6(messageObject);
                        return;
                    }
                }
                return;
            case 9:
                so soVar = (so) this.f9632f;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f9630c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                uo uoVar = soVar.f42737a;
                vo voVar = uoVar.W2;
                voVar.L.remove(((TLRPC.TL_channels_toggleUsername) this.h).username);
                boolean z11 = ((TLObject) this.f9629b) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f9631e;
                if (z11) {
                    uoVar.w1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new u5(soVar, tL_username, z12, 12));
                } else {
                    uoVar.w1(tL_username, z12, true);
                    voVar.U();
                }
                voVar.getMessagesController().updateUsernameActiveness(voVar.T, tL_username.username, tL_username.active);
                return;
            case 10:
                ((wy) this.f9632f).K((vg.b) this.h, (TLObject) this.f9629b, (TLRPC.StickerSet) this.f9630c, (TLRPC.Document) this.d, this.f9631e, true);
                return;
            default:
                st.P((st) this.f9632f, (TLObject) this.h, (kh.d) this.f9629b, this.f9631e, (HashSet) this.f9630c, (TLRPC.TL_error) this.d);
                return;
        }
    }

    public p1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i9) {
        this.f9628a = i9;
        this.f9632f = obj;
        this.h = obj2;
        this.f9629b = obj3;
        this.f9630c = obj4;
        this.f9631e = z10;
        this.d = obj5;
    }

    public p1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i9) {
        this.f9628a = i9;
        this.f9632f = obj;
        this.h = obj2;
        this.f9629b = obj3;
        this.f9631e = z10;
        this.f9630c = obj4;
        this.d = tLObject;
    }

    public p1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f9628a = 2;
        this.f9632f = contactsController;
        this.f9631e = z10;
        this.h = arrayList;
        this.f9629b = hashMap;
        this.f9630c = hashMap2;
        this.d = arrayList2;
    }
}
