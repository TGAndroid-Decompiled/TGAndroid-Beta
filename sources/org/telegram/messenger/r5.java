package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f25225j;
    public static r5 f25226k;
    public static final ArrayList f25227l = new ArrayList();
    public static final androidx.emoji2.text.n f25228m = new androidx.emoji2.text.n(4);
    public ArrayList f25229a;
    public SparseIntArray f25230b;
    public ArrayList f25231c;
    public int d;
    public int f25232e;
    public int f25233f;
    public int f25234g;
    public boolean h;
    public m.f3 f25235i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z9 = r2.f25191a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f25225j == null) {
            ArrayList arrayList = f25227l;
            if (!arrayList.isEmpty()) {
                f25225j = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
            } else {
                f25225j = new ArrayList(100);
            }
            g0.h3(f25228m);
        }
        f25225j.add(runnable);
    }
}
