package defpackage;

import android.content.Context;
public final class b23 implements uw8 {
    public final byte a;
    public final pq5 b;

    public b23(pq5 pq5Var, byte b) {
        this.a = b;
        this.b = pq5Var;
    }

    @Override
    public final Object mo21get() {
        byte b = this.a;
        pq5 pq5Var = this.b;
        switch (b) {
            case 0:
                return new rx6((Context) pq5Var.a, new Object(), new z6f((byte) 28), false, (byte) 26);
            default:
                String packageName = ((Context) pq5Var.a).getPackageName();
                if (packageName == null) {
                    p3d.h("Cannot return null from a non-@Nullable @Provides method");
                    return null;
                }
                return packageName;
        }
    }
}
