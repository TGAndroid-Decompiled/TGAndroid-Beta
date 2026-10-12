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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.z61;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.fx;
import org.telegram.ui.hu0;
import org.telegram.ui.ky;
import org.telegram.ui.px;
import org.telegram.ui.xy;
import org.telegram.ui.yy;
public final class d implements am0 {
    public final int f2936a;
    public final Object f2937b;

    public d(Object obj, int i10) {
        this.f2936a = i10;
        this.f2937b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        org.telegram.ui.Components.s5 s5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        l61 G;
        long j10;
        switch (this.f2936a) {
            case 0:
                ((px) this.f2937b).i((u) view, false);
                return;
            case 1:
                ci.t tVar = (ci.t) this.f2937b;
                ms0 ms0Var = tVar.W;
                org.telegram.ui.ActionBar.m2 m2Var = ms0Var.f4796a;
                if (view instanceof org.telegram.ui.Cells.t7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                    if (ms0Var.G.C1) {
                        if (ms0Var.c(messageObject)) {
                            ms0Var.g(messageObject);
                            return;
                        } else {
                            ms0Var.e(messageObject);
                            return;
                        }
                    }
                    sb orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
                    Context context = tVar.getContext();
                    int id2 = messageObject.getId();
                    f8 f8Var = tVar.f4780a;
                    g9 a2 = g9.a(tVar.f4783f);
                    if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f32656s1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f3087s += i11;
                    orCreateStoryViewer.C(context, id2, f8Var, a2);
                    return;
                }
                return;
            case 2:
                Utilities.Callback callback = ((di.y) this.f2937b).f8114c;
                if (callback != null) {
                    callback.run((di.t) di.t.a().get(i10));
                    return;
                }
                return;
            case 3:
                di.y1 y1Var = (di.y1) this.f2937b;
                di.r2 r2Var = y1Var.f8123r;
                Object F = y1Var.f8120c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = r2Var.f7696y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                r2Var.dismiss();
                return;
            case 4:
                di.d2 d2Var = (di.d2) this.f2937b;
                di.r2 r2Var2 = d2Var.f6785s;
                di.c2 c2Var = d2Var.f6781c;
                if (i10 >= 0) {
                    d2Var.d.getClass();
                    if (RecyclerView.U(view).f44841f != 4) {
                        ArrayList arrayList = c2Var.f6697s;
                        ArrayList arrayList2 = c2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) c2Var.f6697s.get(i10);
                        }
                        if (document2 == r2Var2.e) {
                            ig.g gVar = r2Var2.E;
                            if (gVar != null) {
                                gVar.run();
                            }
                            r2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof di.n1) && (s5Var = ((di.n1) view).f7444c) != null) {
                            document2 = s5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.e3) r2Var2).currentAccount;
                            document2 = org.telegram.ui.Components.s5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = r2Var2.f7696y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(c2Var.f6694f.get(Long.valueOf(document2.f19222id)), document2, Boolean.FALSE);
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
                di.mb mbVar = (di.mb) this.f2937b;
                qg.j0 j0Var = (qg.j0) qg.j0.c().get(i10);
                mbVar.l1.setTypeface(j0Var.f43460a);
                qg.s0 e = qg.s0.e(mbVar.F1);
                String str = j0Var.f43460a;
                e.f43571j = str;
                e.f43565a.edit().putString("typeface", str).apply();
                rg.j jVar = mbVar.J0;
                if (jVar instanceof rg.x2) {
                    ((rg.x2) jVar).setTypeface(j0Var);
                }
                mbVar.O0(false);
                return;
            case 6:
                ei.i.y0((ei.i) this.f2937b, i10);
                return;
            case 7:
                z61 z61Var = ((ei.h) this.f2937b).f8795b0;
                if (z61Var != null) {
                    z61Var.G(i10 - 1);
                    return;
                }
                return;
            case 8:
                fi.l.B0((fi.l) this.f2937b, i10);
                return;
            case 9:
                hg.h0 h0Var = (hg.h0) this.f2937b;
                if (view instanceof org.telegram.ui.Cells.n4) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (n4Var.E) {
                        ky kyVar = h0Var.U;
                        if (kyVar != null) {
                            kyVar.f37777a.K4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                ky kyVar2 = h0Var.U;
                if (kyVar2 != null) {
                    yy yyVar = kyVar2.f37777a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (yyVar.f42362l2) {
                        if (yyVar.e5(longValue2)) {
                            if (!yyVar.I2.isEmpty()) {
                                yyVar.M3(longValue2, yyVar.f3(longValue2, null));
                                yyVar.X4();
                                kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            yyVar.L3(longValue2, 0L, true, null);
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
                    yyVar.G3();
                    if (AndroidUtilities.isTablet() && yyVar.f42325e0 != null) {
                        int i13 = 0;
                        while (true) {
                            xy[] xyVarArr = yyVar.f42325e0;
                            if (i13 < xyVarArr.length) {
                                fx fxVar = xyVarArr[i13].d;
                                yyVar.f42381p2.dialogId = longValue2;
                                fxVar.f10665s = longValue2;
                                i13++;
                            } else {
                                yyVar.d5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (yyVar.f42371n2 != null) {
                        if (yyVar.getMessagesController().checkCanOpenChat(bundle, yyVar)) {
                            yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            yyVar.presentFragment(new fo(bundle));
                            return;
                        }
                        return;
                    } else if (yyVar.getMessagesController().checkCanOpenChat(bundle, yyVar)) {
                        yyVar.presentFragment(new fo(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                ig.i0 i0Var = (ig.i0) this.f2937b;
                ig.f0 f0Var = i0Var.f11527x;
                vi viVar = i0Var.f27671b;
                s4.g0 adapter = i0Var.f11525s.getAdapter();
                ig.g0 g0Var = i0Var.f11528y;
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
                    if (!UserConfig.getInstance(viVar.M1).isPremium()) {
                        if (viVar.f30001f0 != null) {
                            new sg.y0(viVar.f30001f0, i0Var.getContext(), viVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    ig.a2 a2Var = (ig.a2) O;
                    org.telegram.ui.Components.g5.Z(viVar.M1, a2Var.a(), viVar.p1(), new v2(17, i0Var, a2Var));
                    return;
                }
                return;
            case 11:
                ig.k0 k0Var = (ig.k0) this.f2937b;
                l61 G2 = k0Var.f11557d0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = k0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i15 = G2.d;
                        int i16 = ig.k0.f11552g0;
                        if (i15 == -1) {
                            k0Var.f11558e0 = true;
                            a0Var.h = true;
                            k0Var.f11557d0.N(true);
                            k0Var.U(true);
                            return;
                        }
                        int i17 = ig.k0.f11553h0;
                        if (i15 == -2) {
                            k0Var.f11558e0 = false;
                            a0Var.h = false;
                            k0Var.f11557d0.N(true);
                            k0Var.U(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ii.b bVar = (ii.b) this.f2937b;
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
                ng.i iVar = (ng.i) this.f2937b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).f16354c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 14:
                hu0 hu0Var = (hu0) this.f2937b;
                qg.j0 j0Var2 = (qg.j0) qg.j0.c().get(i10);
                hu0Var.f44432u1.setTypeface(j0Var2.f43460a);
                qg.s0 e7 = qg.s0.e(hu0Var.P1);
                String str2 = j0Var2.f43460a;
                e7.f43571j = str2;
                e7.f43565a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = hu0Var.S0;
                if (jVar2 instanceof rg.x2) {
                    ((rg.x2) jVar2).setTypeface(j0Var2);
                }
                hu0Var.A0(false);
                return;
            case 15:
                rg.k1 k1Var = (rg.k1) this.f2937b;
                k1Var.Z2.accept(Integer.valueOf(k1Var.Y2.b(i10)));
                qg.s0 s0Var = k1Var.Y2;
                s0Var.f43567c.put(Integer.valueOf(s0Var.f43568f), Integer.valueOf(s0Var.b(i10)));
                s0Var.e = true;
                return;
            case 16:
                sg.j0.X((sg.j0) this.f2937b, view);
                return;
            case 17:
                sg.t0 t0Var = (sg.t0) this.f2937b;
                if (view != null) {
                    t0Var.x1(view, true);
                    t0Var.f45320b3 = false;
                    t0Var.v0(0, view.getTop() - ((t0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 18:
                ((db0) this.f2937b).h(view);
                return;
            case 19:
                ((xh.l) this.f2937b).h(view);
                return;
            case 20:
                yh.k4 k4Var = (yh.k4) this.f2937b;
                di.d dVar = k4Var.f48946c0;
                HashSet hashSet = k4Var.Z;
                z61 z61Var2 = k4Var.f48948e0;
                if (z61Var2 != null && (G = z61Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i19 = savedStarGift.msg_id;
                        if (i19 == 0) {
                            j10 = savedStarGift.saved_id;
                        } else {
                            j10 = i19;
                        }
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((yh.h1) view).b(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((yh.h1) view).b(true, true);
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
                zh.p7.y0((zh.p7) this.f2937b, i10);
                return;
            case 22:
                zh.a7.Q((zh.a7) this.f2937b, i10);
                return;
            case 23:
                zh.e7.Q((zh.e7) this.f2937b, i10);
                return;
            default:
                zh.f7.Q((zh.f7) this.f2937b, i10);
                return;
        }
    }
}
