package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.f3;
import bi.k2;
import bi.q2;
import bi.v1;
import bi.y2;
import fg.h0;
import gg.j2;
import gg.k0;
import gg.l0;
import gg.n0;
import gg.p0;
import java.util.ArrayList;
import java.util.HashSet;
import og.m0;
import og.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dx;
import org.telegram.ui.eo;
import org.telegram.ui.iy;
import org.telegram.ui.nx;
import org.telegram.ui.vy;
import org.telegram.ui.wy;
import org.telegram.ui.zt0;
import pg.i1;
import pg.v2;
import qg.a1;
import qg.v0;
import wh.h1;
import wh.l4;
import xh.k7;
import xh.o7;
import xh.p7;
import xh.z7;
import zh.s4;
import zh.s5;
public final class g implements jl0 {
    public final int f440a;
    public final Object f441b;

    public g(Object obj, int i10) {
        this.f440a = i10;
        this.f441b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        p5 p5Var;
        org.telegram.ui.ActionBar.l lVar;
        Object O;
        v51 G;
        long j3;
        switch (this.f440a) {
            case 0:
                a0 a0Var = (a0) this.f441b;
                vr0 vr0Var = a0Var.W;
                p2 p2Var = vr0Var.f442a;
                if (view instanceof u7) {
                    MessageObject messageObject = ((u7) view).getMessageObject();
                    if (vr0Var.G.C1) {
                        if (vr0Var.c(messageObject)) {
                            vr0Var.g(messageObject);
                            return;
                        } else {
                            vr0Var.e(messageObject);
                            return;
                        }
                    }
                    zh.u7 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                    Context context = a0Var.getContext();
                    int id2 = messageObject.getId();
                    s4 s4Var = a0Var.f411a;
                    s5 a2 = s5.a(a0Var.f414f);
                    if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f30477s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f48871s += i11;
                    orCreateStoryViewer.C(context, id2, s4Var, a2);
                    return;
                }
                return;
            case 1:
                Utilities.Callback callback = ((bi.c0) this.f441b).f2394c;
                if (callback != null) {
                    callback.run((bi.x) bi.x.a().get(i10));
                    return;
                }
                return;
            case 2:
                k2 k2Var = (k2) this.f441b;
                f3 f3Var = k2Var.f2984r;
                Object F = k2Var.f2981c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = f3Var.f2699y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                f3Var.dismiss();
                return;
            case 3:
                q2 q2Var = (q2) this.f441b;
                f3 f3Var2 = q2Var.f3447s;
                bi.p2 p2Var2 = q2Var.f3443c;
                if (i10 >= 0) {
                    q2Var.d.getClass();
                    if (RecyclerView.U(view).f41613f != 4) {
                        ArrayList arrayList = p2Var2.f3361s;
                        ArrayList arrayList2 = p2Var2.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) p2Var2.f3361s.get(i10);
                        }
                        if (document2 == f3Var2.e) {
                            gg.g gVar = f3Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            f3Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof v1) && (p5Var = ((v1) view).f3777c) != null) {
                            document2 = p5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((h3) f3Var2).currentAccount;
                            document2 = p5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = f3Var2.f2699y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(p2Var2.f3358f.get(Long.valueOf(document2.f17201id)), document2, Boolean.FALSE);
                            }
                            f3Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ad adVar = (ad) this.f441b;
                m0 m0Var = (m0) m0.c().get(i10);
                adVar.l1.setTypeface(m0Var.f14424a);
                x0 e = x0.e(adVar.F1);
                String str = m0Var.f14424a;
                e.f14558j = str;
                e.f14552a.edit().putString("typeface", str).apply();
                pg.j jVar = adVar.J0;
                if (jVar instanceof v2) {
                    ((v2) jVar).setTypeface(m0Var);
                }
                adVar.P0(false);
                return;
            case 5:
                ci.j.x0((ci.j) this.f441b, i10);
                return;
            case 6:
                j61 j61Var = ((ci.i) this.f441b).f4710b0;
                if (j61Var != null) {
                    j61Var.G(i10 - 1);
                    return;
                }
                return;
            case 7:
                di.m.A0((di.m) this.f441b, i10);
                return;
            case 8:
                h0 h0Var = (h0) this.f441b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.E) {
                        iy iyVar = h0Var.U;
                        if (iyVar != null) {
                            iyVar.f33812a.N4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                iy iyVar2 = h0Var.U;
                if (iyVar2 != null) {
                    wy wyVar = iyVar2.f33812a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (wyVar.f38467l2) {
                        if (wyVar.h5(longValue2)) {
                            if (!wyVar.I2.isEmpty()) {
                                wyVar.P3(longValue2, wyVar.i3(longValue2, null));
                                wyVar.a5();
                                lVar = ((p2) wyVar).actionBar;
                                lVar.h(true);
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
                    if (AndroidUtilities.isTablet() && wyVar.f38431e0 != null) {
                        int i13 = 0;
                        while (true) {
                            vy[] vyVarArr = wyVar.f38431e0;
                            if (i13 < vyVarArr.length) {
                                dx dxVar = vyVarArr[i13].d;
                                wyVar.f38486p2.dialogId = longValue2;
                                dxVar.f8142s = longValue2;
                                i13++;
                            } else {
                                wyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (wyVar.f38476n2 != null) {
                        if (wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
                            wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            wyVar.presentFragment(new eo(bundle));
                            return;
                        }
                        return;
                    } else if (wyVar.getMessagesController().checkCanOpenChat(bundle, wyVar)) {
                        wyVar.presentFragment(new eo(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                n0 n0Var = (n0) this.f441b;
                k0 k0Var = n0Var.f8966x;
                yi yiVar = n0Var.f26422b;
                s4.h0 adapter = n0Var.f8964s.getAdapter();
                l0 l0Var = n0Var.f8967y;
                if (adapter == l0Var) {
                    ArrayList arrayList3 = l0Var.d;
                    int i14 = i10 - 1;
                    if (i14 >= 0 && i14 < arrayList3.size()) {
                        O = arrayList3.get(i14);
                    } else {
                        O = null;
                    }
                } else {
                    int S = k0Var.S(i10);
                    int Q = k0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = k0Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof j2) {
                    if (!UserConfig.getInstance(yiVar.J1).isPremium()) {
                        if (yiVar.f29366f0 != null) {
                            new a1(yiVar.f29366f0, n0Var.getContext(), yiVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    j2 j2Var = (j2) O;
                    d5.a0(yiVar.J1, j2Var.a(), yiVar.n1(), new y2(16, n0Var, j2Var));
                    return;
                }
                return;
            case 10:
                p0 p0Var = (p0) this.f441b;
                v51 G2 = p0Var.f8999d0.G(i10 - 1);
                if (G2 != null) {
                    gg.e0 e0Var = p0Var.Z;
                    if (!e0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = p0.f8994g0;
                        if (i15 == -1) {
                            p0Var.f9000e0 = true;
                            e0Var.h = true;
                            p0Var.f8999d0.N(true);
                            p0Var.T(true);
                            return;
                        }
                        int i17 = p0.f8995h0;
                        if (i15 == -2) {
                            p0Var.f9000e0 = false;
                            e0Var.h = false;
                            p0Var.f8999d0.N(true);
                            p0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                gi.b bVar = (gi.b) this.f441b;
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
            case 12:
                lg.i iVar = (lg.i) this.f441b;
                Runnable runnable = ((lg.a) iVar.E.get(i10)).f12934c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 13:
                zt0 zt0Var = (zt0) this.f441b;
                m0 m0Var2 = (m0) m0.c().get(i10);
                zt0Var.f40155u1.setTypeface(m0Var2.f14424a);
                x0 e7 = x0.e(zt0Var.P1);
                String str2 = m0Var2.f14424a;
                e7.f14558j = str2;
                e7.f14552a.edit().putString("typeface", str2).apply();
                pg.j jVar2 = zt0Var.S0;
                if (jVar2 instanceof v2) {
                    ((v2) jVar2).setTypeface(m0Var2);
                }
                zt0Var.z0(false);
                return;
            case 14:
                i1 i1Var = (i1) this.f441b;
                i1Var.f40029b3.accept(Integer.valueOf(i1Var.f40028a3.b(i10)));
                x0 x0Var = i1Var.f40028a3;
                x0Var.f14554c.put(Integer.valueOf(x0Var.f14555f), Integer.valueOf(x0Var.b(i10)));
                x0Var.e = true;
                return;
            case 15:
                qg.k0.W((qg.k0) this.f441b, view);
                return;
            case 16:
                v0 v0Var = (v0) this.f441b;
                if (view != null) {
                    v0Var.v1(view, true);
                    v0Var.f40871d3 = false;
                    v0Var.v0(0, view.getTop() - ((v0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 17:
                ((ma0) this.f441b).h(view);
                return;
            case 18:
                ((vh.p) this.f441b).h(view);
                return;
            case 19:
                l4 l4Var = (l4) this.f441b;
                bi.d dVar = l4Var.f44210c0;
                HashSet hashSet = l4Var.Z;
                j61 j61Var2 = l4Var.f44212e0;
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
                            ((h1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((h1) view).b(true, true);
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
            case 20:
                z7.x0((z7) this.f441b, i10);
                return;
            case 21:
                k7.P((k7) this.f441b, i10);
                return;
            case 22:
                o7.P((o7) this.f441b, i10);
                return;
            case 23:
                p7.P((p7) this.f441b, i10);
                return;
            default:
                ((nx) this.f441b).i((zh.k) view, false);
                return;
        }
    }
}
