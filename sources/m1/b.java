package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements ud.a {
    public final Context f17921b;
    public final c f17922c;

    public b(Context context, c cVar) {
        super(0);
        this.f17921b = context;
        this.f17922c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f17921b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f17922c.f17923a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
