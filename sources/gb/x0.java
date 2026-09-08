package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f10597a;
    public final Object f10598b;
    public final db.u f10599c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f10597a = i10;
        this.f10598b = obj;
        this.f10599c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10597a) {
            case 0:
                if (aVar.f14914a == ((Class) this.f10598b)) {
                    return this.f10599c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14914a;
                if (!((Class) this.f10598b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f10598b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10599c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10597a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10598b).getName() + ",adapter=" + this.f10599c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10598b).getName() + ",adapter=" + this.f10599c + "]";
            default:
                return super.toString();
        }
    }
}
