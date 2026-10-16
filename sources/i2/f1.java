package i2;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.de;
import org.telegram.ui.fo;
import org.telegram.ui.hu;
import org.telegram.ui.kp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.qe;
import w7.z5;
public final class f1 implements Runnable {
    public final int f10962a;
    public final boolean f10963b;
    public final Object f10964c;
    public final Object d;
    public final Object e;
    public final Object f10965f;
    public final Object h;

    public f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f10962a = i10;
        this.f10964c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10965f = obj4;
        this.h = obj5;
        this.f10963b = z10;
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
        switch (this.f10962a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((g1) this.f10964c).f10981b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f10965f, (IOException) this.h, this.f10963b);
                return;
            case 1:
                ((ContactsController) this.f10964c).lambda$mergePhonebookAndTelegramContacts$41(this.f10963b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f10965f, (ArrayList) this.h);
                return;
            case 2:
                ((FileLoadOperation) this.f10964c).lambda$onFinishLoadingFile$21((File) this.d, (File) this.e, (File) this.f10965f, (File) this.h, this.f10963b);
                return;
            case 3:
                ((MessagesController) this.f10964c).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) this.d, (a0.h) this.e, (a0.h) this.f10965f, this.f10963b, (LongSparseIntArray) this.h);
                return;
            case 4:
                ((SendMessagesHelper) this.f10964c).lambda$requestUrlAuth$39((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.e, (fo) this.f10965f, (String) this.h, this.f10963b);
                return;
            case 5:
                ((CameraController) this.f10964c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f10965f, this.f10963b, (Runnable) this.h);
                return;
            case 6:
                qe qeVar = (qe) this.f10964c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f10965f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.f10963b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(qeVar.f39141y0).sendRequest(new TL_account.getPassword(), new di.u1(qeVar, twoStepVerificationActivity, z10, 2), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        zc.d0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = g6.f19707j5;
                    textView.setTextColor(g6.x0(null, i17, false));
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
                    int x02 = g6.x0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(g6.x0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                        linearLayout2.addView(imageView, z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, z5.n(-2, -2));
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                    }
                    LinearLayout e = org.telegram.messenger.g0.e(activity, 0);
                    linearLayout.addView(e, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i17, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(g6.x0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        e.addView(textView3, z5.n(-1, -2));
                        i15 = 5;
                        e.addView(imageView2, z5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        e.addView(imageView2, z5.n(-2, -2));
                        e.addView(textView3, z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new de(qeVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(g6.x0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f19248a);
                        return;
                    } else {
                        qeVar.f39138w0.showDialog(alertDialog$Builder.f19248a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    pf.d.r(qeVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        qeVar.c0(true);
                    }
                }
                qeVar.e0();
                return;
            case 7:
                fo.h1((fo) this.f10964c, (org.telegram.ui.Cells.u1) this.d, this.f10963b, (String) this.e, (TLRPC.User[]) this.f10965f, (CharacterStyle) this.h);
                return;
            case 8:
                fo foVar = (fo) this.f10964c;
                a2 a2Var = (a2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f10965f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    a2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f10963b) {
                        foVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, foVar.getParentActivity(), foVar.f35633ea, false);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        foVar.C6(messageObject);
                        return;
                    }
                }
                return;
            case 9:
                kp kpVar = (kp) this.f10964c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f10965f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                mp mpVar = kpVar.f37472a;
                np npVar = mpVar.Y2;
                npVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                boolean z11 = ((TLObject) this.e) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f10963b;
                if (z11) {
                    mpVar.x1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new di.x0(kpVar, tL_username, z12, 14));
                } else {
                    mpVar.x1(tL_username, z12, true);
                    npVar.V();
                }
                npVar.getMessagesController().updateUsernameActiveness(npVar.X, tL_username.username, tL_username.active);
                return;
            case 10:
                ((wz) this.f10964c).J((oh.b) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f10965f, (TLRPC.Document) this.h, this.f10963b, true);
                return;
            default:
                hu.R((hu) this.f10964c, (TLObject) this.d, (di.d) this.e, this.f10963b, (HashSet) this.f10965f, (TLRPC.TL_error) this.h);
                return;
        }
    }

    public f1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f10962a = i10;
        this.f10964c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10965f = obj4;
        this.f10963b = z10;
        this.h = obj5;
    }

    public f1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f10962a = i10;
        this.f10964c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10963b = z10;
        this.f10965f = obj4;
        this.h = tLObject;
    }

    public f1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f10962a = 1;
        this.f10964c = contactsController;
        this.f10963b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f10965f = hashMap2;
        this.h = arrayList2;
    }

    public f1(fo foVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f10962a = 7;
        this.f10964c = foVar;
        this.d = u1Var;
        this.f10963b = z10;
        this.e = str;
        this.f10965f = userArr;
        this.h = characterStyle;
    }
}
