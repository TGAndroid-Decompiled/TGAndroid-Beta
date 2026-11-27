package defpackage;
public abstract class v8f {
    public fgf a(lgf lgfVar) {
        fgf fgfVar;
        fgf fgfVar2 = fgf.d;
        synchronized (lgfVar) {
            fgfVar = lgfVar.b;
            if (fgfVar != fgfVar2) {
                lgfVar.b = fgfVar2;
            }
        }
        return fgfVar;
    }

    public jgf b(lgf lgfVar) {
        jgf jgfVar;
        jgf jgfVar2 = jgf.c;
        synchronized (lgfVar) {
            jgfVar = lgfVar.c;
            if (jgfVar != jgfVar2) {
                lgfVar.c = jgfVar2;
            }
        }
        return jgfVar;
    }

    public void c(jgf jgfVar, jgf jgfVar2) {
        jgfVar.b = jgfVar2;
    }

    public void d(jgf jgfVar, Thread thread) {
        jgfVar.a = thread;
    }

    public boolean e(lgf lgfVar, fgf fgfVar, fgf fgfVar2) {
        synchronized (lgfVar) {
            if (lgfVar.b == fgfVar) {
                lgfVar.b = fgfVar2;
                return true;
            }
            return false;
        }
    }

    public boolean f(lgf lgfVar, Object obj, Object obj2) {
        synchronized (lgfVar) {
            if (lgfVar.a == obj) {
                lgfVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean g(lgf lgfVar, jgf jgfVar, jgf jgfVar2) {
        synchronized (lgfVar) {
            if (lgfVar.c == jgfVar) {
                lgfVar.c = jgfVar2;
                return true;
            }
            return false;
        }
    }
}
