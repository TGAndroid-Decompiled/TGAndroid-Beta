package h2;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f7189a;
    public final ComponentName f7190b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f7189a = cVar;
        this.f7190b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f7189a.f6817m - ((a) obj).f7189a.f6817m;
    }
}
