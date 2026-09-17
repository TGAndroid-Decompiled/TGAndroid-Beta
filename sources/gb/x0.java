package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f10569a;
    public final Object f10570b;
    public final db.u f10571c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f10569a = i10;
        this.f10570b = obj;
        this.f10571c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10569a) {
            case 0:
                if (aVar.f14888a == ((Class) this.f10570b)) {
                    return this.f10571c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14888a;
                if (!((Class) this.f10570b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f10570b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10571c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10569a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10570b).getName() + ",adapter=" + this.f10571c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10570b).getName() + ",adapter=" + this.f10571c + "]";
            default:
                return super.toString();
        }
    }
}
