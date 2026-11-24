package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
public final class mi8 extends vy5 implements pr4 {
    public final byte b;
    public final Context c;
    public final Object d;

    public mi8(byte b, Context context, Object obj) {
        super(0);
        this.b = b;
        this.c = context;
        this.d = obj;
    }

    @Override
    public final Object invoke() {
        byte b = this.b;
        Object obj = this.d;
        Context context = this.c;
        switch (b) {
            case 0:
                return xde.a(context, ((String) ((f26) obj).a).concat(".preferences_pb"));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
