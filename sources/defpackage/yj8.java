package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
public final class yj8 extends az5 implements sr4 {
    public final byte b;
    public final Context c;
    public final Object d;

    public yj8(byte b, Context context, Object obj) {
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
                return mge.a(context, ((String) ((j26) obj).a).concat(".preferences_pb"));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
