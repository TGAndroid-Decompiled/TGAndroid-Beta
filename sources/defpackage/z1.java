package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
public final class z1 implements qp4 {
    public final byte a;
    public final Object b;

    public z1(td5 td5Var, String str) {
        this.a = (byte) 5;
        this.b = str;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (obj == ((y2) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                y03 y03Var = (y03) obj2;
                d03 d03Var = (d03) obj;
                d03Var.getClass();
                Executor executor = y03Var.g;
                if (executor != null) {
                    executor.execute(new u03(y03Var, d03Var, (byte) 0));
                    return g5cVar;
                }
                rp5.e("executor");
                throw null;
            case 2:
                w13 w13Var = (w13) obj2;
                us4 us4Var = (us4) obj;
                us4Var.getClass();
                w13Var.f().execute(new v13(w13Var, us4Var, (byte) 2));
                return g5cVar;
            case 3:
                d23 d23Var = (d23) obj2;
                d03 d03Var2 = (d03) obj;
                d03Var2.getClass();
                Executor executor2 = d23Var.g;
                if (executor2 != null) {
                    executor2.execute(new c23(d23Var, d03Var2, (byte) 2));
                    return g5cVar;
                }
                rp5.e("executor");
                throw null;
            case 4:
                fx2 fx2Var = (fx2) obj;
                fx2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", fx2Var);
                return new w5a(((x5a) obj2).a.a(null), null, null);
            case 5:
                String str = (String) obj2;
                ih7 ih7Var = (ih7) obj;
                ih7Var.c(td5.d, str);
                td5.f(ih7Var, str);
                return null;
            case 6:
                Throwable th = (Throwable) obj;
                ((nh7) obj2).f(null);
                return g5cVar;
            default:
                gd8 gd8Var = (gd8) obj2;
                int intValue = ((Integer) obj).intValue();
                return gd8Var.e[intValue] + ": " + gd8Var.i(intValue).a();
        }
    }

    public z1(nh7 nh7Var, mh7 mh7Var) {
        this.a = (byte) 6;
        this.b = nh7Var;
    }

    public z1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
