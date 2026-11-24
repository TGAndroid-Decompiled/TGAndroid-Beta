package defpackage;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uj3 {
    public final nk3 a;

    public uj3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    public final long a() {
        nk3 nk3Var = this.a;
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null && (dj3Var.getFragment() instanceof sxb)) {
            return -((sxb) nk3Var.H3.getFragment()).a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i;
        nk3 nk3Var = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nk3Var.getParentActivity());
        ov9 ov9Var = nk3Var.D0.e0;
        boolean z = ov9Var.O;
        he heVar = alertDialog$Builder.a;
        if (z && ov9Var.O()) {
            heVar.S = jb6.M0(2131751996, null);
            ov9 ov9Var2 = nk3Var.D0.e0;
            if (ov9Var2.O) {
                arrayList = ov9Var2.w0;
            } else {
                arrayList = ov9Var2.v0;
            }
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            heVar.U = jb6.G(i, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.j(jb6.M0(2131752038, null), new ee(this) {
                public final uj3 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i2) {
                    byte b = r2;
                    uj3 uj3Var = this.b;
                    switch (b) {
                        case 0:
                            uj3Var.a.D0.e0.E();
                            return;
                        default:
                            nk3 nk3Var2 = uj3Var.a;
                            boolean O = nk3Var2.D0.e0.O();
                            sj3 sj3Var = nk3Var2.D0;
                            if (O) {
                                sj3Var.e0.E();
                                return;
                            }
                            ov9 ov9Var3 = sj3Var.e0;
                            ov9Var3.k0.c();
                            ov9Var3.K.clear();
                            ov9Var3.f();
                            return;
                    }
                }
            });
        } else {
            heVar.S = jb6.M0(2131751993, null);
            heVar.U = jb6.M0(2131751998, null);
            alertDialog$Builder.j(jb6.M0(2131752036, null), new ee(this) {
                public final uj3 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i2) {
                    byte b = r2;
                    uj3 uj3Var = this.b;
                    switch (b) {
                        case 0:
                            uj3Var.a.D0.e0.E();
                            return;
                        default:
                            nk3 nk3Var2 = uj3Var.a;
                            boolean O = nk3Var2.D0.e0.O();
                            sj3 sj3Var = nk3Var2.D0;
                            if (O) {
                                sj3Var.e0.E();
                                return;
                            }
                            ov9 ov9Var3 = sj3Var.e0;
                            ov9Var3.k0.c();
                            ov9Var3.K.clear();
                            ov9Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        nk3Var.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, nk3Var.getResourceProvider());
        }
    }

    public final void c() {
        int i;
        sj3 sj3Var = this.a.D0;
        if (sj3Var != null) {
            w49 w49Var = sj3Var.g0;
            int i2 = sj3Var.V0;
            if (i2 > 0) {
                i = i2 + 1;
            } else {
                i = 0;
            }
            w49Var.b(i);
            sj3Var.V0 = sj3Var.e0.b();
        }
    }

    public final void d(boolean z, boolean z2) {
        nk3 nk3Var = this.a;
        if (nk3Var.D0.c0.getVisibility() == 0) {
            z2 = true;
        }
        if (nk3Var.l2 && nk3Var.m2) {
            sj3 sj3Var = nk3Var.D0;
            if (sj3Var.c0 != null) {
                if (!z && sj3Var.e0.b() == 0) {
                    nk3Var.D0.c0.e(false, z2);
                } else {
                    nk3Var.D0.c0.e(true, z2);
                }
            }
        }
        if (z && nk3Var.D0.e0.b() == 0) {
            sj3 sj3Var2 = nk3Var.D0;
            sj3Var2.g0.a();
            sj3Var2.b0.invalidate();
            sj3Var2.V0 = 0;
        }
    }
}
