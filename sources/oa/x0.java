package oa;

import org.telegram.messenger.FileLog;
public final class x0 implements la.v {
    public final int f19178a;
    public final Object f19179b;
    public final la.u f19180c;

    public x0(Object obj, la.u uVar, int i9) {
        this.f19178a = i9;
        this.f19179b = obj;
        this.f19180c = uVar;
    }

    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        switch (this.f19178a) {
            case 0:
                if (aVar.f47502a == ((Class) this.f19179b)) {
                    return this.f19180c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f47502a;
                if (!((Class) this.f19179b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((sa.a) this.f19179b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f19180c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f19178a) {
            case 0:
                return "Factory[type=" + ((Class) this.f19179b).getName() + ",adapter=" + this.f19180c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f19179b).getName() + ",adapter=" + this.f19180c + "]";
            default:
                return super.toString();
        }
    }
}
