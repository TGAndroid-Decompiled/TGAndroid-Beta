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
import hi.pa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.s10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ax;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.jv;
import org.telegram.ui.lw;
import org.telegram.ui.sv;
import org.telegram.ui.vp0;
public final class n8 implements qj0 {
    public final int f3887a;
    public final Object f3888b;

    public n8(Object obj, int i7) {
        this.f3887a = i7;
        this.f3888b = obj;
    }

    @Override
    public final void b(int i7, View view) {
        n41 G;
        TLRPC.Document document;
        ci.h0 h0Var;
        n41 G2;
        n41 G3;
        n41 G4;
        TLRPC.Document document2;
        long longValue;
        org.telegram.ui.Components.o5 o5Var;
        org.telegram.ui.ActionBar.k kVar;
        fc K;
        int i10;
        int i11 = this.f3887a;
        String str = "";
        TLRPC.BotInlineResult botInlineResult = null;
        r13 = null;
        Object O = null;
        TLRPC.Document document3 = null;
        boolean z10 = false;
        r15 = 0;
        int i12 = 0;
        Object obj = this.f3888b;
        switch (i11) {
            case 0:
                q8 q8Var = (q8) obj;
                hi.e eVar = q8Var.Y1;
                HashSet hashSet = q8Var.V1;
                b51 b51Var = q8Var.f4009c2;
                if (b51Var != null && (G = b51Var.G(i7 - 1)) != null) {
                    Object obj2 = G.H;
                    if (obj2 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                        int i13 = savedStarGift.msg_id;
                        long j3 = i13 == 0 ? savedStarGift.saved_id : i13;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((i3) view).c(false, true);
                            G.f37648e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((i3) view).c(true, true);
                            G.f37648e = true;
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
                if ((view instanceof ci.l) && (document = ((ci.l) view).f5700e) != null) {
                    long j10 = document.f28498id;
                    if (j10 != 0) {
                        ci.j0 j0Var = g0Var.f5660a;
                        if (j0Var.d != null) {
                            if (!j0Var.getUserConfig().q() && ((h0Var = j0Var.h) == null || !h0Var.I.contains(Long.valueOf(j10)))) {
                                ci.z0 z0Var = j0Var.d;
                                z0Var.getClass();
                                z0Var.d1(0, gd.N0(2131746279, null), gd.N0(2131746277, null));
                                z0Var.i0();
                                return;
                            }
                            ci.z0 z0Var2 = j0Var.d;
                            int i14 = z0Var2.f5853b;
                            String o4 = a8.p0.o(j10, "c:");
                            HashMap hashMap = z0Var2.K;
                            if (!hashMap.containsKey(o4)) {
                                org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(i14, 2, document);
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
                                mp.u1(h0Var2.f5752a).h7.edit().putString("qrAppliedEmoji", sb2.toString()).apply();
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
                b51 b51Var2 = abVar.X1;
                if (b51Var2 != null && (G2 = b51Var2.G(i7 - 1)) != null) {
                    b51 b51Var3 = abVar.X1;
                    if (G2.d == -1) {
                        abVar.Y1 = !abVar.Y1;
                        b51Var3.O(true);
                        abVar.f39246o1.w0(0, org.telegram.messenger.g0.L(200.0f), kr.f36859g);
                        return;
                    } else if (G2.H(bb.class) && (G2.H instanceof TL_stars.TL_starsGiftOption)) {
                        Context W = org.telegram.messenger.g0.W(abVar.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null) {
                            long j11 = abVar.V1.f28641id;
                            di.y8 y10 = di.y8.y(abVar.f30223a, false);
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G2.H;
                            h8 h8Var = new h8(abVar, G2, j11, 1);
                            int i16 = y10.f10046a;
                            if (mp.u1(i16).f25802m7) {
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
                                tL_inputStorePaymentStarsGift.user_id = mp.u1(i16).q1(j11);
                                f5.a aVar = new f5.a();
                                aVar.f11239c = "inapp";
                                aVar.f11238b = tL_starsGiftOption.store_product;
                                org.telegram.messenger.r1.i().o(Arrays.asList(aVar.a()), new di.l6(y10, h8Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, W));
                                return;
                            } else {
                                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
                                tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
                                tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
                                tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
                                tL_inputStorePaymentStarsGift2.user_id = mp.u1(i16).q1(j11);
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u10 = ki.t2.u(di.y8.I(), false);
                                if (u10 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u10.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new q1(y10, h8Var, tL_inputInvoiceStars, 7));
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
                b51 b51Var4 = fbVar.f8834a2;
                if (b51Var4 != null && (G3 = b51Var4.G(i7 - 1)) != null) {
                    b51 b51Var5 = fbVar.f8834a2;
                    if (G3.d == -1) {
                        fbVar.f8835b2 = !fbVar.f8835b2;
                        b51Var5.O(true);
                        return;
                    } else if (G3.H(bb.class) && (G3.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W2 = org.telegram.messenger.g0.W(fbVar.getContext());
                        if (W2 == null) {
                            W2 = LaunchActivity.H1;
                        }
                        if (W2 != null) {
                            di.y8.y(fbVar.f30223a, false).f(W2, (TL_stars.TL_starsTopupOption) G3.H, new r6(5, fbVar, G3), fbVar.Y1);
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
                b51 b51Var6 = gbVar.U1;
                if (b51Var6 != null && (G4 = b51Var6.G(i7 - 1)) != null) {
                    b51 b51Var7 = gbVar.U1;
                    if (G4.d == -1) {
                        gbVar.V1 = !gbVar.V1;
                        b51Var7.O(true);
                        gbVar.f39246o1.w0(0, org.telegram.messenger.g0.L(300.0f), null);
                        return;
                    } else if (G4.H(bb.class) && (G4.H instanceof TL_stars.TL_starsTopupOption)) {
                        Activity W3 = org.telegram.messenger.g0.W(gbVar.getContext());
                        if (W3 == null) {
                            W3 = LaunchActivity.H1;
                        }
                        if (W3 != null) {
                            di.y8.y(gbVar.f30223a, false).f(W3, (TL_stars.TL_starsTopupOption) G4.H, new r6(6, gbVar, G4), null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                ((sv) obj).i((fi.p) view, false);
                return;
            case 7:
                gi.m mVar = (gi.m) obj;
                eq0 eq0Var = mVar.f13644a0;
                org.telegram.ui.ActionBar.g2 g2Var = eq0Var.f13659a;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    fj messageObject = ((org.telegram.ui.Cells.o7) view).getMessageObject();
                    if (eq0Var.H.F1) {
                        if (eq0Var.c(messageObject)) {
                            eq0Var.g(messageObject);
                            return;
                        } else {
                            eq0Var.e(messageObject);
                            return;
                        }
                    }
                    fi.f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
                    Context context = mVar.getContext();
                    int e12 = messageObject.e1();
                    fi.a6 a6Var = mVar.f13643a;
                    fi.y6 a11 = fi.y6.a(mVar.f13648f);
                    if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).f43763s1) {
                        i12 = org.telegram.messenger.g0.L(68.0f);
                    }
                    a11.f12794s += i12;
                    orCreateStoryViewer.I(context, e12, a6Var, a11);
                    return;
                }
                return;
            case 8:
                w10 w10Var = ((hi.h0) obj).f14569c;
                if (w10Var != null) {
                    w10Var.a((hi.c0) hi.c0.a().get(i7));
                    return;
                }
                return;
            case 9:
                hi.b2 b2Var = (hi.b2) obj;
                hi.r2 r2Var = b2Var.f14220r;
                Object F = b2Var.f14216c.F(i7);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                } else {
                    return;
                }
                s10 s10Var = r2Var.f15288z1;
                if (s10Var != null) {
                    s10Var.l(botInlineResult, document2, Boolean.TRUE);
                }
                r2Var.dismiss();
                return;
            case 10:
                hi.g2 g2Var2 = (hi.g2) obj;
                hi.r2 r2Var2 = g2Var2.f14526s;
                hi.f2 f2Var = g2Var2.f14521c;
                if (i7 >= 0) {
                    g2Var2.d.getClass();
                    if (RecyclerView.U(view).f59249f != 4) {
                        ArrayList arrayList2 = f2Var.f14425s;
                        ArrayList arrayList3 = f2Var.f14426w;
                        if (i7 < arrayList2.size()) {
                            document3 = (TLRPC.Document) f2Var.f14425s.get(i7);
                        }
                        if (document3 == r2Var2.f15278p1) {
                            kg.g gVar = r2Var2.A1;
                            if (gVar != null) {
                                gVar.run();
                            }
                            r2Var2.dismiss();
                            return;
                        }
                        if (i7 >= arrayList3.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList3.get(i7)).longValue();
                        }
                        if (document3 == null && (view instanceof hi.v1) && (o5Var = ((hi.v1) view).d) != null) {
                            document3 = o5Var.f38023e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = org.telegram.ui.Components.o5.e(r2Var2.f30223a, longValue);
                        }
                        if (document3 != null) {
                            s10 s10Var2 = r2Var2.f15288z1;
                            if (s10Var2 != null) {
                                s10Var2.l(f2Var.f14422f.get(Long.valueOf(document3.f28498id)), document3, Boolean.FALSE);
                            }
                            r2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                pa paVar = (pa) obj;
                sg.a0 a0Var = (sg.a0) sg.a0.c().get(i7);
                paVar.V0.setTypeface(a0Var.f57278a);
                sg.j0 e10 = sg.j0.e(paVar.f15583p1);
                String str2 = a0Var.f57278a;
                e10.f57383j = str2;
                e10.f57376a.edit().putString("typeface", str2).apply();
                tg.n nVar = paVar.f15590t0;
                if (nVar instanceof tg.q2) {
                    ((tg.q2) nVar).setTypeface(a0Var);
                }
                paVar.P0(false);
                return;
            case 12:
                ii.t.A0((ii.t) obj, i7);
                return;
            case 13:
                b51 b51Var8 = ((ii.s) obj).Y1;
                if (b51Var8 != null) {
                    b51Var8.G(i7 - 1);
                    return;
                }
                return;
            case 14:
                jg.h0 h0Var3 = (jg.h0) obj;
                if (view instanceof org.telegram.ui.Cells.p4) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (p4Var.F) {
                        lw lwVar = h0Var3.V;
                        if (lwVar != null) {
                            lwVar.f49849a.h5(p4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                lw lwVar2 = h0Var3.V;
                if (lwVar2 != null) {
                    bx bxVar = lwVar2.f49849a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (bxVar.f46588n2) {
                        if (bxVar.E5(longValue2)) {
                            if (!bxVar.K2.isEmpty()) {
                                bxVar.b4(longValue2, bxVar.s3(longValue2, null));
                                bxVar.w5();
                                kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                                kVar.n(true);
                                return;
                            }
                            bxVar.a4(longValue2, 0L, true, null);
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
                    bxVar.V3();
                    if (org.telegram.messenger.g0.Q1() && bxVar.f46549f0 != null) {
                        int i17 = 0;
                        while (true) {
                            ax[] axVarArr = bxVar.f46549f0;
                            if (i17 < axVarArr.length) {
                                jv jvVar = axVarArr[i17].d;
                                bxVar.f46608r2.f26946a = longValue2;
                                jvVar.f17676s = longValue2;
                                i17++;
                            } else {
                                int i18 = mp.I8;
                                bxVar.D5(512, true);
                            }
                        }
                    }
                    if (bxVar.f46597p2 != null) {
                        if (bxVar.getMessagesController().E(bundle, bxVar, null, null)) {
                            bxVar.getNotificationCenter().k(4, new Object[0]);
                            bxVar.presentFragment(new bn(bundle));
                            return;
                        }
                        return;
                    } else if (bxVar.getMessagesController().E(bundle, bxVar, null, null)) {
                        bxVar.presentFragment(new bn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                kg.h0 h0Var4 = (kg.h0) obj;
                kg.e0 e0Var = h0Var4.f18425y;
                ti tiVar = h0Var4.f37135b;
                v4.i0 adapter = h0Var4.f18422s.getAdapter();
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
                if (O instanceof kg.v1) {
                    if (!i10.i(tiVar.H3).q()) {
                        if (tiVar.f39956a2 != null) {
                            new ug.y0(tiVar.f39956a2, h0Var4.getContext(), tiVar.H3, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    kg.v1 v1Var = (kg.v1) O;
                    org.telegram.ui.Components.b5.X(tiVar.H3, v1Var.a(), tiVar.c1(), new ai.s1(25, h0Var4, v1Var));
                    return;
                }
                return;
            case 16:
                kg.k0 k0Var = (kg.k0) obj;
                n41 G5 = k0Var.f18460a2.G(i7 - 1);
                if (G5 != null) {
                    kg.b0 b0Var = k0Var.V1;
                    if (!b0Var.h(G5)) {
                        int i20 = G5.d;
                        int i21 = kg.k0.f18458g2;
                        if (i20 == -1) {
                            k0Var.f18461b2 = true;
                            b0Var.h = true;
                            k0Var.f18460a2.O(true);
                            k0Var.e1(true);
                            return;
                        }
                        int i22 = kg.k0.f18459h2;
                        if (i20 == -2) {
                            k0Var.f18461b2 = false;
                            b0Var.h = false;
                            k0Var.f18460a2.O(true);
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
                Runnable runnable = ((pg.a) iVar.F.get(i7)).f55718c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 20:
                vp0 vp0Var = (vp0) obj;
                sg.a0 a0Var2 = (sg.a0) sg.a0.c().get(i7);
                vp0Var.f58028e1.setTypeface(a0Var2.f57278a);
                sg.j0 e11 = sg.j0.e(vp0Var.f58062z1);
                String str3 = a0Var2.f57278a;
                e11.f57383j = str3;
                e11.f57376a.edit().putString("typeface", str3).apply();
                tg.n nVar2 = vp0Var.C0;
                if (nVar2 instanceof tg.q2) {
                    ((tg.q2) nVar2).setTypeface(a0Var2);
                }
                vp0Var.C0(false);
                return;
            case 21:
                tg.d1 d1Var = (tg.d1) obj;
                d1Var.j3.accept(Integer.valueOf(d1Var.f57873i3.b(i7)));
                sg.j0 j0Var2 = d1Var.f57873i3;
                j0Var2.f57378c.put(Integer.valueOf(j0Var2.f57380f), Integer.valueOf(j0Var2.b(i7)));
                j0Var2.f57379e = true;
                return;
            case 22:
                ug.k0 k0Var2 = (ug.k0) obj;
                HashSet hashSet2 = k0Var2.f58867u2;
                if (view instanceof org.telegram.ui.Cells.n) {
                    org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) view;
                    TLRPC.Chat currentChannel = nVar3.getCurrentChannel();
                    if (hashSet2.contains(currentChannel)) {
                        hashSet2.remove(currentChannel);
                    } else {
                        hashSet2.add(currentChannel);
                    }
                    nVar3.f31194r.a(hashSet2.contains(currentChannel), true);
                    k0Var2.F1();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i4) {
                    if (k0Var2.U1 || ((i10 = k0Var2.d2) != 11 && i10 != 34)) {
                        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                        Object object = i4Var.getObject();
                        if (i4Var.P) {
                            if (object instanceof TLRPC.User) {
                                long j12 = ((TLRPC.User) object).f28641id;
                                int i24 = -k0Var2.Q2;
                                k0Var2.Q2 = i24;
                                org.telegram.messenger.g0.E3(i24, i4Var, null);
                                org.telegram.messenger.q2.APP_ERROR.a();
                                if (j12 >= 0) {
                                    str = n10.l(mp.u1(k0Var2.f30223a).c2(Long.valueOf(j12)));
                                }
                                if (mp.u1(k0Var2.f30223a).K3()) {
                                    K = new kc((FrameLayout) k0Var2.f30226b, k0Var2.J0).Q(2131624217, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743513, str)));
                                } else {
                                    K = new kc((FrameLayout) k0Var2.f30226b, k0Var2.J0).K(2131624217, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743513, str)), gd.N0(2131743512, null), new ug.v(k0Var2, 0));
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
                        k0Var2.F1();
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
                    u0Var.f58907l3 = false;
                    u0Var.w0(0, view.getTop() - ((u0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    return;
                }
                return;
            case 24:
                ((i90) obj).h(view);
                return;
            default:
                ((zh.l) obj).h(view);
                return;
        }
    }
}
