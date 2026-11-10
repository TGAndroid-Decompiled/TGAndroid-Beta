package ai;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.dd;
import bi.ea;
import bi.mc;
import bi.oc;
import bi.p5;
import bi.pc;
import bi.q7;
import bi.tc;
import bi.uc;
import di.i7;
import di.k6;
import di.q9;
import fi.k2;
import fi.t1;
import fi.x9;
import fi.y1;
import fi.z1;
import hi.a3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kg.s1;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.jv;
import org.telegram.ui.kw;
import org.telegram.ui.sv;
import org.telegram.ui.xp0;
import org.telegram.ui.yw;
import org.telegram.ui.zw;
import zh.o3;
public final class k implements bj0 {
    public final int f1305a;
    public final Object f1306b;

    public k(Object obj, int i7) {
        this.f1305a = i7;
        this.f1306b = obj;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.Document document;
        q0 q0Var;
        x31 G;
        x31 G2;
        x31 G3;
        TLRPC.Document document2;
        long longValue;
        h5 h5Var;
        org.telegram.ui.ActionBar.l lVar;
        bc K;
        int i10;
        x31 G4;
        int i11 = this.f1305a;
        String str = "";
        TLRPC.BotInlineResult botInlineResult = null;
        r12 = null;
        Object O = null;
        TLRPC.Document document3 = null;
        boolean z9 = false;
        r14 = 0;
        int i12 = 0;
        Object obj = this.f1306b;
        switch (i11) {
            case 0:
                p0 p0Var = (p0) obj;
                if ((view instanceof q) && (document = ((q) view).f1602e) != null) {
                    long j3 = document.f26966id;
                    if (j3 != 0) {
                        s0 s0Var = p0Var.f1598a;
                        if (s0Var.d != null) {
                            if (!s0Var.getUserConfig().q() && ((q0Var = s0Var.h) == null || !q0Var.H.contains(Long.valueOf(j3)))) {
                                l1 l1Var = s0Var.d;
                                l1Var.getClass();
                                l1Var.d1(0, id.M0(2131746475, null), id.M0(2131746473, null));
                                l1Var.i0();
                                return;
                            }
                            l1 l1Var2 = s0Var.d;
                            int i13 = l1Var2.f1328b;
                            String o4 = a8.p0.o(j3, "c:");
                            HashMap hashMap = l1Var2.J;
                            if (!hashMap.containsKey(o4)) {
                                h5 l10 = h5.l(i13, 2, document);
                                l10.a(l1Var2);
                                hashMap.put(o4, l10);
                            }
                            if (o4 != null && !o4.startsWith("c:")) {
                                o4 = o4.replace("️", "");
                            }
                            ArrayList arrayList = l1Var2.I;
                            int indexOf = arrayList.indexOf(o4);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                            } else {
                                if (arrayList.size() >= 6) {
                                    arrayList.remove(0);
                                }
                                arrayList.add(o4);
                            }
                            l1Var2.c();
                            l1Var2.i0();
                            q0 q0Var2 = s0Var.h;
                            if (q0Var2 != null) {
                                ArrayList a10 = q0Var2.a();
                                a10.remove(Long.valueOf(j3));
                                a10.add(0, Long.valueOf(j3));
                                while (a10.size() > 21) {
                                    a8.p0.z(1, a10);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i14 = 0; i14 < a10.size(); i14++) {
                                    if (i14 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a10.get(i14));
                                }
                                qp.s1(q0Var2.f1671a).f24778e7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                q0Var2.J = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                dd.C0((dd) obj, i7);
                return;
            case 2:
                oc ocVar = (oc) obj;
                m41 m41Var = ocVar.W1;
                if (m41Var != null && (G = m41Var.G(i7 - 1)) != null) {
                    m41 m41Var2 = ocVar.W1;
                    if (G.d == -1) {
                        ocVar.X1 = !ocVar.X1;
                        m41Var2.O(true);
                        ocVar.n1.w0(0, org.telegram.messenger.g0.L(200.0f), wq.f40047g);
                        return;
                    } else if (G.H(pc.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(ocVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.G1;
                        }
                        if (W != null) {
                            long j10 = ocVar.U1.f27109id;
                            ea y10 = ea.y(ocVar.f28669a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
                            mc mcVar = new mc(ocVar, G, j10, 0);
                            int i15 = y10.f3804a;
                            if (qp.s1(i15).f24821j7) {
                                f2 Q = LaunchActivity.Q();
                                if (Q != null && Q.getContext() != null) {
                                    ea.c0(Q.getContext(), Q.getResourceProvider());
                                    return;
                                } else {
                                    ea.c0(W, null);
                                    return;
                                }
                            } else if (!r2.b() && r1.i().k()) {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift.user_id = qp.s1(i15).o1(j10);
                                ?? obj2 = new Object();
                                obj2.f11118b = "inapp";
                                obj2.f11117a = tL_starsGiftOption.store_product;
                                r1.i().o(Arrays.asList(obj2.a()), new q7(y10, mcVar, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                return;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.user_id = qp.s1(i15).o1(j10);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = a3.u(ea.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new bi.f2(y10, mcVar, tL_inputInvoiceStars, 4));
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                tc tcVar = (tc) obj;
                m41 m41Var3 = tcVar.Z1;
                if (m41Var3 != null && (G2 = m41Var3.G(i7 - 1)) != null) {
                    m41 m41Var4 = tcVar.Z1;
                    if (G2.d == -1) {
                        tcVar.f4769a2 = !tcVar.f4769a2;
                        m41Var4.O(true);
                        return;
                    } else if (G2.H(pc.class) && (G2.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(tcVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.G1;
                        }
                        if (W2 != null) {
                            ea.y(tcVar.f28669a, false).f(W2, (TL_stars.TL_starsTopupOption) G2.G, new p5(2, tcVar, G2), tcVar.X1);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                uc ucVar = (uc) obj;
                m41 m41Var5 = ucVar.T1;
                if (m41Var5 != null && (G3 = m41Var5.G(i7 - 1)) != null) {
                    m41 m41Var6 = ucVar.T1;
                    if (G3.d == -1) {
                        ucVar.U1 = !ucVar.U1;
                        m41Var6.O(true);
                        ucVar.n1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        return;
                    } else if (G3.H(pc.class) && (G3.G instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(ucVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.G1;
                        }
                        if (W3 != null) {
                            ea.y(ucVar.f28669a, false).f(W3, (TL_stars.TL_starsTopupOption) G3.G, new p5(3, ucVar, G3), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                ((sv) obj).i((di.p) view, false);
                return;
            case 6:
                ei.n nVar = (ei.n) obj;
                sp0 sp0Var = nVar.W;
                f2 f2Var = sp0Var.f10849a;
                if (view instanceof o7) {
                    ij messageObject = ((o7) view).getMessageObject();
                    if (sp0Var.G.E1) {
                        if (sp0Var.c(messageObject)) {
                            sp0Var.g(messageObject);
                            return;
                        } else {
                            sp0Var.e(messageObject);
                            return;
                        }
                    }
                    q9 orCreateStoryViewer = f2Var.getOrCreateStoryViewer();
                    Context context = nVar.getContext();
                    int e12 = messageObject.e1();
                    k6 k6Var = nVar.f10834a;
                    i7 a11 = i7.a(nVar.f10838f);
                    if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).f41810r1) {
                        i12 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a11.f9128s += i12;
                    orCreateStoryViewer.I(context, e12, k6Var, a11);
                    return;
                }
                return;
            case 7:
                c20 c20Var = ((fi.y) obj).f13109c;
                if (c20Var != null) {
                    c20Var.a((fi.t) fi.t.a().get(i7));
                    return;
                }
                return;
            case 8:
                t1 t1Var = (t1) obj;
                k2 k2Var = t1Var.f12845r;
                Object F = t1Var.f12841c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                } else {
                    return;
                }
                y10 y10Var = k2Var.f12265y1;
                if (y10Var != null) {
                    y10Var.k(botInlineResult, document2, Boolean.TRUE);
                }
                k2Var.dismiss();
                return;
            case 9:
                z1 z1Var = (z1) obj;
                k2 k2Var2 = z1Var.f13243s;
                y1 y1Var = z1Var.f13238c;
                if (i7 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f57056f != 4) {
                        ArrayList arrayList2 = y1Var.f13151s;
                        ArrayList arrayList3 = y1Var.f13152w;
                        if (i7 < arrayList2.size()) {
                            document3 = (TLRPC.Document) y1Var.f13151s.get(i7);
                        }
                        if (document3 == k2Var2.f12255o1) {
                            kg.g gVar = k2Var2.f12266z1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            k2Var2.dismiss();
                            return;
                        }
                        if (i7 >= arrayList3.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList3.get(i7)).longValue();
                        }
                        if (document3 == null && (view instanceof fi.l1) && (h5Var = ((fi.l1) view).d) != null) {
                            document3 = h5Var.f34171e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = h5.e(k2Var2.f28669a, longValue);
                        }
                        if (document3 != null) {
                            y10 y10Var2 = k2Var2.f12265y1;
                            if (y10Var2 != null) {
                                y10Var2.k(y1Var.f13148f.get(Long.valueOf(document3.f26966id)), document3, Boolean.FALSE);
                            }
                            k2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                x9 x9Var = (x9) obj;
                sg.b0 b0Var = (sg.b0) sg.b0.c().get(i7);
                x9Var.U0.setTypeface(b0Var.f55029a);
                sg.l0 e10 = sg.l0.e(x9Var.f12540o1);
                String str2 = b0Var.f55029a;
                e10.f55143j = str2;
                e10.f55136a.edit().putString("typeface", str2).apply();
                tg.j jVar = x9Var.f12547s0;
                if (jVar instanceof tg.k2) {
                    ((tg.k2) jVar).setTypeface(b0Var);
                }
                x9Var.M0(false);
                return;
            case 11:
                gi.f.A0((gi.f) obj, i7);
                return;
            case 12:
                m41 m41Var7 = ((gi.e) obj).X1;
                if (m41Var7 != null) {
                    m41Var7.G(i7 - 1);
                    return;
                }
                return;
            case 13:
                hi.j.D0((hi.j) obj, i7);
                return;
            case 14:
                jg.h0 h0Var = (jg.h0) obj;
                if (view instanceof o4) {
                    o4 o4Var = (o4) view;
                    if (o4Var.E) {
                        kw kwVar = h0Var.U;
                        if (kwVar != null) {
                            kwVar.f47439a.Z4(o4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                kw kwVar2 = h0Var.U;
                if (kwVar2 != null) {
                    zw zwVar = kwVar2.f47439a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (zwVar.f52617m2) {
                        if (zwVar.v5(longValue2)) {
                            if (!zwVar.J2.isEmpty()) {
                                zwVar.b4(longValue2, zwVar.s3(longValue2, null));
                                zwVar.o5();
                                lVar = ((f2) zwVar).actionBar;
                                lVar.n(true);
                                return;
                            }
                            zwVar.a4(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (m5.E(longValue2)) {
                        bundle.putLong("user_id", longValue2);
                    } else {
                        bundle.putLong("chat_id", -longValue2);
                    }
                    zwVar.V3();
                    if (org.telegram.messenger.g0.Q1() && zwVar.f52577e0 != null) {
                        int i16 = 0;
                        while (true) {
                            yw[] ywVarArr = zwVar.f52577e0;
                            if (i16 < ywVarArr.length) {
                                jv jvVar = ywVarArr[i16].d;
                                zwVar.f52636q2.f26524a = longValue2;
                                jvVar.f16856s = longValue2;
                                i16++;
                            } else {
                                int i17 = qp.C8;
                                zwVar.u5(512, true);
                            }
                        }
                    }
                    if (zwVar.f52627o2 != null) {
                        if (zwVar.getMessagesController().E(bundle, zwVar, null, null)) {
                            zwVar.getNotificationCenter().k(4, new Object[0]);
                            zwVar.presentFragment(new cn(bundle));
                            return;
                        }
                        return;
                    } else if (zwVar.getMessagesController().E(bundle, zwVar, null, null)) {
                        zwVar.presentFragment(new cn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                kg.g0 g0Var = (kg.g0) obj;
                kg.d0 d0Var = g0Var.f17389y;
                ci ciVar = g0Var.f38656b;
                v4.g0 adapter = g0Var.f17386s.getAdapter();
                kg.e0 e0Var = g0Var.D;
                if (adapter == e0Var) {
                    ArrayList arrayList4 = e0Var.d;
                    int i18 = i7 - 1;
                    if (i18 >= 0 && i18 < arrayList4.size()) {
                        O = arrayList4.get(i18);
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
                if (O instanceof s1) {
                    if (!p10.i(ciVar.G3).q()) {
                        if (ciVar.Z1 != null) {
                            new ug.w0(ciVar.Z1, g0Var.getContext(), ciVar.G3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    s1 s1Var = (s1) O;
                    u4.X(ciVar.G3, s1Var.a(), ciVar.b1(), new f1(24, g0Var, s1Var));
                    return;
                }
                return;
            case 16:
                kg.i0 i0Var = (kg.i0) obj;
                x31 G5 = i0Var.Z1.G(i7 - 1);
                if (G5 != null) {
                    kg.a0 a0Var = i0Var.U1;
                    if (!a0Var.h(G5)) {
                        int i19 = G5.d;
                        int i20 = kg.i0.f17400f2;
                        if (i19 == -1) {
                            i0Var.f17402a2 = true;
                            a0Var.h = true;
                            i0Var.Z1.O(true);
                            i0Var.d1(true);
                            return;
                        }
                        int i21 = kg.i0.f17401g2;
                        if (i19 == -2) {
                            i0Var.f17402a2 = false;
                            a0Var.h = false;
                            i0Var.Z1.O(true);
                            i0Var.d1(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ki.a aVar = (ki.a) obj;
                int i22 = aVar.S1.G(i7 - 1).d;
                if (i22 == 151) {
                    aVar.e1(false);
                    return;
                } else if (i22 == 150) {
                    aVar.e1(true);
                    return;
                } else {
                    return;
                }
            case 18:
                pg.j jVar2 = (pg.j) obj;
                Runnable runnable = ((pg.a) jVar2.E.get(i7)).f53611c;
                if (runnable != null) {
                    runnable.run();
                    jVar2.c(false);
                    return;
                }
                return;
            case 19:
                xp0 xp0Var = (xp0) obj;
                sg.b0 b0Var2 = (sg.b0) sg.b0.c().get(i7);
                xp0Var.f55680d1.setTypeface(b0Var2.f55029a);
                sg.l0 e11 = sg.l0.e(xp0Var.f55714y1);
                String str3 = b0Var2.f55029a;
                e11.f55143j = str3;
                e11.f55136a.edit().putString("typeface", str3).apply();
                tg.j jVar3 = xp0Var.B0;
                if (jVar3 instanceof tg.k2) {
                    ((tg.k2) jVar3).setTypeface(b0Var2);
                }
                xp0Var.z0(false);
                return;
            case 20:
                tg.y0 y0Var = (tg.y0) obj;
                y0Var.f56022i3.accept(Integer.valueOf(y0Var.f56021h3.b(i7)));
                sg.l0 l0Var = y0Var.f56021h3;
                l0Var.f55138c.put(Integer.valueOf(l0Var.f55140f), Integer.valueOf(l0Var.b(i7)));
                l0Var.f55139e = true;
                return;
            case 21:
                ug.i0 i0Var2 = (ug.i0) obj;
                HashSet hashSet = i0Var2.f56633t2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar2.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    nVar2.f29606r.a(hashSet.contains(currentChannel), true);
                    i0Var2.E1();
                    return;
                } else if (view instanceof h4) {
                    if (i0Var2.T1 || ((i10 = i0Var2.f56617c2) != 11 && i10 != 34)) {
                        h4 h4Var = (h4) view;
                        Object object = h4Var.getObject();
                        if (h4Var.O) {
                            if (object instanceof TLRPC.User) {
                                long j11 = ((TLRPC.User) object).f27109id;
                                int i23 = -i0Var2.P2;
                                i0Var2.P2 = i23;
                                org.telegram.messenger.g0.G3(i23, h4Var, null);
                                p2.APP_ERROR.a();
                                if (j11 >= 0) {
                                    str = t10.k(qp.s1(i0Var2.f28669a).a2(Long.valueOf(j11)));
                                }
                                if (qp.s1(i0Var2.f28669a).D3()) {
                                    K = new gc((FrameLayout) i0Var2.f28672b, i0Var2.I0).Q(2131624216, 36, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743760, str)));
                                } else {
                                    K = new gc((FrameLayout) i0Var2.f28672b, i0Var2.I0).K(2131624216, org.telegram.messenger.g0.X2(id.a0(null, null, 2131743760, str)), id.M0(2131743759, null), new ug.v(i0Var2, 0));
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
                        h4Var.c(hashSet.contains(object), true);
                        i0Var2.E1();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                ug.s0 s0Var2 = (ug.s0) obj;
                if (view != null) {
                    s0Var2.z1(view, true);
                    s0Var2.f56663k3 = false;
                    s0Var2.w0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    return;
                }
                return;
            case 23:
                ((w80) obj).h(view);
                return;
            case 24:
                ((yh.m) obj).h(view);
                return;
            default:
                o3 o3Var = (o3) obj;
                fi.d dVar = o3Var.X1;
                HashSet hashSet2 = o3Var.U1;
                m41 m41Var8 = o3Var.f60512b2;
                if (m41Var8 != null && (G4 = m41Var8.G(i7 - 1)) != null) {
                    Object obj3 = G4.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                        int i24 = savedStarGift.msg_id;
                        long j12 = i24 == 0 ? savedStarGift.saved_id : i24;
                        if (hashSet2.contains(Long.valueOf(j12))) {
                            hashSet2.remove(Long.valueOf(j12));
                            ((zh.y0) view).c(false, true);
                            G4.f40150e = false;
                        } else {
                            hashSet2.add(Long.valueOf(j12));
                            ((zh.y0) view).c(true, true);
                            G4.f40150e = true;
                        }
                        if (hashSet2.size() > 0) {
                            z9 = true;
                        }
                        dVar.setEnabled(z9);
                        dVar.c(hashSet2.size(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
