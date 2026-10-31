package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f7885a;
    public final f0 f7886b;
    public final i0 f7887c;

    public h0(i0 i0Var, Context context) {
        this.f7887c = i0Var;
        this.f7885a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                i0 i0Var2 = h0.this.f7887c;
                if (i0Var2.f7909i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f7886b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f7929t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f7885a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f7886b);
    }
}
