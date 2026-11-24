package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class lg4 {
    public final rc1 a;

    public lg4(rc1 rc1Var) {
        this.a = rc1Var;
    }

    public final void a() {
        rc1 rc1Var = this.a;
        Boolean bool = Boolean.TRUE;
        w53 w53Var = (w53) rc1Var.b;
        synchronized (w53Var) {
            w53Var.f = false;
            w53Var.g = bool;
            SharedPreferences.Editor edit = w53Var.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (w53Var.c) {
                boolean a = w53Var.a();
                boolean z = w53Var.e;
                if (a) {
                    if (!z) {
                        w53Var.d.trySetResult(null);
                        w53Var.e = true;
                    }
                } else if (z) {
                    w53Var.d = new TaskCompletionSource();
                    w53Var.e = false;
                }
            }
        }
    }

    public final void b(String str, String str2) {
        rc1 rc1Var = this.a;
        ((pz2) ((mv6) rc1Var.n).b).a(new jn1(rc1Var, str, str2, (byte) 28));
    }
}
