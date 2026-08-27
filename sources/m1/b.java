package m1;

import android.content.Context;
import java.io.File;

public final class b extends kotlin.jvm.internal.k implements ad.a {

    public final Context f17536b;

    public final c f17537c;

    public b(Context context, c cVar) {
        super(0);
        this.f17536b = context;
        this.f17537c = cVar;
    }

    @Override
    public final Object invoke() {
        Context applicationContext = this.f17536b;
        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
        String name = this.f17537c.f17538a;
        kotlin.jvm.internal.j.e(name, "name");
        String fileName = kotlin.jvm.internal.j.g(".preferences_pb", name);
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.j.g(fileName, "datastore/"));
    }
}
