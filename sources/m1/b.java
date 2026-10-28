package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements ud.a {
    public final Context f17920b;
    public final c f17921c;

    public b(Context context, c cVar) {
        super(0);
        this.f17920b = context;
        this.f17921c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f17920b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f17921c.f17922a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
