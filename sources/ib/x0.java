package ib;

import org.telegram.messenger.FileLog;
public final class x0 implements fb.v {
    public final int f13973a;
    public final Object f13974b;
    public final fb.u f13975c;

    public x0(Object obj, fb.u uVar, int i10) {
        this.f13973a = i10;
        this.f13974b = obj;
        this.f13975c = uVar;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        switch (this.f13973a) {
            case 0:
                if (aVar.f18407a == ((Class) this.f13974b)) {
                    return this.f13975c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f18407a;
                if (!((Class) this.f13974b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((mb.a) this.f13974b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f13975c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f13973a) {
            case 0:
                return "Factory[type=" + ((Class) this.f13974b).getName() + ",adapter=" + this.f13975c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f13974b).getName() + ",adapter=" + this.f13975c + "]";
            default:
                return super.toString();
        }
    }
}
