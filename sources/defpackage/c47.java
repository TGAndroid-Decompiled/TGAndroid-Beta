package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class c47 implements s09 {
    public final d a;
    public final j47 b;

    public c47(j47 j47Var, d dVar) {
        this.b = j47Var;
        this.a = dVar;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        boolean z3;
        long j;
        boolean z4;
        TLRPC.TL_availableEffect X0;
        h19 h19Var2;
        d dVar;
        boolean z5;
        long j2;
        boolean z6;
        h19 h19Var3;
        h19 h19Var4 = h19Var;
        if (h19Var4 != null) {
            j47 j47Var = this.b;
            b47 b47Var = j47Var.e0;
            z37 z37Var = j47Var.a0;
            int i = j47Var.c;
            if (b47Var != null) {
                if (!y6c.h(i).p() && h19Var4.d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gb2 gb2Var = j47Var.Q;
                if (gb2Var != null) {
                    k27 messageObject = gb2Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.k;
                        long j3 = message.effect;
                        long j4 = h19Var4.c;
                        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
                        int i3 = message.flags2;
                        if (i2 == 0) {
                            message.flags2 = i3 & (-5);
                            message.effect = 0L;
                            z5 = true;
                        } else {
                            message.flags2 = i3 | 4;
                            message.effect = j4;
                            z5 = false;
                        }
                        if (!z3) {
                            gb2 gb2Var2 = j47Var.Q;
                            j2 = j3;
                            f27 j5 = j47Var.j(messageObject);
                            if (j47Var.N.size() > 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            gb2Var2.z3(messageObject, j5, z6, false, false, false);
                            b47 b47Var2 = j47Var.e0;
                            if (z5) {
                                h19Var3 = null;
                            } else {
                                h19Var3 = h19Var4;
                            }
                            b47Var2.setSelectedReactionAnimated(h19Var3);
                            if (j47Var.e0.getReactionsWindow() != null && j47Var.e0.getReactionsWindow().m != null) {
                                i43 i43Var = j47Var.e0.getReactionsWindow().m;
                                if (z5) {
                                    h19Var4 = null;
                                }
                                i43Var.setSelectedReaction(h19Var4);
                                j47Var.e0.getReactionsWindow().a.invalidate();
                            }
                        } else {
                            j2 = j3;
                        }
                        z37Var.c();
                        if (!z5) {
                            z37Var.n(j47Var.Q, 0, false, false);
                        }
                        if (z3) {
                            TLRPC.Message message2 = messageObject.k;
                            message2.effect = j2;
                            if (j2 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        a47 a47Var = j47Var.X;
                        if (a47Var != null) {
                            a47Var.setEffect(messageObject.k.effect);
                        }
                        j47Var.m(messageObject.k.effect);
                    } else {
                        return;
                    }
                } else if (j47Var.l0 != null) {
                    long j6 = h19Var4.c;
                    if (j6 == j47Var.I) {
                        j47Var.I = 0L;
                        z4 = true;
                        j = 0;
                    } else {
                        j47Var.I = j6;
                        j = j6;
                        z4 = false;
                    }
                    a47 a47Var2 = j47Var.X;
                    if (a47Var2 != null) {
                        a47Var2.setEffect(j);
                    }
                    j47Var.m(j47Var.I);
                    if (!z3) {
                        if (j47Var.I == 0) {
                            X0 = null;
                        } else {
                            X0 = na7.q1(i).X0(j47Var.I);
                        }
                        tl tlVar = j47Var.J;
                        if (tlVar != null) {
                            if (j47Var.I != 0 && X0 != null) {
                                tlVar.g(vu3.g(X0.emoticon), true);
                            } else {
                                tlVar.g(null, true);
                            }
                        }
                        b47 b47Var3 = j47Var.e0;
                        if (z4) {
                            h19Var2 = null;
                        } else {
                            h19Var2 = h19Var4;
                        }
                        b47Var3.setSelectedReactionAnimated(h19Var2);
                        if (j47Var.e0.getReactionsWindow() != null && j47Var.e0.getReactionsWindow().m != null) {
                            i43 i43Var2 = j47Var.e0.getReactionsWindow().m;
                            if (z4) {
                                h19Var4 = null;
                            }
                            i43Var2.setSelectedReaction(h19Var4);
                            j47Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    z37Var.c();
                    if (!z4) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j7 = j47Var.I;
                        tL_message.effect = j7;
                        if (j7 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        j47Var.a0.d(null, 0, null, new k27(i, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z3 && (dVar = this.a) != null) {
                    new u21(j47Var.G, j47Var.b).Q(2131624212, 36, gl.O2(k96.M0(2131754250, null), -1, 2, new kv1(dVar, (byte) 3), null)).j();
                }
                j47Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
