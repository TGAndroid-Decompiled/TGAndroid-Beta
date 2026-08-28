package eh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.r0;
import fh.d4;
import fh.f2;
import gh.ea;
import gh.fa;
import gh.oa;
import gh.y9;
import ih.e7;
import ih.f6;
import ih.m9;
import java.util.ArrayList;
import java.util.HashSet;
import kh.a2;
import kh.b2;
import kh.n2;
import kh.p1;
import kh.w1;
import kh.ya;
import kh.z;
import of.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.dy;
import org.telegram.ui.eb0;
import org.telegram.ui.lw;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import org.telegram.ui.vw;
import org.telegram.ui.xs0;
import pf.b0;
import pf.c0;
import pf.e0;
import pf.g0;
import pf.q1;
import xf.i0;
import xf.s0;
import yf.i1;
import yf.v2;
import zf.j0;
import zf.x0;
public final class j implements mk0 {
    public final int f5201a;
    public final Object f5202b;

    public j(Object obj, int i9) {
        this.f5201a = i9;
        this.f5202b = obj;
    }

    @Override
    public final void a(int i9, View view) {
        l41 G;
        long j10;
        int i10;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i11;
        k5 k5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.f5201a) {
            case 0:
                ((l90) this.f5202b).h(view);
                return;
            case 1:
                ((x) this.f5202b).h(view);
                return;
            case 2:
                d4 d4Var = (d4) this.f5202b;
                kh.d dVar = d4Var.X;
                HashSet hashSet = d4Var.V;
                z41 z41Var = d4Var.Z;
                if (z41Var != null && (G = z41Var.G(i9 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i12 = savedStarGift.msg_id;
                        if (i12 == 0) {
                            j10 = savedStarGift.saved_id;
                        } else {
                            j10 = i12;
                        }
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((f2) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((f2) view).b(true, true);
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
            case 3:
                oa.w0((oa) this.f5202b, i9);
                return;
            case 4:
                y9.O((y9) this.f5202b, i9);
                return;
            case 5:
                ea.O((ea) this.f5202b, i9);
                return;
            case 6:
                fa.O((fa) this.f5202b, i9);
                return;
            case 7:
                ((vw) this.f5202b).i((ih.q) view, false);
                return;
            case 8:
                jh.q qVar = (jh.q) this.f5202b;
                uq0 uq0Var = qVar.S;
                o2 o2Var = uq0Var.f14378a;
                if (view instanceof r7) {
                    MessageObject messageObject = ((r7) view).getMessageObject();
                    if (uq0Var.C.f28178y1) {
                        if (uq0Var.c(messageObject)) {
                            uq0Var.g(messageObject);
                            return;
                        } else {
                            uq0Var.e(messageObject);
                            return;
                        }
                    }
                    m9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = qVar.getContext();
                    int id2 = messageObject.getId();
                    f6 f6Var = qVar.f14363a;
                    e7 a2 = e7.a(qVar.f14367f);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f36019o1) {
                        i10 = AndroidUtilities.dp(68.0f);
                    } else {
                        i10 = 0;
                    }
                    a2.f11374s += i10;
                    orCreateStoryViewer.C(context, id2, f6Var, a2);
                    return;
                }
                return;
            case 9:
                Utilities.Callback callback = ((z) this.f5202b).f16417c;
                if (callback != null) {
                    callback.run((kh.u) kh.u.a().get(i9));
                    return;
                }
                return;
            case 10:
                w1 w1Var = (w1) this.f5202b;
                n2 n2Var = w1Var.f16233r;
                Object F = w1Var.f16229c.F(i9);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = n2Var.f15742y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var.dismiss();
                return;
            case 11:
                b2 b2Var = (b2) this.f5202b;
                n2 n2Var2 = b2Var.f14988s;
                a2 a2Var = b2Var.f14983c;
                if (i9 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f5505f != 4) {
                        ArrayList arrayList = a2Var.f14885s;
                        ArrayList arrayList2 = a2Var.v;
                        if (i9 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) a2Var.f14885s.get(i9);
                        }
                        if (document2 == n2Var2.f15735e) {
                            pf.h hVar = n2Var2.A;
                            if (hVar != null) {
                                hVar.run();
                            }
                            n2Var2.dismiss();
                            return;
                        }
                        if (i9 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i9)).longValue();
                        }
                        if (document2 == null && (view instanceof p1) && (k5Var = ((p1) view).f15818c) != null) {
                            document2 = k5Var.f29946e;
                        }
                        if (document2 == null && longValue != 0) {
                            i11 = ((f3) n2Var2).currentAccount;
                            document2 = k5.f(i11, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = n2Var2.f15742y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(a2Var.f14882f.get(Long.valueOf(document2.f22386id)), document2, Boolean.FALSE);
                            }
                            n2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ya yaVar = (ya) this.f5202b;
                i0 i0Var = (i0) i0.c().get(i9);
                yaVar.f15281h1.setTypeface(i0Var.f49240a);
                s0 e10 = s0.e(yaVar.B1);
                String str = i0Var.f49240a;
                e10.f49365j = str;
                e10.f49358a.edit().putString("typeface", str).apply();
                yf.j jVar = yaVar.F0;
                if (jVar instanceof v2) {
                    ((v2) jVar).setTypeface(i0Var);
                }
                yaVar.P0(false);
                return;
            case 13:
                lh.g.w0((lh.g) this.f5202b, i9);
                return;
            case 14:
                z41 z41Var2 = ((lh.f) this.f5202b).X;
                if (z41Var2 != null) {
                    z41Var2.G(i9 - 1);
                    return;
                }
                return;
            case 15:
                mh.l.z0((mh.l) this.f5202b, i9);
                return;
            case 16:
                f0 f0Var = (f0) this.f5202b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.A) {
                        ox oxVar = f0Var.Q;
                        if (oxVar != null) {
                            oxVar.f41259a.N4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                ox oxVar2 = f0Var.Q;
                if (oxVar2 != null) {
                    dy dyVar = oxVar2.f41259a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (dyVar.f37668h2) {
                        if (dyVar.h5(longValue2)) {
                            if (!dyVar.E2.isEmpty()) {
                                dyVar.P3(longValue2, dyVar.i3(longValue2, null));
                                dyVar.a5();
                                kVar = ((o2) dyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            dyVar.O3(longValue2, 0L, true, null);
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
                    dyVar.J3();
                    if (AndroidUtilities.isTablet() && dyVar.f37629a0 != null) {
                        int i13 = 0;
                        while (true) {
                            cy[] cyVarArr = dyVar.f37629a0;
                            if (i13 < cyVarArr.length) {
                                lw lwVar = cyVarArr[i13].d;
                                dyVar.f37687l2.dialogId = longValue2;
                                lwVar.f19414s = longValue2;
                                i13++;
                            } else {
                                dyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (dyVar.f37678j2 != null) {
                        if (dyVar.getMessagesController().checkCanOpenChat(bundle, dyVar)) {
                            dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            dyVar.presentFragment(new qn(bundle));
                            return;
                        }
                        return;
                    } else if (dyVar.getMessagesController().checkCanOpenChat(bundle, dyVar)) {
                        dyVar.presentFragment(new qn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 17:
                e0 e0Var = (e0) this.f5202b;
                b0 b0Var = e0Var.f45611x;
                ki kiVar = e0Var.f27493b;
                r0 adapter = e0Var.f45609s.getAdapter();
                c0 c0Var = e0Var.f45612y;
                if (adapter == c0Var) {
                    ArrayList arrayList3 = c0Var.d;
                    int i14 = i9 - 1;
                    if (i14 >= 0 && i14 < arrayList3.size()) {
                        O = arrayList3.get(i14);
                    } else {
                        O = null;
                    }
                } else {
                    int S = b0Var.S(i9);
                    int Q = b0Var.Q(i9);
                    if (Q >= 0 && S >= 0) {
                        O = b0Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof q1) {
                    if (!UserConfig.getInstance(kiVar.F1).isPremium()) {
                        if (kiVar.f30099b0 != null) {
                            new x0(kiVar.f30099b0, e0Var.getContext(), kiVar.F1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    q1 q1Var = (q1) O;
                    y4.a0(kiVar.F1, q1Var.a(), kiVar.n1(), new eb0(18, e0Var, q1Var));
                    return;
                }
                return;
            case 18:
                g0 g0Var = (g0) this.f5202b;
                l41 G2 = g0Var.Z.G(i9 - 1);
                if (G2 != null) {
                    pf.x xVar = g0Var.V;
                    if (!xVar.h(G2)) {
                        int i15 = G2.d;
                        int i16 = g0.f45636c0;
                        if (i15 == -1) {
                            g0Var.f45638a0 = true;
                            xVar.h = true;
                            g0Var.Z.N(true);
                            g0Var.S(true);
                            return;
                        }
                        int i17 = g0.f45637d0;
                        if (i15 == -2) {
                            g0Var.f45638a0 = false;
                            xVar.h = false;
                            g0Var.Z.N(true);
                            g0Var.S(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ph.a aVar = (ph.a) this.f5202b;
                int i18 = aVar.T.G(i9 - 1).d;
                if (i18 == 151) {
                    aVar.P(false);
                    return;
                } else if (i18 == 150) {
                    aVar.P(true);
                    return;
                } else {
                    return;
                }
            case 20:
                uf.h hVar2 = (uf.h) this.f5202b;
                Runnable runnable = ((uf.a) hVar2.A.get(i9)).f48198c;
                if (runnable != null) {
                    runnable.run();
                    hVar2.c(false);
                    return;
                }
                return;
            case 21:
                xs0 xs0Var = (xs0) this.f5202b;
                i0 i0Var2 = (i0) i0.c().get(i9);
                xs0Var.f49951q1.setTypeface(i0Var2.f49240a);
                s0 e11 = s0.e(xs0Var.L1);
                String str2 = i0Var2.f49240a;
                e11.f49365j = str2;
                e11.f49358a.edit().putString("typeface", str2).apply();
                yf.j jVar2 = xs0Var.O0;
                if (jVar2 instanceof v2) {
                    ((v2) jVar2).setTypeface(i0Var2);
                }
                xs0Var.z0(false);
                return;
            case 22:
                i1 i1Var = (i1) this.f5202b;
                i1Var.X2.accept(Integer.valueOf(i1Var.W2.b(i9)));
                s0 s0Var = i1Var.W2;
                s0Var.f49360c.put(Integer.valueOf(s0Var.f49362f), Integer.valueOf(s0Var.b(i9)));
                s0Var.f49361e = true;
                return;
            case 23:
                j0.V((j0) this.f5202b, view);
                return;
            default:
                zf.s0 s0Var2 = (zf.s0) this.f5202b;
                if (view != null) {
                    s0Var2.w1(view, true);
                    s0Var2.Z2 = false;
                    s0Var2.v0(0, view.getTop() - ((s0Var2.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
        }
    }
}
