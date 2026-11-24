package defpackage;

import android.content.Context;
public final class cg7 extends cz9 {
    public final byte n;

    public cg7(Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.n = b;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.n) {
            case 0:
                if (getResources().getConfiguration().orientation == 2) {
                    return gl.L(48.0f);
                }
                return gl.L(54.0f);
            default:
                if (getResources().getConfiguration().orientation == 2) {
                    return gl.L(48.0f);
                }
                return gl.L(54.0f);
        }
    }
}
