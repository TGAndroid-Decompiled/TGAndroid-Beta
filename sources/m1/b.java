package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final Context f14379b;
    public final c f14380c;

    public b(Context context, c cVar) {
        super(0);
        this.f14379b = context;
        this.f14380c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f14379b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f14380c.f14381a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
