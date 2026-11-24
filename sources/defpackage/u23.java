package defpackage;

import android.content.Context;
public final class u23 implements mv8 {
    public final byte a;
    public final mq5 b;

    public u23(mq5 mq5Var, byte b) {
        this.a = b;
        this.b = mq5Var;
    }

    @Override
    public final Object mo8get() {
        byte b = this.a;
        mq5 mq5Var = this.b;
        switch (b) {
            case 0:
                return new mx6((Context) mq5Var.a, new kg7((byte) 29), new k4f((byte) 28), false, (byte) 26);
            default:
                String packageName = ((Context) mq5Var.a).getPackageName();
                if (packageName == null) {
                    gxc.d("Cannot return null from a non-@Nullable @Provides method");
                    return null;
                }
                return packageName;
        }
    }
}
