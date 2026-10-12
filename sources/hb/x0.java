package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f10464a;
    public final Object f10465b;
    public final eb.u f10466c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f10464a = i10;
        this.f10465b = obj;
        this.f10466c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f10464a) {
            case 0:
                if (aVar.f14653a == ((Class) this.f10465b)) {
                    return this.f10466c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14653a;
                if (!((Class) this.f10465b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f10465b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10466c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10464a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10465b).getName() + ",adapter=" + this.f10466c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10465b).getName() + ",adapter=" + this.f10466c + "]";
            default:
                return super.toString();
        }
    }
}
