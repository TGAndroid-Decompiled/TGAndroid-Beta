package fi;

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
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.l10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.j40;
public final class t3 implements c20 {
    public final int f12848a;
    public final int f12849b;
    public final Object f12850c;

    public t3(Object obj, int i7, int i10) {
        this.f12848a = i10;
        this.f12850c = obj;
        this.f12849b = i7;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        float f10;
        int i7 = this.f12848a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z10 = false;
        int i10 = this.f12849b;
        Object obj2 = this.f12850c;
        switch (i7) {
            case 0:
                b4 b4Var = (b4) obj2;
                View view = (View) obj;
                w3 w3Var = b4Var.f11667b;
                if (view instanceof a4) {
                    w3Var.getClass();
                    int R = RecyclerView.R(view);
                    w31 G = w3Var.f36781f3.G(R);
                    if (G != null) {
                        a4 a4Var = (a4) view;
                        a4Var.setPosition(b4Var.b(R));
                        if (i10 == G.d) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        a4Var.b(z9, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y5 y5Var = (y5) obj2;
                int[] iArr = (int[]) obj;
                e7 e7Var = y5Var.d;
                int i11 = iArr[0];
                y5Var.U = i11;
                e7Var.A0 = i11;
                int i12 = iArr[1];
                y5Var.V = i12;
                e7Var.B0 = i12;
                y5Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i10, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                y5Var.invalidate();
                g51 g51Var = y5Var.f13179n;
                if (g51Var != null) {
                    int i13 = y5Var.U;
                    int i14 = y5Var.V;
                    ry ryVar = g51Var.f33798b;
                    if (ryVar == null) {
                        g51Var.f33802n = i13;
                        g51Var.f33803r = i14;
                    } else {
                        ryVar.h(i13, i14);
                    }
                }
                sd0 sd0Var = y5Var.f13186s;
                if (sd0Var != null) {
                    int i15 = y5Var.U;
                    int i16 = y5Var.V;
                    ry ryVar2 = sd0Var.f38001l0;
                    if (ryVar2 != null) {
                        ryVar2.h(i15, i16);
                        return;
                    }
                    sd0Var.J0 = i15;
                    sd0Var.K0 = i16;
                    return;
                }
                return;
            case 2:
                kg.q1 q1Var = (kg.q1) ((bi.s) obj2).f4656b;
                kg.q1.c0(q1Var);
                kg.t1.f(kg.q1.h0(q1Var)).k(i10, (String) obj);
                return;
            case 3:
                org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.D1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(maVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624049, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i17 = org.telegram.ui.ActionBar.k6.I6;
                        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.x0(null, i17, false));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
                        imageView.setBackground(L2);
                        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, null);
                        linearLayout.addView((View) imageView, c8.ha.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(hd.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, null);
                        linearLayout.addView(textView, c8.ha.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(hd.a0(null, null, 2131743906, org.telegram.ui.Cells.ma.a((l10) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder j3 = rf.b.j(str2, "• ");
                                j3.append(org.telegram.ui.Cells.ma.a((l10) arrayList.get(i18)));
                                j3.append("\n");
                                str2 = j3.toString();
                            }
                            textView2.setText(hd.a0(null, null, 2131743907, str2));
                        }
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27956j5, null);
                        linearLayout.addView(textView2, c8.ha.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i19 = org.telegram.ui.ActionBar.k6.f28089q7;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i19, false);
                        float f11 = 0.15f;
                        if (org.telegram.ui.ActionBar.k6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.r1(f10, x02));
                        if (org.telegram.ui.ActionBar.k6.I.q()) {
                            f11 = 0.2f;
                        }
                        org.telegram.ui.ActionBar.n6 L4 = org.telegram.ui.ActionBar.r6.L(f11, i19);
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, L4, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.messenger.camera.q.o(textView3, i19, null, null, 2131743902);
                        frameLayout.addView(textView3, c8.ha.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, c8.ha.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        c8.ka.b(dVar, 0.02f, 1.5f);
                        dVar.i(hd.M0(2131749530, null), false, true);
                        linearLayout.addView(dVar, c8.ha.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, maVar.getContext(), null, false);
                        l10.N = linearLayout;
                        l10.show();
                        l10.f28616b0 = false;
                        l10.f28619c0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(l10, 12);
                        org.telegram.messenger.g0.r(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        f2.h hVar = new f2.h(1, dVar, fVar);
                        dVar.J = hVar;
                        org.telegram.messenger.g0.i3(hVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.a3(dVar, l10, 1));
                    } else {
                        org.telegram.messenger.k5.p(null, 2131743880, new hc(org.telegram.ui.Components.xa.a(maVar.getContext()), null), null);
                    }
                }
                maVar.f29579e.a(false, true);
                qp.s1(i10).U1().a();
                return;
            case 4:
                wk wkVar = (wk) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(wkVar.f39994h0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(wkVar.f39994h0.getLongitude());
                tL_messageMediaGeoLive.period = i10;
                wkVar.f40000n0.d(tL_messageMediaGeoLive, wkVar.f40001o0, true, 0, ((Long) obj).longValue());
                wkVar.f38948b.a(true);
                return;
            case 5:
                j40.l1((j40) obj2, i10, (org.telegram.messenger.e3) obj);
                return;
            case 6:
                c20 c20Var = (c20) obj2;
                Long l11 = (Long) obj;
                if (l11 != null && l11.longValue() > 0 && l11.longValue() != Long.MAX_VALUE) {
                    user = qp.s1(i10).a2(l11);
                }
                c20Var.a(user);
                return;
            default:
                org.telegram.ui.Wallet.x9 x9Var = (org.telegram.ui.Wallet.x9) obj2;
                String str3 = (String) obj;
                if (!x9Var.f43344r && i10 == x9Var.J) {
                    x9Var.E = 0;
                    x9Var.L = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    x9Var.f43348y = str;
                    d dVar2 = x9Var.Z;
                    if (dVar2 != null) {
                        if (str != null) {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                    }
                    x9Var.f35844a.f36781f3.O(true);
                    return;
                }
                return;
        }
    }

    public t3(c20 c20Var, int i7) {
        this.f12848a = 6;
        this.f12849b = i7;
        this.f12850c = c20Var;
    }
}
