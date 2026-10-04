package i2;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.v1;
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
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.du;
import org.telegram.ui.ep;
import org.telegram.ui.gp;
import org.telegram.ui.hp;
import org.telegram.ui.me;
import org.telegram.ui.od;
import org.telegram.ui.yn;
import w7.z5;
public final class c1 implements Runnable {
    public final int f11571a;
    public final boolean f11572b;
    public final Object f11573c;
    public final Object d;
    public final Object f11574e;
    public final Object f11575f;
    public final Object h;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f11571a = i10;
        this.f11573c = obj;
        this.d = obj2;
        this.f11574e = obj3;
        this.f11575f = obj4;
        this.h = obj5;
        this.f11572b = z10;
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
        switch (this.f11571a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((d1) this.f11573c).f11581b.h.f(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.f11574e, (u2.b0) this.f11575f, (IOException) this.h, this.f11572b);
                return;
            case 1:
                ((ContactsController) this.f11573c).lambda$mergePhonebookAndTelegramContacts$41(this.f11572b, (ArrayList) this.d, (HashMap) this.f11574e, (HashMap) this.f11575f, (ArrayList) this.h);
                return;
            case 2:
                ((FileLoadOperation) this.f11573c).lambda$onFinishLoadingFile$20((File) this.d, (File) this.f11574e, (File) this.f11575f, (File) this.h, this.f11572b);
                return;
            case 3:
                ((MessagesController) this.f11573c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, (a0.i) this.f11574e, (a0.i) this.f11575f, this.f11572b, (LongSparseIntArray) this.h);
                return;
            case 4:
                ((SendMessagesHelper) this.f11573c).lambda$requestUrlAuth$36((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.f11574e, (yn) this.f11575f, (String) this.h, this.f11572b);
                return;
            case 5:
                ((CameraController) this.f11573c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.f11574e, (File) this.f11575f, this.f11572b, (Runnable) this.h);
                return;
            case 6:
                me meVar = (me) this.f11573c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f11574e;
                Activity activity = (Activity) this.f11575f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.f11572b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(meVar.f38567r1).sendRequest(new TL_account.getPassword(), new v1(meVar, twoStepVerificationActivity, z10, 2), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        yc.b0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i16 = i6.f20930j5;
                    textView.setTextColor(i6.w0(null, i16, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, z5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    int w02 = i6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(i6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.q.m(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                        linearLayout2.addView(imageView, z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, z5.n(-2, -2));
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                    }
                    LinearLayout e7 = org.telegram.messenger.q.e(activity, 0);
                    linearLayout.addView(e7, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(i6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.q.m(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        e7.addView(textView3, z5.n(-1, -2));
                        e7.addView(imageView2, z5.q(-2, -2, 5));
                    } else {
                        e7.addView(imageView2, z5.n(-2, -2));
                        e7.addView(textView3, z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new od(meVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(i6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f20372a);
                        return;
                    } else {
                        meVar.f38563p1.showDialog(alertDialog$Builder.f20372a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    nf.f.s(meVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        meVar.A0(true);
                    }
                }
                meVar.C0();
                return;
            case 7:
                yn ynVar = (yn) this.f11573c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr = (boolean[]) this.f11574e;
                MessageObject messageObject = (MessageObject) this.f11575f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f11572b) {
                        ynVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, ynVar.getParentActivity(), ynVar.f43307ca, false);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        ynVar.z6(messageObject);
                        return;
                    }
                }
                return;
            case 8:
                ep epVar = (ep) this.f11573c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f11575f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                gp gpVar = epVar.f36068a;
                hp hpVar = gpVar.f36701h3;
                hpVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                boolean z11 = ((TLObject) this.f11574e) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f11572b;
                if (z11) {
                    gpVar.y1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new ci.y0(epVar, tL_username, z12, 15));
                } else {
                    gpVar.y1(tL_username, z12, true);
                    hpVar.T();
                }
                hpVar.getMessagesController().updateUsernameActiveness(hpVar.X, tL_username.username, tL_username.active);
                return;
            case 9:
                ((nz) this.f11573c).H((nh.b) this.d, (TLObject) this.f11574e, (TLRPC.StickerSet) this.f11575f, (TLRPC.Document) this.h, this.f11572b, true);
                return;
            default:
                du.O((du) this.f11573c, (TLObject) this.d, (ci.d) this.f11574e, this.f11572b, (HashSet) this.f11575f, (TLRPC.TL_error) this.h);
                return;
        }
    }

    public c1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f11571a = i10;
        this.f11573c = obj;
        this.d = obj2;
        this.f11574e = obj3;
        this.f11575f = obj4;
        this.f11572b = z10;
        this.h = obj5;
    }

    public c1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f11571a = i10;
        this.f11573c = obj;
        this.d = obj2;
        this.f11574e = obj3;
        this.f11572b = z10;
        this.f11575f = obj4;
        this.h = tLObject;
    }

    public c1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f11571a = 1;
        this.f11573c = contactsController;
        this.f11572b = z10;
        this.d = arrayList;
        this.f11574e = hashMap;
        this.f11575f = hashMap2;
        this.h = arrayList2;
    }
}
