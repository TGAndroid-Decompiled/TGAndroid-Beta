package defpackage;
public abstract class c4f {
    public pbf a(vbf vbfVar) {
        pbf pbfVar;
        pbf pbfVar2 = pbf.d;
        synchronized (vbfVar) {
            pbfVar = vbfVar.b;
            if (pbfVar != pbfVar2) {
                vbfVar.b = pbfVar2;
            }
        }
        return pbfVar;
    }

    public tbf b(vbf vbfVar) {
        tbf tbfVar;
        tbf tbfVar2 = tbf.c;
        synchronized (vbfVar) {
            tbfVar = vbfVar.c;
            if (tbfVar != tbfVar2) {
                vbfVar.c = tbfVar2;
            }
        }
        return tbfVar;
    }

    public void c(tbf tbfVar, tbf tbfVar2) {
        tbfVar.b = tbfVar2;
    }

    public void d(tbf tbfVar, Thread thread) {
        tbfVar.a = thread;
    }

    public boolean e(vbf vbfVar, pbf pbfVar, pbf pbfVar2) {
        synchronized (vbfVar) {
            if (vbfVar.b == pbfVar) {
                vbfVar.b = pbfVar2;
                return true;
            }
            return false;
        }
    }

    public boolean f(vbf vbfVar, Object obj, Object obj2) {
        synchronized (vbfVar) {
            if (vbfVar.a == obj) {
                vbfVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean g(vbf vbfVar, tbf tbfVar, tbf tbfVar2) {
        synchronized (vbfVar) {
            if (vbfVar.c == tbfVar) {
                vbfVar.c = tbfVar2;
                return true;
            }
            return false;
        }
    }
}
