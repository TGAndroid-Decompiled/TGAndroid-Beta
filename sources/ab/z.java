package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.p6;
import fi.x6;
import h9.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.xo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.bn;
import org.telegram.ui.e40;
import org.telegram.ui.ib1;
import org.telegram.ui.j30;
import org.telegram.ui.jz;
import org.telegram.ui.rj;
import org.telegram.ui.y6;
import p4.b1;
import p4.h1;
public final class z implements OnSuccessListener, x6, ib1, q1, bg.q, xo, b1, h2.j, xh.j {
    public final int f1006a;
    public final boolean f1007b;
    public final Object f1008c;

    public z(int i7, Object obj, boolean z10) {
        this.f1006a = i7;
        this.f1008c = obj;
        this.f1007b = z10;
    }

    @Override
    public void a(int i7, ArrayList arrayList) {
        switch (this.f1006a) {
            case 2:
                kg.b0 b0Var = (kg.b0) this.f1008c;
                ArrayList arrayList2 = b0Var.f18348k;
                ArrayList arrayList3 = b0Var.f18347j;
                int i10 = 0;
                if (this.f1007b) {
                    b0Var.f18344f = i7;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    b0Var.f18345g = i7;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                b0Var.f18343e.run();
                return;
            default:
                jz jzVar = (jz) this.f1008c;
                LongSparseIntArray longSparseIntArray = jzVar.I;
                jzVar.E = i7;
                if (this.f1007b) {
                    jzVar.u0(jzVar.G, arrayList, true);
                    jzVar.G = arrayList;
                    for (int i11 = 0; i11 < jzVar.G.size(); i11++) {
                        jzVar.H.remove(jzVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!n5.C(keyAt) && !jzVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    jzVar.u0(jzVar.H, arrayList, false);
                    jzVar.H = arrayList;
                    for (int i14 = 0; i14 < jzVar.H.size(); i14++) {
                        Long l10 = (Long) jzVar.H.get(i14);
                        jzVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                jzVar.p0();
                jzVar.o0(false);
                jzVar.C0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((h1) obj).E((e2.e) this.f1008c, this.f1007b);
    }

    @Override
    public void c(boolean z10) {
        fi.q qVar = (fi.q) this.f1008c;
        if (!this.f1007b && z10) {
            boolean z11 = true;
            if (qVar.f12416b != 1) {
                z11 = false;
            }
            p6 p6Var = qVar.f12438s;
            if (z11) {
                if (!p6Var.f12409z) {
                    return;
                }
            } else if (!p6Var.f12400p) {
                return;
            }
            p6Var.T(z11);
        }
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        o70 o70Var = (o70) this.f1008c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            o70Var.setOnDismissListener(new k70(0, o70Var, this.f1007b));
        }
        o70Var.dismiss();
        return false;
    }

    @Override
    public void g(long j3) {
        m6 m6Var = ((x1) this.f1008c).f32383a.f31740z3;
        if (m6Var != null) {
            m6Var.t(gd.M((int) j3, this.f1007b), true, true);
        }
    }

    @Override
    public void i(t1 t1Var, int i7) {
        int i10;
        switch (this.f1006a) {
            case 3:
                y6.d0((y6) this.f1008c, this.f1007b);
                return;
            case 4:
            default:
                e40 e40Var = ((j30) this.f1008c).f48977b;
                e40Var.V2.A(0, null);
                UndoView o12 = e40Var.o1();
                if (this.f1007b) {
                    i10 = 101;
                } else {
                    i10 = 40;
                }
                o12.j(i10, 0L, null);
                return;
            case 5:
                bn bnVar = (bn) this.f1008c;
                rj rjVar = bnVar.f46118a0;
                if (rjVar != null) {
                    if (this.f1007b) {
                        bnVar.finishFragment();
                        return;
                    } else {
                        rjVar.F();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        int p02;
        long n10;
        int p03;
        long n11;
        switch (this.f1006a) {
            case 9:
                s1 u10 = h9.i0.u((e2.l0) this.f1008c);
                boolean z10 = this.f1007b;
                if (z10) {
                    p02 = -1;
                } else {
                    p02 = d0Var.f55324t.p0();
                }
                int i10 = p02;
                if (z10) {
                    n10 = -9223372036854775807L;
                } else {
                    n10 = d0Var.f55324t.n();
                }
                return d0Var.q(vVar, u10, i10, n10);
            default:
                List list = (List) this.f1008c;
                boolean z11 = this.f1007b;
                if (z11) {
                    p03 = -1;
                } else {
                    p03 = d0Var.f55324t.p0();
                }
                int i11 = p03;
                if (z11) {
                    n11 = -9223372036854775807L;
                } else {
                    n11 = d0Var.f55324t.n();
                }
                return d0Var.q(vVar, list, i11, n11);
        }
    }

    @Override
    public void o(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.f1008c;
        if (!lVar.d && !lVar.f60725e && !lVar.f60726f && this.f1007b) {
            lVar.c(f10, f11);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r32 = (Void) obj;
        SharedPreferences.Editor edit = c1.a((Context) this.f1008c).edit();
        edit.putBoolean("proxy_retention", this.f1007b);
        edit.apply();
    }
}
