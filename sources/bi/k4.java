package bi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.sz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.ke;
import org.telegram.ui.tt;
import org.telegram.ui.wn;
import org.telegram.ui.zo;
public final class k4 implements Runnable {
    public final int f4949a;
    public final boolean f4950b;
    public final Object f4951c;
    public final Object d;
    public final Object e;
    public final Object f4952f;
    public final Object h;

    public k4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i10) {
        this.f4949a = i10;
        this.f4951c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4952f = obj4;
        this.h = serializable;
        this.f4950b = z10;
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
        int i17 = this.f4949a;
        char c11 = '\b';
        int i18 = 0;
        boolean z10 = this.f4950b;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.f4952f;
        Object obj4 = this.e;
        Object obj5 = this.f4951c;
        switch (i17) {
            case 0:
                h7.u0((h7) obj5, (TLRPC.TL_error) obj, (Utilities.Callback) obj4, (TwoStepVerificationActivity) obj3, this.f4950b, (TLObject) obj2);
                return;
            case 1:
                Pair pair = (Pair) obj;
                ((i2.g1) obj5).f13548b.h.f(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj4, (u2.c0) obj3, (IOException) obj2, this.f4950b);
                return;
            case 2:
                ((ContactsController) obj5).lambda$mergePhonebookAndTelegramContacts$41(this.f4950b, (ArrayList) obj, (HashMap) obj4, (HashMap) obj3, (ArrayList) obj2);
                return;
            case 3:
                ((FileLoadOperation) obj5).lambda$onFinishLoadingFile$21((File) obj, (File) obj4, (File) obj3, (File) obj2, this.f4950b);
                return;
            case 4:
                ((MessagesController) obj5).lambda$processDialogsUpdate$227((TLRPC.messages_Dialogs) obj, (a0.h) obj4, (a0.h) obj3, this.f4950b, (LongSparseIntArray) obj2);
                return;
            case 5:
                ((SendMessagesHelper) obj5).lambda$requestUrlAuth$39((TLObject) obj2, (TLRPC.TL_messages_requestUrlAuth) obj, (wn) obj4, (String) obj3, this.f4950b);
                return;
            case 6:
                ((CameraController) obj5).lambda$recordVideo$13(this.d, (CameraController.ICameraView) obj4, (File) obj3, this.f4950b, (Runnable) obj2);
                return;
            case 7:
                ke keVar = (ke) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj3;
                Activity activity = (Activity) obj4;
                TLObject tLObject = (TLObject) obj2;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(keVar.f40769o0).sendRequest(new TL_account.getPassword(), new r9(keVar, twoStepVerificationActivity, z10, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.p0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.Components.wc.e0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.p0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = string;
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i19 = org.telegram.ui.ActionBar.y6.f23465j5;
                    org.telegram.ui.ActionBar.f7.V(textView, i19, null);
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
                    linearLayout.addView(textView, kb1.r(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.f7.t(imageView, i19, null, mode);
                    TextView textView2 = new TextView(activity);
                    org.telegram.ui.ActionBar.f7.V(textView2, i19, null);
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, kb1.r(-1, -2));
                        linearLayout2.addView(imageView, kb1.u(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, kb1.r(-2, -2));
                        linearLayout2.addView(textView2, kb1.r(-1, -2));
                    }
                    LinearLayout f7 = org.telegram.messenger.t.f(activity, 0);
                    linearLayout.addView(f7, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
                    org.telegram.ui.ActionBar.f7.t(imageView2, i19, null, mode);
                    TextView textView3 = new TextView(activity);
                    org.telegram.ui.ActionBar.f7.V(textView3, i19, null);
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        f7.addView(textView3, kb1.r(-1, -2));
                        i15 = 5;
                        f7.addView(imageView2, kb1.u(-2, -2, 5));
                    } else {
                        i15 = 5;
                        f7.addView(imageView2, kb1.r(-2, -2));
                        f7.addView(textView3, kb1.r(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.od(keVar));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        org.telegram.ui.ActionBar.f7.V(textView4, i19, null);
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(e2Var);
                        return;
                    } else {
                        keVar.m0.showDialog(e2Var);
                        return;
                    }
                }
                twoStepVerificationActivity.p0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    qf.d.r(keVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z10) {
                        keVar.H(true);
                    }
                }
                keVar.J();
                return;
            case 8:
                wn.z0((wn) obj5, (org.telegram.ui.Cells.s1) obj, this.f4950b, (String) obj4, (TLRPC.User[]) obj3, (CharacterStyle) obj2);
                return;
            case 9:
                wn wnVar = (wn) obj5;
                boolean[] zArr = (boolean[]) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                try {
                    ((org.telegram.ui.ActionBar.e2) obj).dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z10) {
                        wnVar.createArticleViewer(false).N(messageObject, webPage, null, null);
                        return;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, wnVar.getParentActivity(), wnVar.f45309ua, false);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        wnVar.F6(messageObject);
                        return;
                    }
                }
                return;
            case 10:
                zo zoVar = (zo) obj5;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                bp bpVar = zoVar.f46322a;
                cp cpVar = bpVar.f38083i3;
                cpVar.P.remove(((TLRPC.TL_channels_toggleUsername) obj4).username);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    bpVar.C1(tL_username, !z10, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    AndroidUtilities.runOnUIThread(new u7(zoVar, tL_username, z10, 16));
                } else {
                    bpVar.C1(tL_username, z10, true);
                    cpVar.X();
                }
                cpVar.getMessagesController().updateUsernameActiveness(cpVar.X, tL_username.username, tL_username.active);
                return;
            case 11:
                ((sz) obj5).K((ph.b) obj, (TLObject) obj2, (TLRPC.StickerSet) obj4, (TLRPC.Document) obj3, this.f4950b, true);
                return;
            case 12:
                tt.Q((tt) obj5, (TLObject) obj2, (fi.d) obj4, this.f4950b, (HashSet) obj3, (TLRPC.TL_error) obj);
                return;
            default:
                org.telegram.ui.Wallet.s7 s7Var = (org.telegram.ui.Wallet.s7) obj5;
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj4;
                int[] iArr3 = (int[]) obj3;
                int[] iArr4 = (int[]) obj2;
                DispatchQueue dispatchQueue = org.telegram.ui.Wallet.w9.f37476a;
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
                                iArr3[(i30 * 288) + i28] = org.telegram.ui.Wallet.w9.f37477b[i31];
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
                                    i36 = ((((i36 & 255) * i37) + i40) / i39) | (i39 << 24) | ((((((i36 >> 16) & 255) * i37) + i40) / i39) << 16) | ((((((i36 >> 8) & 255) * i37) + i40) / i39) << 8);
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
                                bitmap = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
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

    public k4(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f4949a = i10;
        this.f4951c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4952f = obj4;
        this.f4950b = z10;
        this.h = obj5;
    }

    public k4(ContactsController contactsController, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f4949a = 2;
        this.f4951c = contactsController;
        this.f4950b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f4952f = hashMap2;
        this.h = arrayList2;
    }

    public k4(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, wn wnVar, String str, boolean z10) {
        this.f4949a = 5;
        this.f4951c = sendMessagesHelper;
        this.h = tLObject;
        this.d = tL_messages_requestUrlAuth;
        this.e = wnVar;
        this.f4952f = str;
        this.f4950b = z10;
    }

    public k4(ke keVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.f4949a = 7;
        this.f4951c = keVar;
        this.d = tL_error;
        this.f4952f = twoStepVerificationActivity;
        this.e = activity;
        this.f4950b = z10;
        this.h = tLObject;
    }

    public k4(wn wnVar, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, boolean z10, MessageObject messageObject, TLRPC.TL_webPage tL_webPage) {
        this.f4949a = 9;
        this.f4951c = wnVar;
        this.d = e2Var;
        this.e = zArr;
        this.f4950b = z10;
        this.f4952f = messageObject;
        this.h = tL_webPage;
    }

    public k4(wn wnVar, org.telegram.ui.Cells.s1 s1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f4949a = 8;
        this.f4951c = wnVar;
        this.d = s1Var;
        this.f4950b = z10;
        this.e = str;
        this.f4952f = userArr;
        this.h = characterStyle;
    }

    public k4(zo zoVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.f4949a = 10;
        this.f4951c = zoVar;
        this.e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f4952f = tL_username;
        this.f4950b = z10;
        this.d = tL_error;
    }

    public k4(sz szVar, ph.b bVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.f4949a = 11;
        this.f4951c = szVar;
        this.d = bVar;
        this.h = tLObject;
        this.e = stickerSet;
        this.f4952f = document;
        this.f4950b = z10;
    }

    public k4(tt ttVar, TLObject tLObject, fi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f4949a = 12;
        this.f4951c = ttVar;
        this.h = tLObject;
        this.e = dVar;
        this.f4950b = z10;
        this.f4952f = hashSet;
        this.d = tL_error;
    }
}
