package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final Context f15740b;
    public final c f15741c;

    public b(Context context, c cVar) {
        super(0);
        this.f15740b = context;
        this.f15741c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f15740b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f15741c.f15742a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
