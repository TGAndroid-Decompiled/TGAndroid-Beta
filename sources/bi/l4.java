package bi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.gy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.co;
import org.telegram.ui.fo;
import org.telegram.ui.go;
import org.telegram.ui.ss;
public final class l4 implements Runnable {
    public final int f4262a;
    public final boolean f4263b;
    public final Object f4264c;
    public final Object d;
    public final Object f4265e;
    public final Object f4266f;
    public final Object h;

    public l4(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z9) {
        this.f4262a = i7;
        this.f4264c = obj;
        this.d = obj2;
        this.f4265e = obj3;
        this.f4266f = obj4;
        this.f4263b = z9;
        this.h = obj5;
    }

    @Override
    public final void run() {
        String str;
        int i7;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        Bitmap bitmap;
        char c10;
        char c11 = '\b';
        int i16 = 0;
        switch (this.f4262a) {
            case 0:
                k7 k7Var = (k7) this.f4264c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                c20 c20Var = (c20) this.f4265e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f4266f;
                boolean z9 = this.f4263b;
                TLObject tLObject = (TLObject) this.h;
                if (k7Var.getContext() != null) {
                    if (tL_error != null && c20Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        c20Var.a(Boolean.TRUE);
                        return;
                    }
                    if (c20Var != null) {
                        c20Var.a(Boolean.FALSE);
                    }
                    if (tL_error != null) {
                        k7Var.Q1(tL_error, twoStepVerificationActivity, z9);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                        vf.c.v(k7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                        TL_stars.TL_starGiftUnique H1 = k7Var.H1();
                        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(k7Var.f28612a);
                        org.telegram.ui.Wallet.h hVar = x10.f42790z;
                        if (H1 != null) {
                            str = H1.gift_address;
                        } else {
                            str = null;
                        }
                        org.telegram.messenger.g0.r(hVar);
                        x10.f42788x = str;
                        x10.f42789y = 0;
                        if (x10.f42780o == null) {
                            x10.f42780o = new org.telegram.ui.Wallet.f0(x10);
                        }
                        org.telegram.ui.Wallet.f0 f0Var = x10.f42780o;
                        if (!f0Var.f42425j) {
                            f0Var.b();
                            f0Var.f(true);
                        }
                        x10.B().g();
                        x10.E();
                        int i17 = x10.f42789y;
                        long[] jArr = org.telegram.ui.Wallet.n0.P;
                        if (i17 < 7) {
                            x10.f42789y = i17 + 1;
                            org.telegram.messenger.g0.i3(hVar, jArr[i17]);
                        }
                        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                            org.telegram.messenger.g0.h3(new aa.s((Object) null, (Object) H1.getDocument(), (Object) org.telegram.messenger.hd.M0(2131750100, null), 13));
                        }
                        k7Var.dismiss();
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                        org.telegram.ui.Components.hc.b0("NULL_ERROR");
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) this.d;
                ((l2.g1) this.f4264c).f17821b.h.r(((Integer) pair.first).intValue(), (x2.g0) pair.second, (x2.u) this.f4265e, (x2.c0) this.f4266f, (IOException) this.h, this.f4263b);
                return;
            case 2:
                ((CameraController) this.f4264c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.f4265e, (File) this.f4266f, this.f4263b, (Runnable) this.h);
                return;
            case 3:
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) this.f4264c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f4266f;
                Activity activity = (Activity) this.f4265e;
                boolean z10 = this.f4263b;
                TLObject tLObject2 = (TLObject) this.h;
                if (tL_error2 != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(zdVar.f52537o0).sendRequest(new TL_account.getPassword(), new u9(zdVar, twoStepVerificationActivity2, z10, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        org.telegram.ui.Components.hc.d0(tL_error2);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131751298, null);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i18 = org.telegram.ui.ActionBar.k6.f27956j5;
                    org.telegram.ui.ActionBar.r6.V(textView, i18, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131742865, null)));
                    linearLayout.addView(textView, c8.ha.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(2131231623);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.hd.f22871a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView.setPadding(i10, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.t(imageView, i18, null, mode);
                    TextView textView2 = new TextView(activity);
                    org.telegram.ui.ActionBar.r6.V(textView2, i18, null);
                    textView2.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751301, null)));
                    if (org.telegram.messenger.hd.f22871a0) {
                        linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                        linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                        linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                    }
                    LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
                    linearLayout.addView(e10, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(2131231623);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (org.telegram.messenger.hd.f22871a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i18, null, mode);
                    TextView textView3 = new TextView(activity);
                    org.telegram.ui.ActionBar.r6.V(textView3, i18, null);
                    textView3.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751300, null)));
                    if (org.telegram.messenger.hd.f22871a0) {
                        e10.addView(textView3, c8.ha.o(-1, -2));
                        i14 = 5;
                        e10.addView(imageView2, c8.ha.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        e10.addView(imageView2, c8.ha.o(-2, -2));
                        e10.addView(textView3, c8.ha.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751292, null), new org.telegram.ui.cd(zdVar));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        org.telegram.ui.ActionBar.r6.V(textView4, i18, null);
                        textView4.setTextSize(1, 16.0f);
                        if (org.telegram.messenger.hd.f22871a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131751299);
                        linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747830, null), null);
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.showDialog(alertDialog$Builder.f27292a);
                        return;
                    } else {
                        zdVar.m0.showDialog(alertDialog$Builder.f27292a);
                        return;
                    }
                }
                twoStepVerificationActivity2.t0();
                twoStepVerificationActivity2.finishFragment();
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    vf.c.t(zdVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                    if (z10) {
                        zdVar.H(true);
                    }
                }
                zdVar.J();
                return;
            case 4:
                an.A0((an) this.f4264c, (org.telegram.ui.Cells.q1) this.d, this.f4263b, (String) this.f4265e, (TLRPC.User[]) this.f4266f, (CharacterStyle) this.h);
                return;
            case 5:
                an anVar = (an) this.f4264c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                boolean[] zArr = (boolean[]) this.f4265e;
                boolean z11 = this.f4263b;
                ij ijVar = (ij) this.f4266f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    u1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z11) {
                        anVar.createArticleViewer(false).L(ijVar, webPage, null, null);
                        return;
                    }
                    try {
                        org.telegram.messenger.g0.u2(ijVar, anVar.getParentActivity(), anVar.f43998xa, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        anVar.L6(ijVar);
                        return;
                    }
                }
                return;
            case 6:
                co coVar = (co) this.f4264c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f4266f;
                boolean z12 = this.f4263b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                fo foVar = coVar.f44843a;
                go goVar = foVar.f45678h3;
                goVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.f4265e).username);
                if (((TLObject) this.h) instanceof TLRPC.TL_boolTrue) {
                    foVar.z1(tL_username, !z12, false);
                } else if (tL_error3 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    org.telegram.messenger.g0.h3(new u7(coVar, tL_username, z12, 16));
                } else {
                    foVar.z1(tL_username, z12, true);
                    goVar.b0();
                }
                goVar.getMessagesController().t5(goVar.X, tL_username.username, tL_username.active);
                return;
            case 7:
                ((gy) this.f4264c).J((ph.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.f4265e, (TLRPC.Document) this.f4266f, this.f4263b, true);
                return;
            case 8:
                ss ssVar = (ss) this.f4264c;
                TLObject tLObject3 = (TLObject) this.h;
                fi.d dVar = (fi.d) this.f4265e;
                boolean z13 = this.f4263b;
                HashSet hashSet = (HashSet) this.f4266f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    qp.s1(ssVar.f28612a).Y3(updates.users, false);
                    qp.s1(ssVar.f28612a).S3(updates.chats, false);
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i19 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i19 < size) {
                        Object obj = y02.get(i19);
                        i19++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new g51(10, ssVar, updates));
                    if (groupCall != null && LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f26969id = groupCall.f26962id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        ssVar.dismiss();
                        org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, ssVar.f28612a, tL_inputGroupCall, z13, groupCall, hashSet);
                        return;
                    }
                    ssVar.U1 = false;
                    dVar.setLoading(false);
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    qp.s1(ssVar.f28612a).Y3(groupcall.users, false);
                    qp.s1(ssVar.f28612a).S3(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        ssVar.U1 = false;
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f26969id = groupCall2.f26962id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ssVar.dismiss();
                    org.telegram.ui.Components.voip.y1.g(LaunchActivity.G1, ssVar.f28612a, tL_inputGroupCall2, z13, groupcall.call, hashSet);
                    return;
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.f1.r(ssVar.E, ssVar.I0, tL_error4, false);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) this.f4264c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.f4265e;
                int[] iArr3 = (int[]) this.f4266f;
                int[] iArr4 = (int[]) this.h;
                boolean z14 = this.f4263b;
                org.telegram.messenger.q5 q5Var = org.telegram.ui.Wallet.ca.f42289a;
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
                            for (int i29 = i16; i29 < 288; i29++) {
                                iArr4[i29] = iArr3[(i29 * 288) + i28];
                            }
                            int i30 = i16;
                            while (i30 < 288) {
                                int min = Math.min(i21, i30 + 8);
                                int i31 = 128;
                                for (int max = Math.max(i16, i30 - 8); max <= min; max++) {
                                    int i32 = iArr4[max];
                                    if (i32 < 8) {
                                        int i33 = max - i30;
                                        int i34 = (i33 * i33) + (i32 * i32);
                                        if (i34 < i31) {
                                            i31 = i34;
                                        }
                                    }
                                }
                                iArr3[(i30 * 288) + i28] = org.telegram.ui.Wallet.ca.f42290b[i31];
                                i30++;
                                i16 = 0;
                                i21 = 287;
                            }
                            i28++;
                            i16 = 0;
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
                        if (z14) {
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
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 20));
                                return;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 20));
                        return;
                    }
                }
        }
    }

    public l4(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z9, int i7) {
        this.f4262a = i7;
        this.f4264c = obj;
        this.d = obj2;
        this.f4265e = obj3;
        this.f4266f = obj4;
        this.h = serializable;
        this.f4263b = z9;
    }

    public l4(org.telegram.ui.zd zdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, TLObject tLObject) {
        this.f4262a = 3;
        this.f4264c = zdVar;
        this.d = tL_error;
        this.f4266f = twoStepVerificationActivity;
        this.f4265e = activity;
        this.f4263b = z9;
        this.h = tLObject;
    }

    public l4(an anVar, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, boolean z9, ij ijVar, TLRPC.TL_webPage tL_webPage) {
        this.f4262a = 5;
        this.f4264c = anVar;
        this.d = u1Var;
        this.f4265e = zArr;
        this.f4263b = z9;
        this.f4266f = ijVar;
        this.h = tL_webPage;
    }

    public l4(an anVar, org.telegram.ui.Cells.q1 q1Var, boolean z9, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f4262a = 4;
        this.f4264c = anVar;
        this.d = q1Var;
        this.f4263b = z9;
        this.f4265e = str;
        this.f4266f = userArr;
        this.h = characterStyle;
    }

    public l4(co coVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z9, TLRPC.TL_error tL_error) {
        this.f4262a = 6;
        this.f4264c = coVar;
        this.f4265e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f4266f = tL_username;
        this.f4263b = z9;
        this.d = tL_error;
    }

    public l4(gy gyVar, ph.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z9) {
        this.f4262a = 7;
        this.f4264c = gyVar;
        this.d = aVar;
        this.h = tLObject;
        this.f4265e = stickerSet;
        this.f4266f = document;
        this.f4263b = z9;
    }

    public l4(ss ssVar, TLObject tLObject, fi.d dVar, boolean z9, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f4262a = 8;
        this.f4264c = ssVar;
        this.h = tLObject;
        this.f4265e = dVar;
        this.f4263b = z9;
        this.f4266f = hashSet;
        this.d = tL_error;
    }
}
