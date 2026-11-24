package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class is1 extends gw1 {
    public final byte f;
    public boolean h;

    public is1(Context context, tk5 tk5Var, Bundle bundle, byte b) {
        super(context, tk5Var, bundle);
        this.f = b;
    }

    @Override
    public final void a() {
        switch (this.f) {
            case 0:
                if (!this.h) {
                    this.h = true;
                    super.a();
                    return;
                }
                return;
            default:
                if (!this.h) {
                    this.h = true;
                    super.a();
                    return;
                }
                return;
        }
    }
}
