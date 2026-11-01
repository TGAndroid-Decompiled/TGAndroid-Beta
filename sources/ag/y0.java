package ag;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.n20;
import org.telegram.messenger.o5;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.kw;
import org.telegram.ui.lx;
import org.telegram.ui.tw;
import org.telegram.ui.un;
import org.telegram.ui.yx;
import org.telegram.ui.zx;
import ph.t3;
import rh.e6;
import rh.h8;
import rh.s6;
import rh.t7;
import rh.u7;
import rh.x7;
import rh.y7;
import th.n5;
import th.o7;
import th.q4;
public final class y0 implements hk0 {
    public final int f803a;
    public final Object f804b;

    public y0(Object obj, int i10) {
        this.f803a = i10;
        this.f804b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        wb K;
        int i11;
        b51 G;
        TLRPC.Document document;
        qh.g0 g0Var;
        b51 G2;
        b51 G3;
        b51 G4;
        TLRPC.Document document2;
        long longValue;
        f5 f5Var;
        org.telegram.ui.ActionBar.l lVar;
        int i12 = this.f803a;
        String str = "";
        Object obj = null;
        TLRPC.Document document3 = null;
        TLRPC.BotInlineResult botInlineResult = null;
        obj = null;
        boolean z10 = false;
        r14 = 0;
        int i13 = 0;
        Object obj2 = this.f804b;
        switch (i12) {
            case 0:
                h1 h1Var = (h1) obj2;
                e1 e1Var = h1Var.f545y;
                bi biVar = h1Var.f30964b;
                s4.g0 adapter = h1Var.f542s.getAdapter();
                f1 f1Var = h1Var.D;
                if (adapter == f1Var) {
                    ArrayList arrayList = f1Var.d;
                    int i14 = i10 - 1;
                    if (i14 >= 0 && i14 < arrayList.size()) {
                        obj = arrayList.get(i14);
                    }
                } else {
                    int S = e1Var.S(i10);
                    int Q = e1Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        obj = e1Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (obj instanceof h3) {
                    if (!e20.i(biVar.D3).q()) {
                        if (biVar.W1 != null) {
                            new kg.i1(biVar.W1, h1Var.getContext(), biVar.D3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    h3 h3Var = (h3) obj;
                    s4.Z(biVar.D3, h3Var.a(), biVar.a1(), new e0(1, h1Var, h3Var));
                    return;
                }
                return;
            case 1:
                j1 j1Var = (j1) obj2;
                b51 G5 = j1Var.W1.G(i10 - 1);
                if (G5 != null) {
                    x0 x0Var = j1Var.R1;
                    if (!x0Var.h(G5)) {
                        int i15 = G5.d;
                        int i16 = j1.f583c2;
                        if (i15 == -1) {
                            j1Var.X1 = true;
                            x0Var.h = true;
                            j1Var.W1.O(true);
                            j1Var.d1(true);
                            return;
                        }
                        int i17 = j1.f584d2;
                        if (i15 == -2) {
                            j1Var.X1 = false;
                            x0Var.h = false;
                            j1Var.W1.O(true);
                            j1Var.d1(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ai.a aVar = (ai.a) obj2;
                int i18 = aVar.P1.G(i10 - 1).d;
                if (i18 == 151) {
                    aVar.e1(false);
                    return;
                } else if (i18 == 150) {
                    aVar.e1(true);
                    return;
                } else {
                    return;
                }
            case 3:
                fg.l lVar2 = (fg.l) obj2;
                Runnable runnable = ((fg.a) lVar2.E.get(i10)).f7060c;
                if (runnable != null) {
                    runnable.run();
                    lVar2.c(false);
                    return;
                }
                return;
            case 4:
                cr0 cr0Var = (cr0) obj2;
                ig.h0 h0Var = (ig.h0) ig.h0.c().get(i10);
                cr0Var.f10167d1.setTypeface(h0Var.f8320a);
                ig.s0 e = ig.s0.e(cr0Var.f10202y1);
                String str2 = h0Var.f8320a;
                e.f8458j = str2;
                e.f8452a.edit().putString("typeface", str2).apply();
                jg.j jVar = cr0Var.B0;
                if (jVar instanceof jg.g3) {
                    ((jg.g3) jVar).setTypeface(h0Var);
                }
                cr0Var.y0(false);
                return;
            case 5:
                jg.n1 n1Var = (jg.n1) obj2;
                n1Var.f10114i3.accept(Integer.valueOf(n1Var.f10113h3.b(i10)));
                ig.s0 s0Var = n1Var.f10113h3;
                s0Var.f8454c.put(Integer.valueOf(s0Var.f8455f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                return;
            case 6:
                kg.q0 q0Var = (kg.q0) obj2;
                HashSet hashSet = q0Var.f11241q2;
                if (view instanceof org.telegram.ui.Cells.m) {
                    org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) view;
                    TLRPC.Chat currentChannel = mVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    mVar.f22275r.a(hashSet.contains(currentChannel), true);
                    q0Var.E1();
                    return;
                } else if (view instanceof j4) {
                    if (q0Var.Q1 || ((i11 = q0Var.Z1) != 11 && i11 != 34)) {
                        j4 j4Var = (j4) view;
                        Object object = j4Var.getObject();
                        if (j4Var.O) {
                            if (object instanceof TLRPC.User) {
                                long j10 = ((TLRPC.User) object).f19943id;
                                int i19 = -q0Var.M2;
                                q0Var.M2 = i19;
                                org.telegram.messenger.i0.F3(i19, j4Var, null);
                                org.telegram.messenger.t2.APP_ERROR.a();
                                if (j10 >= 0) {
                                    str = i20.k(wp.r1(q0Var.f21584a).Z1(Long.valueOf(j10)));
                                }
                                if (wp.r1(q0Var.f21584a).A3()) {
                                    K = new cc((FrameLayout) q0Var.f21587b, q0Var.I0).Q(2131624214, 36, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131743786, str)));
                                } else {
                                    K = new cc((FrameLayout) q0Var.f21587b, q0Var.I0).K(2131624214, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131743786, str)), dd.L0(2131743785, null), new kg.a0(q0Var, 0));
                                }
                                K.j();
                                return;
                            }
                            return;
                        }
                        if (hashSet.contains(object)) {
                            hashSet.remove(object);
                        } else {
                            hashSet.add(object);
                        }
                        j4Var.c(hashSet.contains(object), true);
                        q0Var.E1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                kg.b1 b1Var = (kg.b1) obj2;
                if (view != null) {
                    b1Var.z1(view, true);
                    b1Var.f11359k3 = false;
                    b1Var.w0(0, view.getTop() - ((b1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.i0.H);
                    return;
                }
                return;
            case 8:
                ((o90) obj2).h(view);
                return;
            case 9:
                ((oh.q) obj2).h(view);
                return;
            case 10:
                t3 t3Var = (t3) obj2;
                vh.d dVar = t3Var.U1;
                HashSet hashSet2 = t3Var.R1;
                q51 q51Var = t3Var.Y1;
                if (q51Var != null && (G = q51Var.G(i10 - 1)) != null) {
                    Object obj3 = G.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                        int i20 = savedStarGift.msg_id;
                        long j11 = i20 == 0 ? savedStarGift.saved_id : i20;
                        if (hashSet2.contains(Long.valueOf(j11))) {
                            hashSet2.remove(Long.valueOf(j11));
                            ((ph.c1) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet2.add(Long.valueOf(j11));
                            ((ph.c1) view).c(true, true);
                            G.e = true;
                        }
                        if (hashSet2.size() > 0) {
                            z10 = true;
                        }
                        dVar.setEnabled(z10);
                        dVar.c(hashSet2.size(), true);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qh.f0 f0Var = (qh.f0) obj2;
                if ((view instanceof qh.l) && (document = ((qh.l) view).e) != null) {
                    long j12 = document.f19800id;
                    if (j12 != 0) {
                        qh.i0 i0Var = f0Var.f45627a;
                        if (i0Var.d != null) {
                            if (!i0Var.getUserConfig().q() && ((g0Var = i0Var.h) == null || !g0Var.H.contains(Long.valueOf(j12)))) {
                                qh.x0 x0Var2 = i0Var.d;
                                x0Var2.getClass();
                                x0Var2.d1(0, dd.L0(2131746490, null), dd.L0(2131746488, null));
                                x0Var2.i0();
                                return;
                            }
                            qh.x0 x0Var3 = i0Var.d;
                            int i21 = x0Var3.f45818b;
                            String l4 = a1.g.l(j12, "c:");
                            HashMap hashMap = x0Var3.J;
                            if (!hashMap.containsKey(l4)) {
                                f5 l10 = f5.l(i21, 2, document);
                                l10.a(x0Var3);
                                hashMap.put(l4, l10);
                            }
                            if (l4 != null && !l4.startsWith("c:")) {
                                l4 = l4.replace("️", "");
                            }
                            ArrayList arrayList2 = x0Var3.I;
                            int indexOf = arrayList2.indexOf(l4);
                            if (indexOf >= 0) {
                                arrayList2.remove(indexOf);
                            } else {
                                if (arrayList2.size() >= 6) {
                                    arrayList2.remove(0);
                                }
                                arrayList2.add(l4);
                            }
                            x0Var3.c();
                            x0Var3.i0();
                            qh.g0 g0Var2 = i0Var.h;
                            if (g0Var2 != null) {
                                ArrayList a2 = g0Var2.a();
                                a2.remove(Long.valueOf(j12));
                                a2.add(0, Long.valueOf(j12));
                                while (a2.size() > 21) {
                                    a1.g.x(1, a2);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i22 = 0; i22 < a2.size(); i22++) {
                                    if (i22 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a2.get(i22));
                                }
                                wp.r1(g0Var2.f45730a).f7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                g0Var2.J = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                h8.C0((h8) obj2, i10);
                return;
            case 13:
                t7 t7Var = (t7) obj2;
                q51 q51Var2 = t7Var.T1;
                if (q51Var2 != null && (G2 = q51Var2.G(i10 - 1)) != null) {
                    q51 q51Var3 = t7Var.T1;
                    if (G2.d == -1) {
                        t7Var.U1 = !t7Var.U1;
                        q51Var3.O(true);
                        t7Var.f26724k1.w0(0, org.telegram.messenger.i0.L(200.0f), gr.f26524g);
                        return;
                    } else if (G2.H(u7.class) && (G2.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.i0.W(t7Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.I1;
                        }
                        if (W != null) {
                            long j13 = t7Var.R1.f19943id;
                            e6 y3 = e6.y(t7Var.f21584a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.G;
                            q70 q70Var = new q70(t7Var, G2, j13, 2);
                            int i23 = y3.f46863a;
                            if (wp.r1(i23).f19174k7) {
                                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                                if (Q2 != null && Q2.getContext() != null) {
                                    e6.c0(Q2.getContext(), Q2.getResourceProvider());
                                    return;
                                } else {
                                    e6.c0(W, null);
                                    return;
                                }
                            } else if (!org.telegram.messenger.v2.b() && org.telegram.messenger.u1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.user_id = wp.r1(i23).n1(j13);
                                c5.a aVar2 = new c5.a();
                                aVar2.f3732c = "inapp";
                                aVar2.f3731b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.u1.i().o(Arrays.asList(aVar2.a()), new f1.a(y3, q70Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                return;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.user_id = wp.r1(i23).n1(j13);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = xh.m2.u(e6.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i23).sendRequest(tL_payments_getPaymentForm, new p0(y3, q70Var, tL_inputInvoiceStars, 22));
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                x7 x7Var = (x7) obj2;
                q51 q51Var4 = x7Var.W1;
                if (q51Var4 != null && (G3 = q51Var4.G(i10 - 1)) != null) {
                    q51 q51Var5 = x7Var.W1;
                    if (G3.d == -1) {
                        x7Var.X1 = !x7Var.X1;
                        q51Var5.O(true);
                        return;
                    } else if (G3.H(u7.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.i0.W(x7Var.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.I1;
                        }
                        if (W2 != null) {
                            e6.y(x7Var.f21584a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.G, new s6(1, x7Var, G3), x7Var.U1);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                y7 y7Var = (y7) obj2;
                q51 q51Var6 = y7Var.Q1;
                if (q51Var6 != null && (G4 = q51Var6.G(i10 - 1)) != null) {
                    q51 q51Var7 = y7Var.Q1;
                    if (G4.d == -1) {
                        y7Var.R1 = !y7Var.R1;
                        q51Var7.O(true);
                        y7Var.f26724k1.w0(0, org.telegram.messenger.i0.L(300.0f), null);
                        return;
                    } else if (G4.H(u7.class) && (G4.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.i0.W(y7Var.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.I1;
                        }
                        if (W3 != null) {
                            e6.y(y7Var.f21584a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.G, new s6(2, y7Var, G4), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                ((tw) obj2).i((th.l) view, false);
                return;
            case 17:
                uh.i iVar = (uh.i) obj2;
                vq0 vq0Var = iVar.W;
                org.telegram.ui.ActionBar.k2 k2Var = vq0Var.f50273a;
                if (view instanceof s7) {
                    kj messageObject = ((s7) view).getMessageObject();
                    if (vq0Var.G.E1) {
                        if (vq0Var.c(messageObject)) {
                            vq0Var.g(messageObject);
                            return;
                        } else {
                            vq0Var.e(messageObject);
                            return;
                        }
                    }
                    o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
                    Context context = iVar.getContext();
                    int f12 = messageObject.f1();
                    q4 q4Var = iVar.f50259a;
                    n5 a10 = n5.a(iVar.f50262f);
                    if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).f33899r1) {
                        i13 = org.telegram.messenger.i0.L(68.0f);
                    }
                    a10.f49279s += i13;
                    orCreateStoryViewer.Q(context, f12, q4Var, a10);
                    return;
                }
                return;
            case 18:
                r20 r20Var = ((vh.t) obj2).f51960c;
                if (r20Var != null) {
                    r20Var.a((vh.r) vh.r.a().get(i10));
                    return;
                }
                return;
            case 19:
                vh.g1 g1Var = (vh.g1) obj2;
                vh.u1 u1Var = g1Var.f51203r;
                Object F = g1Var.f51200c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                } else {
                    return;
                }
                n20 n20Var = u1Var.f52013v1;
                if (n20Var != null) {
                    n20Var.i(botInlineResult, document2, Boolean.TRUE);
                }
                u1Var.dismiss();
                return;
            case 20:
                vh.l1 l1Var = (vh.l1) obj2;
                vh.u1 u1Var2 = l1Var.f51465s;
                vh.k1 k1Var = l1Var.f51461c;
                if (i10 >= 0) {
                    l1Var.d.getClass();
                    if (RecyclerView.U(view).f47912f != 4) {
                        ArrayList arrayList3 = k1Var.f51390s;
                        ArrayList arrayList4 = k1Var.f51391w;
                        if (i10 < arrayList3.size()) {
                            document3 = (TLRPC.Document) k1Var.f51390s.get(i10);
                        }
                        if (document3 == u1Var2.l1) {
                            n nVar = u1Var2.f52014w1;
                            if (nVar != null) {
                                nVar.run();
                            }
                            u1Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList4.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList4.get(i10)).longValue();
                        }
                        if (document3 == null && (view instanceof vh.b1) && (f5Var = ((vh.b1) view).d) != null) {
                            document3 = f5Var.e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = f5.e(u1Var2.f21584a, longValue);
                        }
                        if (document3 != null) {
                            n20 n20Var2 = u1Var2.f52013v1;
                            if (n20Var2 != null) {
                                n20Var2.i(k1Var.f51387f.get(Long.valueOf(document3.f19800id)), document3, Boolean.FALSE);
                            }
                            u1Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                vh.s7 s7Var = (vh.s7) obj2;
                ig.h0 h0Var2 = (ig.h0) ig.h0.c().get(i10);
                s7Var.U0.setTypeface(h0Var2.f8320a);
                ig.s0 e7 = ig.s0.e(s7Var.f50986o1);
                String str3 = h0Var2.f8320a;
                e7.f8458j = str3;
                e7.f8452a.edit().putString("typeface", str3).apply();
                jg.j jVar2 = s7Var.f50993s0;
                if (jVar2 instanceof jg.g3) {
                    ((jg.g3) jVar2).setTypeface(h0Var2);
                }
                s7Var.M0(false);
                return;
            case 22:
                wh.g.A0((wh.g) obj2, i10);
                return;
            case 23:
                q51 q51Var8 = ((wh.f) obj2).U1;
                if (q51Var8 != null) {
                    q51Var8.G(i10 - 1);
                    return;
                }
                return;
            case 24:
                xh.i.D0((xh.i) obj2, i10);
                return;
            default:
                zf.z zVar = (zf.z) obj2;
                if (view instanceof org.telegram.ui.Cells.q4) {
                    org.telegram.ui.Cells.q4 q4Var2 = (org.telegram.ui.Cells.q4) view;
                    if (q4Var2.E) {
                        lx lxVar = zVar.U;
                        if (lxVar != null) {
                            lxVar.f39397a.Z4(q4Var2.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                lx lxVar2 = zVar.U;
                if (lxVar2 != null) {
                    zx zxVar = lxVar2.f39397a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (zxVar.f44174l2) {
                        if (zxVar.v5(longValue2)) {
                            if (!zxVar.I2.isEmpty()) {
                                zxVar.b4(longValue2, zxVar.s3(longValue2, null));
                                zxVar.o5();
                                lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                                lVar.k(true);
                                return;
                            }
                            zxVar.a4(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (o5.E(longValue2)) {
                        bundle.putLong("user_id", longValue2);
                    } else {
                        bundle.putLong("chat_id", -longValue2);
                    }
                    zxVar.V3();
                    if (org.telegram.messenger.i0.Q1() && zxVar.f44137e0 != null) {
                        int i24 = 0;
                        while (true) {
                            yx[] yxVarArr = zxVar.f44137e0;
                            if (i24 < yxVarArr.length) {
                                kw kwVar = yxVarArr[i24].d;
                                zxVar.f44193p2.f16109a = longValue2;
                                kwVar.f55584s = longValue2;
                                i24++;
                            } else {
                                int i25 = wp.D8;
                                zxVar.u5(512, true);
                            }
                        }
                    }
                    if (zxVar.f44183n2 != null) {
                        if (zxVar.getMessagesController().E(bundle, zxVar, null, null)) {
                            zxVar.getNotificationCenter().k(4, new Object[0]);
                            zxVar.presentFragment(new un(bundle));
                            return;
                        }
                        return;
                    } else if (zxVar.getMessagesController().E(bundle, zxVar, null, null)) {
                        zxVar.presentFragment(new un(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
