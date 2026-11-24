package defpackage;

import android.content.Context;
public final class i13 implements lt8 {
    public final byte a;
    public final pj4 b;

    public i13(pj4 pj4Var, byte b) {
        this.a = b;
        this.b = pj4Var;
    }

    @Override
    public final Object mo9get() {
        byte b = this.a;
        pj4 pj4Var = this.b;
        switch (b) {
            case 0:
                return new mv6((Context) pj4Var.b, new ie7((byte) 29), new i2f((byte) 28), false, (byte) 26);
            default:
                String packageName = ((Context) pj4Var.b).getPackageName();
                if (packageName == null) {
                    fvc.f("Cannot return null from a non-@Nullable @Provides method");
                    return null;
                }
                return packageName;
        }
    }
}
