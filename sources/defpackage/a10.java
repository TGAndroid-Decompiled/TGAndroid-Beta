package defpackage;

import android.content.Context;
public final class a10 implements sdb {
    public final byte a;
    public final Context b;

    public a10(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return i10.e(context);
            case 1:
                return new cd3(context, new wb3());
            case 2:
                return new hd3(context);
            case 3:
                return new cd3(context, new wb3());
            case 4:
                return new fe3(context, new q7f((byte) 13));
            default:
                return eb3.d(context);
        }
    }
}
