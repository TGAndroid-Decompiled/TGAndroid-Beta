package jb;

import android.content.Context;
import android.os.Bundle;
import c8.ie;
public final class a implements r {
    public final Bundle f17433a;

    public a(Context appContext) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f17433a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override
    public final Boolean a() {
        Bundle bundle = this.f17433a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public final Object b(id.c cVar) {
        return gd.k.f13480a;
    }

    @Override
    public final yd.a c() {
        Bundle bundle = this.f17433a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new yd.a(ie.c(bundle.getInt("firebase_sessions_sessions_restart_timeout"), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        Bundle bundle = this.f17433a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
