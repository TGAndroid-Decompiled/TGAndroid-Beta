package gb;

import android.content.Context;
import android.os.Bundle;
import x7.m5;
public final class a implements q {
    public final Bundle f12199a;

    public a(Context appContext) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f12199a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override
    public final Object a(fd.c cVar) {
        return dd.k.f8801a;
    }

    @Override
    public final Boolean b() {
        Bundle bundle = this.f12199a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public final vd.a c() {
        Bundle bundle = this.f12199a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new vd.a(m5.c(bundle.getInt("firebase_sessions_sessions_restart_timeout"), vd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        Bundle bundle = this.f12199a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
