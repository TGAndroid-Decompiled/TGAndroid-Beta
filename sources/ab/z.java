package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.a7;
import fi.s6;
import h9.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.g6;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.gb1;
import org.telegram.ui.h30;
import org.telegram.ui.hz;
import org.telegram.ui.qj;
import org.telegram.ui.y6;
import p4.a1;
import p4.g1;
public final class z implements OnSuccessListener, a7, gb1, q1, bg.p, yo, a1, h2.j, xh.j {
    public final int f1007a;
    public final boolean f1008b;
    public final Object f1009c;

    public z(int i7, Object obj, boolean z10) {
        this.f1007a = i7;
        this.f1009c = obj;
        this.f1008b = z10;
    }

    @Override
    public void a(int i7, ArrayList arrayList) {
        switch (this.f1007a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.f1009c;
                ArrayList arrayList2 = a0Var.f17856k;
                ArrayList arrayList3 = a0Var.f17855j;
                int i10 = 0;
                if (this.f1008b) {
                    a0Var.f17852f = i7;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    a0Var.f17853g = i7;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                a0Var.f17851e.run();
                return;
            default:
                hz hzVar = (hz) this.f1009c;
                LongSparseIntArray longSparseIntArray = hzVar.I;
                hzVar.E = i7;
                if (this.f1008b) {
                    hzVar.u0(hzVar.G, arrayList, true);
                    hzVar.G = arrayList;
                    for (int i11 = 0; i11 < hzVar.G.size(); i11++) {
                        hzVar.H.remove(hzVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!m5.C(keyAt) && !hzVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    hzVar.u0(hzVar.H, arrayList, false);
                    hzVar.H = arrayList;
                    for (int i14 = 0; i14 < hzVar.H.size(); i14++) {
                        Long l10 = (Long) hzVar.H.get(i14);
                        hzVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                hzVar.p0();
                hzVar.o0(false);
                hzVar.C0();
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        ((g1) obj).D((e2.e) this.f1009c, this.f1008b);
    }

    @Override
    public void c(boolean z10) {
        fi.q qVar = (fi.q) this.f1009c;
        if (!this.f1008b && z10) {
            boolean z11 = true;
            if (qVar.f12186b != 1) {
                z11 = false;
            }
            s6 s6Var = qVar.f12208s;
            if (z11) {
                if (!s6Var.f12341z) {
                    return;
                }
            } else if (!s6Var.f12332p) {
                return;
            }
            s6Var.T(z11);
        }
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        e70 e70Var = (e70) this.f1009c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            e70Var.setOnDismissListener(new a70(0, e70Var, this.f1008b));
        }
        e70Var.dismiss();
        return false;
    }

    @Override
    public void g(long j3) {
        g6 g6Var = ((w1) this.f1009c).f31851a.f31237z3;
        if (g6Var != null) {
            g6Var.t(hd.M((int) j3, this.f1008b), true, true);
        }
    }

    @Override
    public void h(t1 t1Var, int i7) {
        int i10;
        switch (this.f1007a) {
            case 3:
                y6.d0((y6) this.f1009c, this.f1008b);
                return;
            case 4:
            default:
                c40 c40Var = ((h30) this.f1009c).f47598b;
                c40Var.V2.A(0, null);
                UndoView n1 = c40Var.n1();
                if (this.f1008b) {
                    i10 = 101;
                } else {
                    i10 = 40;
                }
                n1.j(i10, 0L, null);
                return;
            case 5:
                an anVar = (an) this.f1009c;
                qj qjVar = anVar.f45118a0;
                if (qjVar != null) {
                    if (this.f1008b) {
                        anVar.finishFragment();
                        return;
                    } else {
                        qjVar.D();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void j(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.f1009c;
        if (!lVar.d && !lVar.f60031e && !lVar.f60032f && this.f1008b) {
            lVar.c(f10, f11);
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        int o02;
        long l10;
        int o03;
        long l11;
        switch (this.f1007a) {
            case 9:
                s1 u10 = h9.i0.u((e2.l0) this.f1009c);
                boolean z10 = this.f1008b;
                if (z10) {
                    o02 = -1;
                } else {
                    o02 = d0Var.f54635t.o0();
                }
                int i10 = o02;
                if (z10) {
                    l10 = -9223372036854775807L;
                } else {
                    l10 = d0Var.f54635t.l();
                }
                return d0Var.q(vVar, u10, i10, l10);
            default:
                List list = (List) this.f1009c;
                boolean z11 = this.f1008b;
                if (z11) {
                    o03 = -1;
                } else {
                    o03 = d0Var.f54635t.o0();
                }
                int i11 = o03;
                if (z11) {
                    l11 = -9223372036854775807L;
                } else {
                    l11 = d0Var.f54635t.l();
                }
                return d0Var.q(vVar, list, i11, l11);
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
