package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f10506a;
    public final Object f10507b;
    public final db.u f10508c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f10506a = i10;
        this.f10507b = obj;
        this.f10508c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10506a) {
            case 0:
                if (aVar.f14779a == ((Class) this.f10507b)) {
                    return this.f10508c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14779a;
                if (!((Class) this.f10507b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f10507b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10508c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10506a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10507b).getName() + ",adapter=" + this.f10508c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10507b).getName() + ",adapter=" + this.f10508c + "]";
            default:
                return super.toString();
        }
    }
}
