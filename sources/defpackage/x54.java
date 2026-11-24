package defpackage;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class x54 {
    public final WeakReference a;
    public final w54 b;
    public final y54 c;

    public x54(y54 y54Var, Context context) {
        this.c = y54Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() {
            @Override
            public final void accept(int i) {
                y54 y54Var2 = x54.this.c;
                if (y54Var2.i0) {
                    return;
                }
                y54Var2.m1(1, 19, Integer.valueOf(i));
            }

            public final IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new ge2(y54Var.v.a(y54Var.t, null), (byte) 1), r0);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
