package defpackage;

import android.util.FloatProperty;
public final class f98 extends FloatProperty {
    public f98() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((vb8) obj).a);
    }

    public final void setValue(Object obj, float f) {
        ((vb8) obj).b(f);
    }
}
