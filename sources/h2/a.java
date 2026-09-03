package h2;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f6878a;
    public final ComponentName f6879b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f6878a = cVar;
        this.f6879b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f6878a.f6342m - ((a) obj).f6878a.f6342m;
    }
}
