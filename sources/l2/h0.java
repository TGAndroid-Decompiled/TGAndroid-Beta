package l2;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class h0 {
    public final WeakReference f17839a;
    public final f0 f17840b;
    public final i0 f17841c;

    public h0(i0 i0Var, Context context) {
        this.f17841c = i0Var;
        this.f17839a = new WeakReference(context);
        ?? r02 = new IntConsumer() {
            @Override
            public final void accept(int i7) {
                i0 i0Var2 = h0.this.f17841c;
                if (i0Var2.f17864i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f17840b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.f17884t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.f17839a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.f17840b);
    }
}
