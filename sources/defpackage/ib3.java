package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
public final class ib3 implements b16 {
    public final byte a;
    public final Object b;
    public final Object c;

    public ib3(Object obj) {
        this.a = (byte) 2;
        this.b = obj;
        rh2 rh2Var = rh2.c;
        Class<?> cls = obj.getClass();
        ph2 ph2Var = (ph2) rh2Var.a.get(cls);
        this.c = ph2Var == null ? rh2Var.a(cls, null) : ph2Var;
    }

    @Override
    public final void b(e16 e16Var, u06 u06Var) {
        Handler handler;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                mw3 mw3Var = (mw3) obj;
                int i = hb3.a[u06Var.ordinal()];
                if (i != 3) {
                    if (i == 7) {
                        w26.j("ON_ANY must not been send by anybody");
                        return;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = tq2.a(Looper.getMainLooper());
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new sv((byte) 7), 500L);
                    mw3Var.a.b(mw3Var);
                }
                b16 b16Var = (b16) obj2;
                if (b16Var != null) {
                    b16Var.b(e16Var, u06Var);
                    return;
                }
                return;
            case 1:
                if (u06Var == u06.ON_START) {
                    ((w06) obj).b(this);
                    ((oo) obj2).g();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((ph2) obj2).a;
                ph2.a((List) hashMap.get(u06Var), e16Var, u06Var, obj);
                ph2.a((List) hashMap.get(u06.ON_ANY), e16Var, u06Var, obj);
                return;
        }
    }

    public ib3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
