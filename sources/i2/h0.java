package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f12375a;
    public final f0 f12376b;
    public final i0 f12377c;

    public h0(i0 i0Var, Context context) {
        this.f12377c = i0Var;
        this.f12375a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                i0 i0Var2 = h0.this.f12377c;
                if (i0Var2.f12397i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f12376b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f12417t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f12375a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f12376b);
    }
}
