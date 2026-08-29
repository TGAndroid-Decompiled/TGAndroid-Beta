package j3;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.j7;
import jh.r5;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.tc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.de;
import org.telegram.ui.sd;
import org.telegram.ui.tn;
import org.telegram.ui.tt;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;
public final class p1 implements Runnable {
    public final int f10665a;
    public final Object f10666b;
    public final Object f10667c;
    public final Object d;
    public final boolean f10668e;
    public final Object f10669f;
    public final Object h;

    public p1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f10665a = i10;
        this.f10669f = obj;
        this.h = obj2;
        this.f10666b = obj3;
        this.f10667c = obj4;
        this.d = obj5;
        this.f10668e = z10;
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
        switch (this.f10665a) {
            case 0:
                Pair pair = (Pair) this.h;
                ((s1) ((g9.l) this.f10669f).f7169c).h.f(((Integer) pair.first).intValue(), (l4.c0) pair.second, (l4.p) this.f10666b, (l4.x) this.f10667c, (IOException) this.d, this.f10668e);
                return;
            case 1:
                l4.g0 g0Var = (l4.g0) this.f10669f;
                int i16 = g0Var.f14319a;
                l4.c0 c0Var = g0Var.f14320b;
                this.h.f(i16, c0Var, (l4.p) this.f10666b, (l4.x) this.f10667c, (IOException) this.d, this.f10668e);
                return;
            case 2:
                ((ContactsController) this.f10669f).lambda$mergePhonebookAndTelegramContacts$41(this.f10668e, (ArrayList) this.h, (HashMap) this.f10666b, (HashMap) this.f10667c, (ArrayList) this.d);
                return;
            case 3:
                ((FileLoadOperation) this.f10669f).lambda$onFinishLoadingFile$20((File) this.h, (File) this.f10666b, (File) this.f10667c, (File) this.d, this.f10668e);
                return;
            case 4:
                ((MessagesController) this.f10669f).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.h, (a0.h) this.f10666b, (a0.h) this.f10667c, this.f10668e, (LongSparseIntArray) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f10669f).lambda$requestUrlAuth$36((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.f10666b, (tn) this.f10667c, (String) this.d, this.f10668e);
                return;
            case 6:
                ((CameraController) this.f10669f).lambda$recordVideo$13(this.h, (CameraController.ICameraView) this.f10666b, (File) this.f10667c, this.f10668e, (Runnable) this.d);
                return;
            case 7:
                de deVar = (de) this.f10669f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f10666b;
                Activity activity = (Activity) this.f10667c;
                TLObject tLObject = (TLObject) this.d;
                boolean z10 = this.f10668e;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(deVar.f37524u0).sendRequest(new TL_account.getPassword(), new j7(deVar, twoStepVerificationActivity, z10, 2), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        tc.b0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = g6.f23169j5;
                    textView.setTextColor(g6.w0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, f6.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    int w02 = g6.w0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(g6.w0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    x3.r(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, f6.n(-1, -2));
                        linearLayout2.addView(imageView, f6.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, f6.n(-2, -2));
                        linearLayout2.addView(textView2, f6.n(-1, -2));
                    }
                    LinearLayout f9 = x3.f(activity, 0);
                    linearLayout.addView(f9, f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i17, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(g6.w0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    x3.r(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f9.addView(textView3, f6.n(-1, -2));
                        f9.addView(imageView2, f6.q(-2, -2, 5));
                    } else {
                        f9.addView(imageView2, f6.n(-2, -2));
                        f9.addView(textView3, f6.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new sd(deVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(g6.w0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f22714a);
                        return;
                    } else {
                        deVar.f37521s0.showDialog(alertDialog$Builder.f22714a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    ye.d.s(deVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        deVar.c0(true);
                    }
                }
                deVar.e0();
                return;
            case 8:
                tn tnVar = (tn) this.f10669f;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.h;
                boolean[] zArr = (boolean[]) this.f10666b;
                MessageObject messageObject = (MessageObject) this.f10667c;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.d;
                try {
                    c2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f10668e) {
                        tnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, tnVar.getParentActivity(), tnVar.f42746aa, false);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        tnVar.z6(messageObject);
                        return;
                    }
                }
                return;
            case 9:
                vo voVar = (vo) this.f10669f;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f10667c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                xo xoVar = voVar.f43692a;
                yo yoVar = xoVar.W2;
                yoVar.L.remove(((TLRPC.TL_channels_toggleUsername) this.h).username);
                boolean z11 = ((TLObject) this.f10666b) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f10668e;
                if (z11) {
                    xoVar.w1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new r5(voVar, tL_username, z12, 12));
                } else {
                    xoVar.w1(tL_username, z12, true);
                    yoVar.V();
                }
                yoVar.getMessagesController().updateUsernameActiveness(yoVar.T, tL_username.username, tL_username.active);
                return;
            case 10:
                ((fz) this.f10669f).K((yg.b) this.h, (TLObject) this.f10666b, (TLRPC.StickerSet) this.f10667c, (TLRPC.Document) this.d, this.f10668e, true);
                return;
            default:
                tt.Q((tt) this.f10669f, (TLObject) this.h, (nh.d) this.f10666b, this.f10668e, (HashSet) this.f10667c, (TLRPC.TL_error) this.d);
                return;
        }
    }

    public p1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f10665a = i10;
        this.f10669f = obj;
        this.h = obj2;
        this.f10666b = obj3;
        this.f10667c = obj4;
        this.f10668e = z10;
        this.d = obj5;
    }

    public p1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f10665a = i10;
        this.f10669f = obj;
        this.h = obj2;
        this.f10666b = obj3;
        this.f10668e = z10;
        this.f10667c = obj4;
        this.d = tLObject;
    }

    public p1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f10665a = 2;
        this.f10669f = contactsController;
        this.f10668e = z10;
        this.h = arrayList;
        this.f10666b = hashMap;
        this.f10667c = hashMap2;
        this.d = arrayList2;
    }
}
