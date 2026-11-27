package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.a;
public final class vo3 {
    public static ArrayList j;
    public static vo3 k;
    public static final ArrayList l = new ArrayList();
    public static final tv m = new tv((byte) 6);
    public ArrayList a;
    public SparseIntArray b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public p1 i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != a.d.getLooper().getThread()) {
            boolean z = f11.a;
            cc4.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (!arrayList.isEmpty()) {
                j = (ArrayList) qd4.l(1, arrayList);
            } else {
                j = new ArrayList(100);
            }
            hl.c3(m);
        }
        j.add(runnable);
    }
}
