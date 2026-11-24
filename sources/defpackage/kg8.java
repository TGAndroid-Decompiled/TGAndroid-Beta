package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
public final class kg8 extends vw5 implements op4 {
    public final byte b;
    public final Context c;
    public final Object d;

    public kg8(byte b, Context context, Object obj) {
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
                return wbe.a(context, ((String) ((f06) obj).a).concat(".preferences_pb"));
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
