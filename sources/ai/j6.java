package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ci.e9;
import ci.hb;
import ci.ib;
import ci.mb;
import ci.nb;
import ci.wb;
import ei.i7;
import ei.r9;
import gi.x9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.q10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dv;
import org.telegram.ui.ew;
import org.telegram.ui.lp0;
import org.telegram.ui.mv;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
public final class j6 implements fj0 {
    public final int f753a;
    public final Object f754b;

    public j6(Object obj, int i3) {
        this.f753a = i3;
        this.f754b = obj;
    }

    @Override
    public final void f(int i3, View view) {
        r31 G;
        TLRPC.Document document;
        bi.h0 h0Var;
        r31 G2;
        r31 G3;
        r31 G4;
        TLRPC.Document document2;
        long longValue;
        org.telegram.ui.Components.g5 g5Var;
        org.telegram.ui.ActionBar.k kVar;
        ac K;
        int i10;
        int i11 = this.f753a;
        String str = "";
        TLRPC.BotInlineResult botInlineResult = null;
        r12 = null;
        Object O = null;
        TLRPC.Document document3 = null;
        boolean z10 = false;
        r14 = 0;
        int i12 = 0;
        Object obj = this.f754b;
        switch (i11) {
            case 0:
                m6 m6Var = (m6) obj;
                gi.d dVar = m6Var.V1;
                HashSet hashSet = m6Var.S1;
                f41 f41Var = m6Var.Z1;
                if (f41Var != null && (G = f41Var.G(i3 - 1)) != null) {
                    Object obj2 = G.G;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i13 = savedStarGift.msg_id;
                        long j10 = i13 == 0 ? savedStarGift.saved_id : i13;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((q2) view).c(false, true);
                            G.f37621e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((q2) view).c(true, true);
                            G.f37621e = true;
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
                bi.g0 g0Var = (bi.g0) obj;
                if ((view instanceof bi.l) && (document = ((bi.l) view).f3783e) != null) {
                    long j11 = document.f27007id;
                    if (j11 != 0) {
                        bi.j0 j0Var = g0Var.f3743a;
                        if (j0Var.d != null) {
                            if (!j0Var.getUserConfig().q() && ((h0Var = j0Var.h) == null || !h0Var.I.contains(Long.valueOf(j11)))) {
                                bi.a1 a1Var = j0Var.d;
                                a1Var.getClass();
                                a1Var.d1(0, bd.M0(2131746483, null), bd.M0(2131746481, null));
                                a1Var.i0();
                                return;
                            }
                            bi.a1 a1Var2 = j0Var.d;
                            int i14 = a1Var2.f3404b;
                            String p10 = a1.g.p(j11, "c:");
                            HashMap hashMap = a1Var2.K;
                            if (!hashMap.containsKey(p10)) {
                                org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(i14, 2, document);
                                l10.a(a1Var2);
                                hashMap.put(p10, l10);
                            }
                            if (p10 != null && !p10.startsWith("c:")) {
                                p10 = p10.replace("️", "");
                            }
                            ArrayList arrayList = a1Var2.J;
                            int indexOf = arrayList.indexOf(p10);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                            } else {
                                if (arrayList.size() >= 6) {
                                    arrayList.remove(0);
                                }
                                arrayList.add(p10);
                            }
                            a1Var2.c();
                            a1Var2.i0();
                            bi.h0 h0Var2 = j0Var.h;
                            if (h0Var2 != null) {
                                ArrayList a10 = h0Var2.a();
                                a10.remove(Long.valueOf(j11));
                                a10.add(0, Long.valueOf(j11));
                                while (a10.size() > 21) {
                                    a1.g.y(1, a10);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i15 = 0; i15 < a10.size(); i15++) {
                                    if (i15 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a10.get(i15));
                                }
                                hp.s1(h0Var2.f3838a).f22999e7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
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
                wb.C0((wb) obj, i3);
                return;
            case 3:
                hb hbVar = (hb) obj;
                f41 f41Var2 = hbVar.U1;
                if (f41Var2 != null && (G2 = f41Var2.G(i3 - 1)) != null) {
                    f41 f41Var3 = hbVar.U1;
                    if (G2.d == -1) {
                        hbVar.V1 = !hbVar.V1;
                        f41Var3.O(true);
                        hbVar.f36102l1.w0(0, org.telegram.messenger.g0.L(200.0f), xq.f40453g);
                        return;
                    } else if (G2.H(ib.class) && (G2.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(hbVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.K1;
                        }
                        if (W != null) {
                            long j12 = hbVar.S1.f27150id;
                            e9 y9 = e9.y(hbVar.f28583a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.G;
                            d6 d6Var = new d6(hbVar, G2, j12, 1);
                            int i16 = y9.f5029a;
                            if (hp.s1(i16).f23042j7) {
                                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    e9.c0(Q.getContext(), Q.getResourceProvider());
                                    return;
                                } else {
                                    e9.c0(W, null);
                                    return;
                                }
                            } else if (!org.telegram.messenger.r2.b() && org.telegram.messenger.r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.user_id = hp.s1(i16).o1(j12);
                                e5.a aVar = new e5.a();
                                aVar.f9555c = "inapp";
                                aVar.f9554b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new ci.r6(y9, d6Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                return;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.user_id = hp.s1(i16).o1(j12);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ii.a3.u(e9.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new r6(y9, d6Var, tL_inputInvoiceStars, 5));
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
                mb mbVar = (mb) obj;
                f41 f41Var4 = mbVar.X1;
                if (f41Var4 != null && (G3 = f41Var4.G(i3 - 1)) != null) {
                    f41 f41Var5 = mbVar.X1;
                    if (G3.d == -1) {
                        mbVar.Y1 = !mbVar.Y1;
                        f41Var5.O(true);
                        return;
                    } else if (G3.H(ib.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(mbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.K1;
                        }
                        if (W2 != null) {
                            e9.y(mbVar.f28583a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.G, new q4(3, mbVar, G3), mbVar.V1);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                nb nbVar = (nb) obj;
                f41 f41Var6 = nbVar.R1;
                if (f41Var6 != null && (G4 = f41Var6.G(i3 - 1)) != null) {
                    f41 f41Var7 = nbVar.R1;
                    if (G4.d == -1) {
                        nbVar.S1 = !nbVar.S1;
                        f41Var7.O(true);
                        nbVar.f36102l1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        return;
                    } else if (G4.H(ib.class) && (G4.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(nbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.K1;
                        }
                        if (W3 != null) {
                            e9.y(nbVar.f28583a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.G, new q4(4, nbVar, G4), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                ((mv) obj).i((ei.q) view, false);
                return;
            case 7:
                fi.m mVar = (fi.m) obj;
                tp0 tp0Var = mVar.f11616a0;
                org.telegram.ui.ActionBar.d2 d2Var = tp0Var.f11631a;
                if (view instanceof n7) {
                    zi messageObject = ((n7) view).getMessageObject();
                    if (tp0Var.H.F1) {
                        if (tp0Var.c(messageObject)) {
                            tp0Var.g(messageObject);
                            return;
                        } else {
                            tp0Var.e(messageObject);
                            return;
                        }
                    }
                    r9 orCreateStoryViewer = d2Var.getOrCreateStoryViewer();
                    Context context = mVar.getContext();
                    int f12 = messageObject.f1();
                    ei.k6 k6Var = mVar.f11615a;
                    i7 a11 = i7.a(mVar.f11620f);
                    if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).f41847s1) {
                        i12 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a11.f10422s += i12;
                    orCreateStoryViewer.Q(context, f12, k6Var, a11);
                    return;
                }
                return;
            case 8:
                u10 u10Var = ((gi.y) obj).f13877c;
                if (u10Var != null) {
                    u10Var.a((gi.t) gi.t.a().get(i3));
                    return;
                }
                return;
            case 9:
                gi.t1 t1Var = (gi.t1) obj;
                gi.i2 i2Var = t1Var.f13606r;
                Object F = t1Var.f13602c.F(i3);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                } else {
                    return;
                }
                q10 q10Var = i2Var.f12962w1;
                if (q10Var != null) {
                    q10Var.i(botInlineResult, document2, Boolean.TRUE);
                }
                i2Var.dismiss();
                return;
            case 10:
                gi.y1 y1Var = (gi.y1) obj;
                gi.i2 i2Var2 = y1Var.f13920s;
                gi.x1 x1Var = y1Var.f13915c;
                if (i3 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f55544f != 4) {
                        ArrayList arrayList2 = x1Var.f13820s;
                        ArrayList arrayList3 = x1Var.f13821w;
                        if (i3 < arrayList2.size()) {
                            document3 = (TLRPC.Document) x1Var.f13820s.get(i3);
                        }
                        if (document3 == i2Var2.m1) {
                            lg.g gVar = i2Var2.f12963x1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            i2Var2.dismiss();
                            return;
                        }
                        if (i3 >= arrayList3.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList3.get(i3)).longValue();
                        }
                        if (document3 == null && (view instanceof gi.l1) && (g5Var = ((gi.l1) view).d) != null) {
                            document3 = g5Var.f33966e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = org.telegram.ui.Components.g5.e(i2Var2.f28583a, longValue);
                        }
                        if (document3 != null) {
                            q10 q10Var2 = i2Var2.f12962w1;
                            if (q10Var2 != null) {
                                q10Var2.i(x1Var.f13817f.get(Long.valueOf(document3.f27007id)), document3, Boolean.FALSE);
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
                x9 x9Var = (x9) obj;
                tg.b0 b0Var = (tg.b0) tg.b0.c().get(i3);
                x9Var.V0.setTypeface(b0Var.f55128a);
                tg.k0 e10 = tg.k0.e(x9Var.f13222p1);
                String str2 = b0Var.f55128a;
                e10.f55236j = str2;
                e10.f55229a.edit().putString("typeface", str2).apply();
                ug.j jVar = x9Var.f13229t0;
                if (jVar instanceof ug.l2) {
                    ((ug.l2) jVar).setTypeface(b0Var);
                }
                x9Var.M0(false);
                return;
            case 12:
                hi.g.A0((hi.g) obj, i3);
                return;
            case 13:
                f41 f41Var8 = ((hi.f) obj).V1;
                if (f41Var8 != null) {
                    f41Var8.G(i3 - 1);
                    return;
                }
                return;
            case 14:
                ii.k.D0((ii.k) obj, i3);
                return;
            case 15:
                kg.e0 e0Var = (kg.e0) obj;
                if (view instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (o4Var.F) {
                        ew ewVar = e0Var.V;
                        if (ewVar != null) {
                            ewVar.f45056a.Z4(o4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                ew ewVar2 = e0Var.V;
                if (ewVar2 != null) {
                    uw uwVar = ewVar2.f45056a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (uwVar.f50263m2) {
                        if (uwVar.v5(longValue2)) {
                            if (!uwVar.J2.isEmpty()) {
                                uwVar.b4(longValue2, uwVar.s3(longValue2, null));
                                uwVar.o5();
                                kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                                kVar.l(true);
                                return;
                            }
                            uwVar.a4(longValue2, 0L, true, null);
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
                    uwVar.V3();
                    if (org.telegram.messenger.g0.Q1() && uwVar.f50230f0 != null) {
                        int i17 = 0;
                        while (true) {
                            tw[] twVarArr = uwVar.f50230f0;
                            if (i17 < twVarArr.length) {
                                dv dvVar = twVarArr[i17].d;
                                uwVar.f50283q2.f24797a = longValue2;
                                dvVar.f17094s = longValue2;
                                i17++;
                            } else {
                                int i18 = hp.C8;
                                uwVar.u5(512, true);
                            }
                        }
                    }
                    if (uwVar.f50273o2 != null) {
                        if (uwVar.getMessagesController().E(bundle, uwVar, null, null)) {
                            uwVar.getNotificationCenter().k(4, new Object[0]);
                            uwVar.presentFragment(new wm(bundle));
                            return;
                        }
                        return;
                    } else if (uwVar.getMessagesController().E(bundle, uwVar, null, null)) {
                        uwVar.presentFragment(new wm(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 16:
                lg.h0 h0Var3 = (lg.h0) obj;
                lg.e0 e0Var2 = h0Var3.f18325y;
                bi biVar = h0Var3.f38416b;
                u4.h0 adapter = h0Var3.f18322s.getAdapter();
                lg.f0 f0Var = h0Var3.E;
                if (adapter == f0Var) {
                    ArrayList arrayList4 = f0Var.d;
                    int i19 = i3 - 1;
                    if (i19 >= 0 && i19 < arrayList4.size()) {
                        O = arrayList4.get(i19);
                    }
                } else {
                    int S = e0Var2.S(i3);
                    int Q2 = e0Var2.Q(i3);
                    if (Q2 >= 0 && S >= 0) {
                        O = e0Var2.O(S, Q2);
                    } else {
                        return;
                    }
                }
                if (O instanceof lg.t1) {
                    if (!h10.i(biVar.E3).q()) {
                        if (biVar.X1 != null) {
                            new vg.v0(biVar.X1, h0Var3.getContext(), biVar.E3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    lg.t1 t1Var2 = (lg.t1) O;
                    org.telegram.ui.Components.t4.Z(biVar.E3, t1Var2.a(), biVar.b1(), new o1(28, h0Var3, t1Var2));
                    return;
                }
                return;
            case 17:
                lg.j0 j0Var2 = (lg.j0) obj;
                r31 G5 = j0Var2.X1.G(i3 - 1);
                if (G5 != null) {
                    lg.b0 b0Var2 = j0Var2.S1;
                    if (!b0Var2.h(G5)) {
                        int i20 = G5.d;
                        int i21 = lg.j0.f18338d2;
                        if (i20 == -1) {
                            j0Var2.Y1 = true;
                            b0Var2.h = true;
                            j0Var2.X1.O(true);
                            j0Var2.d1(true);
                            return;
                        }
                        int i22 = lg.j0.f18339e2;
                        if (i20 == -2) {
                            j0Var2.Y1 = false;
                            b0Var2.h = false;
                            j0Var2.X1.O(true);
                            j0Var2.d1(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                li.a aVar2 = (li.a) obj;
                int i23 = aVar2.Q1.G(i3 - 1).d;
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
                qg.h hVar = (qg.h) obj;
                Runnable runnable = ((qg.a) hVar.F.get(i3)).f53910c;
                if (runnable != null) {
                    runnable.run();
                    hVar.c(false);
                    return;
                }
                return;
            case 20:
                lp0 lp0Var = (lp0) obj;
                tg.b0 b0Var3 = (tg.b0) tg.b0.c().get(i3);
                lp0Var.f55968e1.setTypeface(b0Var3.f55128a);
                tg.k0 e11 = tg.k0.e(lp0Var.f56002z1);
                String str3 = b0Var3.f55128a;
                e11.f55236j = str3;
                e11.f55229a.edit().putString("typeface", str3).apply();
                ug.j jVar2 = lp0Var.C0;
                if (jVar2 instanceof ug.l2) {
                    ((ug.l2) jVar2).setTypeface(b0Var3);
                }
                lp0Var.z0(false);
                return;
            case 21:
                ug.x0 x0Var = (ug.x0) obj;
                x0Var.f56301j3.accept(Integer.valueOf(x0Var.i3.b(i3)));
                tg.k0 k0Var = x0Var.i3;
                k0Var.f55231c.put(Integer.valueOf(k0Var.f55233f), Integer.valueOf(k0Var.b(i3)));
                k0Var.f55232e = true;
                return;
            case 22:
                vg.i0 i0Var = (vg.i0) obj;
                HashSet hashSet2 = i0Var.f56667r2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar.f29648r.a(hashSet2.contains(currentChannel), true);
                    i0Var.E1();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h4) {
                    if (i0Var.R1 || ((i10 = i0Var.f56651a2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                        Object object = h4Var.getObject();
                        if (h4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j13 = ((TLRPC.User) object).f27150id;
                                int i24 = -i0Var.N2;
                                i0Var.N2 = i24;
                                org.telegram.messenger.g0.G3(i24, h4Var, null);
                                org.telegram.messenger.p2.APP_ERROR.a();
                                if (j13 >= 0) {
                                    str = l10.k(hp.s1(i0Var.f28583a).a2(Long.valueOf(j13)));
                                }
                                if (hp.s1(i0Var.f28583a).D3()) {
                                    K = new fc((FrameLayout) i0Var.f28586b, i0Var.J0).Q(2131624216, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743770, str)));
                                } else {
                                    K = new fc((FrameLayout) i0Var.f28586b, i0Var.J0).K(2131624216, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743770, str)), bd.M0(2131743769, null), new vg.v(i0Var, 0));
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
                        i0Var.E1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 23:
                vg.r0 r0Var = (vg.r0) obj;
                if (view != null) {
                    r0Var.z1(view, true);
                    r0Var.f56729l3 = false;
                    r0Var.w0(0, view.getTop() - ((r0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    return;
                }
                return;
            case 24:
                ((s80) obj).h(view);
                return;
            default:
                ((zh.k) obj).h(view);
                return;
        }
    }
}
