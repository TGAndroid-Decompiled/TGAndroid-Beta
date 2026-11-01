package ag;

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
import org.telegram.messenger.a20;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.ra;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.h50;
import vh.k4;
import vh.n5;
import w7.b6;
import w7.e6;
public final class s2 implements r20 {
    public final int f705a;
    public final int f706b;
    public final Object f707c;

    public s2(Object obj, int i10, int i11) {
        this.f705a = i11;
        this.f707c = obj;
        this.f706b = i10;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        float f7;
        boolean z10;
        int i11 = this.f705a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z11 = false;
        int i12 = this.f706b;
        Object obj2 = this.f707c;
        switch (i11) {
            case 0:
                z2 z2Var = (z2) ((e) obj2).f489b;
                z2.c0(z2Var);
                i10 = ((org.telegram.ui.ActionBar.k2) z2Var).currentAccount;
                i3.f(i10).k(i12, (String) obj);
                return;
            case 1:
                ma maVar = (ma) obj2;
                ArrayList arrayList = (ArrayList) obj;
                maVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(maVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(maVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624048, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.i0.L(80.0f);
                        int i13 = t6.I6;
                        ShapeDrawable L2 = t6.L(L, t6.x0(null, i13, false));
                        w6 N = a7.N(i13);
                        imageView.setBackground(L2);
                        a7.k(imageView, L2, N, null, null);
                        linearLayout.addView((View) imageView, b6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(maVar.getContext());
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(dd.G(arrayList.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        a7.V(textView, t6.f21038j5, null);
                        linearLayout.addView(textView, b6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(maVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(dd.a0(null, null, 2131743930, ma.a((a20) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i14 = 0; i14 < Math.min(arrayList.size(), 10); i14++) {
                                StringBuilder i15 = sc.e.i(str2, "• ");
                                i15.append(ma.a((a20) arrayList.get(i14)));
                                i15.append("\n");
                                str2 = i15.toString();
                            }
                            textView2.setText(dd.a0(null, null, 2131743931, str2));
                        }
                        a7.V(textView2, t6.f21038j5, null);
                        linearLayout.addView(textView2, b6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(maVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(10.0f));
                        int L3 = org.telegram.messenger.i0.L(12.0f);
                        int i16 = t6.f21171q7;
                        int x02 = t6.x0(null, i16, false);
                        float f10 = 0.15f;
                        if (t6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        Drawable d02 = t6.d0(L3, t6.r1(f7, x02));
                        if (t6.I.q()) {
                            f10 = 0.2f;
                        }
                        w6 L4 = a7.L(f10, i16);
                        frameLayout.setBackground(d02);
                        a7.k(frameLayout, d02, L4, null, null);
                        TextView textView3 = new TextView(maVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.i0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        a30.p(textView3, i16, null, null, 2131743926);
                        frameLayout.addView(textView3, b6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, b6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        vh.d dVar = new vh.d(maVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        e6.b(dVar, 0.02f, 1.5f);
                        dVar.i(dd.L0(2131749540, null), false, true);
                        linearLayout.addView(dVar, b6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.z2 k10 = m5.k(1, maVar.getContext(), null, false);
                        k10.N = linearLayout;
                        k10.show();
                        k10.f21588b0 = false;
                        k10.f21591c0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(k10, 11);
                        org.telegram.messenger.i0.r(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        th.o0 o0Var = new th.o0(29, dVar, fVar);
                        dVar.J = o0Var;
                        org.telegram.messenger.i0.h3(o0Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.c3(dVar, k10, 1));
                    } else {
                        m5.o(null, 2131743904, new cc(ra.a(maVar.getContext()), null), null);
                    }
                }
                maVar.e.a(false, true);
                wp.r1(i12).T1().a();
                return;
            case 2:
                bl blVar = (bl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.i0.b0(blVar.f24863n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.i0.b0(blVar.f24863n0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                blVar.f24872u0.d(tL_messageMediaGeoLive, blVar.f24873v0, true, 0, ((Long) obj).longValue());
                blVar.f30964b.a(true);
                return;
            case 3:
                h50.l1((h50) obj2, i12, (org.telegram.messenger.h3) obj);
                return;
            case 4:
                r20 r20Var = (r20) obj2;
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = wp.r1(i12).Z1(l4);
                }
                r20Var.a(user);
                return;
            case 5:
                ba baVar = (ba) obj2;
                String str3 = (String) obj;
                if (!baVar.f34287r && i12 == baVar.J) {
                    baVar.E = 0;
                    baVar.L = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    baVar.f34291y = str;
                    vh.d dVar2 = baVar.Z;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    baVar.f30217a.f31183f3.O(true);
                    return;
                }
                return;
            case 6:
                vh.y2 y2Var = (vh.y2) obj2;
                View view = (View) obj;
                ii iiVar = y2Var.f52207b;
                if (view instanceof vh.x2) {
                    iiVar.getClass();
                    int R = RecyclerView.R(view);
                    b51 G = iiVar.f31183f3.G(R);
                    if (G != null) {
                        vh.x2 x2Var = (vh.x2) view;
                        x2Var.setPosition(y2Var.b(R));
                        if (i12 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x2Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                k4 k4Var = (k4) obj2;
                int[] iArr = (int[]) obj;
                n5 n5Var = k4Var.d;
                int i17 = iArr[0];
                k4Var.U = i17;
                n5Var.A0 = i17;
                int i18 = iArr[1];
                k4Var.V = i18;
                n5Var.B0 = i18;
                k4Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                k4Var.invalidate();
                l61 l61Var = k4Var.f51432n;
                if (l61Var != null) {
                    int i19 = k4Var.U;
                    int i20 = k4Var.V;
                    gz gzVar = l61Var.f28063b;
                    if (gzVar == null) {
                        l61Var.f28066n = i19;
                        l61Var.f28067r = i20;
                    } else {
                        gzVar.h(i19, i20);
                    }
                }
                oe0 oe0Var = k4Var.f51439s;
                if (oe0Var != null) {
                    int i21 = k4Var.U;
                    int i22 = k4Var.V;
                    gz gzVar2 = oe0Var.f29112l0;
                    if (gzVar2 != null) {
                        gzVar2.h(i21, i22);
                        return;
                    }
                    oe0Var.J0 = i21;
                    oe0Var.K0 = i22;
                    return;
                }
                return;
        }
    }

    public s2(r20 r20Var, int i10) {
        this.f705a = 4;
        this.f706b = i10;
        this.f707c = r20Var;
    }
}
