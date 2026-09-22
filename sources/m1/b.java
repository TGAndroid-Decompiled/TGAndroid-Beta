package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final Context f14377b;
    public final c f14378c;

    public b(Context context, c cVar) {
        super(0);
        this.f14377b = context;
        this.f14378c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f14377b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f14378c.f14379a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
