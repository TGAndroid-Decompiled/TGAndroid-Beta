package bi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zf;
import org.telegram.ui.ih0;
import org.telegram.ui.un;
import vh.o8;
import vh.t7;
import vh.y6;
import vh.z6;
public final class h1 implements View.OnLongClickListener {
    public final int f3049a;
    public final Object f3050b;

    public h1(Object obj, int i10) {
        this.f3049a = i10;
        this.f3050b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        un unVar;
        kj kjVar;
        boolean z10;
        boolean z11;
        int i10;
        int e;
        int e7;
        int i11 = this.f3049a;
        Object obj = this.f3050b;
        int i12 = 0;
        switch (i11) {
            case 0:
                if (((n1) obj).length() != 0) {
                    return true;
                }
                return false;
            case 1:
                return k2.b0((k2) obj, view);
            case 2:
                t tVar = ((p) obj).f3271a;
                i4 i4Var = tVar.f3351s;
                org.telegram.ui.ActionBar.p6 p6Var = tVar.f30963a;
                bi biVar = tVar.f30964b;
                d4 d4Var = tVar.f3350r;
                int i13 = tVar.f3349n;
                if (!e20.i(i13).q()) {
                    new kg.i1(biVar.W1, tVar.getContext(), tVar.f3349n, 43, true).show();
                    return true;
                }
                if (d4Var.n3() && !d4Var.p3()) {
                    if (!d4Var.P3()) {
                        if (i4Var != null) {
                            i4Var.setSendEnabled(d4Var.P3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> c32 = d4Var.c3();
                        if (!c32.isEmpty()) {
                            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                            if (k2Var instanceof un) {
                                unVar = (un) k2Var;
                            } else {
                                unVar = null;
                            }
                            ih0 ih0Var = tVar.O;
                            if (ih0Var != null) {
                                ih0Var.g(false);
                                tVar.O = null;
                            }
                            ih0 ih0Var2 = new ih0(tVar.getContext(), p6Var);
                            tVar.O = ih0Var2;
                            ih0Var2.setOnDismissListener(new ag.x(tVar, 2));
                            long a12 = biVar.a1();
                            if (unVar != null) {
                                kjVar = unVar.D5;
                            } else {
                                kjVar = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f19815id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = wp.r1(i13).y1(a12);
                            tL_message.from_id = wp.r1(i13).y1(e20.i(i13).e());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = c32;
                            richMessage.photos = d4Var.E2();
                            tL_message.rich_message.documents = d4Var.B2();
                            if (kjVar != null && !kjVar.f16708p) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = kjVar.f1();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            kj kjVar2 = new kj(i13, tL_message, false, false);
                            if (kjVar != null && !kjVar.f16708p) {
                                kjVar2.C = kjVar;
                            }
                            kjVar2.f16748z0 = true;
                            kjVar2.R2 = Boolean.TRUE;
                            kjVar2.n0(null);
                            kjVar2.f16730u1 = true;
                            tVar.O.p(org.telegram.messenger.m5.j(kjVar2));
                            zf sendButton = i4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            zf q6 = tVar.O.q(sendButton, true, new ag.g(tVar, 4));
                            if (q6 != null) {
                                q6.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var))));
                                ih0 ih0Var3 = tVar.O;
                                int L = org.telegram.messenger.i0.L(44.0f);
                                ih0Var3.f38073l0 = true;
                                ih0Var3.X = L;
                            }
                            z60 F = z60.F(tVar, p6Var, sendButton);
                            if (unVar != null && i20.B(unVar.j())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (unVar != null && unVar.P6()) {
                                if (z10) {
                                    i10 = 2131745531;
                                } else {
                                    i10 = 2131745876;
                                }
                                F.c(2131232076, dd.L0(i10, null), new e(tVar, a12, 0), false);
                                if (!z10 && a12 > 0) {
                                    F.c(2131232263, dd.L0(2131745603, null), new f(tVar, 0), false);
                                }
                            }
                            if (!z10) {
                                z11 = true;
                                F.c(2131231509, dd.L0(2131745600, null), new f(tVar, 1), false);
                            } else {
                                z11 = true;
                            }
                            F.Y();
                            tVar.O.o(F);
                            tVar.O.show();
                            try {
                                view.performHapticFeedback(3, 2);
                                return z11;
                            } catch (Exception unused) {
                                return z11;
                            }
                        }
                    }
                }
                return false;
            case 3:
                ((eg.f) obj).f6535c.callOnClick();
                return true;
            case 4:
                jg.r0 r0Var = (jg.r0) obj;
                int i14 = r0Var.f10202y1;
                if (r0Var.B1 != null) {
                    ig.s0 e10 = ig.s0.e(i14);
                    e10.f8459k = !e10.f8459k;
                    e10.f8452a.edit().putBoolean("fill_shapes", e10.f8459k).apply();
                    boolean z12 = ig.s0.e(i14).f8459k;
                    while (i12 < r0Var.B1.getItemsCount()) {
                        View childAt = r0Var.B1.L.getChildAt(i12);
                        if (childAt instanceof jg.p0) {
                            ig.g gVar = (ig.g) ig.g.f8309c.get(i12);
                            if (z12) {
                                e = gVar.m();
                            } else {
                                e = gVar.e();
                            }
                            ((jg.p0) childAt).a(e, z12, true);
                        }
                        i12++;
                    }
                }
                return true;
            case 5:
                vh.b4 b4Var = (vh.b4) obj;
                int i15 = b4Var.f50986o1;
                if (b4Var.f50992r1 != null) {
                    ig.s0 e11 = ig.s0.e(i15);
                    e11.f8459k = !e11.f8459k;
                    e11.f8452a.edit().putBoolean("fill_shapes", e11.f8459k).apply();
                    boolean z13 = ig.s0.e(i15).f8459k;
                    while (i12 < b4Var.f50992r1.getItemsCount()) {
                        View childAt2 = b4Var.f50992r1.L.getChildAt(i12);
                        if (childAt2 instanceof vh.z3) {
                            ig.g gVar2 = (ig.g) ig.g.f8309c.get(i12);
                            if (z13) {
                                e7 = gVar2.m();
                            } else {
                                e7 = gVar2.e();
                            }
                            ((vh.z3) childAt2).a(e7, z13, true);
                        }
                        i12++;
                    }
                }
                return true;
            default:
                o8 o8Var = (o8) obj;
                Activity activity = o8Var.f51622b;
                t7 t7Var = o8Var.B0;
                if (t7Var == null || !t7Var.isFrontface()) {
                    return false;
                }
                o8Var.o();
                o8Var.E0.setSelected(true);
                o8Var.f51676s.e(0.85f, 240L, null);
                z60 F2 = z60.F(o8Var.f51672r, o8Var.f51619a, o8Var.E0);
                vh.h5 h5Var = new vh.h5(activity, 1);
                h5Var.d(o8Var.f51676s.f52255o);
                h5Var.h = new z6(o8Var, 21);
                F2.q(h5Var);
                F2.o();
                vh.h5 h5Var2 = new vh.h5(activity, 2);
                h5Var2.f51263b = 0.65f;
                h5Var2.f51264c = 1.0f;
                h5Var2.d(o8Var.f51676s.f52256p);
                h5Var2.h = new z6(o8Var, 0);
                F2.q(h5Var2);
                F2.f33039p = new y6(o8Var, 1);
                F2.f33044s = 0;
                F2.V(5);
                F2.a0(org.telegram.messenger.i0.L(46.0f), -org.telegram.messenger.i0.L(4.0f));
                F2.P(-1155851493);
                F2.Z();
                return true;
        }
    }
}
