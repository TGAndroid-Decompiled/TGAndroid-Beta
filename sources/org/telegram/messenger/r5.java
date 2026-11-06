package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f25233j;
    public static r5 f25234k;
    public static final ArrayList f25235l = new ArrayList();
    public static final androidx.emoji2.text.n f25236m = new androidx.emoji2.text.n(4);
    public ArrayList f25237a;
    public SparseIntArray f25238b;
    public ArrayList f25239c;
    public int d;
    public int f25240e;
    public int f25241f;
    public int f25242g;
    public boolean h;
    public m.f3 f25243i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z9 = r2.f25199a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f25233j == null) {
            ArrayList arrayList = f25235l;
            if (!arrayList.isEmpty()) {
                f25233j = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
            } else {
                f25233j = new ArrayList(100);
            }
            g0.h3(f25236m);
        }
        f25233j.add(runnable);
    }
}
