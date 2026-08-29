package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import cg.m2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s implements Runnable {
    public static final ThreadLocal f6473e = new ThreadLocal();
    public static final d2.a f6474f = new d2.a(2);
    public ArrayList f6475a;
    public long f6476b;
    public long f6477c;
    public ArrayList d;

    public static n1 c(RecyclerView recyclerView, int i10, long j10) {
        int u10 = recyclerView.f1834e.u();
        for (int i11 = 0; i11 < u10; i11++) {
            n1 U = RecyclerView.U(recyclerView.f1834e.t(i11));
            if (U.f6434c == i10 && !U.h()) {
                return null;
            }
        }
        d1 d1Var = recyclerView.f1829b;
        try {
            try {
                recyclerView.g0();
                n1 j11 = d1Var.j(i10, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        d1Var.g(j11.f6432a);
                    } else {
                        d1Var.a(j11, false);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new m2(recyclerView, 14));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.C && this.f6476b == 0) {
            this.f6476b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1846o0;
        iVar.f1252a = i10;
        iVar.f1253b = i11;
    }

    public final void b(long j10) {
        r rVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        r rVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f6475a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.f1846o0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i10 += iVar.f1254c;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.f1846o0;
                int abs = Math.abs(iVar2.f1253b) + Math.abs(iVar2.f1252a);
                for (int i14 = 0; i14 < iVar2.f1254c * 2; i14 += 2) {
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rVar2.f6465a = z10;
                    rVar2.f6466b = abs;
                    rVar2.f6467c = i15;
                    rVar2.d = recyclerView4;
                    rVar2.f6468e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f6474f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (rVar = (r) arrayList.get(i16)).d) != null; i16++) {
            if (rVar.f6465a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            n1 c3 = c(recyclerView, rVar.f6468e, j11);
            if (c3 != null && c3.f6433b != null && c3.g() && !c3.h() && (recyclerView2 = (RecyclerView) c3.f6433b.get()) != null) {
                if (recyclerView2.M && recyclerView2.f1834e.u() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.f1846o0;
                iVar3.b(recyclerView2, true);
                if (iVar3.f1254c != 0) {
                    try {
                        int i17 = n0.g.f17081a;
                        Trace.beginSection("RV Nested Prefetch");
                        k1 k1Var = recyclerView2.f1847p0;
                        p0 p0Var = recyclerView2.f1856w;
                        k1Var.d = 1;
                        k1Var.f6395e = p0Var.h();
                        k1Var.f6397g = false;
                        k1Var.h = false;
                        k1Var.f6398i = false;
                        for (int i18 = 0; i18 < iVar3.f1254c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i18], j10);
                        }
                        Trace.endSection();
                        rVar.f6465a = false;
                        rVar.f6466b = 0;
                        rVar.f6467c = 0;
                        rVar.d = null;
                        rVar.f6468e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f17081a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            rVar.f6465a = false;
            rVar.f6466b = 0;
            rVar.f6467c = 0;
            rVar.d = null;
            rVar.f6468e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f6475a;
        try {
            int i10 = n0.g.f17081a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f6477c);
                }
            }
            this.f6476b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f6476b = 0L;
            int i12 = n0.g.f17081a;
            Trace.endSection();
            throw th2;
        }
    }
}
