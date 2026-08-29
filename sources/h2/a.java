package h2;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f7510a;
    public final ComponentName f7511b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f7510a = cVar;
        this.f7511b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f7510a.f6973m - ((a) obj).f7510a.f6973m;
    }
}
