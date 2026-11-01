package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements ld.a {
    public final Context f12617b;
    public final c f12618c;

    public b(Context context, c cVar) {
        super(0);
        this.f12617b = context;
        this.f12618c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f12617b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f12618c.f12619a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
