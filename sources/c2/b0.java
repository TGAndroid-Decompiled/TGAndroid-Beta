package c2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class b0 {

    public static e f2236c;

    public final Context f2237a;

    public final ArrayList f2238b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public b0(Context context) {
        this.f2237a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static e c() {
        e eVar = f2236c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static b0 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (f2236c == null) {
            f2236c = new e(context.getApplicationContext());
        }
        ArrayList arrayList = f2236c.f2257i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                b0 b0Var = new b0(context);
                arrayList.add(new WeakReference(b0Var));
                return b0Var;
            }
            b0 b0Var2 = (b0) ((WeakReference) arrayList.get(size)).get();
            if (b0Var2 == null) {
                arrayList.remove(size);
            } else if (b0Var2.f2237a == context) {
                return b0Var2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = f2236c;
        if (eVar == null) {
            return null;
        }
        a5.n nVar = eVar.C;
        if (nVar != null) {
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) nVar.f100b;
            if (d0Var != null) {
                return d0Var.f818a.f844b;
            }
            return null;
        }
        android.support.v4.media.session.d0 d0Var2 = eVar.D;
        if (d0Var2 != null) {
            return d0Var2.f818a.f844b;
        }
        return null;
    }

    public static z f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (f2236c == null) {
            return false;
        }
        e0 e0Var = c().f2269u;
        return e0Var == null || (bundle = e0Var.f2277e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(e0 e0Var) {
        b();
        e eVarC = c();
        e0 e0Var2 = eVarC.f2269u;
        b bVar = eVarC.f2251a;
        eVarC.f2269u = e0Var;
        if (eVarC.f()) {
            if (eVarC.f2266r == null) {
                l lVar = new l(eVarC.h, new ae.b(eVarC, 4));
                eVarC.f2266r = lVar;
                eVarC.a(lVar, true);
                eVarC.k();
                z0 z0Var = eVarC.f2253c;
                ((Handler) z0Var.d).post((a8.b) z0Var.h);
            }
            if ((e0Var2 != null && e0Var2.d) != e0Var.d) {
                l lVar2 = eVarC.f2266r;
                lVar2.h = eVarC.A;
                if (!lVar2.f2340b) {
                    lVar2.f2340b = true;
                    ((androidx.mediarouter.app.c) lVar2.f2342e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = eVarC.f2266r;
            if (lVar3 != null) {
                y yVarD = eVarC.d(lVar3);
                if (yVarD != null) {
                    b();
                    lVar3.f2343f = null;
                    lVar3.h(null);
                    eVarC.m(yVarD, null);
                    bVar.b(514, yVarD);
                    eVarC.f2260l.remove(yVarD);
                }
                eVarC.f2266r = null;
                z0 z0Var2 = eVarC.f2253c;
                ((Handler) z0Var2.d).post((a8.b) z0Var2.h);
            }
        }
        bVar.b(769, e0Var);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e eVarC = c();
        z zVarC = eVarC.c();
        if (eVarC.e() != zVarC) {
            eVarC.i(zVarC, i10);
        }
    }

    public final void a(u uVar, v vVar, int i10) {
        w wVar;
        boolean z10;
        u uVar2;
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (vVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.f2238b;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((w) arrayList.get(i12)).f2355b == vVar) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            wVar = new w(this, vVar);
            arrayList.add(wVar);
        } else {
            wVar = (w) arrayList.get(i12);
        }
        boolean z11 = true;
        if (i10 != wVar.d) {
            wVar.d = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        wVar.f2357e = jElapsedRealtime;
        u uVar3 = wVar.f2356c;
        uVar3.a();
        uVar.a();
        if (uVar3.f2350b.containsAll(uVar.f2350b)) {
            z11 = z10;
        } else {
            u uVar4 = wVar.f2356c;
            if (uVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            uVar4.a();
            ArrayList<String> arrayList2 = !uVar4.f2350b.isEmpty() ? new ArrayList<>(uVar4.f2350b) : null;
            ArrayList arrayListC = uVar.c();
            if (!arrayListC.isEmpty()) {
                int size2 = arrayListC.size();
                while (i11 < size2) {
                    Object obj = arrayListC.get(i11);
                    i11++;
                    String str = (String) obj;
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                uVar2 = u.f2348c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                uVar2 = new u(bundle, arrayList2);
            }
            wVar.f2356c = uVar2;
        }
        if (z11) {
            c().k();
        }
    }

    public final void h(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.f2238b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((w) arrayList.get(i10)).f2355b == vVar) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            c().k();
        }
    }
}
