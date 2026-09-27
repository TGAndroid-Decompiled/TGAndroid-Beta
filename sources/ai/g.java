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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.hx;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.vt0;
import org.telegram.ui.xn;
import org.telegram.ui.xw;
public final class g implements ml0 {
    public final int f890a;
    public final Object f891b;

    public g(Object obj, int i10) {
        this.f890a = i10;
        this.f891b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.q5 q5Var;
        org.telegram.ui.ActionBar.l lVar;
        Object O;
        x51 G;
        long j3;
        switch (this.f890a) {
            case 0:
                ((hx) this.f891b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f891b;
                zr0 zr0Var = uVar.W;
                org.telegram.ui.ActionBar.o2 o2Var = zr0Var.f3601a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (zr0Var.G.C1) {
                        if (zr0Var.c(messageObject)) {
                            zr0Var.g(messageObject);
                            return;
                        } else {
                            zr0Var.e(messageObject);
                            return;
                        }
                    }
                    jc orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    u8 u8Var = uVar.f3585a;
                    u9 a2 = u9.a(uVar.f3588f);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f31653s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1589s += i11;
                    orCreateStoryViewer.C(context, id2, u8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f891b).f5871c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.z1 z1Var = (ci.z1) this.f891b;
                ci.s2 s2Var = z1Var.f5907r;
                Object F = z1Var.f5904c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = s2Var.f5484y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                s2Var.dismiss();
                return;
            case 4:
                ci.e2 e2Var = (ci.e2) this.f891b;
                ci.s2 s2Var2 = e2Var.f4609s;
                ci.d2 d2Var = e2Var.f4605c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.V(view).f43008f != 4) {
                        ArrayList arrayList = d2Var.f4533s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f4533s.get(i10);
                        }
                        if (document2 == s2Var2.e) {
                            hg.g gVar = s2Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            s2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ci.o1) && (q5Var = ((ci.o1) view).f5241c) != null) {
                            document2 = q5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.g3) s2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.q5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = s2Var2.f5484y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f4530f.get(Long.valueOf(document2.f18335id)), document2, Boolean.FALSE);
                            }
                            s2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci.mb mbVar = (ci.mb) this.f891b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                mbVar.l1.setTypeface(k0Var.f41155a);
                pg.u0 e = pg.u0.e(mbVar.F1);
                String str = k0Var.f41155a;
                e.f41278j = str;
                e.f41272a.edit().putString("typeface", str).apply();
                qg.j jVar = mbVar.J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).setTypeface(k0Var);
                }
                mbVar.P0(false);
                return;
            case 6:
                di.i.x0((di.i) this.f891b, i10);
                return;
            case 7:
                l61 l61Var = ((di.h) this.f891b).f7742b0;
                if (l61Var != null) {
                    l61Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.A0((ei.l) this.f891b, i10);
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) this.f891b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        dy dyVar = i0Var.U;
                        if (dyVar != null) {
                            dyVar.f33063a.W4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                dy dyVar2 = i0Var.U;
                if (dyVar2 != null) {
                    ty tyVar = dyVar2.f33063a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (tyVar.f38012l2) {
                        if (tyVar.q5(longValue2)) {
                            if (!tyVar.I2.isEmpty()) {
                                tyVar.Y3(longValue2, tyVar.s3(longValue2, null));
                                tyVar.j5();
                                lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                                lVar.i(true);
                                return;
                            }
                            tyVar.X3(longValue2, 0L, true, null);
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
                    tyVar.S3();
                    if (AndroidUtilities.isTablet() && tyVar.f37976e0 != null) {
                        int i13 = 0;
                        while (true) {
                            sy[] syVarArr = tyVar.f37976e0;
                            if (i13 < syVarArr.length) {
                                xw xwVar = syVarArr[i13].d;
                                tyVar.f38031p2.dialogId = longValue2;
                                xwVar.f9845s = longValue2;
                                i13++;
                            } else {
                                tyVar.p5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (tyVar.f38021n2 != null) {
                        if (tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                            tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            tyVar.presentFragment(new xn(bundle));
                            return;
                        }
                        return;
                    } else if (tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                        tyVar.presentFragment(new xn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.i0 i0Var2 = (hg.i0) this.f891b;
                hg.f0 f0Var = i0Var2.f10302x;
                wi wiVar = i0Var2.f27104b;
                s4.h0 adapter = i0Var2.f10300s.getAdapter();
                hg.g0 g0Var = i0Var2.f10303y;
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
                    if (!UserConfig.getInstance(wiVar.J1).isPremium()) {
                        if (wiVar.f29962f0 != null) {
                            new rg.x0(wiVar.f29962f0, i0Var2.getContext(), wiVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.a2 a2Var = (hg.a2) O;
                    org.telegram.ui.Components.e5.a0(wiVar.J1, a2Var.a(), wiVar.l1(), new g3(17, i0Var2, a2Var));
                    return;
                }
                return;
            case 11:
                hg.l0 l0Var = (hg.l0) this.f891b;
                x51 G2 = l0Var.f10337d0.G(i10 - 1);
                if (G2 != null) {
                    hg.a0 a0Var = l0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.l0.f10332g0;
                        if (i15 == -1) {
                            l0Var.f10338e0 = true;
                            a0Var.h = true;
                            l0Var.f10337d0.N(true);
                            l0Var.T(true);
                            return;
                        }
                        int i17 = hg.l0.f10333h0;
                        if (i15 == -2) {
                            l0Var.f10338e0 = false;
                            a0Var.h = false;
                            l0Var.f10337d0.N(true);
                            l0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f891b;
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
                mg.i iVar = (mg.i) this.f891b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f15057c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                vt0 vt0Var = (vt0) this.f891b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                vt0Var.f41827u1.setTypeface(k0Var2.f41155a);
                pg.u0 e7 = pg.u0.e(vt0Var.P1);
                String str2 = k0Var2.f41155a;
                e7.f41278j = str2;
                e7.f41272a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = vt0Var.S0;
                if (jVar2 instanceof qg.v2) {
                    ((qg.v2) jVar2).setTypeface(k0Var2);
                }
                vt0Var.z0(false);
                return;
            case 15:
                qg.i1 i1Var = (qg.i1) this.f891b;
                i1Var.f41701b3.accept(Integer.valueOf(i1Var.f41700a3.b(i10)));
                pg.u0 u0Var = i1Var.f41700a3;
                u0Var.f41274c.put(Integer.valueOf(u0Var.f41275f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                return;
            case 16:
                rg.j0.W((rg.j0) this.f891b, view);
                return;
            case 17:
                rg.s0 s0Var = (rg.s0) this.f891b;
                if (view != null) {
                    s0Var.x1(view, true);
                    s0Var.f42737d3 = false;
                    s0Var.w0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((pa0) this.f891b).h(view);
                return;
            case 19:
                ((wh.n) this.f891b).h(view);
                return;
            case 20:
                xh.n4 n4Var2 = (xh.n4) this.f891b;
                ci.d dVar = n4Var2.f46378c0;
                HashSet hashSet = n4Var2.Z;
                l61 l61Var2 = n4Var2.f46380e0;
                if (l61Var2 != null && (G = l61Var2.G(i10 - 1)) != null) {
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
                yh.v7.x0((yh.v7) this.f891b, i10);
                return;
            case 22:
                yh.g7.P((yh.g7) this.f891b, i10);
                return;
            case 23:
                yh.k7.P((yh.k7) this.f891b, i10);
                return;
            default:
                yh.l7.P((yh.l7) this.f891b, i10);
                return;
        }
    }
}
