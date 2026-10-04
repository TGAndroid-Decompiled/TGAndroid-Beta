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
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
import org.telegram.ui.jx;
import org.telegram.ui.ty;
import org.telegram.ui.uy;
import org.telegram.ui.vt0;
import org.telegram.ui.yn;
import org.telegram.ui.zw;
public final class g implements ml0 {
    public final int f959a;
    public final Object f960b;

    public g(Object obj, int i10) {
        this.f959a = i10;
        this.f960b = obj;
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
        g61 G;
        long j3;
        switch (this.f959a) {
            case 0:
                ((jx) this.f960b).i((a0) view, false);
                return;
            case 1:
                bi.u uVar = (bi.u) this.f960b;
                ds0 ds0Var = uVar.W;
                org.telegram.ui.ActionBar.n2 n2Var = ds0Var.f3890a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (ds0Var.G.C1) {
                        if (ds0Var.c(messageObject)) {
                            ds0Var.g(messageObject);
                            return;
                        } else {
                            ds0Var.e(messageObject);
                            return;
                        }
                    }
                    jc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = uVar.getContext();
                    int id2 = messageObject.getId();
                    u8 u8Var = uVar.f3873a;
                    u9 a2 = u9.a(uVar.f3877f);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f34330s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f1728s += i11;
                    orCreateStoryViewer.C(context, id2, u8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((ci.y) this.f960b).f6325c;
                if (callback != null) {
                    callback.run((ci.t) ci.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                ci.z1 z1Var = (ci.z1) this.f960b;
                ci.s2 s2Var = z1Var.f6365r;
                Object F = z1Var.f6361c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = s2Var.f5899y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                s2Var.dismiss();
                return;
            case 4:
                ci.e2 e2Var = (ci.e2) this.f960b;
                ci.s2 s2Var2 = e2Var.f4979s;
                ci.d2 d2Var = e2Var.f4974c;
                if (i10 >= 0) {
                    e2Var.d.getClass();
                    if (RecyclerView.U(view).f46528f != 4) {
                        ArrayList arrayList = d2Var.f4899s;
                        ArrayList arrayList2 = d2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) d2Var.f4899s.get(i10);
                        }
                        if (document2 == s2Var2.f5892e) {
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
                        if (document2 == null && (view instanceof ci.o1) && (q5Var = ((ci.o1) view).f5642c) != null) {
                            document2 = q5Var.f29904e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) s2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.q5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = s2Var2.f5899y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(d2Var.f4896f.get(Long.valueOf(document2.f20044id)), document2, Boolean.FALSE);
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
                ci.mb mbVar = (ci.mb) this.f960b;
                pg.k0 k0Var = (pg.k0) pg.k0.c().get(i10);
                mbVar.l1.setTypeface(k0Var.f44514a);
                pg.u0 e7 = pg.u0.e(mbVar.F1);
                String str = k0Var.f44514a;
                e7.f44647j = str;
                e7.f44640a.edit().putString("typeface", str).apply();
                qg.j jVar = mbVar.J0;
                if (jVar instanceof qg.v2) {
                    ((qg.v2) jVar).setTypeface(k0Var);
                }
                mbVar.P0(false);
                return;
            case 6:
                di.k.C0((di.k) this.f960b, i10);
                return;
            case 7:
                u61 u61Var = ((di.j) this.f960b).f8377b0;
                if (u61Var != null) {
                    u61Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                ei.m.F0((ei.m) this.f960b, i10);
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) this.f960b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        fy fyVar = i0Var.U;
                        if (fyVar != null) {
                            fyVar.f36428a.W4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                fy fyVar2 = i0Var.U;
                if (fyVar2 != null) {
                    uy uyVar = fyVar2.f36428a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (uyVar.f41429l2) {
                        if (uyVar.q5(longValue2)) {
                            if (!uyVar.I2.isEmpty()) {
                                uyVar.Y3(longValue2, uyVar.s3(longValue2, null));
                                uyVar.j5();
                                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            uyVar.X3(longValue2, 0L, true, null);
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
                    uyVar.S3();
                    if (AndroidUtilities.isTablet() && uyVar.f41393e0 != null) {
                        int i13 = 0;
                        while (true) {
                            ty[] tyVarArr = uyVar.f41393e0;
                            if (i13 < tyVarArr.length) {
                                zw zwVar = tyVarArr[i13].d;
                                uyVar.f41448p2.dialogId = longValue2;
                                zwVar.f10712s = longValue2;
                                i13++;
                            } else {
                                uyVar.p5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (uyVar.f41438n2 != null) {
                        if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                            uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            uyVar.presentFragment(new yn(bundle));
                            return;
                        }
                        return;
                    } else if (uyVar.getMessagesController().checkCanOpenChat(bundle, uyVar)) {
                        uyVar.presentFragment(new yn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                hg.i0 i0Var2 = (hg.i0) this.f960b;
                hg.f0 f0Var = i0Var2.f11218x;
                xi xiVar = i0Var2.f29643b;
                s4.h0 adapter = i0Var2.f11216s.getAdapter();
                hg.g0 g0Var = i0Var2.f11219y;
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
                    if (!UserConfig.getInstance(xiVar.J1).isPremium()) {
                        if (xiVar.f32813f0 != null) {
                            new rg.y0(xiVar.f32813f0, i0Var2.getContext(), xiVar.J1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    hg.a2 a2Var = (hg.a2) O;
                    org.telegram.ui.Components.e5.a0(xiVar.J1, a2Var.a(), xiVar.l1(), new g3(17, i0Var2, a2Var));
                    return;
                }
                return;
            case 11:
                hg.l0 l0Var = (hg.l0) this.f960b;
                g61 G2 = l0Var.f11257d0.G(i10 - 1);
                if (G2 != null) {
                    hg.a0 a0Var = l0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = hg.l0.f11252g0;
                        if (i15 == -1) {
                            l0Var.f11258e0 = true;
                            a0Var.h = true;
                            l0Var.f11257d0.N(true);
                            l0Var.R(true);
                            return;
                        }
                        int i17 = hg.l0.f11253h0;
                        if (i15 == -2) {
                            l0Var.f11258e0 = false;
                            a0Var.h = false;
                            l0Var.f11257d0.N(true);
                            l0Var.R(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                hi.b bVar = (hi.b) this.f960b;
                int i18 = bVar.X.G(i10 - 1).d;
                if (i18 == 151) {
                    bVar.O(false);
                    return;
                } else if (i18 == 150) {
                    bVar.O(true);
                    return;
                } else {
                    return;
                }
            case 13:
                mg.i iVar = (mg.i) this.f960b;
                Runnable runnable = ((mg.a) iVar.E.get(i10)).f16398c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                vt0 vt0Var = (vt0) this.f960b;
                pg.k0 k0Var2 = (pg.k0) pg.k0.c().get(i10);
                vt0Var.f45188u1.setTypeface(k0Var2.f44514a);
                pg.u0 e10 = pg.u0.e(vt0Var.P1);
                String str2 = k0Var2.f44514a;
                e10.f44647j = str2;
                e10.f44640a.edit().putString("typeface", str2).apply();
                qg.j jVar2 = vt0Var.S0;
                if (jVar2 instanceof qg.v2) {
                    ((qg.v2) jVar2).setTypeface(k0Var2);
                }
                vt0Var.A0(false);
                return;
            case 15:
                qg.i1 i1Var = (qg.i1) this.f960b;
                i1Var.f45057i3.accept(Integer.valueOf(i1Var.f45056h3.b(i10)));
                pg.u0 u0Var = i1Var.f45056h3;
                u0Var.f44642c.put(Integer.valueOf(u0Var.f44644f), Integer.valueOf(u0Var.b(i10)));
                u0Var.f44643e = true;
                return;
            case 16:
                rg.k0.U((rg.k0) this.f960b, view);
                return;
            case 17:
                rg.t0 t0Var = (rg.t0) this.f960b;
                if (view != null) {
                    t0Var.y1(view, true);
                    t0Var.f46262k3 = false;
                    t0Var.w0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((qa0) this.f960b).h(view);
                return;
            case 19:
                ((wh.n) this.f960b).h(view);
                return;
            case 20:
                xh.m4 m4Var = (xh.m4) this.f960b;
                ci.d dVar = m4Var.f50116c0;
                HashSet hashSet = m4Var.Z;
                u61 u61Var2 = m4Var.f50118e0;
                if (u61Var2 != null && (G = u61Var2.G(i10 - 1)) != null) {
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
                            G.f26663e = false;
                        } else {
                            hashSet.add(Long.valueOf(j3));
                            ((xh.i1) view).b(true, true);
                            G.f26663e = true;
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
                yh.x7.E0((yh.x7) this.f960b, i10);
                return;
            case 22:
                yh.i7.N((yh.i7) this.f960b, i10);
                return;
            case 23:
                yh.m7.N((yh.m7) this.f960b, i10);
                return;
            default:
                yh.n7.N((yh.n7) this.f960b, i10);
                return;
        }
    }
}
