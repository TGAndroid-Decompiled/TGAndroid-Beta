package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.cy;
import org.telegram.ui.gt0;
import org.telegram.ui.jw;
import org.telegram.ui.nx;
import org.telegram.ui.qn;
import org.telegram.ui.tw;
public final class wa implements xl0 {
    public final int f2386a;
    public final Object f2387b;

    public wa(Object obj, int i10) {
        this.f2386a = i10;
        this.f2387b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        h61 G;
        TLRPC.Document document3;
        zh.k0 k0Var;
        switch (this.f2386a) {
            case 0:
                md.y0((md) this.f2387b, i10);
                return;
            case 1:
                vc.Q((vc) this.f2387b, i10);
                return;
            case 2:
                cd.Q((cd) this.f2387b, i10);
                return;
            case 3:
                dd.Q((dd) this.f2387b, i10);
                return;
            case 4:
                ((tw) this.f2387b).i((ci.q) view, false);
                return;
            case 5:
                di.r rVar = (di.r) this.f2387b;
                js0 js0Var = rVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = js0Var.f8068a;
                if (view instanceof org.telegram.ui.Cells.s7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                    if (js0Var.G.C1) {
                        if (js0Var.c(messageObject)) {
                            js0Var.g(messageObject);
                            return;
                        } else {
                            js0Var.e(messageObject);
                            return;
                        }
                    }
                    ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    ci.t6 t6Var = rVar.f8054a;
                    ci.r7 a2 = ci.r7.a(rVar.f8057f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33720t1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f5927s += i11;
                    orCreateStoryViewer.C(context, id2, t6Var, a2);
                    return;
                }
                return;
            case 6:
                Utilities.Callback callback = ((ei.y) this.f2387b).f10121c;
                if (callback != null) {
                    callback.run((ei.t) ei.t.a().get(i10));
                    return;
                }
                return;
            case 7:
                ei.v1 v1Var = (ei.v1) this.f2387b;
                ei.n2 n2Var2 = v1Var.f9931r;
                Object F = v1Var.f9928c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = n2Var2.f9507y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var2.dismiss();
                return;
            case 8:
                ei.b2 b2Var = (ei.b2) this.f2387b;
                ei.n2 n2Var3 = b2Var.f8774s;
                ei.a2 a2Var = b2Var.f8770c;
                if (i10 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f45924f != 4) {
                        ArrayList arrayList = a2Var.f8681s;
                        ArrayList arrayList2 = a2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) a2Var.f8681s.get(i10);
                        }
                        if (document2 == n2Var3.e) {
                            ig.g gVar = n2Var3.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            n2Var3.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ei.n1) && (r5Var = ((ei.n1) view).f9494c) != null) {
                            document2 = r5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) n2Var3).currentAccount;
                            document2 = org.telegram.ui.Components.r5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = n2Var3.f9507y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(a2Var.f8678f.get(Long.valueOf(document2.f20286id)), document2, Boolean.FALSE);
                            }
                            n2Var3.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ei.xa xaVar = (ei.xa) this.f2387b;
                qg.m0 m0Var = (qg.m0) qg.m0.c().get(i10);
                xaVar.l1.setTypeface(m0Var.f44569a);
                qg.v0 e = qg.v0.e(xaVar.F1);
                String str = m0Var.f44569a;
                e.f44687j = str;
                e.f44681a.edit().putString("typeface", str).apply();
                rg.j jVar = xaVar.J0;
                if (jVar instanceof rg.v2) {
                    ((rg.v2) jVar).setTypeface(m0Var);
                }
                xaVar.O0(false);
                return;
            case 10:
                fi.g.y0((fi.g) this.f2387b, i10);
                return;
            case 11:
                u61 u61Var = ((fi.f) this.f2387b).f10608b0;
                if (u61Var != null) {
                    u61Var.G(i10 - 1);
                    return;
                }
                return;
            case 12:
                gi.l.B0((gi.l) this.f2387b, i10);
                return;
            case 13:
                hg.h0 h0Var = (hg.h0) this.f2387b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        nx nxVar = h0Var.U;
                        if (nxVar != null) {
                            nxVar.f39705a.L4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                nx nxVar2 = h0Var.U;
                if (nxVar2 != null) {
                    cy cyVar = nxVar2.f39705a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (cyVar.f36133l2) {
                        if (cyVar.f5(longValue2)) {
                            if (!cyVar.I2.isEmpty()) {
                                cyVar.N3(longValue2, cyVar.f3(longValue2, null));
                                cyVar.Y4();
                                kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            cyVar.M3(longValue2, 0L, true, null);
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
                    cyVar.H3();
                    if (AndroidUtilities.isTablet() && cyVar.f36096e0 != null) {
                        int i13 = 0;
                        while (true) {
                            ay[] ayVarArr = cyVar.f36096e0;
                            if (i13 < ayVarArr.length) {
                                jw jwVar = ayVarArr[i13].d;
                                cyVar.f36152p2.dialogId = longValue2;
                                jwVar.f11973s = longValue2;
                                i13++;
                            } else {
                                cyVar.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (cyVar.f36142n2 != null) {
                        if (cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                            cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            cyVar.presentFragment(new qn(bundle));
                            return;
                        }
                        return;
                    } else if (cyVar.getMessagesController().checkCanOpenChat(bundle, cyVar)) {
                        cyVar.presentFragment(new qn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                ig.i0 i0Var = (ig.i0) this.f2387b;
                ig.f0 f0Var = i0Var.f12919x;
                ti tiVar = i0Var.f28177b;
                s4.g0 adapter = i0Var.f12917s.getAdapter();
                ig.g0 g0Var = i0Var.f12920y;
                if (adapter == g0Var) {
                    ArrayList arrayList3 = g0Var.d;
                    int i14 = i10 - 1;
                    if (i14 >= 0 && i14 < arrayList3.size()) {
                        O = arrayList3.get(i14);
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
                if (O instanceof ig.z1) {
                    if (!UserConfig.getInstance(tiVar.M1).isPremium()) {
                        if (tiVar.f30550f0 != null) {
                            new sg.y0(tiVar.f30550f0, i0Var.getContext(), tiVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    ig.z1 z1Var = (ig.z1) O;
                    org.telegram.ui.Components.f5.Z(tiVar.M1, z1Var.a(), tiVar.p1(), new o2(23, i0Var, z1Var));
                    return;
                }
                return;
            case 15:
                ig.k0 k0Var2 = (ig.k0) this.f2387b;
                h61 G2 = k0Var2.f12946d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var2.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = ig.k0.f12941g0;
                        if (i15 == -1) {
                            k0Var2.f12947e0 = true;
                            a0Var.h = true;
                            k0Var2.f12946d0.N(true);
                            k0Var2.U(true);
                            return;
                        }
                        int i17 = ig.k0.f12942h0;
                        if (i15 == -2) {
                            k0Var2.f12947e0 = false;
                            a0Var.h = false;
                            k0Var2.f12946d0.N(true);
                            k0Var2.U(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ji.a aVar = (ji.a) this.f2387b;
                int i18 = aVar.X.G(i10 - 1).d;
                if (i18 == 151) {
                    aVar.R(false);
                    return;
                } else if (i18 == 150) {
                    aVar.R(true);
                    return;
                } else {
                    return;
                }
            case 17:
                ng.i iVar = (ng.i) this.f2387b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).f17445c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 18:
                gt0 gt0Var = (gt0) this.f2387b;
                qg.m0 m0Var2 = (qg.m0) qg.m0.c().get(i10);
                gt0Var.f45509u1.setTypeface(m0Var2.f44569a);
                qg.v0 e7 = qg.v0.e(gt0Var.P1);
                String str2 = m0Var2.f44569a;
                e7.f44687j = str2;
                e7.f44681a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = gt0Var.S0;
                if (jVar2 instanceof rg.v2) {
                    ((rg.v2) jVar2).setTypeface(m0Var2);
                }
                gt0Var.A0(false);
                return;
            case 19:
                rg.i1 i1Var = (rg.i1) this.f2387b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                qg.v0 v0Var = i1Var.Y2;
                v0Var.f44683c.put(Integer.valueOf(v0Var.f44684f), Integer.valueOf(v0Var.b(i10)));
                v0Var.e = true;
                return;
            case 20:
                sg.k0.X((sg.k0) this.f2387b, view);
                return;
            case 21:
                sg.t0 t0Var = (sg.t0) this.f2387b;
                if (view != null) {
                    t0Var.x1(view, true);
                    t0Var.f46398b3 = false;
                    t0Var.v0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 22:
                ((xa0) this.f2387b).h(view);
                return;
            case 23:
                ((xh.k) this.f2387b).h(view);
                return;
            case 24:
                yh.k4 k4Var = (yh.k4) this.f2387b;
                ei.d dVar = k4Var.f50353c0;
                HashSet hashSet = k4Var.Z;
                u61 u61Var2 = k4Var.f50355e0;
                if (u61Var2 != null && (G = u61Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i19 = savedStarGift.msg_id;
                        long j10 = i19 == 0 ? savedStarGift.saved_id : i19;
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((yh.g1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((yh.g1) view).b(true, true);
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
            default:
                zh.j0 j0Var = (zh.j0) this.f2387b;
                if ((view instanceof zh.l) && (document3 = ((zh.l) view).e) != null) {
                    long j11 = document3.f20286id;
                    if (j11 != 0) {
                        zh.n0 n0Var = j0Var.f52027a;
                        if (n0Var.d != null) {
                            if (!n0Var.getUserConfig().isPremium() && ((k0Var = n0Var.h) == null || !k0Var.H.contains(Long.valueOf(j11)))) {
                                zh.c1 c1Var = n0Var.d;
                                c1Var.getClass();
                                c1Var.d1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                c1Var.i0();
                                return;
                            }
                            zh.c1 c1Var2 = n0Var.d;
                            int i20 = c1Var2.f51718b;
                            String o10 = a1.g.o(j11, "c:");
                            HashMap hashMap = c1Var2.J;
                            if (!hashMap.containsKey(o10)) {
                                org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(i20, 2, document3);
                                m10.a(c1Var2);
                                hashMap.put(o10, m10);
                            }
                            if (o10 != null && !o10.startsWith("c:")) {
                                o10 = o10.replace("️", "");
                            }
                            ArrayList arrayList4 = c1Var2.I;
                            int indexOf = arrayList4.indexOf(o10);
                            if (indexOf >= 0) {
                                arrayList4.remove(indexOf);
                            } else {
                                if (arrayList4.size() >= 6) {
                                    arrayList4.remove(0);
                                }
                                arrayList4.add(o10);
                            }
                            c1Var2.c();
                            c1Var2.i0();
                            zh.k0 k0Var3 = n0Var.h;
                            if (k0Var3 != null) {
                                ArrayList a10 = k0Var3.a();
                                a10.remove(Long.valueOf(j11));
                                a10.add(0, Long.valueOf(j11));
                                while (a10.size() > 21) {
                                    a1.g.y(1, a10);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i21 = 0; i21 < a10.size(); i21++) {
                                    if (i21 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a10.get(i21));
                                }
                                MessagesController.getMainSettings(k0Var3.f52087a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                k0Var3.J = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
