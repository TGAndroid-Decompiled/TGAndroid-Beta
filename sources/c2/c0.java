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
    public static e f2126c;
    public final Context f2127a;
    public final ArrayList f2128b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public c0(Context context) {
        this.f2127a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f2126c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static c0 d(Context context) {
        if (context != null) {
            b();
            if (f2126c == null) {
                f2126c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f2126c.f2140i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    c0 c0Var = (c0) ((WeakReference) arrayList.get(size)).get();
                    if (c0Var == null) {
                        arrayList.remove(size);
                    } else if (c0Var.f2127a == context) {
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
        e eVar = f2126c;
        if (eVar != null) {
            a5.m mVar = eVar.C;
            if (mVar != null) {
                android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) mVar.f98b;
                if (d0Var != null) {
                    return d0Var.f310a.f336b;
                }
                return null;
            }
            android.support.v4.media.session.d0 d0Var2 = eVar.D;
            if (d0Var2 != null) {
                return d0Var2.f310a.f336b;
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
        if (f2126c == null) {
            return false;
        }
        f0 f0Var = c().f2152u;
        if (f0Var != null && (bundle = f0Var.f2166e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(f0 f0Var) {
        boolean z10;
        b();
        e c10 = c();
        f0 f0Var2 = c10.f2152u;
        b bVar = c10.f2134a;
        c10.f2152u = f0Var;
        if (c10.f()) {
            if (c10.f2149r == null) {
                l lVar = new l(c10.h, new fa.c(c10, 6));
                c10.f2149r = lVar;
                c10.a(lVar, true);
                c10.k();
                a1 a1Var = c10.f2136c;
                ((Handler) a1Var.d).post((androidx.activity.i) a1Var.h);
            }
            if (f0Var2 != null && f0Var2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != f0Var.d) {
                l lVar2 = c10.f2149r;
                lVar2.h = c10.A;
                if (!lVar2.f2220b) {
                    lVar2.f2220b = true;
                    ((androidx.mediarouter.app.d) lVar2.f2222e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c10.f2149r;
            if (lVar3 != null) {
                z d = c10.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f2223f = null;
                    lVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f2143l.remove(d);
                }
                c10.f2149r = null;
                a1 a1Var2 = c10.f2136c;
                ((Handler) a1Var2.d).post((androidx.activity.i) a1Var2.h);
            }
        }
        bVar.b(769, f0Var);
    }

    public static void j(int i9) {
        if (i9 >= 0 && i9 <= 3) {
            b();
            e c10 = c();
            a0 c11 = c10.c();
            if (c10.e() != c11) {
                c10.i(c11, i9);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(v vVar, w wVar, int i9) {
        x xVar;
        boolean z10;
        ArrayList<String> arrayList;
        v vVar2;
        if (vVar != null) {
            if (wVar != null) {
                b();
                ArrayList arrayList2 = this.f2128b;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((x) arrayList2.get(i11)).f2243b == wVar) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    xVar = new x(this, wVar);
                    arrayList2.add(xVar);
                } else {
                    xVar = (x) arrayList2.get(i11);
                }
                boolean z11 = true;
                if (i9 != xVar.d) {
                    xVar.d = i9;
                    z10 = true;
                } else {
                    z10 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i9 & 1) != 0) {
                    z10 = true;
                }
                xVar.f2245e = elapsedRealtime;
                v vVar3 = xVar.f2244c;
                vVar3.a();
                vVar.a();
                if (!vVar3.f2238b.containsAll(vVar.f2238b)) {
                    v vVar4 = xVar.f2244c;
                    if (vVar4 != null) {
                        vVar4.a();
                        if (!vVar4.f2238b.isEmpty()) {
                            arrayList = new ArrayList<>(vVar4.f2238b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c10 = vVar.c();
                        if (!c10.isEmpty()) {
                            int size2 = c10.size();
                            while (i10 < size2) {
                                Object obj = c10.get(i10);
                                i10++;
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
                            vVar2 = v.f2236c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            vVar2 = new v(bundle, arrayList);
                        }
                        xVar.f2244c = vVar2;
                    } else {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else {
                    z11 = z10;
                }
                if (z11) {
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
            ArrayList arrayList = this.f2128b;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    if (((x) arrayList.get(i9)).f2243b == wVar) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                arrayList.remove(i9);
                c().k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
