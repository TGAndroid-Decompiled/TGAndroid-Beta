package defpackage;
public abstract class x5f {
    public void a(p4f p4fVar, p4f p4fVar2) {
        p4fVar.b = p4fVar2;
    }

    public void b(p4f p4fVar, Thread thread) {
        p4fVar.a = thread;
    }

    public boolean c(p9f p9fVar, wge wgeVar, wge wgeVar2) {
        synchronized (p9fVar) {
            if (p9fVar.b == wgeVar) {
                p9fVar.b = wgeVar2;
                return true;
            }
            return false;
        }
    }

    public boolean d(p9f p9fVar, Object obj, Object obj2) {
        synchronized (p9fVar) {
            if (p9fVar.a == obj) {
                p9fVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean e(p9f p9fVar, p4f p4fVar, p4f p4fVar2) {
        synchronized (p9fVar) {
            if (p9fVar.c == p4fVar) {
                p9fVar.c = p4fVar2;
                return true;
            }
            return false;
        }
    }
}
