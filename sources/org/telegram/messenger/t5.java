package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class t5 {
    public static ArrayList f18211j;
    public static t5 f18212k;
    public static final ArrayList f18213l = new ArrayList();
    public static final androidx.emoji2.text.n f18214m = new androidx.emoji2.text.n(3);
    public ArrayList f18215a;
    public SparseIntArray f18216b;
    public ArrayList f18217c;
    public int d;
    public int e;
    public int f18218f;
    public int f18219g;
    public boolean h;
    public mg.c2 f18220i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            boolean z10 = v2.f18578a;
            f8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f18211j == null) {
            ArrayList arrayList = f18213l;
            if (!arrayList.isEmpty()) {
                f18211j = (ArrayList) i0.a.v(1, arrayList);
            } else {
                f18211j = new ArrayList(100);
            }
            i0.g3(f18214m);
        }
        f18211j.add(runnable);
    }
}
