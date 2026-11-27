package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
public final class fb3 implements tq2 {
    public final byte a;
    public final i09 b;

    public fb3(i09 i09Var, byte b) {
        this.a = b;
        this.b = i09Var;
    }

    @Override
    public final Object b0(am2 am2Var) {
        FirebaseMessaging lambda$getComponents$0;
        byte b = this.a;
        i09 i09Var = this.b;
        switch (b) {
            case 0:
                return new hb3((Context) am2Var.a(Context.class), ((ji4) am2Var.a(ji4.class)).d(), am2Var.N(qf5.class), am2Var.d(md3.class), (Executor) am2Var.h(i09Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(i09Var, am2Var);
                return lambda$getComponents$0;
        }
    }
}
