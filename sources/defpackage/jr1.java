package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class jr1 extends hv1 {
    public final byte f;
    public boolean h;

    public jr1(Context context, wk5 wk5Var, Bundle bundle, byte b) {
        super(context, wk5Var, bundle);
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
