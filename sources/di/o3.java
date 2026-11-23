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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.qy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bd;
import org.telegram.ui.bn;
import org.telegram.ui.fo;
import org.telegram.ui.ho;
import org.telegram.ui.io;
import org.telegram.ui.vs;
import org.telegram.ui.xd;
public final class o3 implements Runnable {
    public final int f9415a;
    public final boolean f9416b;
    public final Object f9417c;
    public final Object d;
    public final Object f9418e;
    public final Object f9419f;
    public final Object h;

    public o3(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f9415a = i7;
        this.f9417c = obj;
        this.d = obj2;
        this.f9418e = obj3;
        this.f9419f = obj4;
        this.f9416b = z10;
        this.h = obj5;
    }

    @Override
    public final void run() {
        String str;
        String str2;
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
        switch (this.f9415a) {
            case 0:
                f6 f6Var = (f6) this.f9417c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                w10 w10Var = (w10) this.f9418e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f9419f;
                boolean z10 = this.f9416b;
                TLObject tLObject = (TLObject) this.h;
                long j3 = f6Var.T1;
                if (f6Var.getContext() != null) {
                    if (tL_error != null && w10Var != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                        w10Var.a(Boolean.TRUE);
                        return;
                    }
                    if (w10Var != null) {
                        w10Var.a(Boolean.FALSE);
                    }
                    if (tL_error != null) {
                        f6Var.Y1(tL_error, twoStepVerificationActivity, z10);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                        vf.c.v(f6Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url, false);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                        TL_stars.TL_starGiftUnique M1 = f6Var.M1();
                        org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(f6Var.f30223a);
                        if (M1 != null) {
                            str = M1.gift_address;
                        } else {
                            str = null;
                        }
                        if (M1 != null) {
                            str2 = M1.slug;
                        } else {
                            str2 = null;
                        }
                        org.telegram.ui.Wallet.h hVar = D.B;
                        org.telegram.messenger.g0.r(hVar);
                        D.f45276y = str;
                        D.f45277z = str2;
                        D.A = 0;
                        D.B().e();
                        D.H().g();
                        D.K();
                        int i17 = D.A;
                        long[] jArr = org.telegram.ui.Wallet.v0.S;
                        if (i17 < 7) {
                            D.A = i17 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i17]);
                        }
                        long e10 = i10.i(f6Var.f30223a).e();
                        y8.y(f6Var.f30223a, false).O(e10);
                        if (j3 != 0 && j3 != e10) {
                            y8.y(f6Var.f30223a, false).O(j3);
                        }
                        if (M1 != null && !TextUtils.isEmpty(M1.slug)) {
                            int i18 = f6Var.f30223a;
                            String str3 = M1.slug;
                            if (!TextUtils.isEmpty(str3)) {
                                org.telegram.messenger.g0.h3(new bi.u4(i18, 0, str3, true), bi.a5.f3355b[0]);
                            }
                            org.telegram.messenger.g0.g3(new aa.r((Object) new ai.k(8), (Object) M1.getDocument(), (Object) gd.N0(2131750084, null), 24));
                        }
                        f6Var.dismiss();
                        return;
                    } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                        org.telegram.ui.Components.kc.c0("NULL_ERROR");
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) this.d;
                ((l2.d1) this.f9417c).f19374b.h.r(((Integer) pair.first).intValue(), (x2.g0) pair.second, (x2.u) this.f9418e, (x2.c0) this.f9419f, (IOException) this.h, this.f9416b);
                return;
            case 2:
                ((CameraController) this.f9417c).lambda$recordVideo$13(this.d, (CameraController.ICameraView) this.f9418e, (File) this.f9419f, this.f9416b, (Runnable) this.h);
                return;
            case 3:
                xd xdVar = (xd) this.f9417c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f9419f;
                Activity activity = (Activity) this.f9418e;
                boolean z11 = this.f9416b;
                TLObject tLObject2 = (TLObject) this.h;
                if (tL_error2 != null) {
                    if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                        if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                            ConnectionsManager.getInstance(xdVar.f53935p0).sendRequest(new TL_account.getPassword(), new o8(xdVar, twoStepVerificationActivity2, z11, 3), 8);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        org.telegram.ui.Components.kc.e0(tL_error2);
                        return;
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    alertDialog$Builder.f28835a.S = gd.N0(2131751285, null);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    TextView textView = new TextView(activity);
                    int i19 = org.telegram.ui.ActionBar.n6.f29559j5;
                    org.telegram.ui.ActionBar.u6.U(textView, i19, null);
                    textView.setTextSize(1, 16.0f);
                    if (gd.f24314a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131742593, null)));
                    linearLayout.addView(textView, c8.na.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageResource(2131231627);
                    if (gd.f24314a0) {
                        i10 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i10 = 0;
                    }
                    int L3 = org.telegram.messenger.g0.L(9.0f);
                    if (gd.f24314a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView.setPadding(i10, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.u6.s(imageView, i19, null, mode);
                    TextView textView2 = new TextView(activity);
                    org.telegram.ui.ActionBar.u6.U(textView2, i19, null);
                    textView2.setTextSize(1, 16.0f);
                    if (gd.f24314a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 48);
                    textView2.setText(org.telegram.messenger.g0.W2(gd.N0(2131751288, null)));
                    if (gd.f24314a0) {
                        linearLayout2.addView(textView2, c8.na.o(-1, -2));
                        linearLayout2.addView(imageView, c8.na.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, c8.na.o(-2, -2));
                        linearLayout2.addView(textView2, c8.na.o(-1, -2));
                    }
                    LinearLayout f10 = org.telegram.messenger.f3.f(activity, 0);
                    linearLayout.addView(f10, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(activity);
                    imageView2.setImageResource(2131231627);
                    if (gd.f24314a0) {
                        i12 = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        i12 = 0;
                    }
                    int L4 = org.telegram.messenger.g0.L(9.0f);
                    if (gd.f24314a0) {
                        L2 = 0;
                    } else {
                        L2 = org.telegram.messenger.g0.L(11.0f);
                    }
                    imageView2.setPadding(i12, L4, L2, 0);
                    org.telegram.ui.ActionBar.u6.s(imageView2, i19, null, mode);
                    TextView textView3 = new TextView(activity);
                    org.telegram.ui.ActionBar.u6.U(textView3, i19, null);
                    textView3.setTextSize(1, 16.0f);
                    if (gd.f24314a0) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    textView3.setGravity(i13 | 48);
                    textView3.setText(org.telegram.messenger.g0.W2(gd.N0(2131751287, null)));
                    if (gd.f24314a0) {
                        f10.addView(textView3, c8.na.o(-1, -2));
                        i14 = 5;
                        f10.addView(imageView2, c8.na.r(-2, -2, 5));
                    } else {
                        i14 = 5;
                        f10.addView(imageView2, c8.na.o(-2, -2));
                        f10.addView(textView3, c8.na.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                        alertDialog$Builder.k(gd.N0(2131751279, null), new bd(xdVar));
                        alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    } else {
                        TextView textView4 = new TextView(activity);
                        org.telegram.ui.ActionBar.u6.U(textView4, i19, null);
                        textView4.setTextSize(1, 16.0f);
                        if (gd.f24314a0) {
                            i15 = i14;
                        } else {
                            i15 = 3;
                        }
                        org.telegram.messenger.f3.k(textView4, i15 | 48, null, 2131751286);
                        linearLayout.addView(textView4, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder.h(gd.N0(2131747637, null), null);
                    }
                    if (twoStepVerificationActivity2 != null) {
                        twoStepVerificationActivity2.showDialog(alertDialog$Builder.f28835a);
                        return;
                    } else {
                        xdVar.f53932n0.showDialog(alertDialog$Builder.f28835a);
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
                bn.X0((bn) this.f9417c, (org.telegram.ui.Cells.r1) this.d, this.f9416b, (String) this.f9418e, (TLRPC.User[]) this.f9419f, (CharacterStyle) this.h);
                return;
            case 5:
                bn bnVar = (bn) this.f9417c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                boolean[] zArr = (boolean[]) this.f9418e;
                boolean z12 = this.f9416b;
                fj fjVar = (fj) this.f9419f;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.h;
                try {
                    t1Var.dismiss();
                } catch (Throwable unused) {
                }
                if (!zArr[0]) {
                    if (z12) {
                        bnVar.createArticleViewer(false).L(fjVar, webPage, null, null);
                        return;
                    }
                    try {
                        org.telegram.messenger.g0.u2(fjVar, bnVar.getParentActivity(), bnVar.Ba, false);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        bnVar.M6(fjVar);
                        return;
                    }
                }
                return;
            case 6:
                fo foVar = (fo) this.f9417c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f9419f;
                boolean z13 = this.f9416b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                ho hoVar = foVar.f47938a;
                io ioVar = hoVar.f48602i3;
                ioVar.Q.remove(((TLRPC.TL_channels_toggleUsername) this.f9418e).username);
                if (((TLObject) this.h) instanceof TLRPC.TL_boolTrue) {
                    hoVar.z1(tL_username, !z13, false);
                } else if (tL_error3 != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error3.text)) {
                    org.telegram.messenger.g0.g3(new p6(foVar, tL_username, z13, 16));
                } else {
                    hoVar.z1(tL_username, z13, true);
                    ioVar.b0();
                }
                ioVar.getMessagesController().F5(ioVar.Y, tL_username.username, tL_username.active);
                return;
            case 7:
                ((qy) this.f9417c).J((ph.a) this.d, (TLObject) this.h, (TLRPC.StickerSet) this.f9418e, (TLRPC.Document) this.f9419f, this.f9416b, true);
                return;
            case 8:
                vs vsVar = (vs) this.f9417c;
                TLObject tLObject3 = (TLObject) this.h;
                hi.e eVar = (hi.e) this.f9418e;
                boolean z14 = this.f9416b;
                HashSet hashSet = (HashSet) this.f9419f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    mp.u1(vsVar.f30223a).f4(updates.users, false);
                    mp.u1(vsVar.f30223a).Z3(updates.chats, false);
                    ArrayList A0 = mp.A0(updates, TL_update.TL_updateGroupCall.class);
                    int size = A0.size();
                    int i20 = 0;
                    TLRPC.GroupCall groupCall = null;
                    while (i20 < size) {
                        Object obj = A0.get(i20);
                        i20++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.ui.Components.voip.o(6, vsVar, updates));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f28509id = groupCall.f28502id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        vsVar.dismiss();
                        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, vsVar.f30223a, tL_inputGroupCall, z14, groupCall, hashSet);
                        return;
                    }
                    vsVar.Y1 = false;
                    eVar.setLoading(false);
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    mp.u1(vsVar.f30223a).f4(groupcall.users, false);
                    mp.u1(vsVar.f30223a).Z3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        vsVar.Y1 = false;
                        eVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f28509id = groupCall2.f28502id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    vsVar.dismiss();
                    org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, vsVar.f30223a, tL_inputGroupCall2, z14, groupcall.call, hashSet);
                    return;
                } else if (tL_error4 != null) {
                    org.telegram.ui.Cells.c0.t(vsVar.F, vsVar.J0, tL_error4, false);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) this.f9417c;
                int[] iArr = (int[]) this.d;
                int[] iArr2 = (int[]) this.f9418e;
                int[] iArr3 = (int[]) this.f9419f;
                int[] iArr4 = (int[]) this.h;
                boolean z15 = this.f9416b;
                org.telegram.messenger.r5 r5Var = org.telegram.ui.Wallet.ta.f45199a;
                int i21 = 0;
                while (true) {
                    int i22 = 287;
                    if (i21 < 288) {
                        int i23 = i21 * 288;
                        int i24 = 8;
                        for (int i25 = 0; i25 < 288; i25++) {
                            int i26 = i23 + i25;
                            if ((iArr[i26] >>> 24) >= 128) {
                                i24 = 0;
                            } else {
                                i24 = Math.min(i24 + 1, 8);
                            }
                            iArr3[i26] = i24;
                        }
                        int i27 = 8;
                        while (i22 >= 0) {
                            int i28 = i23 + i22;
                            if (iArr3[i28] == 0) {
                                i27 = 0;
                            } else {
                                i27 = Math.min(i27 + 1, 8);
                            }
                            if (i27 < iArr3[i28]) {
                                iArr3[i28] = i27;
                            }
                            i22--;
                        }
                        i21++;
                    } else {
                        int i29 = 0;
                        while (i29 < 288) {
                            for (int i30 = i16; i30 < 288; i30++) {
                                iArr4[i30] = iArr3[(i30 * 288) + i29];
                            }
                            int i31 = i16;
                            while (i31 < 288) {
                                int min = Math.min(i22, i31 + 8);
                                int i32 = 128;
                                for (int max = Math.max(i16, i31 - 8); max <= min; max++) {
                                    int i33 = iArr4[max];
                                    if (i33 < 8) {
                                        int i34 = max - i31;
                                        int i35 = (i34 * i34) + (i33 * i33);
                                        if (i35 < i32) {
                                            i32 = i35;
                                        }
                                    }
                                }
                                iArr3[(i31 * 288) + i29] = org.telegram.ui.Wallet.ta.f45200b[i32];
                                i31++;
                                i16 = 0;
                                i22 = 287;
                            }
                            i29++;
                            i16 = 0;
                            i22 = 287;
                        }
                        int i36 = 0;
                        while (i36 < 82944) {
                            int i37 = iArr[i36];
                            int i38 = i37 >>> 24;
                            int max2 = Math.max(iArr3[i36], i38);
                            if (i38 != 255) {
                                if (i38 == 0) {
                                    i37 = (max2 << 24) | 16777215;
                                } else {
                                    int i39 = ((255 - i38) * max2) / 255;
                                    int i40 = i38 + i39;
                                    int i41 = i39 * 255;
                                    c10 = c11;
                                    i37 = ((((i37 & 255) * i38) + i41) / i40) | ((((((i37 >> 8) & 255) * i38) + i41) / i40) << 8) | (i40 << 24) | ((((((i37 >> 16) & 255) * i38) + i41) / i40) << 16);
                                    iArr2[i36] = i37;
                                    i36++;
                                    c11 = c10;
                                }
                            }
                            c10 = c11;
                            iArr2[i36] = i37;
                            i36++;
                            c11 = c10;
                        }
                        if (z15) {
                            int i42 = 0;
                            for (int i43 = 0; i43 < 82944; i43 += 7) {
                                if ((iArr2[i43] >>> 24) > 0) {
                                    i42++;
                                }
                            }
                            if (i42 > 592) {
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
                                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p(r8Var, iArr2, bitmap, 21));
                                return;
                            }
                        }
                        bitmap = null;
                        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p(r8Var, iArr2, bitmap, 21));
                        return;
                    }
                }
        }
    }

    public o3(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z10, int i7) {
        this.f9415a = i7;
        this.f9417c = obj;
        this.d = obj2;
        this.f9418e = obj3;
        this.f9419f = obj4;
        this.h = serializable;
        this.f9416b = z10;
    }

    public o3(xd xdVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, TLObject tLObject) {
        this.f9415a = 3;
        this.f9417c = xdVar;
        this.d = tL_error;
        this.f9419f = twoStepVerificationActivity;
        this.f9418e = activity;
        this.f9416b = z10;
        this.h = tLObject;
    }

    public o3(bn bnVar, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, boolean z10, fj fjVar, TLRPC.TL_webPage tL_webPage) {
        this.f9415a = 5;
        this.f9417c = bnVar;
        this.d = t1Var;
        this.f9418e = zArr;
        this.f9416b = z10;
        this.f9419f = fjVar;
        this.h = tL_webPage;
    }

    public o3(bn bnVar, org.telegram.ui.Cells.r1 r1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        this.f9415a = 4;
        this.f9417c = bnVar;
        this.d = r1Var;
        this.f9416b = z10;
        this.f9418e = str;
        this.f9419f = userArr;
        this.h = characterStyle;
    }

    public o3(fo foVar, TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z10, TLRPC.TL_error tL_error) {
        this.f9415a = 6;
        this.f9417c = foVar;
        this.f9418e = tL_channels_toggleUsername;
        this.h = tLObject;
        this.f9419f = tL_username;
        this.f9416b = z10;
        this.d = tL_error;
    }

    public o3(qy qyVar, ph.a aVar, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z10) {
        this.f9415a = 7;
        this.f9417c = qyVar;
        this.d = aVar;
        this.h = tLObject;
        this.f9418e = stickerSet;
        this.f9419f = document;
        this.f9416b = z10;
    }

    public o3(vs vsVar, TLObject tLObject, hi.e eVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        this.f9415a = 8;
        this.f9417c = vsVar;
        this.h = tLObject;
        this.f9418e = eVar;
        this.f9416b = z10;
        this.f9419f = hashSet;
        this.d = tL_error;
    }
}
