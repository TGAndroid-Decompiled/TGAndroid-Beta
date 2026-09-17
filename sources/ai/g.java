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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
import org.telegram.ui.cu0;
import org.telegram.ui.dx;
import org.telegram.ui.iy;
import org.telegram.ui.nx;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
public final class g implements al0 {
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
        org.telegram.ui.Components.o5 o5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        j51 G;
        long j3;
        switch (this.f889a) {
            case 0:
                ((nx) this.f890b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f890b;
                nr0 nr0Var = uVar.W;
                org.telegram.ui.ActionBar.o2 o2Var = nr0Var.f3607a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (nr0Var.G.C1) {
                        if (nr0Var.c(messageObject)) {
                            nr0Var.g(messageObject);
                            return;
                        } else {
                            nr0Var.e(messageObject);
                            return;
                        }
                    }
                    jc orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    t8 t8Var = uVar.f3591a;
                    u9 a2 = u9.a(uVar.f3594f);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f31378s1) {
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
                Utilities.Callback callback = ((ci.y) this.f890b).f5801c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.z1 z1Var = (ci.z1) this.f890b;
                ci.t2 t2Var = z1Var.f5860r;
                Object F = z1Var.f5857c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = t2Var.f5555y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                t2Var.dismiss();
                return;
            case 4:
                ci.e2 e2Var = (ci.e2) this.f890b;
                ci.t2 t2Var2 = e2Var.f4593s;
                ci.d2 d2Var = e2Var.f4589c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.V(view).f42700f != 4) {
                        ArrayList arrayList = d2Var.f4492s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f4492s.get(i10);
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
                        if (document2 == null && (view instanceof ci.o1) && (o5Var = ((ci.o1) view).f5111c) != null) {
                            document2 = o5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.g3) t2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.o5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = t2Var2.f5555y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f4489f.get(Long.valueOf(document2.f18127id)), document2, Boolean.FALSE);
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
                pg.j0 j0Var = (pg.j0) pg.j0.c().get(i10);
                qbVar.l1.setTypeface(j0Var.f40909a);
                pg.s0 e = pg.s0.e(qbVar.F1);
                String str = j0Var.f40909a;
                e.f41020j = str;
                e.f41014a.edit().putString("typeface", str).apply();
                qg.j jVar = qbVar.J0;
                if (jVar instanceof qg.x2) {
                    ((qg.x2) jVar).setTypeface(j0Var);
                }
                qbVar.P0(false);
                return;
            case 6:
                di.i.x0((di.i) this.f890b, i10);
                return;
            case 7:
                x51 x51Var = ((di.h) this.f890b).f7758b0;
                if (x51Var != null) {
                    x51Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.A0((ei.l) this.f890b, i10);
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) this.f890b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        iy iyVar = i0Var.U;
                        if (iyVar != null) {
                            iyVar.f34705a.N4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                iy iyVar2 = i0Var.U;
                if (iyVar2 != null) {
                    wy wyVar = iyVar2.f34705a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (wyVar.f39251l2) {
                        if (wyVar.h5(longValue2)) {
                            if (!wyVar.I2.isEmpty()) {
                                wyVar.P3(longValue2, wyVar.i3(longValue2, null));
                                wyVar.a5();
                                kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            wyVar.O3(longValue2, 0L, true, null);
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
                    wyVar.J3();
                    if (AndroidUtilities.isTablet() && wyVar.f39215e0 != null) {
                        int i13 = 0;
                        while (true) {
                            vy[] vyVarArr = wyVar.f39215e0;
                            if (i13 < vyVarArr.length) {
                                dx dxVar = vyVarArr[i13].d;
                                wyVar.f39270p2.dialogId = longValue2;
                                dxVar.f9858s = longValue2;
                                i13++;
                            } else {
                                wyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (wyVar.f39260n2 != null) {
                        if (wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
                            wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            wyVar.presentFragment(new bo(bundle));
                            return;
                        }
                        return;
                    } else if (wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
                        wyVar.presentFragment(new bo(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.i0 i0Var2 = (hg.i0) this.f890b;
                hg.f0 f0Var = i0Var2.f10314x;
                vi viVar = i0Var2.f26460b;
                s4.h0 adapter = i0Var2.f10312s.getAdapter();
                hg.g0 g0Var = i0Var2.f10315y;
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
                        if (viVar.f28742f0 != null) {
                            new rg.x0(viVar.f28742f0, i0Var2.getContext(), viVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.a2 a2Var = (hg.a2) O;
                    org.telegram.ui.Components.c5.a0(viVar.J1, a2Var.a(), viVar.n1(), new ci.m2(16, i0Var2, a2Var));
                    return;
                }
                return;
            case 11:
                hg.l0 l0Var = (hg.l0) this.f890b;
                j51 G2 = l0Var.f10349d0.G(i10 - 1);
                if (G2 != null) {
                    hg.a0 a0Var = l0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.l0.f10344g0;
                        if (i15 == -1) {
                            l0Var.f10350e0 = true;
                            a0Var.h = true;
                            l0Var.f10349d0.N(true);
                            l0Var.T(true);
                            return;
                        }
                        int i17 = hg.l0.f10345h0;
                        if (i15 == -2) {
                            l0Var.f10350e0 = false;
                            a0Var.h = false;
                            l0Var.f10349d0.N(true);
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
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f14815c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                cu0 cu0Var = (cu0) this.f890b;
                pg.j0 j0Var2 = (pg.j0) pg.j0.c().get(i10);
                cu0Var.f41569u1.setTypeface(j0Var2.f40909a);
                pg.s0 e7 = pg.s0.e(cu0Var.P1);
                String str2 = j0Var2.f40909a;
                e7.f41020j = str2;
                e7.f41014a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = cu0Var.S0;
                if (jVar2 instanceof qg.x2) {
                    ((qg.x2) jVar2).setTypeface(j0Var2);
                }
                cu0Var.z0(false);
                return;
            case 15:
                qg.l1 l1Var = (qg.l1) this.f890b;
                l1Var.f41471b3.accept(Integer.valueOf(l1Var.f41470a3.b(i10)));
                pg.s0 s0Var = l1Var.f41470a3;
                s0Var.f41016c.put(Integer.valueOf(s0Var.f41017f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                return;
            case 16:
                rg.j0.W((rg.j0) this.f890b, view);
                return;
            case 17:
                rg.s0 s0Var2 = (rg.s0) this.f890b;
                if (view != null) {
                    s0Var2.x1(view, true);
                    s0Var2.f42430d3 = false;
                    s0Var2.w0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((ca0) this.f890b).h(view);
                return;
            case 19:
                ((wh.n) this.f890b).h(view);
                return;
            case 20:
                xh.l4 l4Var = (xh.l4) this.f890b;
                ci.d dVar = l4Var.f46003c0;
                HashSet hashSet = l4Var.Z;
                x51 x51Var2 = l4Var.f46005e0;
                if (x51Var2 != null && (G = x51Var2.G(i10 - 1)) != null) {
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
                yh.y7.x0((yh.y7) this.f890b, i10);
                return;
            case 22:
                yh.j7.P((yh.j7) this.f890b, i10);
                return;
            case 23:
                yh.n7.P((yh.n7) this.f890b, i10);
                return;
            default:
                yh.o7.P((yh.o7) this.f890b, i10);
                return;
        }
    }
}
