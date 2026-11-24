package defpackage;

import android.util.FloatProperty;
public final class d78 extends FloatProperty {
    public d78() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((u98) obj).a);
    }

    public final void setValue(Object obj, float f) {
        ((u98) obj).b(f);
    }
}
