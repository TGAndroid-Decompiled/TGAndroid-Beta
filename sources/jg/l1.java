package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.b6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.na;
import org.telegram.messenger.si;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.bn;
public final class l1 extends dk0 implements gs {
    public b6 E;
    public final Context f17592c;
    public final bn f17594f;
    public int h;
    public int f17595n;
    public final h6 f17597s;
    public final int f17598w;
    public final boolean f17599x;
    public String f17600y;
    public final HashSet d = new HashSet();
    public final ArrayList f17593e = new ArrayList();
    public final int f17596r = k10.f24968t0;
    public final hi.l F = new hi.l(this, 26);

    public l1(Context context, bn bnVar, h6 h6Var, int i7, boolean z10) {
        this.f17597s = h6Var;
        this.f17592c = context;
        this.f17594f = bnVar;
        this.f17598w = i7;
        this.f17599x = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 0 && i7 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f17593e;
            if (i7 < arrayList.size()) {
                return arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.f17593e.size() + this.f17595n;
    }

    @Override
    public final int d(int i7) {
        if (i7 < this.f17593e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.A5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b10 = b();
        ArrayList arrayList2 = this.f17593e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.f17596r;
        int i10 = this.f17598w;
        if (i10 == 0) {
            arrayList = si.d0(i7).Z0;
        } else {
            arrayList = na.a(i7).b(i10).f25545a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            gj gjVar = (gj) arrayList.get(i12);
            if ((!gjVar.z2() || gjVar.S2) && !hashSet.contains(Integer.valueOf(gjVar.e1()))) {
                arrayList2.add(gjVar);
                hashSet.add(Integer.valueOf(gjVar.e1()));
            }
        }
        int i13 = this.f17595n;
        this.h = arrayList2.size();
        if (i10 != 0) {
            if (!na.a(i7).b(i10).f25556n && this.h != 0) {
                i11 = Utilities.j(na.a(i7).b(i10).f25555m - this.h, 3, 0);
            }
            this.f17595n = i11;
        } else {
            if (!si.d0(i7).b2() && this.h != 0) {
                i11 = Utilities.j(si.d0(i7).l0() - this.h, 3, 0);
            }
            this.f17595n = i11;
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
        int i12 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i12 == 0) {
            u2 u2Var = (u2) view;
            u2Var.f32018t2 = true;
            gj gjVar = (gj) E(i7);
            long B0 = gj.B0(gjVar.f24213k);
            int i13 = gjVar.f24213k.date;
            if (this.f17599x) {
                u2Var.f32011s0 = true;
                long P1 = gjVar.P1();
                TLRPC.Message message = gjVar.f24213k;
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
                if (gjVar.P3() || v3.o0(this.f17596r, B0)) {
                    B0 = gjVar.Z0();
                }
                z10 = true;
                i10 = i13;
            }
            u2Var.d0(B0, gjVar, i10, z10, false);
            u2Var.setDialogCellDelegate(new i1(this));
        } else if (i12 == 2) {
            ((k1) view).a(this.E);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View u2Var;
        yz yzVar;
        if (i7 != 0) {
            h6 h6Var = this.f17597s;
            Context context = this.f17592c;
            if (i7 != 1) {
                if (i7 != 2) {
                    u2Var = null;
                } else {
                    yzVar = new k1(context, h6Var);
                }
            } else {
                yz yzVar2 = new yz(context, h6Var);
                yzVar2.setIsSingleCell(true);
                yzVar2.setViewType(7);
                yzVar = yzVar2;
            }
            u2Var = yzVar;
        } else {
            u2Var = new u2(null, this.f17592c, true, this.f17596r, this.f17597s);
        }
        return i5.c.q(u2Var, u2Var, -1, -2);
    }
}
