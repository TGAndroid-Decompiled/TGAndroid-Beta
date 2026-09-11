package bi;

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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bx;
import org.telegram.ui.co;
import org.telegram.ui.gy;
import org.telegram.ui.lx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.zt0;
public final class d implements zk0 {
    public final int f2845a;
    public final Object f2846b;

    public d(Object obj, int i10) {
        this.f2845a = i10;
        this.f2846b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.q5 q5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        h51 G;
        long j3;
        switch (this.f2845a) {
            case 0:
                ((lx) this.f2846b).i((u) view, false);
                return;
            case 1:
                ci.t tVar = (ci.t) this.f2846b;
                lr0 lr0Var = tVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = lr0Var.f4848a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (lr0Var.G.C1) {
                        if (lr0Var.c(messageObject)) {
                            lr0Var.g(messageObject);
                            return;
                        } else {
                            lr0Var.e(messageObject);
                            return;
                        }
                    }
                    pb orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = tVar.getContext();
                    int id2 = messageObject.getId();
                    b8 b8Var = tVar.f4831a;
                    d9 a2 = d9.a(tVar.f4835f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33984s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f2875s += i11;
                    orCreateStoryViewer.C(context, id2, b8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((di.y) this.f2846b).f8442c;
                if (callback != null) {
                    callback.run((di.t) di.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                di.z1 z1Var = (di.z1) this.f2846b;
                di.t2 t2Var = z1Var.f8511r;
                Object F = z1Var.f8507c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = t2Var.f8176y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                t2Var.dismiss();
                return;
            case 4:
                di.e2 e2Var = (di.e2) this.f2846b;
                di.t2 t2Var2 = e2Var.f7160s;
                di.d2 d2Var = e2Var.f7155c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f45742f != 4) {
                        ArrayList arrayList = d2Var.f7056s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f7056s.get(i10);
                        }
                        if (document2 == t2Var2.f8169e) {
                            ig.g gVar = t2Var2.E;
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
                        if (document2 == null && (view instanceof di.o1) && (q5Var = ((di.o1) view).f7713c) != null) {
                            document2 = q5Var.f29579e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) t2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.q5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = t2Var2.f8176y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f7053f.get(Long.valueOf(document2.f19875id)), document2, Boolean.FALSE);
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
                di.rb rbVar = (di.rb) this.f2846b;
                qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
                rbVar.l1.setTypeface(j0Var.f44454a);
                qg.s0 e7 = qg.s0.e(rbVar.F1);
                String str = j0Var.f44454a;
                e7.f44573j = str;
                e7.f44566a.edit().putString("typeface", str).apply();
                rg.k kVar2 = rbVar.J0;
                if (kVar2 instanceof rg.x2) {
                    ((rg.x2) kVar2).setTypeface(j0Var);
                }
                rbVar.P0(false);
                return;
            case 6:
                ei.i.x0((ei.i) this.f2846b, i10);
                return;
            case 7:
                v51 v51Var = ((ei.h) this.f2846b).f9130b0;
                if (v51Var != null) {
                    v51Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                fi.m.A0((fi.m) this.f2846b, i10);
                return;
            case 9:
                hg.i0 i0Var = (hg.i0) this.f2846b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        gy gyVar = i0Var.U;
                        if (gyVar != null) {
                            gyVar.f36810a.N4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                gy gyVar2 = i0Var.U;
                if (gyVar2 != null) {
                    uy uyVar = gyVar2.f36810a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (uyVar.f41295l2) {
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
                    if (AndroidUtilities.isTablet() && uyVar.f41259e0 != null) {
                        int i13 = 0;
                        while (true) {
                            ty[] tyVarArr = uyVar.f41259e0;
                            if (i13 < tyVarArr.length) {
                                bx bxVar = tyVarArr[i13].d;
                                uyVar.f41314p2.dialogId = longValue2;
                                bxVar.f11173s = longValue2;
                                i13++;
                            } else {
                                uyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (uyVar.f41304n2 != null) {
                        if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new co(bundle));
                            return;
                        }
                        return;
                    } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                        uyVar.presentFragment(new co(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                ig.i0 i0Var2 = (ig.i0) this.f2846b;
                ig.f0 f0Var = i0Var2.f12095x;
                vi viVar = i0Var2.f28753b;
                s4.h0 adapter = i0Var2.f12093s.getAdapter();
                ig.g0 g0Var = i0Var2.f12096y;
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
                if (O instanceof ig.a2) {
                    if (!UserConfig.getInstance(viVar.J1).isPremium()) {
                        if (viVar.f31279f0 != null) {
                            new sg.a1(viVar.f31279f0, i0Var2.getContext(), viVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    ig.a2 a2Var = (ig.a2) O;
                    org.telegram.ui.Components.e5.a0(viVar.J1, a2Var.a(), viVar.n1(), new di.m2(16, i0Var2, a2Var));
                    return;
                }
                return;
            case 11:
                ig.k0 k0Var = (ig.k0) this.f2846b;
                h51 G2 = k0Var.f12128d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = ig.k0.f12123g0;
                        if (i15 == -1) {
                            k0Var.f12129e0 = true;
                            a0Var.h = true;
                            k0Var.f12128d0.N(true);
                            k0Var.T(true);
                            return;
                        }
                        int i17 = ig.k0.f12124h0;
                        if (i15 == -2) {
                            k0Var.f12129e0 = false;
                            a0Var.h = false;
                            k0Var.f12128d0.N(true);
                            k0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ii.b bVar = (ii.b) this.f2846b;
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
                ng.i iVar = (ng.i) this.f2846b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).f16721c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                zt0 zt0Var = (zt0) this.f2846b;
                qg.j0 j0Var2 = (qg.j0) qg.j0.c().get(i10);
                zt0Var.f45370u1.setTypeface(j0Var2.f44454a);
                qg.s0 e10 = qg.s0.e(zt0Var.P1);
                String str2 = j0Var2.f44454a;
                e10.f44573j = str2;
                e10.f44566a.edit().putString("typeface", str2).apply();
                rg.k kVar3 = zt0Var.S0;
                if (kVar3 instanceof rg.x2) {
                    ((rg.x2) kVar3).setTypeface(j0Var2);
                }
                zt0Var.z0(false);
                return;
            case 15:
                rg.k1 k1Var = (rg.k1) this.f2846b;
                k1Var.f45269b3.accept(Integer.valueOf(k1Var.f45268a3.b(i10)));
                qg.s0 s0Var = k1Var.f45268a3;
                s0Var.f44568c.put(Integer.valueOf(s0Var.f44570f), Integer.valueOf(s0Var.b(i10)));
                s0Var.f44569e = true;
                return;
            case 16:
                sg.k0.W((sg.k0) this.f2846b, view);
                return;
            case 17:
                sg.u0 u0Var = (sg.u0) this.f2846b;
                if (view != null) {
                    u0Var.v1(view, true);
                    u0Var.f46270d3 = false;
                    u0Var.v0(0, view.getTop() - ((u0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((da0) this.f2846b).h(view);
                return;
            case 19:
                ((xh.n) this.f2846b).h(view);
                return;
            case 20:
                yh.k4 k4Var = (yh.k4) this.f2846b;
                di.d dVar = k4Var.f50383c0;
                HashSet hashSet = k4Var.Z;
                v51 v51Var2 = k4Var.f50385e0;
                if (v51Var2 != null && (G = v51Var2.G(i10 - 1)) != null) {
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
                            ((yh.h1) view).b(false, true);
                            G.f26588e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((yh.h1) view).b(true, true);
                            G.f26588e = true;
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
                zh.v7.x0((zh.v7) this.f2846b, i10);
                return;
            case 22:
                zh.g7.P((zh.g7) this.f2846b, i10);
                return;
            case 23:
                zh.k7.P((zh.k7) this.f2846b, i10);
                return;
            default:
                zh.l7.P((zh.l7) this.f2846b, i10);
                return;
        }
    }
}
