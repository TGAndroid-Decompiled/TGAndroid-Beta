package h2;

import android.content.ComponentName;

public final class a implements Comparable {

    public final g0.c f7748a;

    public final ComponentName f7749b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f7748a = cVar;
        this.f7749b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f7748a.f6341m - ((a) obj).f7748a.f6341m;
    }
}
