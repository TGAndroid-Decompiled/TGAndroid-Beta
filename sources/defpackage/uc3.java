package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
public final class uc3 implements b36 {
    public final byte a;
    public final Object b;
    public final Object c;

    public uc3(Object obj) {
        this.a = (byte) 2;
        this.b = obj;
        fj2 fj2Var = fj2.c;
        Class<?> cls = obj.getClass();
        dj2 dj2Var = (dj2) fj2Var.a.get(cls);
        this.c = dj2Var == null ? fj2Var.a(cls, null) : dj2Var;
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        Handler handler;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xx3 xx3Var = (xx3) obj;
                int i = tc3.a[u26Var.ordinal()];
                if (i != 3) {
                    if (i == 7) {
                        u36.j("ON_ANY must not been send by anybody");
                        return;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = es2.a(Looper.getMainLooper());
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new sw((byte) 7), 500L);
                    xx3Var.a.b(xx3Var);
                }
                b36 b36Var = (b36) obj2;
                if (b36Var != null) {
                    b36Var.b(e36Var, u26Var);
                    return;
                }
                return;
            case 1:
                if (u26Var == u26.ON_START) {
                    ((w26) obj).b(this);
                    ((op) obj2).g();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((dj2) obj2).a;
                dj2.a((List) hashMap.get(u26Var), e36Var, u26Var, obj);
                dj2.a((List) hashMap.get(u26.ON_ANY), e36Var, u26Var, obj);
                return;
        }
    }

    public uc3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
