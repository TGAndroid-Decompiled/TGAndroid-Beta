package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.k implements dd.a {
    public final Context f13688b;
    public final c f13689c;

    public b(Context context, c cVar) {
        super(0);
        this.f13688b = context;
        this.f13689c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f13688b;
        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
        String name = this.f13689c.f13690a;
        kotlin.jvm.internal.j.e(name, "name");
        String fileName = kotlin.jvm.internal.j.g(".preferences_pb", name);
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.j.g(fileName, "datastore/"));
    }
}
