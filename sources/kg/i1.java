package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ei.l6;
import gi.f6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.ha;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.wm;
public final class i1 extends sj0 implements cs {
    public l6 E;
    public final Context f17043c;
    public final wm f17045f;
    public int h;
    public int f17046n;
    public final e6 f17048s;
    public final int f17049w;
    public final boolean f17050x;
    public String f17051y;
    public final HashSet d = new HashSet();
    public final ArrayList f17044e = new ArrayList();
    public final int f17047r = h10.f22829t0;
    public final f6 F = new f6(this, 27);

    public i1(Context context, wm wmVar, e6 e6Var, int i3, boolean z10) {
        this.f17048s = e6Var;
        this.f17043c = context;
        this.f17045f = wmVar;
        this.f17049w = i3;
        this.f17050x = z10;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f17044e;
            if (i3 < arrayList.size()) {
                return arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.f17044e.size() + this.f17046n;
    }

    @Override
    public final int d(int i3) {
        if (i3 < this.f17044e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23338x5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b10 = b();
        ArrayList arrayList2 = this.f17044e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i3 = this.f17047r;
        int i10 = this.f17049w;
        if (i10 == 0) {
            arrayList = li.b0(i3).Z0;
        } else {
            arrayList = ha.a(i3).b(i10).f22679a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            zi ziVar = (zi) arrayList.get(i12);
            if ((!ziVar.A2() || ziVar.Q2) && !hashSet.contains(Integer.valueOf(ziVar.f1()))) {
                arrayList2.add(ziVar);
                hashSet.add(Integer.valueOf(ziVar.f1()));
            }
        }
        int i13 = this.f17046n;
        this.h = arrayList2.size();
        if (i10 != 0) {
            if (!ha.a(i3).b(i10).f22690n && this.h != 0) {
                i11 = Utilities.j(ha.a(i3).b(i10).f22689m - this.h, 3, 0);
            }
            this.f17046n = i11;
        } else {
            if (!li.b0(i3).W1() && this.h != 0) {
                i11 = Utilities.j(li.b0(i3).j0() - this.h, 3, 0);
            }
            this.f17046n = i11;
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
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10;
        int i11;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i12 == 0) {
            t2 t2Var = (t2) view;
            t2Var.f30561t2 = true;
            zi ziVar = (zi) E(i3);
            long B0 = zi.B0(ziVar.f26868k);
            int i13 = ziVar.f26868k.date;
            if (this.f17050x) {
                t2Var.f30554s0 = true;
                long Q1 = ziVar.Q1();
                TLRPC.Message message = ziVar.f26868k;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i10 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i10 == 0) {
                        i11 = messageFwdHeader.saved_date;
                    }
                    z10 = false;
                    B0 = Q1;
                } else {
                    i11 = message.date;
                }
                i10 = i11;
                z10 = false;
                B0 = Q1;
            } else {
                if (ziVar.Q3() || t3.o0(this.f17047r, B0)) {
                    B0 = ziVar.Z0();
                }
                z10 = true;
                i10 = i13;
            }
            t2Var.d0(B0, ziVar, i10, z10, false);
            t2Var.setDialogCellDelegate(new f1(this));
        } else if (i12 == 2) {
            ((h1) view).a(this.E);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View t2Var;
        iz izVar;
        if (i3 != 0) {
            e6 e6Var = this.f17048s;
            Context context = this.f17043c;
            if (i3 != 1) {
                if (i3 != 2) {
                    t2Var = null;
                } else {
                    izVar = new h1(context, e6Var);
                }
            } else {
                iz izVar2 = new iz(context, e6Var);
                izVar2.setIsSingleCell(true);
                izVar2.setViewType(7);
                izVar = izVar2;
            }
            t2Var = izVar;
        } else {
            t2Var = new t2(null, this.f17043c, true, this.f17047r, this.f17048s);
        }
        return k2.p1.p(t2Var, t2Var, -1, -2);
    }
}
