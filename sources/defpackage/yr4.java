package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
public final class yr4 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final is6 f = new is6((byte) 7);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static s49 c(RecyclerView recyclerView, int i, long j) {
        int R = recyclerView.e.R();
        for (int i2 = 0; i2 < R; i2++) {
            s49 U = RecyclerView.U(recyclerView.e.Q(i2));
            if (U.c == i && !U.h()) {
                return null;
            }
        }
        wg2 wg2Var = recyclerView.b;
        try {
            recyclerView.i0();
            s49 k = wg2Var.k(i, j);
            if (k != null) {
                if (k.g() && !k.h()) {
                    wg2Var.h(k.a);
                } else {
                    wg2Var.a(k, false);
                }
            }
            return k;
        } catch (Exception e2) {
            fa4.g(e2, true);
            gl.c3(new s54(recyclerView, (byte) 27));
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
        on onVar = recyclerView.u0;
        onVar.b = i;
        onVar.c = i2;
    }

    public final void b(long j) {
        xr4 xr4Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        xr4 xr4Var2;
        boolean z;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            on onVar = recyclerView3.u0;
            if (windowVisibility == 0) {
                onVar.c(recyclerView3, false);
                i += onVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                on onVar2 = recyclerView4.u0;
                int abs = Math.abs(onVar2.c) + Math.abs(onVar2.b);
                for (int i5 = 0; i5 < (onVar2.d << 1); i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        xr4Var2 = obj;
                    } else {
                        xr4Var2 = (xr4) arrayList.get(i3);
                    }
                    int[] iArr = onVar2.a;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xr4Var2.a = z;
                    xr4Var2.b = abs;
                    xr4Var2.c = i6;
                    xr4Var2.d = recyclerView4;
                    xr4Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (xr4Var = (xr4) arrayList.get(i7)).d) != null; i7++) {
            if (xr4Var.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            s49 c = c(recyclerView, xr4Var.e, j2);
            if (c != null && c.b != null && c.g() && !c.h() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.R && recyclerView2.e.R() != 0) {
                    recyclerView2.q0();
                }
                on onVar3 = recyclerView2.u0;
                onVar3.c(recyclerView2, true);
                if (onVar3.d != 0) {
                    try {
                        int i8 = mxb.a;
                        Trace.beginSection("RV Nested Prefetch");
                        p49 p49Var = recyclerView2.v0;
                        w39 w39Var = recyclerView2.x;
                        p49Var.d = (byte) 1;
                        p49Var.e = w39Var.b();
                        p49Var.g = false;
                        p49Var.h = false;
                        p49Var.i = false;
                        for (int i9 = 0; i9 < (onVar3.d << 1); i9 += 2) {
                            c(recyclerView2, onVar3.a[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = mxb.a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            xr4Var.a = false;
            xr4Var.b = 0;
            xr4Var.c = 0;
            xr4Var.d = null;
            xr4Var.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = mxb.a;
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
            int i3 = mxb.a;
            Trace.endSection();
            throw th;
        }
    }
}
