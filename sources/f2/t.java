package f2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class t implements Runnable {

    public static final ThreadLocal f5829e = new ThreadLocal();

    public static final d2.a f5830f = new d2.a(2);

    public ArrayList f5831a;

    public long f5832b;

    public long f5833c;
    public ArrayList d;

    public static o1 c(RecyclerView recyclerView, int i10, long j10) {
        int iT = recyclerView.f1840e.t();
        for (int i11 = 0; i11 < iT; i11++) {
            o1 o1VarU = RecyclerView.U(recyclerView.f1840e.s(i11));
            if (o1VarU.f5791c == i10 && !o1VarU.h()) {
                return null;
            }
        }
        e1 e1Var = recyclerView.f1835b;
        try {
            recyclerView.g0();
            o1 o1VarJ = e1Var.j(i10, j10);
            if (o1VarJ != null) {
                if (!o1VarJ.g() || o1VarJ.h()) {
                    e1Var.a(o1VarJ, false);
                } else {
                    e1Var.g(o1VarJ.f5789a);
                }
            }
            return o1VarJ;
        } catch (Exception e9) {
            FileLog.e(e9);
            AndroidUtilities.runOnUIThread(new r(recyclerView, 0));
            return null;
        } finally {
            recyclerView.h0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.C && this.f5832b == 0) {
            this.f5832b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1852o0;
        iVar.f1255a = i10;
        iVar.f1256b = i11;
    }

    public final void b(long j10) {
        s sVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        s sVar2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f5831a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.i iVar = recyclerView3.f1852o0;
            if (windowVisibility == 0) {
                iVar.b(recyclerView3, false);
                i10 += iVar.f1257c;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.i iVar2 = recyclerView4.f1852o0;
                int iAbs = Math.abs(iVar2.f1256b) + Math.abs(iVar2.f1255a);
                for (int i14 = 0; i14 < iVar2.f1257c * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        sVar2 = new s();
                        arrayList.add(sVar2);
                    } else {
                        sVar2 = (s) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) iVar2.d;
                    int i15 = iArr[i14 + 1];
                    sVar2.f5821a = i15 <= iAbs;
                    sVar2.f5822b = iAbs;
                    sVar2.f5823c = i15;
                    sVar2.d = recyclerView4;
                    sVar2.f5824e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f5830f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (sVar = (s) arrayList.get(i16)).d) != null; i16++) {
            o1 o1VarC = c(recyclerView, sVar.f5824e, sVar.f5821a ? Long.MAX_VALUE : j10);
            if (o1VarC != null && o1VarC.f5790b != null && o1VarC.g() && !o1VarC.h() && (recyclerView2 = (RecyclerView) o1VarC.f5790b.get()) != null) {
                if (recyclerView2.M && recyclerView2.f1840e.t() != 0) {
                    recyclerView2.o0();
                }
                androidx.datastore.preferences.protobuf.i iVar3 = recyclerView2.f1852o0;
                iVar3.b(recyclerView2, true);
                if (iVar3.f1257c != 0) {
                    try {
                        int i17 = n0.g.f18080a;
                        Trace.beginSection("RV Nested Prefetch");
                        l1 l1Var = recyclerView2.f1853p0;
                        q0 q0Var = recyclerView2.f1862w;
                        l1Var.d = 1;
                        l1Var.f5760e = q0Var.h();
                        l1Var.f5762g = false;
                        l1Var.h = false;
                        l1Var.f5763i = false;
                        for (int i18 = 0; i18 < iVar3.f1257c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) iVar3.d)[i18], j10);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i19 = n0.g.f18080a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            sVar.f5821a = false;
            sVar.f5822b = 0;
            sVar.f5823c = 0;
            sVar.d = null;
            sVar.f5824e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f5831a;
        try {
            int i10 = n0.g.f18080a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5833c);
                }
            }
            this.f5832b = 0L;
        } finally {
            this.f5832b = 0L;
            int i12 = n0.g.f18080a;
            Trace.endSection();
        }
    }
}
