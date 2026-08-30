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
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ft0;
import org.telegram.ui.gx;
import org.telegram.ui.ny;
import org.telegram.ui.oy;
import org.telegram.ui.ww;
import org.telegram.ui.xn;
import org.telegram.ui.zx;
import ph.h9;
public final class n implements il0 {
    public final int f4666a;
    public final Object f4667b;

    public n(Object obj, int i10) {
        this.f4666a = i10;
        this.f4667b = obj;
    }

    @Override
    public final void f(int i10, View view) {
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
        switch (this.f4666a) {
            case 0:
                ft0 ft0Var = (ft0) this.f4667b;
                cg.t0 t0Var = (cg.t0) cg.t0.c().get(i10);
                ft0Var.f4484r1.setTypeface(t0Var.f2529a);
                cg.f1 e = cg.f1.e(ft0Var.M1);
                String str = t0Var.f2529a;
                e.f2398j = str;
                e.f2392a.edit().putString("typeface", str).apply();
                j jVar = ft0Var.P0;
                if (jVar instanceof b4) {
                    ((b4) jVar).setTypeface(t0Var);
                }
                ft0Var.z0(false);
                return;
            case 1:
                e2 e2Var = (e2) this.f4667b;
                e2Var.Y2.accept(Integer.valueOf(e2Var.X2.b(i10)));
                cg.f1 f1Var = e2Var.X2;
                f1Var.f2394c.put(Integer.valueOf(f1Var.f2395f), Integer.valueOf(f1Var.b(i10)));
                f1Var.e = true;
                return;
            case 2:
                eg.v0.W((eg.v0) this.f4667b, view);
                return;
            case 3:
                eg.g1 g1Var = (eg.g1) this.f4667b;
                if (view != null) {
                    g1Var.w1(view, true);
                    g1Var.f5319a3 = false;
                    g1Var.v0(0, view.getTop() - ((g1Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 4:
                ((ea0) this.f4667b).h(view);
                return;
            case 5:
                ((jh.v) this.f4667b).h(view);
                return;
            case 6:
                kh.s3 s3Var = (kh.s3) this.f4667b;
                ph.d dVar = s3Var.Y;
                HashSet hashSet = s3Var.W;
                w51 w51Var = s3Var.f10815a0;
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
                ja.x0((ja) this.f4667b, i10);
                return;
            case 8:
                t9.P((t9) this.f4667b, i10);
                return;
            case 9:
                z9.P((z9) this.f4667b, i10);
                return;
            case 10:
                aa.P((aa) this.f4667b, i10);
                return;
            case 11:
                ((gx) this.f4667b).i((nh.p) view, false);
                return;
            case 12:
                oh.r rVar = (oh.r) this.f4667b;
                nr0 nr0Var = rVar.T;
                org.telegram.ui.ActionBar.p2 p2Var = nr0Var.f16615a;
                if (view instanceof r7) {
                    MessageObject messageObject = ((r7) view).getMessageObject();
                    if (nr0Var.D.f31161z1) {
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
                    d6 d6Var = rVar.f16601a;
                    c7 a2 = c7.a(rVar.f16604f);
                    if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f32134p1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f15169s += i11;
                    orCreateStoryViewer.C(context, id2, d6Var, a2);
                    return;
                }
                return;
            case 13:
                Utilities.Callback callback = ((ph.u) this.f4667b).f42377c;
                if (callback != null) {
                    callback.run((ph.r) ph.r.a().get(i10));
                    return;
                }
                return;
            case 14:
                ph.i1 i1Var = (ph.i1) this.f4667b;
                ph.y1 y1Var = i1Var.f41737r;
                Object F = i1Var.f41734c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = y1Var.f42611y;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                y1Var.dismiss();
                return;
            case 15:
                ph.o1 o1Var = (ph.o1) this.f4667b;
                ph.y1 y1Var2 = o1Var.f42043s;
                ph.n1 n1Var = o1Var.f42039c;
                if (i10 >= 0) {
                    o1Var.d.getClass();
                    if (RecyclerView.U(view).f5788f != 4) {
                        ArrayList arrayList = n1Var.f42000s;
                        ArrayList arrayList2 = n1Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) n1Var.f42000s.get(i10);
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
                        if (document2 == null && (view instanceof ph.c1) && (l5Var = ((ph.c1) view).f41317c) != null) {
                            document2 = l5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            i12 = ((org.telegram.ui.ActionBar.g3) y1Var2).currentAccount;
                            document2 = l5.f(i12, longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = y1Var2.f42611y;
                            if (callback3Return2 != null) {
                                callback3Return2.run(n1Var.f41997f.get(Long.valueOf(document2.f19190id)), document2, Boolean.FALSE);
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
                h9 h9Var = (h9) this.f4667b;
                cg.t0 t0Var2 = (cg.t0) cg.t0.c().get(i10);
                h9Var.f41341i1.setTypeface(t0Var2.f2529a);
                cg.f1 e6 = cg.f1.e(h9Var.C1);
                String str2 = t0Var2.f2529a;
                e6.f2398j = str2;
                e6.f2392a.edit().putString("typeface", str2).apply();
                j jVar2 = h9Var.G0;
                if (jVar2 instanceof b4) {
                    ((b4) jVar2).setTypeface(t0Var2);
                }
                h9Var.P0(false);
                return;
            case 17:
                qh.g.x0((qh.g) this.f4667b, i10);
                return;
            case 18:
                w51 w51Var2 = ((qh.f) this.f4667b).Y;
                if (w51Var2 != null) {
                    w51Var2.G(i10 - 1);
                    return;
                }
                return;
            case 19:
                rh.k.A0((rh.k) this.f4667b, i10);
                return;
            case 20:
                tf.z zVar = (tf.z) this.f4667b;
                if (view instanceof n4) {
                    n4 n4Var = (n4) view;
                    if (n4Var.B) {
                        zx zxVar = zVar.R;
                        if (zxVar != null) {
                            zxVar.f40873a.N4(n4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                zx zxVar2 = zVar.R;
                if (zxVar2 != null) {
                    oy oyVar = zxVar2.f40873a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (oyVar.f37047i2) {
                        if (oyVar.h5(longValue2)) {
                            if (!oyVar.F2.isEmpty()) {
                                oyVar.P3(longValue2, oyVar.i3(longValue2, null));
                                oyVar.a5();
                                kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                                kVar.h(true);
                                return;
                            }
                            oyVar.O3(longValue2, 0L, true, null);
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
                    oyVar.J3();
                    if (AndroidUtilities.isTablet() && oyVar.f37009b0 != null) {
                        int i14 = 0;
                        while (true) {
                            ny[] nyVarArr = oyVar.f37009b0;
                            if (i14 < nyVarArr.length) {
                                ww wwVar = nyVarArr[i14].d;
                                oyVar.f37065m2.dialogId = longValue2;
                                wwVar.f44764s = longValue2;
                                i14++;
                            } else {
                                oyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (oyVar.f37057k2 != null) {
                        if (oyVar.getMessagesController().checkCanOpenChat(bundle, oyVar)) {
                            oyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            oyVar.presentFragment(new xn(bundle));
                            return;
                        }
                        return;
                    } else if (oyVar.getMessagesController().checkCanOpenChat(bundle, oyVar)) {
                        oyVar.presentFragment(new xn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 21:
                uf.c0 c0Var = (uf.c0) this.f4667b;
                uf.z zVar2 = c0Var.f45271x;
                li liVar = c0Var.f24278b;
                f2.o0 adapter = c0Var.f45269s.getAdapter();
                uf.a0 a0Var = c0Var.f45272y;
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
                        if (liVar.f26689c0 != null) {
                            new eg.o1(liVar.f26689c0, c0Var.getContext(), liVar.G1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    uf.o1 o1Var2 = (uf.o1) O;
                    z4.a0(liVar.G1, o1Var2.a(), liVar.n1(), new org.telegram.ui.web.u1(18, c0Var, o1Var2));
                    return;
                }
                return;
            case 22:
                uf.e0 e0Var = (uf.e0) this.f4667b;
                i51 G2 = e0Var.f45293a0.G(i10 - 1);
                if (G2 != null) {
                    uf.v vVar = e0Var.W;
                    if (!vVar.h(G2)) {
                        int i16 = G2.d;
                        int i17 = uf.e0.f45291d0;
                        if (i16 == -1) {
                            e0Var.f45294b0 = true;
                            vVar.h = true;
                            e0Var.f45293a0.N(true);
                            e0Var.T(true);
                            return;
                        }
                        int i18 = uf.e0.f45292e0;
                        if (i16 == -2) {
                            e0Var.f45294b0 = false;
                            vVar.h = false;
                            e0Var.f45293a0.N(true);
                            e0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 23:
                uh.a aVar = (uh.a) this.f4667b;
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
                zf.i iVar = (zf.i) this.f4667b;
                Runnable runnable = ((zf.a) iVar.B.get(i10)).f47404c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
        }
    }
}
