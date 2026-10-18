package hb;

import org.telegram.messenger.FileLog;
public final class x0 implements eb.v {
    public final int f11775a;
    public final Object f11776b;
    public final eb.u f11777c;

    public x0(Object obj, eb.u uVar, int i10) {
        this.f11775a = i10;
        this.f11776b = obj;
        this.f11777c = uVar;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11775a) {
            case 0:
                if (aVar.f15995a == ((Class) this.f11776b)) {
                    return this.f11777c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f15995a;
                if (!((Class) this.f11776b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((lb.a) this.f11776b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f11777c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f11775a) {
            case 0:
                return "Factory[type=" + ((Class) this.f11776b).getName() + ",adapter=" + this.f11777c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f11776b).getName() + ",adapter=" + this.f11777c + "]";
            default:
                return super.toString();
        }
    }
}
