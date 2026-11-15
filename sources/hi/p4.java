package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
public final class p4 implements View.OnLongClickListener {
    public final int f14852a;
    public final Object f14853b;

    public p4(Object obj, int i7) {
        this.f14852a = i7;
        this.f14853b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        an anVar;
        gj gjVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z10;
        int i7;
        int e11;
        int i10 = this.f14852a;
        Object obj = this.f14853b;
        switch (i10) {
            case 0:
                m5 m5Var = (m5) obj;
                int i11 = m5Var.f14683p1;
                if (m5Var.f14689s1 != null) {
                    sg.k0 e12 = sg.k0.e(i11);
                    e12.f56695k = !e12.f56695k;
                    e12.f56687a.edit().putBoolean("fill_shapes", e12.f56695k).apply();
                    boolean z11 = sg.k0.e(i11).f56695k;
                    for (int i12 = 0; i12 < m5Var.f14689s1.getItemsCount(); i12++) {
                        View childAt = m5Var.f14689s1.M.getChildAt(i12);
                        if (childAt instanceof j5) {
                            sg.g gVar = (sg.g) sg.g.f56622c.get(i12);
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
                sa saVar = (sa) obj;
                Activity activity = saVar.f15039b;
                v9 v9Var = saVar.C0;
                if (v9Var == null || !v9Var.isFrontface()) {
                    return false;
                }
                saVar.o();
                saVar.F0.setSelected(true);
                saVar.f15092s.e(0.85f, 240L, null);
                m60 F = m60.F(saVar.f15088r, saVar.f15035a, saVar.F0);
                x6 x6Var = new x6(activity, 1);
                x6Var.d(saVar.f15092s.f14751o);
                x6Var.h = new t8(saVar, 21);
                F.q(x6Var);
                F.o();
                x6 x6Var2 = new x6(activity, 2);
                x6Var2.f15375b = 0.65f;
                x6Var2.f15376c = 1.0f;
                x6Var2.d(saVar.f15092s.f14752p);
                x6Var2.h = new t8(saVar, 0);
                F.q(x6Var2);
                F.f37106p = new s8(saVar, 1);
                F.f37111s = 0;
                F.V(5);
                F.a0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                ((og.f) obj).f21480c.callOnClick();
                return true;
            case 3:
                if (((oi.e1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return oi.z1.b0((oi.z1) obj, view);
            case 5:
                oi.o oVar = ((oi.k) obj).f21766a;
                oi.v3 v3Var = oVar.f21849s;
                org.telegram.ui.ActionBar.e6 e6Var2 = oVar.f33606a;
                ki kiVar = oVar.f33607b;
                oi.q3 q3Var = oVar.f21848r;
                int i13 = oVar.f21847n;
                if (!m10.i(i13).q()) {
                    new ug.x0(kiVar.f36436a2, oVar.getContext(), oVar.f21847n, 43, true).show();
                } else if (!q3Var.n3() || q3Var.p3()) {
                    return false;
                } else {
                    if (!q3Var.P3()) {
                        if (v3Var == null) {
                            return false;
                        }
                        v3Var.setSendEnabled(q3Var.P3());
                        return false;
                    }
                    ArrayList<TL_iv.PageBlock> c32 = q3Var.c3();
                    if (c32.isEmpty()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
                    if (e2Var instanceof an) {
                        anVar = (an) e2Var;
                    } else {
                        anVar = null;
                    }
                    bg0 bg0Var = oVar.P;
                    if (bg0Var != null) {
                        bg0Var.h(false);
                        oVar.P = null;
                    }
                    bg0 bg0Var2 = new bg0(oVar.getContext(), e6Var2);
                    oVar.P = bg0Var2;
                    bg0Var2.setOnDismissListener(new di.r9(oVar, 7));
                    long b12 = kiVar.b1();
                    if (anVar != null) {
                        gjVar = anVar.E5;
                    } else {
                        gjVar = null;
                    }
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28072id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = np.s1(i13).z1(b12);
                    tL_message.from_id = np.s1(i13).z1(m10.i(i13).e());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = c32;
                    richMessage.photos = q3Var.E2();
                    tL_message.rich_message.documents = q3Var.B2();
                    if (gjVar != null && !gjVar.f23836p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    gj gjVar2 = new gj(i13, tL_message, false, false);
                    if (gjVar != null && !gjVar.f23836p) {
                        gjVar2.C = gjVar;
                    }
                    gjVar2.B0 = true;
                    gjVar2.W2 = Boolean.TRUE;
                    gjVar2.n0(null);
                    gjVar2.f23865w1 = true;
                    oVar.P.r(org.telegram.messenger.k5.j(gjVar2));
                    jg sendButton = v3Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    jg s5 = oVar.P.s(sendButton, true, new p5(oVar, 16));
                    if (s5 != null) {
                        e6Var = e6Var2;
                        s5.setBackground(new oi.y1(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var))));
                        bg0 bg0Var3 = oVar.P;
                        int L = org.telegram.messenger.g0.L(44.0f);
                        bg0Var3.f45732p0 = true;
                        bg0Var3.Y = L;
                    } else {
                        e6Var = e6Var2;
                    }
                    m60 F2 = m60.F(oVar, e6Var, sendButton);
                    if (anVar != null && q10.B(anVar.j())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (anVar != null && anVar.S6()) {
                        if (z10) {
                            i7 = 2131745514;
                        } else {
                            i7 = 2131745859;
                        }
                        F2.c(2131232078, hd.M0(i7, null), new di.x2(oVar, b12, 14), false);
                        if (!z10 && b12 > 0) {
                            F2.c(2131232265, hd.M0(2131745586, null), new oi.d(oVar, 0), false);
                        }
                    }
                    if (!z10) {
                        F2.c(2131231508, hd.M0(2131745583, null), new oi.d(oVar, 1), false);
                    }
                    F2.Y();
                    oVar.P.q(F2);
                    oVar.P.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return true;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                int i14 = g0Var.f57306z1;
                if (g0Var.C1 != null) {
                    sg.k0 e13 = sg.k0.e(i14);
                    e13.f56695k = !e13.f56695k;
                    e13.f56687a.edit().putBoolean("fill_shapes", e13.f56695k).apply();
                    boolean z12 = sg.k0.e(i14).f56695k;
                    for (int i15 = 0; i15 < g0Var.C1.getItemsCount(); i15++) {
                        View childAt2 = g0Var.C1.M.getChildAt(i15);
                        if (childAt2 instanceof tg.f0) {
                            sg.g gVar2 = (sg.g) sg.g.f56622c.get(i15);
                            if (z12) {
                                e11 = gVar2.m();
                            } else {
                                e11 = gVar2.e();
                            }
                            ((tg.f0) childAt2).a(e11, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
