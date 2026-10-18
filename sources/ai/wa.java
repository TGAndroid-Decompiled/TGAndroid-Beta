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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.it0;
import org.telegram.ui.lw;
import org.telegram.ui.px;
import org.telegram.ui.sn;
import org.telegram.ui.vw;
public final class wa implements wl0 {
    public final int f2384a;
    public final Object f2385b;

    public wa(Object obj, int i10) {
        this.f2384a = i10;
        this.f2385b = obj;
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
        f61 G;
        TLRPC.Document document3;
        zh.d0 d0Var;
        switch (this.f2384a) {
            case 0:
                md.y0((md) this.f2385b, i10);
                return;
            case 1:
                vc.Q((vc) this.f2385b, i10);
                return;
            case 2:
                cd.Q((cd) this.f2385b, i10);
                return;
            case 3:
                dd.Q((dd) this.f2385b, i10);
                return;
            case 4:
                ((vw) this.f2385b).i((ci.q) view, false);
                return;
            case 5:
                di.r rVar = (di.r) this.f2385b;
                hs0 hs0Var = rVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = hs0Var.f8069a;
                if (view instanceof org.telegram.ui.Cells.s7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                    if (hs0Var.G.C1) {
                        if (hs0Var.c(messageObject)) {
                            hs0Var.g(messageObject);
                            return;
                        } else {
                            hs0Var.e(messageObject);
                            return;
                        }
                    }
                    ci.z9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    ci.s6 s6Var = rVar.f8055a;
                    ci.q7 a2 = ci.q7.a(rVar.f8058f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33703t1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f5793s += i11;
                    orCreateStoryViewer.C(context, id2, s6Var, a2);
                    return;
                }
                return;
            case 6:
                Utilities.Callback callback = ((ei.y) this.f2385b).f10122c;
                if (callback != null) {
                    callback.run((ei.t) ei.t.a().get(i10));
                    return;
                }
                return;
            case 7:
                ei.v1 v1Var = (ei.v1) this.f2385b;
                ei.n2 n2Var2 = v1Var.f9932r;
                Object F = v1Var.f9929c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = n2Var2.f9508y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var2.dismiss();
                return;
            case 8:
                ei.b2 b2Var = (ei.b2) this.f2385b;
                ei.n2 n2Var3 = b2Var.f8775s;
                ei.a2 a2Var = b2Var.f8771c;
                if (i10 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f45913f != 4) {
                        ArrayList arrayList = a2Var.f8682s;
                        ArrayList arrayList2 = a2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) a2Var.f8682s.get(i10);
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
                        if (document2 == null && (view instanceof ei.n1) && (r5Var = ((ei.n1) view).f9495c) != null) {
                            document2 = r5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) n2Var3).currentAccount;
                            document2 = org.telegram.ui.Components.r5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = n2Var3.f9508y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(a2Var.f8679f.get(Long.valueOf(document2.f20278id)), document2, Boolean.FALSE);
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
                ei.xa xaVar = (ei.xa) this.f2385b;
                qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
                xaVar.l1.setTypeface(l0Var.f44555a);
                qg.u0 e = qg.u0.e(xaVar.F1);
                String str = l0Var.f44555a;
                e.f44671j = str;
                e.f44665a.edit().putString("typeface", str).apply();
                rg.j jVar = xaVar.J0;
                if (jVar instanceof rg.u2) {
                    ((rg.u2) jVar).setTypeface(l0Var);
                }
                xaVar.O0(false);
                return;
            case 10:
                fi.g.y0((fi.g) this.f2385b, i10);
                return;
            case 11:
                s61 s61Var = ((fi.f) this.f2385b).f10609b0;
                if (s61Var != null) {
                    s61Var.G(i10 - 1);
                    return;
                }
                return;
            case 12:
                gi.l.B0((gi.l) this.f2385b, i10);
                return;
            case 13:
                hg.h0 h0Var = (hg.h0) this.f2385b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        px pxVar = h0Var.U;
                        if (pxVar != null) {
                            pxVar.f40217a.L4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                px pxVar2 = h0Var.U;
                if (pxVar2 != null) {
                    ey eyVar = pxVar2.f40217a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (eyVar.f36674l2) {
                        if (eyVar.f5(longValue2)) {
                            if (!eyVar.I2.isEmpty()) {
                                eyVar.N3(longValue2, eyVar.f3(longValue2, null));
                                eyVar.Y4();
                                kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            eyVar.M3(longValue2, 0L, true, null);
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
                    eyVar.H3();
                    if (AndroidUtilities.isTablet() && eyVar.f36637e0 != null) {
                        int i13 = 0;
                        while (true) {
                            dy[] dyVarArr = eyVar.f36637e0;
                            if (i13 < dyVarArr.length) {
                                lw lwVar = dyVarArr[i13].d;
                                eyVar.f36693p2.dialogId = longValue2;
                                lwVar.f11974s = longValue2;
                                i13++;
                            } else {
                                eyVar.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (eyVar.f36683n2 != null) {
                        if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                            eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            eyVar.presentFragment(new sn(bundle));
                            return;
                        }
                        return;
                    } else if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                        eyVar.presentFragment(new sn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                ig.i0 i0Var = (ig.i0) this.f2385b;
                ig.f0 f0Var = i0Var.f12919x;
                ti tiVar = i0Var.f28238b;
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
                        if (tiVar.f30574f0 != null) {
                            new sg.y0(tiVar.f30574f0, i0Var.getContext(), tiVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    ig.z1 z1Var = (ig.z1) O;
                    org.telegram.ui.Components.f5.Z(tiVar.M1, z1Var.a(), tiVar.p1(), new n2(23, i0Var, z1Var));
                    return;
                }
                return;
            case 15:
                ig.k0 k0Var = (ig.k0) this.f2385b;
                f61 G2 = k0Var.f12946d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = ig.k0.f12941g0;
                        if (i15 == -1) {
                            k0Var.f12947e0 = true;
                            a0Var.h = true;
                            k0Var.f12946d0.N(true);
                            k0Var.U(true);
                            return;
                        }
                        int i17 = ig.k0.f12942h0;
                        if (i15 == -2) {
                            k0Var.f12947e0 = false;
                            a0Var.h = false;
                            k0Var.f12946d0.N(true);
                            k0Var.U(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ji.a aVar = (ji.a) this.f2385b;
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
                ng.i iVar = (ng.i) this.f2385b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).f17444c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 18:
                it0 it0Var = (it0) this.f2385b;
                qg.l0 l0Var2 = (qg.l0) qg.l0.c().get(i10);
                it0Var.f45498u1.setTypeface(l0Var2.f44555a);
                qg.u0 e7 = qg.u0.e(it0Var.P1);
                String str2 = l0Var2.f44555a;
                e7.f44671j = str2;
                e7.f44665a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = it0Var.S0;
                if (jVar2 instanceof rg.u2) {
                    ((rg.u2) jVar2).setTypeface(l0Var2);
                }
                it0Var.A0(false);
                return;
            case 19:
                rg.i1 i1Var = (rg.i1) this.f2385b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                qg.u0 u0Var = i1Var.Y2;
                u0Var.f44667c.put(Integer.valueOf(u0Var.f44668f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                return;
            case 20:
                sg.k0.X((sg.k0) this.f2385b, view);
                return;
            case 21:
                sg.t0 t0Var = (sg.t0) this.f2385b;
                if (view != null) {
                    t0Var.x1(view, true);
                    t0Var.f46387b3 = false;
                    t0Var.v0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 22:
                ((xa0) this.f2385b).h(view);
                return;
            case 23:
                ((xh.k) this.f2385b).h(view);
                return;
            case 24:
                yh.k4 k4Var = (yh.k4) this.f2385b;
                ei.d dVar = k4Var.f50343c0;
                HashSet hashSet = k4Var.Z;
                s61 s61Var2 = k4Var.f50345e0;
                if (s61Var2 != null && (G = s61Var2.G(i10 - 1)) != null) {
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
                zh.c0 c0Var = (zh.c0) this.f2385b;
                if ((view instanceof zh.l) && (document3 = ((zh.l) view).e) != null) {
                    long j11 = document3.f20278id;
                    if (j11 != 0) {
                        zh.f0 f0Var2 = c0Var.f51657a;
                        if (f0Var2.d != null) {
                            if (!f0Var2.getUserConfig().isPremium() && ((d0Var = f0Var2.h) == null || !d0Var.H.contains(Long.valueOf(j11)))) {
                                zh.u0 u0Var2 = f0Var2.d;
                                u0Var2.getClass();
                                u0Var2.d1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                u0Var2.i0();
                                return;
                            }
                            zh.u0 u0Var3 = f0Var2.d;
                            int i20 = u0Var3.f51862b;
                            String o10 = a1.g.o(j11, "c:");
                            HashMap hashMap = u0Var3.J;
                            if (!hashMap.containsKey(o10)) {
                                org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(i20, 2, document3);
                                m10.a(u0Var3);
                                hashMap.put(o10, m10);
                            }
                            if (o10 != null && !o10.startsWith("c:")) {
                                o10 = o10.replace("️", "");
                            }
                            ArrayList arrayList4 = u0Var3.I;
                            int indexOf = arrayList4.indexOf(o10);
                            if (indexOf >= 0) {
                                arrayList4.remove(indexOf);
                            } else {
                                if (arrayList4.size() >= 6) {
                                    arrayList4.remove(0);
                                }
                                arrayList4.add(o10);
                            }
                            u0Var3.c();
                            u0Var3.i0();
                            zh.d0 d0Var2 = f0Var2.h;
                            if (d0Var2 != null) {
                                ArrayList a10 = d0Var2.a();
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
                                MessagesController.getMainSettings(d0Var2.f51795a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                d0Var2.J = true;
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
