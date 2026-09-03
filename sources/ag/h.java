package ag;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dg.e1;
import dg.s0;
import eg.c2;
import eg.z3;
import f2.p0;
import fg.f1;
import fg.v0;
import java.util.ArrayList;
import java.util.HashSet;
import kh.v;
import lh.s3;
import lh.x1;
import mh.aa;
import mh.ja;
import mh.t9;
import mh.z9;
import oh.c7;
import oh.d6;
import oh.i9;
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
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.hx;
import org.telegram.ui.mt0;
import org.telegram.ui.oy;
import org.telegram.ui.py;
import org.telegram.ui.web.a2;
import org.telegram.ui.xn;
import org.telegram.ui.xw;
import qh.c1;
import qh.e9;
import qh.h1;
import qh.m1;
import qh.n1;
import qh.r;
import qh.u;
import uf.z;
import vf.a0;
import vf.c0;
import vf.e0;
import vf.o1;
public final class h implements il0 {
    public final int f200a;
    public final Object f201b;

    public h(Object obj, int i10) {
        this.f200a = i10;
        this.f201b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        h51 G;
        long j10;
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        int i12;
        l5 l5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        switch (this.f200a) {
            case 0:
                o oVar = (o) this.f201b;
                Runnable runnable = ((a) oVar.B.get(i10)).f189c;
                if (runnable != null) {
                    runnable.run();
                    oVar.c(false);
                    return;
                }
                return;
            case 1:
                mt0 mt0Var = (mt0) this.f201b;
                s0 s0Var = (s0) s0.c().get(i10);
                mt0Var.f5127r1.setTypeface(s0Var.f4665a);
                e1 e6 = e1.e(mt0Var.M1);
                String str = s0Var.f4665a;
                e6.f4521j = str;
                e6.f4514a.edit().putString("typeface", str).apply();
                eg.j jVar = mt0Var.P0;
                if (jVar instanceof z3) {
                    ((z3) jVar).setTypeface(s0Var);
                }
                mt0Var.z0(false);
                return;
            case 2:
                c2 c2Var = (c2) this.f201b;
                c2Var.Y2.accept(Integer.valueOf(c2Var.X2.b(i10)));
                e1 e1Var = c2Var.X2;
                e1Var.f4516c.put(Integer.valueOf(e1Var.f4518f), Integer.valueOf(e1Var.b(i10)));
                e1Var.f4517e = true;
                return;
            case 3:
                v0.W((v0) this.f201b, view);
                return;
            case 4:
                f1 f1Var = (f1) this.f201b;
                if (view != null) {
                    f1Var.v1(view, true);
                    f1Var.f6339a3 = false;
                    f1Var.v0(0, view.getTop() - ((f1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 5:
                ((ga0) this.f201b).h(view);
                return;
            case 6:
                ((v) this.f201b).h(view);
                return;
            case 7:
                s3 s3Var = (s3) this.f201b;
                qh.d dVar = s3Var.Y;
                HashSet hashSet = s3Var.W;
                w51 w51Var = s3Var.f12964a0;
                if (w51Var != null && (G = w51Var.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i13 = savedStarGift.msg_id;
                        if (i13 == 0) {
                            j10 = savedStarGift.saved_id;
                        } else {
                            j10 = i13;
                        }
                        boolean z4 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((x1) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((x1) view).b(true, true);
                        }
                        if (hashSet.size() > 0) {
                            z4 = true;
                        }
                        dVar.setEnabled(z4);
                        dVar.c(hashSet.size(), true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ja.x0((ja) this.f201b, i10);
                return;
            case 9:
                t9.P((t9) this.f201b, i10);
                return;
            case 10:
                z9.P((z9) this.f201b, i10);
                return;
            case 11:
                aa.P((aa) this.f201b, i10);
                return;
            case 12:
                ((hx) this.f201b).i((oh.o) view, false);
                return;
            case 13:
                ph.l lVar = (ph.l) this.f201b;
                nr0 nr0Var = lVar.T;
                p2 p2Var = nr0Var.f44437a;
                if (view instanceof r7) {
                    MessageObject messageObject = ((r7) view).getMessageObject();
                    if (nr0Var.D.f33666z1) {
                        if (nr0Var.c(messageObject)) {
                            nr0Var.g(messageObject);
                            return;
                        } else {
                            nr0Var.e(messageObject);
                            return;
                        }
                    }
                    i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                    Context context = lVar.getContext();
                    int id2 = messageObject.getId();
                    d6 d6Var = lVar.f44422a;
                    c7 a2 = c7.a(lVar.f44426f);
                    if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f34667p1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f16950s += i11;
                    orCreateStoryViewer.C(context, id2, d6Var, a2);
                    return;
                }
                return;
            case 14:
                Utilities.Callback callback = ((u) this.f201b).f46151c;
                if (callback != null) {
                    callback.run((r) r.a().get(i10));
                    return;
                }
                return;
            case 15:
                h1 h1Var = (h1) this.f201b;
                qh.x1 x1Var = h1Var.f45388r;
                Object F = h1Var.f45384c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = x1Var.f46307y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                x1Var.dismiss();
                return;
            case 16:
                n1 n1Var = (n1) this.f201b;
                qh.x1 x1Var2 = n1Var.f45798s;
                m1 m1Var = n1Var.f45793c;
                if (i10 >= 0) {
                    n1Var.d.getClass();
                    if (RecyclerView.U(view).f5879f != 4) {
                        ArrayList arrayList = m1Var.f45737s;
                        ArrayList arrayList2 = m1Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) m1Var.f45737s.get(i10);
                        }
                        if (document2 == x1Var2.f46300e) {
                            vf.g gVar = x1Var2.B;
                            if (gVar != null) {
                                gVar.run();
                            }
                            x1Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof c1) && (l5Var = ((c1) view).f45141c) != null) {
                            document2 = l5Var.f28632e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((h3) x1Var2).currentAccount;
                            document2 = l5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = x1Var2.f46307y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(m1Var.f45734f.get(Long.valueOf(document2.f20851id)), document2, Boolean.FALSE);
                            }
                            x1Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                e9 e9Var = (e9) this.f201b;
                s0 s0Var2 = (s0) s0.c().get(i10);
                e9Var.f44937i1.setTypeface(s0Var2.f4665a);
                e1 e10 = e1.e(e9Var.C1);
                String str2 = s0Var2.f4665a;
                e10.f4521j = str2;
                e10.f4514a.edit().putString("typeface", str2).apply();
                eg.j jVar2 = e9Var.G0;
                if (jVar2 instanceof z3) {
                    ((z3) jVar2).setTypeface(s0Var2);
                }
                e9Var.P0(false);
                return;
            case 18:
                rh.g.x0((rh.g) this.f201b, i10);
                return;
            case 19:
                w51 w51Var2 = ((rh.f) this.f201b).Y;
                if (w51Var2 != null) {
                    w51Var2.G(i10 - 1);
                    return;
                }
                return;
            case 20:
                sh.j.A0((sh.j) this.f201b, i10);
                return;
            case 21:
                z zVar = (z) this.f201b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.B) {
                        ay ayVar = zVar.R;
                        if (ayVar != null) {
                            ayVar.f35273a.N4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                ay ayVar2 = zVar.R;
                if (ayVar2 != null) {
                    py pyVar = ayVar2.f35273a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (pyVar.f40194i2) {
                        if (pyVar.h5(longValue2)) {
                            if (!pyVar.F2.isEmpty()) {
                                pyVar.P3(longValue2, pyVar.i3(longValue2, null));
                                pyVar.a5();
                                kVar = ((p2) pyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            pyVar.O3(longValue2, 0L, true, null);
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
                    pyVar.J3();
                    if (AndroidUtilities.isTablet() && pyVar.f40155b0 != null) {
                        int i14 = 0;
                        while (true) {
                            oy[] oyVarArr = pyVar.f40155b0;
                            if (i14 < oyVarArr.length) {
                                xw xwVar = oyVarArr[i14].d;
                                pyVar.f40212m2.dialogId = longValue2;
                                xwVar.f48649s = longValue2;
                                i14++;
                            } else {
                                pyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (pyVar.f40204k2 != null) {
                        if (pyVar.getMessagesController().checkCanOpenChat(bundle, pyVar)) {
                            pyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            pyVar.presentFragment(new xn(bundle));
                            return;
                        }
                        return;
                    } else if (pyVar.getMessagesController().checkCanOpenChat(bundle, pyVar)) {
                        pyVar.presentFragment(new xn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                c0 c0Var = (c0) this.f201b;
                vf.z zVar2 = c0Var.f49048x;
                mi miVar = c0Var.f26590b;
                p0 adapter = c0Var.f49046s.getAdapter();
                a0 a0Var = c0Var.f49049y;
                if (adapter == a0Var) {
                    ArrayList arrayList3 = a0Var.d;
                    int i15 = i10 - 1;
                    if (i15 >= 0 && i15 < arrayList3.size()) {
                        O = arrayList3.get(i15);
                    } else {
                        O = null;
                    }
                } else {
                    int S = zVar2.S(i10);
                    int Q = zVar2.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = zVar2.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof o1) {
                    if (!UserConfig.getInstance(miVar.G1).isPremium()) {
                        if (miVar.f29058c0 != null) {
                            new fg.n1(miVar.f29058c0, c0Var.getContext(), miVar.G1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    o1 o1Var = (o1) O;
                    z4.a0(miVar.G1, o1Var.a(), miVar.n1(), new a2(17, c0Var, o1Var));
                    return;
                }
                return;
            case 23:
                e0 e0Var = (e0) this.f201b;
                h51 G2 = e0Var.f49071a0.G(i10 - 1);
                if (G2 != null) {
                    vf.v vVar = e0Var.W;
                    if (!vVar.h(G2)) {
                        int i16 = G2.d;
                        int i17 = e0.f49069d0;
                        if (i16 == -1) {
                            e0Var.f49072b0 = true;
                            vVar.h = true;
                            e0Var.f49071a0.N(true);
                            e0Var.T(true);
                            return;
                        }
                        int i18 = e0.f49070e0;
                        if (i16 == -2) {
                            e0Var.f49072b0 = false;
                            vVar.h = false;
                            e0Var.f49071a0.N(true);
                            e0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                vh.a aVar = (vh.a) this.f201b;
                int i19 = aVar.U.G(i10 - 1).d;
                if (i19 == 151) {
                    aVar.Q(false);
                    return;
                } else if (i19 == 150) {
                    aVar.Q(true);
                    return;
                } else {
                    return;
                }
        }
    }
}
