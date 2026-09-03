package dg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import lh.aa;
import lh.ja;
import lh.t9;
import lh.z9;
import nh.c7;
import nh.d6;
import nh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ix;
import org.telegram.ui.mt0;
import org.telegram.ui.py;
import org.telegram.ui.qy;
import org.telegram.ui.yw;
import org.telegram.ui.zn;
import ph.h9;
public final class n implements hl0 {
    public final int f4672a;
    public final Object f4673b;

    public n(Object obj, int i10) {
        this.f4672a = i10;
        this.f4673b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        i51 G;
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
        switch (this.f4672a) {
            case 0:
                mt0 mt0Var = (mt0) this.f4673b;
                cg.t0 t0Var = (cg.t0) cg.t0.c().get(i10);
                mt0Var.f4490r1.setTypeface(t0Var.f2512a);
                cg.f1 e = cg.f1.e(mt0Var.M1);
                String str = t0Var.f2512a;
                e.f2381j = str;
                e.f2375a.edit().putString("typeface", str).apply();
                j jVar = mt0Var.P0;
                if (jVar instanceof b4) {
                    ((b4) jVar).setTypeface(t0Var);
                }
                mt0Var.z0(false);
                return;
            case 1:
                e2 e2Var = (e2) this.f4673b;
                e2Var.Y2.accept(Integer.valueOf(e2Var.X2.b(i10)));
                cg.f1 f1Var = e2Var.X2;
                f1Var.f2377c.put(Integer.valueOf(f1Var.f2378f), Integer.valueOf(f1Var.b(i10)));
                f1Var.e = true;
                return;
            case 2:
                eg.v0.W((eg.v0) this.f4673b, view);
                return;
            case 3:
                eg.g1 g1Var = (eg.g1) this.f4673b;
                if (view != null) {
                    g1Var.v1(view, true);
                    g1Var.f5308a3 = false;
                    g1Var.v0(0, view.getTop() - ((g1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 4:
                ((fa0) this.f4673b).h(view);
                return;
            case 5:
                ((jh.v) this.f4673b).h(view);
                return;
            case 6:
                kh.r3 r3Var = (kh.r3) this.f4673b;
                ph.d dVar = r3Var.Y;
                HashSet hashSet = r3Var.W;
                w51 w51Var = r3Var.f10894a0;
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
                            ((kh.x1) view).b(false, true);
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((kh.x1) view).b(true, true);
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
            case 7:
                ja.x0((ja) this.f4673b, i10);
                return;
            case 8:
                t9.P((t9) this.f4673b, i10);
                return;
            case 9:
                z9.P((z9) this.f4673b, i10);
                return;
            case 10:
                aa.P((aa) this.f4673b, i10);
                return;
            case 11:
                ((ix) this.f4673b).i((nh.p) view, false);
                return;
            case 12:
                oh.r rVar = (oh.r) this.f4673b;
                nr0 nr0Var = rVar.T;
                org.telegram.ui.ActionBar.p2 p2Var = nr0Var.f16595a;
                if (view instanceof q7) {
                    MessageObject messageObject = ((q7) view).getMessageObject();
                    if (nr0Var.D.f31172z1) {
                        if (nr0Var.c(messageObject)) {
                            nr0Var.g(messageObject);
                            return;
                        } else {
                            nr0Var.e(messageObject);
                            return;
                        }
                    }
                    i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    d6 d6Var = rVar.f16581a;
                    c7 a2 = c7.a(rVar.f16584f);
                    if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f32108p1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f15149s += i11;
                    orCreateStoryViewer.C(context, id2, d6Var, a2);
                    return;
                }
                return;
            case 13:
                Utilities.Callback callback = ((ph.u) this.f4673b).f42458c;
                if (callback != null) {
                    callback.run((ph.r) ph.r.a().get(i10));
                    return;
                }
                return;
            case 14:
                ph.h1 h1Var = (ph.h1) this.f4673b;
                ph.y1 y1Var = h1Var.f41739r;
                Object F = h1Var.f41736c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = y1Var.f42648y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                y1Var.dismiss();
                return;
            case 15:
                ph.n1 n1Var = (ph.n1) this.f4673b;
                ph.y1 y1Var2 = n1Var.f42040s;
                ph.m1 m1Var = n1Var.f42036c;
                if (i10 >= 0) {
                    n1Var.d.getClass();
                    if (RecyclerView.U(view).f5777f != 4) {
                        ArrayList arrayList = m1Var.f42001s;
                        ArrayList arrayList2 = m1Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) m1Var.f42001s.get(i10);
                        }
                        if (document2 == y1Var2.e) {
                            uf.g gVar = y1Var2.B;
                            if (gVar != null) {
                                gVar.run();
                            }
                            y1Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ph.c1) && (l5Var = ((ph.c1) view).f41357c) != null) {
                            document2 = l5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.g3) y1Var2).currentAccount;
                            document2 = l5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = y1Var2.f42648y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(m1Var.f41998f.get(Long.valueOf(document2.f19165id)), document2, Boolean.FALSE);
                            }
                            y1Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                h9 h9Var = (h9) this.f4673b;
                cg.t0 t0Var2 = (cg.t0) cg.t0.c().get(i10);
                h9Var.f41381i1.setTypeface(t0Var2.f2512a);
                cg.f1 e6 = cg.f1.e(h9Var.C1);
                String str2 = t0Var2.f2512a;
                e6.f2381j = str2;
                e6.f2375a.edit().putString("typeface", str2).apply();
                j jVar2 = h9Var.G0;
                if (jVar2 instanceof b4) {
                    ((b4) jVar2).setTypeface(t0Var2);
                }
                h9Var.P0(false);
                return;
            case 17:
                qh.g.x0((qh.g) this.f4673b, i10);
                return;
            case 18:
                w51 w51Var2 = ((qh.f) this.f4673b).Y;
                if (w51Var2 != null) {
                    w51Var2.G(i10 - 1);
                    return;
                }
                return;
            case 19:
                rh.j.A0((rh.j) this.f4673b, i10);
                return;
            case 20:
                tf.z zVar = (tf.z) this.f4673b;
                if (view instanceof m4) {
                    m4 m4Var = (m4) view;
                    if (m4Var.B) {
                        cy cyVar = zVar.R;
                        if (cyVar != null) {
                            cyVar.f33255a.N4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                cy cyVar2 = zVar.R;
                if (cyVar2 != null) {
                    qy qyVar = cyVar2.f33255a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (qyVar.f37565i2) {
                        if (qyVar.h5(longValue2)) {
                            if (!qyVar.F2.isEmpty()) {
                                qyVar.P3(longValue2, qyVar.i3(longValue2, null));
                                qyVar.a5();
                                kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
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
                    if (AndroidUtilities.isTablet() && qyVar.f37527b0 != null) {
                        int i14 = 0;
                        while (true) {
                            py[] pyVarArr = qyVar.f37527b0;
                            if (i14 < pyVarArr.length) {
                                yw ywVar = pyVarArr[i14].d;
                                qyVar.f37583m2.dialogId = longValue2;
                                ywVar.f44839s = longValue2;
                                i14++;
                            } else {
                                qyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (qyVar.f37575k2 != null) {
                        if (qyVar.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                            qyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            qyVar.presentFragment(new zn(bundle));
                            return;
                        }
                        return;
                    } else if (qyVar.getMessagesController().checkCanOpenChat(bundle, qyVar)) {
                        qyVar.presentFragment(new zn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 21:
                uf.c0 c0Var = (uf.c0) this.f4673b;
                uf.z zVar2 = c0Var.f45335x;
                li liVar = c0Var.f24282b;
                f2.o0 adapter = c0Var.f45333s.getAdapter();
                uf.a0 a0Var = c0Var.f45336y;
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
                if (O instanceof uf.o1) {
                    if (!UserConfig.getInstance(liVar.G1).isPremium()) {
                        if (liVar.f26685c0 != null) {
                            new eg.o1(liVar.f26685c0, c0Var.getContext(), liVar.G1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    uf.o1 o1Var = (uf.o1) O;
                    z4.a0(liVar.G1, o1Var.a(), liVar.n1(), new ph.s1(16, c0Var, o1Var));
                    return;
                }
                return;
            case 22:
                uf.f0 f0Var = (uf.f0) this.f4673b;
                i51 G2 = f0Var.f45367a0.G(i10 - 1);
                if (G2 != null) {
                    uf.v vVar = f0Var.W;
                    if (!vVar.h(G2)) {
                        int i16 = G2.d;
                        int i17 = uf.f0.f45365d0;
                        if (i16 == -1) {
                            f0Var.f45368b0 = true;
                            vVar.h = true;
                            f0Var.f45367a0.N(true);
                            f0Var.T(true);
                            return;
                        }
                        int i18 = uf.f0.f45366e0;
                        if (i16 == -2) {
                            f0Var.f45368b0 = false;
                            vVar.h = false;
                            f0Var.f45367a0.N(true);
                            f0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 23:
                uh.a aVar = (uh.a) this.f4673b;
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
            default:
                zf.h hVar = (zf.h) this.f4673b;
                Runnable runnable = ((zf.a) hVar.B.get(i10)).f47476c;
                if (runnable != null) {
                    runnable.run();
                    hVar.c(false);
                    return;
                }
                return;
        }
    }
}
