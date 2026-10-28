package ib;

import org.telegram.messenger.FileLog;
public final class x0 implements fb.v {
    public final int f13972a;
    public final Object f13973b;
    public final fb.u f13974c;

    public x0(Object obj, fb.u uVar, int i10) {
        this.f13972a = i10;
        this.f13973b = obj;
        this.f13974c = uVar;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        switch (this.f13972a) {
            case 0:
                if (aVar.f18406a == ((Class) this.f13973b)) {
                    return this.f13974c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f18406a;
                if (!((Class) this.f13973b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((mb.a) this.f13973b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f13974c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f13972a) {
            case 0:
                return "Factory[type=" + ((Class) this.f13973b).getName() + ",adapter=" + this.f13974c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f13973b).getName() + ",adapter=" + this.f13974c + "]";
            default:
                return super.toString();
        }
    }
}
