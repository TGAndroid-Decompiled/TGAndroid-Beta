package ab;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.p6;
import fi.x6;
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
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.bn;
import org.telegram.ui.f40;
import org.telegram.ui.k30;
import org.telegram.ui.kb1;
import org.telegram.ui.kz;
import org.telegram.ui.rj;
import p4.c1;
import p4.i1;
public final class z implements OnSuccessListener, x6, kb1, q1, bg.q, xo, c1, h2.j, xh.j {
    public final int f1006a;
    public final boolean f1007b;
    public final Object f1008c;

    public z(int i7, Object obj, boolean z10) {
        this.f1006a = i7;
        this.f1008c = obj;
        this.f1007b = z10;
    }

    @Override
    public void a(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.f1008c;
        if (!lVar.d && !lVar.f60638e && !lVar.f60639f && this.f1007b) {
            lVar.c(f10, f11);
        }
    }

    @Override
    public void accept(Object obj) {
        ((i1) obj).D((e2.e) this.f1008c, this.f1007b);
    }

    @Override
    public void b(boolean z10) {
        fi.q qVar = (fi.q) this.f1008c;
        if (!this.f1007b && z10) {
            boolean z11 = true;
            if (qVar.f12451b != 1) {
                z11 = false;
            }
            p6 p6Var = qVar.f12473s;
            if (z11) {
                if (!p6Var.f12444z) {
                    return;
                }
            } else if (!p6Var.f12435p) {
                return;
            }
            p6Var.T(z11);
        }
    }

    @Override
    public void c(int i7, ArrayList arrayList) {
        switch (this.f1006a) {
            case 2:
                kg.b0 b0Var = (kg.b0) this.f1008c;
                ArrayList arrayList2 = b0Var.f18283k;
                ArrayList arrayList3 = b0Var.f18282j;
                int i10 = 0;
                if (this.f1007b) {
                    b0Var.f18279f = i7;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    b0Var.f18280g = i7;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                b0Var.f18278e.run();
                return;
            default:
                kz kzVar = (kz) this.f1008c;
                LongSparseIntArray longSparseIntArray = kzVar.I;
                kzVar.E = i7;
                if (this.f1007b) {
                    kzVar.u0(kzVar.G, arrayList, true);
                    kzVar.G = arrayList;
                    for (int i11 = 0; i11 < kzVar.G.size(); i11++) {
                        kzVar.H.remove(kzVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!n5.C(keyAt) && !kzVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    kzVar.u0(kzVar.H, arrayList, false);
                    kzVar.H = arrayList;
                    for (int i14 = 0; i14 < kzVar.H.size(); i14++) {
                        Long l10 = (Long) kzVar.H.get(i14);
                        kzVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                kzVar.p0();
                kzVar.o0(false);
                kzVar.C0();
                return;
        }
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        r70 r70Var = (r70) this.f1008c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            r70Var.setOnDismissListener(new n70(0, r70Var, this.f1007b));
        }
        r70Var.dismiss();
        return false;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        int i10;
        switch (this.f1006a) {
            case 3:
                org.telegram.ui.x6.d0((org.telegram.ui.x6) this.f1008c, this.f1007b);
                return;
            case 4:
            default:
                f40 f40Var = ((k30) this.f1008c).f49189b;
                f40Var.V2.A(0, null);
                UndoView o12 = f40Var.o1();
                if (this.f1007b) {
                    i10 = 101;
                } else {
                    i10 = 40;
                }
                o12.j(i10, 0L, null);
                return;
            case 5:
                bn bnVar = (bn) this.f1008c;
                rj rjVar = bnVar.f45946a0;
                if (rjVar != null) {
                    if (this.f1007b) {
                        bnVar.finishFragment();
                        return;
                    } else {
                        rjVar.G();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void i(long j3) {
        n6 n6Var = ((x1) this.f1008c).f32312a.f31687z3;
        if (n6Var != null) {
            n6Var.t(gd.M((int) j3, this.f1007b), true, true);
        }
    }

    @Override
    public Object k(p4.e0 e0Var, p4.v vVar, int i7) {
        int o02;
        long l10;
        int o03;
        long l11;
        switch (this.f1006a) {
            case 9:
                h9.t1 u10 = h9.i0.u((e2.l0) this.f1008c);
                boolean z10 = this.f1007b;
                if (z10) {
                    o02 = -1;
                } else {
                    o02 = e0Var.f55245t.o0();
                }
                int i10 = o02;
                if (z10) {
                    l10 = -9223372036854775807L;
                } else {
                    l10 = e0Var.f55245t.l();
                }
                return e0Var.q(vVar, u10, i10, l10);
            default:
                List list = (List) this.f1008c;
                boolean z11 = this.f1007b;
                if (z11) {
                    o03 = -1;
                } else {
                    o03 = e0Var.f55245t.o0();
                }
                int i11 = o03;
                if (z11) {
                    l11 = -9223372036854775807L;
                } else {
                    l11 = e0Var.f55245t.l();
                }
                return e0Var.q(vVar, list, i11, l11);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r32 = (Void) obj;
        SharedPreferences.Editor edit = a8.c1.a((Context) this.f1008c).edit();
        edit.putBoolean("proxy_retention", this.f1007b);
        edit.apply();
    }
}
