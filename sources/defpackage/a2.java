package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
public final class a2 implements ur4 {
    public final byte a;
    public final Object b;

    public a2(uf5 uf5Var, String str) {
        this.a = (byte) 5;
        this.b = str;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (obj == ((z2) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                r13 r13Var = (r13) obj2;
                w03 w03Var = (w03) obj;
                w03Var.getClass();
                Executor executor = r13Var.g;
                if (executor != null) {
                    executor.execute(new n13(r13Var, w03Var, (byte) 0));
                    return f9cVar;
                }
                ur5.e("executor");
                throw null;
            case 2:
                o23 o23Var = (o23) obj2;
                yu4 yu4Var = (yu4) obj;
                yu4Var.getClass();
                o23Var.f().execute(new n23(o23Var, yu4Var, (byte) 2));
                return f9cVar;
            case 3:
                v23 v23Var = (v23) obj2;
                w03 w03Var2 = (w03) obj;
                w03Var2.getClass();
                Executor executor2 = v23Var.g;
                if (executor2 != null) {
                    executor2.execute(new u23(v23Var, w03Var2, (byte) 2));
                    return f9cVar;
                }
                ur5.e("executor");
                throw null;
            case 4:
                zx2 zx2Var = (zx2) obj;
                zx2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", zx2Var);
                return new o9a(((p9a) obj2).a.a(null), null, null);
            case 5:
                String str = (String) obj2;
                rj7 rj7Var = (rj7) obj;
                rj7Var.c(uf5.d, str);
                uf5.f(rj7Var, str);
                return null;
            case 6:
                Throwable th = (Throwable) obj;
                ((wj7) obj2).f(null);
                return f9cVar;
            default:
                ug8 ug8Var = (ug8) obj2;
                int intValue = ((Integer) obj).intValue();
                return ug8Var.e[intValue] + ": " + ug8Var.i(intValue).a();
        }
    }

    public a2(wj7 wj7Var, vj7 vj7Var) {
        this.a = (byte) 6;
        this.b = wj7Var;
    }

    public a2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
