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
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.y60;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.iz;
import org.telegram.ui.j30;
import org.telegram.ui.kb1;
import org.telegram.ui.sj;
import org.telegram.ui.y6;
import p4.a1;
import p4.g1;
public final class y implements OnSuccessListener, h7, kb1, r1, bg.p, bp, a1, h2.j, xh.j {
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
        c70 c70Var = (c70) this.f1009c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            c70Var.setOnDismissListener(new y60(0, c70Var, this.f1008b));
        }
        c70Var.dismiss();
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
            if (qVar.f9528b != 1) {
                z10 = false;
            }
            z6 z6Var = qVar.f9550s;
            if (z10) {
                if (!z6Var.f10014z) {
                    return;
                }
            } else if (!z6Var.f10005p) {
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
                iz izVar = (iz) this.f1009c;
                LongSparseIntArray longSparseIntArray = izVar.H;
                izVar.D = i7;
                if (this.f1008b) {
                    izVar.u0(izVar.F, arrayList, true);
                    izVar.F = arrayList;
                    for (int i11 = 0; i11 < izVar.F.size(); i11++) {
                        izVar.G.remove(izVar.F.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!m5.C(keyAt) && !izVar.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    izVar.u0(izVar.G, arrayList, false);
                    izVar.G = arrayList;
                    for (int i14 = 0; i14 < izVar.G.size(); i14++) {
                        Long l10 = (Long) izVar.G.get(i14);
                        izVar.F.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                izVar.p0();
                izVar.o0(false);
                izVar.C0();
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
                e40 e40Var = ((j30) this.f1009c).f46823b;
                e40Var.R2.A(0, null);
                UndoView n1 = e40Var.n1();
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
        i6 i6Var = ((w1) this.f1009c).f30704a.f30082y3;
        if (i6Var != null) {
            i6Var.t(id.M((int) j3, this.f1008b), true, true);
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
                    o02 = d0Var.f53230t.o0();
                }
                int i10 = o02;
                if (z9) {
                    l10 = -9223372036854775807L;
                } else {
                    l10 = d0Var.f53230t.l();
                }
                return d0Var.q(vVar, u10, i10, l10);
            default:
                List list = (List) this.f1009c;
                boolean z10 = this.f1008b;
                if (z10) {
                    o03 = -1;
                } else {
                    o03 = d0Var.f53230t.o0();
                }
                int i11 = o03;
                if (z10) {
                    l11 = -9223372036854775807L;
                } else {
                    l11 = d0Var.f53230t.l();
                }
                return d0Var.q(vVar, list, i11, l11);
        }
    }

    @Override
    public void m(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.f1009c;
        if (!lVar.d && !lVar.f58849e && !lVar.f58850f && this.f1008b) {
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
