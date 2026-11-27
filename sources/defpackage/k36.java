package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
public final class k36 extends a36 {
    public y84 a;
    public z26 b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final k0b h;

    public k36(i36 i36Var) {
        new AtomicReference(null);
        this.a = new y84();
        z26 z26Var = z26.b;
        this.b = z26Var;
        this.g = new ArrayList();
        this.c = new WeakReference(i36Var);
        this.h = new k0b(z26Var);
    }

    @Override
    public final void a(h36 h36Var) {
        f36 bc3Var;
        Object obj;
        i36 i36Var;
        y26 y26Var;
        d("addObserver");
        z26 z26Var = this.b;
        z26 z26Var2 = z26.a;
        if (z26Var != z26Var2) {
            z26Var2 = z26.b;
        }
        ?? obj2 = new Object();
        HashMap hashMap = l36.a;
        boolean z = h36Var instanceof f36;
        boolean z2 = h36Var instanceof hx3;
        boolean z3 = false;
        if (z && z2) {
            bc3Var = new bc3((hx3) h36Var, (f36) h36Var, (byte) 0);
        } else if (z2) {
            bc3Var = new bc3((hx3) h36Var, null, (byte) 0);
        } else if (z) {
            bc3Var = (f36) h36Var;
        } else {
            Class<?> cls = h36Var.getClass();
            if (l36.b(cls) == 2) {
                Object obj3 = l36.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    fu4[] fu4VarArr = new fu4[size];
                    if (size <= 0) {
                        bc3Var = new z59(fu4VarArr, (byte) 1);
                    } else {
                        l36.a((Constructor) list.get(0), h36Var);
                        throw null;
                    }
                } else {
                    l36.a((Constructor) list.get(0), h36Var);
                    throw null;
                }
            } else {
                bc3Var = new bc3(h36Var);
            }
        }
        obj2.b = bc3Var;
        obj2.a = z26Var2;
        y84 y84Var = this.a;
        ls9 h = y84Var.h(h36Var);
        if (h != null) {
            obj = h.b;
        } else {
            HashMap hashMap2 = y84Var.e;
            ls9 ls9Var = new ls9(h36Var, obj2);
            y84Var.d++;
            ls9 ls9Var2 = y84Var.b;
            if (ls9Var2 == null) {
                y84Var.a = ls9Var;
                y84Var.b = ls9Var;
            } else {
                ls9Var2.c = ls9Var;
                ls9Var.d = ls9Var2;
                y84Var.b = ls9Var;
            }
            hashMap2.put(h36Var, ls9Var);
            obj = null;
        }
        if (((j36) obj) != null || (i36Var = (i36) this.c.get()) == null) {
            return;
        }
        if (this.d != 0 || this.e) {
            z3 = true;
        }
        z26 c = c(h36Var);
        this.d++;
        while (obj2.a.compareTo(c) < 0 && this.a.e.containsKey(h36Var)) {
            z26 z26Var3 = obj2.a;
            ArrayList arrayList = this.g;
            arrayList.add(z26Var3);
            w26 w26Var = y26.Companion;
            z26 z26Var4 = obj2.a;
            w26Var.getClass();
            z26Var4.getClass();
            int ordinal = z26Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        y26Var = null;
                    } else {
                        y26Var = y26.ON_RESUME;
                    }
                } else {
                    y26Var = y26.ON_START;
                }
            } else {
                y26Var = y26.ON_CREATE;
            }
            if (y26Var != null) {
                obj2.a(i36Var, y26Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(h36Var);
            } else {
                lq5.o(obj2.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            g();
        }
        this.d--;
    }

    @Override
    public final void b(h36 h36Var) {
        h36Var.getClass();
        d("removeObserver");
        this.a.i(h36Var);
    }

    public final z26 c(h36 h36Var) {
        ls9 ls9Var;
        z26 z26Var;
        HashMap hashMap = this.a.e;
        z26 z26Var2 = null;
        if (hashMap.containsKey(h36Var)) {
            ls9Var = ((ls9) hashMap.get(h36Var)).d;
        } else {
            ls9Var = null;
        }
        if (ls9Var != null) {
            z26Var = ((j36) ls9Var.b).a;
        } else {
            z26Var = null;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            z26Var2 = (z26) c00.g(1, arrayList);
        }
        z26 z26Var3 = this.b;
        if (z26Var == null || z26Var.compareTo(z26Var3) >= 0) {
            z26Var = z26Var3;
        }
        if (z26Var2 != null && z26Var2.compareTo(z26Var) < 0) {
            return z26Var2;
        }
        return z26Var;
    }

    public final void d(String str) {
        yr.a().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(qd4.y("Method ", str, " must be called on the main thread").toString());
    }

    public final void e(y26 y26Var) {
        y26Var.getClass();
        d("handleLifecycleEvent");
        f(y26Var.a());
    }

    public final void f(z26 z26Var) {
        z26 z26Var2 = this.b;
        if (z26Var2 != z26Var) {
            z26 z26Var3 = z26.b;
            z26 z26Var4 = z26.a;
            if (z26Var2 == z26Var3 && z26Var == z26Var4) {
                StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
                sb.append(z26Var);
                sb.append(", but was ");
                sb.append(this.b);
                Object obj = this.c.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.b = z26Var;
            if (!this.e && this.d == 0) {
                this.e = true;
                g();
                this.e = false;
                if (this.b == z26Var4) {
                    this.a = new y84();
                    return;
                }
                return;
            }
            this.f = true;
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k36.g():void");
    }
}
