package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.dd;
import bi.nc;
import bi.tc;
import bi.uc;
import di.q7;
import di.s6;
import di.y9;
import fi.l2;
import fi.ta;
import fi.y1;
import fi.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jg.b2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.gw;
import org.telegram.ui.lx;
import org.telegram.ui.nt0;
import org.telegram.ui.qw;
import org.telegram.ui.un;
import sg.x2;
import zh.l4;
public final class k implements zl0 {
    public final int f1559a;
    public final Object f1560b;

    public k(Object obj, int i10) {
        this.f1559a = i10;
        this.f1560b = obj;
    }

    @Override
    public final void c(int i10, View view) {
        TLRPC.Document document;
        x0 x0Var;
        int i11;
        TLRPC.Document document2;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document3;
        long longValue;
        t5 t5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        t61 G;
        switch (this.f1559a) {
            case 0:
                w0 w0Var = (w0) this.f1560b;
                if ((view instanceof q) && (document = ((q) view).e) != null) {
                    long j10 = document.f22033id;
                    if (j10 != 0) {
                        z0 z0Var = w0Var.f1963a;
                        if (z0Var.d != null) {
                            if (!z0Var.getUserConfig().isPremium() && ((x0Var = z0Var.h) == null || !x0Var.H.contains(Long.valueOf(j10)))) {
                                t1 t1Var = z0Var.d;
                                t1Var.getClass();
                                t1Var.d1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                t1Var.i0();
                                return;
                            }
                            t1 t1Var2 = z0Var.d;
                            int i12 = t1Var2.f1690b;
                            String o10 = a1.g.o(j10, "c:");
                            HashMap hashMap = t1Var2.J;
                            if (!hashMap.containsKey(o10)) {
                                t5 m10 = t5.m(i12, 2, document);
                                m10.a(t1Var2);
                                hashMap.put(o10, m10);
                            }
                            if (o10 != null && !o10.startsWith("c:")) {
                                o10 = o10.replace("️", "");
                            }
                            ArrayList arrayList = t1Var2.I;
                            int indexOf = arrayList.indexOf(o10);
                            if (indexOf >= 0) {
                                arrayList.remove(indexOf);
                            } else {
                                if (arrayList.size() >= 6) {
                                    arrayList.remove(0);
                                }
                                arrayList.add(o10);
                            }
                            t1Var2.c();
                            t1Var2.i0();
                            x0 x0Var2 = z0Var.h;
                            if (x0Var2 != null) {
                                ArrayList a2 = x0Var2.a();
                                a2.remove(Long.valueOf(j10));
                                a2.add(0, Long.valueOf(j10));
                                while (a2.size() > 21) {
                                    a1.g.A(1, a2);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i13 = 0; i13 < a2.size(); i13++) {
                                    if (i13 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a2.get(i13));
                                }
                                MessagesController.getMainSettings(x0Var2.f1970a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                x0Var2.J = true;
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
                dd.y0((dd) this.f1560b, i10);
                return;
            case 2:
                nc.P((nc) this.f1560b, i10);
                return;
            case 3:
                tc.P((tc) this.f1560b, i10);
                return;
            case 4:
                uc.P((uc) this.f1560b, i10);
                return;
            case 5:
                ((qw) this.f1560b).i((di.q) view, false);
                return;
            case 6:
                ei.r rVar = (ei.r) this.f1560b;
                us0 us0Var = rVar.W;
                r2 r2Var = us0Var.f10015a;
                if (view instanceof w7) {
                    MessageObject messageObject = ((w7) view).getMessageObject();
                    if (us0Var.G.E1) {
                        if (us0Var.c(messageObject)) {
                            us0Var.g(messageObject);
                            return;
                        } else {
                            us0Var.e(messageObject);
                            return;
                        }
                    }
                    y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    s6 s6Var = rVar.f10001a;
                    q7 a10 = q7.a(rVar.f10004f);
                    if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).f36073s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a10.f9066s += i11;
                    orCreateStoryViewer.C(context, id2, s6Var, a10);
                    return;
                }
                return;
            case 7:
                Utilities.Callback callback = ((fi.y) this.f1560b).f11979c;
                if (callback != null) {
                    callback.run((fi.t) fi.t.a().get(i10));
                    return;
                }
                return;
            case 8:
                fi.u1 u1Var = (fi.u1) this.f1560b;
                l2 l2Var = u1Var.f11746r;
                Object F = u1Var.f11743c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document2 = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document2 = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = l2Var.E;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document2, Boolean.TRUE);
                }
                l2Var.dismiss();
                return;
            case 9:
                z1 z1Var = (z1) this.f1560b;
                l2 l2Var2 = z1Var.f12055s;
                y1 y1Var = z1Var.f12051c;
                if (i10 >= 0) {
                    z1Var.d.getClass();
                    if (RecyclerView.U(view).f47738f != 4) {
                        ArrayList arrayList2 = y1Var.f11988s;
                        ArrayList arrayList3 = y1Var.v;
                        if (i10 >= arrayList2.size()) {
                            document3 = null;
                        } else {
                            document3 = (TLRPC.Document) y1Var.f11988s.get(i10);
                        }
                        if (document3 == l2Var2.e) {
                            jg.g gVar = l2Var2.F;
                            if (gVar != null) {
                                gVar.run();
                            }
                            l2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList3.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList3.get(i10)).longValue();
                        }
                        if (document3 == null && (view instanceof fi.m1) && (t5Var = ((fi.m1) view).d) != null) {
                            document3 = t5Var.e;
                        }
                        if (document3 == null && longValue != 0) {
                            document3 = t5.f(l2.Z(l2Var2), longValue);
                        }
                        if (document3 != null) {
                            Utilities.Callback3Return callback3Return2 = l2Var2.E;
                            if (callback3Return2 != null) {
                                callback3Return2.run(y1Var.f11985f.get(Long.valueOf(document3.f22033id)), document3, Boolean.FALSE);
                            }
                            l2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ta taVar = (ta) this.f1560b;
                rg.j0 j0Var = (rg.j0) rg.j0.c().get(i10);
                taVar.f10779a1.setTypeface(j0Var.f47437a);
                rg.s0 e = rg.s0.e(taVar.f10817u1);
                String str = j0Var.f47437a;
                e.f47546j = str;
                e.f47540a.edit().putString("typeface", str).apply();
                sg.j jVar = taVar.f10824y0;
                if (jVar instanceof x2) {
                    ((x2) jVar).setTypeface(j0Var);
                }
                taVar.M0(false);
                return;
            case 11:
                gi.h.w0((gi.h) this.f1560b, i10);
                return;
            case 12:
                j71 j71Var = ((gi.g) this.f1560b).f12502c0;
                if (j71Var != null) {
                    j71Var.G(i10 - 1);
                    return;
                }
                return;
            case 13:
                hi.k.z0((hi.k) this.f1560b, i10);
                return;
            case 14:
                ig.i0 i0Var = (ig.i0) this.f1560b;
                if (view instanceof r4) {
                    r4 r4Var = (r4) view;
                    if (r4Var.E) {
                        lx lxVar = i0Var.U;
                        if (lxVar != null) {
                            lxVar.f41384a.V4(r4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                lx lxVar2 = i0Var.U;
                if (lxVar2 != null) {
                    cy cyVar = lxVar2.f41384a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (cyVar.f38620l2) {
                        if (cyVar.r5(longValue2)) {
                            if (!cyVar.I2.isEmpty()) {
                                cyVar.X3(longValue2, cyVar.p3(longValue2, null));
                                cyVar.k5();
                                kVar = ((r2) cyVar).actionBar;
                                kVar.g(true);
                                return;
                            }
                            cyVar.W3(longValue2, 0L, true, null);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (DialogObject.isUserDialog(longValue2)) {
                        bundle.putLong("user_id", longValue2);
                    } else {
                        bundle.putLong("chat_id", -longValue2);
                    }
                    cyVar.R3();
                    if (AndroidUtilities.isTablet() && cyVar.f38583e0 != null) {
                        int i14 = 0;
                        while (true) {
                            ay[] ayVarArr = cyVar.f38583e0;
                            if (i14 < ayVarArr.length) {
                                gw gwVar = ayVarArr[i14].d;
                                cyVar.f38639p2.dialogId = longValue2;
                                gwVar.f14174s = longValue2;
                                i14++;
                            } else {
                                cyVar.q5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (cyVar.f38629n2 != null) {
                        if (cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                            cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            cyVar.presentFragment(new un(bundle));
                            return;
                        }
                        return;
                    } else if (cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                        cyVar.presentFragment(new un(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 15:
                jg.i0 i0Var2 = (jg.i0) this.f1560b;
                jg.f0 f0Var = i0Var2.f15731x;
                ti tiVar = i0Var2.f30213b;
                s4.h0 adapter = i0Var2.f15729s.getAdapter();
                jg.g0 g0Var = i0Var2.f15732y;
                if (adapter == g0Var) {
                    ArrayList arrayList4 = g0Var.d;
                    int i15 = i10 - 1;
                    if (i15 >= 0 && i15 < arrayList4.size()) {
                        O = arrayList4.get(i15);
                    } else {
                        O = null;
                    }
                } else {
                    int S = f0Var.S(i10);
                    int Q = f0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = f0Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof b2) {
                    if (!UserConfig.getInstance(tiVar.M1).isPremium()) {
                        if (tiVar.f33018f0 != null) {
                            new tg.y0(tiVar.f33018f0, i0Var2.getContext(), tiVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    b2 b2Var = (b2) O;
                    g5.Z(tiVar.M1, b2Var.a(), tiVar.s1(), new n1(25, i0Var2, b2Var));
                    return;
                }
                return;
            case 16:
                jg.k0 k0Var = (jg.k0) this.f1560b;
                t61 G2 = k0Var.f15754e0.G(i10 - 1);
                if (G2 != null) {
                    jg.b0 b0Var = k0Var.Z;
                    if (!b0Var.h(G2)) {
                        int i16 = G2.d;
                        int i17 = jg.k0.f15748k0;
                        if (i16 == -1) {
                            k0Var.f15755f0 = true;
                            b0Var.h = true;
                            k0Var.f15754e0.O(true);
                            k0Var.T(true);
                            return;
                        }
                        int i18 = jg.k0.f15749l0;
                        if (i16 == -2) {
                            k0Var.f15755f0 = false;
                            b0Var.h = false;
                            k0Var.f15754e0.O(true);
                            k0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ki.a aVar = (ki.a) this.f1560b;
                int i19 = aVar.X.G(i10 - 1).d;
                if (i19 == 151) {
                    aVar.Q(false);
                    return;
                } else if (i19 == 150) {
                    aVar.Q(true);
                    return;
                } else {
                    return;
                }
            case 18:
                og.i iVar = (og.i) this.f1560b;
                Runnable runnable = ((og.a) iVar.E.get(i10)).f19389c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 19:
                nt0 nt0Var = (nt0) this.f1560b;
                rg.j0 j0Var2 = (rg.j0) rg.j0.c().get(i10);
                nt0Var.f48340j1.setTypeface(j0Var2.f47437a);
                rg.s0 e10 = rg.s0.e(nt0Var.E1);
                String str2 = j0Var2.f47437a;
                e10.f47546j = str2;
                e10.f47540a.edit().putString("typeface", str2).apply();
                sg.j jVar2 = nt0Var.H0;
                if (jVar2 instanceof x2) {
                    ((x2) jVar2).setTypeface(j0Var2);
                }
                nt0Var.y0(false);
                return;
            case 20:
                sg.k1 k1Var = (sg.k1) this.f1560b;
                k1Var.f48283j3.accept(Integer.valueOf(k1Var.f48282i3.b(i10)));
                rg.s0 s0Var = k1Var.f48282i3;
                s0Var.f47542c.put(Integer.valueOf(s0Var.f47543f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                return;
            case 21:
                tg.j0.W((tg.j0) this.f1560b, view);
                return;
            case 22:
                tg.s0 s0Var2 = (tg.s0) this.f1560b;
                if (view != null) {
                    s0Var2.C1(view, true);
                    s0Var2.f49003l3 = false;
                    s0Var2.w0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 23:
                ((ua0) this.f1560b).h(view);
                return;
            case 24:
                ((yh.k) this.f1560b).h(view);
                return;
            default:
                l4 l4Var = (l4) this.f1560b;
                fi.d dVar = l4Var.f53101c0;
                HashSet hashSet = l4Var.Z;
                j71 j71Var2 = l4Var.f53105g0;
                if (j71Var2 != null && (G = j71Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i20 = savedStarGift.msg_id;
                        long j11 = i20 == 0 ? savedStarGift.saved_id : i20;
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j11))) {
                            hashSet.remove(Long.valueOf(j11));
                            ((zh.g1) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j11));
                            ((zh.g1) view).c(true, true);
                            G.e = true;
                        }
                        if (hashSet.size() > 0) {
                            z10 = true;
                        }
                        dVar.setEnabled(z10);
                        dVar.b(hashSet.size(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
