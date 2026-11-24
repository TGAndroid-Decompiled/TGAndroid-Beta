package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class b4c {
    public final int a;

    public b4c() {
        int i = c4c.K;
        c4c.K = i + 1;
        this.a = i;
    }

    public static void h(b4c b4cVar) {
        if (c4c.M == null) {
            c4c.M = new HashMap();
        }
        if (c4c.L == null) {
            c4c.L = new LongSparseArray();
        }
        Class<?> cls = b4cVar.getClass();
        if (!c4c.M.containsKey(cls)) {
            c4c.M.put(cls, b4cVar);
            c4c.L.put(b4cVar.a, b4cVar);
        }
    }

    public boolean c(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.I(c4cVar2);
    }

    public View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        n5 n5Var = new n5(i, wjbVar, context);
        n5Var.setLayoutParams(nme.c(-2.0f, -1));
        return n5Var;
    }

    public boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.J(c4cVar2);
    }

    public boolean f() {
        return !(this instanceof hg9);
    }

    public boolean g() {
        return this instanceof f12;
    }

    public void a(o39 o39Var, View view, c4c c4cVar) {
    }

    public void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
    }
}
