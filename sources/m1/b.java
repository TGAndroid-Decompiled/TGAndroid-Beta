package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements td.a {
    public final Context f15307b;
    public final c f15308c;

    public b(Context context, c cVar) {
        super(0);
        this.f15307b = context;
        this.f15308c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f15307b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f15308c.f15309a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
