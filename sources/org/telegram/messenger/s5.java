package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class s5 {
    public static ArrayList f26737j;
    public static s5 f26738k;
    public static final ArrayList f26739l = new ArrayList();
    public static final androidx.emoji2.text.o f26740m = new androidx.emoji2.text.o(4);
    public ArrayList f26741a;
    public SparseIntArray f26742b;
    public ArrayList f26743c;
    public int d;
    public int f26744e;
    public int f26745f;
    public int f26746g;
    public boolean h;
    public j6.o f26747i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = s2.f26723a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26737j == null) {
            ArrayList arrayList = f26739l;
            if (!arrayList.isEmpty()) {
                f26737j = (ArrayList) p5.c.g(1, arrayList);
            } else {
                f26737j = new ArrayList(100);
            }
            g0.g3(f26740m);
        }
        f26737j.add(runnable);
    }
}
