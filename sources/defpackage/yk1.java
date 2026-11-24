package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class yk1 implements uo5, yo5, ed, h92, sc7, xz8, ResultCallback, mw4, wy1, o41, p41, ka5, ht2, e39 {
    public final byte a;
    public final mu1 b;

    public yk1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void a() {
        mu1 mu1Var = this.b;
        if (mu1Var.N3 == null && mu1Var.getParentActivity() != null) {
            mu1Var.Z5();
            mu1Var.N3.m(mu1Var.f, 8, mu1Var.l6);
        }
    }

    @Override
    public final void b(TLRPC.Document document) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 4:
                mu1Var.f8(document);
                return;
            default:
                mu1Var.g8(document);
                return;
        }
    }

    @Override
    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 11:
                mu1 mu1Var = this.b;
                if (mu1Var.getParentActivity() != null && mu1Var.getParentActivity() != null) {
                    xo1 xo1Var = new xo1(mu1Var, mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
                    boolean O7 = mu1Var.O7();
                    xo1Var.i0 = O7;
                    xo1Var.n = O7;
                    xo1Var.p0 = false;
                    mu1Var.F5(false);
                    mu1Var.showDialog(xo1Var);
                    return;
                }
                return;
            default:
                mu1 mu1Var2 = this.b;
                if (mu1Var2.getParentActivity() != null && mu1Var2.getParentActivity() != null) {
                    tp1 tp1Var = new tp1(mu1Var2, mu1Var2, mu1Var2.getParentActivity(), mu1Var2.Ba, arrayList);
                    boolean O72 = mu1Var2.O7();
                    tp1Var.i0 = O72;
                    tp1Var.n = O72;
                    tp1Var.p0 = false;
                    mu1Var2.F5(false);
                    mu1Var2.showDialog(tp1Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(int i, View view) {
        mu1 mu1Var = this.b;
        boolean z = false;
        if (mu1Var.getParentActivity() != null) {
            kz6 adapter = mu1Var.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i != 0) {
                kz6 adapter2 = mu1Var.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = mu1Var.X1.getAdapter().J(i - 1);
                if (J instanceof hz6) {
                    hz6 hz6Var = (hz6) J;
                    if (mu1Var.X1.getAdapter().K != null && d4c.h) {
                        mu1Var.a0.setFieldText("");
                        ar1 ar1Var = mu1Var.a0;
                        String str = hz6Var.a;
                        TLRPC.Chat chat = mu1Var.e;
                        if (chat != null && chat.megagroup) {
                            z = true;
                        }
                        ar1Var.B1(null, str, true, z);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (mu1Var.X1.getAdapter().K != null) {
                        if (d4c.h) {
                            mu1Var.a0.setFieldText("");
                            ar1 ar1Var2 = mu1Var.a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = mu1Var.e;
                            if (chat2 != null && chat2.megagroup) {
                                z = true;
                            }
                            ar1Var2.B1(null, str2, true, z);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                        String M0 = k96.M0(2131689472, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131752050, null);
                        alertDialog$Builder.j(k96.M0(2131752087, null), new yk1(mu1Var, (byte) 12));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        mu1Var.showDialog(hdVar);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        mu1 mu1Var = this.b;
        mu1Var.getMessagesController().l(mu1Var.e, mu1Var, arrayList, i, null, null, null);
        mu1Var.getMessagesController().d2(mu1Var.l6, mu1Var.f, mu1Var.e);
        mu1Var.ld(true);
        mu1Var.Ic(true);
    }

    @Override
    public final void g(int i) {
        mu1 mu1Var = this.b;
        if (i == 1) {
            mu1Var.X9();
        } else if (i == 2) {
            mu1Var.K9();
        } else if (i == 3) {
            mu1Var.R4 = true;
            mu1Var.getMessagesController().t1(mu1Var.l6, mu1Var.d(), mu1Var.A1, true, new sm1(mu1Var, (byte) 0));
        } else if (i == 4) {
            mu1Var.R4 = true;
            mu1Var.getMessagesController().t1(mu1Var.l6, mu1Var.d(), mu1Var.B1, false, new sm1(mu1Var, (byte) 1));
        } else if (i == 6) {
            mu1Var.o7(true);
        } else if (i == 5) {
            mu1Var.o7(false);
        } else if (i == 0) {
            x31 x31Var = mu1Var.Y1;
            if (x31Var != null) {
                x31Var.r1(0, null);
            }
            mu1Var.aa();
        }
    }

    @Override
    public final void h(boolean z, boolean z2) {
        mu1 mu1Var = this.b;
        mu1Var.b1.j(mu1Var.Ca.b(), z, z2);
    }

    @Override
    public final void j(int i) {
        this.b.D7(i);
    }

    @Override
    public final void k(boolean z) {
        mu1 mu1Var = this.b;
        kk7 notificationCenter = mu1Var.getNotificationCenter();
        int i = kk7.s;
        notificationCenter.n(mu1Var, i);
        mu1Var.getNotificationCenter().k(i, new Object[0]);
        mu1Var.finishFragment();
        mu1Var.getNotificationCenter().k(kk7.J2, Long.valueOf(mu1Var.l6), mu1Var.f, mu1Var.e, Boolean.valueOf(z));
    }

    @Override
    public final void onComplete(Object obj) {
        boolean z;
        jy3 jy3Var = (jy3) obj;
        mu1 mu1Var = this.b;
        ku1 ku1Var = mu1Var.Ba;
        TLRPC.WallPaper wallPaper = ku1Var.g;
        if (mu1Var.h6 != 0) {
            z = true;
        } else {
            z = false;
        }
        ku1Var.q(jy3Var, wallPaper, z, null, false);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 2:
                fr1 fr1Var = mu1Var.E0;
                if (fr1Var != null) {
                    fr1Var.callOnClick();
                    return;
                }
                return;
            case 3:
                mu1Var.finishFragment();
                return;
            case 4:
            case 5:
            case 9:
            case 11:
            case 13:
            case 14:
            case 18:
            default:
                k27 k27Var = (k27) mu1Var.X4.get(Integer.valueOf(mu1Var.Z4));
                if (k27Var == null) {
                    k27Var = (k27) mu1Var.G6[0].get(mu1Var.Z4);
                }
                mu1Var.vc(k27Var);
                return;
            case 6:
                o27 o27Var = mu1Var.x5;
                if (o27Var != null) {
                    o27Var.d(null, mu1Var.l6);
                }
                mu1Var.u6();
                return;
            case 7:
                mu1Var.fa(1);
                return;
            case 8:
                mu1Var.getMessagesController().k5(null, mu1Var.f.id);
                return;
            case 10:
                mu1Var.finishFragment();
                return;
            case 12:
                kz6 adapter = mu1Var.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                pz6 pz6Var = adapter.W;
                if (pz6Var != null) {
                    pz6Var.a(false);
                    return;
                }
                return;
            case 15:
                mu1Var.getClass();
                mu1Var.showDialog(new js1(mu1Var, mu1Var.getParentActivity(), mu1Var));
                return;
            case 16:
                mu1Var.Z5();
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 17:
                mu1Var.getLocationController().k(mu1Var.l6);
                return;
            case 19:
                o27 o27Var2 = mu1Var.x5;
                if (o27Var2 != null && o27Var2.d != null) {
                    mu1Var.fa(0);
                    return;
                }
                return;
            case 20:
                mu1Var.u7(true);
                return;
        }
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    @Override
    public final void e(TLRPC.User user) {
    }

    @Override
    public final void onError(Throwable th) {
    }
}
