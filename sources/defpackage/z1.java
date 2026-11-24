package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
public final class z1 implements rr4 {
    public final byte a;
    public final Object b;

    public z1(rf5 rf5Var, String str) {
        this.a = (byte) 5;
        this.b = str;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (obj == ((y2) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                k23 k23Var = (k23) obj2;
                o13 o13Var = (o13) obj;
                o13Var.getClass();
                Executor executor = k23Var.g;
                if (executor != null) {
                    executor.execute(new g23(k23Var, o13Var, (byte) 0));
                    return g7cVar;
                }
                rr5.e("executor");
                throw null;
            case 2:
                h33 h33Var = (h33) obj2;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                h33Var.f().execute(new g33(h33Var, vu4Var, (byte) 2));
                return g7cVar;
            case 3:
                o33 o33Var = (o33) obj2;
                o13 o13Var2 = (o13) obj;
                o13Var2.getClass();
                Executor executor2 = o33Var.g;
                if (executor2 != null) {
                    executor2.execute(new n33(o33Var, o13Var2, (byte) 2));
                    return g7cVar;
                }
                rr5.e("executor");
                throw null;
            case 4:
                py2 py2Var = (py2) obj;
                py2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", py2Var);
                return new y7a(((z7a) obj2).a.a(null), null, null);
            case 5:
                String str = (String) obj2;
                lj7 lj7Var = (lj7) obj;
                lj7Var.c(rf5.d, str);
                rf5.f(lj7Var, str);
                return null;
            case 6:
                Throwable th = (Throwable) obj;
                ((qj7) obj2).f(null);
                return g7cVar;
            default:
                if8 if8Var = (if8) obj2;
                int intValue = ((Integer) obj).intValue();
                return if8Var.e[intValue] + ": " + if8Var.i(intValue).a();
        }
    }

    public z1(qj7 qj7Var, pj7 pj7Var) {
        this.a = (byte) 6;
        this.b = qj7Var;
    }

    public z1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
