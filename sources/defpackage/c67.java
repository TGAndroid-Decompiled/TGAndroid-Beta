package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class c67 implements u29 {
    public final d a;
    public final j67 b;

    public c67(j67 j67Var, d dVar) {
        this.b = j67Var;
        this.a = dVar;
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        boolean z3;
        long j;
        boolean z4;
        TLRPC.TL_availableEffect Y0;
        k39 k39Var2;
        d dVar;
        boolean z5;
        long j2;
        boolean z6;
        k39 k39Var3;
        k39 k39Var4 = k39Var;
        if (k39Var4 != null) {
            j67 j67Var = this.b;
            b67 b67Var = j67Var.e0;
            z57 z57Var = j67Var.a0;
            int i = j67Var.c;
            if (b67Var != null) {
                if (!z8c.h(i).p() && k39Var4.d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                rc2 rc2Var = j67Var.Q;
                if (rc2Var != null) {
                    k47 messageObject = rc2Var.getMessageObject();
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.k;
                        long j3 = message.effect;
                        long j4 = k39Var4.c;
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
                            rc2 rc2Var2 = j67Var.Q;
                            j2 = j3;
                            f47 j5 = j67Var.j(messageObject);
                            if (j67Var.N.size() > 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            rc2Var2.z3(messageObject, j5, z6, false, false, false);
                            b67 b67Var2 = j67Var.e0;
                            if (z5) {
                                k39Var3 = null;
                            } else {
                                k39Var3 = k39Var4;
                            }
                            b67Var2.setSelectedReactionAnimated(k39Var3);
                            if (j67Var.e0.getReactionsWindow() != null && j67Var.e0.getReactionsWindow().m != null) {
                                t53 t53Var = j67Var.e0.getReactionsWindow().m;
                                if (z5) {
                                    k39Var4 = null;
                                }
                                t53Var.setSelectedReaction(k39Var4);
                                j67Var.e0.getReactionsWindow().a.invalidate();
                            }
                        } else {
                            j2 = j3;
                        }
                        z57Var.c();
                        if (!z5) {
                            z57Var.n(j67Var.Q, 0, false, false);
                        }
                        if (z3) {
                            TLRPC.Message message2 = messageObject.k;
                            message2.effect = j2;
                            if (j2 == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        a67 a67Var = j67Var.X;
                        if (a67Var != null) {
                            a67Var.setEffect(messageObject.k.effect);
                        }
                        j67Var.m(messageObject.k.effect);
                    } else {
                        return;
                    }
                } else if (j67Var.l0 != null) {
                    long j6 = k39Var4.c;
                    if (j6 == j67Var.I) {
                        j67Var.I = 0L;
                        z4 = true;
                        j = 0;
                    } else {
                        j67Var.I = j6;
                        j = j6;
                        z4 = false;
                    }
                    a67 a67Var2 = j67Var.X;
                    if (a67Var2 != null) {
                        a67Var2.setEffect(j);
                    }
                    j67Var.m(j67Var.I);
                    if (!z3) {
                        if (j67Var.I == 0) {
                            Y0 = null;
                        } else {
                            Y0 = oc7.r1(i).Y0(j67Var.I);
                        }
                        tm tmVar = j67Var.J;
                        if (tmVar != null) {
                            if (j67Var.I != 0 && Y0 != null) {
                                tmVar.g(gw3.g(Y0.emoticon), true);
                            } else {
                                tmVar.g(null, true);
                            }
                        }
                        b67 b67Var3 = j67Var.e0;
                        if (z4) {
                            k39Var2 = null;
                        } else {
                            k39Var2 = k39Var4;
                        }
                        b67Var3.setSelectedReactionAnimated(k39Var2);
                        if (j67Var.e0.getReactionsWindow() != null && j67Var.e0.getReactionsWindow().m != null) {
                            t53 t53Var2 = j67Var.e0.getReactionsWindow().m;
                            if (z4) {
                                k39Var4 = null;
                            }
                            t53Var2.setSelectedReaction(k39Var4);
                            j67Var.e0.getReactionsWindow().a.invalidate();
                        }
                    }
                    z57Var.c();
                    if (!z4) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        long j7 = j67Var.I;
                        tL_message.effect = j7;
                        if (j7 != 0) {
                            tL_message.flags2 |= 4;
                        }
                        j67Var.a0.d(null, 0, null, new k47(i, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                    }
                }
                if (z3 && (dVar = this.a) != null) {
                    new c41(j67Var.G, j67Var.b).Q(2131624211, 36, gm.N2(jb6.M0(2131754218, null), -1, 2, new ww1(dVar, (byte) 3), null)).j();
                }
                j67Var.H.invalidate();
            }
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
