package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class yla {
    public static final wr3 o = new wr3((byte) 1);
    public static final wr3 p = new wr3((byte) 2);
    public static final wr3 q = new wr3((byte) 3);
    public static final wr3 r = new wr3((byte) 4);
    public static final wr3 s = new wr3((byte) 5);
    public static final wr3 t = new wr3((byte) 6);
    public static final wr3 u = new wr3((byte) 7);
    public static final wr3 v = new wr3((byte) 0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final ri4 e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public zla m;
    public float n;

    public yla(Object obj, ri4 ri4Var, int i) {
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
        this.e = ri4Var;
        if (ri4Var != s && ri4Var != t && ri4Var != u) {
            if (ri4Var == v) {
                this.j = 0.00390625f;
                return;
            } else if (ri4Var != q && ri4Var != r) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }

    public final void a(xr3 xr3Var) {
        ArrayList arrayList = this.k;
        if (!arrayList.contains(xr3Var)) {
            arrayList.add(xr3Var);
        }
    }

    public final void b(yr3 yr3Var) {
        if (!this.f) {
            ArrayList arrayList = this.l;
            if (!arrayList.contains(yr3Var)) {
                arrayList.add(yr3Var);
                return;
            }
            return;
        }
        fyb.i("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        zla zlaVar = this.m;
        if (zlaVar == null) {
            zlaVar = new zla(f);
            this.m = zlaVar;
        }
        zlaVar.i = f;
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
        ThreadLocal threadLocal = nn.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new nn());
        }
        nn nnVar = (nn) threadLocal.get();
        nnVar.a.remove(this);
        ArrayList arrayList2 = nnVar.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            nnVar.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((xr3) arrayList.get(i)).a(this, z, this.b, this.a);
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
            w26.j("Minimum visible change must be positive.");
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
                ((yr3) arrayList.get(i)).a(this, this.b, this.a);
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
        zla zlaVar = this.m;
        if (zlaVar != null) {
            double d = (float) zlaVar.i;
            if (d <= this.g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.j * 0.75f);
                    zlaVar.d = abs;
                    zlaVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z = this.f;
                        if (!z && !z) {
                            this.f = true;
                            if (!this.c) {
                                this.b = this.e.a(this.d);
                            }
                            float f = this.b;
                            if (f <= this.g && f >= this.h) {
                                ThreadLocal threadLocal = nn.f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new nn());
                                }
                                nn nnVar = (nn) threadLocal.get();
                                ArrayList arrayList = nnVar.b;
                                if (arrayList.size() == 0) {
                                    mv6 mv6Var = nnVar.d;
                                    if (mv6Var == null) {
                                        mv6Var = new mv6(nnVar.c);
                                        nnVar.d = mv6Var;
                                    }
                                    ((Choreographer) mv6Var.c).postFrameCallback((mn) mv6Var.d);
                                }
                                if (!arrayList.contains(this)) {
                                    arrayList.add(this);
                                    return;
                                }
                                return;
                            }
                            w26.j("Starting value need to be in between min value and max value");
                            return;
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                fyb.i("Final position of the spring cannot be less than the min value.");
                return;
            }
            fyb.i("Final position of the spring cannot be greater than the max value.");
            return;
        }
        fyb.i("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public yla(Object obj, ri4 ri4Var, float f) {
        this(obj, ri4Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.m = new zla(f);
    }

    public yla(ti4 ti4Var) {
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
        this.e = new sm(ti4Var, (byte) 1);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
    }

    public yla(Object obj, ri4 ri4Var) {
        this(obj, ri4Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
    }
}
