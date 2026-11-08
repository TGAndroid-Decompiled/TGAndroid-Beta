package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f25247j;
    public static r5 f25248k;
    public static final ArrayList f25249l = new ArrayList();
    public static final androidx.emoji2.text.n f25250m = new androidx.emoji2.text.n(4);
    public ArrayList f25251a;
    public SparseIntArray f25252b;
    public ArrayList f25253c;
    public int d;
    public int f25254e;
    public int f25255f;
    public int f25256g;
    public boolean h;
    public m.f3 f25257i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z9 = r2.f25212a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f25247j == null) {
            ArrayList arrayList = f25249l;
            if (!arrayList.isEmpty()) {
                f25247j = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
            } else {
                f25247j = new ArrayList(100);
            }
            g0.h3(f25250m);
        }
        f25247j.add(runnable);
    }
}
