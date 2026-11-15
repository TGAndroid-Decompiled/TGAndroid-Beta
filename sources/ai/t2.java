package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.a6;
import bi.c5;
import bi.c6;
import bi.d6;
import bi.e6;
import bi.r5;
import bi.w2;
import bi.y5;
import bi.z5;
import c8.ja;
import di.a3;
import di.m8;
import di.mb;
import di.y4;
import fi.b4;
import fi.d8;
import fi.i9;
import fi.t3;
import fi.u3;
import fi.v7;
import fi.z8;
import hi.d3;
import hi.h4;
import hi.l7;
import hi.sa;
import hi.t8;
import hi.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import ki.x2;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class t2 implements View.OnClickListener {
    public final int f1552a;
    public final Object f1553b;
    public final Object f1554c;

    public t2(int i7, Object obj, Object obj2) {
        this.f1552a = i7;
        this.f1553b = obj;
        this.f1554c = obj2;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        TL_stars.SavedStarGift savedStarGift;
        Integer num;
        u3 u3Var;
        int i7 = this.f1552a;
        int i10 = 0;
        di.d1 d1Var = null;
        CharSequence charSequence = null;
        d1Var = null;
        Object obj = this.f1554c;
        Object obj2 = this.f1553b;
        switch (i7) {
            case 0:
                v2 v2Var = (v2) obj2;
                v2Var.getClass();
                ((u2) obj).a();
                v2Var.e0();
                return;
            case 1:
                bi.e eVar = (bi.e) obj2;
                eVar.getClass();
                long o4 = m5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                eVar.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null && !q10.A(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == m10.i(eVar.f29679a).e()) {
                            z10 = true;
                            bundle.putBoolean("my_profile", true);
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                        bundle.putLong("chat_id", -o4);
                    }
                    bundle.putBoolean("open_gifts", z10);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 2:
                ((bi.x0) obj2).c((Runnable) obj);
                return;
            case 3:
                a6 a6Var = (a6) obj2;
                a6Var.getClass();
                if (((c5) obj).f3425n > 0) {
                    a6Var.presentFragment(new mb());
                    return;
                }
                return;
            case 4:
                z5 z5Var = (z5) obj2;
                y5 y5Var = (y5) obj;
                m60 F = m60.F(z5Var.f29685c, z5Var.J0, z5Var.W1);
                F.c(2131231890, hd.M0(2131746139, null), new r5(y5Var, 3), false);
                F.c(2131231888, hd.M0(2131746143, null), new r5(y5Var, 4), false);
                F.c(2131231889, hd.M0(2131746141, null), new r5(y5Var, 5), false);
                F.f37112t = false;
                F.Y = true;
                F.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                F.Z();
                return;
            case 5:
                e6 e6Var = (e6) obj2;
                w2 w2Var = (w2) obj;
                HashSet hashSet = e6Var.V1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = e6Var.U1.f9051l;
                        int size = arrayList2.size();
                        int i11 = i10;
                        while (true) {
                            if (i11 < size) {
                                Object obj3 = arrayList2.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if ((i12 == 0 || i12 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                        i10 = 0;
                    }
                    w2Var.a(arrayList);
                    e6Var.dismiss();
                    return;
                }
                return;
            case 6:
                m8 m8Var = ((d6) obj2).f3445c.U1;
                m8Var.f9045e = !m8Var.f9045e;
                ((c6) obj).run();
                m8Var.j(true);
                return;
            case 7:
                di.t.c0((di.t) obj2, (Context) obj, view);
                return;
            case 8:
                di.p0 p0Var = (di.p0) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = di.p0.f9195t2;
                    if (i13 < 6) {
                        strArr[i13] = hd.G(iArr[i13] / 3600, "GiftOfferHours", new Object[0]);
                        if (iArr[i13] == p0Var.f9205k2) {
                            i14 = i13;
                        }
                        i13++;
                    } else {
                        String M0 = hd.M0(2131749730, null);
                        f0 f0Var = new f0(p0Var, 8);
                        Pattern pattern = t4.f39507a;
                        kg.z1 b10 = kg.z1.b(m10.f24934t0);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = j6.x0(null, j6.f28957j5, false);
                            int x03 = j6.x0(null, j6.f28922h5, false);
                            j6.x0(null, j6.Aj, false);
                            j6.x0(null, j6.Ej, false);
                            j6.x0(null, j6.E8, false);
                            j6.x0(null, j6.G8, false);
                            j6.x0(null, j6.f28941i6, false);
                            j6.x0(null, j6.Ji, false);
                            j6.x0(null, j6.Fi, false);
                            j6.x0(null, j6.Hi, false);
                            org.telegram.ui.ActionBar.u2 k10 = k5.k(1, context, null, false);
                            k10.f29720w0 = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ib0 ib0Var = new ib0(context, null);
                            ib0Var.setAllItemsCount(6);
                            ib0Var.setItemCount(Math.min(6, 8));
                            ib0Var.setTextColor(x02);
                            ib0Var.setGravity(17);
                            ib0Var.setMinValue(0);
                            ib0Var.setMaxValue(5);
                            ib0Var.setValue(i14);
                            linearLayout.addView(ib0Var, ja.l(1.0f, 0, 432));
                            ib0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            d4 d4Var = new d4(context, ib0Var, 2);
                            d4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(M0);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(org.telegram.messenger.g0.o());
                            frameLayout.addView(textView, ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new gi.a(10));
                            d4Var.addView(frameLayout, ja.t(-1, -2, 51, 22, 0, 0, 4));
                            d4Var.addView(linearLayout, ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            hi.d dVar = new hi.d(context, null, true);
                            dVar.i(hd.M0(2131745672, null), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.h2(r3, 1));
                            d4Var.addView(dVar, ja.t(-1, 48, 0, 16, 12, 16, 12));
                            k10.O = d4Var;
                            k10.show();
                            k10.setOnDismissListener(new a3(9, f0Var, ib0Var));
                            k10.v0(x03);
                            k10.P(x03);
                            org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
                            return;
                        }
                        return;
                    }
                }
            case 9:
                di.v0 v0Var = (di.v0) obj2;
                u1 u1Var = (u1) obj;
                hi.d dVar2 = v0Var.f9556q1;
                if (dVar2.f14056d0 && !dVar2.R) {
                    org.telegram.messenger.g0.v1(v0Var.n1);
                    dVar2.setLoading(true);
                    u1Var.a(v0Var.f9565z1);
                    return;
                }
                return;
            case 10:
                di.i1 i1Var = (di.i1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) obj;
                di.a1 a1Var = i1Var.f8774k2;
                int i15 = i1Var.f8785v2;
                if (i15 == 2) {
                    a1Var.setPreviewingAttributes(arrayList3);
                    i1Var.g1(1);
                    return;
                } else if (i15 == 1) {
                    di.d1 d1Var2 = new di.d1(a1Var.getUpgradeBackdropAttribute(), a1Var.getUpgradePatternAttribute(), a1Var.getUpgradeImageViewAttribute());
                    i1Var.f8779p2 = d1Var2;
                    a1Var.setPreviewAttributes(d1Var2);
                    i1Var.g1(2);
                    return;
                } else {
                    return;
                }
            case 11:
                di.d1 d1Var3 = (di.d1) obj;
                di.i1 i1Var2 = ((di.b1) obj2).Q;
                int i16 = i1Var2.f8785v2;
                di.a1 a1Var2 = i1Var2.f8774k2;
                if (i16 == 1) {
                    i1Var2.f8779p2 = new di.d1(a1Var2.getUpgradeBackdropAttribute(), a1Var2.getUpgradePatternAttribute(), a1Var2.getUpgradeImageViewAttribute());
                    i1Var2.g1(2);
                }
                int i17 = i1Var2.f8769f2.f8658s;
                di.d1 d1Var4 = i1Var2.f8779p2;
                if (d1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = d1Var4.f8392a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = d1Var4.f8394c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = d1Var4.f8393b;
                    if (i17 == 1) {
                        d1Var = new di.d1(d1Var3.f8392a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        d1Var = new di.d1(stargiftattributebackdrop, d1Var3.f8393b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        d1Var = new di.d1(stargiftattributebackdrop, stargiftattributepattern, d1Var3.f8394c);
                    }
                }
                i1Var2.f8779p2 = d1Var;
                a1Var2.setPreviewAttributes(d1Var);
                i1Var2.i1();
                return;
            case 12:
                di.c6 c6Var = (di.c6) obj2;
                boolean z11 = !c6Var.f8344t3;
                c6Var.f8344t3 = z11;
                ((org.telegram.ui.Cells.c2) obj).c(z11, true);
                return;
            case 13:
                vf.c.v(((di.c6) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url, false);
                return;
            case 14:
                ((di.c6) obj2).p2((CharSequence) obj);
                return;
            case 15:
                y4 y4Var = (y4) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                if (y4Var.F.getAlpha() >= 1.0f && !y4Var.f9782i0 && !y4Var.f9784k0 && y4Var.f9777e0 != null) {
                    new di.i1(y4Var.getContext(), e6Var2, y4Var.f9770a0, y4Var.f9775d0, y4Var.f9777e0, true).show();
                    return;
                }
                return;
            case 16:
                vf.c.t((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
            case 17:
                b4 b4Var = (b4) obj2;
                v7 v7Var = (v7) obj;
                i9 i9Var = b4Var.f11522t0;
                if (v7Var.f12429b != null) {
                    Bundle bundle2 = new Bundle();
                    if (v7Var.f12429b.longValue() >= 0) {
                        bundle2.putLong("user_id", v7Var.f12429b.longValue());
                    } else {
                        bundle2.putLong("chat_id", -v7Var.f12429b.longValue());
                    }
                    if (v7Var.f12431e && (num = v7Var.d) != null) {
                        bundle2.putInt("message_id", num.intValue());
                        i9Var.N(new an(bundle2));
                        return;
                    }
                    i9Var.N(new ProfileActivity(bundle2, null));
                    return;
                }
                xb Q = new cc(b4Var.M0, b4Var.f11493l0).Q(2131624012, 36, hd.M0(2131744664, null));
                Q.f41636a = 3;
                Q.k(true);
                return;
            case 18:
                b4 b4Var2 = (b4) obj2;
                ((z8) b4Var2.A1).h(new ug.x0(b4Var2.f11522t0.f11844f, 14, false));
                ((org.telegram.ui.ActionBar.u2) obj).dismiss();
                return;
            case 19:
                b4 b4Var3 = ((t3) obj2).f12360x;
                wu alert = ((d8) obj).getAlert();
                if (alert != null && (u3Var = b4Var3.A1) != null) {
                    ((z8) u3Var).h(alert);
                    b4Var3.f11466d1.a();
                    return;
                }
                return;
            case 20:
                d3 d3Var = (d3) obj2;
                d3Var.e((ve) obj, false);
                d3Var.G.p();
                return;
            case 21:
                l7 l7Var = (l7) obj2;
                h4 h4Var = (h4) obj;
                k3 k3Var = l7Var.U1;
                try {
                    charSequence = ((ClipboardManager) l7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(l7Var.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    k3Var.d.setText(charSequence.toString());
                    i3 i3Var = k3Var.d;
                    i3Var.setSelection(0, i3Var.getText().length());
                }
                h4Var.run();
                return;
            case 22:
                sa saVar = (sa) obj2;
                new u7((Context) obj, saVar.f15043c, true, saVar.f15114y0, new t8(saVar, 20), saVar.f15035a).show();
                return;
            case 23:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                cc.a0((an) obj).k(false).j();
                return;
            case 24:
                kg.i0 i0Var = (kg.i0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                kg.a0 a0Var = i0Var.V1;
                hi.d dVar3 = i0Var.Z1;
                if (!dVar3.R) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = np.s1(i0Var.f29679a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = a0Var.b();
                    ConnectionsManager.getInstance(i0Var.f29679a).sendRequest(updateconnectedbot, new bi.j6(i0Var, tL_connectedBot, a0Var.c(), 9));
                    return;
                }
                return;
            case 25:
                ki.k.A0((ki.k) obj2, (Context) obj);
                return;
            case 26:
                x2 x2Var = (x2) obj2;
                ki.h0 h0Var = (ki.h0) obj;
                if (h0Var.c()) {
                    h0Var.a();
                } else {
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = h0Var.d;
                        org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                m60 m60Var = x2Var.P0;
                if (m60Var != null) {
                    m60Var.u();
                    x2Var.P0 = null;
                    return;
                }
                return;
            case 27:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.u2) obj2).dismiss();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.C4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 28:
                ni.b bVar = (ni.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                return;
            default:
                oi.z1.c0((oi.z1) obj2, (Context) obj, view);
                return;
        }
    }
}
