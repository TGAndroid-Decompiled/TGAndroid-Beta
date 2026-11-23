package o1;

import android.content.Context;
import android.content.SharedPreferences;
import c8.j1;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements rd.a {
    public final int f21575b;
    public final Context f21576c;
    public final Object d;

    public a(int i7, Context context, Object obj) {
        super(0);
        this.f21575b = i7;
        this.f21576c = context;
        this.d = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f21575b) {
            case 0:
                SharedPreferences sharedPreferences = this.f21576c.getSharedPreferences((String) this.d, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = this.f21576c;
                j.d(applicationContext, "applicationContext");
                String name = (String) ((s0) this.d).f7118a;
                j.e(name, "name");
                return j1.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
