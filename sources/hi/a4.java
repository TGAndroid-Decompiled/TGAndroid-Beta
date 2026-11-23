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
import org.telegram.messenger.e10;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.l40;
public final class a4 implements w10 {
    public final int f14183a;
    public final int f14184b;
    public final Object f14185c;

    public a4(int i7, Object obj, int i10) {
        this.f14183a = i10;
        this.f14184b = i7;
        this.f14185c = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7;
        float f10;
        int i10 = this.f14183a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        int i11 = 0;
        boolean z11 = false;
        int i12 = this.f14184b;
        Object obj2 = this.f14185c;
        switch (i10) {
            case 0:
                g4 g4Var = (g4) obj2;
                View view = (View) obj;
                bi.i6 i6Var = g4Var.f14529b;
                if (view instanceof f4) {
                    i6Var.getClass();
                    int R = RecyclerView.R(view);
                    n41 G = i6Var.f35323g3.G(R);
                    if (G != null) {
                        f4 f4Var = (f4) view;
                        f4Var.setPosition(g4Var.b(R));
                        if (i12 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                f6 f6Var = (f6) obj2;
                int[] iArr = (int[]) obj;
                x7 x7Var = f6Var.d;
                int i13 = iArr[0];
                f6Var.V = i13;
                x7Var.A0 = i13;
                int i14 = iArr[1];
                f6Var.W = i14;
                x7Var.B0 = i14;
                f6Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                f6Var.invalidate();
                x51 x51Var = f6Var.f14461n;
                if (x51Var != null) {
                    int i15 = f6Var.V;
                    int i16 = f6Var.W;
                    bz bzVar = x51Var.f41850b;
                    if (bzVar == null) {
                        x51Var.f41854n = i15;
                        x51Var.f41855r = i16;
                    } else {
                        bzVar.h(i15, i16);
                    }
                }
                de0 de0Var = f6Var.f14468s;
                if (de0Var != null) {
                    int i17 = f6Var.V;
                    int i18 = f6Var.W;
                    bz bzVar2 = de0Var.m0;
                    if (bzVar2 != null) {
                        bzVar2.h(i17, i18);
                        return;
                    }
                    de0Var.K0 = i17;
                    de0Var.L0 = i18;
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
                    mp u12 = mp.u1(i12);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = u12.s1(user2);
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        tL_messages_inviteUsersToBot.users.add(u12.s1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_inviteUsersToBot, new bi.o1(23, arrayList, n10.q(user2)));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                paVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(paVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(paVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624050, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = org.telegram.messenger.g0.L(80.0f);
                        int i19 = org.telegram.ui.ActionBar.n6.I6;
                        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.x0(null, i19, false));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i19);
                        imageView.setBackground(L2);
                        org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, null);
                        linearLayout.addView((View) imageView, c8.na.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(paVar.getContext());
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(gd.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
                        linearLayout.addView(textView, c8.na.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(paVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(gd.a0(null, null, 2131743658, org.telegram.ui.Cells.pa.a((e10) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList2.size(), 10); i20++) {
                                StringBuilder n10 = p5.c.n(str2, "• ");
                                n10.append(org.telegram.ui.Cells.pa.a((e10) arrayList2.get(i20)));
                                n10.append("\n");
                                str2 = n10.toString();
                            }
                            textView2.setText(gd.a0(null, null, 2131743659, str2));
                        }
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29559j5, null);
                        linearLayout.addView(textView2, c8.na.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(paVar.getContext());
                        frameLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(10.0f));
                        int L3 = org.telegram.messenger.g0.L(12.0f);
                        int i21 = org.telegram.ui.ActionBar.n6.f29692q7;
                        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i21, false);
                        float f11 = 0.15f;
                        if (org.telegram.ui.ActionBar.n6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L3, org.telegram.ui.ActionBar.n6.r1(f10, x02));
                        if (org.telegram.ui.ActionBar.n6.I.q()) {
                            f11 = 0.2f;
                        }
                        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(f11, i21);
                        frameLayout.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, K, null, null);
                        TextView textView3 = new TextView(paVar.getContext());
                        textView3.setTypeface(org.telegram.messenger.g0.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        m10.r(textView3, i21, null, null, 2131743654);
                        frameLayout.addView(textView3, c8.na.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, c8.na.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        e eVar = new e(paVar.getContext(), null, true);
                        eVar.setRoundRadius(24);
                        c8.sa.b(eVar, 0.02f, 1.5f);
                        eVar.i(gd.N0(2131749355, null), false, true);
                        linearLayout.addView(eVar, c8.na.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, paVar.getContext(), null, false);
                        j3.O = linearLayout;
                        j3.show();
                        j3.f30230c0 = false;
                        j3.f30232d0 = false;
                        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(j3, 13);
                        org.telegram.messenger.g0.r(eVar.K);
                        eVar.setCountFilled(false);
                        eVar.J = 5;
                        eVar.c(5, false);
                        eVar.setShowZero(false);
                        c cVar = new c(0, eVar, fVar);
                        eVar.K = cVar;
                        org.telegram.messenger.g0.h3(cVar, 1000L);
                        eVar.setOnClickListener(new org.telegram.ui.Cells.b3(eVar, j3, 1));
                    } else {
                        org.telegram.messenger.f3.o(null, 2131743632, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(paVar.getContext()), null), null);
                    }
                }
                paVar.f31345e.a(false, true);
                mp.u1(i12).W1().a();
                return;
            case 5:
                kl klVar = (kl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(klVar.f36780i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = org.telegram.messenger.g0.b0(klVar.f36780i0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                klVar.f36786o0.d(tL_messageMediaGeoLive, klVar.f36787p0, true, 0, ((Long) obj).longValue());
                klVar.f37135b.a(true);
                return;
            case 6:
                l40.l1((l40) obj2, i12, (org.telegram.messenger.g3) obj);
                return;
            case 7:
                w10 w10Var = (w10) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = mp.u1(i12).c2(l10);
                }
                w10Var.a(user);
                return;
            default:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) obj2;
                String str3 = (String) obj;
                if (!oaVar.f44843r && i12 == oaVar.K) {
                    oaVar.F = 0;
                    oaVar.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    oaVar.f44847y = str;
                    e eVar2 = oaVar.f44835a0;
                    if (eVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        eVar2.setEnabled(z11);
                    }
                    oaVar.f34213a.f35323g3.O(true);
                    return;
                }
                return;
        }
    }

    public a4(Object obj, int i7, int i10) {
        this.f14183a = i10;
        this.f14185c = obj;
        this.f14184b = i7;
    }
}
