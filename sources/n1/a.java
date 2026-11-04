package n1;

import android.content.Context;
import android.content.SharedPreferences;
import b8.md;
import com.google.android.gms.internal.play_billing.s0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements od.a {
    public final int f20115b;
    public final Context f20116c;
    public final Object d;

    public a(int i3, Context context, Object obj) {
        super(0);
        this.f20115b = i3;
        this.f20116c = context;
        this.d = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f20115b) {
            case 0:
                SharedPreferences sharedPreferences = this.f20116c.getSharedPreferences((String) this.d, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = this.f20116c;
                j.d(applicationContext, "applicationContext");
                String name = (String) ((s0) this.d).f7508a;
                j.e(name, "name");
                return md.a(applicationContext, name.concat(".preferences_pb"));
        }
    }
}
