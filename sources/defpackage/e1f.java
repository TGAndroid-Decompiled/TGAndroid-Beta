package defpackage;
public abstract class e1f {
    public void a(yze yzeVar, yze yzeVar2) {
        yzeVar.b = yzeVar2;
    }

    public void b(yze yzeVar, Thread thread) {
        yzeVar.a = thread;
    }

    public boolean c(y4f y4fVar, gce gceVar, gce gceVar2) {
        synchronized (y4fVar) {
            if (y4fVar.b == gceVar) {
                y4fVar.b = gceVar2;
                return true;
            }
            return false;
        }
    }

    public boolean d(y4f y4fVar, Object obj, Object obj2) {
        synchronized (y4fVar) {
            if (y4fVar.a == obj) {
                y4fVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean e(y4f y4fVar, yze yzeVar, yze yzeVar2) {
        synchronized (y4fVar) {
            if (y4fVar.c == yzeVar) {
                y4fVar.c = yzeVar2;
                return true;
            }
            return false;
        }
    }
}
