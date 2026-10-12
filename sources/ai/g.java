package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.cx;
import org.telegram.ui.eo;
import org.telegram.ui.hy;
import org.telegram.ui.mx;
import org.telegram.ui.uy;
import org.telegram.ui.vy;
public final class g implements km0 {
    public final int f1042a;
    public final Object f1043b;

    public g(Object obj, int i10) {
        this.f1042a = i10;
        this.f1043b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.s5 s5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        u61 G;
        long j3;
        switch (this.f1042a) {
            case 0:
                ((mx) this.f1043b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f1043b;
                ws0 ws0Var = uVar.W;
                org.telegram.ui.ActionBar.m2 m2Var = ws0Var.f3939a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (ws0Var.G.C1) {
                        if (ws0Var.c(messageObject)) {
                            ws0Var.g(messageObject);
                            return;
                        } else {
                            ws0Var.e(messageObject);
                            return;
                        }
                    }
                    kc orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    v8 v8Var = uVar.f3922a;
                    v9 a2 = v9.a(uVar.f3926f);
                    if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f34176s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1834s += i11;
                    orCreateStoryViewer.C(context, id2, v8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f1043b).f6333c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.y1 y1Var = (ci.y1) this.f1043b;
                ci.r2 r2Var = y1Var.f6344r;
                Object F = y1Var.f6340c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = r2Var.f5889y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                r2Var.dismiss();
                return;
            case 4:
                ci.d2 d2Var = (ci.d2) this.f1043b;
                ci.r2 r2Var2 = d2Var.f4899s;
                ci.c2 c2Var = d2Var.f4894c;
                if (i10 >= 0) {
                    d2Var.d.getClass();
                    if (RecyclerView.U(view).f47893f != 4) {
                        ArrayList arrayList = c2Var.f4827s;
                        ArrayList arrayList2 = c2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) c2Var.f4827s.get(i10);
                        }
                        if (document2 == r2Var2.f5882e) {
                            hg.h hVar = r2Var2.E;
                            if (hVar != null) {
                                hVar.run();
                            }
                            r2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ci.n1) && (s5Var = ((ci.n1) view).f5622c) != null) {
                            document2 = s5Var.f30401e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.e3) r2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.s5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = r2Var2.f5889y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(c2Var.f4824f.get(Long.valueOf(document2.f19808id)), document2, Boolean.FALSE);
                            }
                            r2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci.nb nbVar = (ci.nb) this.f1043b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                nbVar.l1.setTypeface(k0Var.f45560a);
                pg.t0 e7 = pg.t0.e(nbVar.F1);
                String str = k0Var.f45560a;
                e7.f45686j = str;
                e7.f45679a.edit().putString("typeface", str).apply();
                qg.j jVar = nbVar.J0;
                if (jVar instanceof qg.w2) {
                    ((qg.w2) jVar).setTypeface(k0Var);
                }
                nbVar.O0(false);
                return;
            case 6:
                di.i.y0((di.i) this.f1043b, i10);
                return;
            case 7:
                h71 h71Var = ((di.h) this.f1043b).f8380b0;
                if (h71Var != null) {
                    h71Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.B0((ei.l) this.f1043b, i10);
                return;
            case 9:
                gg.h0 h0Var = (gg.h0) this.f1043b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        hy hyVar = h0Var.U;
                        if (hyVar != null) {
                            hyVar.f38559a.K4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                hy hyVar2 = h0Var.U;
                if (hyVar2 != null) {
                    vy vyVar = hyVar2.f38559a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (vyVar.f42939l2) {
                        if (vyVar.e5(longValue2)) {
                            if (!vyVar.I2.isEmpty()) {
                                vyVar.M3(longValue2, vyVar.f3(longValue2, null));
                                vyVar.X4();
                                kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                                kVar.i(true);
                                return;
                            }
                            vyVar.L3(longValue2, 0L, true, null);
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
                    vyVar.G3();
                    if (AndroidUtilities.isTablet() && vyVar.f42903e0 != null) {
                        int i13 = 0;
                        while (true) {
                            uy[] uyVarArr = vyVar.f42903e0;
                            if (i13 < uyVarArr.length) {
                                cx cxVar = uyVarArr[i13].d;
                                vyVar.f42958p2.dialogId = longValue2;
                                cxVar.f10721s = longValue2;
                                i13++;
                            } else {
                                vyVar.d5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (vyVar.f42948n2 != null) {
                        if (vyVar.getMessagesController().checkCanOpenChat(bundle, vyVar)) {
                            vyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            vyVar.presentFragment(new eo(bundle));
                            return;
                        }
                        return;
                    } else if (vyVar.getMessagesController().checkCanOpenChat(bundle, vyVar)) {
                        vyVar.presentFragment(new eo(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.j0 j0Var = (hg.j0) this.f1043b;
                hg.g0 g0Var = j0Var.f11276x;
                aj ajVar = j0Var.f30574b;
                s4.i0 adapter = j0Var.f11274s.getAdapter();
                hg.h0 h0Var2 = j0Var.f11277y;
                if (adapter == h0Var2) {
                    ArrayList arrayList3 = h0Var2.d;
                    int i14 = i10 - 1;
                    if (i14 >= 0 && i14 < arrayList3.size()) {
                        O = arrayList3.get(i14);
                    } else {
                        O = null;
                    }
                } else {
                    int S = g0Var.S(i10);
                    int Q = g0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = g0Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof hg.b2) {
                    if (!UserConfig.getInstance(ajVar.M1).isPremium()) {
                        if (ajVar.f24342f0 != null) {
                            new rg.y0(ajVar.f24342f0, j0Var.getContext(), ajVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.b2 b2Var = (hg.b2) O;
                    org.telegram.ui.Components.g5.Z(ajVar.M1, b2Var.a(), ajVar.p1(), new h3(17, j0Var, b2Var));
                    return;
                }
                return;
            case 11:
                hg.l0 l0Var = (hg.l0) this.f1043b;
                u61 G2 = l0Var.f11306d0.G(i10 - 1);
                if (G2 != null) {
                    hg.b0 b0Var = l0Var.Z;
                    if (!b0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.l0.f11301g0;
                        if (i15 == -1) {
                            l0Var.f11307e0 = true;
                            b0Var.h = true;
                            l0Var.f11306d0.N(true);
                            l0Var.U(true);
                            return;
                        }
                        int i17 = hg.l0.f11302h0;
                        if (i15 == -2) {
                            l0Var.f11307e0 = false;
                            b0Var.h = false;
                            l0Var.f11306d0.N(true);
                            l0Var.U(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f1043b;
                int i18 = bVar.X.G(i10 - 1).d;
                if (i18 == 151) {
                    bVar.R(false);
                    return;
                } else if (i18 == 150) {
                    bVar.R(true);
                    return;
                } else {
                    return;
                }
            case 13:
                mg.i iVar = (mg.i) this.f1043b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f16159c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                cu0 cu0Var = (cu0) this.f1043b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                cu0Var.f46329u1.setTypeface(k0Var2.f45560a);
                pg.t0 e10 = pg.t0.e(cu0Var.P1);
                String str2 = k0Var2.f45560a;
                e10.f45686j = str2;
                e10.f45679a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = cu0Var.S0;
                if (jVar2 instanceof qg.w2) {
                    ((qg.w2) jVar2).setTypeface(k0Var2);
                }
                cu0Var.A0(false);
                return;
            case 15:
                qg.i1 i1Var = (qg.i1) this.f1043b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                pg.t0 t0Var = i1Var.Y2;
                t0Var.f45681c.put(Integer.valueOf(t0Var.f45683f), Integer.valueOf(t0Var.b(i10)));
                t0Var.f45682e = true;
                return;
            case 16:
                rg.j0.X((rg.j0) this.f1043b, view);
                return;
            case 17:
                rg.t0 t0Var2 = (rg.t0) this.f1043b;
                if (view != null) {
                    t0Var2.x1(view, true);
                    t0Var2.f47596b3 = false;
                    t0Var2.v0(0, view.getTop() - ((t0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((ib0) this.f1043b).h(view);
                return;
            case 19:
                ((wh.l) this.f1043b).h(view);
                return;
            case 20:
                xh.l4 l4Var = (xh.l4) this.f1043b;
                ci.d dVar = l4Var.f51572c0;
                HashSet hashSet = l4Var.Z;
                h71 h71Var2 = l4Var.f51574e0;
                if (h71Var2 != null && (G = h71Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i19 = savedStarGift.msg_id;
                        if (i19 == 0) {
                            j3 = savedStarGift.saved_id;
                        } else {
                            j3 = i19;
                        }
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((xh.i1) view).b(false, true);
                            G.f31070e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.i1) view).b(true, true);
                            G.f31070e = true;
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
            case 21:
                yh.p7.y0((yh.p7) this.f1043b, i10);
                return;
            case 22:
                yh.a7.Q((yh.a7) this.f1043b, i10);
                return;
            case 23:
                yh.e7.Q((yh.e7) this.f1043b, i10);
                return;
            default:
                yh.f7.Q((yh.f7) this.f1043b, i10);
                return;
        }
    }
}
