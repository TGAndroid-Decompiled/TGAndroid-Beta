package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9584a;
    public final Object f9585b;
    public final db.u f9586c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9584a = i10;
        this.f9585b = obj;
        this.f9586c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9584a) {
            case 0:
                if (aVar.f13565a == ((Class) this.f9585b)) {
                    return this.f9586c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13565a;
                if (!((Class) this.f9585b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9585b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9586c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9584a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9585b).getName() + ",adapter=" + this.f9586c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9585b).getName() + ",adapter=" + this.f9586c + "]";
            default:
                return super.toString();
        }
    }
}
