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
public final class s51 implements aac, ee, qy2, p4b, x76, ac7, lz6, fu2, OnSuccessListener, vna {
    public final byte a;
    public final boolean b;
    public final Object c;

    public s51(be8 be8Var, int i) {
        this.a = (byte) 5;
        this.c = be8Var;
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
                t51 t51Var = (t51) obj;
                ArrayList arrayList2 = t51Var.k;
                ArrayList arrayList3 = t51Var.j;
                if (z) {
                    t51Var.f = i;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i2 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i2));
                        i2++;
                    }
                } else {
                    t51Var.g = i;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i2 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i2));
                        i2++;
                    }
                }
                t51Var.e.run();
                return;
            default:
                qf4 qf4Var = (qf4) obj;
                LongSparseIntArray longSparseIntArray = qf4Var.I;
                qf4Var.E = i;
                if (z) {
                    qf4Var.u0(qf4Var.G, arrayList, true);
                    qf4Var.G = arrayList;
                    for (int i3 = 0; i3 < qf4Var.G.size(); i3++) {
                        qf4Var.H.remove(qf4Var.G.get(i3));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        long keyAt = longSparseIntArray.keyAt(i4);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!pg3.B(keyAt) && !qf4Var.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i5)).longValue());
                    }
                } else {
                    qf4Var.u0(qf4Var.H, arrayList, false);
                    qf4Var.H = arrayList;
                    for (int i6 = 0; i6 < qf4Var.H.size(); i6++) {
                        Long l = (Long) qf4Var.H.get(i6);
                        qf4Var.G.remove(l);
                        longSparseIntArray.delete(l.longValue());
                    }
                }
                qf4Var.m0();
                qf4Var.l0(false);
                qf4Var.C0();
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        ((cf8) obj).i0((o00) this.c, this.b);
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        ew5 ew5Var = (ew5) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            ew5Var.setOnDismissListener(new aw5((byte) 0, ew5Var, this.b));
        }
        ew5Var.dismiss();
        return false;
    }

    @Override
    public final void d(rna rnaVar, float f, float f2) {
        xna xnaVar = (xna) this.c;
        if (!xnaVar.d && !xnaVar.e && !xnaVar.f && this.b) {
            xnaVar.c(f, f2);
        }
    }

    @Override
    public final void e(boolean z) {
        ih3 ih3Var = (ih3) this.c;
        if (!this.b && z) {
            boolean z2 = true;
            if (ih3Var.b != 1) {
                z2 = false;
            }
            h4b h4bVar = ih3Var.s;
            if (z2) {
                if (!h4bVar.z) {
                    return;
                }
            } else if (!h4bVar.p) {
                return;
            }
            h4bVar.S(z2);
        }
    }

    @Override
    public final void invoke(Object obj) {
        ((pe8) obj).D(((be8) this.c).a, this.b ? 1 : 0);
    }

    @Override
    public final void n(long j) {
        ho hoVar = ((xc2) this.c).a.z3;
        if (hoVar != null) {
            hoVar.t(jb6.M((int) j, this.b), true, true);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        Void r2 = (Void) obj;
        SharedPreferences.Editor edit = vte.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        int i2 = 40;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                ((y71) obj).r0(z);
                return;
            case 2:
                yv1 yv1Var = (yv1) obj;
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var != null) {
                    if (z) {
                        yv1Var.finishFragment();
                        return;
                    } else {
                        ms1Var.E();
                        return;
                    }
                }
                return;
            case 7:
                g95 g95Var = ((i85) obj).b;
                g95Var.T2.C(0, null);
                UndoView c1 = g95Var.c1();
                if (z) {
                    i2 = 101;
                }
                c1.j(i2, 0L, null);
                return;
            default:
                pp9 pp9Var = (pp9) obj;
                pp9Var.c.C(0, null);
                UndoView undoView = pp9Var.J;
                if (z) {
                    i2 = 101;
                }
                undoView.j(i2, 0L, null);
                return;
        }
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
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
                    y79 u = mo5.u(bt6.a(sw6Var.c, (Bundle) obj));
                    if (z) {
                        k = -9223372036854775807L;
                        i2 = -1;
                    } else {
                        tx6Var.t();
                        int l0 = tx6Var.t.l0();
                        tx6Var.t();
                        k = tx6Var.t.k();
                        i2 = l0;
                    }
                    return tx6Var.o(sw6Var, u, i2, k);
                } catch (RuntimeException e) {
                    ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    return kke.b(e);
                }
            default:
                try {
                    mo5 a = e41.a((IBinder) obj);
                    jo5 p = mo5.p();
                    for (int i4 = 0; i4 < a.size(); i4++) {
                        Bundle bundle = (Bundle) a.get(i4);
                        bundle.getClass();
                        p.c(bt6.a(sw6Var.c, bundle));
                    }
                    y79 f = p.f();
                    if (!z) {
                        tx6Var.t();
                        i3 = tx6Var.t.l0();
                        tx6Var.t();
                        j = tx6Var.t.k();
                    }
                    return tx6Var.o(sw6Var, f, i3, j);
                } catch (RuntimeException e2) {
                    ncd.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    return kke.b(e2);
                }
        }
    }

    public s51(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
