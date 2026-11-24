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
public final class gu6 {
    public static ux4 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public gu6(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        sc8.j("The media router service must only be accessed on the application's main thread.");
    }

    public static ux4 c() {
        ux4 ux4Var = c;
        if (ux4Var != null) {
            return ux4Var;
        }
        sc8.j("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static gu6 d(Context context) {
        if (context != null) {
            b();
            ux4 ux4Var = c;
            if (ux4Var == null) {
                ux4Var = new ux4(context.getApplicationContext());
                c = ux4Var;
            }
            ArrayList arrayList = ux4Var.i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    gu6 gu6Var = (gu6) ((WeakReference) arrayList.get(size)).get();
                    if (gu6Var == null) {
                        arrayList.remove(size);
                    } else if (gu6Var.a == context) {
                        return gu6Var;
                    }
                } else {
                    gu6 gu6Var2 = new gu6(context);
                    arrayList.add(new WeakReference(gu6Var2));
                    return gu6Var2;
                }
            }
        } else {
            w26.j("context must not be null");
            return null;
        }
    }

    public static MediaSessionCompat$Token e() {
        ux4 ux4Var = c;
        if (ux4Var != null) {
            xl3 xl3Var = ux4Var.C;
            if (xl3Var != null) {
                mv6 mv6Var = (mv6) xl3Var.b;
                if (mv6Var != null) {
                    return ((zu6) mv6Var.b).c;
                }
                return null;
            }
            mv6 mv6Var2 = ux4Var.D;
            if (mv6Var2 != null) {
                return ((zu6) mv6Var2.b).c;
            }
            return null;
        }
        return null;
    }

    public static eu6 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        iu6 iu6Var = c().u;
        if (iu6Var != null && (bundle = iu6Var.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(iu6 iu6Var) {
        boolean z;
        b();
        ux4 c2 = c();
        iu6 iu6Var2 = c2.u;
        rx4 rx4Var = c2.a;
        c2.u = iu6Var;
        boolean f = c2.f();
        fs6 fs6Var = c2.r;
        if (f) {
            if (fs6Var == null) {
                fs6 fs6Var2 = new fs6(c2.h, new gi3(c2));
                c2.r = fs6Var2;
                c2.a(fs6Var2, true);
                c2.k();
                ee3 ee3Var = c2.c;
                ((Handler) ee3Var.d).post((bg7) ee3Var.h);
            }
            if (iu6Var2 != null && iu6Var2.d) {
                z = true;
            } else {
                z = false;
            }
            if (z != iu6Var.d) {
                fs6 fs6Var3 = c2.r;
                fs6Var3.h = c2.A;
                if (!fs6Var3.b) {
                    fs6Var3.b = true;
                    ((c1) fs6Var3.e).sendEmptyMessage(2);
                }
            }
        } else if (fs6Var != null) {
            du6 d = c2.d(fs6Var);
            if (d != null) {
                b();
                fs6Var.f = null;
                fs6Var.h(null);
                c2.m(d, null);
                rx4Var.b(514, d);
                c2.l.remove(d);
            }
            c2.r = null;
            ee3 ee3Var2 = c2.c;
            ((Handler) ee3Var2.d).post((bg7) ee3Var2.h);
        }
        rx4Var.b(769, iu6Var);
    }

    public static void j(int i) {
        if (i >= 0 && i <= 3) {
            b();
            ux4 c2 = c();
            eu6 c3 = c2.c();
            if (c2.e() != c3) {
                c2.i(c3, i);
                return;
            }
            return;
        }
        w26.j("Unsupported reason to unselect route");
    }

    public final void a(yt6 yt6Var, zt6 zt6Var, int i) {
        au6 au6Var;
        if (yt6Var != null) {
            if (zt6Var != null) {
                b();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (((au6) arrayList.get(i2)).b == zt6Var) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 < 0) {
                    au6Var = new au6(this, zt6Var);
                    arrayList.add(au6Var);
                } else {
                    au6Var = (au6) arrayList.get(i2);
                }
                boolean z2 = true;
                if (i != au6Var.d) {
                    au6Var.d = i;
                    z = true;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i & 1) != 0) {
                    z = true;
                }
                au6Var.e = elapsedRealtime;
                yt6 yt6Var2 = au6Var.c;
                yt6Var2.a();
                yt6Var.a();
                if (!yt6Var2.b.containsAll(yt6Var.b)) {
                    yt6 yt6Var3 = au6Var.c;
                    ?? obj = new Object();
                    if (yt6Var3 != null) {
                        yt6Var3.a();
                        if (!yt6Var3.b.isEmpty()) {
                            obj.a = new ArrayList(yt6Var3.b);
                        }
                        obj.a(yt6Var.c());
                        au6Var.c = obj.b();
                    } else {
                        w26.j("selector must not be null");
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
            w26.j("callback must not be null");
            return;
        }
        w26.j("selector must not be null");
    }

    public final void h(zt6 zt6Var) {
        if (zt6Var != null) {
            b();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((au6) arrayList.get(i)).b == zt6Var) {
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
        w26.j("callback must not be null");
    }
}
