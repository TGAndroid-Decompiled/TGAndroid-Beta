package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.d6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.na;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.an;
public final class l1 extends tj0 implements is {
    public d6 E;
    public final Context f17181c;
    public final an f17183f;
    public int h;
    public int f17184n;
    public final e6 f17186s;
    public final int f17187w;
    public final boolean f17188x;
    public String f17189y;
    public final HashSet d = new HashSet();
    public final ArrayList f17182e = new ArrayList();
    public final int f17185r = m10.f24934t0;
    public final hi.e1 F = new hi.e1(this, 22);

    public l1(Context context, an anVar, e6 e6Var, int i7, boolean z10) {
        this.f17186s = e6Var;
        this.f17181c = context;
        this.f17183f = anVar;
        this.f17187w = i7;
        this.f17188x = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 0 && i7 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f17182e;
            if (i7 < arrayList.size()) {
                return arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.f17182e.size() + this.f17184n;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.f17182e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25605x5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b10 = b();
        ArrayList arrayList2 = this.f17182e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.f17185r;
        int i10 = this.f17187w;
        if (i10 == 0) {
            arrayList = si.b0(i7).Z0;
        } else {
            arrayList = na.a(i7).b(i10).f24997a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            gj gjVar = (gj) arrayList.get(i12);
            if ((!gjVar.z2() || gjVar.S2) && !hashSet.contains(Integer.valueOf(gjVar.e1()))) {
                arrayList2.add(gjVar);
                hashSet.add(Integer.valueOf(gjVar.e1()));
            }
        }
        int i13 = this.f17184n;
        this.h = arrayList2.size();
        if (i10 != 0) {
            if (!na.a(i7).b(i10).f25008n && this.h != 0) {
                i11 = Utilities.j(na.a(i7).b(i10).f25007m - this.h, 3, 0);
            }
            this.f17184n = i11;
        } else {
            if (!si.b0(i7).W1() && this.h != 0) {
                i11 = Utilities.j(si.b0(i7).j0() - this.h, 3, 0);
            }
            this.f17184n = i11;
        }
        int b11 = b();
        if (b10 < b11) {
            if (i13 > 0) {
                k(b10 - i13, i13);
            }
            o(b10, b11 - b10);
            return;
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i12 == 0) {
            t2 t2Var = (t2) view;
            t2Var.f31637t2 = true;
            gj gjVar = (gj) E(i7);
            long B0 = gj.B0(gjVar.f23817k);
            int i13 = gjVar.f23817k.date;
            if (this.f17188x) {
                t2Var.f31630s0 = true;
                long P1 = gjVar.P1();
                TLRPC.Message message = gjVar.f23817k;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i10 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i10 == 0) {
                        i11 = messageFwdHeader.saved_date;
                    }
                    z10 = false;
                    B0 = P1;
                } else {
                    i11 = message.date;
                }
                i10 = i11;
                z10 = false;
                B0 = P1;
            } else {
                if (gjVar.P3() || t3.o0(this.f17185r, B0)) {
                    B0 = gjVar.Z0();
                }
                z10 = true;
                i10 = i13;
            }
            t2Var.f0(B0, gjVar, i10, z10, false);
            t2Var.setDialogCellDelegate(new i1(this));
        } else if (i12 == 2) {
            ((k1) view).a(this.E);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View t2Var;
        pz pzVar;
        if (i7 != 0) {
            e6 e6Var = this.f17186s;
            Context context = this.f17181c;
            if (i7 != 1) {
                if (i7 != 2) {
                    t2Var = null;
                } else {
                    pzVar = new k1(context, e6Var);
                }
            } else {
                pz pzVar2 = new pz(context, e6Var);
                pzVar2.setIsSingleCell(true);
                pzVar2.setViewType(7);
                pzVar = pzVar2;
            }
            t2Var = pzVar;
        } else {
            t2Var = new t2(null, this.f17181c, true, this.f17185r, this.f17186s);
        }
        return i5.c.q(t2Var, t2Var, -1, -2);
    }
}
