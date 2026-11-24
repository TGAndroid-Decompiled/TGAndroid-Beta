package defpackage;

import android.content.Context;
public final class fi7 extends e1a {
    public final byte n;

    public fi7(Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.n = b;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.n) {
            case 0:
                if (getResources().getConfiguration().orientation == 2) {
                    return gm.L(48.0f);
                }
                return gm.L(54.0f);
            default:
                if (getResources().getConfiguration().orientation == 2) {
                    return gm.L(48.0f);
                }
                return gm.L(54.0f);
        }
    }
}
