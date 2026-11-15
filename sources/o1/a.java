package o1;

import android.content.Context;
import android.content.SharedPreferences;
import c8.e1;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements rd.a {
    public final int f21217b;
    public final Context f21218c;
    public final Object d;

    public a(int i7, Context context, Object obj) {
        super(0);
        this.f21217b = i7;
        this.f21218c = context;
        this.d = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f21217b) {
            case 0:
                SharedPreferences sharedPreferences = this.f21218c.getSharedPreferences((String) this.d, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = this.f21218c;
                j.d(applicationContext, "applicationContext");
                String name = (String) ((s0) this.d).f6843a;
                j.e(name, "name");
                return e1.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
