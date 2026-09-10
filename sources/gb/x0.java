package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f8729a;
    public final Object f8730b;
    public final db.u f8731c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f8729a = i10;
        this.f8730b = obj;
        this.f8731c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f8729a) {
            case 0:
                if (aVar.f12419a == ((Class) this.f8730b)) {
                    return this.f8731c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f12419a;
                if (!((Class) this.f8730b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f8730b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f8731c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f8729a) {
            case 0:
                return "Factory[type=" + ((Class) this.f8730b).getName() + ",adapter=" + this.f8731c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f8730b).getName() + ",adapter=" + this.f8731c + "]";
            default:
                return super.toString();
        }
    }
}
