package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class t41 implements zbc, fd, ay2, k6b, b86, gc7, pz6, ot2, OnSuccessListener, rpa {
    public final byte a;
    public final boolean b;
    public final Object c;

    public t41(nf8 nf8Var, int i) {
        this.a = (byte) 5;
        this.c = nf8Var;
        this.b = i;
    }

    @Override
    public final void a(int i, ArrayList arrayList) {
        byte b = this.a;
        int i2 = 0;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                u41 u41Var = (u41) obj;
                ArrayList arrayList2 = u41Var.k;
                ArrayList arrayList3 = u41Var.j;
                if (z) {
                    u41Var.f = i;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i2 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i2));
                        i2++;
                    }
                } else {
                    u41Var.g = i;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i2 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i2));
                        i2++;
                    }
                }
                u41Var.e.run();
                return;
            default:
                nf4 nf4Var = (nf4) obj;
                LongSparseIntArray longSparseIntArray = nf4Var.I;
                nf4Var.E = i;
                if (z) {
                    nf4Var.t0(nf4Var.G, arrayList, true);
                    nf4Var.G = arrayList;
                    for (int i3 = 0; i3 < nf4Var.G.size(); i3++) {
                        nf4Var.H.remove(nf4Var.G.get(i3));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        long keyAt = longSparseIntArray.keyAt(i4);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!wf3.B(keyAt) && !nf4Var.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i5)).longValue());
                    }
                } else {
                    nf4Var.t0(nf4Var.H, arrayList, false);
                    nf4Var.H = arrayList;
                    for (int i6 = 0; i6 < nf4Var.H.size(); i6++) {
                        Long l = (Long) nf4Var.H.get(i6);
                        nf4Var.G.remove(l);
                        longSparseIntArray.delete(l.longValue());
                    }
                }
                nf4Var.l0();
                nf4Var.k0(false);
                nf4Var.C0();
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        ((og8) obj).i0((oz) this.c, this.b);
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        jw5 jw5Var = (jw5) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            jw5Var.setOnDismissListener(new fw5(jw5Var, this.b, (byte) 0));
        }
        jw5Var.dismiss();
        return false;
    }

    @Override
    public final void d(npa npaVar, float f, float f2) {
        tpa tpaVar = (tpa) this.c;
        if (!tpaVar.d && !tpaVar.e && !tpaVar.f && this.b) {
            tpaVar.c(f, f2);
        }
    }

    @Override
    public final void f(boolean z) {
        pg3 pg3Var = (pg3) this.c;
        if (!this.b && z) {
            boolean z2 = true;
            if (pg3Var.b != 1) {
                z2 = false;
            }
            c6b c6bVar = pg3Var.s;
            if (z2) {
                if (!c6bVar.z) {
                    return;
                }
            } else if (!c6bVar.p) {
                return;
            }
            c6bVar.S(z2);
        }
    }

    @Override
    public final void invoke(Object obj) {
        ((bg8) obj).D(((nf8) this.c).a, this.b ? 1 : 0);
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        long k;
        int i2;
        byte b = this.a;
        long j = -9223372036854775807L;
        int i3 = -1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 9:
                try {
                    j99 u = po5.u(ft6.a(xw6Var.c, (Bundle) obj));
                    if (z) {
                        k = -9223372036854775807L;
                        i2 = -1;
                    } else {
                        yx6Var.t();
                        int l0 = yx6Var.t.l0();
                        yx6Var.t();
                        k = yx6Var.t.k();
                        i2 = l0;
                    }
                    return yx6Var.o(xw6Var, u, i2, k);
                } catch (RuntimeException e) {
                    efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    return fne.b(e);
                }
            default:
                try {
                    po5 a = f31.a((IBinder) obj);
                    mo5 p = po5.p();
                    for (int i4 = 0; i4 < a.size(); i4++) {
                        Bundle bundle = (Bundle) a.get(i4);
                        bundle.getClass();
                        p.c(ft6.a(xw6Var.c, bundle));
                    }
                    j99 f = p.f();
                    if (!z) {
                        yx6Var.t();
                        i3 = yx6Var.t.l0();
                        yx6Var.t();
                        j = yx6Var.t.k();
                    }
                    return yx6Var.o(xw6Var, f, i3, j);
                } catch (RuntimeException e2) {
                    efd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    return fne.b(e2);
                }
        }
    }

    @Override
    public final void l(long j) {
        hn hnVar = ((cc2) this.c).a.z3;
        if (hnVar != null) {
            hnVar.t(ob6.M((int) j, this.b), true, true);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        Void r2 = (Void) obj;
        SharedPreferences.Editor edit = kwe.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        int i2 = 40;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                ((z61) obj).q0(z);
                return;
            case 2:
                zu1 zu1Var = (zu1) obj;
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null) {
                    if (z) {
                        zu1Var.finishFragment();
                        return;
                    } else {
                        nr1Var.G();
                        return;
                    }
                }
                return;
            case 7:
                j95 j95Var = ((m85) obj).b;
                j95Var.T2.C(0, null);
                UndoView d1 = j95Var.d1();
                if (z) {
                    i2 = 101;
                }
                d1.j(i2, 0L, null);
                return;
            default:
                er9 er9Var = (er9) obj;
                er9Var.c.C(0, null);
                UndoView undoView = er9Var.J;
                if (z) {
                    i2 = 101;
                }
                undoView.j(i2, 0L, null);
                return;
        }
    }

    public t41(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
