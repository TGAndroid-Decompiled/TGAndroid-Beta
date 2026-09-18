package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9601a;
    public final Object f9602b;
    public final db.u f9603c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9601a = i10;
        this.f9602b = obj;
        this.f9603c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9601a) {
            case 0:
                if (aVar.f13576a == ((Class) this.f9602b)) {
                    return this.f9603c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13576a;
                if (!((Class) this.f9602b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9602b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9603c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9601a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9602b).getName() + ",adapter=" + this.f9603c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9602b).getName() + ",adapter=" + this.f9603c + "]";
            default:
                return super.toString();
        }
    }
}
