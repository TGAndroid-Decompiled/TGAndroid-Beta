package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class s5 {
    public static ArrayList f26843j;
    public static s5 f26844k;
    public static final ArrayList f26845l = new ArrayList();
    public static final androidx.emoji2.text.o f26846m = new androidx.emoji2.text.o(4);
    public ArrayList f26847a;
    public SparseIntArray f26848b;
    public ArrayList f26849c;
    public int d;
    public int f26850e;
    public int f26851f;
    public int f26852g;
    public boolean h;
    public i6.g f26853i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = s2.f26829a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f26843j == null) {
            ArrayList arrayList = f26845l;
            if (!arrayList.isEmpty()) {
                f26843j = (ArrayList) p5.c.g(1, arrayList);
            } else {
                f26843j = new ArrayList(100);
            }
            g0.g3(f26846m);
        }
        f26843j.add(runnable);
    }
}
