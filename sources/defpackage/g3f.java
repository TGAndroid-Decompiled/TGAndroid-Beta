package defpackage;
public abstract class g3f {
    public void a(a2f a2fVar, a2f a2fVar2) {
        a2fVar.b = a2fVar2;
    }

    public void b(a2f a2fVar, Thread thread) {
        a2fVar.a = thread;
    }

    public boolean c(a7f a7fVar, hee heeVar, hee heeVar2) {
        synchronized (a7fVar) {
            if (a7fVar.b == heeVar) {
                a7fVar.b = heeVar2;
                return true;
            }
            return false;
        }
    }

    public boolean d(a7f a7fVar, Object obj, Object obj2) {
        synchronized (a7fVar) {
            if (a7fVar.a == obj) {
                a7fVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean e(a7f a7fVar, a2f a2fVar, a2f a2fVar2) {
        synchronized (a7fVar) {
            if (a7fVar.c == a2fVar) {
                a7fVar.c = a2fVar2;
                return true;
            }
            return false;
        }
    }
}
