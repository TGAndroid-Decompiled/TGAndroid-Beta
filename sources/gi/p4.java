package gi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f60;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;
public final class p4 implements View.OnLongClickListener {
    public final int f13368a;
    public final Object f13369b;

    public p4(Object obj, int i3) {
        this.f13368a = i3;
        this.f13369b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        wm wmVar;
        zi ziVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10;
        int i3;
        int e11;
        int i10 = this.f13368a;
        Object obj = this.f13369b;
        switch (i10) {
            case 0:
                m5 m5Var = (m5) obj;
                int i11 = m5Var.f13222p1;
                if (m5Var.f13228s1 != null) {
                    tg.k0 e12 = tg.k0.e(i11);
                    e12.f55237k = !e12.f55237k;
                    e12.f55229a.edit().putBoolean("fill_shapes", e12.f55237k).apply();
                    boolean z11 = tg.k0.e(i11).f55237k;
                    for (int i12 = 0; i12 < m5Var.f13228s1.getItemsCount(); i12++) {
                        View childAt = m5Var.f13228s1.M.getChildAt(i12);
                        if (childAt instanceof j5) {
                            tg.g gVar = (tg.g) tg.g.f55164c.get(i12);
                            if (z11) {
                                e10 = gVar.m();
                            } else {
                                e10 = gVar.e();
                            }
                            ((j5) childAt).a(e10, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                va vaVar = (va) obj;
                Activity activity = vaVar.f13702b;
                y9 y9Var = vaVar.C0;
                if (y9Var == null || !y9Var.isFrontface()) {
                    return false;
                }
                vaVar.o();
                vaVar.F0.setSelected(true);
                vaVar.f13755s.e(0.85f, 240L, null);
                f60 F = f60.F(vaVar.f13751r, vaVar.f13698a, vaVar.F0);
                z6 z6Var = new z6(activity, 1);
                z6Var.d(vaVar.f13755s.f13292o);
                z6Var.h = new w8(vaVar, 21);
                F.q(z6Var);
                F.o();
                z6 z6Var2 = new z6(activity, 2);
                z6Var2.f14032b = 0.65f;
                z6Var2.f14033c = 1.0f;
                z6Var2.d(vaVar.f13755s.f13293p);
                z6Var2.h = new w8(vaVar, 0);
                F.q(z6Var2);
                F.f33742p = new v8(vaVar, 1);
                F.f33747s = 0;
                F.V(5);
                F.a0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((mi.h1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return mi.c2.b0((mi.c2) obj, view);
            case 4:
                mi.p pVar = ((mi.l) obj).f19728a;
                mi.y3 y3Var = pVar.f19794s;
                org.telegram.ui.ActionBar.e6 e6Var2 = pVar.f38415a;
                bi biVar = pVar.f38416b;
                mi.t3 t3Var = pVar.f19793r;
                int i13 = pVar.f19792n;
                if (!h10.i(i13).q()) {
                    new vg.v0(biVar.X1, pVar.getContext(), pVar.f19792n, 43, true).show();
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
                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                    if (d2Var instanceof wm) {
                        wmVar = (wm) d2Var;
                    } else {
                        wmVar = null;
                    }
                    vf0 vf0Var = pVar.P;
                    if (vf0Var != null) {
                        vf0Var.g(false);
                        pVar.P = null;
                    }
                    vf0 vf0Var2 = new vf0(pVar.getContext(), e6Var2);
                    pVar.P = vf0Var2;
                    vf0Var2.setOnDismissListener(new ci.ba(pVar, 7));
                    long b12 = biVar.b1();
                    if (wmVar != null) {
                        ziVar = wmVar.E5;
                    } else {
                        ziVar = null;
                    }
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f27022id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = hp.s1(i13).z1(b12);
                    tL_message.from_id = hp.s1(i13).z1(h10.i(i13).e());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = c32;
                    richMessage.photos = t3Var.E2();
                    tL_message.rich_message.documents = t3Var.B2();
                    if (ziVar != null && !ziVar.f26885p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = ziVar.f1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    zi ziVar2 = new zi(i13, tL_message, false, false);
                    if (ziVar != null && !ziVar.f26885p) {
                        ziVar2.C = ziVar;
                    }
                    ziVar2.f26925z0 = true;
                    ziVar2.U2 = Boolean.TRUE;
                    ziVar2.n0(null);
                    ziVar2.f26907u1 = true;
                    pVar.P.p(org.telegram.messenger.k5.k(ziVar2));
                    bg sendButton = y3Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    bg q10 = pVar.P.q(sendButton, true, new ii.m(pVar, 13));
                    if (q10 != null) {
                        e6Var = e6Var2;
                        q10.setBackground(new mi.b2(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var))));
                        vf0 vf0Var3 = pVar.P;
                        int L = org.telegram.messenger.g0.L(44.0f);
                        vf0Var3.m0 = true;
                        vf0Var3.Y = L;
                    } else {
                        e6Var = e6Var2;
                    }
                    f60 F2 = f60.F(pVar, e6Var, sendButton);
                    if (wmVar != null && l10.B(wmVar.j())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (wmVar != null && wmVar.R6()) {
                        if (z10) {
                            i3 = 2131745524;
                        } else {
                            i3 = 2131745869;
                        }
                        F2.c(2131232077, bd.M0(i3, null), new ci.e3(pVar, b12, 14), false);
                        if (!z10 && b12 > 0) {
                            F2.c(2131232264, bd.M0(2131745596, null), new mi.d(pVar, 0), false);
                        }
                    }
                    if (!z10) {
                        F2.c(2131231508, bd.M0(2131745593, null), new mi.d(pVar, 1), false);
                    }
                    F2.Y();
                    pVar.P.o(F2);
                    pVar.P.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return true;
            case 5:
                ((pg.e) obj).f53464c.callOnClick();
                return true;
            default:
                ug.f0 f0Var = (ug.f0) obj;
                int i14 = f0Var.f56002z1;
                if (f0Var.C1 != null) {
                    tg.k0 e13 = tg.k0.e(i14);
                    e13.f55237k = !e13.f55237k;
                    e13.f55229a.edit().putBoolean("fill_shapes", e13.f55237k).apply();
                    boolean z12 = tg.k0.e(i14).f55237k;
                    for (int i15 = 0; i15 < f0Var.C1.getItemsCount(); i15++) {
                        View childAt2 = f0Var.C1.M.getChildAt(i15);
                        if (childAt2 instanceof ug.e0) {
                            tg.g gVar2 = (tg.g) tg.g.f55164c.get(i15);
                            if (z12) {
                                e11 = gVar2.m();
                            } else {
                                e11 = gVar2.e();
                            }
                            ((ug.e0) childAt2).a(e11, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
