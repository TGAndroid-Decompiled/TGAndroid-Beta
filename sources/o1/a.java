package o1;

import android.content.Context;
import android.content.SharedPreferences;
import c8.g1;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements rd.a {
    public final int f21581b;
    public final Context f21582c;
    public final Object d;

    public a(int i7, Context context, Object obj) {
        super(0);
        this.f21581b = i7;
        this.f21582c = context;
        this.d = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f21581b) {
            case 0:
                SharedPreferences sharedPreferences = this.f21582c.getSharedPreferences((String) this.d, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = this.f21582c;
                j.d(applicationContext, "applicationContext");
                String name = (String) ((s0) this.d).f7123a;
                j.e(name, "name");
                return g1.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
