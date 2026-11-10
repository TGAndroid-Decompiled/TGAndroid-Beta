package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f25251j;
    public static r5 f25252k;
    public static final ArrayList f25253l = new ArrayList();
    public static final androidx.emoji2.text.n f25254m = new androidx.emoji2.text.n(4);
    public ArrayList f25255a;
    public SparseIntArray f25256b;
    public ArrayList f25257c;
    public int d;
    public int f25258e;
    public int f25259f;
    public int f25260g;
    public boolean h;
    public m.f3 f25261i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z9 = r2.f25216a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f25251j == null) {
            ArrayList arrayList = f25253l;
            if (!arrayList.isEmpty()) {
                f25251j = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
            } else {
                f25251j = new ArrayList(100);
            }
            g0.h3(f25254m);
        }
        f25251j.add(runnable);
    }
}
