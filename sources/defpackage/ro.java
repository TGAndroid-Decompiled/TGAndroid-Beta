package defpackage;

import android.util.Property;
public abstract class ro extends Property {
    public final byte a;

    public ro(String str, byte b) {
        super(Float.class, str);
        this.a = b;
        switch (b) {
            case 1:
                super(Integer.class, str);
                return;
            default:
                return;
        }
    }

    public final void a(Object obj, Float f) {
        c(obj, f.floatValue());
    }

    public abstract void b(int i, Object obj);

    public abstract void c(Object obj, float f);

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c(obj, ((Float) obj2).floatValue());
                return;
            default:
                b(((Integer) obj2).intValue(), obj);
                return;
        }
    }
}
