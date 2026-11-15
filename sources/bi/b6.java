package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.bb;
import di.cb;
import di.lb;
import di.u8;
import di.wa;
import di.xa;
import fi.b7;
import fi.i9;
import hi.u9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.hv;
import org.telegram.ui.jw;
import org.telegram.ui.qv;
import org.telegram.ui.tp0;
import org.telegram.ui.xw;
import org.telegram.ui.yw;
public final class b6 implements gj0 {
    public final int f3402a;
    public final Object f3403b;

    public b6(Object obj, int i7) {
        this.f3402a = i7;
        this.f3403b = obj;
    }

    @Override
    public final void b(int i7, View view) {
        b41 G;
        TLRPC.Document document;
        ci.g0 g0Var;
        b41 G2;
        b41 G3;
        b41 G4;
        TLRPC.Document document2;
        long longValue;
        org.telegram.ui.Components.g5 g5Var;
        org.telegram.ui.ActionBar.k kVar;
        xb K;
        int i10;
        int i11 = this.f3402a;
        String str = "";
        TLRPC.BotInlineResult botInlineResult = null;
        r12 = null;
        Object O = null;
        TLRPC.Document document3 = null;
        boolean z10 = false;
        r14 = 0;
        int i12 = 0;
        Object obj = this.f3403b;
        switch (i11) {
            case 0:
                e6 e6Var = (e6) obj;
                hi.d dVar = e6Var.Y1;
                HashSet hashSet = e6Var.V1;
                p41 p41Var = e6Var.f3487c2;
                if (p41Var != null && (G = p41Var.G(i7 - 1)) != null) {
                    Object obj2 = G.G;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i13 = savedStarGift.msg_id;
                        long j3 = i13 == 0 ? savedStarGift.saved_id : i13;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((i2) view).c(false, true);
                            G.f33178e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((i2) view).c(true, true);
                            G.f33178e = true;
                        }
                        if (hashSet.size() > 0) {
                            z10 = true;
                        }
                        dVar.setEnabled(z10);
                        dVar.c(hashSet.size(), true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ci.f0 f0Var = (ci.f0) obj;
                if ((view instanceof ci.l) && (document = ((ci.l) view).f5425e) != null) {
                    long j10 = document.f28057id;
                    if (j10 != 0) {
                        ci.i0 i0Var = f0Var.f5381a;
                        if (i0Var.d != null) {
                            if (!i0Var.getUserConfig().q() && ((g0Var = i0Var.h) == null || !g0Var.I.contains(Long.valueOf(j10)))) {
                                ci.z0 z0Var = i0Var.d;
                                z0Var.getClass();
                                z0Var.d1(0, hd.M0(2131746475, null), hd.M0(2131746473, null));
                                z0Var.i0();
                                return;
                            }
                            ci.z0 z0Var2 = i0Var.d;
                            int i14 = z0Var2.f5578b;
                            String o4 = a8.p0.o(j10, "c:");
                            HashMap hashMap = z0Var2.K;
                            if (!hashMap.containsKey(o4)) {
                                org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(i14, 2, document);
                                l10.a(z0Var2);
                                hashMap.put(o4, l10);
                            }
                            if (o4 != null && !o4.startsWith("c:")) {
                                o4 = o4.replace("️", "");
                            }
                            ArrayList arrayList = z0Var2.J;
                            int indexOf = arrayList.indexOf(o4);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                            } else {
                                if (arrayList.size() >= 6) {
                                    arrayList.remove(0);
                                }
                                arrayList.add(o4);
                            }
                            z0Var2.c();
                            z0Var2.i0();
                            ci.g0 g0Var2 = i0Var.h;
                            if (g0Var2 != null) {
                                ArrayList a10 = g0Var2.a();
                                a10.remove(Long.valueOf(j10));
                                a10.add(0, Long.valueOf(j10));
                                while (a10.size() > 21) {
                                    a8.p0.z(1, a10);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i15 = 0; i15 < a10.size(); i15++) {
                                    if (i15 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a10.get(i15));
                                }
                                np.s1(g0Var2.f5478a).f25283f7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                g0Var2.K = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                lb.C0((lb) obj, i7);
                return;
            case 3:
                wa waVar = (wa) obj;
                p41 p41Var2 = waVar.X1;
                if (p41Var2 != null && (G2 = p41Var2.G(i7 - 1)) != null) {
                    p41 p41Var3 = waVar.X1;
                    if (G2.d == -1) {
                        waVar.Y1 = !waVar.Y1;
                        p41Var3.O(true);
                        waVar.f35931o1.w0(0, org.telegram.messenger.g0.L(200.0f), er.f34420g);
                        return;
                    } else if (G2.H(xa.class) && (G2.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(waVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null) {
                            long j11 = waVar.V1.f28200id;
                            u8 y10 = u8.y(waVar.f29679a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.G;
                            v5 v5Var = new v5(waVar, G2, j11, 1);
                            int i16 = y10.f9529a;
                            if (np.s1(i16).f25325k7) {
                                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    u8.c0(Q.getContext(), Q.getResourceProvider());
                                    return;
                                } else {
                                    u8.c0(W, null);
                                    return;
                                }
                            } else if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.user_id = np.s1(i16).o1(j11);
                                f5.a aVar = new f5.a();
                                aVar.f10926c = "inapp";
                                aVar.f10925b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new di.i6(y10, v5Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                return;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.user_id = np.s1(i16).o1(j11);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.x2.u(u8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new j6(y10, v5Var, tL_inputInvoiceStars, 5));
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                bb bbVar = (bb) obj;
                p41 p41Var4 = bbVar.f8275a2;
                if (p41Var4 != null && (G3 = p41Var4.G(i7 - 1)) != null) {
                    p41 p41Var5 = bbVar.f8275a2;
                    if (G3.d == -1) {
                        bbVar.f8276b2 = !bbVar.f8276b2;
                        p41Var5.O(true);
                        return;
                    } else if (G3.H(xa.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(bbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            u8.y(bbVar.f29679a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.G, new e4(3, bbVar, G3), bbVar.Y1);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                cb cbVar = (cb) obj;
                p41 p41Var6 = cbVar.U1;
                if (p41Var6 != null && (G4 = p41Var6.G(i7 - 1)) != null) {
                    p41 p41Var7 = cbVar.U1;
                    if (G4.d == -1) {
                        cbVar.V1 = !cbVar.V1;
                        p41Var7.O(true);
                        cbVar.f35931o1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        return;
                    } else if (G4.H(xa.class) && (G4.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(cbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            u8.y(cbVar.f29679a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.G, new e4(4, cbVar, G4), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                ((qv) obj).i((fi.p) view, false);
                return;
            case 7:
                gi.m mVar = (gi.m) obj;
                vp0 vp0Var = mVar.f13337a0;
                org.telegram.ui.ActionBar.e2 e2Var = vp0Var.f13352a;
                if (view instanceof n7) {
                    gj messageObject = ((n7) view).getMessageObject();
                    if (vp0Var.H.F1) {
                        if (vp0Var.c(messageObject)) {
                            vp0Var.g(messageObject);
                            return;
                        } else {
                            vp0Var.e(messageObject);
                            return;
                        }
                    }
                    i9 orCreateStoryViewer = e2Var.getOrCreateStoryViewer();
                    Context context = mVar.getContext();
                    int e12 = messageObject.e1();
                    fi.c6 c6Var = mVar.f13336a;
                    b7 a11 = b7.a(mVar.f13341f);
                    if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).f43191s1) {
                        i12 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a11.f11575s += i12;
                    orCreateStoryViewer.I(context, e12, c6Var, a11);
                    return;
                }
                return;
            case 8:
                z10 z10Var = ((hi.y) obj).f15402c;
                if (z10Var != null) {
                    z10Var.a((hi.t) hi.t.a().get(i7));
                    return;
                }
                return;
            case 9:
                hi.t1 t1Var = (hi.t1) obj;
                hi.i2 i2Var = t1Var.f15141r;
                Object F = t1Var.f15137c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                } else {
                    return;
                }
                v10 v10Var = i2Var.f14415z1;
                if (v10Var != null) {
                    v10Var.l(botInlineResult, document2, Boolean.TRUE);
                }
                i2Var.dismiss();
                return;
            case 10:
                hi.y1 y1Var = (hi.y1) obj;
                hi.i2 i2Var2 = y1Var.f15414s;
                hi.x1 x1Var = y1Var.f15409c;
                if (i7 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f58539f != 4) {
                        ArrayList arrayList2 = x1Var.f15320s;
                        ArrayList arrayList3 = x1Var.f15321w;
                        if (i7 < arrayList2.size()) {
                            document3 = (TLRPC.Document) x1Var.f15320s.get(i7);
                        }
                        if (document3 == i2Var2.f14405p1) {
                            kg.g gVar = i2Var2.A1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            i2Var2.dismiss();
                            return;
                        }
                        if (i7 >= arrayList3.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList3.get(i7)).longValue();
                        }
                        if (document3 == null && (view instanceof hi.n1) && (g5Var = ((hi.n1) view).d) != null) {
                            document3 = g5Var.f34808e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = org.telegram.ui.Components.g5.e(i2Var2.f29679a, longValue);
                        }
                        if (document3 != null) {
                            v10 v10Var2 = i2Var2.f14415z1;
                            if (v10Var2 != null) {
                                v10Var2.l(x1Var.f15317f.get(Long.valueOf(document3.f28057id)), document3, Boolean.FALSE);
                            }
                            i2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                u9 u9Var = (u9) obj;
                sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
                u9Var.V0.setTypeface(a0Var.f56580a);
                sg.k0 e10 = sg.k0.e(u9Var.f14683p1);
                String str2 = a0Var.f56580a;
                e10.f56694j = str2;
                e10.f56687a.edit().putString("typeface", str2).apply();
                tg.j jVar = u9Var.f14690t0;
                if (jVar instanceof tg.n2) {
                    ((tg.n2) jVar).setTypeface(a0Var);
                }
                u9Var.M0(false);
                return;
            case 12:
                ii.f.A0((ii.f) obj, i7);
                return;
            case 13:
                p41 p41Var8 = ((ii.e) obj).Y1;
                if (p41Var8 != null) {
                    p41Var8.G(i7 - 1);
                    return;
                }
                return;
            case 14:
                jg.h0 h0Var = (jg.h0) obj;
                if (view instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (o4Var.F) {
                        jw jwVar = h0Var.V;
                        if (jwVar != null) {
                            jwVar.f48422a.Z4(o4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                jw jwVar2 = h0Var.V;
                if (jwVar2 != null) {
                    yw ywVar = jwVar2.f48422a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (ywVar.f53677n2) {
                        if (ywVar.v5(longValue2)) {
                            if (!ywVar.K2.isEmpty()) {
                                ywVar.b4(longValue2, ywVar.s3(longValue2, null));
                                ywVar.o5();
                                kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                                kVar.n(true);
                                return;
                            }
                            ywVar.a4(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.m5.E(longValue2)) {
                        bundle.putLong("user_id", longValue2);
                    } else {
                        bundle.putLong("chat_id", -longValue2);
                    }
                    ywVar.V3();
                    if (org.telegram.messenger.g0.Q1() && ywVar.f53638f0 != null) {
                        int i17 = 0;
                        while (true) {
                            xw[] xwVarArr = ywVar.f53638f0;
                            if (i17 < xwVarArr.length) {
                                hv hvVar = xwVarArr[i17].d;
                                ywVar.f53697r2.f26861a = longValue2;
                                hvVar.f17197s = longValue2;
                                i17++;
                            } else {
                                int i18 = np.D8;
                                ywVar.u5(512, true);
                            }
                        }
                    }
                    if (ywVar.f53686p2 != null) {
                        if (ywVar.getMessagesController().E(bundle, ywVar, null, null)) {
                            ywVar.getNotificationCenter().k(4, new Object[0]);
                            ywVar.presentFragment(new an(bundle));
                            return;
                        }
                        return;
                    } else if (ywVar.getMessagesController().E(bundle, ywVar, null, null)) {
                        ywVar.presentFragment(new an(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                kg.g0 g0Var3 = (kg.g0) obj;
                kg.d0 d0Var = g0Var3.f17948y;
                ki kiVar = g0Var3.f33609b;
                v4.h0 adapter = g0Var3.f17945s.getAdapter();
                kg.e0 e0Var = g0Var3.E;
                if (adapter == e0Var) {
                    ArrayList arrayList4 = e0Var.d;
                    int i19 = i7 - 1;
                    if (i19 >= 0 && i19 < arrayList4.size()) {
                        O = arrayList4.get(i19);
                    }
                } else {
                    int S = d0Var.S(i7);
                    int Q2 = d0Var.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = d0Var.O(S, Q2);
                    } else {
                        return;
                    }
                }
                if (O instanceof kg.u1) {
                    if (!m10.i(kiVar.H3).q()) {
                        if (kiVar.f36424a2 != null) {
                            new ug.x0(kiVar.f36424a2, g0Var3.getContext(), kiVar.H3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    kg.u1 u1Var = (kg.u1) O;
                    org.telegram.ui.Components.t4.X(kiVar.H3, u1Var.a(), kiVar.b1(), new ai.v1(22, g0Var3, u1Var));
                    return;
                }
                return;
            case 16:
                kg.i0 i0Var2 = (kg.i0) obj;
                b41 G5 = i0Var2.f17961a2.G(i7 - 1);
                if (G5 != null) {
                    kg.a0 a0Var2 = i0Var2.V1;
                    if (!a0Var2.h(G5)) {
                        int i20 = G5.d;
                        int i21 = kg.i0.f17959g2;
                        if (i20 == -1) {
                            i0Var2.f17962b2 = true;
                            a0Var2.h = true;
                            i0Var2.f17961a2.O(true);
                            i0Var2.d1(true);
                            return;
                        }
                        int i22 = kg.i0.f17960h2;
                        if (i20 == -2) {
                            i0Var2.f17962b2 = false;
                            a0Var2.h = false;
                            i0Var2.f17961a2.O(true);
                            i0Var2.d1(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ki.k.D0((ki.k) obj, i7);
                return;
            case 18:
                ni.a aVar2 = (ni.a) obj;
                int i23 = aVar2.T1.G(i7 - 1).d;
                if (i23 == 151) {
                    aVar2.e1(false);
                    return;
                } else if (i23 == 150) {
                    aVar2.e1(true);
                    return;
                } else {
                    return;
                }
            case 19:
                pg.i iVar = (pg.i) obj;
                Runnable runnable = ((pg.a) iVar.F.get(i7)).f55019c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 20:
                tp0 tp0Var = (tp0) obj;
                sg.a0 a0Var3 = (sg.a0) sg.a0.c().get(i7);
                tp0Var.f57282e1.setTypeface(a0Var3.f56580a);
                sg.k0 e11 = sg.k0.e(tp0Var.f57316z1);
                String str3 = a0Var3.f56580a;
                e11.f56694j = str3;
                e11.f56687a.edit().putString("typeface", str3).apply();
                tg.j jVar2 = tp0Var.C0;
                if (jVar2 instanceof tg.n2) {
                    ((tg.n2) jVar2).setTypeface(a0Var3);
                }
                tp0Var.z0(false);
                return;
            case 21:
                tg.y0 y0Var = (tg.y0) obj;
                y0Var.j3.accept(Integer.valueOf(y0Var.f57612i3.b(i7)));
                sg.k0 k0Var = y0Var.f57612i3;
                k0Var.f56689c.put(Integer.valueOf(k0Var.f56691f), Integer.valueOf(k0Var.b(i7)));
                k0Var.f56690e = true;
                return;
            case 22:
                ug.j0 j0Var = (ug.j0) obj;
                HashSet hashSet2 = j0Var.f58149u2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar.f30709r.a(hashSet2.contains(currentChannel), true);
                    j0Var.E1();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h4) {
                    if (j0Var.U1 || ((i10 = j0Var.d2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        Object object = h4Var.getObject();
                        if (h4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j12 = ((TLRPC.User) object).f28200id;
                                int i24 = -j0Var.Q2;
                                j0Var.Q2 = i24;
                                org.telegram.messenger.g0.F3(i24, h4Var, null);
                                org.telegram.messenger.p2.APP_ERROR.a();
                                if (j12 >= 0) {
                                    str = q10.k(np.s1(j0Var.f29679a).a2(Long.valueOf(j12)));
                                }
                                if (np.s1(j0Var.f29679a).D3()) {
                                    K = new cc((FrameLayout) j0Var.f29682b, j0Var.J0).Q(2131624217, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743760, str)));
                                } else {
                                    K = new cc((FrameLayout) j0Var.f29682b, j0Var.J0).K(2131624217, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743760, str)), hd.M0(2131743759, null), new ug.v(j0Var, 0));
                                }
                                K.j();
                                return;
                            }
                            return;
                        }
                        if (hashSet2.contains(object)) {
                            hashSet2.remove(object);
                        } else {
                            hashSet2.add(object);
                        }
                        h4Var.c(hashSet2.contains(object), true);
                        j0Var.E1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 23:
                ug.t0 t0Var = (ug.t0) obj;
                if (view != null) {
                    t0Var.z1(view, true);
                    t0Var.f58183l3 = false;
                    t0Var.w0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    return;
                }
                return;
            case 24:
                ((z80) obj).h(view);
                return;
            default:
                ((zh.l) obj).h(view);
                return;
        }
    }
}
