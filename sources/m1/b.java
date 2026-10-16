package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements td.a {
    public final Context f15042b;
    public final c f15043c;

    public b(Context context, c cVar) {
        super(0);
        this.f15042b = context;
        this.f15043c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f15042b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f15043c.f15044a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
