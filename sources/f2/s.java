package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s implements Runnable {
    public static final ThreadLocal f5920e = new ThreadLocal();
    public static final b7.r f5921f = new b7.r(3);
    public ArrayList f5922a;
    public long f5923b;
    public long f5924c;
    public ArrayList d;

    public static m1 c(RecyclerView recyclerView, int i10, long j10) {
        int u10 = recyclerView.f1325e.u();
        for (int i11 = 0; i11 < u10; i11++) {
            m1 U = RecyclerView.U(recyclerView.f1325e.t(i11));
            if (U.f5877c == i10 && !U.h()) {
                return null;
            }
        }
        bf.f fVar = recyclerView.f1320b;
        try {
            try {
                recyclerView.g0();
                m1 j11 = fVar.j(i10, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        fVar.g(j11.f5875a);
                    } else {
                        fVar.a(j11, false);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e6) {
                FileLog.e(e6);
                AndroidUtilities.runOnUIThread(new eh.m(recyclerView, 2));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.D && this.f5923b == 0) {
            this.f5923b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1338p0;
        iVar.f733a = i10;
        iVar.f734b = i11;
    }

    public final void b(long j10) {
        r rVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        r rVar2;
        boolean z4;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f5922a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.f1338p0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i10 += iVar.f735c;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.f1338p0;
                int abs = Math.abs(iVar2.f734b) + Math.abs(iVar2.f733a);
                for (int i14 = 0; i14 < iVar2.f735c * 2; i14 += 2) {
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
                    rVar2.f5913a = z4;
                    rVar2.f5914b = abs;
                    rVar2.f5915c = i15;
                    rVar2.d = recyclerView4;
                    rVar2.f5916e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f5921f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (rVar = (r) arrayList.get(i16)).d) != null; i16++) {
            if (rVar.f5913a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            m1 c3 = c(recyclerView, rVar.f5916e, j11);
            if (c3 != null && c3.f5876b != null && c3.g() && !c3.h() && (recyclerView2 = (RecyclerView) c3.f5876b.get()) != null) {
                if (recyclerView2.N && recyclerView2.f1325e.u() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.f1338p0;
                iVar3.b(recyclerView2, true);
                if (iVar3.f735c != 0) {
                    try {
                        int i17 = n0.g.f15180a;
                        Trace.beginSection("RV Nested Prefetch");
                        j1 j1Var = recyclerView2.f1339q0;
                        p0 p0Var = recyclerView2.f1347w;
                        j1Var.d = 1;
                        j1Var.f5830e = p0Var.h();
                        j1Var.f5832g = false;
                        j1Var.h = false;
                        j1Var.f5833i = false;
                        for (int i18 = 0; i18 < iVar3.f735c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i18], j10);
                        }
                        Trace.endSection();
                        rVar.f5913a = false;
                        rVar.f5914b = 0;
                        rVar.f5915c = 0;
                        rVar.d = null;
                        rVar.f5916e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f15180a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            rVar.f5913a = false;
            rVar.f5914b = 0;
            rVar.f5915c = 0;
            rVar.d = null;
            rVar.f5916e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f5922a;
        try {
            int i10 = n0.g.f15180a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f5924c);
                }
            }
            this.f5923b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f5923b = 0L;
            int i12 = n0.g.f15180a;
            Trace.endSection();
            throw th2;
        }
    }
}
