package di;

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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ly;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.eo;
import org.telegram.ui.go;
import org.telegram.ui.ho;
import org.telegram.ui.vs;
import org.telegram.ui.xd;
public final class m3 implements Runnable {
    public final int f9026a;
    public final boolean f9027b;
    public final Object f9028c;
    public final Object d;
    public final Object f9029e;
    public final Object f9030f;
    public final Object h;

    public m3(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f9026a = i7;
        this.f9028c = obj;
        this.d = obj2;
        this.f9029e = obj3;
        this.f9030f = obj4;
        this.f9027b = z10;
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
        switch (this.f9026a) {
            case 0:
                c6 c6Var = (c6) this.f9028c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                z10 z10Var = (z10) this.f9029e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f9030f;
                boolean z10 = this.f9027b;
                TLObject tLObject = (TLObject) this.h;
                if (c6Var.getContext() != null) {
                    if (tL_error != null && z10Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        z10Var.a(Boolean.TRUE);
                        return;
                    }
                    if (z10Var != null) {
                        z10Var.a(Boolean.FALSE);
                    }
                    if (tL_error != null) {
                        c6Var.Q1(tL_error, twoStepVerificationActivity, z10);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                        vf.c.v(c6Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                        TL_stars.TL_starGiftUnique H1 = c6Var.H1();
                        org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(c6Var.f29679a);
                        org.telegram.ui.Wallet.h hVar = x10.f44100z;
                        if (H1 != null) {
                            str = H1.gift_address;
                        } else {
                            str = null;
                        }
                        org.telegram.messenger.g0.r(hVar);
                        x10.f44098x = str;
                        x10.f44099y = 0;
                        if (x10.f44090o == null) {
                            x10.f44090o = new org.telegram.ui.Wallet.d0(x10);
                        }
                        org.telegram.ui.Wallet.d0 d0Var = x10.f44090o;
                        if (!d0Var.f43719j) {
                            d0Var.b();
                            d0Var.f(true);
                        }
                        x10.B().g();
                        x10.E();
                        int i17 = x10.f44099y;
                        long[] jArr = org.telegram.ui.Wallet.l0.P;
                        if (i17 < 7) {
                            x10.f44099y = i17 + 1;
                            org.telegram.messenger.g0.i3(hVar, jArr[i17]);
                        }
                        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                            org.telegram.messenger.g0.h3(new aa.r((Object) null, (Object) H1.getDocument(), (Object) hd.M0(2131750101, null), 19));
                        }
                        c6Var.dismiss();
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                        org.telegram.ui.Components.cc.b0("NULL_ERROR");
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) this.d;
                ((l2.c1) this.f9028c).f18909b.h.r(((Integer) pair.first).intValue(), (x2.f0) pair.second, (x2.t) this.f9029e, (x2.b0) this.f9030f, (IOException) this.h, this.f9027b);
                return;
            case 2:
                ((CameraController) this.f9028c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.f9029e, (File) this.f9030f, this.f9027b, (Runnable) this.h);
                return;
            case 3:
                xd xdVar = (xd) this.f9028c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f9030f;
                Activity activity = (Activity) this.f9029e;
                boolean z11 = this.f9027b;
                TLObject tLObject2 = (TLObject) this.h;
                if (tL_error2 != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(xdVar.f53193p0).sendRequest(new TL_account.getPassword(), new l8(xdVar, twoStepVerificationActivity2, z11, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        org.telegram.ui.Components.cc.d0(tL_error2);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f28392a.S = hd.M0(2131751297, null);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i18 = org.telegram.ui.ActionBar.j6.f28957j5;
                    org.telegram.ui.ActionBar.q6.U(textView, i18, null);
                    textView.setTextSize(1, 16.0f);
                    if (hd.f24101a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131742864, null)));
                    linearLayout.addView(textView, c8.ja.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(2131231623);
                    if (hd.f24101a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (hd.f24101a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView.setPadding(i10, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.q6.s(imageView, i18, null, mode);
                    TextView textView2 = new TextView(activity);
                    org.telegram.ui.ActionBar.q6.U(textView2, i18, null);
                    textView2.setTextSize(1, 16.0f);
                    if (hd.f24101a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
                    if (hd.f24101a0) {
                        linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                        linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                        linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                    }
                    LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
                    linearLayout.addView(e10, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(2131231623);
                    if (hd.f24101a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (hd.f24101a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.q6.s(imageView2, i18, null, mode);
                    TextView textView3 = new TextView(activity);
                    org.telegram.ui.ActionBar.q6.U(textView3, i18, null);
                    textView3.setTextSize(1, 16.0f);
                    if (hd.f24101a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131751299, null)));
                    if (hd.f24101a0) {
                        e10.addView(textView3, c8.ja.o(-1, -2));
                        i14 = 5;
                        e10.addView(imageView2, c8.ja.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        e10.addView(imageView2, c8.ja.o(-2, -2));
                        e10.addView(textView3, c8.ja.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                        alertDialog$Builder.k(hd.M0(2131751291, null), new bd(xdVar));
                        alertDialog$Builder.h(hd.M0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        org.telegram.ui.ActionBar.q6.U(textView4, i18, null);
                        textView4.setTextSize(1, 16.0f);
                        if (hd.f24101a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.k5.l(textView4, i15 | 48, null, 2131751298);
                        linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(hd.M0(2131747831, null), null);
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.showDialog(alertDialog$Builder.f28392a);
                        return;
                    } else {
                        xdVar.f53190n0.showDialog(alertDialog$Builder.f28392a);
                        return;
                    }
                }
                twoStepVerificationActivity2.t0();
                twoStepVerificationActivity2.finishFragment();
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    vf.c.t(xdVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject2).url);
                    if (z11) {
                        xdVar.H(true);
                    }
                }
                xdVar.J();
                return;
            case 4:
                an.X0((an) this.f9028c, (org.telegram.ui.Cells.q1) this.d, this.f9027b, (String) this.f9029e, (TLRPC.User[]) this.f9030f, (CharacterStyle) this.h);
                return;
            case 5:
                an anVar = (an) this.f9028c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                boolean[] zArr = (boolean[]) this.f9029e;
                boolean z12 = this.f9027b;
                gj gjVar = (gj) this.f9030f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    t1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        anVar.createArticleViewer(false).L(gjVar, webPage, null, null);
                        return;
                    }
                    try {
                        org.telegram.messenger.g0.u2(gjVar, anVar.getParentActivity(), anVar.Aa, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        anVar.M6(gjVar);
                        return;
                    }
                }
                return;
            case 6:
                eo eoVar = (eo) this.f9028c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f9030f;
                boolean z13 = this.f9027b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                go goVar = eoVar.f46888a;
                ho hoVar = goVar.f47497i3;
                hoVar.Q.remove(((TLRPC.TL_channels_toggleUsername) this.f9029e).username);
                if (((TLObject) this.h) instanceof TLRPC.TL_boolTrue) {
                    goVar.z1(tL_username, !z13, false);
                } else if (tL_error3 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    org.telegram.messenger.g0.h3(new m6(eoVar, tL_username, z13, 16));
                } else {
                    goVar.z1(tL_username, z13, true);
                    hoVar.b0();
                }
                hoVar.getMessagesController().u5(hoVar.Y, tL_username.username, tL_username.active);
                return;
            case 7:
                ((ly) this.f9028c).K((ph.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.f9029e, (TLRPC.Document) this.f9030f, this.f9027b, true);
                return;
            case 8:
                vs vsVar = (vs) this.f9028c;
                TLObject tLObject3 = (TLObject) this.h;
                hi.d dVar = (hi.d) this.f9029e;
                boolean z14 = this.f9027b;
                HashSet hashSet = (HashSet) this.f9030f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    np.s1(vsVar.f29679a).Y3(updates.users, false);
                    np.s1(vsVar.f29679a).S3(updates.chats, false);
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i19 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i19 < size) {
                        Object obj = y02.get(i19);
                        i19++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.ui.Components.voip.u(5, vsVar, updates));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f28068id = groupCall.f28061id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        vsVar.dismiss();
                        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, vsVar.f29679a, tL_inputGroupCall, z14, groupCall, hashSet);
                        return;
                    }
                    vsVar.Y1 = false;
                    dVar.setLoading(false);
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    np.s1(vsVar.f29679a).Y3(groupcall.users, false);
                    np.s1(vsVar.f29679a).S3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        vsVar.Y1 = false;
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f28068id = groupCall2.f28061id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    vsVar.dismiss();
                    org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, vsVar.f29679a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                    return;
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.y0.q(vsVar.F, vsVar.J0, tL_error4, false);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) this.f9028c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.f9029e;
                int[] iArr3 = (int[]) this.f9030f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.f9027b;
                org.telegram.messenger.q5 q5Var = org.telegram.ui.Wallet.ea.f43808a;
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
                                iArr3[(i30 * 288) + i28] = org.telegram.ui.Wallet.ea.f43809b[i31];
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
                                bitmap = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(1);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(bitmap).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 21));
                                return;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g(b8Var, iArr2, bitmap, 21));
                        return;
                    }
                }
        }
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i7) {
        this.f9026a = i7;
        this.f9028c = obj;
        this.d = obj2;
        this.f9029e = obj3;
        this.f9030f = obj4;
        this.h = serializable;
        this.f9027b = z10;
    }

