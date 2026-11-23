package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.b6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ma;
import org.telegram.messenger.ri;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.bn;
public final class l1 extends dk0 implements fs {
    public b6 E;
    public final Context f17660c;
    public final bn f17662f;
    public int h;
    public int f17663n;
    public final i6 f17665s;
    public final int f17666w;
    public final boolean f17667x;
    public String f17668y;
    public final HashSet d = new HashSet();
    public final ArrayList f17661e = new ArrayList();
    public final int f17664r = i10.f24637t0;
    public final hi.w F = new hi.w(this, 26);

    public l1(Context context, bn bnVar, i6 i6Var, int i7, boolean z10) {
        this.f17665s = i6Var;
        this.f17660c = context;
        this.f17662f = bnVar;
        this.f17666w = i7;
        this.f17667x = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 0 && i7 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f17661e;
            if (i7 < arrayList.size()) {
                return arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.f17661e.size() + this.f17663n;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.f17661e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.A5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b10 = b();
        ArrayList arrayList2 = this.f17661e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.f17664r;
        int i10 = this.f17666w;
        if (i10 == 0) {
            arrayList = ri.d0(i7).Z0;
        } else {
            arrayList = ma.a(i7).b(i10).f25458a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            fj fjVar = (fj) arrayList.get(i12);
            if ((!fjVar.z2() || fjVar.S2) && !hashSet.contains(Integer.valueOf(fjVar.e1()))) {
                arrayList2.add(fjVar);
                hashSet.add(Integer.valueOf(fjVar.e1()));
            }
        }
        int i13 = this.f17663n;
        this.h = arrayList2.size();
        if (i10 != 0) {
            if (!ma.a(i7).b(i10).f25469n && this.h != 0) {
                i11 = Utilities.j(ma.a(i7).b(i10).f25468m - this.h, 3, 0);
            }
            this.f17663n = i11;
        } else {
            if (!ri.d0(i7).b2() && this.h != 0) {
                i11 = Utilities.j(ri.d0(i7).l0() - this.h, 3, 0);
            }
            this.f17663n = i11;
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
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i12 == 0) {
            u2 u2Var = (u2) view;
            u2Var.f32068t2 = true;
            fj fjVar = (fj) E(i7);
            long B0 = fj.B0(fjVar.f24073k);
            int i13 = fjVar.f24073k.date;
            if (this.f17667x) {
                u2Var.f32061s0 = true;
                long P1 = fjVar.P1();
                TLRPC.Message message = fjVar.f24073k;
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
                if (fjVar.P3() || v3.o0(this.f17664r, B0)) {
                    B0 = fjVar.Z0();
                }
                z10 = true;
                i10 = i13;
            }
            u2Var.f0(B0, fjVar, i10, z10, false);
            u2Var.setDialogCellDelegate(new i1(this));
        } else if (i12 == 2) {
            ((k1) view).a(this.E);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View u2Var;
        vz vzVar;
        if (i7 != 0) {
            i6 i6Var = this.f17665s;
            Context context = this.f17660c;
            if (i7 != 1) {
                if (i7 != 2) {
                    u2Var = null;
                } else {
                    vzVar = new k1(context, i6Var);
                }
            } else {
                vz vzVar2 = new vz(context, i6Var);
                vzVar2.setIsSingleCell(true);
                vzVar2.setViewType(7);
                vzVar = vzVar2;
            }
            u2Var = vzVar;
        } else {
            u2Var = new u2(null, this.f17660c, true, this.f17664r, this.f17665s);
        }
        return i5.c.q(u2Var, u2Var, -1, -2);
    }
}
