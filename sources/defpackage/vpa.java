package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class vpa {
    public static final os3 o = new os3((byte) 1);
    public static final os3 p = new os3((byte) 2);
    public static final os3 q = new os3((byte) 3);
    public static final os3 r = new os3((byte) 4);
    public static final os3 s = new os3((byte) 5);
    public static final os3 t = new os3((byte) 6);
    public static final os3 u = new os3((byte) 7);
    public static final os3 v = new os3((byte) 0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final vk4 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public wpa m;
    public float n;

    public vpa(Object obj, vk4 vk4Var, int i) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = vk4Var;
        if (vk4Var != s && vk4Var != t && vk4Var != u) {
            if (vk4Var == v) {
                this.j = 0.00390625f;
                return;
            } else if (vk4Var != q && vk4Var != r) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }

    public final void a(ps3 ps3Var) {
        ArrayList arrayList = this.k;
        if (!arrayList.contains(ps3Var)) {
            arrayList.add(ps3Var);
        }
    }

    public final void b(qs3 qs3Var) {
        if (!this.f) {
            ArrayList arrayList = this.l;
            if (!arrayList.contains(qs3Var)) {
                arrayList.add(qs3Var);
                return;
            }
            return;
        }
        qyc.c("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        wpa wpaVar = this.m;
        if (wpaVar == null) {
            wpaVar = new wpa(f);
            this.m = wpaVar;
        }
        wpaVar.i = f;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void e(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        ThreadLocal threadLocal = on.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new on());
        }
        on onVar = (on) threadLocal.get();
        onVar.a.remove(this);
        ArrayList arrayList2 = onVar.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            onVar.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((ps3) arrayList.get(i)).a(this, z, this.b, this.a);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f) {
        if (f > 0.0f) {
            this.j = f;
        } else {
            lq5.j("Minimum visible change must be positive.");
        }
    }

    public final void g(float f) {
        ArrayList arrayList;
        this.e.b(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((qs3) arrayList.get(i)).a(this, this.b, this.a);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void h() {
        wpa wpaVar = this.m;
        if (wpaVar != null) {
            double d = (float) wpaVar.i;
            if (d <= this.g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.j * 0.75f);
                    wpaVar.d = abs;
                    wpaVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z = this.f;
                        if (!z && !z) {
                            this.f = true;
                            if (!this.c) {
                                this.b = this.e.a(this.d);
                            }
                            float f = this.b;
                            if (f <= this.g && f >= this.h) {
                                ThreadLocal threadLocal = on.f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new on());
                                }
                                on onVar = (on) threadLocal.get();
                                ArrayList arrayList = onVar.b;
                                if (arrayList.size() == 0) {
                                    rx6 rx6Var = onVar.d;
                                    if (rx6Var == null) {
                                        rx6Var = new rx6(onVar.c);
                                        onVar.d = rx6Var;
                                    }
                                    ((Choreographer) rx6Var.c).postFrameCallback((nn) rx6Var.d);
                                }
                                if (!arrayList.contains(this)) {
                                    arrayList.add(this);
                                    return;
                                }
                                return;
                            }
                            lq5.j("Starting value need to be in between min value and max value");
                            return;
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                qyc.c("Final position of the spring cannot be less than the min value.");
                return;
            }
            qyc.c("Final position of the spring cannot be greater than the max value.");
            return;
        }
        qyc.c("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public vpa(Object obj, vk4 vk4Var, float f) {
        this(obj, vk4Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.m = new wpa(f);
    }

    public vpa(xk4 xk4Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new tm(xk4Var, (byte) 1);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
    }

    public vpa(Object obj, vk4 vk4Var) {
        this(obj, vk4Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
    }
}
