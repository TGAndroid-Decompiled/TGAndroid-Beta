package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f26233j;
    public static r5 f26234k;
    public static final ArrayList f26235l = new ArrayList();
    public static final androidx.emoji2.text.o f26236m = new androidx.emoji2.text.o(4);
    public ArrayList f26237a;
    public SparseIntArray f26238b;
    public ArrayList f26239c;
    public int d;
    public int f26240e;
    public int f26241f;
    public int f26242g;
    public boolean h;
    public j6.o f26243i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = r2.f26198a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26233j == null) {
            ArrayList arrayList = f26235l;
            if (!arrayList.isEmpty()) {
                f26233j = (ArrayList) r.b.g(1, arrayList);
            } else {
                f26233j = new ArrayList(100);
            }
            g0.h3(f26236m);
        }
        f26233j.add(runnable);
    }
}
