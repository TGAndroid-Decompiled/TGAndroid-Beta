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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.q20;
import org.telegram.messenger.s5;
import org.telegram.messenger.vp;
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
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.ga;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.ld;
import org.telegram.ui.le;
import org.telegram.ui.un;
import org.telegram.ui.ut;
import org.telegram.ui.wd;
import org.telegram.ui.xs;
import org.telegram.ui.zo;
import rh.e4;
import w7.b6;
public final class h1 implements Runnable {
    public final int f7888a;
    public final boolean f7889b;
    public final Object f7890c;
    public final Object d;
    public final Object e;
    public final Object f7891f;
    public final Object h;

    public h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f7888a = i10;
        this.f7890c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7891f = obj4;
        this.h = obj5;
        this.f7889b = z10;
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
        int i16;
        Bitmap bitmap;
        char c10;
        String str;
        char c11 = '\b';
        boolean z10 = true;
        int i17 = 0;
        switch (this.f7888a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((i1) this.f7890c).f7937b.h.B(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f7891f, (IOException) this.h, this.f7889b);
                return;
            case 1:
                ((CameraController) this.f7890c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.e, (File) this.f7891f, this.f7889b, (Runnable) this.h);
                return;
            case 2:
                le leVar = (le) this.f7890c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                Activity activity = (Activity) this.f7891f;
                boolean z11 = this.f7889b;
                TLObject tLObject = (TLObject) this.h;
                if (tL_error != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error.text)) {
                            ConnectionsManager.getInstance(leVar.f39206o0).sendRequest(new TL_account.getPassword(), new wd(leVar, twoStepVerificationActivity, z11, 0), 8);
                            return;
                        }
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.s0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        cc.d0(tL_error);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f20134a.R = cd.L0(2131751298, null);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i18 = t6.f21037j5;
                    a7.V(textView, i18, null);
                    textView.setTextSize(1, 16.0f);
                    if (cd.X) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    textView.setText(org.telegram.messenger.i0.W2(cd.L0(2131742889, null)));
                    linearLayout.addView(textView, b6.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(2131231624);
                    if (cd.X) {
                        i11 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int L3 = org.telegram.messenger.i0.L(9.0f);
                    if (cd.X) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.i0.L(11.0f);
                    }
                    imageView.setPadding(i11, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    a7.t(imageView, i18, null, mode);
                    TextView textView2 = new TextView(activity);
                    a7.V(textView2, i18, null);
                    textView2.setTextSize(1, 16.0f);
                    if (cd.X) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    textView2.setText(org.telegram.messenger.i0.W2(cd.L0(2131751301, null)));
                    if (cd.X) {
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
                    if (cd.X) {
                        i13 = org.telegram.messenger.i0.L(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int L4 = org.telegram.messenger.i0.L(9.0f);
                    if (cd.X) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.i0.L(11.0f);
                    }
                    imageView2.setPadding(i13, L4, L2, 0);
                    a7.t(imageView2, i18, null, mode);
                    TextView textView3 = new TextView(activity);
                    a7.V(textView3, i18, null);
                    textView3.setTextSize(1, 16.0f);
                    if (cd.X) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    textView3.setText(org.telegram.messenger.i0.W2(cd.L0(2131751300, null)));
                    if (cd.X) {
                        e.addView(textView3, b6.o(-1, -2));
                        i15 = 5;
                        e.addView(imageView2, b6.r(-2, -2, 5));
                    } else {
                        i15 = 5;
                        e.addView(imageView2, b6.o(-2, -2));
                        e.addView(textView3, b6.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder.k(cd.L0(2131751292, null), new ld(leVar));
                        alertDialog$Builder.h(cd.L0(2131752589, null), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        a7.V(textView4, i18, null);
                        textView4.setTextSize(1, 16.0f);
                        if (cd.X) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        m5.l(textView4, i16 | 48, null, 2131751299);
                        linearLayout.addView(textView4, b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(cd.L0(2131747847, null), null);
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.showDialog(alertDialog$Builder.f20134a);
                        return;
                    } else {
                        leVar.m0.showDialog(alertDialog$Builder.f20134a);
                        return;
                    }
                }
                twoStepVerificationActivity.s0();
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
                un.a0((un) this.f7890c, (org.telegram.ui.Cells.q1) this.d, this.f7889b, (String) this.e, (TLRPC.User[]) this.f7891f, (CharacterStyle) this.h);
                return;
            case 4:
                un unVar = (un) this.f7890c;
                x1 x1Var = (x1) this.d;
                boolean[] zArr = (boolean[]) this.e;
                boolean z12 = this.f7889b;
                jj jjVar = (jj) this.f7891f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    x1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        unVar.createArticleViewer(false).L(jjVar, webPage, null, null);
                        return;
                    }
                    try {
                        org.telegram.messenger.i0.u2(jjVar, unVar.getParentActivity(), unVar.f42477xa, false);
                        return;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        unVar.G6(jjVar);
                        return;
                    }
                }
                return;
            case 5:
                zo zoVar = (zo) this.f7890c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f7891f;
                boolean z13 = this.f7889b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                bp bpVar = zoVar.f44204a;
                cp cpVar = bpVar.f36291h3;
                cpVar.P.remove(((TLRPC.TL_channels_toggleUsername) this.d).username);
                if (((TLObject) this.e) instanceof TLRPC.TL_boolTrue) {
                    bpVar.z1(tL_username, !z13, false);
                } else if (tL_error2 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error2.text)) {
                    org.telegram.messenger.i0.g3(new ag.j0(zoVar, tL_username, z13, 13));
                } else {
                    bpVar.z1(tL_username, z13, true);
                    cpVar.a0();
                }
                cpVar.getMessagesController().q5(cpVar.X, tL_username.username, tL_username.active);
                return;
            case 6:
                ((vy) this.f7890c).K((fh.a) this.d, (TLObject) this.e, (TLRPC.StickerSet) this.f7891f, (TLRPC.Document) this.h, this.f7889b, true);
                return;
            case 7:
                ut utVar = (ut) this.f7890c;
                TLObject tLObject2 = (TLObject) this.d;
                vh.d dVar = (vh.d) this.e;
                boolean z14 = this.f7889b;
                HashSet hashSet = (HashSet) this.f7891f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    vp.r1(utVar.f21583a).V3(updates.users, false);
                    vp.r1(utVar.f21583a).P3(updates.chats, false);
                    ArrayList y02 = vp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i19 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i19 < size) {
                        Object obj = y02.get(i19);
                        i19++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new xs(3, utVar, updates));
                    if (groupCall != null && LaunchActivity.I1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19810id = groupCall.f19803id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        utVar.dismiss();
                        org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, utVar.f21583a, tL_inputGroupCall, z14, groupCall, hashSet);
                        return;
                    }
                    utVar.U1 = false;
                    dVar.setLoading(false);
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    vp.r1(utVar.f21583a).V3(groupcall.users, false);
                    vp.r1(utVar.f21583a).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 == null) {
                        utVar.U1 = false;
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f19810id = groupCall2.f19803id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    utVar.dismiss();
                    org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, utVar.f21583a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                    return;
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.s(utVar.E, utVar.I0, tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 8:
                g8 g8Var = (g8) this.f7890c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.f7891f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.f7889b;
                s5 s5Var = ga.f34604a;
                int i20 = 0;
                while (true) {
                    int i21 = 287;
                    if (i20 < 288) {
                        int i22 = i20 * 288;
                        int i23 = 8;
                        int i24 = 0;
                        while (i24 < 288) {
                            int i25 = i22 + i24;
                            boolean z16 = z10;
                            if ((iArr[i25] >>> 24) >= 128) {
                                i23 = 0;
                            } else {
                                i23 = Math.min(i23 + 1, 8);
                            }
                            iArr3[i25] = i23;
                            i24++;
                            z10 = z16;
                        }
                        boolean z17 = z10;
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
                        z10 = z17;
                    } else {
                        boolean z18 = z10;
                        int i28 = 0;
                        while (i28 < 288) {
                            for (int i29 = i17; i29 < 288; i29++) {
                                iArr4[i29] = iArr3[(i29 * 288) + i28];
                            }
                            int i30 = i17;
                            while (i30 < 288) {
                                int min = Math.min(i21, i30 + 8);
                                int i31 = 128;
                                for (int max = Math.max(i17, i30 - 8); max <= min; max++) {
                                    int i32 = iArr4[max];
                                    if (i32 < 8) {
                                        int i33 = max - i30;
                                        int i34 = (i33 * i33) + (i32 * i32);
                                        if (i34 < i31) {
                                            i31 = i34;
                                        }
                                    }
                                }
                                iArr3[(i30 * 288) + i28] = ga.f34605b[i31];
                                i30++;
                                i17 = 0;
                                i21 = 287;
                            }
                            i28++;
                            i17 = 0;
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
                e4 e4Var = (e4) this.f7890c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                q20 q20Var = (q20) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f7891f;
                boolean z19 = this.f7889b;
                TLObject tLObject3 = (TLObject) this.h;
                if (e4Var.getContext() != null) {
                    if (tL_error4 != null && q20Var != null && tL_error4.text.startsWith("TMP_PASSWORD")) {
                        q20Var.a(Boolean.TRUE);
                        return;
                    }
                    if (q20Var != null) {
                        q20Var.a(Boolean.FALSE);
                    }
                    if (tL_error4 != null) {
                        e4Var.Q1(tL_error4, twoStepVerificationActivity2, z19);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.s0();
                        twoStepVerificationActivity2.finishFragment();
                    }
                    if (tLObject3 instanceof TL_stars.starGiftWithdrawalUrl) {
                        gf.f.t(e4Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject3).url);
                        return;
                    } else if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                        TL_stars.TL_starGiftUnique H1 = e4Var.H1();
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(e4Var.f21583a);
                        org.telegram.ui.Wallet.h hVar = x10.f34797z;
                        if (H1 != null) {
                            str = H1.gift_address;
                        } else {
                            str = null;
                        }
                        org.telegram.messenger.i0.r(hVar);
                        x10.f34795x = str;
                        x10.f34796y = 0;
                        if (x10.f34787o == null) {
                            x10.f34787o = new org.telegram.ui.Wallet.c0(x10);
                        }
                        org.telegram.ui.Wallet.c0 c0Var = x10.f34787o;
                        if (!c0Var.f34302j) {
                            c0Var.b();
                            c0Var.f(true);
                        }
                        x10.B().g();
                        x10.E();
                        int i43 = x10.f34796y;
                        long[] jArr = org.telegram.ui.Wallet.k0.P;
                        if (i43 < 7) {
                            x10.f34796y = i43 + 1;
                            org.telegram.messenger.i0.h3(hVar, jArr[i43]);
                        }
                        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
                            org.telegram.messenger.i0.g3(new u41((Object) null, H1.getDocument(), cd.L0(2131750110, null), 25));
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
        this.f7888a = i10;
        this.f7890c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7891f = obj4;
        this.f7889b = z10;
        this.h = obj5;
    }

    public h1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, TLObject tLObject, int i10) {
        this.f7888a = i10;
        this.f7890c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7889b = z10;
        this.f7891f = obj4;
        this.h = tLObject;
    }

    public h1(un unVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f7888a = 3;
        this.f7890c = unVar;
        this.d = q1Var;
        this.f7889b = z10;
        this.e = str;
        this.f7891f = userArr;
        this.h = characterStyle;
    }
}
