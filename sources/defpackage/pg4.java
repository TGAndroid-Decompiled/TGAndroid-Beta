package defpackage;

import android.content.Context;
public final class pg4 extends tk4 {
    public final byte V;
    public final Object W;

    public pg4(byte b, Context context, Object obj) {
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
                return ((ch4) obj).s;
            default:
                return ((ah4) obj).d.s;
        }
    }
}
