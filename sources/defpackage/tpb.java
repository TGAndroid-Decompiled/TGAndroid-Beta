package defpackage;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.p;
public final class tpb implements hm2 {
    public final pqb a;

    public tpb(pqb pqbVar) {
        this.a = pqbVar;
    }

    @Override
    public final void a(boolean z) {
        int i;
        int i2;
        pqb pqbVar = this.a;
        ynb ynbVar = pqbVar.w;
        if (z) {
            if (ynbVar.r == null) {
                pqbVar.finishFragment();
                i2 = ((e) pqbVar).currentAccount;
                uc7.s1(i2).J4(ynbVar.b, ynbVar);
                jn7.e().k(jn7.v4, ynbVar.b, ynbVar);
                return;
            }
            StringBuilder sb = new StringBuilder("https://");
            i = ((e) pqbVar).currentAccount;
            sb.append(uc7.s1(i).N2);
            sb.append("/addtheme/");
            sb.append(ynbVar.r.slug);
            String sb2 = sb.toString();
            pqbVar.showDialog(new kea(pqbVar.getParentActivity(), null, sb2, false, sb2, false, null));
            return;
        }
        jj.T(pqbVar, 1, null, null);
    }

    @Override
    public final void b() {
        pqb pqbVar = this.a;
        if (pqbVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pqbVar.getParentActivity());
            String M0 = ob6.M0(2131751449, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131751450, null);
            alertDialog$Builder.j(ob6.M0(2131751563, null), new hja(this, (byte) 28));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            pqbVar.showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, pqbVar.a);
            }
        }
    }

    @Override
    public final void c(int i, int i2, boolean z) {
        pqb pqbVar = this.a;
        if (pqbVar.b == 2) {
            pqbVar.f1(i, i2, true);
            return;
        }
        Runnable runnable = pqbVar.a0;
        ynb ynbVar = pqbVar.w;
        if (i2 == -1) {
            int i3 = pqbVar.n;
            if (i3 == 1 || i3 == 2) {
                long j = pqbVar.K;
                if (j != 0) {
                    ynbVar.j = j;
                } else {
                    ynbVar.j = 0L;
                }
                long j2 = pqbVar.L;
                if (j2 != 0) {
                    ynbVar.k = j2;
                } else {
                    ynbVar.k = 0L;
                }
                long j3 = pqbVar.M;
                if (j3 != 0) {
                    ynbVar.l = j3;
                } else {
                    ynbVar.l = 0L;
                }
                long j4 = pqbVar.N;
                if (j4 != 0) {
                    ynbVar.m = j4;
                } else {
                    ynbVar.m = 0L;
                }
                ynbVar.n = pqbVar.Q;
                if (i3 == 2) {
                    int C0 = aob.C0(aob.Ee);
                    int C02 = aob.C0(aob.Fe);
                    int C03 = aob.C0(aob.Ge);
                    int C04 = aob.C0(aob.He);
                    int i4 = (int) ynbVar.k;
                    int i5 = (int) ynbVar.l;
                    int i6 = (int) ynbVar.m;
                    int i7 = (int) ynbVar.j;
                    p pVar = pqbVar.X;
                    if (i6 != 0) {
                        C04 = i6;
                    }
                    pVar.e(C04, 3);
                    p pVar2 = pqbVar.X;
                    if (i5 != 0) {
                        C03 = i5;
                    }
                    pVar2.e(C03, 2);
                    p pVar3 = pqbVar.X;
                    if (i4 != 0) {
                        C02 = i4;
                    }
                    pVar3.e(C02, 1);
                    p pVar4 = pqbVar.X;
                    if (i7 != 0) {
                        C0 = i7;
                    }
                    pVar4.e(C0, 0);
                }
            }
            int i8 = pqbVar.n;
            if (i8 == 1 || i8 == 3) {
                int i9 = pqbVar.F;
                if (i9 != 0) {
                    ynbVar.e = i9;
                } else {
                    ynbVar.e = 0;
                }
                int i10 = pqbVar.G;
                if (i10 != 0) {
                    ynbVar.f = i10;
                } else {
                    ynbVar.f = 0;
                }
                int i11 = pqbVar.H;
                if (i11 != 0) {
                    ynbVar.g = i11;
                } else {
                    ynbVar.g = 0;
                }
                int i12 = pqbVar.I;
                if (i12 != 0) {
                    ynbVar.h = i12;
                } else {
                    ynbVar.h = 0;
                    i12 = 0;
                }
                if (i8 == 3) {
                    pqbVar.X.e(i12, 3);
                    pqbVar.X.e(ynbVar.g, 2);
                    pqbVar.X.e(ynbVar.f, 1);
                    p pVar5 = pqbVar.X;
                    int i13 = ynbVar.e;
                    if (i13 == 0) {
                        i13 = ynbVar.c;
                    }
                    pVar5.e(i13, 0);
                }
            }
            aob.r1(false, false);
            pqbVar.w0.i1();
            return;
        }
        int i14 = pqbVar.Z;
        if (i14 != -1 && i14 != i2) {
            runnable.run();
        }
        pqbVar.Y = i;
        pqbVar.Z = i2;
        if (z) {
            runnable.run();
        } else if (!pqbVar.b0) {
            pqbVar.b0 = true;
            pqbVar.fragmentView.postDelayed(runnable, 16L);
        }
    }

    @Override
    public final int d(int i) {
        ynb ynbVar;
        pqb pqbVar = this.a;
        if (pqbVar.n == 3) {
            znb znbVar = pqbVar.g0;
            if (znbVar.T && i == 0 && (ynbVar = (ynb) znbVar.b0.get(aob.n)) != null) {
                return ynbVar.e;
            }
            return 0;
        }
        return 0;
    }
}
