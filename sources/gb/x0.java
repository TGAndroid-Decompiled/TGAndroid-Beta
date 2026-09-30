package gb;

import org.telegram.messenger.FileLog;
public final class x0 implements db.v {
    public final int f9595a;
    public final Object f9596b;
    public final db.u f9597c;

    public x0(Object obj, db.u uVar, int i10) {
        this.f9595a = i10;
        this.f9596b = obj;
        this.f9597c = uVar;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9595a) {
            case 0:
                if (aVar.f13578a == ((Class) this.f9596b)) {
                    return this.f9597c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f13578a;
                if (!((Class) this.f9596b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((kb.a) this.f9596b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f9597c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9595a) {
            case 0:
                return "Factory[type=" + ((Class) this.f9596b).getName() + ",adapter=" + this.f9597c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f9596b).getName() + ",adapter=" + this.f9597c + "]";
            default:
                return super.toString();
        }
    }
}
