package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements sd.a {
    public final Context f15920b;
    public final c f15921c;

    public b(Context context, c cVar) {
        super(0);
        this.f15920b = context;
        this.f15921c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f15920b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f15921c.f15922a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
