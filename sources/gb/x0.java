package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9597a;
    public final Object f9598b;
    public final db.u f9599c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9597a = i10;
        this.f9598b = obj;
        this.f9599c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9597a) {
            case 0:
                if (aVar.f13575a == ((Class) this.f9598b)) {
                    return this.f9599c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13575a;
                if (!((Class) this.f9598b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9598b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9599c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9597a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9598b).getName() + ",adapter=" + this.f9599c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9598b).getName() + ",adapter=" + this.f9599c + "]";
            default:
                return super.toString();
        }
    }
}
