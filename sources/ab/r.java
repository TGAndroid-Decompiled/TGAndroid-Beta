package ab;

import a8.r7;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
public final class r implements u9.d {
    public final int f990a;
    public final u9.q f991b;

    public r(u9.q qVar, int i7) {
        this.f990a = i7;
        this.f991b = qVar;
    }

    @Override
    public final Object c(r7 r7Var) {
        switch (this.f990a) {
            case 0:
                return FirebaseMessagingRegistrar.a(this.f991b, r7Var);
            default:
                return new sa.c((Context) r7Var.a(Context.class), ((o9.g) r7Var.a(o9.g.class)).d(), r7Var.L(sa.d.class), r7Var.c(cb.b.class), (Executor) r7Var.e(this.f991b));
        }
    }
}
