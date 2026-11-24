package defpackage;

import android.content.Context;
public final class ne4 extends pi4 {
    public final byte V;
    public final Object W;

    public ne4(byte b, Context context, Object obj) {
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
                return ((af4) obj).s;
            default:
                return ((ye4) obj).d.s;
        }
    }
}
