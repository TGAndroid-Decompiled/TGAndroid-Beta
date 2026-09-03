package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final b7.r f5819f = new b7.r(3);
    public ArrayList f5820a;
    public long f5821b;
    public long f5822c;
    public ArrayList d;

    public static l1 c(RecyclerView recyclerView, int i10, long j10) {
        int v = recyclerView.e.v();
        for (int i11 = 0; i11 < v; i11++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i11));
            if (U.f5776c == i10 && !U.h()) {
                return null;
            }
        }
        af.h hVar = recyclerView.f1233b;
        try {
            try {
                recyclerView.g0();
                l1 j11 = hVar.j(i10, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        hVar.g(j11.f5774a);
                    } else {
                        hVar.a(j11, false);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e6) {
                FileLog.e(e6);
                AndroidUtilities.runOnUIThread(new e3.h(recyclerView, 8));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.D && this.f5821b == 0) {
            this.f5821b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1250p0;
        iVar.f683a = i10;
        iVar.f684b = i11;
    }

    public final void b(long j10) {
        r rVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        r rVar2;
        boolean z4;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f5820a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.f1250p0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i10 += iVar.f685c;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.f1250p0;
                int abs = Math.abs(iVar2.f684b) + Math.abs(iVar2.f683a);
                for (int i14 = 0; i14 < iVar2.f685c * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        rVar2 = obj;
                    } else {
                        rVar2 = (r) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) iVar2.d;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    rVar2.f5816a = z4;
                    rVar2.f5817b = abs;
                    rVar2.f5818c = i15;
                    rVar2.d = recyclerView4;
                    rVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f5819f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (rVar = (r) arrayList.get(i16)).d) != null; i16++) {
            if (rVar.f5816a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            l1 c3 = c(recyclerView, rVar.e, j11);
            if (c3 != null && c3.f5775b != null && c3.g() && !c3.h() && (recyclerView2 = (RecyclerView) c3.f5775b.get()) != null) {
                if (recyclerView2.N && recyclerView2.e.v() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.f1250p0;
                iVar3.b(recyclerView2, true);
                if (iVar3.f685c != 0) {
                    try {
                        int i17 = n0.g.f14194a;
                        Trace.beginSection("RV Nested Prefetch");
                        i1 i1Var = recyclerView2.f1251q0;
                        o0 o0Var = recyclerView2.f1259w;
                        i1Var.d = 1;
                        i1Var.e = o0Var.h();
                        i1Var.f5735g = false;
                        i1Var.h = false;
                        i1Var.f5736i = false;
                        for (int i18 = 0; i18 < iVar3.f685c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i18], j10);
                        }
                        Trace.endSection();
                        rVar.f5816a = false;
                        rVar.f5817b = 0;
                        rVar.f5818c = 0;
                        rVar.d = null;
                        rVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f14194a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            rVar.f5816a = false;
            rVar.f5817b = 0;
            rVar.f5818c = 0;
            rVar.d = null;
            rVar.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f5820a;
        try {
            int i10 = n0.g.f14194a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f5822c);
                }
            }
            this.f5821b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f5821b = 0L;
            int i12 = n0.g.f14194a;
            Trace.endSection();
            throw th2;
        }
    }
}
