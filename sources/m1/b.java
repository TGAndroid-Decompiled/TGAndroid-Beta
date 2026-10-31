package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements ld.a {
    public final Context f12616b;
    public final c f12617c;

    public b(Context context, c cVar) {
        super(0);
        this.f12616b = context;
        this.f12617c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f12616b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f12617c.f12618a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
