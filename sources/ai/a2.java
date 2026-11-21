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
import bi.g6;
import c8.ma;
import c8.ra;
import hi.c7;
import hi.v3;
import hi.v5;
import hi.w3;
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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.na;
import org.telegram.ui.m40;
public final class a2 implements x10 {
    public final int f1116a;
    public final int f1117b;
    public final Object f1118c;

    public a2(int i7, Object obj, int i10) {
        this.f1116a = i10;
        this.f1117b = i7;
        this.f1118c = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7;
        float f10;
        int i10 = this.f1116a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = this.f1117b;
        Object obj2 = this.f1118c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                e2 e2Var = ((z1) obj2).f1648b;
                e2Var.W = false;
                if (i12 == e2Var.Y) {
                    e2Var.f1165b0 = num.intValue();
                    return;
                }
                return;
            case 1:
                w3 w3Var = (w3) obj2;
                View view = (View) obj;
                g6 g6Var = w3Var.f15694b;
                if (view instanceof v3) {
                    g6Var.getClass();
                    int R = RecyclerView.R(view);
                    o41 G = g6Var.f35796g3.G(R);
                    if (G != null) {
                        v3 v3Var = (v3) view;
                        v3Var.setPosition(w3Var.b(R));
                        if (i12 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v3Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                v5 v5Var = (v5) obj2;
                int[] iArr = (int[]) obj;
                c7 c7Var = v5Var.d;
                int i13 = iArr[0];
                v5Var.V = i13;
                c7Var.A0 = i13;
                int i14 = iArr[1];
                v5Var.W = i14;
                c7Var.B0 = i14;
                v5Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                v5Var.invalidate();
                y51 y51Var = v5Var.f15633n;
                if (y51Var != null) {
                    int i15 = v5Var.V;
                    int i16 = v5Var.W;
                    ez ezVar = y51Var.f42330b;
                    if (ezVar == null) {
                        y51Var.f42334n = i15;
                        y51Var.f42335r = i16;
                    } else {
                        ezVar.h(i15, i16);
                    }
                }
                ee0 ee0Var = v5Var.f15640s;
                if (ee0Var != null) {
                    int i17 = v5Var.V;
                    int i18 = v5Var.W;
                    ez ezVar2 = ee0Var.m0;
                    if (ezVar2 != null) {
                        ezVar2.h(i17, i18);
                        return;
                    }
                    ee0Var.K0 = i17;
                    ee0Var.L0 = i18;
                    return;
                }
                return;
            case 3:
                kg.s1 s1Var = (kg.s1) ((bi.v1) obj2).f4170b;
                kg.s1.c0(s1Var);
                i7 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                kg.v1.f(i7).k(i12, (String) obj);
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
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_inviteUsersToBot, new bi.o1(23, arrayList, o10.q(user2)));
                    return;
                }
                return;
            case 5:
                oa oaVar = (oa) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                oaVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(oaVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(oaVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624050, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i19 = m6.I6;
                        ShapeDrawable L2 = m6.L(L, m6.x0(null, i19, false));
                        p6 M = t6.M(i19);
                        imageView.setBackground(L2);
                        t6.j(imageView, L2, M, null, null);
                        linearLayout.addView((View) imageView, ma.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(oaVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(gd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        t6.U(textView, m6.f29486j5, null);
                        linearLayout.addView(textView, ma.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(oaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(gd.a0(null, null, 2131743662, oa.a((f10) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList2.size(), 10); i20++) {
                                StringBuilder n10 = p5.c.n(str2, "• ");
                                n10.append(oa.a((f10) arrayList2.get(i20)));
                                n10.append("\n");
                                str2 = n10.toString();
                            }
                            textView2.setText(gd.a0(null, null, 2131743663, str2));
                        }
                        t6.U(textView2, m6.f29486j5, null);
                        linearLayout.addView(textView2, ma.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(oaVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = m6.f29619q7;
                        int x02 = m6.x0(null, i21, false);
                        float f11 = 0.15f;
                        if (m6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        Drawable d02 = m6.d0(L3, m6.r1(f10, x02));
                        if (m6.I.q()) {
                            f11 = 0.2f;
                        }
                        p6 K = t6.K(f11, i21);
                        frameLayout.setBackground(d02);
                        t6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(oaVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        n10.r(textView3, i21, null, null, 2131743658);
                        frameLayout.addView(textView3, ma.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, ma.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.e eVar = new hi.e(oaVar.getContext(), null, true);
                        eVar.setRoundRadius(24);
                        ra.b(eVar, 0.02f, 1.5f);
                        eVar.i(gd.N0(2131749355, null), false, true);
                        linearLayout.addView(eVar, ma.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.w2 j3 = f3.j(1, oaVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.f30177c0 = false;
                        j3.f30179d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(j3, 13);
                        org.telegram.messenger.g0.r(eVar.K);
                        eVar.setCountFilled(false);
                        eVar.J = 5;
                        eVar.c(5, false);
                        eVar.setShowZero(false);
                        hi.c cVar = new hi.c(0, eVar, fVar);
                        eVar.K = cVar;
                        org.telegram.messenger.g0.h3(cVar, 1000L);
                        eVar.setOnClickListener(new b3(eVar, j3, 1));
                    } else {
                        f3.o(null, 2131743636, new lc(cb.a(oaVar.getContext()), null), null);
                    }
                }
                oaVar.f31218e.a(false, true);
                mp.u1(i12).W1().a();
                return;
            case 6:
                ml mlVar = (ml) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(mlVar.f37556i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(mlVar.f37556i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                mlVar.f37562o0.b(tL_messageMediaGeoLive, mlVar.f37563p0, true, 0, ((Long) obj).longValue());
                mlVar.f37521b.a(true);
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
                na naVar = (na) obj2;
                String str3 = (String) obj;
                if (!naVar.f44711r && i12 == naVar.K) {
                    naVar.F = 0;
                    naVar.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    naVar.f44715y = str;
                    hi.e eVar2 = naVar.f44703a0;
                    if (eVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        eVar2.setEnabled(z11);
                    }
                    naVar.f34683a.f35796g3.O(true);
                    return;
                }
                return;
        }
    }

    public a2(Object obj, int i7, int i10) {
        this.f1116a = i10;
        this.f1118c = obj;
        this.f1117b = i7;
    }
}
