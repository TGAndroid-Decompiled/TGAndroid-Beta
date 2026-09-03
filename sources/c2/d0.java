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
public final class d0 {
    public static e f1935c;
    public final Context f1936a;
    public final ArrayList f1937b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public d0(Context context) {
        this.f1936a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f1935c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static d0 d(Context context) {
        if (context != null) {
            b();
            if (f1935c == null) {
                f1935c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f1935c.f1943i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    d0 d0Var = (d0) ((WeakReference) arrayList.get(size)).get();
                    if (d0Var == null) {
                        arrayList.remove(size);
                    } else if (d0Var.f1936a == context) {
                        return d0Var;
                    }
                } else {
                    d0 d0Var2 = new d0(context);
                    arrayList.add(new WeakReference(d0Var2));
                    return d0Var2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = f1935c;
        if (eVar != null) {
            af.d dVar = eVar.C;
            if (dVar != null) {
                android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) dVar.f159b;
                if (c0Var != null) {
                    return c0Var.f261a.f284b;
                }
                return null;
            }
            android.support.v4.media.session.c0 c0Var2 = eVar.D;
            if (c0Var2 != null) {
                return c0Var2.f261a.f284b;
            }
            return null;
        }
        return null;
    }

    public static b0 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (f1935c == null) {
            return false;
        }
        g0 g0Var = c().f1955u;
        if (g0Var != null && (bundle = g0Var.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(g0 g0Var) {
        boolean z4;
        b();
        e c3 = c();
        g0 g0Var2 = c3.f1955u;
        b bVar = c3.f1938a;
        c3.f1955u = g0Var;
        if (c3.f()) {
            if (c3.f1952r == null) {
                l lVar = new l(c3.h, new bb.b(c3, 4));
                c3.f1952r = lVar;
                c3.a(lVar, true);
                c3.k();
                a1 a1Var = c3.f1940c;
                ((Handler) a1Var.d).post((androidx.activity.i) a1Var.h);
            }
            if (g0Var2 != null && g0Var2.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 != g0Var.d) {
                l lVar2 = c3.f1952r;
                lVar2.h = c3.A;
                if (!lVar2.f2025b) {
                    lVar2.f2025b = true;
                    ((androidx.mediarouter.app.d) lVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c3.f1952r;
            if (lVar3 != null) {
                a0 d = c3.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f2027f = null;
                    lVar3.h(null);
                    c3.m(d, null);
                    bVar.b(514, d);
                    c3.f1946l.remove(d);
                }
                c3.f1952r = null;
                a1 a1Var2 = c3.f1940c;
                ((Handler) a1Var2.d).post((androidx.activity.i) a1Var2.h);
            }
        }
        bVar.b(769, g0Var);
    }

    public static void j(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            b();
            e c3 = c();
            b0 c10 = c3.c();
            if (c3.e() != c10) {
                c3.i(c10, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(w wVar, x xVar, int i10) {
        y yVar;
        boolean z4;
        ArrayList<String> arrayList;
        w wVar2;
        if (wVar != null) {
            if (xVar != null) {
                b();
                ArrayList arrayList2 = this.f1937b;
                int size = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (((y) arrayList2.get(i12)).f2054b == xVar) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 < 0) {
                    yVar = new y(this, xVar);
                    arrayList2.add(yVar);
                } else {
                    yVar = (y) arrayList2.get(i12);
                }
                boolean z10 = true;
                if (i10 != yVar.d) {
                    yVar.d = i10;
                    z4 = true;
                } else {
                    z4 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i10 & 1) != 0) {
                    z4 = true;
                }
                yVar.e = elapsedRealtime;
                w wVar3 = yVar.f2055c;
                wVar3.a();
                wVar.a();
                if (!wVar3.f2043b.containsAll(wVar.f2043b)) {
                    w wVar4 = yVar.f2055c;
                    if (wVar4 != null) {
                        wVar4.a();
                        if (!wVar4.f2043b.isEmpty()) {
                            arrayList = new ArrayList<>(wVar4.f2043b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c3 = wVar.c();
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
                            wVar2 = w.f2041c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            wVar2 = new w(bundle, arrayList);
                        }
                        yVar.f2055c = wVar2;
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

    public final void h(x xVar) {
        if (xVar != null) {
            b();
            ArrayList arrayList = this.f1937b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((y) arrayList.get(i10)).f2054b == xVar) {
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
