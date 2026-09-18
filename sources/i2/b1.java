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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.du;
import org.telegram.ui.fp;
import org.telegram.ui.hp;
import org.telegram.ui.ip;
import org.telegram.ui.ke;
import org.telegram.ui.xd;
import org.telegram.ui.zn;
import w7.y5;
public final class b1 implements Runnable {
    public final int f10625a;
    public final boolean f10626b;
    public final Object f10627c;
    public final Object d;
    public final Object e;
    public final Object f10628f;
    public final Object h;

    public b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f10625a = i10;
        this.f10627c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10628f = obj4;
        this.h = obj5;
        this.f10626b = z10;
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
        switch (this.f10625a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((c1) this.f10627c).f10633b.h.f(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f10628f, (IOException) this.h, this.f10626b);
                return;
            case 1:
                ((ContactsController) this.f10627c).lambda$mergePhonebookAndTelegramContacts$41(this.f10626b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f10628f, (ArrayList) this.h);
                return;
            case 2:
                ((FileLoadOperation) this.f10627c).lambda$onFinishLoadingFile$20((File) this.d, (File) this.e, (File) this.f10628f, (File) this.h, this.f10626b);
                return;
            case 3:
                ((MessagesController) this.f10627c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, (a0.i) this.e, (a0.i) this.f10628f, this.f10626b, (LongSparseIntArray) this.h);
                return;
            case 4:
                ((SendMessagesHelper) this.f10627c).lambda$requestUrlAuth$36((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.e, (zn) this.f10628f, (String) this.h, this.f10626b);
                return;
            case 5:
                ((CameraController) this.f10627c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f10628f, this.f10626b, (Runnable) this.h);
                return;
            case 6:
                ke keVar = (ke) this.f10627c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f10628f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.f10626b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.f35065y0).sendRequest(new TL_account.getPassword(), new v1(keVar, twoStepVerificationActivity, z10, 2), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        xc.b0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i16 = j6.f19169j5;
                    textView.setTextColor(j6.w0(null, i16, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, y5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, y5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    int w02 = j6.w0(null, i16, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(j6.w0(null, i16, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, y5.n(-1, -2));
                        linearLayout2.addView(imageView, y5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, y5.n(-2, -2));
                        linearLayout2.addView(textView2, y5.n(-1, -2));
                    }
                    LinearLayout f7 = org.telegram.messenger.q.f(activity, 0);
                    linearLayout.addView(f7, y5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i16, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(j6.w0(null, i16, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f7.addView(textView3, y5.n(-1, -2));
                        f7.addView(imageView2, y5.q(-2, -2, 5));
                    } else {
                        f7.addView(imageView2, y5.n(-2, -2));
                        f7.addView(textView3, y5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new xd(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(j6.w0(null, i16, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i15 = 5;
                        } else {
                            i15 = 3;
                        }
                        textView4.setGravity(i15 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, y5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f18622a);
                        return;
                    } else {
                        keVar.f35062w0.showDialog(alertDialog$Builder.f18622a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    nf.f.s(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        keVar.c0(true);
                    }
                }
                keVar.e0();
                return;
            case 7:
                zn znVar = (zn) this.f10627c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f10628f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f10626b) {
                        znVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, znVar.getParentActivity(), znVar.f40261ea, false);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        znVar.z6(messageObject);
                        return;
                    }
                }
                return;
            case 8:
                fp fpVar = (fp) this.f10627c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f10628f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                hp hpVar = fpVar.f33591a;
                ip ipVar = hpVar.f34202a3;
                ipVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                boolean z11 = ((TLObject) this.e) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f10626b;
                if (z11) {
                    hpVar.x1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new ci.y0(fpVar, tL_username, z12, 15));
                } else {
                    hpVar.x1(tL_username, z12, true);
                    ipVar.V();
                }
                ipVar.getMessagesController().updateUsernameActiveness(ipVar.X, tL_username.username, tL_username.active);
                return;
            case 9:
                ((kz) this.f10627c).J((nh.b) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f10628f, (TLRPC.Document) this.h, this.f10626b, true);
                return;
            default:
                du.Q((du) this.f10627c, (TLObject) this.d, (ci.d) this.e, this.f10626b, (HashSet) this.f10628f, (TLRPC.TL_error) this.h);
                return;
        }
    }

    public b1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f10625a = i10;
        this.f10627c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10628f = obj4;
        this.f10626b = z10;
        this.h = obj5;
    }

    public b1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f10625a = i10;
        this.f10627c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f10626b = z10;
        this.f10628f = obj4;
        this.h = tLObject;
    }

    public b1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f10625a = 1;
        this.f10627c = contactsController;
        this.f10626b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f10628f = hashMap2;
        this.h = arrayList2;
    }
}
