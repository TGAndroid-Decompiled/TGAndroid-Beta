package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f12373a;
    public final f0 f12374b;
    public final i0 f12375c;

    public h0(i0 i0Var, Context context) {
        this.f12375c = i0Var;
        this.f12373a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                i0 i0Var2 = h0.this.f12375c;
                if (i0Var2.f12395i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f12374b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f12415t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f12373a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f12374b);
    }
}
