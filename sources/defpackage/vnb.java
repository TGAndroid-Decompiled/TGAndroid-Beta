package defpackage;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.p;
public final class vnb implements an2 {
    public final rob a;

    public vnb(rob robVar) {
        this.a = robVar;
    }

    @Override
    public final void a(boolean z) {
        int i;
        int i2;
        rob robVar = this.a;
        amb ambVar = robVar.w;
        if (z) {
            if (ambVar.r == null) {
                robVar.finishFragment();
                i2 = ((d) robVar).currentAccount;
                oc7.r1(i2).D4(ambVar.b, ambVar);
                nm7.e().k(nm7.w4, ambVar.b, ambVar);
                return;
            }
            StringBuilder sb = new StringBuilder("https://");
            i = ((d) robVar).currentAccount;
            sb.append(oc7.r1(i).N2);
            sb.append("/addtheme/");
            sb.append(ambVar.r.slug);
            String sb2 = sb.toString();
            robVar.showDialog(new tca(robVar.getParentActivity(), null, sb2, false, sb2, false, null));
            return;
        }
        ik.T(robVar, 1, null, null);
    }

    @Override
    public final void b() {
        rob robVar = this.a;
        if (robVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(robVar.getParentActivity());
            String M0 = jb6.M0(2131751421, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131751422, null);
            alertDialog$Builder.j(jb6.M0(2131751535, null), new wta(this, (byte) 19));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            robVar.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, robVar.a);
            }
        }
    }

    @Override
    public final void c(int i, int i2, boolean z) {
        rob robVar = this.a;
        if (robVar.b == 2) {
            robVar.f1(i, i2, true);
            return;
        }
        Runnable runnable = robVar.a0;
        amb ambVar = robVar.w;
        if (i2 == -1) {
            int i3 = robVar.n;
            if (i3 == 1 || i3 == 2) {
                long j = robVar.K;
                if (j != 0) {
                    ambVar.j = j;
                } else {
                    ambVar.j = 0L;
                }
                long j2 = robVar.L;
                if (j2 != 0) {
                    ambVar.k = j2;
                } else {
                    ambVar.k = 0L;
                }
                long j3 = robVar.M;
                if (j3 != 0) {
                    ambVar.l = j3;
                } else {
                    ambVar.l = 0L;
                }
                long j4 = robVar.N;
                if (j4 != 0) {
                    ambVar.m = j4;
                } else {
                    ambVar.m = 0L;
                }
                ambVar.n = robVar.Q;
                if (i3 == 2) {
                    int C0 = cmb.C0(cmb.De);
                    int C02 = cmb.C0(cmb.Ee);
                    int C03 = cmb.C0(cmb.Fe);
                    int C04 = cmb.C0(cmb.Ge);
                    int i4 = (int) ambVar.k;
                    int i5 = (int) ambVar.l;
                    int i6 = (int) ambVar.m;
                    int i7 = (int) ambVar.j;
                    p pVar = robVar.X;
                    if (i6 != 0) {
                        C04 = i6;
                    }
                    pVar.e(C04, 3);
                    p pVar2 = robVar.X;
                    if (i5 != 0) {
                        C03 = i5;
                    }
                    pVar2.e(C03, 2);
                    p pVar3 = robVar.X;
                    if (i4 != 0) {
                        C02 = i4;
                    }
                    pVar3.e(C02, 1);
                    p pVar4 = robVar.X;
                    if (i7 != 0) {
                        C0 = i7;
                    }
                    pVar4.e(C0, 0);
                }
            }
            int i8 = robVar.n;
            if (i8 == 1 || i8 == 3) {
                int i9 = robVar.F;
                if (i9 != 0) {
                    ambVar.e = i9;
                } else {
                    ambVar.e = 0;
                }
                int i10 = robVar.G;
                if (i10 != 0) {
                    ambVar.f = i10;
                } else {
                    ambVar.f = 0;
                }
                int i11 = robVar.H;
                if (i11 != 0) {
                    ambVar.g = i11;
                } else {
                    ambVar.g = 0;
                }
                int i12 = robVar.I;
                if (i12 != 0) {
                    ambVar.h = i12;
                } else {
                    ambVar.h = 0;
                    i12 = 0;
                }
                if (i8 == 3) {
                    robVar.X.e(i12, 3);
                    robVar.X.e(ambVar.g, 2);
                    robVar.X.e(ambVar.f, 1);
                    p pVar5 = robVar.X;
                    int i13 = ambVar.e;
                    if (i13 == 0) {
                        i13 = ambVar.c;
                    }
                    pVar5.e(i13, 0);
                }
            }
            cmb.r1(false, false);
            robVar.w0.h1();
            return;
        }
        int i14 = robVar.Z;
        if (i14 != -1 && i14 != i2) {
            runnable.run();
        }
        robVar.Y = i;
        robVar.Z = i2;
        if (z) {
            runnable.run();
        } else if (!robVar.b0) {
            robVar.b0 = true;
            robVar.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i) {
        amb ambVar;
        rob robVar = this.a;
        if (robVar.n == 3) {
            bmb bmbVar = robVar.g0;
            if (bmbVar.T && i == 0 && (ambVar = (amb) bmbVar.b0.get(cmb.n)) != null) {
                return ambVar.e;
            }
            return 0;
        }
        return 0;
    }
}
