package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
public final class yb3 implements lr2 {
    public final byte a;
    public final yy8 b;

    public yb3(yy8 yy8Var, byte b) {
        this.a = b;
        this.b = yy8Var;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        FirebaseMessaging lambda$getComponents$0;
        byte b = this.a;
        yy8 yy8Var = this.b;
        switch (b) {
            case 0:
                return new ac3((Context) sm2Var.a(Context.class), ((li4) sm2Var.a(li4.class)).d(), sm2Var.N(nf5.class), sm2Var.d(ge3.class), (Executor) sm2Var.i(yy8Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(yy8Var, sm2Var);
                return lambda$getComponents$0;
        }
    }
}
