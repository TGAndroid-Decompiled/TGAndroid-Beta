package l2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class e0 {
    public final WeakReference f19290a;
    public final c0 f19291b;
    public final f0 f19292c;

    public e0(f0 f0Var, Context context) {
        this.f19292c = f0Var;
        this.f19290a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i7) {
                f0 f0Var2 = e0.this.f19292c;
                if (f0Var2.f19323i0) {
                    return;
                }
                f0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f19291b = r02;
        context.registerDeviceIdChangeListener(new d0(f0Var.v.a(f0Var.f19343t, null), 0), r02);
    }

    public static void a(e0 e0Var) {
        Context context = (Context) e0Var.f19290a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(e0Var.f19291b);
    }
}
