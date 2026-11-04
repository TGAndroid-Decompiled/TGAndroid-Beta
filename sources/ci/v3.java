package ci;

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
import b8.mf;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.p11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao;
import org.telegram.ui.bo;
import org.telegram.ui.qs;
import org.telegram.ui.wm;
import org.telegram.ui.xd;
import org.telegram.ui.yn;
public final class v3 implements Runnable {
    public final int f6172a;
    public final boolean f6173b;
    public final Object f6174c;
    public final Object d;
    public final Object f6175e;
    public final Object f6176f;
    public final Object h;

    public v3(int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f6172a = i3;
        this.f6174c = obj;
        this.d = obj2;
        this.f6175e = obj3;
        this.f6176f = obj4;
        this.f6173b = z10;
        this.h = obj5;
    }

    @Override
    public final void run() {
        String str;
        int i3;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        Bitmap bitmap;
        char c2;
        char c10 = '\b';
        int i16 = 0;
        switch (this.f6172a) {
            case 0:
                l6 l6Var = (l6) this.f6174c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                u10 u10Var = (u10) this.f6175e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f6176f;
                boolean z10 = this.f6173b;
                TLObject tLObject = (TLObject) this.h;
                if (l6Var.getContext() != null) {
                    if (tL_error != null && u10Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        u10Var.a(Boolean.TRUE);
                        return;
                    }
                    if (u10Var != null) {
                        u10Var.a(Boolean.FALSE);
                    }
                    if (tL_error != null) {
                        l6Var.Q1(tL_error, twoStepVerificationActivity, z10);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                        sf.c.v(l6Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                        TL_stars.TL_starGiftUnique H1 = l6Var.H1();
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(l6Var.f28583a);
                        org.telegram.ui.Wallet.h hVar = x10.f42740z;
                        if (H1 != null) {
                            str = H1.gift_address;
                        } else {
                            str = null;
                        }
                        org.telegram.messenger.g0.r(hVar);
                        x10.f42738x = str;
                        x10.f42739y = 0;
                        if (x10.f42730o == null) {
                            x10.f42730o = new org.telegram.ui.Wallet.c0(x10);
                        }
                        org.telegram.ui.Wallet.c0 c0Var = x10.f42730o;
                        if (!c0Var.f42367j) {
                            c0Var.b();
                            c0Var.f(true);
                        }
                        x10.B().g();
                        x10.E();
                        int i17 = x10.f42739y;
                        long[] jArr = org.telegram.ui.Wallet.k0.P;
                        if (i17 < 7) {
                            x10.f42739y = i17 + 1;
                            org.telegram.messenger.g0.i3(hVar, jArr[i17]);
                        }
                        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                            org.telegram.messenger.g0.h3(new ai.k3((Object) null, H1.getDocument(), bd.M0(2131750109, null), 16));
                        }
                        l6Var.dismiss();
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                        org.telegram.ui.Components.fc.b0("NULL_ERROR");
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) this.d;
                ((k2.f1) this.f6174c).f16503b.h.j(((Integer) pair.first).intValue(), (w2.g0) pair.second, (w2.u) this.f6175e, (w2.c0) this.f6176f, (IOException) this.h, this.f6173b);
                return;
            case 2:
                ((CameraController) this.f6174c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.f6175e, (File) this.f6176f, this.f6173b, (Runnable) this.h);
                return;
            case 3:
                xd xdVar = (xd) this.f6174c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f6176f;
                Activity activity = (Activity) this.f6175e;
                boolean z11 = this.f6173b;
                TLObject tLObject2 = (TLObject) this.h;
                if (tL_error2 != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(xdVar.f51929p0).sendRequest(new TL_account.getPassword(), new t8(xdVar, twoStepVerificationActivity2, z11, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        org.telegram.ui.Components.fc.d0(tL_error2);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f27343a.S = bd.M0(2131751298, null);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i18 = org.telegram.ui.ActionBar.k6.f27988j5;
                    org.telegram.ui.ActionBar.r6.V(textView, i18, null);
                    textView.setTextSize(1, 16.0f);
                    if (bd.f21784a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 48);
                    textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131742874, null)));
                    linearLayout.addView(textView, mf.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(2131231623);
                    if (bd.f21784a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (bd.f21784a0) {
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
                    if (bd.f21784a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131751301, null)));
                    if (bd.f21784a0) {
                        linearLayout2.addView(textView2, mf.o(-1, -2));
                        linearLayout2.addView(imageView, mf.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, mf.o(-2, -2));
                        linearLayout2.addView(textView2, mf.o(-1, -2));
                    }
                    LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
                    linearLayout.addView(e10, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(2131231623);
                    if (bd.f21784a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (bd.f21784a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i18, null, mode);
                    TextView textView3 = new TextView(activity);
                    org.telegram.ui.ActionBar.r6.V(textView3, i18, null);
                    textView3.setTextSize(1, 16.0f);
                    if (bd.f21784a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.X2(bd.M0(2131751300, null)));
                    if (bd.f21784a0) {
                        e10.addView(textView3, mf.o(-1, -2));
                        i14 = 5;
                        e10.addView(imageView2, mf.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        e10.addView(imageView2, mf.o(-2, -2));
                        e10.addView(textView3, mf.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                        alertDialog$Builder.k(bd.M0(2131751292, null), new org.telegram.ui.bd(xdVar));
                        alertDialog$Builder.h(bd.M0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        org.telegram.ui.ActionBar.r6.V(textView4, i18, null);
                        textView4.setTextSize(1, 16.0f);
                        if (bd.f21784a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131751299);
                        linearLayout.addView(textView4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(bd.M0(2131747839, null), null);
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.showDialog(alertDialog$Builder.f27343a);
                        return;
                    } else {
                        xdVar.f51925n0.showDialog(alertDialog$Builder.f27343a);
                        return;
                    }
                }
                twoStepVerificationActivity2.t0();
                twoStepVerificationActivity2.finishFragment();
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    sf.c.t(xdVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                    if (z11) {
                        xdVar.H(true);
                    }
                }
                xdVar.J();
                return;
            case 4:
                wm.A0((wm) this.f6174c, (org.telegram.ui.Cells.q1) this.d, this.f6173b, (String) this.f6175e, (TLRPC.User[]) this.f6176f, (CharacterStyle) this.h);
                return;
            case 5:
                wm wmVar = (wm) this.f6174c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                boolean[] zArr = (boolean[]) this.f6175e;
                boolean z12 = this.f6173b;
                zi ziVar = (zi) this.f6176f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    s1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        wmVar.createArticleViewer(false).L(ziVar, webPage, null, null);
                        return;
                    }
                    try {
                        org.telegram.messenger.g0.u2(ziVar, wmVar.getParentActivity(), wmVar.f51557ya, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        wmVar.L6(ziVar);
                        return;
                    }
                }
                return;
            case 6:
                yn ynVar = (yn) this.f6174c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f6176f;
                boolean z13 = this.f6173b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                ao aoVar = ynVar.f52369a;
                bo boVar = aoVar.i3;
                boVar.Q.remove(((TLRPC.TL_channels_toggleUsername) this.f6175e).username);
                if (((TLObject) this.h) instanceof TLRPC.TL_boolTrue) {
                    aoVar.z1(tL_username, !z13, false);
                } else if (tL_error3 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    org.telegram.messenger.g0.h3(new v6(ynVar, tL_username, z13, 16));
                } else {
                    aoVar.z1(tL_username, z13, true);
                    boVar.b0();
                }
                boVar.getMessagesController().t5(boVar.Y, tL_username.username, tL_username.active);
                return;
            case 7:
                ((ey) this.f6174c).J((qh.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.f6175e, (TLRPC.Document) this.f6176f, this.f6173b, true);
                return;
            case 8:
                qs qsVar = (qs) this.f6174c;
                TLObject tLObject3 = (TLObject) this.h;
                gi.d dVar = (gi.d) this.f6175e;
                boolean z14 = this.f6173b;
                HashSet hashSet = (HashSet) this.f6176f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    hp.s1(qsVar.f28583a).Y3(updates.users, false);
                    hp.s1(qsVar.f28583a).S3(updates.chats, false);
                    ArrayList y02 = hp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i19 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i19 < size) {
                        Object obj = y02.get(i19);
                        i19++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new p11(15, qsVar, updates));
                    if (groupCall != null && LaunchActivity.K1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f27018id = groupCall.f27011id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        qsVar.dismiss();
                        org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, qsVar.f28583a, tL_inputGroupCall, z14, groupCall, hashSet);
                        return;
                    }
                    qsVar.V1 = false;
                    dVar.setLoading(false);
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    hp.s1(qsVar.f28583a).Y3(groupcall.users, false);
                    hp.s1(qsVar.f28583a).S3(groupcall.chats, false);
                    if (LaunchActivity.K1 == null) {
                        qsVar.V1 = false;
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f27018id = groupCall2.f27011id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    qsVar.dismiss();
                    org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, qsVar.f28583a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                    return;
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.f1.v(qsVar.F, qsVar.J0, tL_error4, false);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.a8 a8Var = (org.telegram.ui.Wallet.a8) this.f6174c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.f6175e;
                int[] iArr3 = (int[]) this.f6176f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.f6173b;
                org.telegram.messenger.q5 q5Var = org.telegram.ui.Wallet.ba.f42351a;
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
                                iArr3[(i30 * 288) + i28] = org.telegram.ui.Wallet.ba.f42352b[i31];
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
                                    c2 = c10;
                                    i36 = ((((i36 & 255) * i37) + i40) / i39) | ((((((i36 >> 8) & 255) * i37) + i40) / i39) << 8) | (i39 << 24) | ((((((i36 >> 16) & 255) * i37) + i40) / i39) << 16);
                                    iArr2[i35] = i36;
                                    i35++;
                                    c10 = c2;
                                }
                            }
                            c2 = c10;
                            iArr2[i35] = i36;
                            i35++;
                            c10 = c2;
                        }
                        if (z15) {
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
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(a8Var, iArr2, bitmap, 20));
                                return;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(a8Var, iArr2, bitmap, 20));
                        return;
                    }
                }
        }
    }

