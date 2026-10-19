package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f11774a;
    public final Object f11775b;
    public final eb.u f11776c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f11774a = i10;
        this.f11775b = obj;
        this.f11776c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11774a) {
            case 0:
                if (aVar.f15996a == ((Class) this.f11775b)) {
                    return this.f11776c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f15996a;
                if (!((Class) this.f11775b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f11775b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f11776c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f11774a) {
            case 0:
                return "Factory[type=" + ((Class) this.f11775b).getName() + ",adapter=" + this.f11776c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f11775b).getName() + ",adapter=" + this.f11776c + "]";
            default:
                return super.toString();
        }
    }
}
