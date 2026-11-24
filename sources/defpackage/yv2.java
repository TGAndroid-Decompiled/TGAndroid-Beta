package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
public final class yv2 implements rzd {
    public final byte a;
    public Object b;
    public volatile Object c;

    public yv2() {
        this.a = (byte) 0;
        this.b = new CopyOnWriteArraySet();
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                Object obj = (rzd) this.c;
                if (obj == vi2.f) {
                    obj = tb4.y("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return tb4.y("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override
    public final Object zza() {
        rzd rzdVar = (rzd) this.c;
        vi2 vi2Var = vi2.f;
        if (rzdVar != vi2Var) {
            synchronized (this) {
                if (((rzd) this.c) != vi2Var) {
                    Object zza = ((rzd) this.c).zza();
                    this.b = zza;
                    this.c = vi2Var;
                    return zza;
                }
            }
        }
        return this.b;
    }

    public yv2(byte b) {
        this.a = b;
    }
}