    public v3(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i3) {
        this.f6172a = i3;
        this.f6174c = obj;
        this.d = obj2;
        this.f6175e = obj3;
        this.f6176f = obj4;
        this.h = serializable;
        this.f6173b = z10;
    }

    public v3(xd xdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.f6172a = 3;
        this.f6174c = xdVar;
        this.d = tL_error;
        this.f6176f = twoStepVerificationActivity;
        this.f6175e = activity;
        this.f6173b = z10;
        this.h = tLObject;
    }

    public v3(wm wmVar, org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr, boolean z10, zi ziVar, TLRPC.TL_webPage tL_webPage) {
        this.f6172a = 5;
        this.f6174c = wmVar;
        this.d = s1Var;
        this.f6175e = zArr;
        this.f6173b = z10;
        this.f6176f = ziVar;
        this.h = tL_webPage;
    }

    public v3(wm wmVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f6172a = 4;
        this.f6174c = wmVar;
        this.d = q1Var;
        this.f6173b = z10;
        this.f6175e = str;
        this.f6176f = userArr;
        this.h = characterStyle;
    }

    public v3(yn ynVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.f6172a = 6;
        this.f6174c = ynVar;
        this.f6175e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f6176f = tL_username;
        this.f6173b = z10;
        this.d = tL_error;
    }

    public v3(ey eyVar, qh.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.f6172a = 7;
        this.f6174c = eyVar;
        this.d = aVar;
        this.h = tLObject;
        this.f6175e = stickerSet;
        this.f6176f = document;
        this.f6173b = z10;
    }

    public v3(qs qsVar, TLObject tLObject, gi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f6172a = 8;
        this.f6174c = qsVar;
        this.h = tLObject;
        this.f6175e = dVar;
        this.f6173b = z10;
        this.f6176f = hashSet;
        this.d = tL_error;
    }
}
