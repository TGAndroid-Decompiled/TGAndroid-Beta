package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements td.a {
    public final Context f16401b;
    public final c f16402c;

    public b(Context context, c cVar) {
        super(0);
        this.f16401b = context;
        this.f16402c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f16401b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f16402c.f16403a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
