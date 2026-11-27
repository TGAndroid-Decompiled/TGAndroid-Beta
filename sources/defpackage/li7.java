package defpackage;

import android.content.Context;
public final class li7 extends w2a {
    public final byte n;

    public li7(Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.n = b;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.n) {
            case 0:
                if (getResources().getConfiguration().orientation == 2) {
                    return hl.L(48.0f);
                }
                return hl.L(54.0f);
            default:
                if (getResources().getConfiguration().orientation == 2) {
                    return hl.L(48.0f);
                }
                return hl.L(54.0f);
        }
    }
}
