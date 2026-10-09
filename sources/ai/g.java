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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ax;
import org.telegram.ui.bu0;
import org.telegram.ui.fy;
import org.telegram.ui.kx;
import org.telegram.ui.sy;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
public final class g implements em0 {
    public final int f1044a;
    public final Object f1045b;

    public g(Object obj, int i10) {
        this.f1044a = i10;
        this.f1045b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        org.telegram.ui.Components.s5 s5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        p61 G;
        long j3;
        switch (this.f1044a) {
            case 0:
                ((kx) this.f1045b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f1045b;
                qs0 qs0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = qs0Var.f3940a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (qs0Var.G.C1) {
                        if (qs0Var.c(messageObject)) {
                            qs0Var.g(messageObject);
                            return;
                        } else {
                            qs0Var.e(messageObject);
                            return;
                        }
                    }
                    kc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    v8 v8Var = uVar.f3923a;
                    v9 a2 = v9.a(uVar.f3927f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f34339s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1836s += i11;
                    orCreateStoryViewer.C(context, id2, v8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f1045b).f6335c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.y1 y1Var = (ci.y1) this.f1045b;
                ci.r2 r2Var = y1Var.f6346r;
                Object F = y1Var.f6342c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = r2Var.f5891y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                r2Var.dismiss();
                return;
            case 4:
                ci.d2 d2Var = (ci.d2) this.f1045b;
                ci.r2 r2Var2 = d2Var.f4901s;
                ci.c2 c2Var = d2Var.f4896c;
                if (i10 >= 0) {
                    d2Var.d.getClass();
                    if (RecyclerView.U(view).f47662f != 4) {
                        ArrayList arrayList = c2Var.f4829s;
                        ArrayList arrayList2 = c2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) c2Var.f4829s.get(i10);
                        }
                        if (document2 == r2Var2.f5884e) {
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
                        if (document2 == null && (view instanceof ci.n1) && (s5Var = ((ci.n1) view).f5624c) != null) {
                            document2 = s5Var.f30649e;
                        }
                        if (document2 == null && longValue != 0) {
                            document2 = org.telegram.ui.Components.s5.f(ci.r2.Y(r2Var2), longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = r2Var2.f5891y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(c2Var.f4826f.get(Long.valueOf(document2.f20044id)), document2, Boolean.FALSE);
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
                ci.nb nbVar = (ci.nb) this.f1045b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                nbVar.l1.setTypeface(k0Var.f45674a);
                pg.u0 e7 = pg.u0.e(nbVar.F1);
                String str = k0Var.f45674a;
                e7.f45807j = str;
                e7.f45800a.edit().putString("typeface", str).apply();
                qg.j jVar = nbVar.J0;
                if (jVar instanceof qg.w2) {
                    ((qg.w2) jVar).setTypeface(k0Var);
                }
                nbVar.O0(false);
                return;
            case 6:
                di.i.y0((di.i) this.f1045b, i10);
                return;
            case 7:
                c71 c71Var = ((di.h) this.f1045b).f8383b0;
                if (c71Var != null) {
                    c71Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.B0((ei.l) this.f1045b, i10);
                return;
            case 9:
                gg.h0 h0Var = (gg.h0) this.f1045b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        fy fyVar = h0Var.U;
                        if (fyVar != null) {
                            fyVar.f37717a.K4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                fy fyVar2 = h0Var.U;
                if (fyVar2 != null) {
                    ty tyVar = fyVar2.f37717a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (tyVar.f42210l2) {
                        if (tyVar.e5(longValue2)) {
                            if (!tyVar.I2.isEmpty()) {
                                tyVar.M3(longValue2, tyVar.f3(longValue2, null));
                                tyVar.X4();
                                kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            tyVar.L3(longValue2, 0L, true, null);
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
                    tyVar.G3();
                    if (AndroidUtilities.isTablet() && tyVar.f42174e0 != null) {
                        int i12 = 0;
                        while (true) {
                            sy[] syVarArr = tyVar.f42174e0;
                            if (i12 < syVarArr.length) {
                                ax axVar = syVarArr[i12].d;
                                tyVar.f42229p2.dialogId = longValue2;
                                axVar.f10723s = longValue2;
                                i12++;
                            } else {
                                tyVar.d5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (tyVar.f42219n2 != null) {
                        if (tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                            tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            tyVar.presentFragment(new zn(bundle));
                            return;
                        }
                        return;
                    } else if (tyVar.getMessagesController().checkCanOpenChat(bundle, tyVar)) {
                        tyVar.presentFragment(new zn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.j0 j0Var = (hg.j0) this.f1045b;
                hg.g0 g0Var = j0Var.f11278x;
                yi yiVar = j0Var.f30173b;
                s4.i0 adapter = j0Var.f11276s.getAdapter();
                hg.h0 h0Var2 = j0Var.f11279y;
                if (adapter == h0Var2) {
                    ArrayList arrayList3 = h0Var2.d;
                    int i13 = i10 - 1;
                    if (i13 >= 0 && i13 < arrayList3.size()) {
                        O = arrayList3.get(i13);
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
                    if (!UserConfig.getInstance(yiVar.M1).isPremium()) {
                        if (yiVar.f33228f0 != null) {
                            new rg.y0(yiVar.f33228f0, j0Var.getContext(), yiVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.b2 b2Var = (hg.b2) O;
                    org.telegram.ui.Components.g5.Z(yiVar.M1, b2Var.a(), yiVar.p1(), new h3(17, j0Var, b2Var));
                    return;
                }
                return;
            case 11:
                hg.l0 l0Var = (hg.l0) this.f1045b;
                p61 G2 = l0Var.f11308d0.G(i10 - 1);
                if (G2 != null) {
                    hg.b0 b0Var = l0Var.Z;
                    if (!b0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = hg.l0.f11303g0;
                        if (i14 == -1) {
                            l0Var.f11309e0 = true;
                            b0Var.h = true;
                            l0Var.f11308d0.N(true);
                            l0Var.U(true);
                            return;
                        }
                        int i16 = hg.l0.f11304h0;
                        if (i14 == -2) {
                            l0Var.f11309e0 = false;
                            b0Var.h = false;
                            l0Var.f11308d0.N(true);
                            l0Var.U(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f1045b;
                int i17 = bVar.X.G(i10 - 1).d;
                if (i17 == 151) {
                    bVar.R(false);
                    return;
                } else if (i17 == 150) {
                    bVar.R(true);
                    return;
                } else {
                    return;
                }
            case 13:
                mg.i iVar = (mg.i) this.f1045b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f16411c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                bu0 bu0Var = (bu0) this.f1045b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                bu0Var.f46392u1.setTypeface(k0Var2.f45674a);
                pg.u0 e10 = pg.u0.e(bu0Var.P1);
                String str2 = k0Var2.f45674a;
                e10.f45807j = str2;
                e10.f45800a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = bu0Var.S0;
                if (jVar2 instanceof qg.w2) {
                    ((qg.w2) jVar2).setTypeface(k0Var2);
                }
                bu0Var.A0(false);
                return;
            case 15:
                qg.i1 i1Var = (qg.i1) this.f1045b;
                i1Var.Z2.accept(Integer.valueOf(i1Var.Y2.b(i10)));
                pg.u0 u0Var = i1Var.Y2;
                u0Var.f45802c.put(Integer.valueOf(u0Var.f45804f), Integer.valueOf(u0Var.b(i10)));
                u0Var.f45803e = true;
                return;
            case 16:
                rg.j0.X((rg.j0) this.f1045b, view);
                return;
            case 17:
                rg.s0 s0Var = (rg.s0) this.f1045b;
                if (view != null) {
                    s0Var.x1(view, true);
                    s0Var.f47391b3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((eb0) this.f1045b).h(view);
                return;
            case 19:
                ((wh.l) this.f1045b).h(view);
                return;
            case 20:
                xh.m4 m4Var = (xh.m4) this.f1045b;
                ci.d dVar = m4Var.f51379c0;
                HashSet hashSet = m4Var.Z;
                c71 c71Var2 = m4Var.f51381e0;
                if (c71Var2 != null && (G = c71Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        if (i18 == 0) {
                            j3 = savedStarGift.saved_id;
                        } else {
                            j3 = i18;
                        }
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j3))) {
                            hashSet.remove(Long.valueOf(j3));
                            ((xh.j1) view).b(false, true);
                            G.f29728e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.j1) view).b(true, true);
                            G.f29728e = true;
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
                yh.p7.y0((yh.p7) this.f1045b, i10);
                return;
            case 22:
                yh.a7.Q((yh.a7) this.f1045b, i10);
                return;
            case 23:
                yh.e7.Q((yh.e7) this.f1045b, i10);
                return;
            default:
                yh.f7.Q((yh.f7) this.f1045b, i10);
                return;
        }
    }
}
