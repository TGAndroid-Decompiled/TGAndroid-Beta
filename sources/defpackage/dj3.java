package defpackage;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dj3 {
    public final uj3 a;

    public dj3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    public final long a() {
        uj3 uj3Var = this.a;
        li3 li3Var = uj3Var.H3;
        if (li3Var != null && (li3Var.getFragment() instanceof tzb)) {
            return -((tzb) uj3Var.H3.getFragment()).a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i;
        uj3 uj3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uj3Var.getParentActivity());
        gx9 gx9Var = uj3Var.D0.e0;
        boolean z = gx9Var.O;
        id idVar = alertDialog$Builder.a;
        if (z && gx9Var.O()) {
            idVar.S = ob6.M0(2131752024, null);
            gx9 gx9Var2 = uj3Var.D0.e0;
            if (gx9Var2.O) {
                arrayList = gx9Var2.w0;
            } else {
                arrayList = gx9Var2.v0;
            }
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            idVar.U = ob6.G(i, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.j(ob6.M0(2131752066, null), new fd(this) {
                public final dj3 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i2) {
                    byte b = r2;
                    dj3 dj3Var = this.b;
                    switch (b) {
                        case 0:
                            dj3Var.a.D0.e0.E();
                            return;
                        default:
                            uj3 uj3Var2 = dj3Var.a;
                            boolean O = uj3Var2.D0.e0.O();
                            bj3 bj3Var = uj3Var2.D0;
                            if (O) {
                                bj3Var.e0.E();
                                return;
                            }
                            gx9 gx9Var3 = bj3Var.e0;
                            gx9Var3.k0.c();
                            gx9Var3.K.clear();
                            gx9Var3.f();
                            return;
                    }
                }
            });
        } else {
            idVar.S = ob6.M0(2131752021, null);
            idVar.U = ob6.M0(2131752026, null);
            alertDialog$Builder.j(ob6.M0(2131752064, null), new fd(this) {
                public final dj3 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i2) {
                    byte b = r2;
                    dj3 dj3Var = this.b;
                    switch (b) {
                        case 0:
                            dj3Var.a.D0.e0.E();
                            return;
                        default:
                            uj3 uj3Var2 = dj3Var.a;
                            boolean O = uj3Var2.D0.e0.O();
                            bj3 bj3Var = uj3Var2.D0;
                            if (O) {
                                bj3Var.e0.E();
                                return;
                            }
                            gx9 gx9Var3 = bj3Var.e0;
                            gx9Var3.k0.c();
                            gx9Var3.K.clear();
                            gx9Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        uj3Var.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, uj3Var.getResourceProvider());
        }
    }

    public final void c() {
        int i;
        bj3 bj3Var = this.a.D0;
        if (bj3Var != null) {
            i69 i69Var = bj3Var.g0;
            int i2 = bj3Var.V0;
            if (i2 > 0) {
                i = i2 + 1;
            } else {
                i = 0;
            }
            i69Var.b(i);
            bj3Var.V0 = bj3Var.e0.b();
        }
    }

    public final void d(boolean z, boolean z2) {
        uj3 uj3Var = this.a;
        if (uj3Var.D0.c0.getVisibility() == 0) {
            z2 = true;
        }
        if (uj3Var.l2 && uj3Var.m2) {
            bj3 bj3Var = uj3Var.D0;
            if (bj3Var.c0 != null) {
                if (!z && bj3Var.e0.b() == 0) {
                    uj3Var.D0.c0.e(false, z2);
                } else {
                    uj3Var.D0.c0.e(true, z2);
                }
            }
        }
        if (z && uj3Var.D0.e0.b() == 0) {
            bj3 bj3Var2 = uj3Var.D0;
            bj3Var2.g0.a();
            bj3Var2.b0.invalidate();
            bj3Var2.V0 = 0;
        }
    }
}
