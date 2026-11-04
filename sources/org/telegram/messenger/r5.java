package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
public final class r5 {
    public static ArrayList f25073j;
    public static r5 f25074k;
    public static final ArrayList f25075l = new ArrayList();
    public static final androidx.emoji2.text.o f25076m = new androidx.emoji2.text.o(5);
    public ArrayList f25077a;
    public SparseIntArray f25078b;
    public ArrayList f25079c;
    public int d;
    public int f25080e;
    public int f25081f;
    public int f25082g;
    public boolean h;
    public mi.b0 f25083i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = r2.f25040a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (f25073j == null) {
            ArrayList arrayList = f25075l;
            if (!arrayList.isEmpty()) {
                f25073j = (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList);
            } else {
                f25073j = new ArrayList(100);
            }
            g0.h3(f25076m);
        }
        f25073j.add(runnable);
    }
}
