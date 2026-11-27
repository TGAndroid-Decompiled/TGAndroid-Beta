package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class j67 implements h49 {
    public final e a;
    public final q67 b;

    public j67(q67 q67Var, e eVar) {
        this.b = q67Var;
        this.a = eVar;
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        boolean z3;
        long j;
        boolean z4;
        TLRPC.TL_availableEffect Z0;
        w49 w49Var2;
        e eVar;
        boolean z5;
        long j2;
        boolean z6;
        w49 w49Var3;
        w49 w49Var4 = w49Var;
        if (w49Var4 != null) {
            q67 q67Var = this.b;
            i67 i67Var = q67Var.e0;
            g67 g67Var = q67Var.a0;
            int i = q67Var.c;
            if (i67Var != null) {
                if (!yac.h(i).p() && w49Var4.d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                wb2 wb2Var = q67Var.Q;
                if (wb2Var != null) {
                    r47 messageObject = wb2Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.k;
                        long j3 = message.effect;
                        long j4 = w49Var4.c;
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
                            wb2 wb2Var2 = q67Var.Q;
                            j2 = j3;
                            m47 j5 = q67Var.j(messageObject);
                            if (q67Var.N.size() > 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            wb2Var2.z3(messageObject, j5, z6, false, false, false);
                            i67 i67Var2 = q67Var.e0;
                            if (z5) {
                                w49Var3 = null;
                            } else {
                                w49Var3 = w49Var4;
                            }
                            i67Var2.setSelectedReactionAnimated(w49Var3);
                            if (q67Var.e0.getReactionsWindow() != null && q67Var.e0.getReactionsWindow().m != null) {
                                a53 a53Var = q67Var.e0.getReactionsWindow().m;
                                if (z5) {
                                    w49Var4 = null;
                                }
                                a53Var.setSelectedReaction(w49Var4);
                                q67Var.e0.getReactionsWindow().a.invalidate();
                            }
                        } else {
                            j2 = j3;
                        }
                        g67Var.c();
                        if (!z5) {
                            g67Var.n(q67Var.Q, 0, false, false);
                        }
                        if (z3) {
                            TLRPC.Message message2 = messageObject.k;
                            message2.effect = j2;
                            if (j2 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        h67 h67Var = q67Var.X;
                        if (h67Var != null) {
                            h67Var.setEffect(messageObject.k.effect);
                        }
                        q67Var.m(messageObject.k.effect);
                    } else {
                        return;
                    }
                } else if (q67Var.l0 != null) {
                    long j6 = w49Var4.c;
                    if (j6 == q67Var.I) {
                        q67Var.I = 0L;
                        z4 = true;
                        j = 0;
                    } else {
                        q67Var.I = j6;
                        j = j6;
                        z4 = false;
                    }
                    h67 h67Var2 = q67Var.X;
                    if (h67Var2 != null) {
                        h67Var2.setEffect(j);
                    }
                    q67Var.m(q67Var.I);
                    if (!z3) {
                        if (q67Var.I == 0) {
                            Z0 = null;
                        } else {
                            Z0 = uc7.s1(i).Z0(q67Var.I);
                        }
                        ul ulVar = q67Var.J;
                        if (ulVar != null) {
                            if (q67Var.I != 0 && Z0 != null) {
                                ulVar.g(pv3.g(Z0.emoticon), true);
                            } else {
                                ulVar.g(null, true);
                            }
                        }
                        i67 i67Var3 = q67Var.e0;
                        if (z4) {
                            w49Var2 = null;
                        } else {
                            w49Var2 = w49Var4;
                        }
                        i67Var3.setSelectedReactionAnimated(w49Var2);
                        if (q67Var.e0.getReactionsWindow() != null && q67Var.e0.getReactionsWindow().m != null) {
                            a53 a53Var2 = q67Var.e0.getReactionsWindow().m;
                            if (z4) {
                                w49Var4 = null;
                            }
                            a53Var2.setSelectedReaction(w49Var4);
                            q67Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    g67Var.c();
                    if (!z4) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j7 = q67Var.I;
                        tL_message.effect = j7;
                        if (j7 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        q67Var.a0.d(null, 0, null, new r47(i, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z3 && (eVar = this.a) != null) {
                    new d31(q67Var.G, q67Var.b).Q(2131624211, 36, hl.N2(ob6.M0(2131754246, null), -1, 2, new yv1(eVar, (byte) 3), null)).j();
                }
                q67Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
