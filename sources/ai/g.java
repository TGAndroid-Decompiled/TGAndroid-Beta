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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.hx;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.st0;
import org.telegram.ui.wn;
import org.telegram.ui.xw;
public final class g implements kl0 {
    public final int f887a;
    public final Object f888b;

    public g(Object obj, int i10) {
        this.f887a = i10;
        this.f888b = obj;
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
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        v51 G;
        long j3;
        switch (this.f887a) {
            case 0:
                ((hx) this.f888b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f888b;
                xr0 xr0Var = uVar.W;
                org.telegram.ui.ActionBar.m2 m2Var = xr0Var.f3599a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (xr0Var.G.C1) {
                        if (xr0Var.c(messageObject)) {
                            xr0Var.g(messageObject);
                            return;
                        } else {
                            xr0Var.e(messageObject);
                            return;
                        }
                    }
                    jc orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    u8 u8Var = uVar.f3583a;
                    u9 a2 = u9.a(uVar.f3586f);
                    if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f31651s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1587s += i11;
                    orCreateStoryViewer.C(context, id2, u8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f888b).f5860c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.z1 z1Var = (ci.z1) this.f888b;
                ci.s2 s2Var = z1Var.f5906r;
                Object F = z1Var.f5903c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = s2Var.f5480y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                s2Var.dismiss();
                return;
            case 4:
                ci.e2 e2Var = (ci.e2) this.f888b;
                ci.s2 s2Var2 = e2Var.f4599s;
                ci.d2 d2Var = e2Var.f4595c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f42963f != 4) {
                        ArrayList arrayList = d2Var.f4506s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f4506s.get(i10);
                        }
                        if (document2 == s2Var2.e) {
                            hg.h hVar = s2Var2.E;
                            if (hVar != null) {
                                hVar.run();
                            }
                            s2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ci.o1) && (q5Var = ((ci.o1) view).f5231c) != null) {
                            document2 = q5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.e3) s2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.q5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = s2Var2.f5480y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f4503f.get(Long.valueOf(document2.f18341id)), document2, Boolean.FALSE);
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
                ci.nb nbVar = (ci.nb) this.f888b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                nbVar.l1.setTypeface(k0Var.f41157a);
                pg.u0 e = pg.u0.e(nbVar.F1);
                String str = k0Var.f41157a;
                e.f41280j = str;
                e.f41274a.edit().putString("typeface", str).apply();
                qg.j jVar = nbVar.J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).setTypeface(k0Var);
                }
                nbVar.P0(false);
                return;
            case 6:
                di.i.x0((di.i) this.f888b, i10);
                return;
            case 7:
                j61 j61Var = ((di.h) this.f888b).f7740b0;
                if (j61Var != null) {
                    j61Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.l.A0((ei.l) this.f888b, i10);
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) this.f888b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        cy cyVar = i0Var.U;
                        if (cyVar != null) {
                            cyVar.f32817a.N4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                cy cyVar2 = i0Var.U;
                if (cyVar2 != null) {
                    qy qyVar = cyVar2.f32817a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (qyVar.f37069l2) {
                        if (qyVar.h5(longValue2)) {
                            if (!qyVar.I2.isEmpty()) {
                                qyVar.P3(longValue2, qyVar.i3(longValue2, null));
                                qyVar.a5();
                                kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            qyVar.O3(longValue2, 0L, true, null);
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
                    qyVar.J3();
                    if (AndroidUtilities.isTablet() && qyVar.f37033e0 != null) {
                        int i13 = 0;
                        while (true) {
                            py[] pyVarArr = qyVar.f37033e0;
                            if (i13 < pyVarArr.length) {
                                xw xwVar = pyVarArr[i13].d;
                                qyVar.f37088p2.dialogId = longValue2;
                                xwVar.f9839s = longValue2;
                                i13++;
                            } else {
                                qyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (qyVar.f37078n2 != null) {
                        if (qyVar.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                            qyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            qyVar.presentFragment(new wn(bundle));
                            return;
                        }
                        return;
                    } else if (qyVar.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                        qyVar.presentFragment(new wn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.k0 k0Var2 = (hg.k0) this.f888b;
                hg.h0 h0Var = k0Var2.f10314x;
                wi wiVar = k0Var2.f27087b;
                s4.h0 adapter = k0Var2.f10312s.getAdapter();
                hg.i0 i0Var2 = k0Var2.f10315y;
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
                    if (!UserConfig.getInstance(wiVar.J1).isPremium()) {
                        if (wiVar.f30005f0 != null) {
                            new rg.x0(wiVar.f30005f0, k0Var2.getContext(), wiVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.b2 b2Var = (hg.b2) O;
                    org.telegram.ui.Components.e5.a0(wiVar.J1, b2Var.a(), wiVar.n1(), new g3(17, k0Var2, b2Var));
                    return;
                }
                return;
            case 11:
                hg.m0 m0Var = (hg.m0) this.f888b;
                v51 G2 = m0Var.f10340d0.G(i10 - 1);
                if (G2 != null) {
                    hg.c0 c0Var = m0Var.Z;
                    if (!c0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.m0.f10335g0;
                        if (i15 == -1) {
                            m0Var.f10341e0 = true;
                            c0Var.h = true;
                            m0Var.f10340d0.N(true);
                            m0Var.T(true);
                            return;
                        }
                        int i17 = hg.m0.f10336h0;
                        if (i15 == -2) {
                            m0Var.f10341e0 = false;
                            c0Var.h = false;
                            m0Var.f10340d0.N(true);
                            m0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f888b;
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
                mg.i iVar = (mg.i) this.f888b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f15030c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                st0 st0Var = (st0) this.f888b;
                pg.k0 k0Var3 = (pg.k0) pg.k0.c().get(i10);
                st0Var.f41802u1.setTypeface(k0Var3.f41157a);
                pg.u0 e7 = pg.u0.e(st0Var.P1);
                String str2 = k0Var3.f41157a;
                e7.f41280j = str2;
                e7.f41274a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = st0Var.S0;
                if (jVar2 instanceof qg.v2) {
                    ((qg.v2) jVar2).setTypeface(k0Var3);
                }
                st0Var.A0(false);
                return;
            case 15:
                qg.j1 j1Var = (qg.j1) this.f888b;
                j1Var.f41705b3.accept(Integer.valueOf(j1Var.f41704a3.b(i10)));
                pg.u0 u0Var = j1Var.f41704a3;
                u0Var.f41276c.put(Integer.valueOf(u0Var.f41277f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                return;
            case 16:
                rg.j0.W((rg.j0) this.f888b, view);
                return;
            case 17:
                rg.s0 s0Var = (rg.s0) this.f888b;
                if (view != null) {
                    s0Var.w1(view, true);
                    s0Var.f42692d3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((oa0) this.f888b).h(view);
                return;
            case 19:
                ((wh.n) this.f888b).h(view);
                return;
            case 20:
                xh.m4 m4Var = (xh.m4) this.f888b;
                ci.d dVar = m4Var.f46295c0;
                HashSet hashSet = m4Var.Z;
                j61 j61Var2 = m4Var.f46297e0;
                if (j61Var2 != null && (G = j61Var2.G(i10 - 1)) != null) {
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
                yh.w7.x0((yh.w7) this.f888b, i10);
                return;
            case 22:
                yh.h7.P((yh.h7) this.f888b, i10);
                return;
            case 23:
                yh.l7.P((yh.l7) this.f888b, i10);
                return;
            default:
                yh.m7.P((yh.m7) this.f888b, i10);
                return;
        }
    }
}
