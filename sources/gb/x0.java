package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f10504a;
    public final Object f10505b;
    public final db.u f10506c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f10504a = i10;
        this.f10505b = obj;
        this.f10506c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10504a) {
            case 0:
                if (aVar.f14776a == ((Class) this.f10505b)) {
                    return this.f10506c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14776a;
                if (!((Class) this.f10505b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f10505b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10506c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10504a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10505b).getName() + ",adapter=" + this.f10506c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10505b).getName() + ",adapter=" + this.f10506c + "]";
            default:
                return super.toString();
        }
    }
}
