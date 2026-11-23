package hi;

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
import org.telegram.messenger.g10;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.m40;
public final class r3 implements y10 {
    public final int f15297a;
    public final int f15298b;
    public final Object f15299c;

    public r3(int i7, Object obj, int i10) {
        this.f15297a = i10;
        this.f15298b = i7;
        this.f15299c = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7;
        float f10;
        int i10 = this.f15297a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = this.f15298b;
        Object obj2 = this.f15299c;
        switch (i10) {
            case 0:
                x3 x3Var = (x3) obj2;
                View view = (View) obj;
                bi.i6 i6Var = x3Var.f15669b;
                if (view instanceof w3) {
                    i6Var.getClass();
                    int R = RecyclerView.R(view);
                    o41 G = i6Var.f35742g3.G(R);
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
            case 1:
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
                y51 y51Var = w5Var.f15611n;
                if (y51Var != null) {
                    int i15 = w5Var.V;
                    int i16 = w5Var.W;
                    ez ezVar = y51Var.f42300b;
                    if (ezVar == null) {
                        y51Var.f42304n = i15;
                        y51Var.f42305r = i16;
                    } else {
                        ezVar.h(i15, i16);
                    }
                }
                ee0 ee0Var = w5Var.f15618s;
                if (ee0Var != null) {
                    int i17 = w5Var.V;
                    int i18 = w5Var.W;
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
            case 2:
                kg.t1 t1Var = (kg.t1) ((bi.w1) obj2).f4171b;
                kg.t1.c0(t1Var);
                i7 = ((org.telegram.ui.ActionBar.g2) t1Var).currentAccount;
                kg.w1.f(i7).k(i12, (String) obj);
                return;
            case 3:
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
            case 4:
                org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) obj2;
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
                        int i19 = org.telegram.ui.ActionBar.m6.I6;
                        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.x0(null, i19, false));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
                        imageView.setBackground(L2);
                        org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, null);
                        linearLayout.addView((View) imageView, c8.na.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(oaVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(hd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29455j5, null);
                        linearLayout.addView(textView, c8.na.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(oaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(hd.a0(null, null, 2131743662, org.telegram.ui.Cells.oa.a((g10) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList2.size(), 10); i20++) {
                                StringBuilder n10 = p5.c.n(str2, "• ");
                                n10.append(org.telegram.ui.Cells.oa.a((g10) arrayList2.get(i20)));
                                n10.append("\n");
                                str2 = n10.toString();
                            }
                            textView2.setText(hd.a0(null, null, 2131743663, str2));
                        }
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29455j5, null);
                        linearLayout.addView(textView2, c8.na.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(oaVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = org.telegram.ui.ActionBar.m6.f29588q7;
                        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i21, false);
                        float f11 = 0.15f;
                        if (org.telegram.ui.ActionBar.m6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L3, org.telegram.ui.ActionBar.m6.r1(f10, x02));
                        if (org.telegram.ui.ActionBar.m6.I.q()) {
                            f11 = 0.2f;
                        }
                        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(f11, i21);
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(oaVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        o10.r(textView3, i21, null, null, 2131743658);
                        frameLayout.addView(textView3, c8.na.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, c8.na.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(oaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        c8.sa.b(dVar, 0.02f, 1.5f);
                        dVar.i(hd.N0(2131749355, null), false, true);
                        linearLayout.addView(dVar, c8.na.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, oaVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.f30146c0 = false;
                        j3.f30148d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(j3, 13);
                        org.telegram.messenger.g0.r(dVar.K);
                        dVar.setCountFilled(false);
                        dVar.J = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        fi.a6 a6Var = new fi.a6(28, dVar, fVar);
                        dVar.K = a6Var;
                        org.telegram.messenger.g0.h3(a6Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.b3(dVar, j3, 1));
                    } else {
                        org.telegram.messenger.f3.o(null, 2131743636, new lc(org.telegram.ui.Components.cb.a(oaVar.getContext()), null), null);
                    }
                }
                oaVar.f31187e.a(false, true);
                np.u1(i12).W1().a();
                return;
            case 5:
                ml mlVar = (ml) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(mlVar.f37512i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(mlVar.f37512i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                mlVar.f37518o0.b(tL_messageMediaGeoLive, mlVar.f37519p0, true, 0, ((Long) obj).longValue());
                mlVar.f37477b.a(true);
                return;
            case 6:
                m40.l1((m40) obj2, i12, (org.telegram.messenger.g3) obj);
                return;
            case 7:
                y10 y10Var = (y10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = np.u1(i12).c2(l10);
                }
                y10Var.a(user);
                return;
            default:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj2;
                String str3 = (String) obj;
                if (!naVar.f44681r && i12 == naVar.K) {
                    naVar.F = 0;
                    naVar.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    naVar.f44685y = str;
                    d dVar2 = naVar.f44673a0;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    naVar.f34671a.f35742g3.O(true);
                    return;
                }
                return;
        }
    }

    public r3(Object obj, int i7, int i10) {
        this.f15297a = i10;
        this.f15299c = obj;
        this.f15298b = i7;
    }
}
