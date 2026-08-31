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
public final class c0 {
    public static e f2069c;
    public final Context f2070a;
    public final ArrayList f2071b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public c0(Context context) {
        this.f2070a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f2069c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static c0 d(Context context) {
        if (context != null) {
            b();
            if (f2069c == null) {
                f2069c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f2069c.f2082i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    c0 c0Var = (c0) ((WeakReference) arrayList.get(size)).get();
                    if (c0Var == null) {
                        arrayList.remove(size);
                    } else if (c0Var.f2070a == context) {
                        return c0Var;
                    }
                } else {
                    c0 c0Var2 = new c0(context);
                    arrayList.add(new WeakReference(c0Var2));
                    return c0Var2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = f2069c;
        if (eVar != null) {
            androidx.biometric.e eVar2 = eVar.C;
            if (eVar2 != null) {
                android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) eVar2.f527b;
                if (c0Var != null) {
                    return c0Var.f279a.f304b;
                }
                return null;
            }
            android.support.v4.media.session.c0 c0Var2 = eVar.D;
            if (c0Var2 != null) {
                return c0Var2.f279a.f304b;
            }
            return null;
        }
        return null;
    }

    public static a0 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (f2069c == null) {
            return false;
        }
        f0 f0Var = c().f2094u;
        if (f0Var != null && (bundle = f0Var.f2108e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(f0 f0Var) {
        boolean z4;
        b();
        e c3 = c();
        f0 f0Var2 = c3.f2094u;
        b bVar = c3.f2076a;
        c3.f2094u = f0Var;
        if (c3.f()) {
            if (c3.f2091r == null) {
                l lVar = new l(c3.h, new ja.c(c3));
                c3.f2091r = lVar;
                c3.a(lVar, true);
                c3.k();
                z0 z0Var = c3.f2078c;
                ((Handler) z0Var.d).post((androidx.activity.i) z0Var.h);
            }
            if (f0Var2 != null && f0Var2.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != f0Var.d) {
                l lVar2 = c3.f2091r;
                lVar2.h = c3.A;
                if (!lVar2.f2173b) {
                    lVar2.f2173b = true;
                    ((androidx.mediarouter.app.d) lVar2.f2175e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c3.f2091r;
            if (lVar3 != null) {
                z d = c3.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f2176f = null;
                    lVar3.h(null);
                    c3.m(d, null);
                    bVar.b(514, d);
                    c3.f2085l.remove(d);
                }
                c3.f2091r = null;
                z0 z0Var2 = c3.f2078c;
                ((Handler) z0Var2.d).post((androidx.activity.i) z0Var2.h);
            }
        }
        bVar.b(769, f0Var);
    }

    public static void j(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            b();
            e c3 = c();
            a0 c10 = c3.c();
            if (c3.e() != c10) {
                c3.i(c10, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(v vVar, w wVar, int i10) {
        x xVar;
        boolean z4;
        ArrayList<String> arrayList;
        v vVar2;
        if (vVar != null) {
            if (wVar != null) {
                b();
                ArrayList arrayList2 = this.f2071b;
                int size = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (((x) arrayList2.get(i12)).f2196b == wVar) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 < 0) {
                    xVar = new x(this, wVar);
                    arrayList2.add(xVar);
                } else {
                    xVar = (x) arrayList2.get(i12);
                }
                boolean z10 = true;
                if (i10 != xVar.d) {
                    xVar.d = i10;
                    z4 = true;
                } else {
                    z4 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i10 & 1) != 0) {
                    z4 = true;
                }
                xVar.f2198e = elapsedRealtime;
                v vVar3 = xVar.f2197c;
                vVar3.a();
                vVar.a();
                if (!vVar3.f2185b.containsAll(vVar.f2185b)) {
                    v vVar4 = xVar.f2197c;
                    if (vVar4 != null) {
                        vVar4.a();
                        if (!vVar4.f2185b.isEmpty()) {
                            arrayList = new ArrayList<>(vVar4.f2185b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c3 = vVar.c();
                        if (!c3.isEmpty()) {
                            int size2 = c3.size();
                            while (i11 < size2) {
                                Object obj = c3.get(i11);
                                i11++;
                                String str = (String) obj;
                                if (str != null) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    if (!arrayList.contains(str)) {
                                        arrayList.add(str);
                                    }
                                } else {
                                    throw new IllegalArgumentException("category must not be null");
                                }
                            }
                        }
                        if (arrayList == null) {
                            vVar2 = v.f2183c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            vVar2 = new v(bundle, arrayList);
                        }
                        xVar.f2197c = vVar2;
                    } else {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else {
                    z10 = z4;
                }
                if (z10) {
                    c().k();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("callback must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void h(w wVar) {
        if (wVar != null) {
            b();
            ArrayList arrayList = this.f2071b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((x) arrayList.get(i10)).f2196b == wVar) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                arrayList.remove(i10);
                c().k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
