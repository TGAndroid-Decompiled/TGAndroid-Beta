package bg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import jh.ia;
import jh.s9;
import jh.y9;
import jh.z9;
import lh.b7;
import lh.c6;
import lh.i9;
import nh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fy;
import org.telegram.ui.nw;
import org.telegram.ui.qx;
import org.telegram.ui.tn;
import org.telegram.ui.ws0;
import org.telegram.ui.xw;
import org.telegram.ui.yu0;
public final class o implements zk0 {
    public final int f2428a;
    public final Object f2429b;

    public o(Object obj, int i10) {
        this.f2428a = i10;
        this.f2429b = obj;
    }

    @Override
    public final void c(int i10, View view) {
        w41 G;
        long j10;
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        p5 p5Var;
        org.telegram.ui.ActionBar.l lVar;
        Object O;
        switch (this.f2428a) {
            case 0:
                ws0 ws0Var = (ws0) this.f2429b;
                ag.u0 u0Var = (ag.u0) ag.u0.c().get(i10);
                ws0Var.f2248q1.setTypeface(u0Var.f674a);
                ag.h1 e10 = ag.h1.e(ws0Var.L1);
                String str = u0Var.f674a;
                e10.f522j = str;
                e10.f515a.edit().putString("typeface", str).apply();
                k kVar = ws0Var.O0;
                if (kVar instanceof f4) {
                    ((f4) kVar).setTypeface(u0Var);
                }
                ws0Var.z0(false);
                return;
            case 1:
                h2 h2Var = (h2) this.f2429b;
                h2Var.X2.accept(Integer.valueOf(h2Var.W2.b(i10)));
                ag.h1 h1Var = h2Var.W2;
                h1Var.f517c.put(Integer.valueOf(h1Var.f519f), Integer.valueOf(h1Var.b(i10)));
                h1Var.f518e = true;
                return;
            case 2:
                cg.v0.W((cg.v0) this.f2429b, view);
                return;
            case 3:
                cg.h1 h1Var2 = (cg.h1) this.f2429b;
                if (view != null) {
                    h1Var2.w1(view, true);
                    h1Var2.Z2 = false;
                    h1Var2.v0(0, view.getTop() - ((h1Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 4:
                ((z90) this.f2429b).h(view);
                return;
            case 5:
                ((hh.v) this.f2429b).h(view);
                return;
            case 6:
                ih.s3 s3Var = (ih.s3) this.f2429b;
                nh.d dVar = s3Var.X;
                HashSet hashSet = s3Var.V;
                k51 k51Var = s3Var.Z;
                if (k51Var != null && (G = k51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i13 = savedStarGift.msg_id;
                        if (i13 == 0) {
                            j10 = savedStarGift.saved_id;
                        } else {
                            j10 = i13;
                        }
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((ih.y1) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((ih.y1) view).b(true, true);
                        }
                        if (hashSet.size() > 0) {
                            z10 = true;
                        }
                        dVar.setEnabled(z10);
                        dVar.c(hashSet.size(), true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ia.x0((ia) this.f2429b, i10);
                return;
            case 8:
                s9.P((s9) this.f2429b, i10);
                return;
            case 9:
                y9.P((y9) this.f2429b, i10);
                return;
            case 10:
                z9.P((z9) this.f2429b, i10);
                return;
            case 11:
                ((xw) this.f2429b).i((lh.o) view, false);
                return;
            case 12:
                mh.r rVar = (mh.r) this.f2429b;
                fr0 fr0Var = rVar.S;
                org.telegram.ui.ActionBar.o2 o2Var = fr0Var.f17056a;
                if (view instanceof p7) {
                    MessageObject messageObject = ((p7) view).getMessageObject();
                    if (fr0Var.C.f32111y1) {
                        if (fr0Var.c(messageObject)) {
                            fr0Var.g(messageObject);
                            return;
                        } else {
                            fr0Var.e(messageObject);
                            return;
                        }
                    }
                    i9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    c6 c6Var = rVar.f17041a;
                    b7 a2 = b7.a(rVar.f17045f);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f36084o1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f15408s += i11;
                    orCreateStoryViewer.C(context, id2, c6Var, a2);
                    return;
                }
                return;
            case 13:
                Utilities.Callback callback = ((nh.y) this.f2429b).f18847c;
                if (callback != null) {
                    callback.run((nh.t) nh.t.a().get(i10));
                    return;
                }
                return;
            case 14:
                nh.t1 t1Var = (nh.t1) this.f2429b;
                nh.k2 k2Var = t1Var.f18584r;
                Object F = t1Var.f18580c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = k2Var.f17999y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                k2Var.dismiss();
                return;
            case 15:
                nh.y1 y1Var = (nh.y1) this.f2429b;
                nh.k2 k2Var2 = y1Var.f18859s;
                nh.x1 x1Var = y1Var.f18854c;
                if (i10 >= 0) {
                    y1Var.d.getClass();
                    if (RecyclerView.U(view).f6436f != 4) {
                        ArrayList arrayList = x1Var.f18819s;
                        ArrayList arrayList2 = x1Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) x1Var.f18819s.get(i10);
                        }
                        if (document2 == k2Var2.f17992e) {
                            sf.h hVar = k2Var2.A;
                            if (hVar != null) {
                                hVar.run();
                            }
                            k2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof nh.m1) && (p5Var = ((nh.m1) view).f18116c) != null) {
                            document2 = p5Var.f31588e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.f3) k2Var2).currentAccount;
                            document2 = p5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = k2Var2.f17999y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(x1Var.f18816f.get(Long.valueOf(document2.f22398id)), document2, Boolean.FALSE);
                            }
                            k2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ja jaVar = (ja) this.f2429b;
                ag.u0 u0Var2 = (ag.u0) ag.u0.c().get(i10);
                jaVar.f18636h1.setTypeface(u0Var2.f674a);
                ag.h1 e11 = ag.h1.e(jaVar.B1);
                String str2 = u0Var2.f674a;
                e11.f522j = str2;
                e11.f515a.edit().putString("typeface", str2).apply();
                k kVar2 = jaVar.F0;
                if (kVar2 instanceof f4) {
                    ((f4) kVar2).setTypeface(u0Var2);
                }
                jaVar.P0(false);
                return;
            case 17:
                oh.g.x0((oh.g) this.f2429b, i10);
                return;
            case 18:
                k51 k51Var2 = ((oh.f) this.f2429b).X;
                if (k51Var2 != null) {
                    k51Var2.G(i10 - 1);
                    return;
                }
                return;
            case 19:
                ph.j.A0((ph.j) this.f2429b, i10);
                return;
            case 20:
                rf.a0 a0Var = (rf.a0) this.f2429b;
                if (view instanceof l4) {
                    l4 l4Var = (l4) view;
                    if (l4Var.A) {
                        qx qxVar = a0Var.Q;
                        if (qxVar != null) {
                            qxVar.f41793a.N4(l4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                qx qxVar2 = a0Var.Q;
                if (qxVar2 != null) {
                    fy fyVar = qxVar2.f41793a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (fyVar.f38295h2) {
                        if (fyVar.h5(longValue2)) {
                            if (!fyVar.E2.isEmpty()) {
                                fyVar.P3(longValue2, fyVar.i3(longValue2, null));
                                fyVar.a5();
                                lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                                lVar.h(true);
                                return;
                            }
                            fyVar.O3(longValue2, 0L, true, null);
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
                    fyVar.J3();
                    if (AndroidUtilities.isTablet() && fyVar.f38256a0 != null) {
                        int i14 = 0;
                        while (true) {
                            ey[] eyVarArr = fyVar.f38256a0;
                            if (i14 < eyVarArr.length) {
                                nw nwVar = eyVarArr[i14].d;
                                fyVar.f38314l2.dialogId = longValue2;
                                nwVar.f47299s = longValue2;
                                i14++;
                            } else {
                                fyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (fyVar.f38305j2 != null) {
                        if (fyVar.getMessagesController().checkCanOpenChat(bundle, fyVar)) {
                            fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            fyVar.presentFragment(new tn(bundle));
                            return;
                        }
                        return;
                    } else if (fyVar.getMessagesController().checkCanOpenChat(bundle, fyVar)) {
                        fyVar.presentFragment(new tn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 21:
                sf.d0 d0Var = (sf.d0) this.f2429b;
                sf.a0 a0Var2 = d0Var.f47778x;
                ni niVar = d0Var.f28403b;
                f2.p0 adapter = d0Var.f47776s.getAdapter();
                sf.b0 b0Var = d0Var.f47779y;
                if (adapter == b0Var) {
                    ArrayList arrayList3 = b0Var.d;
                    int i15 = i10 - 1;
                    if (i15 >= 0 && i15 < arrayList3.size()) {
                        O = arrayList3.get(i15);
                    } else {
                        O = null;
                    }
                } else {
                    int S = a0Var2.S(i10);
                    int Q = a0Var2.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = a0Var2.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof sf.r1) {
                    if (!UserConfig.getInstance(niVar.F1).isPremium()) {
                        if (niVar.f30990b0 != null) {
                            new cg.p1(niVar.f30990b0, d0Var.getContext(), niVar.F1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    sf.r1 r1Var = (sf.r1) O;
                    c5.a0(niVar.F1, r1Var.a(), niVar.n1(), new yu0(18, d0Var, r1Var));
                    return;
                }
                return;
            case 22:
                sf.f0 f0Var = (sf.f0) this.f2429b;
                w41 G2 = f0Var.Z.G(i10 - 1);
                if (G2 != null) {
                    sf.w wVar = f0Var.V;
                    if (!wVar.h(G2)) {
                        int i16 = G2.d;
                        int i17 = sf.f0.f47799c0;
                        if (i16 == -1) {
                            f0Var.f47801a0 = true;
                            wVar.h = true;
                            f0Var.Z.N(true);
                            f0Var.T(true);
                            return;
                        }
                        int i18 = sf.f0.f47800d0;
                        if (i16 == -2) {
                            f0Var.f47801a0 = false;
                            wVar.h = false;
                            f0Var.Z.N(true);
                            f0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 23:
                sh.a aVar = (sh.a) this.f2429b;
                int i19 = aVar.T.G(i10 - 1).d;
                if (i19 == 151) {
                    aVar.Q(false);
                    return;
                } else if (i19 == 150) {
                    aVar.Q(true);
                    return;
                } else {
                    return;
                }
            default:
                xf.j jVar = (xf.j) this.f2429b;
                Runnable runnable = ((xf.a) jVar.A.get(i10)).f50118c;
                if (runnable != null) {
                    runnable.run();
                    jVar.c(false);
                    return;
                }
                return;
        }
    }
}
