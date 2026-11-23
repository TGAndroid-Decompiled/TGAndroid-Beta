package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.eg0;
public final class o4 implements View.OnLongClickListener {
    public final int f15115a;
    public final Object f15116b;

    public o4(Object obj, int i7) {
        this.f15115a = i7;
        this.f15116b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        bn bnVar;
        gj gjVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z10;
        int i7;
        int e11;
        int i10 = this.f15115a;
        Object obj = this.f15116b;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                int i11 = l5Var.f14909p1;
                if (l5Var.f14915s1 != null) {
                    sg.k0 e12 = sg.k0.e(i11);
                    e12.f57279k = !e12.f57279k;
                    e12.f57271a.edit().putBoolean("fill_shapes", e12.f57279k).apply();
                    boolean z11 = sg.k0.e(i11).f57279k;
                    for (int i12 = 0; i12 < l5Var.f14915s1.getItemsCount(); i12++) {
                        View childAt = l5Var.f14915s1.M.getChildAt(i12);
                        if (childAt instanceof i5) {
                            sg.g gVar = (sg.g) sg.g.f57206c.get(i12);
                            if (z11) {
                                e10 = gVar.m();
                            } else {
                                e10 = gVar.e();
                            }
                            ((i5) childAt).a(e10, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                ta taVar = (ta) obj;
                Activity activity = taVar.f15391b;
                w9 w9Var = taVar.C0;
                if (w9Var == null || !w9Var.isFrontface()) {
                    return false;
                }
                taVar.o();
                taVar.F0.setSelected(true);
                taVar.f15444s.e(0.85f, 240L, null);
                a70 G = a70.G(taVar.f15440r, taVar.f15387a, taVar.F0);
                x6 x6Var = new x6(activity, 1);
                x6Var.d(taVar.f15444s.f15061o);
                x6Var.h = new t8(taVar, 21);
                G.q(x6Var);
                G.o(true);
                x6 x6Var2 = new x6(activity, 2);
                x6Var2.f15684b = 0.65f;
                x6Var2.f15685c = 1.0f;
                x6Var2.d(taVar.f15444s.f15062p);
                x6Var2.h = new t8(taVar, 0);
                G.q(x6Var2);
                G.f33357p = new s8(taVar, 1);
                G.f33363s = 0;
                G.W(5);
                G.b0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                G.Q(-1155851493);
                G.a0();
                return true;
            case 2:
                ((og.f) obj).f21837c.callOnClick();
                return true;
            case 3:
                if (((oi.e1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return oi.a2.b0((oi.a2) obj, view);
            case 5:
                oi.o oVar = ((oi.k) obj).f22155a;
                oi.x3 x3Var = oVar.f22238s;
                org.telegram.ui.ActionBar.h6 h6Var2 = oVar.f37476a;
                ui uiVar = oVar.f37477b;
                oi.s3 s3Var = oVar.f22237r;
                int i13 = oVar.f22236n;
                if (!k10.i(i13).q()) {
                    new ug.y0(uiVar.f40352a2, oVar.getContext(), oVar.f22236n, 43, true).show();
                } else if (!s3Var.n3() || s3Var.p3()) {
                    return false;
                } else {
                    if (!s3Var.P3()) {
                        if (x3Var == null) {
                            return false;
                        }
                        x3Var.setSendEnabled(s3Var.P3());
                        return false;
                    }
                    ArrayList<TL_iv.PageBlock> c32 = s3Var.c3();
                    if (c32.isEmpty()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40352a2;
                    if (g2Var instanceof bn) {
                        bnVar = (bn) g2Var;
                    } else {
                        bnVar = null;
                    }
                    eg0 eg0Var = oVar.P;
                    if (eg0Var != null) {
                        eg0Var.h(false);
                        oVar.P = null;
                    }
                    eg0 eg0Var2 = new eg0(oVar.getContext(), h6Var2);
                    oVar.P = eg0Var2;
                    eg0Var2.setOnDismissListener(new di.u9(oVar, 7));
                    long c12 = uiVar.c1();
                    if (bnVar != null) {
                        gjVar = bnVar.F5;
                    } else {
                        gjVar = null;
                    }
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28419id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = np.u1(i13).B1(c12);
                    tL_message.from_id = np.u1(i13).B1(k10.i(i13).e());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = c32;
                    richMessage.photos = s3Var.E2();
                    tL_message.rich_message.documents = s3Var.B2();
                    if (gjVar != null && !gjVar.f24196p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    gj gjVar2 = new gj(i13, tL_message, false, false);
                    if (gjVar != null && !gjVar.f24196p) {
                        gjVar2.C = gjVar;
                    }
                    gjVar2.B0 = true;
                    gjVar2.W2 = Boolean.TRUE;
                    gjVar2.n0(null);
                    gjVar2.f24225w1 = true;
                    oVar.P.r(org.telegram.messenger.f3.i(gjVar2));
                    ug sendButton = x3Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    ug s5 = oVar.P.s(sendButton, true, new p4(oVar, 17));
                    if (s5 != null) {
                        h6Var = h6Var2;
                        s5.setBackground(new oi.z1(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var))));
                        eg0 eg0Var3 = oVar.P;
                        int L = org.telegram.messenger.g0.L(44.0f);
                        eg0Var3.f47252p0 = true;
                        eg0Var3.Y = L;
                    } else {
                        h6Var = h6Var2;
                    }
                    a70 G2 = a70.G(oVar, h6Var, sendButton);
                    if (bnVar != null && p10.C(bnVar.j())) {
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
                        G2.c(2131232079, hd.N0(i7, null), new bi.e4(oVar, c12, 15), false);
                        if (!z10 && c12 > 0) {
                            G2.c(2131232266, hd.N0(2131745390, null), new oi.d(oVar, 0), false);
                        }
                    }
                    if (!z10) {
                        G2.c(2131231509, hd.N0(2131745387, null), new oi.d(oVar, 1), false);
                    }
                    G2.Z();
                    oVar.P.q(G2);
                    oVar.P.show();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return true;
            default:
                tg.h0 h0Var = (tg.h0) obj;
                int i14 = h0Var.f57911z1;
                if (h0Var.C1 != null) {
                    sg.k0 e13 = sg.k0.e(i14);
                    e13.f57279k = !e13.f57279k;
                    e13.f57271a.edit().putBoolean("fill_shapes", e13.f57279k).apply();
                    boolean z12 = sg.k0.e(i14).f57279k;
                    for (int i15 = 0; i15 < h0Var.C1.getItemsCount(); i15++) {
                        View childAt2 = h0Var.C1.M.getChildAt(i15);
                        if (childAt2 instanceof tg.g0) {
                            sg.g gVar2 = (sg.g) sg.g.f57206c.get(i15);
                            if (z12) {
                                e11 = gVar2.m();
                            } else {
                                e11 = gVar2.e();
                            }
                            ((tg.g0) childAt2).a(e11, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
