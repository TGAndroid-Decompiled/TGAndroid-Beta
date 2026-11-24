package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class w86 implements k8a {
    public final Bundle a;

    public w86(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override
    public final Object a(fw2 fw2Var) {
        return g5c.a;
    }

    @Override
    public final Boolean b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public final jr3 c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new jr3(vee.c(bundle.getInt("firebase_sessions_sessions_restart_timeout"), nr3.SECONDS));
        }
        return null;
    }

    @Override
    public final Double d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
