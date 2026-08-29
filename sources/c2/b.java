package c2;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class b extends Handler {
    public final ArrayList f2768a = new ArrayList();
    public final ArrayList f2769b = new ArrayList();
    public final e f2770c;

    public b(e eVar) {
        this.f2770c = eVar;
    }

    public static void a(y yVar, int i10, Object obj, int i11) {
        b0 b0Var;
        b0 b0Var2;
        boolean z10;
        d0 d0Var = yVar.f2920a;
        x xVar = yVar.f2921b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    xVar.l((g0) obj);
                    return;
                }
                return;
            }
            a0 a0Var = (a0) obj;
            switch (i10) {
                case 513:
                    xVar.a();
                    return;
                case 514:
                    xVar.c();
                    return;
                case 515:
                    xVar.b();
                    return;
                default:
                    return;
            }
        }
        if (i10 != 264 && i10 != 262) {
            b0Var = (b0) obj;
        } else {
            b0Var = (b0) ((q0.b) obj).f46195b;
        }
        if (i10 != 264 && i10 != 262) {
            b0Var2 = null;
        } else {
            b0Var2 = (b0) ((q0.b) obj).f46194a;
        }
        if (b0Var != null) {
            boolean z11 = true;
            if ((yVar.d & 2) == 0 && !b0Var.h(yVar.f2922c)) {
                g0 g0Var = d0.c().f2822u;
                if (g0Var == null) {
                    z10 = false;
                } else {
                    z10 = g0Var.d;
                }
                z11 = (z10 && b0Var.d() && i10 == 262 && i11 == 3 && b0Var2 != null) ? true ^ b0Var2.d() : false;
            }
            if (z11) {
                switch (i10) {
                    case 257:
                        xVar.d(b0Var);
                        return;
                    case 258:
                        xVar.f(b0Var);
                        return;
                    case 259:
                        xVar.e(b0Var);
                        return;
                    case 260:
                        xVar.k(b0Var);
                        return;
                    case 261:
                        xVar.getClass();
                        return;
                    case 262:
                        xVar.h(d0Var, b0Var, i11);
                        return;
                    case 263:
                        xVar.j(d0Var, b0Var, i11);
                        return;
                    case 264:
                        xVar.h(d0Var, b0Var, i11);
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
        int q6;
        ArrayList arrayList = this.f2768a;
        e eVar = this.f2770c;
        ArrayList arrayList2 = eVar.f2810i;
        q0 q0Var = eVar.f2820s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().f2773c.equals(((b0) obj).f2773c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.f2769b;
        if (i10 != 262) {
            if (i10 != 264) {
                switch (i10) {
                    case 257:
                        q0Var.v((b0) obj);
                        break;
                    case 258:
                        q0Var.w((b0) obj);
                        break;
                    case 259:
                        b0 b0Var = (b0) obj;
                        q0Var.getClass();
                        if (b0Var.c() != q0Var && (q6 = q0Var.q(b0Var)) >= 0) {
                            q0Var.C((p0) q0Var.D.get(q6));
                            break;
                        }
                        break;
                }
            } else {
                b0 b0Var2 = (b0) ((q0.b) obj).f46195b;
                arrayList3.add(b0Var2);
                q0Var.v(b0Var2);
                q0Var.x(b0Var2);
            }
        } else {
            b0 b0Var3 = (b0) ((q0.b) obj).f46195b;
            q0Var.x(b0Var3);
            if (eVar.v != null && b0Var3.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    q0Var.w((b0) obj2);
                }
                arrayList3.clear();
            }
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    d0 d0Var = (d0) ((WeakReference) arrayList2.get(size2)).get();
                    if (d0Var == null) {
                        arrayList2.remove(size2);
                    } else {
                        arrayList.addAll(d0Var.f2803b);
                    }
                } else {
                    int size3 = arrayList.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        a((y) obj3, i10, obj, i11);
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
