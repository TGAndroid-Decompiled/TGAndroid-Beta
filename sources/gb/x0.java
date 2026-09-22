package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9598a;
    public final Object f9599b;
    public final db.u f9600c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9598a = i10;
        this.f9599b = obj;
        this.f9600c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9598a) {
            case 0:
                if (aVar.f13577a == ((Class) this.f9599b)) {
                    return this.f9600c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13577a;
                if (!((Class) this.f9599b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9599b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9600c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9598a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9599b).getName() + ",adapter=" + this.f9600c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9599b).getName() + ",adapter=" + this.f9600c + "]";
            default:
                return super.toString();
        }
    }
}
