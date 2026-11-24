package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
public final class g16 extends w06 {
    public d84 a;
    public v06 b;
    public final WeakReference c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final hwa h;

    public g16(e16 e16Var) {
        new AtomicReference(null);
        this.a = new d84();
        v06 v06Var = v06.b;
        this.b = v06Var;
        this.g = new ArrayList();
        this.c = new WeakReference(e16Var);
        this.h = new hwa(v06Var);
    }

    @Override
    public final void a(d16 d16Var) {
        b16 ib3Var;
        Object obj;
        e16 e16Var;
        u06 u06Var;
        d("addObserver");
        v06 v06Var = this.b;
        v06 v06Var2 = v06.a;
        if (v06Var != v06Var2) {
            v06Var2 = v06.b;
        }
        ?? obj2 = new Object();
        HashMap hashMap = h16.a;
        boolean z = d16Var instanceof b16;
        boolean z2 = d16Var instanceof mw3;
        boolean z3 = false;
        if (z && z2) {
            ib3Var = new ib3((mw3) d16Var, (b16) d16Var, (byte) 0);
        } else if (z2) {
            ib3Var = new ib3((mw3) d16Var, null, (byte) 0);
        } else if (z) {
            ib3Var = (b16) d16Var;
        } else {
            Class<?> cls = d16Var.getClass();
            if (h16.b(cls) == 2) {
                Object obj3 = h16.b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    bs4[] bs4VarArr = new bs4[size];
                    if (size <= 0) {
                        ib3Var = new k29(bs4VarArr, (byte) 1);
                    } else {
                        h16.a((Constructor) list.get(0), d16Var);
                        throw null;
                    }
                } else {
                    h16.a((Constructor) list.get(0), d16Var);
                    throw null;
                }
            } else {
                ib3Var = new ib3(d16Var);
            }
        }
        obj2.b = ib3Var;
        obj2.a = v06Var2;
        d84 d84Var = this.a;
        to9 h = d84Var.h(d16Var);
        if (h != null) {
            obj = h.b;
        } else {
            HashMap hashMap2 = d84Var.e;
            to9 to9Var = new to9(d16Var, obj2);
            d84Var.d++;
            to9 to9Var2 = d84Var.b;
            if (to9Var2 == null) {
                d84Var.a = to9Var;
                d84Var.b = to9Var;
            } else {
                to9Var2.c = to9Var;
                to9Var.d = to9Var2;
                d84Var.b = to9Var;
            }
            hashMap2.put(d16Var, to9Var);
            obj = null;
        }
        if (((f16) obj) != null || (e16Var = (e16) this.c.get()) == null) {
            return;
        }
        if (this.d != 0 || this.e) {
            z3 = true;
        }
        v06 c = c(d16Var);
        this.d++;
        while (obj2.a.compareTo(c) < 0 && this.a.e.containsKey(d16Var)) {
            v06 v06Var3 = obj2.a;
            ArrayList arrayList = this.g;
            arrayList.add(v06Var3);
            s06 s06Var = u06.Companion;
            v06 v06Var4 = obj2.a;
            s06Var.getClass();
            v06Var4.getClass();
            int ordinal = v06Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        u06Var = null;
                    } else {
                        u06Var = u06.ON_RESUME;
                    }
                } else {
                    u06Var = u06.ON_START;
                }
            } else {
                u06Var = u06.ON_CREATE;
            }
            if (u06Var != null) {
                obj2.a(e16Var, u06Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(d16Var);
            } else {
                wn4.p(obj2.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            g();
        }
        this.d--;
    }

    @Override
    public final void b(d16 d16Var) {
        d16Var.getClass();
        d("removeObserver");
        this.a.i(d16Var);
    }

    public final v06 c(d16 d16Var) {
        to9 to9Var;
        v06 v06Var;
        HashMap hashMap = this.a.e;
        v06 v06Var2 = null;
        if (hashMap.containsKey(d16Var)) {
            to9Var = ((to9) hashMap.get(d16Var)).d;
        } else {
            to9Var = null;
        }
        if (to9Var != null) {
            v06Var = ((f16) to9Var.b).a;
        } else {
            v06Var = null;
        }
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            v06Var2 = (v06) b00.f(1, arrayList);
        }
        v06 v06Var3 = this.b;
        if (v06Var == null || v06Var.compareTo(v06Var3) >= 0) {
            v06Var = v06Var3;
        }
        if (v06Var2 != null && v06Var2.compareTo(v06Var) < 0) {
            return v06Var2;
        }
        return v06Var;
    }

    public final void d(String str) {
        xr.a().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(tb4.y("Method ", str, " must be called on the main thread").toString());
    }

    public final void e(u06 u06Var) {
        u06Var.getClass();
        d("handleLifecycleEvent");
        f(u06Var.a());
    }

    public final void f(v06 v06Var) {
        v06 v06Var2 = this.b;
        if (v06Var2 != v06Var) {
            v06 v06Var3 = v06.b;
            v06 v06Var4 = v06.a;
            if (v06Var2 == v06Var3 && v06Var == v06Var4) {
                StringBuilder sb = new StringBuilder("State must be at least CREATED to move to ");
                sb.append(v06Var);
                sb.append(", but was ");
                sb.append(this.b);
                Object obj = this.c.get();
                sb.append(" in component ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.b = v06Var;
            if (!this.e && this.d == 0) {
                this.e = true;
                g();
                this.e = false;
                if (this.b == v06Var4) {
                    this.a = new d84();
                    return;
                }
                return;
            }
            this.f = true;
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g16.g():void");
    }
}
