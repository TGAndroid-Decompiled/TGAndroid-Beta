package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
public abstract class gme {
    public static dx5 a() {
        String a;
        cx5 cx5Var = (cx5) ae7.c().a(cx5.class);
        d6e d6eVar = cx5Var.b;
        d6eVar.getClass();
        sxe sxeVar = cx5Var.a;
        dx5 dx5Var = new dx5(d6eVar, sxeVar, (Executor) cx5Var.c.a.get());
        ?? obj = new Object();
        obj.c = dx5Var.f;
        rod rodVar = new rod((byte) 6);
        rodVar.c = dx5.e();
        obj.d = new goe(rodVar);
        qx qxVar = new qx((wtc) obj, 1);
        Task task = sxeVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = r06.c.a(sxeVar.g);
        }
        yjb.c(1, new vc1(sxeVar, qxVar, jhe.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a, (byte) 2));
        ((d6e) dx5Var.d.get()).b.incrementAndGet();
        return dx5Var;
    }
}
