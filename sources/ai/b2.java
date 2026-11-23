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
import bi.f6;
import c8.ma;
import c8.ra;
import hi.c7;
import hi.v3;
import hi.v5;
import hi.w3;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.g10;
import org.telegram.messenger.g3;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
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
public final class b2 implements y10 {
    public final int f1133a;
    public final int f1134b;
    public final Object f1135c;

    public b2(int i7, Object obj, int i10) {
        this.f1133a = i10;
        this.f1134b = i7;
        this.f1135c = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7;
        float f10;
        int i10 = this.f1133a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = this.f1134b;
        Object obj2 = this.f1135c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                f2 f2Var = ((a2) obj2).f1118b;
                f2Var.W = false;
                if (i12 == f2Var.Y) {
                    f2Var.f1180b0 = num.intValue();
                    return;
                }
                return;
            case 1:
                w3 w3Var = (w3) obj2;
                View view = (View) obj;
                f6 f6Var = w3Var.f15697b;
                if (view instanceof v3) {
                    f6Var.getClass();
                    int R = RecyclerView.R(view);
                    o41 G = f6Var.f35790g3.G(R);
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
                y51 y51Var = v5Var.f15636n;
                if (y51Var != null) {
                    int i15 = v5Var.V;
                    int i16 = v5Var.W;
                    ez ezVar = y51Var.f42323b;
                    if (ezVar == null) {
                        y51Var.f42327n = i15;
                        y51Var.f42328r = i16;
                    } else {
                        ezVar.h(i15, i16);
                    }
                }
                ee0 ee0Var = v5Var.f15643s;
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
                kg.s1 s1Var = (kg.s1) ((bi.v1) obj2).f4172b;
                kg.s1.c0(s1Var);
                i7 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                kg.v1.f(i7).k(i12, (String) obj);
                return;
            case 4:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    np u12 = np.u1(i12);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = u12.s1(user2);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        tL_messages_inviteUsersToBot.users.add(u12.s1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_inviteUsersToBot, new bi.o1(23, arrayList, p10.q(user2)));
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
                        textView.setText(hd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        t6.U(textView, m6.f29489j5, null);
                        linearLayout.addView(textView, ma.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(oaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(hd.a0(null, null, 2131743660, oa.a((g10) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList2.size(), 10); i20++) {
                                StringBuilder n10 = p5.c.n(str2, "• ");
                                n10.append(oa.a((g10) arrayList2.get(i20)));
                                n10.append("\n");
                                str2 = n10.toString();
                            }
                            textView2.setText(hd.a0(null, null, 2131743661, str2));
                        }
                        t6.U(textView2, m6.f29489j5, null);
                        linearLayout.addView(textView2, ma.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(oaVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = m6.f29622q7;
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
                        o10.r(textView3, i21, null, null, 2131743656);
                        frameLayout.addView(textView3, ma.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, ma.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        hi.e eVar = new hi.e(oaVar.getContext(), null, true);
                        eVar.setRoundRadius(24);
                        ra.b(eVar, 0.02f, 1.5f);
                        eVar.i(hd.N0(2131749355, null), false, true);
                        linearLayout.addView(eVar, ma.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.w2 j3 = f3.j(1, oaVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.f30180c0 = false;
                        j3.f30182d0 = false;
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
                        f3.o(null, 2131743634, new lc(cb.a(oaVar.getContext()), null), null);
                    }
                }
                oaVar.f31221e.a(false, true);
                np.u1(i12).W1().a();
                return;
            case 6:
                ml mlVar = (ml) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(mlVar.f37555i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(mlVar.f37555i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                mlVar.f37561o0.b(tL_messageMediaGeoLive, mlVar.f37562p0, true, 0, ((Long) obj).longValue());
                mlVar.f37520b.a(true);
                return;
            case 7:
                m40.l1((m40) obj2, i12, (g3) obj);
                return;
            case 8:
                y10 y10Var = (y10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = np.u1(i12).c2(l10);
                }
                y10Var.a(user);
                return;
            default:
                na naVar = (na) obj2;
                String str3 = (String) obj;
                if (!naVar.f44715r && i12 == naVar.K) {
                    naVar.F = 0;
                    naVar.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    naVar.f44719y = str;
                    hi.e eVar2 = naVar.f44707a0;
                    if (eVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        eVar2.setEnabled(z11);
                    }
                    naVar.f34681a.f35790g3.O(true);
                    return;
                }
                return;
        }
    }

    public b2(Object obj, int i7, int i10) {
        this.f1133a = i10;
        this.f1135c = obj;
        this.f1134b = i7;
    }
}
