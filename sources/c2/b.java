package c2;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f1898a = new ArrayList();
    public final ArrayList f1899b = new ArrayList();
    public final e f1900c;

    public b(e eVar) {
        this.f1900c = eVar;
    }

    public static void a(x xVar, int i10, Object obj, int i11) {
        a0 a0Var;
        a0 a0Var2;
        boolean z4;
        c0 c0Var = xVar.f2022a;
        w wVar = xVar.f2023b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    wVar.l((f0) obj);
                    return;
                }
                return;
            }
            z zVar = (z) obj;
            switch (i10) {
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
        if (i10 != 264 && i10 != 262) {
            a0Var = (a0) obj;
        } else {
            a0Var = (a0) ((q0.b) obj).f42677b;
        }
        if (i10 != 264 && i10 != 262) {
            a0Var2 = null;
        } else {
            a0Var2 = (a0) ((q0.b) obj).f42676a;
        }
        if (a0Var != null) {
            boolean z10 = true;
            if ((xVar.d & 2) == 0 && !a0Var.h(xVar.f2024c)) {
                f0 f0Var = c0.c().f1928u;
                if (f0Var == null) {
                    z4 = false;
                } else {
                    z4 = f0Var.d;
                }
                z10 = (z4 && a0Var.d() && i10 == 262 && i11 == 3 && a0Var2 != null) ? true ^ a0Var2.d() : false;
            }
            if (z10) {
                switch (i10) {
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
                        wVar.h(c0Var, a0Var, i11);
                        return;
                    case 263:
                        wVar.j(c0Var, a0Var, i11);
                        return;
                    case 264:
                        wVar.h(c0Var, a0Var, i11);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void b(int i10, Object obj) {
        obtainMessage(i10, obj).sendToTarget();
    }

    @Override
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.f1898a;
        e eVar = this.f1900c;
        ArrayList arrayList2 = eVar.f1916i;
        p0 p0Var = eVar.f1926s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().f1878c.equals(((a0) obj).f1878c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.f1899b;
        if (i10 != 262) {
            if (i10 != 264) {
                switch (i10) {
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
                            p0Var.C((o0) p0Var.E.get(q10));
                            break;
                        }
                        break;
                }
            } else {
                a0 a0Var2 = (a0) ((q0.b) obj).f42677b;
                arrayList3.add(a0Var2);
                p0Var.v(a0Var2);
                p0Var.x(a0Var2);
            }
        } else {
            a0 a0Var3 = (a0) ((q0.b) obj).f42677b;
            p0Var.x(a0Var3);
            if (eVar.v != null && a0Var3.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
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
                        arrayList.addAll(c0Var.f1907b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        a((x) obj3, i10, obj, i11);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }
}
