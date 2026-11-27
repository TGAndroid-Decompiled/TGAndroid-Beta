package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class ab6 implements aca {
    public final Bundle a;

    public ab6(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override
    public final Object a(zw2 zw2Var) {
        return f9c.a;
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
    public final bs3 c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new bs3(mje.c(bundle.getInt("firebase_sessions_sessions_restart_timeout"), fs3.SECONDS));
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
