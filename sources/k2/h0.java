package k2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f16528a;
    public final f0 f16529b;
    public final i0 f16530c;

    public h0(i0 i0Var, Context context) {
        this.f16530c = i0Var;
        this.f16528a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i3) {
                i0 i0Var2 = h0.this.f16530c;
                if (i0Var2.f16554i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i3));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f16529b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f16574t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f16528a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f16529b);
    }
}
