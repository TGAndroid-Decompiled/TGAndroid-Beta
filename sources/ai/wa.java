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
                org.telegram.ui.ActionBar.n2 n2Var = hs0Var.f8071a;
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
                    ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    ci.t6 t6Var = rVar.f8057a;
                    ci.r7 a2 = ci.r7.a(rVar.f8060f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33710t1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f5930s += i11;
                    orCreateStoryViewer.C(context, id2, t6Var, a2);
                    return;
                }
                return;
            case 6:
                Utilities.Callback callback = ((ei.y) this.f2385b).f10124c;
                if (callback != null) {
                    callback.run((ei.t) ei.t.a().get(i10));
                    return;
                }
                return;
            case 7:
                ei.v1 v1Var = (ei.v1) this.f2385b;
                ei.n2 n2Var2 = v1Var.f9934r;
                Object F = v1Var.f9931c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = n2Var2.f9510y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var2.dismiss();
                return;
            case 8:
                ei.b2 b2Var = (ei.b2) this.f2385b;
                ei.n2 n2Var3 = b2Var.f8777s;
                ei.a2 a2Var = b2Var.f8773c;
                if (i10 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f45961f != 4) {
                        ArrayList arrayList = a2Var.f8684s;
                        ArrayList arrayList2 = a2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) a2Var.f8684s.get(i10);
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
                        if (document2 == null && (view instanceof ei.n1) && (r5Var = ((ei.n1) view).f9497c) != null) {
                            document2 = r5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) n2Var3).currentAccount;
                            document2 = org.telegram.ui.Components.r5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = n2Var3.f9510y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(a2Var.f8681f.get(Long.valueOf(document2.f20285id)), document2, Boolean.FALSE);
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
                xaVar.l1.setTypeface(l0Var.f44599a);
                qg.u0 e = qg.u0.e(xaVar.F1);
                String str = l0Var.f44599a;
                e.f44718j = str;
                e.f44712a.edit().putString("typeface", str).apply();
                rg.j jVar = xaVar.J0;
                if (jVar instanceof rg.v2) {
                    ((rg.v2) jVar).setTypeface(l0Var);
                }
                xaVar.O0(false);
                return;
            case 10:
                fi.g.y0((fi.g) this.f2385b, i10);
                return;
            case 11:
                s61 s61Var = ((fi.f) this.f2385b).f10611b0;
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
                            pxVar.f40259a.L4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                px pxVar2 = h0Var.U;
                if (pxVar2 != null) {
                    ey eyVar = pxVar2.f40259a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (eyVar.f36690l2) {
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
                    if (AndroidUtilities.isTablet() && eyVar.f36653e0 != null) {
                        int i13 = 0;
                        while (true) {
                            dy[] dyVarArr = eyVar.f36653e0;
                            if (i13 < dyVarArr.length) {
                                lw lwVar = dyVarArr[i13].d;
                                eyVar.f36709p2.dialogId = longValue2;
                                lwVar.f11976s = longValue2;
                                i13++;
                            } else {
                                eyVar.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (eyVar.f36699n2 != null) {
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
                ig.f0 f0Var = i0Var.f12921x;
                ti tiVar = i0Var.f28245b;
                s4.g0 adapter = i0Var.f12919s.getAdapter();
                ig.g0 g0Var = i0Var.f12922y;
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
                        if (tiVar.f30581f0 != null) {
                            new sg.x0(tiVar.f30581f0, i0Var.getContext(), tiVar.M1, true, 31, false, null).show();
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
                ig.k0 k0Var = (ig.k0) this.f2385b;
                f61 G2 = k0Var.f12948d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = ig.k0.f12943g0;
                        if (i15 == -1) {
                            k0Var.f12949e0 = true;
                            a0Var.h = true;
                            k0Var.f12948d0.N(true);
                            k0Var.U(true);
                            return;
                        }
                        int i17 = ig.k0.f12944h0;
                        if (i15 == -2) {
                            k0Var.f12949e0 = false;
                            a0Var.h = false;
                            k0Var.f12948d0.N(true);
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
                Runnable runnable = ((ng.a) iVar.E.get(i10)).f17448c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 18:
                it0 it0Var = (it0) this.f2385b;
                qg.l0 l0Var2 = (qg.l0) qg.l0.c().get(i10);
                it0Var.f45544u1.setTypeface(l0Var2.f44599a);
                qg.u0 e7 = qg.u0.e(it0Var.P1);
                String str2 = l0Var2.f44599a;
                e7.f44718j = str2;
                e7.f44712a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = it0Var.S0;
                if (jVar2 instanceof rg.v2) {
                    ((rg.v2) jVar2).setTypeface(l0Var2);
                }
                it0Var.A0(false);
                return;
            case 19:
                rg.i1 i1Var = (rg.i1) this.f2385b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                qg.u0 u0Var = i1Var.Y2;
                u0Var.f44714c.put(Integer.valueOf(u0Var.f44715f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                return;
            case 20:
                sg.j0.X((sg.j0) this.f2385b, view);
                return;
            case 21:
                sg.s0 s0Var = (sg.s0) this.f2385b;
                if (view != null) {
                    s0Var.x1(view, true);
                    s0Var.f46408b3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
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
                yh.l4 l4Var = (yh.l4) this.f2385b;
                ei.d dVar = l4Var.f50403c0;
                HashSet hashSet = l4Var.Z;
                s61 s61Var2 = l4Var.f50405e0;
                if (s61Var2 != null && (G = s61Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i19 = savedStarGift.msg_id;
                        long j10 = i19 == 0 ? savedStarGift.saved_id : i19;
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((yh.h1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((yh.h1) view).b(true, true);
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
                    long j11 = document3.f20285id;
                    if (j11 != 0) {
                        zh.f0 f0Var2 = c0Var.f51704a;
                        if (f0Var2.d != null) {
                            if (!f0Var2.getUserConfig().isPremium() && ((d0Var = f0Var2.h) == null || !d0Var.H.contains(Long.valueOf(j11)))) {
                                zh.t0 t0Var = f0Var2.d;
                                t0Var.getClass();
                                t0Var.c1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                t0Var.i0();
                                return;
                            }
                            zh.t0 t0Var2 = f0Var2.d;
                            int i20 = t0Var2.f51903b;
                            String o10 = a1.g.o(j11, "c:");
                            HashMap hashMap = t0Var2.J;
                            if (!hashMap.containsKey(o10)) {
                                org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(i20, 2, document3);
                                m10.a(t0Var2);
                                hashMap.put(o10, m10);
                            }
                            if (o10 != null && !o10.startsWith("c:")) {
                                o10 = o10.replace("️", "");
                            }
                            ArrayList arrayList4 = t0Var2.I;
                            int indexOf = arrayList4.indexOf(o10);
                            if (indexOf >= 0) {
                                arrayList4.remove(indexOf);
                            } else {
                                if (arrayList4.size() >= 6) {
                                    arrayList4.remove(0);
                                }
                                arrayList4.add(o10);
                            }
                            t0Var2.c();
                            t0Var2.i0();
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
                                MessagesController.getMainSettings(d0Var2.f51858a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
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
