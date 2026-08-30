package h2;

import android.content.ComponentName;
public final class a implements Comparable {
    public final g0.c f6891a;
    public final ComponentName f6892b;

    public a(g0.c cVar, ComponentName componentName) {
        this.f6891a = cVar;
        this.f6892b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f6891a.f6342m - ((a) obj).f6891a.f6342m;
    }
}
