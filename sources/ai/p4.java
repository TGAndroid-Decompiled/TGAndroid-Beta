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
import org.telegram.messenger.DispatchQueue;
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
import org.telegram.ui.qn;
import org.telegram.ui.qt;
import org.telegram.ui.to;
import org.telegram.ui.vo;
import org.telegram.ui.wo;
public final class p4 implements Runnable {
    public final int f1994a;
    public final boolean f1995b;
    public final Object f1996c;
    public final Object d;
    public final Object e;
    public final Object f1997f;
    public final Object h;

    public p4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i10) {
        this.f1994a = i10;
        this.f1996c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1997f = obj4;
        this.h = serializable;
        this.f1995b = z10;
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
        char c10;
        int i17 = this.f1994a;
        char c11 = '\b';
        int i18 = 0;
        boolean z10 = this.f1995b;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.f1997f;
        Object obj4 = this.e;
        Object obj5 = this.f1996c;
        switch (i17) {
            case 0:
                l7.v0((l7) obj5, (TLRPC.TL_error) obj, (Utilities.Callback) obj4, (TwoStepVerificationActivity) obj3, this.f1995b, (TLObject) obj2);
                return;
            case 1:
                Pair pair = (Pair) obj;
                ((i2.f1) obj5).f12353b.h.g(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj4, (u2.c0) obj3, (IOException) obj2, this.f1995b);
                return;
            case 2:
                ((ContactsController) obj5).lambda$mergePhonebookAndTelegramContacts$41(this.f1995b, (ArrayList) obj, (HashMap) obj4, (HashMap) obj3, (ArrayList) obj2);
                return;
            case 3:
                ((FileLoadOperation) obj5).lambda$onFinishLoadingFile$21((File) obj, (File) obj4, (File) obj3, (File) obj2, this.f1995b);
                return;
            case 4:
                ((MessagesController) obj5).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) obj, (a0.h) obj4, (a0.h) obj3, this.f1995b, (LongSparseIntArray) obj2);
                return;
            case 5:
                ((SendMessagesHelper) obj5).lambda$requestUrlAuth$39((TLObject) obj2, (TLRPC.TL_messages_requestUrlAuth) obj, (qn) obj4, (String) obj3, this.f1995b);
                return;
            case 6:
                ((CameraController) obj5).lambda$recordVideo$13(this.d, (CameraController.ICameraView) obj4, (File) obj3, this.f1995b, (Runnable) obj2);
                return;
            case 7:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                Activity activity = (Activity) obj4;
                TLObject tLObject = (TLObject) obj2;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(ieVar.f37959y0).sendRequest(new TL_account.getPassword(), new w9(ieVar, twoStepVerificationActivity, z10, 3), 8);
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
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                    b2Var.R = string;
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    TextView textView = new TextView(activity);
                    int i19 = org.telegram.ui.ActionBar.h6.f21100j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
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
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, i19, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(activity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
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
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i19, false), mode));
                    TextView textView3 = new TextView(activity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
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
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.xd(ieVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
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
                        twoStepVerificationActivity.showDialog(b2Var);
                        return;
                    } else {
                        ieVar.f37956w0.showDialog(b2Var);
                        return;
                    }
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    pf.d.r(ieVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        ieVar.c0(true);
                    }
                }
                ieVar.e0();
                return;
            case 8:
                qn.h1((qn) obj5, (org.telegram.ui.Cells.u1) obj, this.f1995b, (String) obj4, (TLRPC.User[]) obj3, (CharacterStyle) obj2);
                return;
            case 9:
                qn qnVar = (qn) obj5;
                boolean[] zArr = (boolean[]) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z10) {
                        qnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, qnVar.getParentActivity(), qnVar.f40677ea, false);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        qnVar.C6(messageObject);
                        return;
                    }
                }
                return;
            case 10:
                to toVar = (to) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                vo voVar = toVar.f41716a;
                wo woVar = voVar.Y2;
                woVar.P.remove(((TLRPC.TL_channels_toggleUsername) obj4).username);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    voVar.x1(tL_username, !z10, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new y7(toVar, tL_username, z10, 17));
                } else {
                    voVar.x1(tL_username, z10, true);
                    woVar.V();
                }
                woVar.getMessagesController().updateUsernameActiveness(woVar.X, tL_username.username, tL_username.active);
                return;
            case 11:
                ((tz) obj5).J((oh.b) obj, (TLObject) obj2, (TLRPC.StickerSet) obj4, (TLRPC.Document) obj3, this.f1995b, true);
                return;
            case 12:
                qt.R((qt) obj5, (TLObject) obj2, (ei.d) obj4, this.f1995b, (HashSet) obj3, (TLRPC.TL_error) obj);
                return;
            default:
                org.telegram.ui.Wallet.s7 s7Var = (org.telegram.ui.Wallet.s7) obj5;
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj4;
                int[] iArr3 = (int[]) obj3;
                int[] iArr4 = (int[]) obj2;
                DispatchQueue dispatchQueue = org.telegram.ui.Wallet.w9.f35084a;
                int i20 = 0;
                while (true) {
                    int i21 = 287;
                    if (i20 < 288) {
                        int i22 = i20 * 288;
                        int i23 = 8;
                        for (int i24 = 0; i24 < 288; i24++) {
                            int i25 = i22 + i24;
                            if ((iArr[i25] >>> 24) >= 128) {
                                i23 = 0;
                            } else {
                                i23 = Math.min(i23 + 1, 8);
                            }
                            iArr3[i25] = i23;
                        }
                        int i26 = 8;
                        while (i21 >= 0) {
                            int i27 = i22 + i21;
                            if (iArr3[i27] == 0) {
                                i26 = 0;
                            } else {
                                i26 = Math.min(i26 + 1, 8);
                            }
                            if (i26 < iArr3[i27]) {
                                iArr3[i27] = i26;
                            }
                            i21--;
                        }
                        i20++;
                    } else {
                        int i28 = 0;
                        while (i28 < 288) {
                            for (int i29 = i18; i29 < 288; i29++) {
                                iArr4[i29] = iArr3[(i29 * 288) + i28];
                            }
                            int i30 = i18;
                            while (i30 < 288) {
                                int min = Math.min(i21, i30 + 8);
                                int i31 = 128;
                                for (int max = Math.max(i18, i30 - 8); max <= min; max++) {
                                    int i32 = iArr4[max];
                                    if (i32 < 8) {
                                        int i33 = max - i30;
                                        int i34 = (i33 * i33) + (i32 * i32);
                                        if (i34 < i31) {
                                            i31 = i34;
                                        }
                                    }
                                }
                                iArr3[(i30 * 288) + i28] = org.telegram.ui.Wallet.w9.f35085b[i31];
                                i30++;
                                i18 = 0;
                                i21 = 287;
                            }
                            i28++;
                            i18 = 0;
                            i21 = 287;
                        }
                        int i35 = 0;
                        while (i35 < 82944) {
                            int i36 = iArr[i35];
                            int i37 = i36 >>> 24;
                            int max2 = Math.max(iArr3[i35], i37);
                            if (i37 != 255) {
                                if (i37 == 0) {
                                    i36 = (max2 << 24) | 16777215;
                                } else {
                                    int i38 = ((255 - i37) * max2) / 255;
                                    int i39 = i37 + i38;
                                    int i40 = i38 * 255;
                                    c10 = c11;
                                    i36 = ((((i36 & 255) * i37) + i40) / i39) | ((((((i36 >> 8) & 255) * i37) + i40) / i39) << 8) | (i39 << 24) | ((((((i36 >> 16) & 255) * i37) + i40) / i39) << 16);
                                    iArr2[i35] = i36;
                                    i35++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i35] = i36;
                            i35++;
                            c11 = c10;
                        }
                        if (z10) {
                            int i41 = 0;
                            for (int i42 = 0; i42 < 82944; i42 += 7) {
                                if ((iArr2[i42] >>> 24) > 0) {
                                    i41++;
                                }
                            }
                            if (i41 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, 288, 288, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                Bitmap createBitmap2 = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(createBitmap2).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                bitmap = createBitmap2;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s7Var, iArr2, bitmap, 18));
                                return;
                            }
                        }
                        bitmap = null;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s7Var, iArr2, bitmap, 18));
                        return;
                    }
                }
        }
    }

    public p4(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f1994a = i10;
        this.f1996c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1997f = obj4;
        this.f1995b = z10;
        this.h = obj5;
    }

    public p4(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f1994a = 2;
        this.f1996c = contactsController;
        this.f1995b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f1997f = hashMap2;
        this.h = arrayList2;
    }

    public p4(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, qn qnVar, String str, boolean z10) {
        this.f1994a = 5;
        this.f1996c = sendMessagesHelper;
        this.h = tLObject;
        this.d = tL_messages_requestUrlAuth;
        this.e = qnVar;
        this.f1997f = str;
        this.f1995b = z10;
    }

    public p4(org.telegram.ui.ie ieVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.f1994a = 7;
        this.f1996c = ieVar;
        this.d = tL_error;
        this.f1997f = twoStepVerificationActivity;
        this.e = activity;
        this.f1995b = z10;
        this.h = tLObject;
    }

    public p4(qn qnVar, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, boolean z10, MessageObject messageObject, TLRPC.TL_webPage tL_webPage) {
        this.f1994a = 9;
        this.f1996c = qnVar;
        this.d = b2Var;
        this.e = zArr;
        this.f1995b = z10;
        this.f1997f = messageObject;
        this.h = tL_webPage;
    }

    public p4(qn qnVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f1994a = 8;
        this.f1996c = qnVar;
        this.d = u1Var;
        this.f1995b = z10;
        this.e = str;
        this.f1997f = userArr;
        this.h = characterStyle;
    }

    public p4(to toVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.f1994a = 10;
        this.f1996c = toVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f1997f = tL_username;
        this.f1995b = z10;
        this.d = tL_error;
    }

    public p4(tz tzVar, oh.b bVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.f1994a = 11;
        this.f1996c = tzVar;
        this.d = bVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f1997f = document;
        this.f1995b = z10;
    }

    public p4(qt qtVar, TLObject tLObject, ei.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f1994a = 12;
        this.f1996c = qtVar;
        this.h = tLObject;
        this.e = dVar;
        this.f1995b = z10;
        this.f1997f = hashSet;
        this.d = tL_error;
    }
}
