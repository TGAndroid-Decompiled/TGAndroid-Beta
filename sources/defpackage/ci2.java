package defpackage;

import android.content.ComponentName;
public final class ci2 implements Comparable {
    public final qia a;
    public final ComponentName b;

    public ci2(qia qiaVar, ComponentName componentName) {
        this.a = qiaVar;
        this.b = componentName;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.a.m - ((ci2) obj).a.m;
    }
}
