package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9602a;
    public final Object f9603b;
    public final db.u f9604c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9602a = i10;
        this.f9603b = obj;
        this.f9604c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9602a) {
            case 0:
                if (aVar.f13577a == ((Class) this.f9603b)) {
                    return this.f9604c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13577a;
                if (!((Class) this.f9603b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9603b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9604c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9602a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9603b).getName() + ",adapter=" + this.f9604c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9603b).getName() + ",adapter=" + this.f9604c + "]";
            default:
                return super.toString();
        }
    }
}
