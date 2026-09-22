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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.bo;
import org.telegram.ui.bx;
import org.telegram.ui.gy;
import org.telegram.ui.lx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
public final class g implements zk0 {
    public final int f886a;
    public final Object f887b;

    public g(Object obj, int i10) {
        this.f886a = i10;
        this.f887b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.o5 o5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        i51 G;
        long j3;
        switch (this.f886a) {
            case 0:
                ((lx) this.f887b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f887b;
                mr0 mr0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = mr0Var.f3604a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (mr0Var.G.C1) {
                        if (mr0Var.c(messageObject)) {
                            mr0Var.g(messageObject);
                            return;
                        } else {
                            mr0Var.e(messageObject);
                            return;
                        }
                    }
                    jc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    t8 t8Var = uVar.f3588a;
                    u9 a2 = u9.a(uVar.f3591f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f31362s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1589s += i11;
                    orCreateStoryViewer.C(context, id2, t8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f887b).f5798c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.z1 z1Var = (ci.z1) this.f887b;
                ci.t2 t2Var = z1Var.f5857r;
                Object F = z1Var.f5854c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = t2Var.f5552y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                t2Var.dismiss();
                return;
            case 4:
                ci.e2 e2Var = (ci.e2) this.f887b;
                ci.t2 t2Var2 = e2Var.f4590s;
                ci.d2 d2Var = e2Var.f4586c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f42674f != 4) {
                        ArrayList arrayList = d2Var.f4489s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f4489s.get(i10);
                        }
                        if (document2 == t2Var2.e) {
                            hg.h hVar = t2Var2.E;
                            if (hVar != null) {
                                hVar.run();
                            }
                            t2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ci.o1) && (o5Var = ((ci.o1) view).f5108c) != null) {
                            document2 = o5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) t2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.o5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = t2Var2.f5552y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f4486f.get(Long.valueOf(document2.f18115id)), document2, Boolean.FALSE);
                            }
                            t2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci.qb qbVar = (ci.qb) this.f887b;
                pg.j0 j0Var = (pg.j0) pg.j0.c().get(i10);
                qbVar.l1.setTypeface(j0Var.f40883a);
                pg.s0 e = pg.s0.e(qbVar.F1);
                String str = j0Var.f40883a;
                e.f40994j = str;
                e.f40988a.edit().putString("typeface", str).apply();
                qg.j jVar = qbVar.J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).setTypeface(j0Var);
                }
                qbVar.P0(false);
                return;
            case 6:
                di.i.x0((di.i) this.f887b, i10);
                return;
            case 7:
                w51 w51Var = ((di.h) this.f887b).f7755b0;
                if (w51Var != null) {
                    w51Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.A0((ei.l) this.f887b, i10);
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) this.f887b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        gy gyVar = i0Var.U;
                        if (gyVar != null) {
                            gyVar.f33965a.N4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                gy gyVar2 = i0Var.U;
                if (gyVar2 != null) {
                    uy uyVar = gyVar2.f33965a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (uyVar.f38258l2) {
                        if (uyVar.h5(longValue2)) {
                            if (!uyVar.I2.isEmpty()) {
                                uyVar.P3(longValue2, uyVar.i3(longValue2, null));
                                uyVar.a5();
                                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            uyVar.O3(longValue2, 0L, true, null);
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
                    uyVar.J3();
                    if (AndroidUtilities.isTablet() && uyVar.f38222e0 != null) {
                        int i13 = 0;
                        while (true) {
                            ty[] tyVarArr = uyVar.f38222e0;
                            if (i13 < tyVarArr.length) {
                                bx bxVar = tyVarArr[i13].d;
                                uyVar.f38277p2.dialogId = longValue2;
                                bxVar.f9854s = longValue2;
                                i13++;
                            } else {
                                uyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (uyVar.f38267n2 != null) {
                        if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new bo(bundle));
                            return;
                        }
                        return;
                    } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                        uyVar.presentFragment(new bo(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.k0 k0Var = (hg.k0) this.f887b;
                hg.h0 h0Var = k0Var.f10328x;
                vi viVar = k0Var.f26461b;
                s4.h0 adapter = k0Var.f10326s.getAdapter();
                hg.i0 i0Var2 = k0Var.f10329y;
                if (adapter == i0Var2) {
                    ArrayList arrayList3 = i0Var2.d;
                    int i14 = i10 - 1;
                    if (i14 >= 0 && i14 < arrayList3.size()) {
                        O = arrayList3.get(i14);
                    } else {
                        O = null;
                    }
                } else {
                    int S = h0Var.S(i10);
                    int Q = h0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = h0Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof hg.b2) {
                    if (!UserConfig.getInstance(viVar.J1).isPremium()) {
                        if (viVar.f28747f0 != null) {
                            new rg.x0(viVar.f28747f0, k0Var.getContext(), viVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.b2 b2Var = (hg.b2) O;
                    org.telegram.ui.Components.c5.a0(viVar.J1, b2Var.a(), viVar.n1(), new ci.m2(16, k0Var, b2Var));
                    return;
                }
                return;
            case 11:
                hg.m0 m0Var = (hg.m0) this.f887b;
                i51 G2 = m0Var.f10354d0.G(i10 - 1);
                if (G2 != null) {
                    hg.c0 c0Var = m0Var.Z;
                    if (!c0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.m0.f10349g0;
                        if (i15 == -1) {
                            m0Var.f10355e0 = true;
                            c0Var.h = true;
                            m0Var.f10354d0.N(true);
                            m0Var.T(true);
                            return;
                        }
                        int i17 = hg.m0.f10350h0;
                        if (i15 == -2) {
                            m0Var.f10355e0 = false;
                            c0Var.h = false;
                            m0Var.f10354d0.N(true);
                            m0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f887b;
                int i18 = bVar.X.G(i10 - 1).d;
                if (i18 == 151) {
                    bVar.Q(false);
                    return;
                } else if (i18 == 150) {
                    bVar.Q(true);
                    return;
                } else {
                    return;
                }
            case 13:
                mg.i iVar = (mg.i) this.f887b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f14803c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                au0 au0Var = (au0) this.f887b;
                pg.j0 j0Var2 = (pg.j0) pg.j0.c().get(i10);
                au0Var.f41543u1.setTypeface(j0Var2.f40883a);
                pg.s0 e7 = pg.s0.e(au0Var.P1);
                String str2 = j0Var2.f40883a;
                e7.f40994j = str2;
                e7.f40988a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = au0Var.S0;
                if (jVar2 instanceof qg.x2) {
                    ((qg.x2) jVar2).setTypeface(j0Var2);
                }
                au0Var.A0(false);
                return;
            case 15:
                qg.l1 l1Var = (qg.l1) this.f887b;
                l1Var.f41445b3.accept(Integer.valueOf(l1Var.f41444a3.b(i10)));
                pg.s0 s0Var = l1Var.f41444a3;
                s0Var.f40990c.put(Integer.valueOf(s0Var.f40991f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                return;
            case 16:
                rg.j0.W((rg.j0) this.f887b, view);
                return;
            case 17:
                rg.s0 s0Var2 = (rg.s0) this.f887b;
                if (view != null) {
                    s0Var2.w1(view, true);
                    s0Var2.f42404d3 = false;
                    s0Var2.v0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((ca0) this.f887b).h(view);
                return;
            case 19:
                ((wh.n) this.f887b).h(view);
                return;
            case 20:
                xh.l4 l4Var = (xh.l4) this.f887b;
                ci.d dVar = l4Var.f45976c0;
                HashSet hashSet = l4Var.Z;
                w51 w51Var2 = l4Var.f45978e0;
                if (w51Var2 != null && (G = w51Var2.G(i10 - 1)) != null) {
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
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.i1) view).b(true, true);
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
            case 21:
                yh.x7.x0((yh.x7) this.f887b, i10);
                return;
            case 22:
                yh.i7.P((yh.i7) this.f887b, i10);
                return;
            case 23:
                yh.m7.P((yh.m7) this.f887b, i10);
                return;
            default:
                yh.n7.P((yh.n7) this.f887b, i10);
                return;
        }
    }
}