    public m3(xd xdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.f9026a = 3;
        this.f9028c = xdVar;
        this.d = tL_error;
        this.f9030f = twoStepVerificationActivity;
        this.f9029e = activity;
        this.f9027b = z10;
        this.h = tLObject;
    }

    public m3(an anVar, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, boolean z10, gj gjVar, TLRPC.TL_webPage tL_webPage) {
        this.f9026a = 5;
        this.f9028c = anVar;
        this.d = t1Var;
        this.f9029e = zArr;
        this.f9027b = z10;
        this.f9030f = gjVar;
        this.h = tL_webPage;
    }

    public m3(an anVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f9026a = 4;
        this.f9028c = anVar;
        this.d = q1Var;
        this.f9027b = z10;
        this.f9029e = str;
        this.f9030f = userArr;
        this.h = characterStyle;
    }

    public m3(eo eoVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.f9026a = 6;
        this.f9028c = eoVar;
        this.f9029e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f9030f = tL_username;
        this.f9027b = z10;
        this.d = tL_error;
    }

    public m3(ly lyVar, ph.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.f9026a = 7;
        this.f9028c = lyVar;
        this.d = aVar;
        this.h = tLObject;
        this.f9029e = stickerSet;
        this.f9030f = document;
        this.f9027b = z10;
    }

    public m3(vs vsVar, TLObject tLObject, hi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f9026a = 8;
        this.f9028c = vsVar;
        this.h = tLObject;
        this.f9029e = dVar;
        this.f9027b = z10;
        this.f9030f = hashSet;
        this.d = tL_error;
    }
}
