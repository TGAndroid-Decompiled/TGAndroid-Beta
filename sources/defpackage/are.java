package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
public abstract class are {
    public static iz5 a() {
        String a;
        hz5 hz5Var = (hz5) jg7.c().a(hz5.class);
        tae taeVar = hz5Var.b;
        taeVar.getClass();
        j2f j2fVar = hz5Var.a;
        iz5 iz5Var = new iz5(taeVar, j2fVar, (Executor) hz5Var.c.a.get());
        ?? obj = new Object();
        obj.c = iz5Var.f;
        htd htdVar = new htd((byte) 6);
        htdVar.c = iz5.e();
        obj.d = new yse(htdVar);
        rx rxVar = new rx((u8a) obj, 1);
        Task task = j2fVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = v26.c.a(j2fVar.g);
        }
        xnb.c(1, new dd1(j2fVar, rxVar, ame.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a, (byte) 2));
        ((tae) iz5Var.d.get()).b.incrementAndGet();
        return iz5Var;
    }
}
