package defpackage;

import android.content.Context;
public final class lg4 extends tk4 {
    public final byte V;
    public final Object W;

    public lg4(byte b, Context context, Object obj) {
        super(context, null);
        this.V = b;
        this.W = obj;
    }

    @Override
    public final int getColumnsCount() {
        byte b = this.V;
        Object obj = this.W;
        switch (b) {
            case 0:
                return ((yg4) obj).s;
            default:
                return ((wg4) obj).d.s;
        }
    }
}
