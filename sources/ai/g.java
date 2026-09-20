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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.bx;
import org.telegram.ui.gy;
import org.telegram.ui.lx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
public final class g implements jl0 {
    public final int f889a;
    public final Object f890b;

    public g(Object obj, int i10) {
        this.f889a = i10;
        this.f890b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.p5 p5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        w51 G;
        long j3;
        switch (this.f889a) {
            case 0:
                ((lx) this.f890b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f890b;
                xr0 xr0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = xr0Var.f3607a;
                if (view instanceof org.telegram.ui.Cells.u7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.u7) view).getMessageObject();
                    if (xr0Var.G.C1) {
                        if (xr0Var.c(messageObject)) {
                            xr0Var.g(messageObject);
                            return;
                        } else {
                            xr0Var.e(messageObject);
                            return;
                        }
                    }
                    jc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    t8 t8Var = uVar.f3591a;
                    u9 a2 = u9.a(uVar.f3594f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f31649s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1592s += i11;
                    orCreateStoryViewer.C(context, id2, t8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f890b).f5802c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.z1 z1Var = (ci.z1) this.f890b;
                ci.t2 t2Var = z1Var.f5861r;
                Object F = z1Var.f5858c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = t2Var.f5556y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                t2Var.dismiss();
                return;
            case 4:
                ci.e2 e2Var = (ci.e2) this.f890b;
                ci.t2 t2Var2 = e2Var.f4594s;
                ci.d2 d2Var = e2Var.f4590c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.V(view).f42977f != 4) {
                        ArrayList arrayList = d2Var.f4493s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f4493s.get(i10);
                        }
                        if (document2 == t2Var2.e) {
                            hg.g gVar = t2Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            t2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ci.o1) && (p5Var = ((ci.o1) view).f5112c) != null) {
                            document2 = p5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) t2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.p5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = t2Var2.f5556y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f4490f.get(Long.valueOf(document2.f18334id)), document2, Boolean.FALSE);
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
                ci.qb qbVar = (ci.qb) this.f890b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                qbVar.l1.setTypeface(k0Var.f41186a);
                pg.u0 e = pg.u0.e(qbVar.F1);
                String str = k0Var.f41186a;
                e.f41309j = str;
                e.f41303a.edit().putString("typeface", str).apply();
                qg.j jVar = qbVar.J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).setTypeface(k0Var);
                }
                qbVar.P0(false);
                return;
            case 6:
                di.i.x0((di.i) this.f890b, i10);
                return;
            case 7:
                k61 k61Var = ((di.h) this.f890b).f7758b0;
                if (k61Var != null) {
                    k61Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.A0((ei.l) this.f890b, i10);
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) this.f890b;
                if (view instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (o4Var.E) {
                        gy gyVar = i0Var.U;
                        if (gyVar != null) {
                            gyVar.f34003a.N4(o4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                gy gyVar2 = i0Var.U;
                if (gyVar2 != null) {
                    uy uyVar = gyVar2.f34003a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (uyVar.f38292l2) {
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
                    if (AndroidUtilities.isTablet() && uyVar.f38256e0 != null) {
                        int i13 = 0;
                        while (true) {
                            ty[] tyVarArr = uyVar.f38256e0;
                            if (i13 < tyVarArr.length) {
                                bx bxVar = tyVarArr[i13].d;
                                uyVar.f38311p2.dialogId = longValue2;
                                bxVar.f9858s = longValue2;
                                i13++;
                            } else {
                                uyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (uyVar.f38301n2 != null) {
                        if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new zn(bundle));
                            return;
                        }
                        return;
                    } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                        uyVar.presentFragment(new zn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.i0 i0Var2 = (hg.i0) this.f890b;
                hg.f0 f0Var = i0Var2.f10315x;
                vi viVar = i0Var2.f26655b;
                s4.h0 adapter = i0Var2.f10313s.getAdapter();
                hg.g0 g0Var = i0Var2.f10316y;
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
                if (O instanceof hg.a2) {
                    if (!UserConfig.getInstance(viVar.J1).isPremium()) {
                        if (viVar.f29098f0 != null) {
                            new rg.x0(viVar.f29098f0, i0Var2.getContext(), viVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.a2 a2Var = (hg.a2) O;
                    org.telegram.ui.Components.d5.a0(viVar.J1, a2Var.a(), viVar.n1(), new ci.m2(16, i0Var2, a2Var));
                    return;
                }
                return;
            case 11:
                hg.l0 l0Var = (hg.l0) this.f890b;
                w51 G2 = l0Var.f10350d0.G(i10 - 1);
                if (G2 != null) {
                    hg.a0 a0Var = l0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.l0.f10345g0;
                        if (i15 == -1) {
                            l0Var.f10351e0 = true;
                            a0Var.h = true;
                            l0Var.f10350d0.N(true);
                            l0Var.T(true);
                            return;
                        }
                        int i17 = hg.l0.f10346h0;
                        if (i15 == -2) {
                            l0Var.f10351e0 = false;
                            a0Var.h = false;
                            l0Var.f10350d0.N(true);
                            l0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f890b;
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
                mg.i iVar = (mg.i) this.f890b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f15026c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                au0 au0Var = (au0) this.f890b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                au0Var.f41816u1.setTypeface(k0Var2.f41186a);
                pg.u0 e7 = pg.u0.e(au0Var.P1);
                String str2 = k0Var2.f41186a;
                e7.f41309j = str2;
                e7.f41303a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = au0Var.S0;
                if (jVar2 instanceof qg.v2) {
                    ((qg.v2) jVar2).setTypeface(k0Var2);
                }
                au0Var.z0(false);
                return;
            case 15:
                qg.j1 j1Var = (qg.j1) this.f890b;
                j1Var.f41719b3.accept(Integer.valueOf(j1Var.f41718a3.b(i10)));
                pg.u0 u0Var = j1Var.f41718a3;
                u0Var.f41305c.put(Integer.valueOf(u0Var.f41306f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                return;
            case 16:
                rg.j0.W((rg.j0) this.f890b, view);
                return;
            case 17:
                rg.s0 s0Var = (rg.s0) this.f890b;
                if (view != null) {
                    s0Var.x1(view, true);
                    s0Var.f42706d3 = false;
                    s0Var.w0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((ka0) this.f890b).h(view);
                return;
            case 19:
                ((wh.n) this.f890b).h(view);
                return;
            case 20:
                xh.m4 m4Var = (xh.m4) this.f890b;
                ci.d dVar = m4Var.f46315c0;
                HashSet hashSet = m4Var.Z;
                k61 k61Var2 = m4Var.f46317e0;
                if (k61Var2 != null && (G = k61Var2.G(i10 - 1)) != null) {
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
                            ((xh.j1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.j1) view).b(true, true);
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
                yh.w7.x0((yh.w7) this.f890b, i10);
                return;
            case 22:
                yh.h7.P((yh.h7) this.f890b, i10);
                return;
            case 23:
                yh.l7.P((yh.l7) this.f890b, i10);
                return;
            default:
                yh.m7.P((yh.m7) this.f890b, i10);
                return;
        }
    }
}
