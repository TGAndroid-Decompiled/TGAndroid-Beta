package i2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class i0 {
    public final WeakReference f13573a;
    public final g0 f13574b;
    public final j0 f13575c;

    public i0(j0 j0Var, Context context) {
        this.f13575c = j0Var;
        this.f13573a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                j0 j0Var2 = i0.this.f13575c;
                if (j0Var2.f13596i0) {
                    return;
                }
                j0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f13574b = r02;
        context.registerDeviceIdChangeListener(new h0(j0Var.v.a(j0Var.f13616t, null), 0), r02);
    }

    public static void a(i0 i0Var) {
        Context context = (Context) i0Var.f13573a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(i0Var.f13574b);
    }
}
