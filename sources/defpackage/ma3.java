package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
public final class ma3 implements aq2 {
    public final byte a;
    public final xw8 b;

    public ma3(xw8 xw8Var, byte b) {
        this.a = b;
        this.b = xw8Var;
    }

    @Override
    public final Object K(gl2 gl2Var) {
        FirebaseMessaging lambda$getComponents$0;
        byte b = this.a;
        xw8 xw8Var = this.b;
        switch (b) {
            case 0:
                return new oa3((Context) gl2Var.a(Context.class), ((jg4) gl2Var.a(jg4.class)).d(), gl2Var.O(pd5.class), gl2Var.d(tc3.class), (Executor) gl2Var.i(xw8Var));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(xw8Var, gl2Var);
                return lambda$getComponents$0;
        }
    }
}
