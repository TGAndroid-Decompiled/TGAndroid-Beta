package l2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f17838a;
    public final f0 f17839b;
    public final i0 f17840c;

    public h0(i0 i0Var, Context context) {
        this.f17840c = i0Var;
        this.f17838a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i7) {
                i0 i0Var2 = h0.this.f17840c;
                if (i0Var2.f17863i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f17839b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f17883t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f17838a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f17839b);
    }
}
