package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final Context f14600b;
    public final c f14601c;

    public b(Context context, c cVar) {
        super(0);
        this.f14600b = context;
        this.f14601c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f14600b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f14601c.f14602a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
