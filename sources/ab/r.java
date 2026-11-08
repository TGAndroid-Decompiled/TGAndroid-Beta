package ab;

import a8.r7;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
public final class r implements u9.d {
    public final int f992a;
    public final u9.r f993b;

    public r(u9.r rVar, int i7) {
        this.f992a = i7;
        this.f993b = rVar;
    }

    @Override
    public final Object e(r7 r7Var) {
        switch (this.f992a) {
            case 0:
                return FirebaseMessagingRegistrar.a(this.f993b, r7Var);
            default:
                return new sa.c((Context) r7Var.a(Context.class), ((o9.g) r7Var.a(o9.g.class)).d(), r7Var.H(sa.d.class), r7Var.c(cb.b.class), (Executor) r7Var.e(this.f993b));
        }
    }
}
