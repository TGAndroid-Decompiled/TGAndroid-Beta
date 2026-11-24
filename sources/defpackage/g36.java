package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
public final class g36 extends w26 {
    public m94 a;
    public v26 b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final kya h;

    public g36(e36 e36Var) {
        new AtomicReference(null);
        this.a = new m94();
        v26 v26Var = v26.b;
        this.b = v26Var;
        this.g = new ArrayList();
        this.c = new WeakReference(e36Var);
        this.h = new kya(v26Var);
    }

    @Override
    public final void a(d36 d36Var) {
        b36 uc3Var;
        Object obj;
        e36 e36Var;
        u26 u26Var;
        d("addObserver");
        v26 v26Var = this.b;
        v26 v26Var2 = v26.a;
        if (v26Var != v26Var2) {
            v26Var2 = v26.b;
        }
        ?? obj2 = new Object();
        HashMap hashMap = h36.a;
        boolean z = d36Var instanceof b36;
        boolean z2 = d36Var instanceof xx3;
        boolean z3 = false;
        if (z && z2) {
            uc3Var = new uc3((xx3) d36Var, (b36) d36Var, (byte) 0);
        } else if (z2) {
            uc3Var = new uc3((xx3) d36Var, null, (byte) 0);
        } else if (z) {
            uc3Var = (b36) d36Var;
        } else {
            Class<?> cls = d36Var.getClass();
            if (h36.b(cls) == 2) {
                Object obj3 = h36.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    cu4[] cu4VarArr = new cu4[size];
                    if (size <= 0) {
                        uc3Var = new n49(cu4VarArr, (byte) 1);
                    } else {
                        h36.a((Constructor) list.get(0), d36Var);
                        throw null;
                    }
                } else {
                    h36.a((Constructor) list.get(0), d36Var);
                    throw null;
                }
            } else {
                uc3Var = new uc3(d36Var);
            }
        }
        obj2.b = uc3Var;
        obj2.a = v26Var2;
        m94 m94Var = this.a;
        uq9 h = m94Var.h(d36Var);
        if (h != null) {
            obj = h.b;
        } else {
            HashMap hashMap2 = m94Var.e;
            uq9 uq9Var = new uq9(d36Var, obj2);
            m94Var.d++;
            uq9 uq9Var2 = m94Var.b;
            if (uq9Var2 == null) {
                m94Var.a = uq9Var;
                m94Var.b = uq9Var;
            } else {
                uq9Var2.c = uq9Var;
                uq9Var.d = uq9Var2;
                m94Var.b = uq9Var;
            }
            hashMap2.put(d36Var, uq9Var);
            obj = null;
        }
        if (((f36) obj) != null || (e36Var = (e36) this.c.get()) == null) {
            return;
        }
        if (this.d != 0 || this.e) {
            z3 = true;
        }
        v26 c = c(d36Var);
        this.d++;
        while (obj2.a.compareTo(c) < 0 && this.a.e.containsKey(d36Var)) {
            v26 v26Var3 = obj2.a;
            ArrayList arrayList = this.g;
            arrayList.add(v26Var3);
            s26 s26Var = u26.Companion;
            v26 v26Var4 = obj2.a;
            s26Var.getClass();
            v26Var4.getClass();
            int ordinal = v26Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        u26Var = null;
                    } else {
                        u26Var = u26.ON_RESUME;
                    }
                } else {
                    u26Var = u26.ON_START;
                }
            } else {
                u26Var = u26.ON_CREATE;
            }
            if (u26Var != null) {
                obj2.a(e36Var, u26Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(d36Var);
            } else {
                zo4.r(obj2.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            g();
        }
        this.d--;
    }

    @Override
    public final void b(d36 d36Var) {
        d36Var.getClass();
        d("removeObserver");
        this.a.i(d36Var);
    }

    public final v26 c(d36 d36Var) {
        uq9 uq9Var;
        v26 v26Var;
        HashMap hashMap = this.a.e;
        v26 v26Var2 = null;
        if (hashMap.containsKey(d36Var)) {
            uq9Var = ((uq9) hashMap.get(d36Var)).d;
        } else {
            uq9Var = null;
        }
        if (uq9Var != null) {
            v26Var = ((f36) uq9Var.b).a;
        } else {
            v26Var = null;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            v26Var2 = (v26) b10.f(1, arrayList);
        }
        v26 v26Var3 = this.b;
        if (v26Var == null || v26Var.compareTo(v26Var3) >= 0) {
            v26Var = v26Var3;
        }
        if (v26Var2 != null && v26Var2.compareTo(v26Var) < 0) {
            return v26Var2;
        }
        return v26Var;
    }

    public final void d(String str) {
        xs.a().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(kt6.o("Method ", str, " must be called on the main thread").toString());
    }

    public final void e(u26 u26Var) {
        u26Var.getClass();
        d("handleLifecycleEvent");
        f(u26Var.a());
    }

    public final void f(v26 v26Var) {
        v26 v26Var2 = this.b;
        if (v26Var2 != v26Var) {
            v26 v26Var3 = v26.b;
            v26 v26Var4 = v26.a;
            if (v26Var2 == v26Var3 && v26Var == v26Var4) {
                StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
                sb.append(v26Var);
                sb.append(", but was ");
                sb.append(this.b);
                Object obj = this.c.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.b = v26Var;
            if (!this.e && this.d == 0) {
                this.e = true;
                g();
                this.e = false;
                if (this.b == v26Var4) {
                    this.a = new m94();
                    return;
                }
                return;
            }
            this.f = true;
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g36.g():void");
    }
}
