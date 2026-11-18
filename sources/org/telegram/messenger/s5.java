package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class s5 {
    public static ArrayList f26735j;
    public static s5 f26736k;
    public static final ArrayList f26737l = new ArrayList();
    public static final androidx.emoji2.text.o f26738m = new androidx.emoji2.text.o(4);
    public ArrayList f26739a;
    public SparseIntArray f26740b;
    public ArrayList f26741c;
    public int d;
    public int f26742e;
    public int f26743f;
    public int f26744g;
    public boolean h;
    public j6.o f26745i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = s2.f26721a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26735j == null) {
            ArrayList arrayList = f26737l;
            if (!arrayList.isEmpty()) {
                f26735j = (ArrayList) p5.c.g(1, arrayList);
            } else {
                f26735j = new ArrayList(100);
            }
            g0.g3(f26738m);
        }
        f26735j.add(runnable);
    }
}
