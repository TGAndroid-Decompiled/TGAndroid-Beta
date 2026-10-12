package m1;

import android.content.Context;
import java.io.File;
public final class b extends kotlin.jvm.internal.j implements sd.a {
    public final Context f15645b;
    public final c f15646c;

    public b(Context context, c cVar) {
        super(0);
        this.f15645b = context;
        this.f15646c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f15645b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.f15646c.f15647a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
