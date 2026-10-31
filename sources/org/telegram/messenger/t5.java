package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class t5 {
    public static ArrayList f18010j;
    public static t5 f18011k;
    public static final ArrayList f18012l = new ArrayList();
    public static final androidx.emoji2.text.n f18013m = new androidx.emoji2.text.n(3);
    public ArrayList f18014a;
    public SparseIntArray f18015b;
    public ArrayList f18016c;
    public int d;
    public int e;
    public int f18017f;
    public int f18018g;
    public boolean h;
    public mg.c2 f18019i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            boolean z10 = v2.f18448a;
            f8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f18010j == null) {
            ArrayList arrayList = f18012l;
            if (!arrayList.isEmpty()) {
                f18010j = (ArrayList) i0.a.v(1, arrayList);
            } else {
                f18010j = new ArrayList(100);
            }
            i0.g3(f18013m);
        }
        f18010j.add(runnable);
    }
}
