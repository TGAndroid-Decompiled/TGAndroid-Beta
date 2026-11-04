package gi;

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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.d10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.uk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e40;
public final class s3 implements u10 {
    public final int f13554a;
    public final int f13555b;
    public final Object f13556c;

    public s3(Object obj, int i3, int i10) {
        this.f13554a = i10;
        this.f13556c = obj;
        this.f13555b = i3;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i3;
        float f10;
        int i10 = this.f13554a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z11 = false;
        int i11 = this.f13555b;
        Object obj2 = this.f13556c;
        switch (i10) {
            case 0:
                y3 y3Var = (y3) obj2;
                View view = (View) obj;
                ai.h4 h4Var = y3Var.f13923b;
                if (view instanceof x3) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view);
                    r31 G = h4Var.f35594g3.G(R);
                    if (G != null) {
                        x3 x3Var = (x3) view;
                        x3Var.setPosition(y3Var.b(R));
                        if (i11 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x3Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y5 y5Var = (y5) obj2;
                int[] iArr = (int[]) obj;
                f7 f7Var = y5Var.d;
                int i12 = iArr[0];
                y5Var.V = i12;
                f7Var.A0 = i12;
                int i13 = iArr[1];
                y5Var.W = i13;
                f7Var.B0 = i13;
                y5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                y5Var.invalidate();
                b51 b51Var = y5Var.f13953n;
                if (b51Var != null) {
                    int i14 = y5Var.V;
                    int i15 = y5Var.W;
                    py pyVar = b51Var.f32088b;
                    if (pyVar == null) {
                        b51Var.f32092n = i14;
                        b51Var.f32093r = i15;
                    } else {
                        pyVar.h(i14, i15);
                    }
                }
                nd0 nd0Var = y5Var.f13960s;
                if (nd0Var != null) {
                    int i16 = y5Var.V;
                    int i17 = y5Var.W;
                    py pyVar2 = nd0Var.m0;
                    if (pyVar2 != null) {
                        pyVar2.h(i16, i17);
                        return;
                    }
                    nd0Var.K0 = i16;
                    nd0Var.L0 = i17;
                    return;
                }
                return;
            case 2:
                lg.r1 r1Var = (lg.r1) ((ai.g5) obj2).f663b;
                lg.r1.c0(r1Var);
                i3 = ((org.telegram.ui.ActionBar.d2) r1Var).currentAccount;
                lg.u1.f(i3).k(i11, (String) obj);
                return;
            case 3:
                org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.G1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(maVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624049, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i18 = org.telegram.ui.ActionBar.k6.I6;
                        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
                        imageView.setBackground(L2);
                        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, null);
                        linearLayout.addView((View) imageView, mf.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(bd.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
                        linearLayout.addView(textView, mf.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(bd.a0(null, null, 2131743915, org.telegram.ui.Cells.ma.a((d10) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i19 = 0; i19 < Math.min(arrayList.size(), 10); i19++) {
                                StringBuilder h = t4.c.h(str2, "• ");
                                h.append(org.telegram.ui.Cells.ma.a((d10) arrayList.get(i19)));
                                h.append("\n");
                                str2 = h.toString();
                            }
                            textView2.setText(bd.a0(null, null, 2131743916, str2));
                        }
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, null);
                        linearLayout.addView(textView2, mf.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i20 = org.telegram.ui.ActionBar.k6.f28122q7;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i20, false);
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
                        org.telegram.ui.ActionBar.n6 L4 = org.telegram.ui.ActionBar.r6.L(f11, i20);
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, L4, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.messenger.camera.q.o(textView3, i20, null, null, 2131743911);
                        frameLayout.addView(textView3, mf.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, mf.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        pf.b(dVar, 0.02f, 1.5f);
                        dVar.i(bd.M0(2131749539, null), false, true);
                        linearLayout.addView(dVar, mf.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, maVar.getContext(), null, false);
                        l10.O = linearLayout;
                        l10.show();
                        l10.f28590c0 = false;
                        l10.f28592d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(l10, 12);
                        org.telegram.messenger.g0.r(dVar.K);
                        dVar.setCountFilled(false);
                        dVar.J = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        g2.c cVar = new g2.c(7, dVar, fVar);
                        dVar.K = cVar;
                        org.telegram.messenger.g0.i3(cVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.a3(dVar, l10, 1));
                    } else {
                        org.telegram.messenger.k5.p(null, 2131743889, new fc(org.telegram.ui.Components.wa.a(maVar.getContext()), null), null);
                    }
                }
                maVar.f29640e.a(false, true);
                hp.s1(i11).U1().a();
                return;
            case 4:
                uk ukVar = (uk) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(ukVar.f38788i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(ukVar.f38788i0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                ukVar.f38794o0.d(tL_messageMediaGeoLive, ukVar.f38795p0, true, 0, ((Long) obj).longValue());
                ukVar.f38416b.a(true);
                return;
            case 5:
                e40.l1((e40) obj2, i11, (org.telegram.messenger.e3) obj);
                return;
            case 6:
                u10 u10Var = (u10) obj2;
                Long l11 = (Long) obj;
                if (l11 != null && l11.longValue() > 0 && l11.longValue() != Long.MAX_VALUE) {
                    user = hp.s1(i11).a2(l11);
                }
                u10Var.a(user);
                return;
            default:
                org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) obj2;
                String str3 = (String) obj;
                if (!w9Var.f43365r && i11 == w9Var.K) {
                    w9Var.F = 0;
                    w9Var.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    w9Var.f43369y = str;
                    d dVar2 = w9Var.f43357a0;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    w9Var.f34298a.f35594g3.O(true);
                    return;
                }
                return;
        }
    }

    public s3(u10 u10Var, int i3) {
        this.f13554a = 6;
        this.f13555b = i3;
        this.f13556c = u10Var;
    }
}
