package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import di.h7;
import di.z6;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bp;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.x60;
import org.telegram.ui.cn;
import org.telegram.ui.f40;
import org.telegram.ui.jz;
import org.telegram.ui.k30;
import org.telegram.ui.lb1;
import org.telegram.ui.sj;
import org.telegram.ui.y6;
import p4.a1;
import p4.g1;
public final class y implements OnSuccessListener, h7, lb1, r1, bg.p, bp, a1, h2.j, xh.j {
    public final int f1007a;
    public final boolean f1008b;
    public final Object f1009c;

    public y(int i7, Object obj, boolean z9) {
        this.f1007a = i7;
        this.f1009c = obj;
        this.f1008b = z9;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        b70 b70Var = (b70) this.f1009c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            b70Var.setOnDismissListener(new x60(0, b70Var, this.f1008b));
        }
        b70Var.dismiss();
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((g1) obj).D((e2.e) this.f1009c, this.f1008b);
    }

    @Override
    public void b(boolean z9) {
        di.q qVar = (di.q) this.f1009c;
        if (!this.f1008b && z9) {
            boolean z10 = true;
            if (qVar.f9533b != 1) {
                z10 = false;
            }
            z6 z6Var = qVar.f9555s;
            if (z10) {
                if (!z6Var.f10019z) {
                    return;
                }
            } else if (!z6Var.f10010p) {
                return;
            }
            z6Var.T(z10);
        }
    }

    @Override
    public void c(int i7, ArrayList arrayList) {
        switch (this.f1007a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.f1009c;
                ArrayList arrayList2 = a0Var.f17297k;
                ArrayList arrayList3 = a0Var.f17296j;
                int i10 = 0;
                if (this.f1008b) {
                    a0Var.f17293f = i7;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    a0Var.f17294g = i7;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                a0Var.f17292e.run();
                return;
            default:
                jz jzVar = (jz) this.f1009c;
                LongSparseIntArray longSparseIntArray = jzVar.H;
                jzVar.D = i7;
                if (this.f1008b) {
                    jzVar.u0(jzVar.F, arrayList, true);
                    jzVar.F = arrayList;
                    for (int i11 = 0; i11 < jzVar.F.size(); i11++) {
                        jzVar.G.remove(jzVar.F.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!m5.C(keyAt) && !jzVar.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    jzVar.u0(jzVar.G, arrayList, false);
                    jzVar.G = arrayList;
                    for (int i14 = 0; i14 < jzVar.G.size(); i14++) {
                        Long l10 = (Long) jzVar.G.get(i14);
                        jzVar.F.remove(l10);
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
    public void g(u1 u1Var, int i7) {
        int i10;
        switch (this.f1007a) {
            case 3:
                y6.d0((y6) this.f1009c, this.f1008b);
                return;
            case 4:
            default:
                f40 f40Var = ((k30) this.f1009c).f47153b;
                f40Var.U2.A(0, null);
                UndoView n1 = f40Var.n1();
                if (this.f1008b) {
                    i10 = 101;
                } else {
                    i10 = 40;
                }
                n1.j(i10, 0L, null);
                return;
            case 5:
                cn cnVar = (cn) this.f1009c;
                sj sjVar = cnVar.Z;
                if (sjVar != null) {
                    if (this.f1008b) {
                        cnVar.finishFragment();
                        return;
                    } else {
                        sjVar.x();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void j(long j3) {
        h6 h6Var = ((w1) this.f1009c).f30715a.f30093y3;
        if (h6Var != null) {
            h6Var.t(id.M((int) j3, this.f1008b), true, true);
        }
    }

    @Override
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        int o02;
        long l10;
        int o03;
        long l11;
        switch (this.f1007a) {
            case 9:
                t1 u10 = h9.i0.u((e2.l0) this.f1009c);
                boolean z9 = this.f1008b;
                if (z9) {
                    o02 = -1;
                } else {
                    o02 = d0Var.f53229t.o0();
                }
                int i10 = o02;
                if (z9) {
                    l10 = -9223372036854775807L;
                } else {
                    l10 = d0Var.f53229t.l();
                }
                return d0Var.q(vVar, u10, i10, l10);
            default:
                List list = (List) this.f1009c;
                boolean z10 = this.f1008b;
                if (z10) {
                    o03 = -1;
                } else {
                    o03 = d0Var.f53229t.o0();
                }
                int i11 = o03;
                if (z10) {
                    l11 = -9223372036854775807L;
                } else {
                    l11 = d0Var.f53229t.l();
                }
                return d0Var.q(vVar, list, i11, l11);
        }
    }

    @Override
    public void m(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.f1009c;
        if (!lVar.d && !lVar.f58847e && !lVar.f58848f && this.f1008b) {
            lVar.c(f10, f11);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r32 = (Void) obj;
        SharedPreferences.Editor edit = c1.a((Context) this.f1009c).edit();
        edit.putBoolean("proxy_retention", this.f1008b);
        edit.apply();
    }
}
