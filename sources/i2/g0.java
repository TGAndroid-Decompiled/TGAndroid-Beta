package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class g0 {
    public final WeakReference f12372a;
    public final e0 f12373b;
    public final h0 f12374c;

    public g0(h0 h0Var, Context context) {
        this.f12374c = h0Var;
        this.f12372a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                h0 h0Var2 = g0.this.f12374c;
                if (h0Var2.f12394i0) {
                    return;
                }
                h0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f12373b = r02;
        context.registerDeviceIdChangeListener(new f0(h0Var.v.a(h0Var.f12414t, null), 0), r02);
    }

    public static void a(g0 g0Var) {
        Context context = (Context) g0Var.f12372a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(g0Var.f12373b);
    }
}
