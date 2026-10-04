package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final Context f15955b;
    public final c f15956c;

    public b(Context context, c cVar) {
        super(0);
        this.f15955b = context;
        this.f15956c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f15955b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f15956c.f15957a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
