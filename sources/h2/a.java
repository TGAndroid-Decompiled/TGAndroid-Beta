package h2;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f9316a;
    public final ComponentName f9317b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f9316a = cVar;
        this.f9317b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f9316a.f7063m - ((a) obj).f9316a.f7063m;
    }
}
