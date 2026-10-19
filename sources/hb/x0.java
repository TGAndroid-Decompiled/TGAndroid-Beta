package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f11772a;
    public final Object f11773b;
    public final eb.u f11774c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f11772a = i10;
        this.f11773b = obj;
        this.f11774c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11772a) {
            case 0:
                if (aVar.f15994a == ((Class) this.f11773b)) {
                    return this.f11774c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f15994a;
                if (!((Class) this.f11773b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f11773b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f11774c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f11772a) {
            case 0:
                return "Factory[type=" + ((Class) this.f11773b).getName() + ",adapter=" + this.f11774c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f11773b).getName() + ",adapter=" + this.f11774c + "]";
            default:
                return super.toString();
        }
    }
}
