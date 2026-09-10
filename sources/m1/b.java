package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final Context f13217b;
    public final c f13218c;

    public b(Context context, c cVar) {
        super(0);
        this.f13217b = context;
        this.f13218c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f13217b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f13218c.f13219a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
