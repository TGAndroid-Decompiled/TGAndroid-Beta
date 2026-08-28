package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements zc.a {
    public final Context f17160b;
    public final c f17161c;

    public b(Context context, c cVar) {
        super(0);
        this.f17160b = context;
        this.f17161c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f17160b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f17161c.f17162a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
