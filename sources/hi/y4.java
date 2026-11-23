package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
import org.telegram.ui.dg0;
public final class y4 implements View.OnLongClickListener {
    public final int f15863a;
    public final Object f15864b;

    public y4(Object obj, int i7) {
        this.f15863a = i7;
        this.f15864b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        bn bnVar;
        fj fjVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z10;
        int i7;
        int e11;
        int i10 = this.f15863a;
        Object obj = this.f15864b;
        switch (i10) {
            case 0:
                v5 v5Var = (v5) obj;
                int i11 = v5Var.f15583p1;
                if (v5Var.f15589s1 != null) {
                    sg.j0 e12 = sg.j0.e(i11);
                    e12.f57384k = !e12.f57384k;
                    e12.f57376a.edit().putBoolean("fill_shapes", e12.f57384k).apply();
                    boolean z11 = sg.j0.e(i11).f57384k;
                    for (int i12 = 0; i12 < v5Var.f15589s1.getItemsCount(); i12++) {
                        View childAt = v5Var.f15589s1.M.getChildAt(i12);
                        if (childAt instanceof s5) {
                            sg.g gVar = (sg.g) sg.g.f57331c.get(i12);
                            if (z11) {
                                e10 = gVar.m();
                            } else {
                                e10 = gVar.e();
                            }
                            ((s5) childAt).a(e10, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                nb nbVar = (nb) obj;
                Activity activity = nbVar.f15058b;
                qa qaVar = nbVar.C0;
                if (qaVar == null || !qaVar.isFrontface()) {
                    return false;
                }
                nbVar.o();
                nbVar.F0.setSelected(true);
                nbVar.f15111s.e(0.85f, 240L, null);
                x60 G = x60.G(nbVar.f15107r, nbVar.f15054a, nbVar.F0);
                g7 g7Var = new g7(activity, 1);
                g7Var.d(nbVar.f15111s.f15665o);
                g7Var.h = new n9(nbVar, 21);
                G.q(g7Var);
                G.o(true);
                g7 g7Var2 = new g7(activity, 2);
                g7Var2.f14545b = 0.65f;
                g7Var2.f14546c = 1.0f;
                g7Var2.d(nbVar.f15111s.f15666p);
                g7Var2.h = new n9(nbVar, 0);
                G.q(g7Var2);
                G.f41886p = new m9(nbVar, 1);
                G.f41892s = 0;
                G.W(5);
                G.b0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                G.Q(-1155851493);
                G.a0();
                return true;
            case 2:
                ((og.f) obj).f21937c.callOnClick();
                return true;
            case 3:
                if (((oi.f1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return oi.b2.b0((oi.b2) obj, view);
            case 5:
                oi.p pVar = ((oi.l) obj).f22285a;
                oi.y3 y3Var = pVar.f22368s;
                org.telegram.ui.ActionBar.i6 i6Var2 = pVar.f37134a;
                ti tiVar = pVar.f37135b;
                oi.t3 t3Var = pVar.f22367r;
                int i13 = pVar.f22366n;
                if (!i10.i(i13).q()) {
                    new ug.y0(tiVar.f39956a2, pVar.getContext(), pVar.f22366n, 43, true).show();
                } else if (!t3Var.n3() || t3Var.p3()) {
                    return false;
                } else {
                    if (!t3Var.P3()) {
                        if (y3Var == null) {
                            return false;
                        }
                        y3Var.setSendEnabled(t3Var.P3());
                        return false;
                    }
                    ArrayList<TL_iv.PageBlock> c32 = t3Var.c3();
                    if (c32.isEmpty()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                    if (g2Var instanceof bn) {
                        bnVar = (bn) g2Var;
                    } else {
                        bnVar = null;
                    }
                    dg0 dg0Var = pVar.P;
                    if (dg0Var != null) {
                        dg0Var.h(false);
                        pVar.P = null;
                    }
                    dg0 dg0Var2 = new dg0(pVar.getContext(), i6Var2);
                    pVar.P = dg0Var2;
                    dg0Var2.setOnDismissListener(new di.u9(pVar, 7));
                    long c12 = tiVar.c1();
                    if (bnVar != null) {
                        fjVar = bnVar.F5;
                    } else {
                        fjVar = null;
                    }
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28513id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = mp.u1(i13).B1(c12);
                    tL_message.from_id = mp.u1(i13).B1(i10.i(i13).e());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = c32;
                    richMessage.photos = t3Var.E2();
                    tL_message.rich_message.documents = t3Var.B2();
                    if (fjVar != null && !fjVar.f24092p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = fjVar.e1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    fj fjVar2 = new fj(i13, tL_message, false, false);
                    if (fjVar != null && !fjVar.f24092p) {
                        fjVar2.C = fjVar;
                    }
                    fjVar2.B0 = true;
                    fjVar2.W2 = Boolean.TRUE;
                    fjVar2.n0(null);
                    fjVar2.f24121w1 = true;
                    pVar.P.r(org.telegram.messenger.f3.i(fjVar2));
                    tg sendButton = y3Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    tg s5 = pVar.P.s(sendButton, true, new z4(pVar, 17));
                    if (s5 != null) {
                        i6Var = i6Var2;
                        s5.setBackground(new oi.a2(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var))));
                        dg0 dg0Var3 = pVar.P;
                        int L = org.telegram.messenger.g0.L(44.0f);
                        dg0Var3.f47111p0 = true;
                        dg0Var3.Y = L;
                    } else {
                        i6Var = i6Var2;
                    }
                    x60 G2 = x60.G(pVar, i6Var, sendButton);
                    if (bnVar != null && n10.C(bnVar.j())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bnVar != null && bnVar.S6()) {
                        if (z10) {
                            i7 = 2131745318;
                        } else {
                            i7 = 2131745663;
                        }
                        G2.c(2131232082, gd.N0(i7, null), new bi.e4(pVar, c12, 15), false);
                        if (!z10 && c12 > 0) {
                            G2.c(2131232269, gd.N0(2131745390, null), new oi.d(pVar, 0), false);
                        }
                    }
                    if (!z10) {
                        G2.c(2131231512, gd.N0(2131745387, null), new oi.d(pVar, 1), false);
                    }
                    G2.Z();
                    pVar.P.q(G2);
                    pVar.P.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return true;
            default:
                tg.l0 l0Var = (tg.l0) obj;
                int i14 = l0Var.f58062z1;
                if (l0Var.C1 != null) {
                    sg.j0 e13 = sg.j0.e(i14);
                    e13.f57384k = !e13.f57384k;
                    e13.f57376a.edit().putBoolean("fill_shapes", e13.f57384k).apply();
                    boolean z12 = sg.j0.e(i14).f57384k;
                    for (int i15 = 0; i15 < l0Var.C1.getItemsCount(); i15++) {
                        View childAt2 = l0Var.C1.M.getChildAt(i15);
                        if (childAt2 instanceof tg.k0) {
                            sg.g gVar2 = (sg.g) sg.g.f57331c.get(i15);
                            if (z12) {
                                e11 = gVar2.m();
                            } else {
                                e11 = gVar2.e();
                            }
                            ((tg.k0) childAt2).a(e11, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
