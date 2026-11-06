package o1;

import android.content.Context;
import android.content.SharedPreferences;
import c8.c1;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements rd.a {
    public final int f20693b;
    public final Context f20694c;
    public final Object d;

    public a(int i7, Context context, Object obj) {
        super(0);
        this.f20693b = i7;
        this.f20694c = context;
        this.d = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f20693b) {
            case 0:
                SharedPreferences sharedPreferences = this.f20694c.getSharedPreferences((String) this.d, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = this.f20694c;
                j.d(applicationContext, "applicationContext");
                String name = (String) ((s0) this.d).f7453a;
                j.e(name, "name");
                return c1.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
