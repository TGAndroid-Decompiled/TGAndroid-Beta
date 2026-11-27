package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
public abstract class a8c {
    public final int a;

    public a8c() {
        int i = b8c.K;
        b8c.K = i + 1;
        this.a = i;
    }

    public static void h(a8c a8cVar) {
        if (b8c.M == null) {
            b8c.M = new HashMap();
        }
        if (b8c.L == null) {
            b8c.L = new LongSparseArray();
        }
        Class<?> cls = a8cVar.getClass();
        if (!b8c.M.containsKey(cls)) {
            b8c.M.put(cls, a8cVar);
            b8c.L.put(a8cVar.a, a8cVar);
        }
    }

    public boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.I(b8cVar2);
    }

    public View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        o5 o5Var = new o5(i, vnbVar, context);
        o5Var.setLayoutParams(tre.c(-2.0f, -1));
        return o5Var;
    }

    public boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.J(b8cVar2);
    }

    public boolean f() {
        return !(this instanceof yj9);
    }

    public boolean g() {
        return this instanceof v12;
    }

    public void a(d79 d79Var, View view, b8c b8cVar) {
    }

    public void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
    }
}
