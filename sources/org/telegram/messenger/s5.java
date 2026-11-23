package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class s5 {
    public static ArrayList f26744j;
    public static s5 f26745k;
    public static final ArrayList f26746l = new ArrayList();
    public static final androidx.emoji2.text.o f26747m = new androidx.emoji2.text.o(4);
    public ArrayList f26748a;
    public SparseIntArray f26749b;
    public ArrayList f26750c;
    public int d;
    public int f26751e;
    public int f26752f;
    public int f26753g;
    public boolean h;
    public j6.o f26754i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = s2.f26730a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26744j == null) {
            ArrayList arrayList = f26746l;
            if (!arrayList.isEmpty()) {
                f26744j = (ArrayList) p5.c.g(1, arrayList);
            } else {
                f26744j = new ArrayList(100);
            }
            g0.g3(f26747m);
        }
        f26744j.add(runnable);
    }
}
