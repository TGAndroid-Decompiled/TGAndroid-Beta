package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ra7 extends n39 implements gk7 {
    public t1b E;
    public final Context c;
    public final mu1 f;
    public int h;
    public int n;
    public final wjb s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = y6c.t0;
    public final vl6 F = new vl6(this, (byte) 16);

    public ra7(Context context, mu1 mu1Var, wjb wjbVar, int i, boolean z) {
        this.s = wjbVar;
        this.c = context;
        this.f = mu1Var;
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
        if (i == kk7.z5 && objArr[0] == this.E) {
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
            arrayList = hq6.d0(i2).Z0;
        } else {
            arrayList = cd5.a(i2).b(i).a;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            k27 k27Var = (k27) arrayList.get(i4);
            if ((!k27Var.z2() || k27Var.S2) && !hashSet.contains(Integer.valueOf(k27Var.e1()))) {
                arrayList2.add(k27Var);
                hashSet.add(Integer.valueOf(k27Var.e1()));
            }
        }
        int i5 = this.n;
        this.h = arrayList2.size();
        if (i != 0) {
            if (!cd5.a(i2).b(i).n && this.h != 0) {
                i3 = Utilities.j(cd5.a(i2).b(i).m - this.h, 3, 0);
            }
            this.n = i3;
        } else {
            if (!hq6.d0(i2).Y1() && this.h != 0) {
                i3 = Utilities.j(hq6.d0(i2).k0() - this.h, 3, 0);
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
    public final void t(s49 s49Var, int i) {
        boolean z;
        int i2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 == 0) {
            ue3 ue3Var = (ue3) view;
            ue3Var.t2 = true;
            k27 k27Var = (k27) E(i);
            long B0 = k27.B0(k27Var.k);
            int i4 = k27Var.k.date;
            if (this.x) {
                ue3Var.s0 = true;
                long P1 = k27Var.P1();
                TLRPC.Message message = k27Var.k;
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
                if (k27Var.O3() || hc2.o0(this.r, B0)) {
                    B0 = k27Var.Z0();
                }
                z = true;
                i2 = i4;
            }
            ue3Var.f0(B0, k27Var, i2, z, false);
            ue3Var.setDialogCellDelegate(new oa7(this));
        } else if (i3 == 2) {
            ((qa7) view).a(this.E);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        pi4 ue3Var;
        Context context = this.c;
        if (i != 0) {
            wjb wjbVar = this.s;
            if (i != 1) {
                if (i != 2) {
                    ue3Var = null;
                } else {
                    ue3Var = new qa7(context, wjbVar);
                }
            } else {
                pi4 pi4Var = new pi4(context, wjbVar);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(7);
                ue3Var = pi4Var;
            }
        } else {
            ue3Var = new ue3(null, context, true, this.r, this.s);
        }
        return ls6.h(ue3Var, ue3Var, -1, -2);
    }
}
