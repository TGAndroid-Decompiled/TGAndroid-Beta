package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
public final class zt4 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final ju6 f = new ju6((byte) 7);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static u69 c(RecyclerView recyclerView, int i, long j) {
        int T = recyclerView.e.T();
        for (int i2 = 0; i2 < T; i2++) {
            u69 U = RecyclerView.U(recyclerView.e.S(i2));
            if (U.c == i && !U.h()) {
                return null;
            }
        }
        ki2 ki2Var = recyclerView.b;
        try {
            recyclerView.i0();
            u69 k = ki2Var.k(i, j);
            if (k != null) {
                if (k.g() && !k.h()) {
                    ki2Var.h(k.a);
                } else {
                    ki2Var.a(k, false);
                }
            }
            return k;
        } catch (Exception e2) {
            fc4.g(e2, true);
            gm.c3(new qn4(recyclerView, (byte) 4));
            return null;
        } finally {
            recyclerView.j0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.H && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        po poVar = recyclerView.u0;
        poVar.b = i;
        poVar.c = i2;
    }

    public final void b(long j) {
        yt4 yt4Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        yt4 yt4Var2;
        boolean z;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            po poVar = recyclerView3.u0;
            if (windowVisibility == 0) {
                poVar.c(recyclerView3, false);
                i += poVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                po poVar2 = recyclerView4.u0;
                int abs = Math.abs(poVar2.c) + Math.abs(poVar2.b);
                for (int i5 = 0; i5 < (poVar2.d << 1); i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        yt4Var2 = obj;
                    } else {
                        yt4Var2 = (yt4) arrayList.get(i3);
                    }
                    int[] iArr = poVar2.a;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    yt4Var2.a = z;
                    yt4Var2.b = abs;
                    yt4Var2.c = i6;
                    yt4Var2.d = recyclerView4;
                    yt4Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (yt4Var = (yt4) arrayList.get(i7)).d) != null; i7++) {
            if (yt4Var.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            u69 c = c(recyclerView, yt4Var.e, j2);
            if (c != null && c.b != null && c.g() && !c.h() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.R && recyclerView2.e.T() != 0) {
                    recyclerView2.q0();
                }
                po poVar3 = recyclerView2.u0;
                poVar3.c(recyclerView2, true);
                if (poVar3.d != 0) {
                    try {
                        int i8 = ozb.a;
                        Trace.beginSection("RV Nested Prefetch");
                        r69 r69Var = recyclerView2.v0;
                        y59 y59Var = recyclerView2.x;
                        r69Var.d = (byte) 1;
                        r69Var.e = y59Var.b();
                        r69Var.g = false;
                        r69Var.h = false;
                        r69Var.i = false;
                        for (int i9 = 0; i9 < (poVar3.d << 1); i9 += 2) {
                            c(recyclerView2, poVar3.a[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = ozb.a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            yt4Var.a = false;
            yt4Var.b = 0;
            yt4Var.c = 0;
            yt4Var.d = null;
            yt4Var.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = ozb.a;
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
            int i3 = ozb.a;
            Trace.endSection();
            throw th;
        }
    }
}
