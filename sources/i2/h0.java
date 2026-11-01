package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f7886a;
    public final f0 f7887b;
    public final i0 f7888c;

    public h0(i0 i0Var, Context context) {
        this.f7888c = i0Var;
        this.f7886a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                i0 i0Var2 = h0.this.f7888c;
                if (i0Var2.f7910i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f7887b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f7930t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f7886a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f7887b);
    }
}
