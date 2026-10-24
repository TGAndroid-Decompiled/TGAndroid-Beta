package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ey;
import org.telegram.ui.jt0;
import org.telegram.ui.lw;
import org.telegram.ui.px;
import org.telegram.ui.sn;
import org.telegram.ui.vw;
public final class xa implements am0 {
    public final int f2457a;
    public final Object f2458b;

    public xa(Object obj, int i10) {
        this.f2457a = i10;
        this.f2458b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.Document document2;
        long longValue;
        org.telegram.ui.Components.r5 r5Var;
        org.telegram.ui.ActionBar.k kVar;
        Object O;
        m61 G;
        TLRPC.Document document3;
        zh.k0 k0Var;
        switch (this.f2457a) {
            case 0:
                nd.y0((nd) this.f2458b, i10);
                return;
            case 1:
                wc.P((wc) this.f2458b, i10);
                return;
            case 2:
                dd.P((dd) this.f2458b, i10);
                return;
            case 3:
                ed.P((ed) this.f2458b, i10);
                return;
            case 4:
                ((vw) this.f2458b).i((ci.q) view, false);
                return;
            case 5:
                di.r rVar = (di.r) this.f2458b;
                ms0 ms0Var = rVar.W;
                org.telegram.ui.ActionBar.o2 o2Var = ms0Var.f8075a;
                if (view instanceof org.telegram.ui.Cells.s7) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                    if (ms0Var.G.C1) {
                        if (ms0Var.c(messageObject)) {
                            ms0Var.g(messageObject);
                            return;
                        } else {
                            ms0Var.e(messageObject);
                            return;
                        }
                    }
                    ci.z9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = rVar.getContext();
                    int id2 = messageObject.getId();
                    ci.s6 s6Var = rVar.f8061a;
                    ci.q7 a2 = ci.q7.a(rVar.f8064f);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f34017t1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    } else {
                        i11 = 0;
                    }
                    a2.f5797s += i11;
                    orCreateStoryViewer.C(context, id2, s6Var, a2);
                    return;
                }
                return;
            case 6:
                Utilities.Callback callback = ((ei.y) this.f2458b).f10138c;
                if (callback != null) {
                    callback.run((ei.t) ei.t.a().get(i10));
                    return;
                }
                return;
            case 7:
                ei.v1 v1Var = (ei.v1) this.f2458b;
                ei.n2 n2Var = v1Var.f9948r;
                Object F = v1Var.f9945c.F(i10);
                if (F instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) F;
                    document = botInlineResult.document;
                } else if (F instanceof TLRPC.Document) {
                    document = (TLRPC.Document) F;
                    botInlineResult = null;
                } else {
                    return;
                }
                Utilities.Callback3Return callback3Return = n2Var.E;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                n2Var.dismiss();
                return;
            case 8:
                ei.b2 b2Var = (ei.b2) this.f2458b;
                ei.n2 n2Var2 = b2Var.f8783s;
                ei.a2 a2Var = b2Var.f8779c;
                if (i10 >= 0) {
                    b2Var.d.getClass();
                    if (RecyclerView.U(view).f46346f != 4) {
                        ArrayList arrayList = a2Var.f8690s;
                        ArrayList arrayList2 = a2Var.v;
                        if (i10 >= arrayList.size()) {
                            document2 = null;
                        } else {
                            document2 = (TLRPC.Document) a2Var.f8690s.get(i10);
                        }
                        if (document2 == n2Var2.e) {
                            ig.g gVar = n2Var2.F;
                            if (gVar != null) {
                                gVar.run();
                            }
                            n2Var2.dismiss();
                            return;
                        }
                        if (i10 >= arrayList2.size()) {
                            longValue = 0;
                        } else {
                            longValue = ((Long) arrayList2.get(i10)).longValue();
                        }
                        if (document2 == null && (view instanceof ei.n1) && (r5Var = ((ei.n1) view).d) != null) {
                            document2 = r5Var.e;
                        }
                        if (document2 == null && longValue != 0) {
                            document2 = org.telegram.ui.Components.r5.f(ei.n2.Z(n2Var2), longValue);
                        }
                        if (document2 != null) {
                            Utilities.Callback3Return callback3Return2 = n2Var2.E;
                            if (callback3Return2 != null) {
                                callback3Return2.run(a2Var.f8687f.get(Long.valueOf(document2.f20349id)), document2, Boolean.FALSE);
                            }
                            n2Var2.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ei.xa xaVar = (ei.xa) this.f2458b;
                qg.l0 l0Var = (qg.l0) qg.l0.c().get(i10);
                xaVar.l1.setTypeface(l0Var.f44978a);
                qg.u0 e = qg.u0.e(xaVar.F1);
                String str = l0Var.f44978a;
                e.f45097j = str;
                e.f45091a.edit().putString("typeface", str).apply();
                rg.j jVar = xaVar.J0;
                if (jVar instanceof rg.w2) {
                    ((rg.w2) jVar).setTypeface(l0Var);
                }
                xaVar.N0(false);
                return;
            case 10:
                fi.g.y0((fi.g) this.f2458b, i10);
                return;
            case 11:
                b71 b71Var = ((fi.f) this.f2458b).f10625c0;
                if (b71Var != null) {
                    b71Var.G(i10 - 1);
                    return;
                }
                return;
            case 12:
                gi.l.B0((gi.l) this.f2458b, i10);
                return;
            case 13:
                hg.h0 h0Var = (hg.h0) this.f2458b;
                if (view instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (m4Var.E) {
                        px pxVar = h0Var.U;
                        if (pxVar != null) {
                            pxVar.f40554a.L4(m4Var.getDialogId(), view);
                            return;
                        }
                        return;
                    }
                }
                px pxVar2 = h0Var.U;
                if (pxVar2 != null) {
                    ey eyVar = pxVar2.f40554a;
                    long longValue2 = ((Long) view.getTag()).longValue();
                    if (eyVar.f37096l2) {
                        if (eyVar.h5(longValue2)) {
                            if (!eyVar.I2.isEmpty()) {
                                eyVar.N3(longValue2, eyVar.e3(longValue2, null));
                                eyVar.a5();
                                kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                                kVar.g(true);
                                return;
                            }
                            eyVar.M3(longValue2, 0L, true, null);
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
                    eyVar.H3();
                    if (AndroidUtilities.isTablet() && eyVar.f37059e0 != null) {
                        int i12 = 0;
                        while (true) {
                            dy[] dyVarArr = eyVar.f37059e0;
                            if (i12 < dyVarArr.length) {
                                lw lwVar = dyVarArr[i12].d;
                                eyVar.f37115p2.dialogId = longValue2;
                                lwVar.f12001s = longValue2;
                                i12++;
                            } else {
                                eyVar.g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                    if (eyVar.f37105n2 != null) {
                        if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                            eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            eyVar.presentFragment(new sn(bundle));
                            return;
                        }
                        return;
                    } else if (eyVar.getMessagesController().checkCanOpenChat(bundle, eyVar)) {
                        eyVar.presentFragment(new sn(bundle));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                ig.h0 h0Var2 = (ig.h0) this.f2458b;
                ig.e0 e0Var = h0Var2.f12945x;
                ti tiVar = h0Var2.f28366b;
                s4.g0 adapter = h0Var2.f12943s.getAdapter();
                ig.f0 f0Var = h0Var2.f12946y;
                if (adapter == f0Var) {
                    ArrayList arrayList3 = f0Var.d;
                    int i13 = i10 - 1;
                    if (i13 >= 0 && i13 < arrayList3.size()) {
                        O = arrayList3.get(i13);
                    } else {
                        O = null;
                    }
                } else {
                    int S = e0Var.S(i10);
                    int Q = e0Var.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        O = e0Var.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (O instanceof ig.y1) {
                    if (!UserConfig.getInstance(tiVar.M1).isPremium()) {
                        if (tiVar.f30730f0 != null) {
                            new sg.y0(tiVar.f30730f0, h0Var2.getContext(), tiVar.M1, true, 31, false, null).show();
                            return;
                        }
                        return;
                    }
                    ig.y1 y1Var = (ig.y1) O;
                    org.telegram.ui.Components.f5.a0(tiVar.M1, y1Var.a(), tiVar.s1(), new o2(23, h0Var2, y1Var));
                    return;
                }
                return;
            case 15:
                ig.j0 j0Var = (ig.j0) this.f2458b;
                m61 G2 = j0Var.f12972e0.G(i10 - 1);
                if (G2 != null) {
                    ig.a0 a0Var = j0Var.Z;
                    if (!a0Var.h(G2)) {
                        int i14 = G2.d;
                        int i15 = ig.j0.f12966k0;
                        if (i14 == -1) {
                            j0Var.f12973f0 = true;
                            a0Var.h = true;
                            j0Var.f12972e0.N(true);
                            j0Var.T(true);
                            return;
                        }
                        int i16 = ig.j0.f12967l0;
                        if (i14 == -2) {
                            j0Var.f12973f0 = false;
                            a0Var.h = false;
                            j0Var.f12972e0.N(true);
                            j0Var.T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ji.a aVar = (ji.a) this.f2458b;
                int i17 = aVar.X.G(i10 - 1).d;
                if (i17 == 151) {
                    aVar.Q(false);
                    return;
                } else if (i17 == 150) {
                    aVar.Q(true);
                    return;
                } else {
                    return;
                }
            case 17:
                ng.i iVar = (ng.i) this.f2458b;
                Runnable runnable = ((ng.a) iVar.E.get(i10)).f17508c;
                if (runnable != null) {
                    runnable.run();
                    iVar.c(false);
                    return;
                }
                return;
            case 18:
                jt0 jt0Var = (jt0) this.f2458b;
                qg.l0 l0Var2 = (qg.l0) qg.l0.c().get(i10);
                jt0Var.f45915u1.setTypeface(l0Var2.f44978a);
                qg.u0 e7 = qg.u0.e(jt0Var.P1);
                String str2 = l0Var2.f44978a;
                e7.f45097j = str2;
                e7.f45091a.edit().putString("typeface", str2).apply();
                rg.j jVar2 = jt0Var.S0;
                if (jVar2 instanceof rg.w2) {
                    ((rg.w2) jVar2).setTypeface(l0Var2);
                }
                jt0Var.z0(false);
                return;
            case 19:
                rg.j1 j1Var = (rg.j1) this.f2458b;
                j1Var.f45837c3.accept(Integer.valueOf(j1Var.f45836b3.b(i10)));
                qg.u0 u0Var = j1Var.f45836b3;
                u0Var.f45093c.put(Integer.valueOf(u0Var.f45094f), Integer.valueOf(u0Var.b(i10)));
                u0Var.e = true;
                return;
            case 20:
                sg.j0.W((sg.j0) this.f2458b, view);
                return;
            case 21:
                sg.s0 s0Var = (sg.s0) this.f2458b;
                if (view != null) {
                    s0Var.C1(view, true);
                    s0Var.f46826e3 = false;
                    s0Var.v0(0, view.getTop() - ((s0Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    return;
                }
                return;
            case 22:
                ((ya0) this.f2458b).h(view);
                return;
            case 23:
                ((xh.k) this.f2458b).h(view);
                return;
            case 24:
                yh.k4 k4Var = (yh.k4) this.f2458b;
                ei.d dVar = k4Var.f50805c0;
                HashSet hashSet = k4Var.Z;
                b71 b71Var2 = k4Var.f50809g0;
                if (b71Var2 != null && (G = b71Var2.G(i10 - 1)) != null) {
                    Object obj = G.G;
                    if (obj instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        int i18 = savedStarGift.msg_id;
                        long j10 = i18 == 0 ? savedStarGift.saved_id : i18;
                        boolean z10 = false;
                        if (hashSet.contains(Long.valueOf(j10))) {
                            hashSet.remove(Long.valueOf(j10));
                            ((yh.g1) view).c(false, true);
                            G.e = false;
                        } else {
                            hashSet.add(Long.valueOf(j10));
                            ((yh.g1) view).c(true, true);
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
            default:
                zh.j0 j0Var2 = (zh.j0) this.f2458b;
                if ((view instanceof zh.l) && (document3 = ((zh.l) view).e) != null) {
                    long j11 = document3.f20349id;
                    if (j11 != 0) {
                        zh.n0 n0Var = j0Var2.f52489a;
                        if (n0Var.d != null) {
                            if (!n0Var.getUserConfig().isPremium() && ((k0Var = n0Var.h) == null || !k0Var.H.contains(Long.valueOf(j11)))) {
                                zh.c1 c1Var = n0Var.d;
                                c1Var.getClass();
                                c1Var.d1(0, LocaleController.getString(R.string.QrPremiumEmojiToast), LocaleController.getString(R.string.QrPremiumSubscribe));
                                c1Var.i0();
                                return;
                            }
                            zh.c1 c1Var2 = n0Var.d;
                            int i19 = c1Var2.f52180b;
                            String o10 = a1.g.o(j11, "c:");
                            HashMap hashMap = c1Var2.J;
                            if (!hashMap.containsKey(o10)) {
                                org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(i19, 2, document3);
                                m10.a(c1Var2);
                                hashMap.put(o10, m10);
                            }
                            if (o10 != null && !o10.startsWith("c:")) {
                                o10 = o10.replace("️", "");
                            }
                            ArrayList arrayList4 = c1Var2.I;
                            int indexOf = arrayList4.indexOf(o10);
                            if (indexOf >= 0) {
                                arrayList4.remove(indexOf);
                            } else {
                                if (arrayList4.size() >= 6) {
                                    arrayList4.remove(0);
                                }
                                arrayList4.add(o10);
                            }
                            c1Var2.c();
                            c1Var2.i0();
                            zh.k0 k0Var2 = n0Var.h;
                            if (k0Var2 != null) {
                                ArrayList a10 = k0Var2.a();
                                a10.remove(Long.valueOf(j11));
                                a10.add(0, Long.valueOf(j11));
                                while (a10.size() > 21) {
                                    a1.g.y(1, a10);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                for (int i20 = 0; i20 < a10.size(); i20++) {
                                    if (i20 > 0) {
                                        sb2.append(',');
                                    }
                                    sb2.append(a10.get(i20));
                                }
                                MessagesController.getMainSettings(k0Var2.f52549a).edit().putString("qrAppliedEmoji", sb2.toString()).apply();
                                k0Var2.J = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
