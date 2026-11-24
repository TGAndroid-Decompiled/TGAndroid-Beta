package defpackage;

import java.util.Iterator;
public final class t4a implements n4a {
    public final byte a;
    public final Object b;

    public t4a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ?? obj2 = new Object();
                obj2.c = ((lt5) obj).create(obj2, obj2);
                return obj2;
            default:
                return (Iterator) obj;
        }
    }
}
