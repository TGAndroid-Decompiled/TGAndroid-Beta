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
import bi.d6;
import c8.ma;
import c8.ra;
import fi.a6;
import hi.d7;
import hi.w3;
import hi.w5;
import hi.x3;
import java.util.ArrayList;
import org.telegram.messenger.f10;
import org.telegram.messenger.f3;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.m40;
public final class y1 implements x10 {
    public final int f1624a;
    public final int f1625b;
    public final Object f1626c;

    public y1(int i7, Object obj, int i10) {
        this.f1624a = i10;
        this.f1625b = i7;
        this.f1626c = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7;
        float f10;
        int i10 = this.f1624a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = this.f1625b;
        Object obj2 = this.f1626c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                c2 c2Var = ((x1) obj2).f1611b;
                c2Var.W = false;
                if (i12 == c2Var.Y) {
                    c2Var.f1140b0 = num.intValue();
                    return;
                }
                return;
            case 1:
                x3 x3Var = (x3) obj2;
                View view = (View) obj;
                d6 d6Var = x3Var.f15716b;
                if (view instanceof w3) {
                    d6Var.getClass();
                    int R = RecyclerView.R(view);
                    l41 G = d6Var.f34607g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view;
                        w3Var.setPosition(x3Var.b(R));
                        if (i12 == G.d) {
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
                w5 w5Var = (w5) obj2;
                int[] iArr = (int[]) obj;
                d7 d7Var = w5Var.d;
                int i13 = iArr[0];
                w5Var.V = i13;
                d7Var.A0 = i13;
                int i14 = iArr[1];
                w5Var.W = i14;
                d7Var.B0 = i14;
                w5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                w5Var.invalidate();
                v51 v51Var = w5Var.f15663n;
                if (v51Var != null) {
                    int i15 = w5Var.V;
                    int i16 = w5Var.W;
                    cz czVar = v51Var.f40501b;
                    if (czVar == null) {
                        v51Var.f40505n = i15;
                        v51Var.f40506r = i16;
                    } else {
                        czVar.h(i15, i16);
                    }
                }
                de0 de0Var = w5Var.f15670s;
                if (de0Var != null) {
                    int i17 = w5Var.V;
                    int i18 = w5Var.W;
                    cz czVar2 = de0Var.m0;
                    if (czVar2 != null) {
                        czVar2.h(i17, i18);
                        return;
                    }
                    de0Var.K0 = i17;
                    de0Var.L0 = i18;
                    return;
                }
                return;
            case 3:
                kg.t1 t1Var = (kg.t1) ((bi.r1) obj2).f4021b;
                kg.t1.c0(t1Var);
                i7 = ((org.telegram.ui.ActionBar.h2) t1Var).currentAccount;
                kg.w1.f(i7).k(i12, (String) obj);
                return;
            case 4:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    mp u12 = mp.u1(i12);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = u12.s1(user2);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        tL_messages_inviteUsersToBot.users.add(u12.s1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_inviteUsersToBot, new bi.k1(23, arrayList, o10.q(user2)));
                    return;
                }
                return;
            case 5:
                na naVar = (na) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                naVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(naVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(naVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624050, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i19 = n6.I6;
                        ShapeDrawable L2 = n6.L(L, n6.x0(null, i19, false));
                        q6 M = u6.M(i19);
                        imageView.setBackground(L2);
                        u6.j(imageView, L2, M, null, null);
                        linearLayout.addView((View) imageView, ma.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(naVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(gd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        u6.U(textView, n6.f29504j5, null);
                        linearLayout.addView(textView, ma.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(naVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(gd.a0(null, null, 2131743668, na.a((f10) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList2.size(), 10); i20++) {
                                StringBuilder n10 = p5.c.n(str2, "• ");
                                n10.append(na.a((f10) arrayList2.get(i20)));
                                n10.append("\n");
                                str2 = n10.toString();
                            }
                            textView2.setText(gd.a0(null, null, 2131743669, str2));
                        }
                        u6.U(textView2, n6.f29504j5, null);
                        linearLayout.addView(textView2, ma.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(naVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = n6.f29637q7;
                        int x02 = n6.x0(null, i21, false);
                        float f11 = 0.15f;
                        if (n6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        Drawable d02 = n6.d0(L3, n6.r1(f10, x02));
                        if (n6.I.q()) {
                            f11 = 0.2f;
                        }
                        q6 K = u6.K(f11, i21);
                        frameLayout.setBackground(d02);
                        u6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(naVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        n10.r(textView3, i21, null, null, 2131743664);
                        frameLayout.addView(textView3, ma.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, ma.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.d dVar = new hi.d(naVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        ra.b(dVar, 0.02f, 1.5f);
                        dVar.i(gd.M0(2131749356, null), false, true);
                        linearLayout.addView(dVar, ma.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.x2 j3 = f3.j(1, naVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.f30196c0 = false;
                        j3.f30198d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(j3, 13);
                        org.telegram.messenger.g0.r(dVar.K);
                        dVar.setCountFilled(false);
                        dVar.J = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        a6 a6Var = new a6(28, dVar, fVar);
                        dVar.K = a6Var;
                        org.telegram.messenger.g0.h3(a6Var, 1000L);
                        dVar.setOnClickListener(new a3(dVar, j3, 1));
                    } else {
                        f3.o(null, 2131743642, new lc(cb.a(naVar.getContext()), null), null);
                    }
                }
                naVar.f31136e.a(false, true);
                mp.u1(i12).W1().a();
                return;
            case 6:
                kl klVar = (kl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(klVar.f36801i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(klVar.f36801i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                klVar.f36807o0.b(tL_messageMediaGeoLive, klVar.f36808p0, true, 0, ((Long) obj).longValue());
                klVar.f36766b.a(true);
                return;
            case 7:
                m40.l1((m40) obj2, i12, (g3) obj);
                return;
            case 8:
                x10 x10Var = (x10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = mp.u1(i12).c2(l10);
                }
                x10Var.a(user);
                return;
            default:
                org.telegram.ui.Wallet.na naVar2 = (org.telegram.ui.Wallet.na) obj2;
                String str3 = (String) obj;
                if (!naVar2.f44671r && i12 == naVar2.K) {
                    naVar2.F = 0;
                    naVar2.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    naVar2.f44675y = str;
                    hi.d dVar2 = naVar2.f44663a0;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    naVar2.f33530a.f34607g3.O(true);
                    return;
                }
                return;
        }
    }

    public y1(Object obj, int i7, int i10) {
        this.f1624a = i10;
        this.f1626c = obj;
        this.f1625b = i7;
    }
}
