package defpackage;
public abstract class e6f {
    public qdf a(wdf wdfVar) {
        qdf qdfVar;
        qdf qdfVar2 = qdf.d;
        synchronized (wdfVar) {
            qdfVar = wdfVar.b;
            if (qdfVar != qdfVar2) {
                wdfVar.b = qdfVar2;
            }
        }
        return qdfVar;
    }

    public udf b(wdf wdfVar) {
        udf udfVar;
        udf udfVar2 = udf.c;
        synchronized (wdfVar) {
            udfVar = wdfVar.c;
            if (udfVar != udfVar2) {
                wdfVar.c = udfVar2;
            }
        }
        return udfVar;
    }

    public void c(udf udfVar, udf udfVar2) {
        udfVar.b = udfVar2;
    }

    public void d(udf udfVar, Thread thread) {
        udfVar.a = thread;
    }

    public boolean e(wdf wdfVar, qdf qdfVar, qdf qdfVar2) {
        synchronized (wdfVar) {
            if (wdfVar.b == qdfVar) {
                wdfVar.b = qdfVar2;
                return true;
            }
            return false;
        }
    }

    public boolean f(wdf wdfVar, Object obj, Object obj2) {
        synchronized (wdfVar) {
            if (wdfVar.a == obj) {
                wdfVar.a = obj2;
                return true;
            }
            return false;
        }
    }

    public boolean g(wdf wdfVar, udf udfVar, udf udfVar2) {
        synchronized (wdfVar) {
            if (wdfVar.c == udfVar) {
                wdfVar.c = udfVar2;
                return true;
            }
            return false;
        }
    }
}
