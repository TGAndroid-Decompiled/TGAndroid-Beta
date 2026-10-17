package i2;

import ai.w9;
import ai.x7;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.v7;
import org.telegram.ui.ke;
import org.telegram.ui.sn;
import org.telegram.ui.st;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;
import org.telegram.ui.zd;
import w7.k6;
import w7.z5;
public final class d1 implements Runnable {
    public final int f12346a;
    public final boolean f12347b;
    public final Object f12348c;
    public final Object d;
    public final Object e;
    public final Object f12349f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f12346a = i10;
        this.f12348c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12349f = obj4;
        this.h = obj5;
        this.f12347b = z10;
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
        switch (this.f12346a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((e1) this.f12348c).f12356b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f12349f, (IOException) this.h, this.f12347b);
                return;
            case 1:
                ((ContactsController) this.f12348c).lambda$mergePhonebookAndTelegramContacts$41(this.f12347b, (ArrayList) this.d, (HashMap) this.e, (HashMap) this.f12349f, (ArrayList) this.h);
                return;
            case 2:
                ((FileLoadOperation) this.f12348c).lambda$onFinishLoadingFile$21((File) this.d, (File) this.e, (File) this.f12349f, (File) this.h, this.f12347b);
                return;
            case 3:
                ((MessagesController) this.f12348c).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) this.d, (a0.h) this.e, (a0.h) this.f12349f, this.f12347b, (LongSparseIntArray) this.h);
                return;
            case 4:
                ((SendMessagesHelper) this.f12348c).lambda$requestUrlAuth$39((TLObject) this.d, (TLRPC.TL_messages_requestUrlAuth) this.e, (sn) this.f12349f, (String) this.h, this.f12347b);
                return;
            case 5:
                ((CameraController) this.f12348c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f12349f, this.f12347b, (Runnable) this.h);
                return;
            case 6:
                ke keVar = (ke) this.f12348c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f12349f;
                TLObject tLObject = (TLObject) this.h;
                boolean z10 = this.f12347b;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.f38502y0).sendRequest(new TL_account.getPassword(), new w9(keVar, twoStepVerificationActivity, z10, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        xc.d0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = h6.f21092j5;
                    textView.setTextColor(h6.x0(null, i17, false));
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
                    int x02 = h6.x0(null, i17, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(h6.x0(null, i17, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                        linearLayout2.addView(imageView, z5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, z5.n(-2, -2));
                        linearLayout2.addView(textView2, z5.n(-1, -2));
                    }
                    LinearLayout e = org.telegram.messenger.q.e(activity, 0);
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i17, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(h6.x0(null, i17, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.q.n(R.string.EditAdminTransferAlertText2, textView3);
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
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new zd(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(h6.x0(null, i17, false));
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
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f20601a);
                        return;
                    } else {
                        keVar.f38499w0.showDialog(alertDialog$Builder.f20601a);
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
            case 7:
                sn.h1((sn) this.f12348c, (u1) this.d, this.f12347b, (String) this.e, (TLRPC.User[]) this.f12349f, (CharacterStyle) this.h);
                return;
            case 8:
                sn snVar = (sn) this.f12348c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject = (MessageObject) this.f12349f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    b2Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (this.f12347b) {
                        snVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, snVar.getParentActivity(), snVar.f41205ea, false);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        snVar.C6(messageObject);
                        return;
                    }
                }
                return;
            case 9:
                vo voVar = (vo) this.f12348c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f12349f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                xo xoVar = voVar.f42246a;
                yo yoVar = xoVar.Y2;
                yoVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                boolean z11 = ((TLObject) this.e) instanceof TLRPC.TL_boolTrue;
                boolean z12 = this.f12347b;
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
            case 10:
                ((tz) this.f12348c).J((oh.b) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f12349f, (TLRPC.Document) this.h, this.f12347b, true);
                return;
            case 11:
                st.R((st) this.f12348c, (TLObject) this.d, (ei.d) this.e, this.f12347b, (HashSet) this.f12349f, (TLRPC.TL_error) this.h);
                return;
            default:
                v7 v7Var = (v7) this.f12348c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f12349f;
                int[] iArr4 = (int[]) this.h;
                for (int i18 = 0; i18 < 82944; i18++) {
                    iArr3[i18] = iArr[i18] >>> 24;
                }
                for (int i19 = 0; i19 < 288; i19++) {
                    k6.a(i19 * 288, 1, iArr3, iArr4);
                }
                for (int i20 = 0; i20 < 288; i20++) {
                    k6.a(i20, 288, iArr3, iArr4);
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
                if (this.f12347b) {
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(v7Var, iArr2, bitmap, 17));
                        return;
                    }
                }
                bitmap = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(v7Var, iArr2, bitmap, 17));
                return;
        }
    }

    public d1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f12346a = i10;
        this.f12348c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12349f = obj4;
        this.f12347b = z10;
        this.h = obj5;
    }

    public d1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f12346a = i10;
        this.f12348c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12347b = z10;
        this.f12349f = obj4;
        this.h = tLObject;
    }

    public d1(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f12346a = 1;
        this.f12348c = contactsController;
        this.f12347b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f12349f = hashMap2;
        this.h = arrayList2;
    }

    public d1(sn snVar, u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f12346a = 7;
        this.f12348c = snVar;
        this.d = u1Var;
        this.f12347b = z10;
        this.e = str;
        this.f12349f = userArr;
        this.h = characterStyle;
    }
}
