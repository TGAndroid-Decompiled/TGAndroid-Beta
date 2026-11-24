package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class b6c {
    public final int a;

    public b6c() {
        int i = c6c.K;
        c6c.K = i + 1;
        this.a = i;
    }

    public static void h(b6c b6cVar) {
        if (c6c.M == null) {
            c6c.M = new HashMap();
        }
        if (c6c.L == null) {
            c6c.L = new LongSparseArray();
        }
        Class<?> cls = b6cVar.getClass();
        if (!c6c.M.containsKey(cls)) {
            c6c.M.put(cls, b6cVar);
            c6c.L.put(b6cVar.a, b6cVar);
        }
    }

    public boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.I(c6cVar2);
    }

    public View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        n5 n5Var = new n5(i, ylbVar, context);
        n5Var.setLayoutParams(qoe.c(-2.0f, -1));
        return n5Var;
    }

    public boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.J(c6cVar2);
    }

    public boolean f() {
        return !(this instanceof li9);
    }

    public boolean g() {
        return this instanceof q22;
    }

    public void a(r59 r59Var, View view, c6c c6cVar) {
    }

    public void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
    }
}
