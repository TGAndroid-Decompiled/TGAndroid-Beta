package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9583a;
    public final Object f9584b;
    public final db.u f9585c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9583a = i10;
        this.f9584b = obj;
        this.f9585c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9583a) {
            case 0:
                if (aVar.f13563a == ((Class) this.f9584b)) {
                    return this.f9585c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13563a;
                if (!((Class) this.f9584b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9584b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9585c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9583a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9584b).getName() + ",adapter=" + this.f9585c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9584b).getName() + ",adapter=" + this.f9585c + "]";
            default:
                return super.toString();
        }
    }
}
