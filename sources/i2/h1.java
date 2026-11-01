package i2;

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.s5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.ga;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.ld;
import org.telegram.ui.le;
import org.telegram.ui.tt;
import org.telegram.ui.un;
import org.telegram.ui.wd;
import org.telegram.ui.zo;
import rh.e4;
import w7.b6;
public final class h1 implements Runnable {
    public final int f7889a;
    public final boolean f7890b;
    public final Object f7891c;
    public final Object d;
    public final Object e;
    public final Object f7892f;
    public final Object h;

    public h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f7889a = i10;
        this.f7891c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7892f = obj4;
        this.h = obj5;
        this.f7890b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        int L2;
        int i14;
        int i15;
        Bitmap bitmap;
        char c10;
        String str;
        char c11 = '\b';
        boolean z10 = true;
        int i16 = 0;
        switch (this.f7889a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((i1) this.f7891c).f7938b.h.B(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f7892f, (IOException) this.h, this.f7890b);
                return;
            case 1:
                ((CameraController) this.f7891c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f7892f, this.f7890b, (Runnable) this.h);
                return;
            case 2:
                le leVar = (le) this.f7891c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f7892f;
                boolean z11 = this.f7890b;
                TLObject tLObject = (TLObject) this.h;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(leVar.f39215o0).sendRequest(new TL_account.getPassword(), new wd(leVar, twoStepVerificationActivity, z11, 0), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        cc.d0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f20135a.R = dd.L0(2131751298, null);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i17 = t6.f21038j5;
                    a7.V(textView, i17, null);
                    textView.setTextSize(1, 16.0f);
                    if (dd.X) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131742889, null)));
                    linearLayout.addView(textView, b6.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(2131231624);
                    if (dd.X) {
                        i11 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int L3 = org.telegram.messenger.i0.L(9.0f);
                    if (dd.X) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.i0.L(11.0f);
                    }
                    imageView.setPadding(i11, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    a7.t(imageView, i17, null, mode);
                    TextView textView2 = new TextView(activity);
                    a7.V(textView2, i17, null);
                    textView2.setTextSize(1, 16.0f);
                    if (dd.X) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    textView2.setText(org.telegram.messenger.i0.W2(dd.L0(2131751301, null)));
                    if (dd.X) {
                        linearLayout2.addView(textView2, b6.o(-1, -2));
                        linearLayout2.addView(imageView, b6.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, b6.o(-2, -2));
                        linearLayout2.addView(textView2, b6.o(-1, -2));
                    }
                    LinearLayout e = m5.e(activity, 0);
                    linearLayout.addView(e, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(2131231624);
                    if (dd.X) {
                        i13 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int L4 = org.telegram.messenger.i0.L(9.0f);
                    if (dd.X) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.i0.L(11.0f);
                    }
                    imageView2.setPadding(i13, L4, L2, 0);
                    a7.t(imageView2, i17, null, mode);
                    TextView textView3 = new TextView(activity);
                    a7.V(textView3, i17, null);
                    textView3.setTextSize(1, 16.0f);
                    if (dd.X) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    textView3.setText(org.telegram.messenger.i0.W2(dd.L0(2131751300, null)));
                    if (dd.X) {
                        e.addView(textView3, b6.o(-1, -2));
                        i15 = 5;
                        e.addView(imageView2, b6.r(-2, -2, 5));
                    } else {
                        i15 = 5;
                        e.addView(imageView2, b6.o(-2, -2));
                        e.addView(textView3, b6.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(dd.L0(2131751292, null), new ld(leVar));
                        alertDialog$Builder.h(dd.L0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        a7.V(textView4, i17, null);
                        textView4.setTextSize(1, 16.0f);
                        if (!dd.X) {
                            i15 = 3;
                        }
                        m5.l(textView4, i15 | 48, null, 2131751299);
                        linearLayout.addView(textView4, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(dd.L0(2131747847, null), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f20135a);
                        return;
                    } else {
                        leVar.m0.showDialog(alertDialog$Builder.f20135a);
                        return;
                    }
                }
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    gf.f.r(leVar.getContext(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
                    if (z11) {
                        leVar.H(true);
                    }
                }
                leVar.J();
                return;
            case 3:
                un.u1((un) this.f7891c, (org.telegram.ui.Cells.q1) this.d, this.f7890b, (String) this.e, (TLRPC.User[]) this.f7892f, (CharacterStyle) this.h);
                return;
            case 4:
                un unVar = (un) this.f7891c;
                x1 x1Var = (x1) this.d;
                boolean[] zArr = (boolean[]) this.e;
                boolean z12 = this.f7890b;
                kj kjVar = (kj) this.f7892f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    x1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        unVar.createArticleViewer(false).L(kjVar, webPage, null, null);
                        return;
                    }
                    try {
                        org.telegram.messenger.i0.u2(kjVar, unVar.getParentActivity(), unVar.f42288xa, false);
                        return;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        unVar.J6(kjVar);
                        return;
                    }
                }
                return;
            case 5:
                zo zoVar = (zo) this.f7891c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f7892f;
                boolean z13 = this.f7890b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                bp bpVar = zoVar.f44030a;
                cp cpVar = bpVar.f36095h3;
                cpVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                if (((TLObject) this.e) instanceof TLRPC.TL_boolTrue) {
                    bpVar.z1(tL_username, !z13, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    org.telegram.messenger.i0.g3(new ag.j0(zoVar, tL_username, z13, 13));
                } else {
                    bpVar.z1(tL_username, z13, true);
                    cpVar.b0();
                }
                cpVar.getMessagesController().q5(cpVar.X, tL_username.username, tL_username.active);
                return;
            case 6:
                ((vy) this.f7891c).K((fh.a) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f7892f, (TLRPC.Document) this.h, this.f7890b, true);
                return;
            case 7:
                tt ttVar = (tt) this.f7891c;
                TLObject tLObject2 = (TLObject) this.d;
                vh.d dVar = (vh.d) this.e;
                boolean z14 = this.f7890b;
                HashSet hashSet = (HashSet) this.f7892f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    wp.r1(ttVar.f21584a).V3(updates.users, false);
                    wp.r1(ttVar.f21584a).P3(updates.chats, false);
                    ArrayList y02 = wp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i18 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i18 < size) {
                        Object obj = y02.get(i18);
                        i18++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.ui.Components.voip.u(4, ttVar, updates));
                    if (groupCall != null && LaunchActivity.I1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19811id = groupCall.f19804id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        ttVar.dismiss();
                        org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, ttVar.f21584a, tL_inputGroupCall, z14, groupCall, hashSet);
                        return;
                    }
                    ttVar.U1 = false;
                    dVar.setLoading(false);
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    wp.r1(ttVar.f21584a).V3(groupcall.users, false);
                    wp.r1(ttVar.f21584a).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 == null) {
                        ttVar.U1 = false;
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f19811id = groupCall2.f19804id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ttVar.dismiss();
                    org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, ttVar.f21584a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                    return;
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.s(ttVar.E, ttVar.I0, tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 8:
                g8 g8Var = (g8) this.f7891c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f7892f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.f7890b;
                s5 s5Var = ga.f34610a;
                int i19 = 0;
                while (true) {
                    int i20 = 287;
                    if (i19 < 288) {
                        int i21 = i19 * 288;
                        int i22 = 8;
                        int i23 = 0;
                        while (i23 < 288) {
                            int i24 = i21 + i23;
                            boolean z16 = z10;
                            if ((iArr[i24] >>> 24) >= 128) {
                                i22 = 0;
                            } else {
                                i22 = Math.min(i22 + 1, 8);
                            }
                            iArr3[i24] = i22;
                            i23++;
                            z10 = z16;
                        }
                        boolean z17 = z10;
                        int i25 = 8;
                        while (i20 >= 0) {
                            int i26 = i21 + i20;
                            if (iArr3[i26] == 0) {
                                i25 = 0;
                            } else {
                                i25 = Math.min(i25 + 1, 8);
                            }
                            if (i25 < iArr3[i26]) {
                                iArr3[i26] = i25;
                            }
                            i20--;
                        }
                        i19++;
                        z10 = z17;
                    } else {
                        boolean z18 = z10;
                        int i27 = 0;
                        while (i27 < 288) {
                            for (int i28 = i16; i28 < 288; i28++) {
                                iArr4[i28] = iArr3[(i28 * 288) + i27];
                            }
                            int i29 = i16;
                            while (i29 < 288) {
                                int min = Math.min(i20, i29 + 8);
                                int i30 = 128;
                                for (int max = Math.max(i16, i29 - 8); max <= min; max++) {
                                    int i31 = iArr4[max];
                                    if (i31 < 8) {
                                        int i32 = max - i29;
                                        int i33 = (i32 * i32) + (i31 * i31);
                                        if (i33 < i30) {
                                            i30 = i33;
                                        }
                                    }
                                }
                                iArr3[(i29 * 288) + i27] = ga.f34611b[i30];
                                i29++;
                                i16 = 0;
                                i20 = 287;
                            }
                            i27++;
                            i16 = 0;
                            i20 = 287;
                        }
                        int i34 = 0;
                        while (i34 < 82944) {
                            int i35 = iArr[i34];
                            int i36 = i35 >>> 24;
                            int max2 = Math.max(iArr3[i34], i36);
                            if (i36 != 255) {
                                if (i36 == 0) {
                                    i35 = (max2 << 24) | 16777215;
                                } else {
                                    int i37 = ((255 - i36) * max2) / 255;
                                    int i38 = i36 + i37;
                                    int i39 = i37 * 255;
                                    c10 = c11;
                                    i35 = ((((i35 & 255) * i36) + i39) / i38) | ((((((i35 >> 8) & 255) * i36) + i39) / i38) << 8) | (i38 << 24) | ((((((i35 >> 16) & 255) * i36) + i39) / i38) << 16);
                                    iArr2[i34] = i35;
                                    i34++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i34] = i35;
                            i34++;
                            c11 = c10;
                        }
                        if (z15) {
                            int i40 = 0;
                            for (int i41 = 0; i41 < 82944; i41 += 7) {
                                if ((iArr2[i41] >>> 24) > 0) {
                                    i40++;
                                }
                            }
                            if (i40 > 592) {
                                Bitmap createBitmap = Bitmap.createBitmap(iArr2, 288, 288, Bitmap.Config.ARGB_8888);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 128, 128, z18);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                Bitmap createBitmap2 = Bitmap.createBitmap(176, 176, Bitmap.Config.ALPHA_8);
                                Paint paint = new Paint(z18 ? 1 : 0);
                                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                                new Canvas(createBitmap2).drawBitmap(extractAlpha, 24.0f, 24.0f, paint);
                                createBitmap.recycle();
                                createScaledBitmap.recycle();
                                extractAlpha.recycle();
                                bitmap = createBitmap2;
                                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g(g8Var, iArr2, bitmap, 20));
                                return;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.g(g8Var, iArr2, bitmap, 20));
                        return;
                    }
                }
            default:
                e4 e4Var = (e4) this.f7891c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                r20 r20Var = (r20) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f7892f;
                boolean z19 = this.f7890b;
                TLObject tLObject3 = (TLObject) this.h;
                if (e4Var.getContext() != null) {
                    if (tL_error4 != null && r20Var != null && tL_error4.text.startsWith("TMP_PASSWORD")) {
                        r20Var.a(Boolean.TRUE);
                        return;
                    }
                    if (r20Var != null) {
                        r20Var.a(Boolean.FALSE);
                    }
                    if (tL_error4 != null) {
                        e4Var.Q1(tL_error4, twoStepVerificationActivity2, z19);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                        twoStepVerificationActivity2.finishFragment();
                    }
                    if (tLObject3 instanceof TL_stars.starGiftWithdrawalUrl) {
                        gf.f.t(e4Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject3).url);
                        return;
                    } else if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                        TL_stars.TL_starGiftUnique H1 = e4Var.H1();
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(e4Var.f21584a);
                        org.telegram.ui.Wallet.h hVar = x10.f34802z;
                        if (H1 != null) {
                            str = H1.gift_address;
                        } else {
                            str = null;
                        }
                        org.telegram.messenger.i0.r(hVar);
                        x10.f34800x = str;
                        x10.f34801y = 0;
                        if (x10.f34792o == null) {
                            x10.f34792o = new org.telegram.ui.Wallet.c0(x10);
                        }
                        org.telegram.ui.Wallet.c0 c0Var = x10.f34792o;
                        if (!c0Var.f34304j) {
                            c0Var.b();
                            c0Var.f(true);
                        }
                        x10.B().g();
                        x10.E();
                        int i42 = x10.f34801y;
                        long[] jArr = org.telegram.ui.Wallet.k0.P;
                        if (i42 < 7) {
                            x10.f34801y = i42 + 1;
                            org.telegram.messenger.i0.h3(hVar, jArr[i42]);
                        }
                        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                            org.telegram.messenger.i0.g3(new v41((Object) null, H1.getDocument(), dd.L0(2131750110, null), 25));
                        }
                        e4Var.dismiss();
                        return;
                    } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                        cc.b0("NULL_ERROR");
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public h1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, Object obj5, int i10) {
        this.f7889a = i10;
        this.f7891c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7892f = obj4;
        this.f7890b = z10;
        this.h = obj5;
    }

    public h1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f7889a = i10;
        this.f7891c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7890b = z10;
        this.f7892f = obj4;
        this.h = tLObject;
    }

    public h1(un unVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f7889a = 3;
        this.f7891c = unVar;
        this.d = q1Var;
        this.f7890b = z10;
        this.e = str;
        this.f7892f = userArr;
        this.h = characterStyle;
    }
}
