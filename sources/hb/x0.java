package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f11799a;
    public final Object f11800b;
    public final eb.u f11801c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f11799a = i10;
        this.f11800b = obj;
        this.f11801c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11799a) {
            case 0:
                if (aVar.f16057a == ((Class) this.f11800b)) {
                    return this.f11801c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f16057a;
                if (!((Class) this.f11800b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f11800b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f11801c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f11799a) {
            case 0:
                return "Factory[type=" + ((Class) this.f11800b).getName() + ",adapter=" + this.f11801c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f11800b).getName() + ",adapter=" + this.f11801c + "]";
            default:
                return super.toString();
        }
    }
}
