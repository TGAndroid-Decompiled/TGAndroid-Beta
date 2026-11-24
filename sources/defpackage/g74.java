package defpackage;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;
public final class g74 {
    public final WeakReference a;
    public final f74 b;
    public final h74 c;

    public g74(h74 h74Var, Context context) {
        this.c = h74Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() {
            @Override
            public final void accept(int i) {
                h74 h74Var2 = g74.this.c;
                if (h74Var2.i0) {
                    return;
                }
                h74Var2.m1(1, 19, Integer.valueOf(i));
            }

            public final IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new rf2(h74Var.v.a(h74Var.t, null), (byte) 1), r0);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
