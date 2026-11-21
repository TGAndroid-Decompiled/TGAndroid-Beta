package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class s5 {
    public static ArrayList f26763j;
    public static s5 f26764k;
    public static final ArrayList f26765l = new ArrayList();
    public static final androidx.emoji2.text.o f26766m = new androidx.emoji2.text.o(4);
    public ArrayList f26767a;
    public SparseIntArray f26768b;
    public ArrayList f26769c;
    public int d;
    public int f26770e;
    public int f26771f;
    public int f26772g;
    public boolean h;
    public j6.o f26773i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = s2.f26749a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26763j == null) {
            ArrayList arrayList = f26765l;
            if (!arrayList.isEmpty()) {
                f26763j = (ArrayList) p5.c.g(1, arrayList);
            } else {
                f26763j = new ArrayList(100);
            }
            g0.g3(f26766m);
        }
        f26763j.add(runnable);
    }
}
