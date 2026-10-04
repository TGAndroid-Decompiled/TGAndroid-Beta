package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f10434a;
    public final Object f10435b;
    public final db.u f10436c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f10434a = i10;
        this.f10435b = obj;
        this.f10436c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10434a) {
            case 0:
                if (aVar.f14747a == ((Class) this.f10435b)) {
                    return this.f10436c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14747a;
                if (!((Class) this.f10435b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f10435b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10436c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10434a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10435b).getName() + ",adapter=" + this.f10436c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10435b).getName() + ",adapter=" + this.f10436c + "]";
            default:
                return super.toString();
        }
    }
}
