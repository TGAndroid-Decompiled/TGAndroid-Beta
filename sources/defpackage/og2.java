package defpackage;

import android.content.ComponentName;
public final class og2 implements Comparable {
    public final oga a;
    public final ComponentName b;

    public og2(oga ogaVar, ComponentName componentName) {
        this.a = ogaVar;
        this.b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.a.m - ((og2) obj).a.m;
    }
}
