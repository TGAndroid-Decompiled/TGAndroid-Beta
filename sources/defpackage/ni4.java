package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ni4 {
    public final zd1 a;

    public ni4(zd1 zd1Var) {
        this.a = zd1Var;
    }

    public final void a() {
        zd1 zd1Var = this.a;
        Boolean bool = Boolean.TRUE;
        i73 i73Var = (i73) zd1Var.b;
        synchronized (i73Var) {
            i73Var.f = false;
            i73Var.g = bool;
            SharedPreferences.Editor edit = i73Var.a.edit();
            edit.putBoolean("firebase_crashlytics_collection_enabled", true);
            edit.apply();
            synchronized (i73Var.c) {
                boolean a = i73Var.a();
                boolean z = i73Var.e;
                if (a) {
                    if (!z) {
                        i73Var.d.trySetResult(null);
                        i73Var.e = true;
                    }
                } else if (z) {
                    i73Var.d = new TaskCompletionSource();
                    i73Var.e = false;
                }
            }
        }
    }

    public final void b(String str, String str2) {
        zd1 zd1Var = this.a;
        ((a13) ((mx6) zd1Var.n).b).a(new pz2(zd1Var, str, str2, (byte) 0));
    }
}
