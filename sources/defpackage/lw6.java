package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class lw6 {
    public static a05 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public lw6(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        grb.i("The media router service must only be accessed on the application's main thread.");
    }

    public static a05 c() {
        a05 a05Var = c;
        if (a05Var != null) {
            return a05Var;
        }
        grb.i("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static lw6 d(Context context) {
        if (context != null) {
            b();
            a05 a05Var = c;
            if (a05Var == null) {
                a05Var = new a05(context.getApplicationContext());
                c = a05Var;
            }
            ArrayList arrayList = a05Var.i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    lw6 lw6Var = (lw6) ((WeakReference) arrayList.get(size)).get();
                    if (lw6Var == null) {
                        arrayList.remove(size);
                    } else if (lw6Var.a == context) {
                        return lw6Var;
                    }
                } else {
                    lw6 lw6Var2 = new lw6(context);
                    arrayList.add(new WeakReference(lw6Var2));
                    return lw6Var2;
                }
            }
        } else {
            lq5.j("context must not be null");
            return null;
        }
    }

    public static MediaSessionCompat$Token e() {
        a05 a05Var = c;
        if (a05Var != null) {
            pm3 pm3Var = a05Var.C;
            if (pm3Var != null) {
                rx6 rx6Var = (rx6) pm3Var.b;
                if (rx6Var != null) {
                    return ((ex6) rx6Var.b).c;
                }
                return null;
            }
            rx6 rx6Var2 = a05Var.D;
            if (rx6Var2 != null) {
                return ((ex6) rx6Var2.b).c;
            }
            return null;
        }
        return null;
    }

    public static jw6 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        nw6 nw6Var = c().u;
        if (nw6Var != null && (bundle = nw6Var.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(nw6 nw6Var) {
        boolean z;
        b();
        a05 c2 = c();
        nw6 nw6Var2 = c2.u;
        xz4 xz4Var = c2.a;
        c2.u = nw6Var;
        boolean f = c2.f();
        ku6 ku6Var = c2.r;
        if (f) {
            if (ku6Var == null) {
                ku6 ku6Var2 = new ku6(c2.h, new kj4(c2, (byte) 4));
                c2.r = ku6Var2;
                c2.a(ku6Var2, true);
                c2.k();
                ye3 ye3Var = c2.c;
                ((Handler) ye3Var.d).post((ki7) ye3Var.h);
            }
            if (nw6Var2 != null && nw6Var2.d) {
                z = true;
            } else {
                z = false;
            }
            if (z != nw6Var.d) {
                ku6 ku6Var3 = c2.r;
                ku6Var3.h = c2.A;
                if (!ku6Var3.b) {
                    ku6Var3.b = true;
                    ((d1) ku6Var3.e).sendEmptyMessage(2);
                }
            }
        } else if (ku6Var != null) {
            iw6 d = c2.d(ku6Var);
            if (d != null) {
                b();
                ku6Var.f = null;
                ku6Var.h(null);
                c2.m(d, null);
                xz4Var.b(514, d);
                c2.l.remove(d);
            }
            c2.r = null;
            ye3 ye3Var2 = c2.c;
            ((Handler) ye3Var2.d).post((ki7) ye3Var2.h);
        }
        xz4Var.b(769, nw6Var);
    }

    public static void j(int i) {
        if (i >= 0 && i <= 3) {
            b();
            a05 c2 = c();
            jw6 c3 = c2.c();
            if (c2.e() != c3) {
                c2.i(c3, i);
                return;
            }
            return;
        }
        lq5.j("Unsupported reason to unselect route");
    }

    public final void a(dw6 dw6Var, ew6 ew6Var, int i) {
        fw6 fw6Var;
        if (dw6Var != null) {
            if (ew6Var != null) {
                b();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (((fw6) arrayList.get(i2)).b == ew6Var) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 < 0) {
                    fw6Var = new fw6(this, ew6Var);
                    arrayList.add(fw6Var);
                } else {
                    fw6Var = (fw6) arrayList.get(i2);
                }
                boolean z2 = true;
                if (i != fw6Var.d) {
                    fw6Var.d = i;
                    z = true;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i & 1) != 0) {
                    z = true;
                }
                fw6Var.e = elapsedRealtime;
                dw6 dw6Var2 = fw6Var.c;
                dw6Var2.a();
                dw6Var.a();
                if (!dw6Var2.b.containsAll(dw6Var.b)) {
                    dw6 dw6Var3 = fw6Var.c;
                    ?? obj = new Object();
                    if (dw6Var3 != null) {
                        dw6Var3.a();
                        if (!dw6Var3.b.isEmpty()) {
                            obj.a = new ArrayList(dw6Var3.b);
                        }
                        obj.a(dw6Var.c());
                        fw6Var.c = obj.b();
                    } else {
                        lq5.j("selector must not be null");
                        return;
                    }
                } else {
                    z2 = z;
                }
                if (z2) {
                    c().k();
                    return;
                }
                return;
            }
            lq5.j("callback must not be null");
            return;
        }
        lq5.j("selector must not be null");
    }

    public final void h(ew6 ew6Var) {
        if (ew6Var != null) {
            b();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((fw6) arrayList.get(i)).b == ew6Var) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                c().k();
                return;
            }
            return;
        }
        lq5.j("callback must not be null");
    }
}
