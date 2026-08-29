package c2;

import ag.q1;
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
    public static e f2801c;
    public final Context f2802a;
    public final ArrayList f2803b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public d0(Context context) {
        this.f2802a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f2801c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static d0 d(Context context) {
        if (context != null) {
            b();
            if (f2801c == null) {
                f2801c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f2801c.f2810i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    d0 d0Var = (d0) ((WeakReference) arrayList.get(size)).get();
                    if (d0Var == null) {
                        arrayList.remove(size);
                    } else if (d0Var.f2802a == context) {
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
        e eVar = f2801c;
        if (eVar != null) {
            androidx.biometric.e eVar2 = eVar.C;
            if (eVar2 != null) {
                android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) eVar2.f1030b;
                if (d0Var != null) {
                    return d0Var.f805a.f831b;
                }
                return null;
            }
            android.support.v4.media.session.d0 d0Var2 = eVar.D;
            if (d0Var2 != null) {
                return d0Var2.f805a.f831b;
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
        if (f2801c == null) {
            return false;
        }
        g0 g0Var = c().f2822u;
        if (g0Var != null && (bundle = g0Var.f2841e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(g0 g0Var) {
        boolean z10;
        b();
        e c3 = c();
        g0 g0Var2 = c3.f2822u;
        b bVar = c3.f2804a;
        c3.f2822u = g0Var;
        if (c3.f()) {
            if (c3.f2819r == null) {
                l lVar = new l(c3.h, new za.c(c3, 6));
                c3.f2819r = lVar;
                c3.a(lVar, true);
                c3.k();
                b1 b1Var = c3.f2806c;
                ((Handler) b1Var.d).post((q1) b1Var.h);
            }
            if (g0Var2 != null && g0Var2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != g0Var.d) {
                l lVar2 = c3.f2819r;
                lVar2.h = c3.A;
                if (!lVar2.f2898b) {
                    lVar2.f2898b = true;
                    ((a4.d) lVar2.f2900e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c3.f2819r;
            if (lVar3 != null) {
                a0 d = c3.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f2901f = null;
                    lVar3.h(null);
                    c3.m(d, null);
                    bVar.b(514, d);
                    c3.f2813l.remove(d);
                }
                c3.f2819r = null;
                b1 b1Var2 = c3.f2806c;
                ((Handler) b1Var2.d).post((q1) b1Var2.h);
            }
        }
        bVar.b(769, g0Var);
    }

    public static void j(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            b();
            e c3 = c();
            b0 c6 = c3.c();
            if (c3.e() != c6) {
                c3.i(c6, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(w wVar, x xVar, int i10) {
        y yVar;
        boolean z10;
        ArrayList<String> arrayList;
        w wVar2;
        if (wVar != null) {
            if (xVar != null) {
                b();
                ArrayList arrayList2 = this.f2803b;
                int size = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (((y) arrayList2.get(i12)).f2921b == xVar) {
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
                boolean z11 = true;
                if (i10 != yVar.d) {
                    yVar.d = i10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i10 & 1) != 0) {
                    z10 = true;
                }
                yVar.f2923e = elapsedRealtime;
                w wVar3 = yVar.f2922c;
                wVar3.a();
                wVar.a();
                if (!wVar3.f2916b.containsAll(wVar.f2916b)) {
                    w wVar4 = yVar.f2922c;
                    if (wVar4 != null) {
                        wVar4.a();
                        if (!wVar4.f2916b.isEmpty()) {
                            arrayList = new ArrayList<>(wVar4.f2916b);
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
                            wVar2 = w.f2914c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            wVar2 = new w(bundle, arrayList);
                        }
                        yVar.f2922c = wVar2;
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

    public final void h(x xVar) {
        if (xVar != null) {
            b();
            ArrayList arrayList = this.f2803b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((y) arrayList.get(i10)).f2921b == xVar) {
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
