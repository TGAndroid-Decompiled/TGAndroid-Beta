package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class gm1 implements uq5, yq5, ee, ta2, ue7, z19, ResultCallback, oy4, j02, v51, w51, ic5, su2, h59 {
    public final byte a;
    public final yv1 b;

    public gm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void a() {
        yv1 yv1Var = this.b;
        if (yv1Var.N3 == null && yv1Var.getParentActivity() != null) {
            yv1Var.i6();
            yv1Var.N3.m(yv1Var.f, 8, yv1Var.l6);
        }
    }

    @Override
    public final void b(TLRPC.Document document) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 4:
                yv1Var.r8(document);
                return;
            default:
                yv1Var.s8(document);
                return;
        }
    }

    @Override
    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                yv1 yv1Var = this.b;
                if (yv1Var.getParentActivity() != null && yv1Var.getParentActivity() != null) {
                    lq1 lq1Var = new lq1(yv1Var, yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
                    boolean Y7 = yv1Var.Y7();
                    lq1Var.i0 = Y7;
                    lq1Var.n = Y7;
                    lq1Var.p0 = false;
                    yv1Var.N5(false);
                    yv1Var.showDialog(lq1Var);
                    return;
                }
                return;
            default:
                yv1 yv1Var2 = this.b;
                if (yv1Var2.getParentActivity() != null && yv1Var2.getParentActivity() != null) {
                    gr1 gr1Var = new gr1(yv1Var2, yv1Var2, yv1Var2.getParentActivity(), yv1Var2.Ba, arrayList);
                    boolean Y72 = yv1Var2.Y7();
                    gr1Var.i0 = Y72;
                    gr1Var.n = Y72;
                    gr1Var.p0 = false;
                    yv1Var2.N5(false);
                    yv1Var2.showDialog(gr1Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(boolean z, boolean z2) {
        yv1 yv1Var = this.b;
        yv1Var.b1.j(yv1Var.Ca.b(), z, z2);
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        yv1 yv1Var = this.b;
        yv1Var.getMessagesController().l(yv1Var.e, yv1Var, arrayList, i, null, null, null);
        yv1Var.getMessagesController().e2(yv1Var.l6, yv1Var.f, yv1Var.e);
        yv1Var.zd(true);
        yv1Var.Wc(true);
    }

    @Override
    public final boolean g(int i, View view) {
        yv1 yv1Var = this.b;
        boolean z = false;
        if (yv1Var.getParentActivity() != null) {
            k17 adapter = yv1Var.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i != 0) {
                k17 adapter2 = yv1Var.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = yv1Var.X1.getAdapter().J(i - 1);
                if (J instanceof h17) {
                    h17 h17Var = (h17) J;
                    if (yv1Var.X1.getAdapter().K != null && d6c.h) {
                        yv1Var.a0.setFieldText("");
                        ms1 ms1Var = yv1Var.a0;
                        String str = h17Var.a;
                        TLRPC.Chat chat = yv1Var.e;
                        if (chat != null && chat.megagroup) {
                            z = true;
                        }
                        ms1Var.E1(null, str, true, z);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (yv1Var.X1.getAdapter().K != null) {
                        if (d6c.h) {
                            yv1Var.a0.setFieldText("");
                            ms1 ms1Var2 = yv1Var.a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = yv1Var.e;
                            if (chat2 != null && chat2.megagroup) {
                                z = true;
                            }
                            ms1Var2.E1(null, str2, true, z);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.Ba, yv1Var.getParentActivity());
                        String M0 = jb6.M0(2131689472, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131751999, null);
                        alertDialog$Builder.j(jb6.M0(2131752036, null), new gm1(yv1Var, (byte) 12));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        yv1Var.showDialog(heVar);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void h(int i) {
        yv1 yv1Var = this.b;
        if (i == 1) {
            yv1Var.ja();
        } else if (i == 2) {
            yv1Var.W9();
        } else if (i == 3) {
            yv1Var.R4 = true;
            yv1Var.getMessagesController().u1(yv1Var.l6, yv1Var.d(), yv1Var.A1, true, new io1(yv1Var, (byte) 0));
        } else if (i == 4) {
            yv1Var.R4 = true;
            yv1Var.getMessagesController().u1(yv1Var.l6, yv1Var.d(), yv1Var.B1, false, new io1(yv1Var, (byte) 1));
        } else if (i == 6) {
            yv1Var.y7(true);
        } else if (i == 5) {
            yv1Var.y7(false);
        } else if (i == 0) {
            e51 e51Var = yv1Var.Y1;
            if (e51Var != null) {
                e51Var.r1(0, null);
            }
            yv1Var.ma();
        }
    }

    @Override
    public final void onComplete(Object obj) {
        boolean z;
        tz3 tz3Var = (tz3) obj;
        yv1 yv1Var = this.b;
        wv1 wv1Var = yv1Var.Ba;
        TLRPC.WallPaper wallPaper = wv1Var.g;
        if (yv1Var.h6 != 0) {
            z = true;
        } else {
            z = false;
        }
        wv1Var.q(tz3Var, wallPaper, z, null, false);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 2:
                rs1 rs1Var = yv1Var.E0;
                if (rs1Var != null) {
                    rs1Var.callOnClick();
                    return;
                }
                return;
            case 3:
                yv1Var.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            case 19:
            default:
                k47 k47Var = (k47) yv1Var.X4.get(Integer.valueOf(yv1Var.Z4));
                if (k47Var == null) {
                    k47Var = (k47) yv1Var.G6[0].get(yv1Var.Z4);
                }
                yv1Var.Jc(k47Var);
                return;
            case 6:
                o47 o47Var = yv1Var.x5;
                if (o47Var != null) {
                    o47Var.d(null, yv1Var.l6);
                }
                yv1Var.D6();
                return;
            case 7:
                yv1Var.ra(1);
                return;
            case 8:
                yv1Var.getMessagesController().n5(null, yv1Var.f.id);
                return;
            case 10:
                yv1Var.finishFragment();
                return;
            case 12:
                k17 adapter = yv1Var.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                p17 p17Var = adapter.W;
                if (p17Var != null) {
                    p17Var.a(false);
                    return;
                }
                return;
            case 15:
                yv1Var.getClass();
                yv1Var.showDialog(new wt1(yv1Var, yv1Var.getParentActivity(), yv1Var));
                return;
            case 16:
                yv1Var.i6();
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                yv1Var.getLocationController().k(yv1Var.l6);
                return;
            case 20:
                o47 o47Var2 = yv1Var.x5;
                if (o47Var2 != null && o47Var2.d != null) {
                    yv1Var.ra(0);
                    return;
                }
                return;
            case 21:
                yv1Var.E7(true);
                return;
        }
    }

    @Override
    public final void s(int i) {
        this.b.N7(i);
    }

    @Override
    public final void z(boolean z) {
        yv1 yv1Var = this.b;
        nm7 notificationCenter = yv1Var.getNotificationCenter();
        int i = nm7.s;
        notificationCenter.n(yv1Var, i);
        yv1Var.getNotificationCenter().k(i, new Object[0]);
        yv1Var.finishFragment();
        yv1Var.getNotificationCenter().k(nm7.K2, Long.valueOf(yv1Var.l6), yv1Var.f, yv1Var.e, Boolean.valueOf(z));
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    @Override
    public final void d(TLRPC.User user) {
    }

    @Override
    public final void onError(Throwable th) {
    }
}
