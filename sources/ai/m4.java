package ai;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.tz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;
public final class m4 implements Runnable {
    public final int f1816a;
    public final boolean f1817b;
    public final Object f1818c;
    public final Object d;
    public final Object e;
    public final Object f1819f;
    public final Object h;

    public m4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i10) {
        this.f1816a = i10;
        this.f1818c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1819f = obj4;
        this.h = serializable;
        this.f1817b = z10;
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
        Bitmap bitmap;
        switch (this.f1816a) {
            case 0:
                k7.P0((k7) this.f1818c, (TLRPC.TL_error) this.d, (Utilities.Callback) this.e, (TwoStepVerificationActivity) this.f1819f, this.f1817b, (TLObject) this.h);
                return;
            case 1:
                Pair pair = (Pair) this.d;
                ((i2.e1) this.f1818c).f12352b.h.g(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f1819f, (IOException) this.h, this.f1817b);
                return;
            case 2:
                ((ContactsController) this.f1818c).lambda$mergePhonebookAndTelegramContacts$41(this.f1817b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f1819f, (ArrayList) this.h);
                return;
            case 3:
                ((FileLoadOperation) this.f1818c).lambda$onFinishLoadingFile$21((File) this.d, (File) this.e, (File) this.f1819f, (File) this.h, this.f1817b);
                return;
            case 4:
                ((MessagesController) this.f1818c).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) this.d, (a0.h) this.e, (a0.h) this.f1819f, this.f1817b, (LongSparseIntArray) this.h);
                return;
            case 5:
                ((SendMessagesHelper) this.f1818c).lambda$requestUrlAuth$39((TLObject) this.h, (TLRPC.TL_messages_requestUrlAuth) this.d, (sn) this.e, (String) this.f1819f, this.f1817b);
                return;
            case 6:
                ((CameraController) this.f1818c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f1819f, this.f1817b, (Runnable) this.h);
                return;
            case 7:
                org.telegram.ui.ke keVar = (org.telegram.ui.ke) this.f1818c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f1819f;
                Activity activity = (Activity) this.e;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.f1817b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.f38511y0).sendRequest(new TL_account.getPassword(), new w9(keVar, twoStepVerificationActivity, z10, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.xc.d0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = org.telegram.ui.ActionBar.h6.f21099j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, w7.z5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                    }
                    LinearLayout e = org.telegram.messenger.g0.e(activity, 0);
                    linearLayout.addView(e, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i17, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.g0.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        e.addView(textView3, w7.z5.n(-1, -2));
                        i15 = 5;
                        e.addView(imageView2, w7.z5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        e.addView(imageView2, w7.z5.n(-2, -2));
                        e.addView(textView3, w7.z5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.zd(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f20608a);
                        return;
                    } else {
                        keVar.f38508w0.showDialog(alertDialog$Builder.f20608a);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    pf.d.r(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        keVar.c0(true);
                    }
                }
                keVar.e0();
                return;
            case 8:
                sn.h1((sn) this.f1818c, (org.telegram.ui.Cells.u1) this.d, this.f1817b, (String) this.e, (TLRPC.User[]) this.f1819f, (CharacterStyle) this.h);
                return;
            case 9:
                sn snVar = (sn) this.f1818c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f1819f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f1817b) {
                        snVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, snVar.getParentActivity(), snVar.f41226ea, false);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        snVar.C6(messageObject);
                        return;
                    }
                }
                return;
            case 10:
                vo voVar = (vo) this.f1818c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f1819f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                xo xoVar = voVar.f42262a;
                yo yoVar = xoVar.Y2;
                yoVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.e).username);
                boolean z11 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f1817b;
                if (z11) {
                    xoVar.x1(tL_username, !z12, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new x7(voVar, tL_username, z12, 17));
                } else {
                    xoVar.x1(tL_username, z12, true);
                    yoVar.V();
                }
                yoVar.getMessagesController().updateUsernameActiveness(yoVar.X, tL_username.username, tL_username.active);
                return;
            case 11:
                ((tz) this.f1818c).J((oh.b) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.e, (TLRPC.Document) this.f1819f, this.f1817b, true);
                return;
            case 12:
                st.R((st) this.f1818c, (TLObject) this.h, (ei.d) this.e, this.f1817b, (HashSet) this.f1819f, (TLRPC.TL_error) this.d);
                return;
            default:
                org.telegram.ui.Wallet.y7 y7Var = (org.telegram.ui.Wallet.y7) this.f1818c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f1819f;
                int[] iArr4 = (int[]) this.h;
                for (int i18 = 0; i18 < 82944; i18++) {
                    iArr3[i18] = iArr[i18] >>> 24;
                }
                for (int i19 = 0; i19 < 288; i19++) {
                    w7.k6.a(i19 * 288, 1, iArr3, iArr4);
                }
                for (int i20 = 0; i20 < 288; i20++) {
                    w7.k6.a(i20, 288, iArr3, iArr4);
                }
                for (int i21 = 0; i21 < 82944; i21++) {
                    int i22 = iArr[i21];
                    int i23 = iArr3[i21];
                    int i24 = i22 >>> 24;
                    if (i24 != 255) {
                        if (i24 == 0) {
                            i22 = (i23 << 24) | 16777215;
                        } else {
                            int i25 = ((255 - i24) * i23) / 255;
                            int i26 = i24 + i25;
                            int i27 = i25 * 255;
                            i22 = ((((i22 & 255) * i24) + i27) / i26) | ((((((i22 >> 8) & 255) * i24) + i27) / i26) << 8) | (i26 << 24) | ((((((i22 >> 16) & 255) * i24) + i27) / i26) << 16);
                        }
                    }
                    iArr2[i21] = i22;
                }
                if (this.f1817b) {
                    int i28 = 0;
                    for (int i29 = 0; i29 < 82944; i29 += 7) {
                        if ((iArr2[i29] >>> 24) > 0) {
                            i28++;
                        }
                    }
                    if (i28 > 592) {
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, 288, 288, Bitmap.Config.ARGB_8888);
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        bitmap = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                        new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                        createBitmap.recycle();
                        createScaledBitmap.recycle();
                        extractAlpha.recycle();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(y7Var, iArr2, bitmap, 17));
                        return;
                    }
                }
                bitmap = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(y7Var, iArr2, bitmap, 17));
                return;
        }
    }

    public m4(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f1816a = i10;
        this.f1818c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1819f = obj4;
        this.f1817b = z10;
        this.h = obj5;
    }

    public m4(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f1816a = 2;
        this.f1818c = contactsController;
        this.f1817b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f1819f = hashMap2;
        this.h = arrayList2;
    }

    public m4(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, sn snVar, String str, boolean z10) {
        this.f1816a = 5;
        this.f1818c = sendMessagesHelper;
        this.h = tLObject;
        this.d = tL_messages_requestUrlAuth;
        this.e = snVar;
        this.f1819f = str;
        this.f1817b = z10;
    }

    public m4(org.telegram.ui.ke keVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.f1816a = 7;
        this.f1818c = keVar;
        this.d = tL_error;
        this.f1819f = twoStepVerificationActivity;
        this.e = activity;
        this.f1817b = z10;
        this.h = tLObject;
    }

    public m4(sn snVar, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, boolean z10, MessageObject messageObject, TLRPC.TL_webPage tL_webPage) {
        this.f1816a = 9;
        this.f1818c = snVar;
        this.d = b2Var;
        this.e = zArr;
        this.f1817b = z10;
        this.f1819f = messageObject;
        this.h = tL_webPage;
    }

    public m4(sn snVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f1816a = 8;
        this.f1818c = snVar;
        this.d = u1Var;
        this.f1817b = z10;
        this.e = str;
        this.f1819f = userArr;
        this.h = characterStyle;
    }

    public m4(vo voVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.f1816a = 10;
        this.f1818c = voVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f1819f = tL_username;
        this.f1817b = z10;
        this.d = tL_error;
    }

    public m4(tz tzVar, oh.b bVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.f1816a = 11;
        this.f1818c = tzVar;
        this.d = bVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f1819f = document;
        this.f1817b = z10;
    }

    public m4(st stVar, TLObject tLObject, ei.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f1816a = 12;
        this.f1818c = stVar;
        this.h = tLObject;
        this.e = dVar;
        this.f1817b = z10;
        this.f1819f = hashSet;
        this.d = tL_error;
    }
}
