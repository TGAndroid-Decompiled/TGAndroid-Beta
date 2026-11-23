package bi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.ab;
import di.bb;
import di.fb;
import di.gb;
import di.pb;
import fi.f9;
import hi.u9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.kv;
import org.telegram.ui.mw;
import org.telegram.ui.tv;
import org.telegram.ui.vp0;
public final class k8 implements qj0 {
    public final int f3804a;
    public final Object f3805b;

    public k8(Object obj, int i7) {
        this.f3804a = i7;
        this.f3805b = obj;
    }

    @Override
    public final void c(int i7, View view) {
        o41 G;
        TLRPC.Document document;
        ci.h0 h0Var;
        o41 G2;
        o41 G3;
        o41 G4;
        TLRPC.Document document2;
        long longValue;
        org.telegram.ui.Components.p5 p5Var;
        org.telegram.ui.ActionBar.k kVar;
        gc K;
        int i10;
        int i11 = this.f3804a;
        String str = "";
        TLRPC.BotInlineResult botInlineResult = null;
        r13 = null;
        Object O = null;
        TLRPC.Document document3 = null;
        boolean z10 = false;
        r15 = 0;
        int i12 = 0;
        Object obj = this.f3805b;
        switch (i11) {
            case 0:
                n8 n8Var = (n8) obj;
                hi.e eVar = n8Var.Y1;
                HashSet hashSet = n8Var.V1;
                c51 c51Var = n8Var.f3960c2;
                if (c51Var != null && (G = c51Var.G(i7 - 1)) != null) {
                    Object obj2 = G.H;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i13 = savedStarGift.msg_id;
                        long j3 = i13 == 0 ? savedStarGift.saved_id : i13;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((g3) view).c(false, true);
                            G.f38085e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((g3) view).c(true, true);
                            G.f38085e = true;
                        }
                        if (hashSet.size() > 0) {
                            z10 = true;
                        }
                        eVar.setEnabled(z10);
                        eVar.c(hashSet.size(), true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ci.g0 g0Var = (ci.g0) obj;
                if ((view instanceof ci.l) && (document = ((ci.l) view).f5737e) != null) {
                    long j10 = document.f28440id;
                    if (j10 != 0) {
                        ci.j0 j0Var = g0Var.f5697a;
                        if (j0Var.d != null) {
                            if (!j0Var.getUserConfig().q() && ((h0Var = j0Var.h) == null || !h0Var.I.contains(Long.valueOf(j10)))) {
                                ci.z0 z0Var = j0Var.d;
                                z0Var.getClass();
                                z0Var.d1(0, hd.N0(2131746279, null), hd.N0(2131746277, null));
                                z0Var.i0();
                                return;
                            }
                            ci.z0 z0Var2 = j0Var.d;
                            int i14 = z0Var2.f5890b;
                            String o4 = a8.p0.o(j10, "c:");
                            HashMap hashMap = z0Var2.K;
                            if (!hashMap.containsKey(o4)) {
                                org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(i14, 2, document);
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
                            ci.h0 h0Var2 = j0Var.h;
                            if (h0Var2 != null) {
                                ArrayList a10 = h0Var2.a();
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
                                np.u1(h0Var2.f5789a).h7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                h0Var2.K = true;
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
                pb.C0((pb) obj, i7);
                return;
            case 3:
                ab abVar = (ab) obj;
                c51 c51Var2 = abVar.X1;
                if (c51Var2 != null && (G2 = c51Var2.G(i7 - 1)) != null) {
                    c51 c51Var3 = abVar.X1;
                    if (G2.d == -1) {
                        abVar.Y1 = !abVar.Y1;
                        c51Var3.O(true);
                        abVar.f39532o1.w0(0, org.telegram.messenger.g0.L(200.0f), nr.f37962g);
                        return;
                    } else if (G2.H(bb.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(abVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null) {
                            long j11 = abVar.V1.f28583id;
                            di.y8 y10 = di.y8.y(abVar.f30173a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                            e8 e8Var = new e8(abVar, G2, j11, 1);
                            int i16 = y10.f10085a;
                            if (np.u1(i16).f25906m7) {
                                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    di.y8.c0(Q.getContext(), Q.getResourceProvider());
                                    return;
                                } else {
                                    di.y8.c0(W, null);
                                    return;
                                }
                            } else if (!org.telegram.messenger.s2.b() && org.telegram.messenger.r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.user_id = np.u1(i16).q1(j11);
                                f5.a aVar = new f5.a();
                                aVar.f11277c = "inapp";
                                aVar.f11276b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new di.l6(y10, e8Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                return;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.user_id = np.u1(i16).q1(j11);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.s2.u(di.y8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new q1(y10, e8Var, tL_inputInvoiceStars, 7));
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
                fb fbVar = (fb) obj;
                c51 c51Var4 = fbVar.f8873a2;
                if (c51Var4 != null && (G3 = c51Var4.G(i7 - 1)) != null) {
                    c51 c51Var5 = fbVar.f8873a2;
                    if (G3.d == -1) {
                        fbVar.f8874b2 = !fbVar.f8874b2;
                        c51Var5.O(true);
                        return;
                    } else if (G3.H(bb.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(fbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            di.y8.y(fbVar.f30173a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.H, new o6(5, fbVar, G3), fbVar.Y1);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                gb gbVar = (gb) obj;
                c51 c51Var6 = gbVar.U1;
                if (c51Var6 != null && (G4 = c51Var6.G(i7 - 1)) != null) {
                    c51 c51Var7 = gbVar.U1;
                    if (G4.d == -1) {
                        gbVar.V1 = !gbVar.V1;
                        c51Var7.O(true);
                        gbVar.f39532o1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        return;
                    } else if (G4.H(bb.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(gbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            di.y8.y(gbVar.f30173a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.H, new o6(6, gbVar, G4), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                ((tv) obj).i((fi.p) view, false);
                return;
            case 7:
                gi.m mVar = (gi.m) obj;
                fq0 fq0Var = mVar.f13681a0;
                org.telegram.ui.ActionBar.g2 g2Var = fq0Var.f13696a;
                if (view instanceof org.telegram.ui.Cells.p7) {
                    gj messageObject = ((org.telegram.ui.Cells.p7) view).getMessageObject();
                    if (fq0Var.H.F1) {
                        if (fq0Var.c(messageObject)) {
                            fq0Var.g(messageObject);
                            return;
                        } else {
                            fq0Var.e(messageObject);
                            return;
                        }
                    }
                    f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
                    Context context = mVar.getContext();
                    int e12 = messageObject.e1();
                    fi.a6 a6Var = mVar.f13680a;
                    fi.y6 a11 = fi.y6.a(mVar.f13685f);
                    if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).f43682s1) {
                        i12 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a11.f12832s += i12;
                    orCreateStoryViewer.I(context, e12, a6Var, a11);
                    return;
                }
                return;
            case 8:
                y10 y10Var = ((hi.a0) obj).f14207c;
                if (y10Var != null) {
                    y10Var.a((hi.v) hi.v.a().get(i7));
                    return;
                }
                return;
            case 9:
                hi.t1 t1Var = (hi.t1) obj;
                hi.i2 i2Var = t1Var.f15500r;
                Object F = t1Var.f15496c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                } else {
                    return;
                }
                u10 u10Var = i2Var.f14786z1;
                if (u10Var != null) {
                    u10Var.m(botInlineResult, document2, Boolean.TRUE);
                }
                i2Var.dismiss();
                return;
            case 10:
                hi.y1 y1Var = (hi.y1) obj;
                hi.i2 i2Var2 = y1Var.f15786s;
                hi.x1 x1Var = y1Var.f15781c;
                if (i7 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f59169f != 4) {
                        ArrayList arrayList2 = x1Var.f15739s;
                        ArrayList arrayList3 = x1Var.f15740w;
                        if (i7 < arrayList2.size()) {
                            document3 = (TLRPC.Document) x1Var.f15739s.get(i7);
                        }
                        if (document3 == i2Var2.f14776p1) {
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
                        if (document3 == null && (view instanceof hi.n1) && (p5Var = ((hi.n1) view).d) != null) {
                            document3 = p5Var.f38495e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = org.telegram.ui.Components.p5.e(i2Var2.f30173a, longValue);
                        }
                        if (document3 != null) {
                            u10 u10Var2 = i2Var2.f14786z1;
                            if (u10Var2 != null) {
                                u10Var2.m(x1Var.f15736f.get(Long.valueOf(document3.f28440id)), document3, Boolean.FALSE);
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
                u9Var.V0.setTypeface(a0Var.f57199a);
                sg.k0 e10 = sg.k0.e(u9Var.f14897p1);
                String str2 = a0Var.f57199a;
                e10.f57313j = str2;
                e10.f57306a.edit().putString("typeface", str2).apply();
                tg.j jVar = u9Var.f14904t0;
                if (jVar instanceof tg.n2) {
                    ((tg.n2) jVar).setTypeface(a0Var);
                }
                u9Var.M0(false);
                return;
            case 12:
                ii.t.A0((ii.t) obj, i7);
                return;
            case 13:
                c51 c51Var8 = ((ii.s) obj).Y1;
                if (c51Var8 != null) {
                    c51Var8.G(i7 - 1);
                    return;
                }
                return;
            case 14:
                jg.h0 h0Var3 = (jg.h0) obj;
                if (view instanceof org.telegram.ui.Cells.p4) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (p4Var.F) {
                        mw mwVar = h0Var3.V;
                        if (mwVar != null) {
                            mwVar.f49998a.h5(p4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                mw mwVar2 = h0Var3.V;
                if (mwVar2 != null) {
                    cx cxVar = mwVar2.f49998a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (cxVar.f46761n2) {
                        if (cxVar.E5(longValue2)) {
                            if (!cxVar.K2.isEmpty()) {
                                cxVar.b4(longValue2, cxVar.s3(longValue2, null));
                                cxVar.w5();
                                kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                                kVar.n(true);
                                return;
                            }
                            cxVar.a4(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.n5.E(longValue2)) {
                        bundle.putLong("user_id", longValue2);
                    } else {
                        bundle.putLong("chat_id", -longValue2);
                    }
                    cxVar.V3();
                    if (org.telegram.messenger.g0.Q1() && cxVar.f46722f0 != null) {
                        int i17 = 0;
                        while (true) {
                            bx[] bxVarArr = cxVar.f46722f0;
                            if (i17 < bxVarArr.length) {
                                kv kvVar = bxVarArr[i17].d;
                                cxVar.f46781r2.f27073a = longValue2;
                                kvVar.f17608s = longValue2;
                                i17++;
                            } else {
                                int i18 = np.I8;
                                cxVar.D5(512, true);
                            }
                        }
                    }
                    if (cxVar.f46770p2 != null) {
                        if (cxVar.getMessagesController().E(bundle, cxVar, null, null)) {
                            cxVar.getNotificationCenter().k(4, new Object[0]);
                            cxVar.presentFragment(new bn(bundle));
                            return;
                        }
                        return;
                    } else if (cxVar.getMessagesController().E(bundle, cxVar, null, null)) {
                        cxVar.presentFragment(new bn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                kg.h0 h0Var4 = (kg.h0) obj;
                kg.e0 e0Var = h0Var4.f18368y;
                ui uiVar = h0Var4.f37520b;
                v4.i0 adapter = h0Var4.f18365s.getAdapter();
                kg.f0 f0Var = h0Var4.E;
                if (adapter == f0Var) {
                    ArrayList arrayList4 = f0Var.d;
                    int i19 = i7 - 1;
                    if (i19 >= 0 && i19 < arrayList4.size()) {
                        O = arrayList4.get(i19);
                    }
                } else {
                    int S = e0Var.S(i7);
                    int Q2 = e0Var.Q(i7);
                    if (Q2 >= 0 && S >= 0) {
                        O = e0Var.O(S, Q2);
                    } else {
                        return;
                    }
                }
                if (O instanceof kg.u1) {
                    if (!k10.i(uiVar.H3).q()) {
                        if (uiVar.f40368a2 != null) {
                            new ug.y0(uiVar.f40368a2, h0Var4.getContext(), uiVar.H3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    kg.u1 u1Var = (kg.u1) O;
                    org.telegram.ui.Components.c5.X(uiVar.H3, u1Var.a(), uiVar.c1(), new ai.y1(24, h0Var4, u1Var));
                    return;
                }
                return;
            case 16:
                kg.k0 k0Var = (kg.k0) obj;
                o41 G5 = k0Var.f18397a2.G(i7 - 1);
                if (G5 != null) {
                    kg.b0 b0Var = k0Var.V1;
                    if (!b0Var.h(G5)) {
                        int i20 = G5.d;
                        int i21 = kg.k0.f18395g2;
                        if (i20 == -1) {
                            k0Var.f18398b2 = true;
                            b0Var.h = true;
                            k0Var.f18397a2.O(true);
                            k0Var.e1(true);
                            return;
                        }
                        int i22 = kg.k0.f18396h2;
                        if (i20 == -2) {
                            k0Var.f18398b2 = false;
                            b0Var.h = false;
                            k0Var.f18397a2.O(true);
                            k0Var.e1(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ki.j.D0((ki.j) obj, i7);
                return;
            case 18:
                ni.a aVar2 = (ni.a) obj;
                int i23 = aVar2.T1.G(i7 - 1).d;
                if (i23 == 151) {
                    aVar2.f1(false);
                    return;
                } else if (i23 == 150) {
                    aVar2.f1(true);
                    return;
                } else {
                    return;
                }
            case 19:
                pg.i iVar = (pg.i) obj;
                Runnable runnable = ((pg.a) iVar.F.get(i7)).f55640c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 20:
                vp0 vp0Var = (vp0) obj;
                sg.a0 a0Var2 = (sg.a0) sg.a0.c().get(i7);
                vp0Var.f57912e1.setTypeface(a0Var2.f57199a);
                sg.k0 e11 = sg.k0.e(vp0Var.f57946z1);
                String str3 = a0Var2.f57199a;
                e11.f57313j = str3;
                e11.f57306a.edit().putString("typeface", str3).apply();
                tg.j jVar2 = vp0Var.C0;
                if (jVar2 instanceof tg.n2) {
                    ((tg.n2) jVar2).setTypeface(a0Var2);
                }
                vp0Var.z0(false);
                return;
            case 21:
                tg.z0 z0Var3 = (tg.z0) obj;
                z0Var3.j3.accept(Integer.valueOf(z0Var3.f58240i3.b(i7)));
                sg.k0 k0Var2 = z0Var3.f58240i3;
                k0Var2.f57308c.put(Integer.valueOf(k0Var2.f57310f), Integer.valueOf(k0Var2.b(i7)));
                k0Var2.f57309e = true;
                return;
            case 22:
                ug.k0 k0Var3 = (ug.k0) obj;
                HashSet hashSet2 = k0Var3.f58787u2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar.f31125r.a(hashSet2.contains(currentChannel), true);
                    k0Var3.F1();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i4) {
                    if (k0Var3.U1 || ((i10 = k0Var3.d2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                        Object object = i4Var.getObject();
                        if (i4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j12 = ((TLRPC.User) object).f28583id;
                                int i24 = -k0Var3.Q2;
                                k0Var3.Q2 = i24;
                                org.telegram.messenger.g0.E3(i24, i4Var, null);
                                org.telegram.messenger.q2.APP_ERROR.a();
                                if (j12 >= 0) {
                                    str = p10.l(np.u1(k0Var3.f30173a).c2(Long.valueOf(j12)));
                                }
                                if (np.u1(k0Var3.f30173a).K3()) {
                                    K = new lc((FrameLayout) k0Var3.f30176b, k0Var3.J0).Q(2131624217, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131743515, str)));
                                } else {
                                    K = new lc((FrameLayout) k0Var3.f30176b, k0Var3.J0).K(2131624217, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131743515, str)), hd.N0(2131743514, null), new ug.v(k0Var3, 0));
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
                        i4Var.c(hashSet2.contains(object), true);
                        k0Var3.F1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 23:
                ug.u0 u0Var = (ug.u0) obj;
                if (view != null) {
                    u0Var.z1(view, true);
                    u0Var.f58827l3 = false;
                    u0Var.w0(0, view.getTop() - ((u0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    return;
                }
                return;
            case 24:
                ((l90) obj).h(view);
                return;
            default:
                ((zh.l) obj).h(view);
                return;
        }
    }
}
