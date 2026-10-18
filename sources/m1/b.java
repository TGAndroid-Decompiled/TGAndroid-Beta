package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements td.a {
    public final Context f16400b;
    public final c f16401c;

    public b(Context context, c cVar) {
        super(0);
        this.f16400b = context;
        this.f16401c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f16400b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f16401c.f16402a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
