package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
public abstract class joe {
    public static dz5 a() {
        String a;
        cz5 cz5Var = (cz5) cg7.c().a(cz5.class);
        g8e g8eVar = cz5Var.b;
        g8eVar.getClass();
        uze uzeVar = cz5Var.a;
        dz5 dz5Var = new dz5(g8eVar, uzeVar, (Executor) cz5Var.c.a.get());
        ?? obj = new Object();
        obj.c = dz5Var.f;
        uqd uqdVar = new uqd((byte) 6);
        uqdVar.c = dz5.e();
        obj.d = new jqe(uqdVar);
        ry ryVar = new ry((e7a) obj, 1);
        Task task = uzeVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = r26.c.a(uzeVar.g);
        }
        mlb.c(1, new de1(uzeVar, ryVar, kje.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a, (byte) 2));
        ((g8e) dz5Var.d.get()).b.incrementAndGet();
        return dz5Var;
    }
}
