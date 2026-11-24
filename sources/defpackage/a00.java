package defpackage;

import android.content.Context;
public final class a00 implements qbb {
    public final byte a;
    public final Context b;

    public a00(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return i00.e(context);
            case 1:
                return new qb3(context, new ka3());
            case 2:
                return new vb3(context);
            case 3:
                return new qb3(context, new ka3());
            case 4:
                return new sc3(context, new o5f((byte) 13));
            default:
                return s93.d(context);
        }
    }
}
