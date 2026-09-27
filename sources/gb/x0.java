package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9589a;
    public final Object f9590b;
    public final db.u f9591c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9589a = i10;
        this.f9590b = obj;
        this.f9591c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9589a) {
            case 0:
                if (aVar.f13565a == ((Class) this.f9590b)) {
                    return this.f9591c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13565a;
                if (!((Class) this.f9590b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9590b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9591c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9589a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9590b).getName() + ",adapter=" + this.f9591c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9590b).getName() + ",adapter=" + this.f9591c + "]";
            default:
                return super.toString();
        }
    }
}
