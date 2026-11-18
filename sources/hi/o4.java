package hi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.fg0;
public final class o4 implements View.OnLongClickListener {
    public final int f15157a;
    public final Object f15158b;

    public o4(Object obj, int i7) {
        this.f15157a = i7;
        this.f15158b = obj;
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
        int i10 = this.f15157a;
        Object obj = this.f15158b;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                int i11 = l5Var.f14919p1;
                if (l5Var.f14925s1 != null) {
                    sg.k0 e12 = sg.k0.e(i11);
                    e12.f57269k = !e12.f57269k;
                    e12.f57261a.edit().putBoolean("fill_shapes", e12.f57269k).apply();
                    boolean z11 = sg.k0.e(i11).f57269k;
                    for (int i12 = 0; i12 < l5Var.f14925s1.getItemsCount(); i12++) {
                        View childAt = l5Var.f14925s1.M.getChildAt(i12);
                        if (childAt instanceof i5) {
                            sg.g gVar = (sg.g) sg.g.f57196c.get(i12);
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
                Activity activity = taVar.f15424b;
                w9 w9Var = taVar.C0;
                if (w9Var == null || !w9Var.isFrontface()) {
                    return false;
                }
                taVar.o();
                taVar.F0.setSelected(true);
                taVar.f15477s.e(0.85f, 240L, null);
                y60 G = y60.G(taVar.f15473r, taVar.f15420a, taVar.F0);
                x6 x6Var = new x6(activity, 1);
                x6Var.d(taVar.f15477s.f15149o);
                x6Var.h = new t8(taVar, 21);
                G.q(x6Var);
                G.o(true);
                x6 x6Var2 = new x6(activity, 2);
                x6Var2.f15729b = 0.65f;
                x6Var2.f15730c = 1.0f;
                x6Var2.d(taVar.f15477s.f15150p);
                x6Var2.h = new t8(taVar, 0);
                G.q(x6Var2);
                G.f42369p = new s8(taVar, 1);
                G.f42375s = 0;
                G.W(5);
                G.b0(org.telegram.messenger.g0.L(46.0f), -org.telegram.messenger.g0.L(4.0f));
                G.Q(-1155851493);
                G.a0();
                return true;
            case 2:
                ((og.f) obj).f21843c.callOnClick();
                return true;
            case 3:
                if (((oi.e1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return oi.z1.b0((oi.z1) obj, view);
            case 5:
                oi.o oVar = ((oi.k) obj).f22126a;
                oi.x3 x3Var = oVar.f22208s;
                org.telegram.ui.ActionBar.i6 i6Var2 = oVar.f36765a;
                si siVar = oVar.f36766b;
                oi.s3 s3Var = oVar.f22207r;
                int i13 = oVar.f22206n;
                if (!j10.i(i13).q()) {
                    new ug.z0(siVar.f39659a2, oVar.getContext(), oVar.f22206n, 43, true).show();
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
                    org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
                    if (h2Var instanceof bn) {
                        bnVar = (bn) h2Var;
                    } else {
                        bnVar = null;
                    }
                    fg0 fg0Var = oVar.P;
                    if (fg0Var != null) {
                        fg0Var.h(false);
                        oVar.P = null;
                    }
                    fg0 fg0Var2 = new fg0(oVar.getContext(), i6Var2);
                    oVar.P = fg0Var2;
                    fg0Var2.setOnDismissListener(new di.t9(oVar, 7));
                    long c12 = siVar.c1();
                    if (bnVar != null) {
                        fjVar = bnVar.F5;
                    } else {
                        fjVar = null;
                    }
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28424id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = mp.u1(i13).B1(c12);
                    tL_message.from_id = mp.u1(i13).B1(j10.i(i13).e());
                    tL_message.flags2 |= 8192;
                    TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                    tL_message.rich_message = richMessage;
                    richMessage.blocks = c32;
                    richMessage.photos = s3Var.E2();
                    tL_message.rich_message.documents = s3Var.B2();
                    if (fjVar != null && !fjVar.f23984p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = fjVar.e1();
                        tL_message.reply_to = tL_messageReplyHeader;
                    }
                    fj fjVar2 = new fj(i13, tL_message, false, false);
                    if (fjVar != null && !fjVar.f23984p) {
                        fjVar2.C = fjVar;
                    }
                    fjVar2.B0 = true;
                    fjVar2.W2 = Boolean.TRUE;
                    fjVar2.n0(null);
                    fjVar2.f24013w1 = true;
                    oVar.P.r(org.telegram.messenger.f3.i(fjVar2));
                    sg sendButton = x3Var.getSendButton();
                    sendButton.setScaleX(1.0f);
                    sendButton.setScaleY(1.0f);
                    sg s5 = oVar.P.s(sendButton, true, new o0(oVar, 18));
                    if (s5 != null) {
                        i6Var = i6Var2;
                        s5.setBackground(new oi.y1(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var))));
                        fg0 fg0Var3 = oVar.P;
                        int L = org.telegram.messenger.g0.L(44.0f);
                        fg0Var3.f47638p0 = true;
                        fg0Var3.Y = L;
                    } else {
                        i6Var = i6Var2;
                    }
                    y60 G2 = y60.G(oVar, i6Var, sendButton);
                    if (bnVar != null && o10.C(bnVar.j())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bnVar != null && bnVar.S6()) {
                        if (z10) {
                            i7 = 2131745319;
                        } else {
                            i7 = 2131745664;
                        }
                        G2.c(2131232079, gd.M0(i7, null), new bi.y3(oVar, c12, 15), false);
                        if (!z10 && c12 > 0) {
                            G2.c(2131232266, gd.M0(2131745391, null), new oi.d(oVar, 0), false);
                        }
                    }
                    if (!z10) {
                        G2.c(2131231509, gd.M0(2131745388, null), new oi.d(oVar, 1), false);
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
                tg.g0 g0Var = (tg.g0) obj;
                int i14 = g0Var.f57888z1;
                if (g0Var.C1 != null) {
                    sg.k0 e13 = sg.k0.e(i14);
                    e13.f57269k = !e13.f57269k;
                    e13.f57261a.edit().putBoolean("fill_shapes", e13.f57269k).apply();
                    boolean z12 = sg.k0.e(i14).f57269k;
                    for (int i15 = 0; i15 < g0Var.C1.getItemsCount(); i15++) {
                        View childAt2 = g0Var.C1.M.getChildAt(i15);
                        if (childAt2 instanceof tg.f0) {
                            sg.g gVar2 = (sg.g) sg.g.f57196c.get(i15);
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
