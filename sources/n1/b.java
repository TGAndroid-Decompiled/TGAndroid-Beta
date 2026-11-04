package n1;

import android.content.Context;
import kotlin.jvm.internal.j;
public abstract class b {
    public static final boolean a(Context context, String name) {
        j.e(context, "context");
        j.e(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
