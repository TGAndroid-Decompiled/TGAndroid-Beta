package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f26241j;
    public static r5 f26242k;
    public static final ArrayList f26243l = new ArrayList();
    public static final androidx.emoji2.text.o f26244m = new androidx.emoji2.text.o(4);
    public ArrayList f26245a;
    public SparseIntArray f26246b;
    public ArrayList f26247c;
    public int d;
    public int f26248e;
    public int f26249f;
    public int f26250g;
    public boolean h;
    public j6.o f26251i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = r2.f26206a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26241j == null) {
            ArrayList arrayList = f26243l;
            if (!arrayList.isEmpty()) {
                f26241j = (ArrayList) r.b.g(1, arrayList);
            } else {
                f26241j = new ArrayList(100);
            }
            g0.h3(f26244m);
        }
        f26241j.add(runnable);
    }
}
