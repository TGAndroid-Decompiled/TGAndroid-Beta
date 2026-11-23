package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class s5 {
    public static ArrayList f26708j;
    public static s5 f26709k;
    public static final ArrayList f26710l = new ArrayList();
    public static final androidx.emoji2.text.o f26711m = new androidx.emoji2.text.o(4);
    public ArrayList f26712a;
    public SparseIntArray f26713b;
    public ArrayList f26714c;
    public int d;
    public int f26715e;
    public int f26716f;
    public int f26717g;
    public boolean h;
    public j6.o f26718i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = s2.f26694a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26708j == null) {
            ArrayList arrayList = f26710l;
            if (!arrayList.isEmpty()) {
                f26708j = (ArrayList) p5.c.g(1, arrayList);
            } else {
                f26708j = new ArrayList(100);
            }
            g0.g3(f26711m);
        }
        f26708j.add(runnable);
    }
}
