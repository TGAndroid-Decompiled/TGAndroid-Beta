package ai;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.v3;
import bi.x4;
import c8.ja;
import c8.na;
import fi.f6;
import hi.d7;
import hi.w3;
import hi.x3;
import hi.x5;
import java.util.ArrayList;
import org.telegram.messenger.e3;
import org.telegram.messenger.hd;
import org.telegram.messenger.i10;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.z9;
import org.telegram.ui.j40;
public final class x1 implements z10 {
    public final int f1621a;
    public final int f1622b;
    public final Object f1623c;

    public x1(Object obj, int i7, int i10) {
        this.f1621a = i10;
        this.f1623c = obj;
        this.f1622b = i7;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        float f10;
        int i7 = this.f1621a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z11 = false;
        int i10 = this.f1622b;
        Object obj2 = this.f1623c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj;
                b2 b2Var = ((w1) obj2).f1611b;
                b2Var.Y = false;
                if (i10 == b2Var.f1131a0) {
                    b2Var.f1136d0 = num.intValue();
                    return;
                }
                return;
            case 1:
                x3 x3Var = (x3) obj2;
                View view = (View) obj;
                v3 v3Var = x3Var.f15326b;
                if (view instanceof w3) {
                    v3Var.getClass();
                    int R = RecyclerView.R(view);
                    b41 G = v3Var.f39895g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view;
                        w3Var.setPosition(x3Var.b(R));
                        if (i10 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w3Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                x5 x5Var = (x5) obj2;
                int[] iArr = (int[]) obj;
                d7 d7Var = x5Var.d;
                int i11 = iArr[0];
                x5Var.V = i11;
                d7Var.A0 = i11;
                int i12 = iArr[1];
                x5Var.W = i12;
                d7Var.B0 = i12;
                x5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i10, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                x5Var.invalidate();
                k51 k51Var = x5Var.f15355n;
                if (k51Var != null) {
                    int i13 = x5Var.V;
                    int i14 = x5Var.W;
                    wy wyVar = k51Var.f36290b;
                    if (wyVar == null) {
                        k51Var.f36294n = i13;
                        k51Var.f36295r = i14;
                    } else {
                        wyVar.h(i13, i14);
                    }
                }
                td0 td0Var = x5Var.f15362s;
                if (td0Var != null) {
                    int i15 = x5Var.V;
                    int i16 = x5Var.W;
                    wy wyVar2 = td0Var.m0;
                    if (wyVar2 != null) {
                        wyVar2.h(i15, i16);
                        return;
                    }
                    td0Var.K0 = i15;
                    td0Var.L0 = i16;
                    return;
                }
                return;
            case 3:
                kg.r1 r1Var = (kg.r1) ((x4) obj2).f3983b;
                kg.r1.c0(r1Var);
                kg.v1.f(kg.r1.h0(r1Var)).k(i10, (String) obj);
                return;
            case 4:
                ma maVar = (ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(maVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624050, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i17 = j6.I6;
                        ShapeDrawable L2 = j6.L(L, j6.x0(null, i17, false));
                        m6 M = q6.M(i17);
                        imageView.setBackground(L2);
                        q6.j(imageView, L2, M, null, null);
                        linearLayout.addView((View) imageView, ja.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(hd.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        q6.U(textView, j6.f28957j5, null);
                        linearLayout.addView(textView, ja.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(hd.a0(null, null, 2131743905, ma.a((i10) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder m10 = r.b.m(str2, "• ");
                                m10.append(ma.a((i10) arrayList.get(i18)));
                                m10.append("\n");
                                str2 = m10.toString();
                            }
                            textView2.setText(hd.a0(null, null, 2131743906, str2));
                        }
                        q6.U(textView2, j6.f28957j5, null);
                        linearLayout.addView(textView2, ja.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i19 = j6.f29090q7;
                        int x02 = j6.x0(null, i19, false);
                        float f11 = 0.15f;
                        if (j6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        Drawable d02 = j6.d0(L3, j6.r1(f10, x02));
                        if (j6.I.q()) {
                            f11 = 0.2f;
                        }
                        m6 K = q6.K(f11, i19);
                        frameLayout.setBackground(d02);
                        q6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        i20.q(textView3, i19, null, null, 2131743901);
                        frameLayout.addView(textView3, ja.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, ja.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.d dVar = new hi.d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        na.b(dVar, 0.02f, 1.5f);
                        dVar.i(hd.M0(2131749531, null), false, true);
                        linearLayout.addView(dVar, ja.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.u2 k10 = k5.k(1, maVar.getContext(), null, false);
                        k10.O = linearLayout;
                        k10.show();
                        k10.f29686c0 = false;
                        k10.f29688d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(k10, 13);
                        org.telegram.messenger.g0.r(dVar.K);
                        dVar.setCountFilled(false);
                        dVar.J = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        f6 f6Var = new f6(26, dVar, fVar);
                        dVar.K = f6Var;
                        org.telegram.messenger.g0.i3(f6Var, 1000L);
                        dVar.setOnClickListener(new a3(dVar, k10, 1));
                    } else {
                        k5.o(null, 2131743879, new cc(ta.a(maVar.getContext()), null), null);
                    }
                }
                maVar.f30701e.a(false, true);
                np.s1(i10).U1().a();
                return;
            case 5:
                dl dlVar = (dl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(dlVar.f33982i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(dlVar.f33982i0.getLongitude());
                tL_messageMediaGeoLive.period = i10;
                dlVar.f33988o0.d(tL_messageMediaGeoLive, dlVar.f33989p0, true, 0, ((Long) obj).longValue());
                dlVar.f33607b.a(true);
                return;
            case 6:
                j40.l1((j40) obj2, i10, (e3) obj);
                return;
            case 7:
                z10 z10Var = (z10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = np.s1(i10).a2(l10);
                }
                z10Var.a(user);
                return;
            default:
                z9 z9Var = (z9) obj2;
                String str3 = (String) obj;
                if (!z9Var.f44861r && i10 == z9Var.K) {
                    z9Var.F = 0;
                    z9Var.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    z9Var.f44865y = str;
                    hi.d dVar2 = z9Var.f44853a0;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    z9Var.f38882a.f39895g3.O(true);
                    return;
                }
                return;
        }
    }

    public x1(z10 z10Var, int i7) {
        this.f1621a = 7;
        this.f1622b = i7;
        this.f1623c = z10Var;
    }
}
