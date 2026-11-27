package defpackage;

import android.content.Context;
public final class b00 implements mfb {
    public final byte a;
    public final Context b;

    public b00(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return j00.e(context);
            case 1:
                return new jc3(context, new db3());
            case 2:
                return new oc3(context);
            case 3:
                return new jc3(context, new db3());
            case 4:
                return new ld3(context, new faf((byte) 13));
            default:
                return la3.d(context);
        }
    }
}
