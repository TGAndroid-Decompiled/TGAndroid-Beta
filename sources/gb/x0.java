package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f10505a;
    public final Object f10506b;
    public final db.u f10507c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f10505a = i10;
        this.f10506b = obj;
        this.f10507c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10505a) {
            case 0:
                if (aVar.f14778a == ((Class) this.f10506b)) {
                    return this.f10507c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f14778a;
                if (!((Class) this.f10506b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f10506b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f10507c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10505a) {
            case 0:
                return "Factory[type=" + ((Class) this.f10506b).getName() + ",adapter=" + this.f10507c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f10506b).getName() + ",adapter=" + this.f10507c + "]";
            default:
                return super.toString();
        }
    }
}
