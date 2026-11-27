package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
public final class sw2 implements h4e {
    public final byte a;
    public Object b;
    public volatile Object c;

    public sw2() {
        this.a = (byte) 0;
        this.b = new CopyOnWriteArraySet();
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                Object obj = (h4e) this.c;
                if (obj == rj2.f) {
                    obj = qd4.y("<supplier that returned ", String.valueOf(this.b), ">");
                }
                return qd4.y("Suppliers.memoize(", String.valueOf(obj), ")");
            default:
                return super.toString();
        }
    }

    @Override
    public final Object zza() {
        h4e h4eVar = (h4e) this.c;
        rj2 rj2Var = rj2.f;
        if (h4eVar != rj2Var) {
            synchronized (this) {
                if (((h4e) this.c) != rj2Var) {
                    Object zza = ((h4e) this.c).zza();
                    this.b = zza;
                    this.c = rj2Var;
                    return zza;
                }
            }
        }
        return this.b;
    }

    public sw2(byte b) {
        this.a = b;
    }
}
