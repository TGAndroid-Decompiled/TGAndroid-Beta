package defpackage;

import android.util.FloatProperty;
public final class va8 extends FloatProperty {
    public va8() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((kd8) obj).a);
    }

    public final void setValue(Object obj, float f) {
        ((kd8) obj).b(f);
    }
}
