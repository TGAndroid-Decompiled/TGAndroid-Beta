package defpackage;

import android.content.ComponentName;
public final class gh2 implements Comparable {
    public final hka a;
    public final ComponentName b;

    public gh2(hka hkaVar, ComponentName componentName) {
        this.a = hkaVar;
        this.b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.a.m - ((gh2) obj).a.m;
    }
}
