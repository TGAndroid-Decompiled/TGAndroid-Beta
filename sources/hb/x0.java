package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f11773a;
    public final Object f11774b;
    public final eb.u f11775c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f11773a = i10;
        this.f11774b = obj;
        this.f11775c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11773a) {
            case 0:
                if (aVar.f15988a == ((Class) this.f11774b)) {
                    return this.f11775c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f15988a;
                if (!((Class) this.f11774b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f11774b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f11775c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f11773a) {
            case 0:
                return "Factory[type=" + ((Class) this.f11774b).getName() + ",adapter=" + this.f11775c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f11774b).getName() + ",adapter=" + this.f11775c + "]";
            default:
                return super.toString();
        }
    }
}
