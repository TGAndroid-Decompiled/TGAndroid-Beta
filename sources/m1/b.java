package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.k implements dd.a {
    public final Context f13410b;
    public final c f13411c;

    public b(Context context, c cVar) {
        super(0);
        this.f13410b = context;
        this.f13411c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f13410b;
        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
        String name = this.f13411c.f13412a;
        kotlin.jvm.internal.j.e(name, "name");
        String fileName = kotlin.jvm.internal.j.g(".preferences_pb", name);
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.j.g(fileName, "datastore/"));
    }
}
