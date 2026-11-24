package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sc7 extends q59 implements jm7 {
    public u3b E;
    public final Context c;
    public final yv1 f;
    public int h;
    public int n;
    public final ylb s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = z8c.t0;
    public final pg6 F = new pg6(this, (byte) 23);

    public sc7(Context context, yv1 yv1Var, ylb ylbVar, int i, boolean z) {
        this.s = ylbVar;
        this.c = context;
        this.f = yv1Var;
        this.w = i;
        this.x = z;
    }

    public final Object E(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                return arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override
    public final int d(int i) {
        if (i < this.e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b = b();
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i = this.w;
        int i2 = this.r;
        if (i == 0) {
            arrayList = hs6.d0(i2).Z0;
        } else {
            arrayList = af5.a(i2).b(i).a;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            k47 k47Var = (k47) arrayList.get(i4);
            if ((!k47Var.z2() || k47Var.S2) && !hashSet.contains(Integer.valueOf(k47Var.e1()))) {
                arrayList2.add(k47Var);
                hashSet.add(Integer.valueOf(k47Var.e1()));
            }
        }
        int i5 = this.n;
        this.h = arrayList2.size();
        if (i != 0) {
            if (!af5.a(i2).b(i).n && this.h != 0) {
                i3 = Utilities.j(af5.a(i2).b(i).m - this.h, 3, 0);
            }
            this.n = i3;
        } else {
            if (!hs6.d0(i2).Y1() && this.h != 0) {
                i3 = Utilities.j(hs6.d0(i2).k0() - this.h, 3, 0);
            }
            this.n = i3;
        }
        int b2 = b();
        if (b < b2) {
            if (i5 > 0) {
                l(b - i5, i5);
            }
            p(b, b2 - b);
            return;
        }
        super.f();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        int i2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 0) {
            hg3 hg3Var = (hg3) view;
            hg3Var.t2 = true;
            k47 k47Var = (k47) E(i);
            long B0 = k47.B0(k47Var.k);
            int i4 = k47Var.k.date;
            if (this.x) {
                hg3Var.s0 = true;
                long P1 = k47Var.P1();
                TLRPC.Message message = k47Var.k;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null) {
                    i2 = messageFwdHeader.date;
                    if (i2 == 0) {
                        int i5 = messageFwdHeader.saved_date;
                        if (i5 != 0) {
                            i2 = i5;
                        }
                    }
                    z = false;
                    B0 = P1;
                }
                i2 = message.date;
                z = false;
                B0 = P1;
            } else {
                if (k47Var.O3() || sd2.o0(this.r, B0)) {
                    B0 = k47Var.Z0();
                }
                z = true;
                i2 = i4;
            }
            hg3Var.e0(B0, k47Var, i2, z, false);
            hg3Var.setDialogCellDelegate(new pc7(this));
        } else if (i3 == 2) {
            ((rc7) view).a(this.E);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        tk4 hg3Var;
        Context context = this.c;
        if (i != 0) {
            ylb ylbVar = this.s;
            if (i != 1) {
                if (i != 2) {
                    hg3Var = null;
                } else {
                    hg3Var = new rc7(context, ylbVar);
                }
            } else {
                tk4 tk4Var = new tk4(context, ylbVar);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(7);
                hg3Var = tk4Var;
            }
        } else {
            hg3Var = new hg3(null, context, true, this.r, this.s);
        }
        return kt6.h(hg3Var, hg3Var, -1, -2);
    }
}
