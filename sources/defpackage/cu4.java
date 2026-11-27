package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
public final class cu4 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final nu6 f = new nu6((byte) 7);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static f89 c(RecyclerView recyclerView, int i, long j) {
        int T = recyclerView.e.T();
        for (int i2 = 0; i2 < T; i2++) {
            f89 V = RecyclerView.V(recyclerView.e.S(i2));
            if (V.c == i && !V.h()) {
                return null;
            }
        }
        oh2 oh2Var = recyclerView.b;
        try {
            recyclerView.j0();
            f89 k = oh2Var.k(i, j);
            if (k != null) {
                if (k.g() && !k.h()) {
                    oh2Var.h(k.a);
                } else {
                    oh2Var.a(k, false);
                }
            }
            return k;
        } catch (Exception e2) {
            cc4.g(e2, true);
            hl.c3(new rj4(recyclerView, (byte) 11));
            return null;
        } finally {
            recyclerView.k0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.H && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        pn pnVar = recyclerView.u0;
        pnVar.b = i;
        pnVar.c = i2;
    }

    public final void b(long j) {
        bu4 bu4Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        bu4 bu4Var2;
        boolean z;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            pn pnVar = recyclerView3.u0;
            if (windowVisibility == 0) {
                pnVar.c(recyclerView3, false);
                i += pnVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                pn pnVar2 = recyclerView4.u0;
                int abs = Math.abs(pnVar2.c) + Math.abs(pnVar2.b);
                for (int i5 = 0; i5 < (pnVar2.d << 1); i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        bu4Var2 = obj;
                    } else {
                        bu4Var2 = (bu4) arrayList.get(i3);
                    }
                    int[] iArr = pnVar2.a;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bu4Var2.a = z;
                    bu4Var2.b = abs;
                    bu4Var2.c = i6;
                    bu4Var2.d = recyclerView4;
                    bu4Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (bu4Var = (bu4) arrayList.get(i7)).d) != null; i7++) {
            if (bu4Var.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            f89 c = c(recyclerView, bu4Var.e, j2);
            if (c != null && c.b != null && c.g() && !c.h() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.R && recyclerView2.e.T() != 0) {
                    recyclerView2.r0();
                }
                pn pnVar3 = recyclerView2.u0;
                pnVar3.c(recyclerView2, true);
                if (pnVar3.d != 0) {
                    try {
                        int i8 = n1c.a;
                        Trace.beginSection("RV Nested Prefetch");
                        c89 c89Var = recyclerView2.v0;
                        j79 j79Var = recyclerView2.x;
                        c89Var.d = (byte) 1;
                        c89Var.e = j79Var.b();
                        c89Var.g = false;
                        c89Var.h = false;
                        c89Var.i = false;
                        for (int i9 = 0; i9 < (pnVar3.d << 1); i9 += 2) {
                            c(recyclerView2, pnVar3.a[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = n1c.a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            bu4Var.a = false;
            bu4Var.b = 0;
            bu4Var.c = 0;
            bu4Var.d = null;
            bu4Var.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = n1c.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                }
            }
            this.b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.b = 0L;
            int i3 = n1c.a;
            Trace.endSection();
            throw th;
        }
    }
}
