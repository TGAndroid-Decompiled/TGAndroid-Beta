package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.k implements bd.a {
    public final Context f16758b;
    public final c f16759c;

    public b(Context context, c cVar) {
        super(0);
        this.f16758b = context;
        this.f16759c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f16758b;
        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
        String name = this.f16759c.f16760a;
        kotlin.jvm.internal.j.e(name, "name");
        String fileName = kotlin.jvm.internal.j.g(".preferences_pb", name);
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.j.g(fileName, "datastore/"));
    }
}
