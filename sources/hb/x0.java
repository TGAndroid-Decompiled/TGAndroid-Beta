package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f10468a;
    public final Object f10469b;
    public final eb.u f10470c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f10468a = i10;
        this.f10469b = obj;
        this.f10470c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f10468a) {
            case 0:
                if (aVar.f14653a == ((Class) this.f10469b)) {
                    return this.f10470c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14653a;
                if (!((Class) this.f10469b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f10469b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10470c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10468a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10469b).getName() + ",adapter=" + this.f10470c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10469b).getName() + ",adapter=" + this.f10470c + "]";
            default:
                return super.toString();
        }
    }
}
