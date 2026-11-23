package l2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class f0 {
    public final WeakReference f19394a;
    public final d0 f19395b;
    public final g0 f19396c;

    public f0(g0 g0Var, Context context) {
        this.f19396c = g0Var;
        this.f19394a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i7) {
                g0 g0Var2 = f0.this.f19396c;
                if (g0Var2.f19427i0) {
                    return;
                }
                g0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f19395b = r02;
        context.registerDeviceIdChangeListener(new e0(g0Var.v.a(g0Var.f19447t, null), 0), r02);
    }

    public static void a(f0 f0Var) {
        Context context = (Context) f0Var.f19394a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(f0Var.f19395b);
    }
}
