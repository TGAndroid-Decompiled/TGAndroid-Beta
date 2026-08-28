package c2;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f2116a = new ArrayList();
    public final ArrayList f2117b = new ArrayList();
    public final e f2118c;

    public b(e eVar) {
        this.f2118c = eVar;
    }

    public static void a(x xVar, int i9, Object obj, int i10) {
        a0 a0Var;
        a0 a0Var2;
        boolean z10;
        c0 c0Var = xVar.f2242a;
        w wVar = xVar.f2243b;
        int i11 = 65280 & i9;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 == 768 && i9 == 769) {
                    wVar.l((f0) obj);
                    return;
                }
                return;
            }
            z zVar = (z) obj;
            switch (i9) {
                case 513:
                    wVar.a();
                    return;
                case 514:
                    wVar.c();
                    return;
                case 515:
                    wVar.b();
                    return;
                default:
                    return;
            }
        }
        if (i9 != 264 && i9 != 262) {
            a0Var = (a0) obj;
        } else {
            a0Var = (a0) ((q0.b) obj).f45894b;
        }
        if (i9 != 264 && i9 != 262) {
            a0Var2 = null;
        } else {
            a0Var2 = (a0) ((q0.b) obj).f45893a;
        }
        if (a0Var != null) {
            boolean z11 = true;
            if ((xVar.d & 2) == 0 && !a0Var.h(xVar.f2244c)) {
                f0 f0Var = c0.c().f2152u;
                if (f0Var == null) {
                    z10 = false;
                } else {
                    z10 = f0Var.d;
                }
                z11 = (z10 && a0Var.d() && i9 == 262 && i10 == 3 && a0Var2 != null) ? true ^ a0Var2.d() : false;
            }
            if (z11) {
                switch (i9) {
                    case 257:
                        wVar.d(a0Var);
                        return;
                    case 258:
                        wVar.f(a0Var);
                        return;
                    case 259:
                        wVar.e(a0Var);
                        return;
                    case 260:
                        wVar.k(a0Var);
                        return;
                    case 261:
                        wVar.getClass();
                        return;
                    case 262:
                        wVar.h(c0Var, a0Var, i10);
                        return;
                    case 263:
                        wVar.j(c0Var, a0Var, i10);
                        return;
                    case 264:
                        wVar.h(c0Var, a0Var, i10);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i9, Object obj) {
        obtainMessage(i9, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.f2116a;
        e eVar = this.f2118c;
        ArrayList arrayList2 = eVar.f2140i;
        p0 p0Var = eVar.f2150s;
        int i9 = message.what;
        Object obj = message.obj;
        int i10 = message.arg1;
        if (i9 == 259 && eVar.e().f2092c.equals(((a0) obj).f2092c)) {
            eVar.o(true);
        }
        int i11 = 0;
        ArrayList arrayList3 = this.f2117b;
        if (i9 != 262) {
            if (i9 != 264) {
                switch (i9) {
                    case 257:
                        p0Var.v((a0) obj);
                        break;
                    case 258:
                        p0Var.w((a0) obj);
                        break;
                    case 259:
                        a0 a0Var = (a0) obj;
                        p0Var.getClass();
                        if (a0Var.c() != p0Var && (q10 = p0Var.q(a0Var)) >= 0) {
                            p0Var.C((o0) p0Var.D.get(q10));
                            break;
                        }
                        break;
                }
            } else {
                a0 a0Var2 = (a0) ((q0.b) obj).f45894b;
                arrayList3.add(a0Var2);
                p0Var.v(a0Var2);
                p0Var.x(a0Var2);
            }
        } else {
            a0 a0Var3 = (a0) ((q0.b) obj).f45894b;
            p0Var.x(a0Var3);
            if (eVar.v != null && a0Var3.d()) {
                int size = arrayList3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    p0Var.w((a0) obj2);
                }
                arrayList3.clear();
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    c0 c0Var = (c0) ((WeakReference) arrayList2.get(size2)).get();
                    if (c0Var == null) {
                        arrayList2.remove(size2);
                    } else {
                        arrayList.addAll(c0Var.f2128b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i11 < size3) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        a((x) obj3, i9, obj, i10);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
