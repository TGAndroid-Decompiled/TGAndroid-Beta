package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements td.a {
    public final Context f16395b;
    public final c f16396c;

    public b(Context context, c cVar) {
        super(0);
        this.f16395b = context;
        this.f16396c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f16395b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f16396c.f16397a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
