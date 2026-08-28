package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u implements Runnable {
    public static final ThreadLocal f5534e = new ThreadLocal();
    public static final d2.a f5535f = new d2.a(2);
    public ArrayList f5536a;
    public long f5537b;
    public long f5538c;
    public ArrayList d;

    public static q1 c(RecyclerView recyclerView, int i9, long j10) {
        int v = recyclerView.f1344e.v();
        for (int i10 = 0; i10 < v; i10++) {
            q1 U = RecyclerView.U(recyclerView.f1344e.u(i10));
            if (U.f5503c == i9 && !U.h()) {
                return null;
            }
        }
        g1 g1Var = recyclerView.f1339b;
        try {
            try {
                recyclerView.g0();
                q1 j11 = g1Var.j(i9, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        g1Var.g(j11.f5501a);
                    } else {
                        g1Var.a(j11, false);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new af.e(recyclerView, 24));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th) {
            recyclerView.h0(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i9, int i10) {
        if (recyclerView.C && this.f5537b == 0) {
            this.f5537b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1356o0;
        iVar.f758a = i9;
        iVar.f759b = i10;
    }

    public final void b(long j10) {
        t tVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        t tVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f5536a;
        int size = arrayList2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.f1356o0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i9 += iVar.f760c;
            }
        }
        arrayList.ensureCapacity(i9);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.f1356o0;
                int abs = Math.abs(iVar2.f759b) + Math.abs(iVar2.f758a);
                for (int i13 = 0; i13 < iVar2.f760c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        tVar2 = obj;
                    } else {
                        tVar2 = (t) arrayList.get(i11);
                    }
                    int[] iArr = (int[]) iVar2.d;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tVar2.f5528a = z10;
                    tVar2.f5529b = abs;
                    tVar2.f5530c = i14;
                    tVar2.d = recyclerView4;
                    tVar2.f5531e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f5535f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (tVar = (t) arrayList.get(i15)).d) != null; i15++) {
            if (tVar.f5528a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            q1 c10 = c(recyclerView, tVar.f5531e, j11);
            if (c10 != null && c10.f5502b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f5502b.get()) != null) {
                if (recyclerView2.M && recyclerView2.f1344e.v() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.f1356o0;
                iVar3.b(recyclerView2, true);
                if (iVar3.f760c != 0) {
                    try {
                        int i16 = n0.g.f18255a;
                        Trace.beginSection("RV Nested Prefetch");
                        n1 n1Var = recyclerView2.f1357p0;
                        r0 r0Var = recyclerView2.f1366w;
                        n1Var.d = 1;
                        n1Var.f5472e = r0Var.h();
                        n1Var.f5474g = false;
                        n1Var.h = false;
                        n1Var.f5475i = false;
                        for (int i17 = 0; i17 < iVar3.f760c * 2; i17 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i17], j10);
                        }
                        Trace.endSection();
                        tVar.f5528a = false;
                        tVar.f5529b = 0;
                        tVar.f5530c = 0;
                        tVar.d = null;
                        tVar.f5531e = 0;
                    } catch (Throwable th) {
                        int i18 = n0.g.f18255a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            tVar.f5528a = false;
            tVar.f5529b = 0;
            tVar.f5530c = 0;
            tVar.d = null;
            tVar.f5531e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f5536a;
        try {
            int i9 = n0.g.f18255a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f5538c);
                }
            }
            this.f5537b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f5537b = 0L;
            int i11 = n0.g.f18255a;
            Trace.endSection();
            throw th;
        }
    }
}
