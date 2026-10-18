package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements td.a {
    public final Context f16402b;
    public final c f16403c;

    public b(Context context, c cVar) {
        super(0);
        this.f16402b = context;
        this.f16403c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f16402b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f16403c.f16404a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
