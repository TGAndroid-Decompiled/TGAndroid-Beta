package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class f0 {
    public final WeakReference f12368a;
    public final d0 f12369b;
    public final g0 f12370c;

    public f0(g0 g0Var, Context context) {
        this.f12370c = g0Var;
        this.f12368a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                g0 g0Var2 = f0.this.f12370c;
                if (g0Var2.f12390i0) {
                    return;
                }
                g0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f12369b = r02;
        context.registerDeviceIdChangeListener(new e0(g0Var.v.a(g0Var.f12410t, null), 0), r02);
    }

    public static void a(f0 f0Var) {
        Context context = (Context) f0Var.f12368a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(f0Var.f12369b);
    }
}
