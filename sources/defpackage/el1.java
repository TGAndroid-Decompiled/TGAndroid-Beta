package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class el1 implements x92, fd, bf7, xq5, br5, l39, ry4, oz1, w41, x41, ResultCallback, t69, lc5, bu2, ev1, kk4 {
    public final byte a;
    public final zu1 b;

    public el1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void A(boolean z) {
        zu1 zu1Var = this.b;
        jn7 notificationCenter = zu1Var.getNotificationCenter();
        int i = jn7.s;
        notificationCenter.n(zu1Var, i);
        zu1Var.getNotificationCenter().k(i, new Object[0]);
        zu1Var.finishFragment();
        zu1Var.getNotificationCenter().k(jn7.K2, Long.valueOf(zu1Var.l6), zu1Var.f, zu1Var.e, Boolean.valueOf(z));
    }

    @Override
    public final void a() {
        zu1 zu1Var = this.b;
        if (zu1Var.N3 == null && zu1Var.getParentActivity() != null) {
            zu1Var.i6();
            zu1Var.N3.m(zu1Var.l6, zu1Var.f, 8);
        }
    }

    @Override
    public final void b(TLRPC.Document document) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.s8(document);
                return;
            default:
                zu1Var.t8(document);
                return;
        }
    }

    @Override
    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 9:
                zu1 zu1Var = this.b;
                if (zu1Var.getParentActivity() != null && zu1Var.getParentActivity() != null) {
                    hq1 hq1Var = new hq1(zu1Var, zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
                    boolean Y7 = zu1Var.Y7();
                    hq1Var.i0 = Y7;
                    hq1Var.n = Y7;
                    hq1Var.p0 = false;
                    zu1Var.M5(false);
                    zu1Var.showDialog(hq1Var);
                    return;
                }
                return;
            default:
                zu1 zu1Var2 = this.b;
                if (zu1Var2.getParentActivity() != null && zu1Var2.getParentActivity() != null) {
                    mp1 mp1Var = new mp1(zu1Var2, zu1Var2, zu1Var2.getParentActivity(), zu1Var2.Ba, arrayList);
                    boolean Y72 = zu1Var2.Y7();
                    mp1Var.i0 = Y72;
                    mp1Var.n = Y72;
                    mp1Var.p0 = false;
                    zu1Var2.M5(false);
                    zu1Var2.showDialog(mp1Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean e(int i, View view) {
        zu1 zu1Var = this.b;
        boolean z = false;
        if (zu1Var.getParentActivity() != null) {
            r17 adapter = zu1Var.X1.getAdapter();
            if ((adapter.J != null || adapter.K != null) && i != 0) {
                r17 adapter2 = zu1Var.X1.getAdapter();
                if (adapter2.x0 != null && !adapter2.i0) {
                    return false;
                }
                Object J = zu1Var.X1.getAdapter().J(i - 1);
                if (J instanceof o17) {
                    o17 o17Var = (o17) J;
                    if (zu1Var.X1.getAdapter().K != null && c8c.h) {
                        zu1Var.a0.setFieldText("");
                        nr1 nr1Var = zu1Var.a0;
                        String str = o17Var.a;
                        TLRPC.Chat chat = zu1Var.e;
                        if (chat != null && chat.megagroup) {
                            z = true;
                        }
                        nr1Var.L1(null, str, true, z);
                        return true;
                    }
                } else if (J instanceof String) {
                    if (zu1Var.X1.getAdapter().K != null) {
                        if (c8c.h) {
                            zu1Var.a0.setFieldText("");
                            nr1 nr1Var2 = zu1Var.a0;
                            String str2 = (String) J;
                            TLRPC.Chat chat2 = zu1Var.e;
                            if (chat2 != null && chat2.megagroup) {
                                z = true;
                            }
                            nr1Var2.L1(null, str2, true, z);
                            return true;
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.Ba, zu1Var.getParentActivity());
                        String M0 = ob6.M0(2131689472, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131752027, null);
                        alertDialog$Builder.j(ob6.M0(2131752064, null), new el1(zu1Var, (byte) 22));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        zu1Var.showDialog(idVar);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        zu1 zu1Var = this.b;
        zu1Var.getMessagesController().l(zu1Var.e, zu1Var, arrayList, i, null, null, null);
        zu1Var.getMessagesController().f2(zu1Var.l6, zu1Var.f, zu1Var.e);
        zu1Var.zd(true);
        zu1Var.Wc(true);
    }

    @Override
    public final void g(boolean z, boolean z2) {
        zu1 zu1Var = this.b;
        zu1Var.b1.j(zu1Var.Ca.b(), z, z2);
    }

    @Override
    public final void h(int i) {
        zu1 zu1Var = this.b;
        if (i == 1) {
            zu1Var.ka();
        } else if (i == 2) {
            zu1Var.X9();
        } else if (i == 3) {
            zu1Var.R4 = true;
            zu1Var.getMessagesController().v1(zu1Var.l6, zu1Var.c(), zu1Var.A1, true, new tm1(zu1Var, (byte) 0));
        } else if (i == 4) {
            zu1Var.R4 = true;
            zu1Var.getMessagesController().v1(zu1Var.l6, zu1Var.c(), zu1Var.B1, false, new tm1(zu1Var, (byte) 1));
        } else if (i == 6) {
            zu1Var.y7(true);
        } else if (i == 5) {
            zu1Var.y7(false);
        } else if (i == 0) {
            f41 f41Var = zu1Var.Y1;
            if (f41Var != null) {
                f41Var.s1(0, null);
            }
            zu1Var.na();
        }
    }

    @Override
    public final void k(int i) {
        this.b.N7(i);
    }

    @Override
    public final void onComplete(Object obj) {
        boolean z;
        ez3 ez3Var = (ez3) obj;
        zu1 zu1Var = this.b;
        xu1 xu1Var = zu1Var.Ba;
        TLRPC.WallPaper wallPaper = xu1Var.g;
        if (zu1Var.h6 != 0) {
            z = true;
        } else {
            z = false;
        }
        xu1Var.q(ez3Var, wallPaper, z, null, false);
    }

    @Override
    public final boolean run() {
        zu1 zu1Var = this.b;
        if (zu1Var.h == null && !zu1Var.a8()) {
            return false;
        }
        return true;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 2:
                v47 v47Var = zu1Var.x5;
                if (v47Var != null) {
                    v47Var.d(null, zu1Var.l6);
                }
                zu1Var.D6();
                return;
            case 3:
                zu1Var.sa(1);
                return;
            case 4:
                zu1Var.getMessagesController().t5(null, zu1Var.f.id);
                return;
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
            case 14:
            case 17:
            case 18:
            default:
                r17 adapter = zu1Var.X1.getAdapter();
                adapter.x.c();
                adapter.J.clear();
                adapter.f();
                w17 w17Var = adapter.W;
                if (w17Var != null) {
                    w17Var.a(false);
                    return;
                }
                return;
            case 6:
                zu1Var.finishFragment();
                return;
            case 10:
                zu1Var.getClass();
                zu1Var.showDialog(new xs1(zu1Var, zu1Var.getParentActivity(), zu1Var));
                return;
            case 11:
                zu1Var.i6();
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    undoView.j(75, 0L, null);
                    return;
                }
                return;
            case 13:
                zu1Var.getLocationController().k(zu1Var.l6);
                return;
            case 15:
                v47 v47Var2 = zu1Var.x5;
                if (v47Var2 != null && v47Var2.d != null) {
                    zu1Var.sa(0);
                    return;
                }
                return;
            case 16:
                zu1Var.E7(true);
                return;
            case 19:
                r47 r47Var = (r47) zu1Var.X4.get(Integer.valueOf(zu1Var.Z4));
                if (r47Var == null) {
                    r47Var = (r47) zu1Var.G6[0].get(zu1Var.Z4);
                }
                zu1Var.Jc(r47Var);
                return;
        }
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
