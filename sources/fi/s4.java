package fi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.k60;
import org.telegram.ui.cn;
import org.telegram.ui.eg0;
public final class s4 implements View.OnLongClickListener {
    public final int f12791a;
    public final Object f12792b;

    public s4(Object obj, int i7) {
        this.f12791a = i7;
        this.f12792b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        cn cnVar;
        ij ijVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z9;
        int i7;
        int e11;
        int i10 = this.f12791a;
        Object obj = this.f12792b;
        switch (i10) {
            case 0:
                o5 o5Var = (o5) obj;
                int i11 = o5Var.f12540o1;
                if (o5Var.f12546r1 != null) {
                    sg.l0 e12 = sg.l0.e(i11);
                    e12.f55144k = !e12.f55144k;
                    e12.f55136a.edit().putBoolean("fill_shapes", e12.f55144k).apply();
                    boolean z10 = sg.l0.e(i11).f55144k;
                    for (int i12 = 0; i12 < o5Var.f12546r1.getItemsCount(); i12++) {
                        View childAt = o5Var.f12546r1.L.getChildAt(i12);
                        if (childAt instanceof l5) {
                            sg.g gVar = (sg.g) sg.g.f55064c.get(i12);
                            if (z10) {
                                e10 = gVar.m();
                            } else {
                                e10 = gVar.e();
                            }
                            ((l5) childAt).a(e10, z10, true);
                        }
                    }
                }
                return true;
            case 1:
                va vaVar = (va) obj;
                Activity activity = vaVar.f12940b;
                y9 y9Var = vaVar.B0;
                if (y9Var == null || !y9Var.isFrontface()) {
                    return false;
                }
                vaVar.o();
                vaVar.E0.setSelected(true);
                vaVar.f12993s.e(0.85f, 240L, null);
                k60 F = k60.F(vaVar.f12989r, vaVar.f12936a, vaVar.E0);
                y6 y6Var = new y6(activity, 1);
                y6Var.d(vaVar.f12993s.f12588o);
                y6Var.h = new v8(vaVar, 21);
                F.q(y6Var);
                F.o();
                y6 y6Var2 = new y6(activity, 2);
                y6Var2.f13201b = 0.65f;
                y6Var2.f13202c = 1.0f;
                y6Var2.d(vaVar.f12993s.f12589p);
                y6Var2.h = new v8(vaVar, 0);
                F.q(y6Var2);
                F.f35214p = new u8(vaVar, 1);
                F.f35219s = 0;
                F.V(5);
                F.a0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((li.g1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return li.b2.b0((li.b2) obj, view);
            case 4:
                li.p pVar = ((li.l) obj).f18681a;
                li.y3 y3Var = pVar.f18764s;
                org.telegram.ui.ActionBar.h6 h6Var2 = pVar.f38655a;
                ci ciVar = pVar.f38656b;
                li.t3 t3Var = pVar.f18763r;
                int i13 = pVar.f18762n;
                if (!p10.i(i13).q()) {
                    new ug.w0(ciVar.Z1, pVar.getContext(), pVar.f18762n, 43, true).show();
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
                    org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                    if (f2Var instanceof cn) {
                        cnVar = (cn) f2Var;
                    } else {
                        cnVar = null;
                    }
                    eg0 eg0Var = pVar.O;
                    if (eg0Var != null) {
                        eg0Var.g(false);
                        pVar.O = null;
                    }
                    eg0 eg0Var2 = new eg0(pVar.getContext(), h6Var2);
                    pVar.O = eg0Var2;
                    eg0Var2.setOnDismissListener(new bi.eb(pVar, 7));
                    long b12 = ciVar.b1();
                    if (cnVar != null) {
                        ijVar = cnVar.D5;
                    } else {
                        ijVar = null;
                    }
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f26981id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = qp.s1(i13).z1(b12);
                    tL_message.from_id = qp.s1(i13).z1(p10.i(i13).e());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = c32;
                    richMessage.photos = t3Var.E2();
                    tL_message.rich_message.documents = t3Var.B2();
                    if (ijVar != null && !ijVar.f23283p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = ijVar.e1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    ij ijVar2 = new ij(i13, tL_message, false, false);
                    if (ijVar != null && !ijVar.f23283p) {
                        ijVar2.C = ijVar;
                    }
                    ijVar2.f23323z0 = true;
                    ijVar2.U2 = Boolean.TRUE;
                    ijVar2.n0(null);
                    ijVar2.f23305u1 = true;
                    pVar.O.p(org.telegram.messenger.k5.k(ijVar2));
                    cg sendButton = y3Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    cg q10 = pVar.O.q(sendButton, true, new ii.g(pVar, 10));
                    if (q10 != null) {
                        h6Var = h6Var2;
                        q10.setBackground(new li.a2(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var))));
                        eg0 eg0Var3 = pVar.O;
                        int L = org.telegram.messenger.g0.L(44.0f);
                        eg0Var3.f45284l0 = true;
                        eg0Var3.X = L;
                    } else {
                        h6Var = h6Var2;
                    }
                    k60 F2 = k60.F(pVar, h6Var, sendButton);
                    if (cnVar != null && t10.B(cnVar.j())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (cnVar != null && cnVar.S6()) {
                        if (z9) {
                            i7 = 2131745514;
                        } else {
                            i7 = 2131745859;
                        }
                        F2.c(2131232077, id.M0(i7, null), new bi.r3(pVar, b12, 13), false);
                        if (!z9 && b12 > 0) {
                            F2.c(2131232264, id.M0(2131745586, null), new li.d(pVar, 0), false);
                        }
                    }
                    if (!z9) {
                        F2.c(2131231508, id.M0(2131745583, null), new li.d(pVar, 1), false);
                    }
                    F2.Y();
                    pVar.O.o(F2);
                    pVar.O.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return true;
            case 5:
                ((og.f) obj).f20962c.callOnClick();
                return true;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                int i14 = g0Var.f55714y1;
                if (g0Var.B1 != null) {
                    sg.l0 e13 = sg.l0.e(i14);
                    e13.f55144k = !e13.f55144k;
                    e13.f55136a.edit().putBoolean("fill_shapes", e13.f55144k).apply();
                    boolean z11 = sg.l0.e(i14).f55144k;
                    for (int i15 = 0; i15 < g0Var.B1.getItemsCount(); i15++) {
                        View childAt2 = g0Var.B1.L.getChildAt(i15);
                        if (childAt2 instanceof tg.f0) {
                            sg.g gVar2 = (sg.g) sg.g.f55064c.get(i15);
                            if (z11) {
                                e11 = gVar2.m();
                            } else {
                                e11 = gVar2.e();
                            }
                            ((tg.f0) childAt2).a(e11, z11, true);
                        }
                    }
                }
                return true;
        }
    }
}
