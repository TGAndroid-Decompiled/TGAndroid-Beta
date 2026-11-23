package l2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class e0 {
    public final WeakReference f19324a;
    public final c0 f19325b;
    public final f0 f19326c;

    public e0(f0 f0Var, Context context) {
        this.f19326c = f0Var;
        this.f19324a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i7) {
                f0 f0Var2 = e0.this.f19326c;
                if (f0Var2.f19357i0) {
                    return;
                }
                f0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f19325b = r02;
        context.registerDeviceIdChangeListener(new d0(f0Var.v.a(f0Var.f19377t, null), 0), r02);
    }

    public static void a(e0 e0Var) {
        Context context = (Context) e0Var.f19324a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(e0Var.f19325b);
    }
}
